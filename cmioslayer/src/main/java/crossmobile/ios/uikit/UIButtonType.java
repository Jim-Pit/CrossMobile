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
 * UIButtonType class defines the style of a button.
 */
@CMEnum
public final class UIButtonType {

    /**
     * A button with no style.
     */
    public static final int Custom = 0;
    /**
     * A button with default system style.
     */
    public static final int System = 1;

    /**
     * A button used for revealing details.
     */
    public static final int DetailDisclosure = 2;

    /**
     * A button with light background used to display information.
     */
    public static final int InfoLight = 3;

    /**
     * A button with dark background used to display information.
     */
    public static final int InfoDark = 4;

    /**
     * A button for adding contacts.
     */
    public static final int ContactAdd = 5;

    private UIButtonType() {
    }
}
