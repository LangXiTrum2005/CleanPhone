package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.qW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2872qW {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 86);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{49, 53, 46, 54, 51, 52, 116, 48, 44, 55, 116, 60, 47, 52, 57, 46, 51, 53, 52, 41, 116};
    }

    public final String A02(AY ay) {
        String string = ay.getClass().getGenericInterfaces()[0].toString();
        String strA00 = A00(0, 21, 12);
        return string.startsWith(strA00) ? string.substring(strA00.length()) : string;
    }

    public final String A03(AbstractC10261o abstractC10261o) {
        return A02(abstractC10261o);
    }
}
