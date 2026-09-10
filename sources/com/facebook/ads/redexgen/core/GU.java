package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class GU extends AbstractRunnableC1787Wc {
    public static byte[] A01;
    public final /* synthetic */ C4V A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 30);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{102, 89, 84, 85, 95, 16, 71, 81, 67, 16, 94, 85, 70, 85, 66, 16, 64, 66, 85, 64, 81, 66, 85, 84};
    }

    public GU(C4V c4v) {
        this.A00 = c4v;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1787Wc
    public final void A07() {
        if (!this.A00.A0E) {
            this.A00.A0Q(A00(0, 24, 46));
        }
    }
}
