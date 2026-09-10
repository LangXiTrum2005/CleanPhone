package com.google.common.primitives;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class UnsignedInteger extends Number implements Comparable<UnsignedInteger> {
    public final int X;

    static {
        new UnsignedInteger(0);
        new UnsignedInteger(1);
        new UnsignedInteger(-1);
    }

    public UnsignedInteger(int i2) {
        this.X = i2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(UnsignedInteger unsignedInteger) {
        UnsignedInteger unsignedInteger2 = unsignedInteger;
        unsignedInteger2.getClass();
        int i2 = this.X ^ Integer.MIN_VALUE;
        int i3 = unsignedInteger2.X ^ Integer.MIN_VALUE;
        if (i2 < i3) {
            return -1;
        }
        return i2 > i3 ? 1 : 0;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return longValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof UnsignedInteger) && this.X == ((UnsignedInteger) obj).X;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return longValue();
    }

    public final int hashCode() {
        return this.X;
    }

    @Override // java.lang.Number
    public final int intValue() {
        return this.X;
    }

    @Override // java.lang.Number
    public final long longValue() {
        return ((long) this.X) & 4294967295L;
    }

    public final String toString() {
        return Long.toString(((long) this.X) & 4294967295L, 10);
    }
}
