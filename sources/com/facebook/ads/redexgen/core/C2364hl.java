package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2364hl implements QM {
    public static byte[] A01;
    public final /* synthetic */ C7M A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 107);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-10, 0, -9};
    }

    public C2364hl(C7M c7m) {
        this.A00 = c7m;
    }

    private final void A02(QN qn) {
        throw new NullPointerException(A00(0, 3, 40));
    }

    @Override // com.facebook.ads.redexgen.core.QM
    public final void ADg(QN qn) {
        A02(qn);
        throw null;
    }
}
