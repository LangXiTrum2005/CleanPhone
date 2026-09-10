package com.facebook.ads.redexgen.core;

import com.google.common.primitives.ElementTypesAreNonnullByDefault;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.oq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@ElementTypesAreNonnullByDefault
public abstract class AbstractC2098oq {
    public static int A00(long value) {
        return (int) ((value >>> 32) ^ value);
    }

    public static int A01(long a2, long b) {
        if (a2 < b) {
            return -1;
        }
        return a2 > b ? 1 : 0;
    }
}
