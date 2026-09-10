package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.l5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1893l5 implements C5M {
    public static byte[] A01;
    public final /* synthetic */ MG A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 107);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-10, 0, -9};
    }

    public C1893l5(MG mg) {
        this.A00 = mg;
    }

    private final void A02(C5N c5n) {
        throw new NullPointerException(A00(0, 3, 40));
    }

    @Override // com.facebook.ads.redexgen.core.C5M
    public final void ACv(C5N c5n) {
        A02(c5n);
        throw null;
    }
}
