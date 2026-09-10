package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2474jm extends AbstractRunnableC1787Wc {
    public static byte[] A01;
    public final /* synthetic */ C2473jl A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 14);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-107, -116, -95, -116, -98, -114, -99, -108, -101, -97, 101};
    }

    public C2474jm(C2473jl c2473jl) {
        this.A00 = c2473jl;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1787Wc
    public final void A07() {
        this.A00.A03.A0F().AKw();
        this.A00.A05.loadUrl(A00(0, 11, 29) + this.A00.A00.A03());
    }
}
