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
package org.crossmobile.backend.desktop;

import org.crossmobile.bind.io.AbstractNetworkBridge;
import org.crossmobile.bind.io.NativeCookieManager;
import org.crossmobile.bridge.Native;

import java.awt.Desktop;
import java.io.File;
import java.net.URI;

public class DesktopNetworkBridge extends AbstractNetworkBridge {

    public DesktopNetworkBridge() {
    }

    @Override
    @SuppressWarnings({"UseSpecificCatch"})
    public boolean openURL(String url) {
        Desktop desktop = Desktop.getDesktop();
        try {
            URI uri = URI.create(url);
            if (url.startsWith("mailto:"))
                desktop.mail(uri);
            else
                desktop.browse(uri);
        } catch (Exception ex) {
            try {
                desktop.open(new File(url));
            } catch (Exception ex1) {
                Native.system().error("Unable to open URL " + url, ex);
                return false;
            }
        }
        return true;
    }

    @Override
    public NativeCookieManager initNativeManager() {
        // Use platform's default cookie manager
        return null;
    }

}
