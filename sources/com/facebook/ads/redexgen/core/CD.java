package com.facebook.ads.redexgen.core;

import com.umeng.analytics.pro.cw;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public enum CD {
    A04,
    A03,
    A02;

    public static byte[] A00;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 44);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{99, 100, 99, 126, 99, 107, 102, 99, 112, 111, 110, 18, 21, 18, cw.m, 18, 26, 23, 18, 1, 18, 21, 28, 24, 25, 2, 9, 31, 24, 31, 2, 31, 23, 26, 31, 12, 19, 18};
    }

    static {
        A01();
    }
}
