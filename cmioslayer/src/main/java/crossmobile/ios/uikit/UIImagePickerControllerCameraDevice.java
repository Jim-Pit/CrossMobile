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
 * UIImagePickerControllerCameraDevice class defines which camera of the device
 * should be used.
 */
@CMEnum
@CMLib(name = "cmimage")
public final class UIImagePickerControllerCameraDevice {

    /**
     * The rear camera is used.
     */
    public static final int Rear = 0;

    /**
     * The front camera is used.
     */
    public static final int Front = 1;

    private UIImagePickerControllerCameraDevice() {
    }
}
