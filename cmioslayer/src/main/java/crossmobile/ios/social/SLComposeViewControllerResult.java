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
package crossmobile.ios.social;

import org.crossmobile.bridge.ann.CMEnum;

/**
 * SLComposeViewControllerResult class defines different values for the result
 * of the SLComposeViewControllerCompletionHandler.
 */
@CMEnum
public final class SLComposeViewControllerResult {

    /**
     * The process was canceled, the user canceled composing the post or the
     * service was not available.
     */
    public static final int Cancelled = 0;

    /**
     * The process was completed,the user finished composing the post and
     * selected done.
     */
    public static final int Done = 1;

    private SLComposeViewControllerResult() {
    }
}
