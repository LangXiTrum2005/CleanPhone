package com.facebook.ads.redexgen.core;

import com.smartdigimkt.a6.d;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public enum EnumC1830Xw {
    A02,
    A03;

    public static byte[] A00;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) + d.f33696n);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-79, -78, -77, -82, -62, -71, -63, -22, -7, -16, -16, 3, -9, -25, -10, -23, -23, -14};
    }

    static {
        A01();
    }
}
