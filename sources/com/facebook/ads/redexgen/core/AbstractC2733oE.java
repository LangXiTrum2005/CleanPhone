package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.oE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2733oE implements InterfaceC11335v {
    public static byte[] A00;
    public static final boolean A01;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 32);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{32, 39, 53, 35, 35, 36, 54, 47, 58, 22, 26, 1, 20, 21};
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0038  */
    static {
        boolean z2;
        A01();
        if (A00(8, 6, 91).equals(C5C.A05)) {
            if (!A00(4, 4, 66).equals(C5C.A06)) {
                if (!A00(0, 4, 65).equals(C5C.A06)) {
                    z2 = false;
                }
            }
            z2 = true;
        } else {
            z2 = false;
        }
        A01 = z2;
    }
}
