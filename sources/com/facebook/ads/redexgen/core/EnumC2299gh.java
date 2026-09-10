package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.gh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public enum EnumC2299gh {
    A03(A01(35, 4, 16)),
    A04(A01(39, 4, 41));

    public static byte[] A01;
    public String A00;

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 24);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{125, 110, 119, 119, 99, 68, 92, 75, 70, 67, 78, 10, 89, 79, 88, 92, 79, 88, 10, 88, 79, 89, 90, 69, 68, 89, 79, 16, 10, 15, 89, 40, 38, 38, 51, 110, 125, 100, 100, 90, 84, 84, 65};
    }

    static {
        A02();
    }

    EnumC2299gh(String str) {
        this.A00 = str;
    }

    public static EnumC2299gh A00(String str) {
        for (EnumC2299gh enumC2299gh : values()) {
            if (enumC2299gh.A00.equals(str)) {
                return enumC2299gh;
            }
        }
        throw new IllegalArgumentException(String.format(Locale.US, A01(4, 27, 50), str));
    }
}
