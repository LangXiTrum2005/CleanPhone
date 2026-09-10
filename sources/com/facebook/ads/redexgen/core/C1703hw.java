package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1703hw implements InterfaceC0689El {
    public static byte[] A01;
    public final /* synthetic */ C1701hu A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 66);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-17, -19, -33, -20, -39, -36, -17, -32, -32, -33, -20, -33, -34, -39, -35, -26, -29, -35, -27, -39, -29, -37, -36, -39, -33, -14, -18, -33, -20, -24, -37, -26, -39, -24, -37, -16, -29, -31, -37, -18, -29, -23, -24};
    }

    public C1703hw(C1701hu c1701hu) {
        this.A00 = c1701hu;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0689El
    public final void ACe() {
        this.A00.A0G();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0689El
    public final void AEF() {
        this.A00.A0H(A00(0, 43, 56));
    }
}
