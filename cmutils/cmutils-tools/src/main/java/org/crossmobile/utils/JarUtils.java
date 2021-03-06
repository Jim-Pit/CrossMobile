/*
 * (c) 2019 by Panayotis Katsaloulis
 *
 * CrossMobile is free software; you can redistribute it and/or modify
 * it under the terms of the CrossMobile Community License as published
 * by the CrossMobile team.
 *
 * CrossMobile is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * CrossMobile Community License for more details.
 *
 * You should have received a copy of the CrossMobile Community
 * License along with CrossMobile; if not, please contact the
 * CrossMobile team at https://crossmobile.tech/contact/
 */
package org.crossmobile.utils;

import org.crossmobile.bridge.system.BaseUtils;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.*;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.jar.*;
import java.util.zip.Deflater;
import java.util.zip.ZipEntry;

public class JarUtils {

    public static List<JarPathEntry> getListOfEntries(JarFile jarpath, String dirpath) {
        String dirpathslashed = dirpath.endsWith("/") ? dirpath : (dirpath.length() == 0 ? "" : dirpath + "/");

        int dirpathsize = dirpathslashed.length();

        ArrayList<JarPathEntry> res = new ArrayList<>();
        Enumeration<JarEntry> entries = jarpath.entries();
        JarEntry entry;
        String path;
        String name;
        while (entries.hasMoreElements()) {
            entry = entries.nextElement();
            name = entry.getName();
            if (!name.endsWith("/") && name.startsWith(dirpathslashed)) {
                int lastslash = name.lastIndexOf("/");
                path = lastslash > dirpathsize ? name.substring(dirpathsize, lastslash) : "";
                res.add(new JarPathEntry(dirpath, path, name.substring(lastslash + 1)));
            }
        }
        return res;
    }

    public static int copyJarResources(JarFile jarfile, String prefix, File resdir) {
        return copyJarResources(jarfile, prefix, resdir, null);
    }

    public static int copyJarResources(JarFile jarfile, String prefix, File resdir, Predicate<JarPathEntry> predicate) {
        if (jarfile == null)
            throw new RuntimeException("Unable to find jar file.");
        List<JarPathEntry> entries = JarUtils.getListOfEntries(jarfile, prefix);
        if (entries == null || entries.isEmpty())
            throw new RuntimeException("Unable to find '" + prefix + "' directory inside " + (new File(jarfile.getName()).getName()));

        int countResources = 0;
        try {
            for (JarPathEntry entry : entries)
                if (predicate == null || predicate.test(entry)) {
                    InputStream in = jarfile.getInputStream(entry.getEntry());
                    countResources++;
                    File parent = entry.path.length() == 0 ? resdir : new File(resdir, entry.path);
                    parent.mkdirs();
                    FileOutputStream out = new FileOutputStream(new File(parent, entry.name));
                    FileUtils.copyStream(in, out);
                }
            return countResources;
        } catch (IOException ex) {
            throw new FileUtilsException(ex);
        }
    }

    public static List<File> getFilteredJarList(Collection<File> allFiles, List<String> blacklist) {
        List<File> filteredList = new ArrayList<>();
        for (File in : allFiles) {
            String signature = in.getName().toLowerCase();
            if (!blacklist.contains(signature) && signature.endsWith(".jar"))
                filteredList.add(in);
        }
        return filteredList;
    }

    /**
     * Execute a JAR application
     *
     * @param jar           the JAR to execute
     * @param mainClassName the entry Class
     * @param argumens      possible arguments
     * @return In case of an exception, the thrown exception
     */
    public static Throwable execJar(File jar, String mainClassName, String... argumens) {
        try {
            URLClassLoader cl = new URLClassLoader(new URL[]{jar.toURI().toURL()}, JarUtils.class.getClassLoader());
            Class mainClass = Class.forName(mainClassName, false, cl);
            Method method = mainClass.getMethod("main", new Class[]{String[].class});
            method.invoke(null, new Object[]{argumens == null ? new String[]{} : argumens});
        } catch (MalformedURLException | ClassNotFoundException | NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
            return ex;
        }
        return null;
    }

    public static void unzipJar(File injar, File outdir) {
        unzipJar(injar, outdir, null);
    }

    public static void unzipJar(File injar, File outdir, BiPredicate<JarEntry, File> predicate) {
        if (injar == null || !injar.isFile())
            throw new RuntimeException("Input JAR file " + injar + " does not exist");
        outdir.mkdirs();
        if (!outdir.isDirectory())
            throw new RuntimeException("Output file " + outdir + " is not a directory");
        try (JarFile jarfile = new JarFile(injar)) {
            Enumeration<JarEntry> entries = jarfile.entries();
            while (entries.hasMoreElements()) {
                JarEntry entry = entries.nextElement();
                File outfile = new File(outdir, entry.getName());
                if (!entry.isDirectory() && (predicate == null || predicate.test(entry, outfile))) {
                    outfile.getParentFile().mkdirs();
                    FileUtils.copyStream(jarfile.getInputStream(entry), new FileOutputStream(outfile));
                    outfile.setLastModified(entry.getTime());
                }
            }
        } catch (IOException ex) {
            Log.error("Unable to extract JAR file " + injar + " into " + outdir);
            BaseUtils.throwException(ex);
        }
    }

    public static File createJar(Writer report, File outjar, File... inclasspath) {
        outjar.getParentFile().mkdirs();
        JarOutputStream out = null;
        Collection<String> entries = report == null ? null : new TreeSet<>();
        try {
            Manifest manifest = new Manifest();
            manifest.getMainAttributes().put(Attributes.Name.MANIFEST_VERSION, "1.0");
            out = new JarOutputStream(new FileOutputStream(outjar), manifest);
            out.setLevel(Deflater.BEST_COMPRESSION);
            for (File in : inclasspath) {
                if (in.isFile() && in.getName().toLowerCase().endsWith(".jar")) {
                    File extract = File.createTempFile("jarextract", ".jar");
                    extract.delete();
                    unzipJar(in, extract);
                    extract.deleteOnExit();
                    in = extract;
                }
                appendInJar(entries, in, out, "", true);
            }
            if (report != null) {
                report.append("Creating file ").append(outjar.getName()).append('\n');
                report.append(TextUtils.iterableToString(entries, "\n")).append('\n');
            }
            if (report != null)
                report.append('\n');
            return outjar;
        } catch (IOException ex) {
            Log.error(ex);
            outjar.delete();
            return null;
        } finally {
            if (out != null)
                try {
                    out.close();
                } catch (IOException ex) {
                }
        }
    }

    @SuppressWarnings("UseSpecificCatch")
    private static void appendInJar(Collection<String> entries, File in, JarOutputStream out, String depth, boolean rootFile) throws IOException {
        if (in.isDirectory()) {
            if (!rootFile) {
                depth += in.getName() + "/";
                JarEntry entry = new JarEntry(depth);
                entry.setTime(in.lastModified());
                try {
                    out.putNextEntry(entry);
                    out.closeEntry();
                } catch (Exception ex) {
                }
            }
            File[] children = in.listFiles();
            if (children != null && children.length > 0)
                for (File child : children)
                    appendInJar(entries, child, out, depth, false);
        } else if (in.isFile()) {
            BufferedInputStream bin = null;
            try {
                String name = depth + in.getName();
                JarEntry entry = new JarEntry(name);
                entry.setTime(in.lastModified());
                boolean ok = false;
                try {
                    out.putNextEntry(entry);
                    ok = true;
                } catch (Exception ex) {
                }
                if (ok) {
                    bin = new BufferedInputStream(new FileInputStream(in));
                    byte[] buffer = new byte[0x4000];
                    int length = 0;
                    while ((length = bin.read(buffer)) >= 0)
                        if (length > 0)
                            out.write(buffer, 0, length);
                    out.closeEntry();
                    if (entries != null)
                        entries.add(name + (in.getName().toLowerCase().endsWith(".class") ? " v" + FileUtils.getClassVersion(in) : ""));
                }
            } finally {
                if (bin != null)
                    bin.close();
            }
        } else if (!in.exists())
            throw new FileUtilsException("Input file does not exist: " + in.getAbsolutePath());
        else
            throw new FileUtilsException("Unrecognizable file: " + in.getAbsolutePath());
    }

    public static class JarPathEntry {

        public final String path;
        public final String name;
        private final String home;
        private final String toString;

        private JarPathEntry(String home, String path, String name) {
            this.home = home;
            this.path = path;
            this.name = name;
            toString = (home.length() == 0 ? "" : home + (home.endsWith("/") ? "" : "/")) + (path.length() == 0 ? "" : path + "/") + name;
        }

        @Override
        public String toString() {
            return toString;
        }

        public ZipEntry getEntry() {
            return new ZipEntry(toString());
        }
    }
}
