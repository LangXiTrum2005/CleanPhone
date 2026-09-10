package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.d5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1407d5 {
    public static byte[] A03;
    public final int A00;
    public final C1175Yc A01;
    public final int[] A02;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 74);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{99, 114, 117, 98, 67, 64, 79, 72, 79, 82, 79, 73, 72, 17, 57, 36, 32, 45, 116, 32, 38, 53, 55, 63, 39, 116, 53, 38, 49, 116, 58, 59, 32, 116, 53, 56, 56, 59, 35, 49, 48};
    }

    public C1407d5(C1175Yc c1175Yc, int... iArr) {
        this(c1175Yc, iArr, 0);
    }

    public C1407d5(C1175Yc c1175Yc, int[] iArr, int i) {
        if (iArr.length == 0) {
            AbstractC1561fb.A08(A00(0, 13, 108), A00(13, 28, 30), new IllegalArgumentException());
        }
        this.A01 = c1175Yc;
        this.A02 = iArr;
        this.A00 = i;
    }
}
