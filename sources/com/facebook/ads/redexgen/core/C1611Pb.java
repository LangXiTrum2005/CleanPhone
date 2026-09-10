package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Pb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C1611Pb implements InterfaceC1942au {
    public static byte[] A01;
    public final /* synthetic */ PZ A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 66);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-17, -19, -33, -20, -39, -36, -17, -32, -32, -33, -20, -33, -34, -39, -35, -26, -29, -35, -27, -39, -29, -37, -36, -39, -33, -14, -18, -33, -20, -24, -37, -26, -39, -24, -37, -16, -29, -31, -37, -18, -29, -23, -24};
    }

    public C1611Pb(PZ pz) {
        this.A00 = pz;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1942au
    public final void ADO() {
        this.A00.A0H();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1942au
    public final void AF0() {
        this.A00.A0I(A00(0, 43, 56));
    }
}
