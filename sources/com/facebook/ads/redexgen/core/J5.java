package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class J5 extends AbstractRunnableC1787Wc {
    public static byte[] A02;
    public final /* synthetic */ C2076d4 A00;
    public final /* synthetic */ C4A A01;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 40);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-103, -52, -67, -67, -68, -55, -64, -59, -66, 119, -64, -59, -69, -68, -67, -64, -59, -64, -53, -68, -61, -48};
    }

    public J5(C2076d4 c2076d4, C4A c4a) {
        this.A00 = c2076d4;
        this.A01 = c4a;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1787Wc
    public final void A07() {
        if (this.A00.A0D.getState() != EnumC2242fm.A02 || this.A00.A0D.getCurrentPositionInMillis() != A00()) {
            return;
        }
        this.A00.A0I(A00(0, 22, 47));
    }
}
