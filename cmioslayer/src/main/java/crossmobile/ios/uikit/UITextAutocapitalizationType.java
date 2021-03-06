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
 * UITextAutocapitalizationType class defines different types of
 * auto-capitalization for text objects.
 */
@CMEnum
public final class UITextAutocapitalizationType {

    /**
     * Do not capitalize automatically.
     */
    public static final int None = 0;

    /**
     * Automatically capitalize only the first letter of each word.
     */
    public static final int Words = 1;

    /**
     * Automatically capitalize the first letter of the first word of the
     * sentence.
     */
    public static final int Sentences = 2;

    /**
     * Automatically capitalize all the letters.
     */
    public static final int AllCharacters = 3;

    private UITextAutocapitalizationType() {
    }
}
