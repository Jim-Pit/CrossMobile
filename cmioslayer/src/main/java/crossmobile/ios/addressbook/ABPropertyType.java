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
package crossmobile.ios.addressbook;

import org.crossmobile.bridge.ann.CMEnum;

/**
 * ABPropertyType defines different types of record properties.
 */
@CMEnum
public final class ABPropertyType {

    /**
     * Multi-value property.
     */
    public static final int MultiValueMask = 1 << 8;

    /**
     * Invalid property.
     */
    public static final int Invalid = 0;

    /**
     * String property.
     */
    public static final int String = 1;

    /**
     * Integer property.
     */
    public static final int Integer = 2;

    /**
     * Real property.
     */
    public static final int Real = 3;

    /**
     * Date-time property.
     */
    public static final int DateTime = 4;

    /**
     * Dictionary property.
     */
    public static final int Dictionary = 5;

    /**
     * Multi-string property.
     */
    public static final int MultiString = MultiValueMask | String;

    /**
     * Multi-integer property.
     */
    public static final int MultiInteger = MultiValueMask | Integer;

    /**
     * Multi-real property.
     */
    public static final int MultiReal = MultiValueMask | Real;

    /**
     * Multi–date-time property.
     */
    public static final int MultiDateTime = MultiValueMask | DateTime;

    /**
     * Multi-dictionary property.
     */
    public static final int MultiDictionary = MultiValueMask | Dictionary;

    /**
     * Invalid property.
     */
    public static final int InvalidID = -1;

    private ABPropertyType() {
    }

}
