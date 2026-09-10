package com.google.common.primitives;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class UnsignedLong extends Number implements Comparable<UnsignedLong>, Serializable {
    public final long X;

    static {
        new UnsignedLong(0L);
        new UnsignedLong(1L);
        new UnsignedLong(-1L);
    }

    public UnsignedLong(long j) {
        this.X = j;
    }

    @Override // java.lang.Comparable
    public final int compareTo(UnsignedLong unsignedLong) {
        UnsignedLong unsignedLong2 = unsignedLong;
        unsignedLong2.getClass();
        return UnsignedLongs.a(this.X, unsignedLong2.X);
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        long j = this.X;
        return j >= 0 ? j : ((j >>> 1) | (j & 1)) * 2.0d;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof UnsignedLong) && this.X == ((UnsignedLong) obj).X;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        long j = this.X;
        return j >= 0 ? j : ((j >>> 1) | (j & 1)) * 2.0f;
    }

    public final int hashCode() {
        return Longs.a(this.X);
    }

    @Override // java.lang.Number
    public final int intValue() {
        return (int) this.X;
    }

    @Override // java.lang.Number
    public final long longValue() {
        return this.X;
    }

    public final String toString() {
        long j = this.X;
        if (j == 0) {
            return "0";
        }
        if (j > 0) {
            return Long.toString(j, 10);
        }
        char[] cArr = new char[64];
        long j2 = (j >>> 1) / ((long) 5);
        long j3 = 10;
        int i2 = 63;
        cArr[63] = Character.forDigit((int) (j - (j2 * j3)), 10);
        while (j2 > 0) {
            i2--;
            cArr[i2] = Character.forDigit((int) (j2 % j3), 10);
            j2 /= j3;
        }
        return new String(cArr, i2, 64 - i2);
    }
}
