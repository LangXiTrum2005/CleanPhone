package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class U5 {
    public static byte[] A00;

    static {
        A04();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 105);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{6, 6, 19, -9, 3, 2, -6, -3, -5, 19, 8, 7, 19, 1, 7, -5, -5, 8, -4, -18, -5, -1, -14, -20, -18, 8, -18, 1, -3, -5, -22, -4, -16, -16, -3, -15, -29, -16, -12, -25, -31, -29, -3, -15, -30, -23, -3, -12, -29, -16, -15, -25, -19, -20};
    }

    public static String A01(C2296ge c2296ge) {
        return WN.A00(c2296ge).getString(A00(0, 15, 75), null);
    }

    public static String A02(C2296ge c2296ge) {
        return WN.A00(c2296ge).getString(A00(15, 17, 64), null);
    }

    public static String A03(C2296ge c2296ge) {
        return WN.A00(c2296ge).getString(A00(32, 22, 53), null);
    }

    public static void A05(C2296ge c2296ge) {
        WN.A00(c2296ge).edit().remove(A00(32, 22, 53)).apply();
    }

    public static void A06(C2296ge c2296ge, String str, String str2) {
        WN.A00(c2296ge).edit().putString(A00(32, 22, 53), str).putString(A00(15, 17, 64), str2).putString(A00(0, 15, 75), Y1.A07(Y1.A00())).apply();
    }
}
