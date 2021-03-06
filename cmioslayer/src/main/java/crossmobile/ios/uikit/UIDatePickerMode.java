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
 * The UIDatePickerMode class defines the mode of a UIDatePicker object. The
 * arrangement of the options varies depends on the local format.
 */
@CMEnum
public final class UIDatePickerMode {

    /**
     * Selection of hours, minutes, and (optional) AM/PM, for example 2:40:AM.
     */
    public static final int Time = 0;

    /**
     * Selection of months, days and years, for example April/10/1994.
     */
    public static final int Date = 1;

    /**
     * Selection of days of the week, month, hours, minutes, and (optional)
     * AM/PM, for example Fri/Apr/16/33/AM.
     */
    public static final int DateAndTime = 2;

    /**
     * Selection of hours and minutes, for example 3:33.
     */
    public static final int CountDownTimer = 3;

    private UIDatePickerMode() {
    }
}
