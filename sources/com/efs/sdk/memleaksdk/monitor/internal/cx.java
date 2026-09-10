package com.efs.sdk.memleaksdk.monitor.internal;

import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class cx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final cx f670a = new cx();

    private cx() {
    }

    public final int a(long j) {
        long j2 = j * (-7046029254386353131L);
        return (int) (j2 ^ (j2 >>> 32));
    }

    public final long b(long j) {
        long j2 = j - 1;
        long j3 = j2 | (j2 >> 1);
        long j4 = j3 | (j3 >> 2);
        long j5 = j4 | (j4 >> 4);
        long j6 = j5 | (j5 >> 8);
        long j7 = j6 | (j6 >> 16);
        return (j7 | (j7 >> 32)) + 1;
    }

    public final int a(int i, double d) {
        long jCeil = (long) Math.ceil(((double) i) / d);
        if (jCeil == i) {
            jCeil++;
        }
        long jMax = Math.max(4, b(jCeil));
        if (jMax <= 1073741824) {
            return (int) jMax;
        }
        throw new RuntimeException(String.format(Locale.ROOT, "Maximum array size exceeded for this load factor (elements: %d, load factor: %f)", Arrays.copyOf(new Object[]{Integer.valueOf(i), Double.valueOf(d)}, 2)));
    }

    public final int b(int i, double d) {
        return Math.min(i - 1, (int) Math.ceil(((double) i) * d));
    }

    public final int a(int i, int i2, double d) {
        if (i != 1073741824) {
            return i << 1;
        }
        throw new RuntimeException(String.format(Locale.ROOT, "Maximum array size exceeded for this load factor (elements: %d, load factor: %f)", Arrays.copyOf(new Object[]{Integer.valueOf(i2), Double.valueOf(d)}, 2)));
    }
}
