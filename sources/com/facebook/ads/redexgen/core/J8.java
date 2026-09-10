package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class J8 extends AbstractRunnableC1787Wc {
    public static byte[] A01;
    public final /* synthetic */ C2076d4 A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 114);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{87, 104, 101, 100, 110, 33, 118, 96, 114, 33, 111, 100, 119, 100, 115, 33, 113, 115, 100, 113, 96, 115, 100, 101};
    }

    public J8(C2076d4 c2076d4) {
        this.A00 = c2076d4;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1787Wc
    public final void A07() {
        if (this.A00.A03) {
            return;
        }
        this.A00.A0I(A00(0, 24, 115));
    }
}
