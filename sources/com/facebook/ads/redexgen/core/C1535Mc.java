package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C1535Mc implements XN {
    public static byte[] A01;
    public final /* synthetic */ MW A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 62);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{36, 48, 49, 42, 38, 41, 44, 38, 46};
    }

    public C1535Mc(MW mw) {
        this.A00 = mw;
    }

    @Override // com.facebook.ads.redexgen.core.XN
    public final void ADS() {
        if (!this.A00.A0C && !this.A00.A0B) {
            this.A00.A0V(false, A00(0, 9, 123));
        }
    }

    @Override // com.facebook.ads.redexgen.core.XN
    public final void AFV(float f) {
    }
}
