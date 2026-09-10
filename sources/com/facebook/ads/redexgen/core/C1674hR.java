package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1674hR implements CG {
    public static byte[] A01;
    public final /* synthetic */ C1669hM A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 116);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{69, 81, 80, 75, 71, 72, 77, 71, 79};
    }

    public C1674hR(C1669hM c1669hM) {
        this.A00 = c1669hM;
    }

    @Override // com.facebook.ads.redexgen.core.CG
    public final void ACi() {
        if (!this.A00.A0C && !this.A00.A0B) {
            this.A00.A0U(false, A00(0, 9, 80));
        }
    }

    @Override // com.facebook.ads.redexgen.core.CG
    public final void AEg(float f) {
    }
}
