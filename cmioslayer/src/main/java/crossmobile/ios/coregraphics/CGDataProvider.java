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
package crossmobile.ios.coregraphics;

import crossmobile.ios.foundation.CFType;
import org.crossmobile.bridge.Native;
import org.crossmobile.bridge.ann.CMFunction;
import org.crossmobile.bridge.ann.CMReference;

import java.io.IOException;
import java.io.InputStream;

/**
 * CGDataProvider class defines an object that is responsible for providing
 * graphics data to Quartz functions.
 */
@CMReference
public class CGDataProvider extends CFType {

    private final InputStream in;

    private CGDataProvider(InputStream in) {
        this.in = in;
    }

    /**
     * Returns the CGDataProvider for the specified path.
     *
     * @param path The path of the requested CGDataProvider.
     * @return The CGDataProvider of the specified path.
     */
    @CMFunction(" CGDataProviderRef CGDataProviderCreateWithFilename ( const char *filename ); ")
    public static CGDataProvider createWithFilename(String path) {
        CGDataProvider dp;
        try {
            return new CGDataProvider(Native.file().getFileStream(path));
        } catch (IOException ex) {
            Native.system().error("Unable to retrieve data provider " + path, ex);
        }
        return null;
    }
}
