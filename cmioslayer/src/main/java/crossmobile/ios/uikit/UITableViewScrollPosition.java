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
package crossmobile.ios.uikit;

import org.crossmobile.bridge.ann.CMEnum;

/**
 * UITableViewScrollPosition class defines different types of row scrolling for
 * table views.
 */
@CMEnum
public final class UITableViewScrollPosition {

    /**
     * The default scrolling view. The preferred row is fully visible.
     */
    public static final int None = 0;

    /**
     * The preferred row is scrolled to the top.
     */
    public static final int Top = 1;

    /**
     * The preferred row is scrolled in the middle.
     */
    public static final int Middle = 2;

    /**
     * The preferred row is scrolled to the bottom.
     */
    public static final int Bottom = 3;

    private UITableViewScrollPosition() {
    }
}
