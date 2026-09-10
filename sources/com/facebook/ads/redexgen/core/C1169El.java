package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.El, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1169El {
    public static byte[] A03;
    public final int A00;
    public final C2654pg A01;
    public final int[] A02;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 82);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-11, 4, 3, -12, 21, 22, 25, 30, 25, 36, 25, 31, 30, 3, 43, 46, 50, 55, -34, 50, 48, 31, 33, 41, 49, -34, 31, 48, 35, -34, 44, 45, 50, -34, 31, 42, 42, 45, 53, 35, 34};
    }

    public C1169El(C2654pg c2654pg, int... iArr) {
        this(c2654pg, iArr, 0);
    }

    public C1169El(C2654pg c2654pg, int[] iArr, int i) {
        if (iArr.length == 0) {
            AbstractC09234g.A08(A00(0, 13, 94), A00(13, 28, 108), new IllegalArgumentException());
        }
        this.A01 = c2654pg;
        this.A02 = iArr;
        this.A00 = i;
    }
}
