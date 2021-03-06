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
package crossmobile.ios.messageui;

import org.crossmobile.bridge.ann.CMEnum;

/**
 * MFMailComposeResult class defines different cases concerning the end of email
 * message composing, when message sending does not follow.
 */
@CMEnum
public final class MFMailComposeResult {

    /**
     * The operation of composing email message was canceled by the user.
     */
    public static final int Cancelled = 0;

    /**
     * The email message was saved after failure of sending.
     */
    public static final int Saved = 1;

    /**
     * The email message was saved for future use.
     */
    public static final int Sent = 2;

    /**
     * An error occurred and the message was not saved or queued.
     */
    public static final int Failed = 3;

    private MFMailComposeResult() {
    }
}
