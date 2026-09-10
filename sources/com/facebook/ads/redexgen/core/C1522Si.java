package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Si, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1522Si {
    public static InterfaceC1523Sj A00;
    public static boolean A01;
    public static byte[] A02;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 18);
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
        synchronized (C1522Si.class) {
            if (A00 == null) {
                return;
            }
            C1544Te c1544Te = new C1544Te(A00.AIb());
            c1544Te.A05(1);
            C2127ge c2127geA00 = T7.A00();
            if (c2127geA00 != null) {
                c2127geA00.A08().ABC(A00(0, 9, 49), 3401, c1544Te);
            }
            A00.reset();
        }
    }

    public static void A03(long j) {
        if (j > 0) {
            A00 = new C2140gr();
            new C1524Sk(j);
        }
    }
}
