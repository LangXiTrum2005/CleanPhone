package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.oU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2749oU {
    public static byte[] A03;
    public final Object A00;
    public final Object A01;
    public final Object A02;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 78);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{25, 88, 87, 93, 25, 85, 73, 113, 104, 112, 109, 116, 104, 97, 36, 97, 106, 112, 118, 109, 97, 119, 36, 115, 109, 112, 108, 36, 119, 101, 105, 97, 36, 111, 97, 125, 62, 36};
    }

    public C2749oU(Object key, Object value1, Object value2) {
        this.A00 = key;
        this.A01 = value1;
        this.A02 = value2;
    }

    public final IllegalArgumentException A02() {
        StringBuilder sbAppend = new StringBuilder().append(A00(6, 32, 74)).append(this.A00);
        String strA00 = A00(5, 1, 38);
        return new IllegalArgumentException(sbAppend.append(strA00).append(this.A01).append(A00(0, 5, 119)).append(this.A00).append(strA00).append(this.A02).toString());
    }
}
