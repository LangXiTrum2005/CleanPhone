package com.facebook.ads.redexgen.core;

import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.mx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2004mx implements InterfaceC05277l {
    public static byte[] A04;
    public final /* synthetic */ C2B A00;
    public final /* synthetic */ N4 A01;
    public final /* synthetic */ M5 A02;
    public final /* synthetic */ C0665Dn A03;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 8);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-109, -82, -74, -71, -78, -79, 109, -63, -68, 109, -79, -68, -60, -69, -71, -68, -82, -79, 109, -82, 109, -70, -78, -79, -74, -82, 123};
    }

    public C2004mx(N4 n4, C0665Dn c0665Dn, C2B c2b, M5 m5) {
        this.A01 = n4;
        this.A03 = c0665Dn;
        this.A00 = c2b;
        this.A02 = m5;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05277l
    public final void ACa() {
        AdErrorType adErrorType = AdErrorType.CACHE_FAILURE_ERROR;
        String strA00 = A00(0, 27, 69);
        this.A02.A0F().A3D(C0646Cu.A01(this.A01.A00), adErrorType.getErrorCode(), strA00);
        this.A00.ADc(this.A01, C0597Ag.A01(adErrorType, strA00));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05277l
    public final void ACj() {
        this.A03.A0J();
        this.A00.ACV(this.A01, this.A03);
        this.A02.A0F().A4E(this.A01.A01 != null);
    }
}
