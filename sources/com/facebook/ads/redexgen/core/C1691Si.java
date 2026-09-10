package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Si, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1691Si {
    public static InterfaceC1692Sj A00;
    public static boolean A01;
    public static byte[] A02;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 18);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-91, -88, -79, -90, -85, -80, -92, -75, -82};
    }

    static {
        A02();
        A01 = false;
        A00 = null;
    }

    public static void A01() {
        synchronized (C1691Si.class) {
            if (A00 == null) {
                return;
            }
            C1713Te c1713Te = new C1713Te(A00.AIb());
            c1713Te.A05(1);
            C2296ge c2296geA00 = T7.A00();
            if (c2296geA00 != null) {
                c2296geA00.A08().ABC(A00(0, 9, 49), 3401, c1713Te);
            }
            A00.reset();
        }
    }

    public static void A03(long j) {
        if (j > 0) {
            A00 = new C2309gr();
            new C1693Sk(j);
        }
    }
}
