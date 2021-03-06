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
 * UIReturnKeyType class specifies the text that is displayed on the return key
 * of a keyboard.
 */
@CMEnum
public final class UIReturnKeyType {

    /**
     * The default text "return" for the return key.
     */
    public static final int Default = 0;

    /**
     * The text for the return key is "Go".
     */
    public static final int Go = 1;

    /**
     * The text for the return key is "Google".
     */
    public static final int Google = 2;

    /**
     * The text for the return key is "Join".
     */
    public static final int Join = 3;

    /**
     * The text for the return key is "Next".
     */
    public static final int Next = 4;

    /**
     * The text for the return key is "Route".
     */
    public static final int Route = 5;

    /**
     * The text for the return key is "Search".
     */
    public static final int Search = 6;

    /**
     * The text for the return key is "Send".
     */
    public static final int Send = 7;

    /**
     * The text for the return key is "Yahoo".
     */
    public static final int Yahoo = 8;

    /**
     * The text for the return key is "Done".
     */
    public static final int Done = 9;

    /**
     * The text for the return key is "EmergencyCall".
     */
    public static final int EmergencyCall = 10;


    /**
     * The text for the return key is "EmergencyCall".
     */
    public static final int Continue = 11;

    private UIReturnKeyType() {
    }
}
