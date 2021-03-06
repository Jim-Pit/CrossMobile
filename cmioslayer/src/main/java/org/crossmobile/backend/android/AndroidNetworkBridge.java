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
package org.crossmobile.backend.android;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import org.crossmobile.bind.io.AbstractNetworkBridge;
import org.crossmobile.bind.io.NativeCookieManager;
import org.crossmobile.bridge.Native;

public class AndroidNetworkBridge extends AbstractNetworkBridge {

    public AndroidNetworkBridge() {
    }

    @Override
    public boolean openURL(String url) {
        Intent urlIntent = new Intent("android.intent.action.VIEW", Uri.parse(url));
        try {
            MainActivity.current.startActivity(urlIntent);
            return true;
        } catch (Exception ex) {
            Native.system().error("Unable to open URL " + url, ex);
            return false;
        }
    }

    @Override
    public NativeCookieManager initNativeManager() {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP)
            CookieSyncManager.createInstance(MainActivity.current).sync();
        final CookieManager manager = CookieManager.getInstance();
        manager.setAcceptCookie(true);
        return new NativeCookieManager() {

            @Override
            public void setCookie(String url, String headerValue) {
                manager.setCookie(url, headerValue);
            }

            @Override
            public String getCookie(String url) {
                return manager.getCookie(url);
            }
        };
    }
}
