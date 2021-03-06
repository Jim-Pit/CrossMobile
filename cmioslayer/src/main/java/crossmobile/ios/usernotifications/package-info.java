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

@CMLib(name = "cmnotifications", libs = "UserNotifications.framework", includes = {"<UserNotifications/UserNotifications.h>", "<UIKit/UIKit.h>"},
        displayName = "Notifications Framework", description = "CrossMobile© Compatibility library for UserNotifications Framework",
        url = "https://crossmobile.tech/usernotifications/",
        androidInjections = @CMAndroidInjections(appSection = "<meta-data android:name=\"com.google.firebase.messaging.default_notification_icon\"\n"
                + "            android:resource=\"@drawable/masked_icon\"/>\n"
                + "        <service android:name=\"org.crossmobile.backend.android.notifications." + NAME + "\">\n"
                + "            <intent-filter>\n"
                + "                <action android:name=\"com.google.firebase.MESSAGING_EVENT\" />\n"
                + "            </intent-filter>\n"
                + "        </service>"
                , gradleExt = {"apply plugin: 'com.google.gms.google-services'", "com.google.gms.googleservices.GoogleServicesPlugin.config.disableVersionCheck = true"}
                , gradleBuildDep = "classpath 'com.google.gms:google-services:4.2.0'"),
        depends = @CMLibDepends(pluginName = "cmlocation"), target = API_NOUWP,
        params = @CMLibParam(property = "target", description = "Client target", context = XcodeTarget, meta = "com.apple.usernotifications.service")
)
package crossmobile.ios.usernotifications;

import org.crossmobile.bridge.ann.CMAndroidInjections;
import org.crossmobile.bridge.ann.CMLib;
import org.crossmobile.bridge.ann.CMLibDepends;
import org.crossmobile.bridge.ann.CMLibParam;

import static org.crossmobile.backend.android.notifications.CrossMobileFirebaseMessagingService.NAME;
import static org.crossmobile.bridge.ann.CMLibParam.ParamContext.XcodeTarget;
import static org.crossmobile.bridge.ann.CMLibTarget.API_NOUWP;
