package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public enum OD {
    A02,
    A06,
    A05,
    A07,
    A08,
    A03,
    A04;

    public static byte[] A00;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 98);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{5, 20, 3, 7, 18, 3, 2, 24, 25, 15, 8, 14, 19, 5, 25, 24, 10, 29, 29, 0, 29, 101, 102, 104, 109, 108, 109, 53, 54, 56, 61, 48, 55, 62, 46, 53, 50, 42, 52, 51, 58, 28, 7, 0, 24, 1};
    }

    static {
        A01();
    }
}
