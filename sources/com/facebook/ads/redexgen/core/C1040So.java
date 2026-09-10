package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.So, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1040So extends IllegalStateException {
    public static byte[] A02;
    public final int A00;
    public final int A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 4);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{69, 89, 69, 60, 6, 49, 34, 34, 33, 54, 100, 48, 43, 43, 100, 55, 41, 37, 40, 40, 100, 108};
    }

    public C1040So(int i, int i2) {
        super(A00(4, 18, 64) + i + A00(0, 3, 97) + i2 + A00(3, 1, 17));
        this.A00 = i;
        this.A01 = i2;
    }
}
