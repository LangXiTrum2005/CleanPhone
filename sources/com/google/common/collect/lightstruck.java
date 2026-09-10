package com.google.common.collect;

import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: Hashing.java */
/* JADX INFO: loaded from: classes3.dex */
public final class lightstruck {
    public static int attabal(int i, double d) {
        int iMax = Math.max(i, 2);
        int iHighestOneBit = Integer.highestOneBit(iMax);
        if (iMax <= ((int) (d * ((double) iHighestOneBit)))) {
            return iHighestOneBit;
        }
        int i2 = iHighestOneBit << 1;
        if (i2 > 0) {
            return i2;
        }
        return 1073741824;
    }

    public static int dern(@CheckForNull Object obj) {
        return saneness(obj == null ? 0 : obj.hashCode());
    }

    public static int saneness(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * (-862048943)), 15)) * 461845907);
    }
}
