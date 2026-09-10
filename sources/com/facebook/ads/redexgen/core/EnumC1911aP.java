package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public enum EnumC1911aP {
    A03,
    A02,
    A04;

    public static byte[] A00;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 91);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{75, 78, 85, 73, 66, 69, 67, 73, 79, 49, 32, 55, 54, 59, 38, 45, 62, 59, 60, 55, 45, 36, 67, 107, 122, 109, 108, 97, 124, 119, 100, 97, 102, 109, 119, 126, 26, 119, 105, 102, 97, 101, 105, 124, 97, 103, 102};
    }

    static {
        A01();
    }
}
