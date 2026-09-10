package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.mn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1994mn extends BY {
    public static byte[] A01;
    public final /* synthetic */ C1993mm A00;

    static {
        A04();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 14);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A01 = new byte[]{-107, -116, -95, -116, -98, -114, -99, -108, -101, -97, 101};
    }

    public C1994mn(C1993mm c1993mm) {
        this.A00 = c1993mm;
    }

    @Override // com.facebook.ads.redexgen.core.BY
    public final void A05() {
        this.A00.A03.A0F().AK1();
        this.A00.A05.loadUrl(A01(0, 11, 29) + this.A00.A00.A03());
    }
}
