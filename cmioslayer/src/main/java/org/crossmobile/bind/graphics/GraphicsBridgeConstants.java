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
package org.crossmobile.bind.graphics;

import crossmobile.ios.uikit.UIApplication;
import crossmobile.ios.uikit.UIDeviceOrientation;
import crossmobile.ios.uikit.UIInterfaceOrientationMask;
import crossmobile.ios.uikit.UIViewController;

public final class GraphicsBridgeConstants {

    public static final double DefaultAnimationDuration = 0.3;

    private static final int DefaultOrientationMask = Integer.parseInt(System.getProperty("cm.orientations.masked.supported", "-1"));
    public static final int DefaultInitialOrientation = Integer.parseInt(System.getProperty("cm.orientation.initial", "0"));

    public static boolean shouldAcceptOrientation(int deviceOrientation) {
        UIViewController root = UIApplication.sharedApplication() == null ? null
                : (UIApplication.sharedApplication().keyWindow() == null ? null
                : UIApplication.sharedApplication().keyWindow().rootViewController());
        int orientationMask = deviceOrientation == UIDeviceOrientation.LandscapeRight ? UIInterfaceOrientationMask.LandscapeRight
                : (deviceOrientation == UIDeviceOrientation.PortraitUpsideDown ? UIInterfaceOrientationMask.PortraitUpsideDown
                : (deviceOrientation == UIDeviceOrientation.LandscapeLeft ? UIInterfaceOrientationMask.LandscapeLeft
                : UIInterfaceOrientationMask.Portrait));
        return root != null && (root.supportedInterfaceOrientations() & GraphicsBridgeConstants.DefaultOrientationMask & orientationMask) != 0;
    }

    private GraphicsBridgeConstants() {
    }

}
