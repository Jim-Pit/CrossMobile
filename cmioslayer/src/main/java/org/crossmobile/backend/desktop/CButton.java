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

import org.crossmobile.bind.graphics.NativeBitmap;

public class CButton extends CDrawable implements CClickable {

    private final CEvent event;

    CButton(CPoint loc, int width, int height, int orientation, CEvent buttonType, NativeBitmap imagedown, NativeBitmap imageup, boolean autorotate) {
        super(loc, width, height, orientation, imagedown, imageup, autorotate);
        this.event = buttonType;
    }

    @Override
    public CEvent getEvent() {
        setActive(true);
        return event.getEvent(this);
    }

    void setActive(int x, int y) {
        setActive(contains(x, y));
    }

    void setActive(int x, int y, int orientation) {
        setActive(contains(x, y, orientation));
    }

}
