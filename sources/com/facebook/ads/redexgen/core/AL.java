package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class AL extends C2786p5 {
    public static byte[] A01;
    public final String A00;

    static {
        A02();
    }

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 87);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-11, 26, 34, 13, 24, 21, 16, -52, 15, 27, 26, 32, 17, 26, 32, -52, 32, 37, 28, 17, -26, -52};
    }

    public AL(String str, C11205i c11205i) {
        super(A01(0, 22, 85) + str, c11205i, 2003, 1);
        this.A00 = str;
    }
}
