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
 * UITableViewCellAccessoryType class defines different types of the accessory
 * controls that can be used by a UITableViewCell object.
 */
@CMEnum
public final class UITableViewCellAccessoryType {

    /**
     * The default value. A cell with no accessory control.
     */
    public static final int None = 0;

    /**
     * A cell has a V shape on it and after tapping it a push action takes
     * place.
     */
    public static final int DisclosureIndicator = 1;

    /**
     * A cell has a V shape on it and tapping it allows user to edit its
     * contents.
     */
    public static final int DetailDisclosureButton = 2;

    /**
     * A cell that has a tick symbol on it and does not track tapping.
     */
    public static final int Checkmark = 3;

    private UITableViewCellAccessoryType() {
    }
}
