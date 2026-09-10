package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Hv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C1425Hv extends AbstractRunnableC1787Wc {
    public static byte[] A01;
    public final /* synthetic */ C5F A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 118);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{118, 73, 68, 69, 79, 0, 87, 65, 83, 0, 78, 69, 86, 69, 82, 0, 80, 82, 69, 80, 65, 82, 69, 68};
    }

    public C1425Hv(C5F c5f) {
        this.A00 = c5f;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1787Wc
    public final void A07() {
        if (!this.A00.A0T) {
            this.A00.A0Z.AGQ(A00(0, 24, 86));
        }
    }
}
