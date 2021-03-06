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
package org.crossmobile.bind.system;

import org.robovm.objc.block.Block1;
import org.robovm.objc.block.VoidBlock1;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

@SuppressWarnings("Java8MapApi")
public class Recycler<C, V> {

    private final Map<C, LinkedList<V>> storage = new HashMap<>();
    private Block1<C, V> constructor;
    private VoidBlock1<V> cleanup;
    private VoidBlock1<V> resurrect;

    public Recycler() {
        this(null, null, null);
    }

    public Recycler(Block1<C, V> constructor, VoidBlock1<V> cleanup, VoidBlock1<V> resurrect) {
        this.constructor = constructor;
        this.cleanup = cleanup;
        this.resurrect = resurrect;
    }

    public synchronized void put(V item) {
        put(null, item);
    }

    public synchronized void put(C category, V item) {
        if (item == null)
            return;
        LinkedList<V> cat = storage.get(category);
        if (cat == null)
            storage.put(category, cat = new LinkedList<>());
        if (cat.add(item) && cleanup != null)
            cleanup.invoke(item);
    }

    public synchronized V get() {
        return get(null);
    }

    public synchronized V get(C category) {
        LinkedList<V> cat = storage.get(category);
        if (cat == null || cat.isEmpty())
            return constructor == null ? null : constructor.invoke(category);
        V found = cat.removeLast();
        if (found != null)
            resurrect.invoke(found);
        return found;
    }
}
