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
package crossmobile.ios.mapkit;

import org.crossmobile.bridge.ann.CMEnum;

/**
 * MKAnnotationViewDragState class defines different current drag states for
 * annotation views on map views.
 */
@CMEnum
public final class MKAnnotationViewDragState {

    /**
     * The annotation view is not dragging. The default drag state.
     */
    public static final int None = 0;

    /**
     * The annotation view is about to start dragging due to a user action.
     */
    public static final int Starting = 1;

    /**
     * The annotation view is dragging.
     */
    public static final int Dragging = 2;

    /**
     * The annotation view is about to cancel its dragging due to an event.
     */
    public static final int Canceling = 3;

    /**
     * The annotation view's dragging was completed because the user dropped the
     * view.
     */
    public static final int Ending = 4;

    private MKAnnotationViewDragState() {
    }
}
