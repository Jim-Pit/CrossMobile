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
 * UIWebViewNavigationType class contains all the information related to the
 * current user’s action.
 */
@CMEnum
public final class UIWebViewNavigationType {

    /**
     * The user tapped a link.
     */
    public static final int LinkClicked = 0;

    /**
     * The user submitted a form.
     */
    public static final int FormSubmitted = 1;

    /**
     * User tapped the back or forward button.
     */
    public static final int BackForward = 2;

    /**
     * The user tapped the reload button.
     */
    public static final int Reload = 3;

    /**
     * The user resubmitted a form.
     */
    public static final int FormResubmitted = 4;

    /**
     * Undefined action occurred.
     */
    public static final int Other = 5;

    private UIWebViewNavigationType() {
    }
}
