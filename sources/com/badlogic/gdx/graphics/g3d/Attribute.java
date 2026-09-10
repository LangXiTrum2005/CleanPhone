package com.badlogic.gdx.graphics.g3d;

import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.GdxRuntimeException;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;

/* JADX INFO: loaded from: classes.dex */
public abstract class Attribute implements Comparable<Attribute> {
    private static final int MAX_ATTRIBUTE_COUNT = 64;
    private static final Array<String> types = new Array<>();
    public final long type;
    private final int typeBit;

    public Attribute(long j) {
        this.type = j;
        this.typeBit = Long.numberOfTrailingZeros(j);
    }

    public static final String getAttributeAlias(long j) {
        int i = -1;
        while (j != 0 && (i = i + 1) < 63 && ((j >> i) & 1) == 0) {
        }
        if (i >= 0) {
            Array<String> array = types;
            if (i < array.size) {
                return array.get(i);
            }
        }
        return null;
    }

    public static final long getAttributeType(String str) {
        int i = 0;
        while (true) {
            Array<String> array = types;
            if (i >= array.size) {
                return 0L;
            }
            if (array.get(i).compareTo(str) == 0) {
                return 1 << i;
            }
            i++;
        }
    }

    public static final long register(String str) {
        long attributeType = getAttributeType(str);
        if (attributeType > 0) {
            return attributeType;
        }
        Array<String> array = types;
        if (array.size >= 64) {
            throw new GdxRuntimeException(DM.B("Cannot register ", str, ", maximum registered attribute count reached."));
        }
        array.add(str);
        return 1 << (array.size - 1);
    }

    public abstract Attribute copy();

    public boolean equals(Attribute attribute) {
        return attribute.hashCode() == hashCode();
    }

    public int hashCode() {
        return this.typeBit * 7489;
    }

    public String toString() {
        return getAttributeAlias(this.type);
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Attribute)) {
            return false;
        }
        Attribute attribute = (Attribute) obj;
        if (this.type != attribute.type) {
            return false;
        }
        return equals(attribute);
    }
}
