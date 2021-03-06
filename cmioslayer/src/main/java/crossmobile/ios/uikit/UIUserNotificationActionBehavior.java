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
import org.crossmobile.bridge.ann.CMLib;

/**
 * UIUserNotificationActionBehavior class defines different types of additional
 * supported action behaviors.
 */
@CMEnum
@CMLib(name = "cmnotifications")
public final class UIUserNotificationActionBehavior {

    /**
     * There are no additional action behaviors. (default)
     */
    public static final int Default = 0;

    /**
     * The user can add text to be included in the notification.
     */
    public static final int TextInput = 1;

    private UIUserNotificationActionBehavior() {
    }
}
