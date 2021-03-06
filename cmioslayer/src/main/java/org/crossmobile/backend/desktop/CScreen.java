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

public class CScreen extends CArea implements CClickable {

    private final boolean stretched;
    private final boolean withStatusBar;

    public CScreen(CPoint loc, int width, int height, boolean stretched, boolean withStatusBar) {
        super(loc, width, height);
        this.stretched = stretched;
        this.withStatusBar = withStatusBar;
    }

    boolean isStretched() {
        return stretched;
    }

    public boolean isWithStatusBar() {
        return withStatusBar;
    }

    @Override
    public void updateWidth(int frameWidth, int frameHeight, int hardwareWidth, int hardwareHeight) {
        this.width = hardwareWidth;
        this.height = hardwareHeight;
        super.updateWidth(frameWidth, frameHeight, hardwareWidth, hardwareHeight);
    }

    @Override
    public CEvent getEvent() {
        return CEvent.screen();
    }

}
