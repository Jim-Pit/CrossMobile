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
 * UIActivityIndicatorViewStyle class defines different options for activity
 * indicator's style.
 */
@CMEnum
public final class UIActivityIndicatorViewStyle {

    /**
     * The activity indicator is depicted as a large-sized white gear.
     */
    public static final int WhiteLarge = 0;

    /**
     * The activity indicator's style is the default, a normal white gear.
     */
    public static final int White = 1;

    /**
     * The activity indicator is depicted as a normal sized grey gear.
     */
    public static final int Gray = 2;

    private UIActivityIndicatorViewStyle() {
    }
}
