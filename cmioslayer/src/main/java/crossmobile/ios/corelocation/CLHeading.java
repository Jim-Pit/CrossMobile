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
package crossmobile.ios.corelocation;

import crossmobile.ios.foundation.NSDate;
import crossmobile.ios.foundation.NSObject;
import crossmobile.ios.foundation.NSSecureCoding;
import org.crossmobile.bridge.ann.CMClass;
import org.crossmobile.bridge.ann.CMGetter;

/**
 * CLHeading class represents the data concerning the direction to which the
 * device is heading.
 */
@CMClass
public class CLHeading extends NSObject implements NSSecureCoding {

    private double magneticHeading;
    private double trueHeading;
    private double headingAccuracy;
    private NSDate timestamp;
    private double x;
    private double y;
    private double z;

    private CLHeading() {
    }

    /**
     * Returns the difference between the calculated heading of the device and
     * the actual recorded geomagnetic heading.
     *
     * @return The difference between the calculated heading of the device and
     * the actual recorded geomagnetic heading.
     */
    @CMGetter("@property(readonly, nonatomic) CLLocationDirection headingAccuracy;")
    public double headingAccuracy() {
        return headingAccuracy;
    }

    /**
     * Returns the recorded heading relative to magnetic North in degrees.
     *
     * @return The recorded heading relative to magnetic North in degrees.
     */
    @CMGetter("@property(readonly, nonatomic) CLLocationDirection magneticHeading;")
    public double magneticHeading() {
        return magneticHeading;
    }

    /**
     * Returns the timestamp of the heading record.
     *
     * @return The timestamp of the heading record.
     */
    @CMGetter("@property(readonly, nonatomic, copy) NSDate *timestamp;")
    public NSDate timestamp() {
        return timestamp;
    }

    /**
     * Returns the recorded heading relative to true North in degrees.
     *
     * @return The recorded heading relative to true North in degrees.
     */
    @CMGetter("@property(readonly, nonatomic) CLLocationDirection trueHeading;")
    public double trueHeading() {
        return trueHeading;
    }

    /**
     * Returns X-axis's geomagnetic data.
     *
     * @return X-axis's geomagnetic data.
     */
    @CMGetter("@property(readonly, nonatomic) CLHeadingComponentValue x;\n" +
            "")
    public double x() {
        return x;
    }

    /**
     * Returns Y-axis's geomagnetic data.
     *
     * @return Y-axis's geomagnetic data.
     */
    @CMGetter("@property(readonly, nonatomic) CLHeadingComponentValue y;")
    public double y() {
        return y;
    }

    /**
     * Returns Z-axis's geomagnetic data.
     *
     * @return Z-axis's geomagnetic data.
     */
    @CMGetter("@property(readonly, nonatomic) CLHeadingComponentValue z;")
    public double z() {
        return z;
    }

    /**
     * Returns the heading of the device as a formatted text string.
     *
     * @return The heading of the device as a formatted text string.
     */
    @CMGetter("@property(nonatomic, readonly, copy) NSString *description;")
    public String description() {
        return toString();
    }

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder();
        out.append("CLHeading magneticHeading=").append(magneticHeading);
        out.append(" trueHeading=").append(trueHeading);
        out.append(" accuracy=").append(headingAccuracy);
        out.append(" x=").append(x);
        out.append(" y=").append(y);
        out.append(" z=").append(z);
        out.append(" timestamp=").append(timestamp.toString());
        return out.toString();
    }
}
