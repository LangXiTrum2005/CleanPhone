package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public enum NE {
    A03(A00(13, 3, 104)),
    A05(A00(22, 4, 126)),
    A04(A00(16, 6, 26));

    public static byte[] A01;
    public final String A00;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 113);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-52, -41, -41, -56, -68, -55, -48, -68, -57, 61, 62, 61, 52, 58, 69, 69, -8, -20, -7, 0, -20, -9, 93, 94, 93, 84};
    }

    static {
        A01();
    }

    NE(String str) {
        this.A00 = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }
}
