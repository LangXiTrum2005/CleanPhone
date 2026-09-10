package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.fJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1543fJ extends BY {
    public static byte[] A01;
    public final /* synthetic */ C0739Gj A00;

    static {
        A04();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 114);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A01 = new byte[]{87, 104, 101, 100, 110, 33, 118, 96, 114, 33, 111, 100, 119, 100, 115, 33, 113, 115, 100, 113, 96, 115, 100, 101};
    }

    public C1543fJ(C0739Gj c0739Gj) {
        this.A00 = c0739Gj;
    }

    @Override // com.facebook.ads.redexgen.core.BY
    public final void A05() {
        if (!this.A00.A03) {
            this.A00.A0I(A01(0, 24, 115));
        }
    }
}
