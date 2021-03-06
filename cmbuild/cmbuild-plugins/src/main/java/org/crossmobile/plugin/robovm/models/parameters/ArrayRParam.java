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
package org.crossmobile.plugin.robovm.models.parameters;

import org.crossmobile.plugin.model.NParam;
import org.crossmobile.plugin.model.NType;

public class ArrayRParam extends RParam {
    public ArrayRParam(NParam nParam, Class<?> parameter, NType type) {
        super(nParam, parameter, type);
    }

    @Override
    public boolean needsConvert() {
        return true;
    }

    @Override
    public String convRef() {
        return reference() + "$conv";
    }

    @Override
    public String conversion() {
        return "         if (" + reference() + " == null) {\n" +
                "            throw new NullPointerException(\"" + reference() + "\");\n" +
                "        }\n" +
                "        " + getNative() + " " + convRef() + " = Struct.allocate(" + getNative() + ", " + reference() + ".length);\n" +
                "        " + convRef() + ".update(" + reference() + ");\n" +
                "        addRects(" + convRef() + ", " + reference() + ".length);";
    }

    @Override
    public String getNative() {
        return getJava().getComponentType().getCanonicalName();
    }
}
