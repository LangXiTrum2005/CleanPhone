package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.view.Surface;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.fX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2227fX {
    public static byte[] A02;
    public final AA A00;
    public final C2668nA A01 = new C2668nA();

    static {
        A02();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 50);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-64, -54, -66, -64, 1, -1, 19, 17, 3, -64, -66, -40, -66, -64, -74, -64, -76, -74, 6, -7, 2, -8, -7, 6, -7, 6, -35, 2, -8, -7, 12, -74, -76, -50, -76, -74, -54, 37, -9, -6, 9, 16, -73, 2, -6, 8, 8, -10, -4, -6, -73, -75, -49, -75, -73, -75, 92, -82, -77, -86, -97, 92, 90, 116, 90, 92};
    }

    public C2227fX(C2300gi c2300gi) {
        InterfaceC1339Em trackSelectionFactory = new C2685nR(this.A01);
        C12179h c12179h = new C12179h(trackSelectionFactory);
        AnonymousClass74 loadControl = new C2778ox();
        this.A00 = AbstractC11396b.A00(new C2775ou(c2300gi), c12179h, loadControl, this.A01);
    }

    public static String A01(C2841pz c2841pz) {
        boolean z2 = c2841pz instanceof AD;
        String strA00 = A00(36, 2, 118);
        String strA01 = A00(0, 14, 108);
        if (z2) {
            AD ad = (AD) c2841pz;
            return A00(55, 11, 8) + ad.A03 + A00(14, 22, 98) + ad.A02 + strA01 + ad.getCause() + strA00;
        }
        return A00(41, 14, 99) + c2841pz.getMessage() + strA01 + c2841pz.getCause() + strA00;
    }

    public static boolean A03() {
        return true;
    }

    public final int A04() {
        return this.A00.A0I();
    }

    public final int A05() {
        return this.A00.A00();
    }

    public final long A06() {
        return this.A00.A7e();
    }

    public final long A07() {
        return this.A00.A7s();
    }

    public final C2225fV A08() {
        C2860qI vf = this.A00.A0K();
        if (vf == null) {
            return null;
        }
        return new C2225fV(vf.A0L, vf.A0A);
    }

    public final void A09() {
        this.A00.A0L();
    }

    public final void A0A() {
        this.A00.A02();
    }

    public final void A0B() {
        this.A00.A01();
    }

    public final void A0C(float f) {
        this.A00.A0M(f);
    }

    public final void A0D(long j) {
        this.A00.A04(j);
    }

    public final void A0E(Surface surface) {
        this.A00.A0N(surface);
    }

    public final void A0F(C2296ge c2296ge, Uri uri) {
        if (C1750Up.A2z(c2296ge, A03())) {
            C2231fb cacheManager = C2231fb.A06(c2296ge);
            C5Y cachedDataSourceFactory = cacheManager.A0H(c2296ge);
            this.A00.A0Q(new C12229o(cachedDataSourceFactory).A04(uri));
            return;
        }
        InterfaceC1298Cx mediaSource = new C12229o(new C2795pE(c2296ge, C5C.A0j(c2296ge, A00(38, 3, 100)), this.A01)).A04(uri);
        this.A00.A0Q(mediaSource);
    }

    public final void A0G(InterfaceC2224fU interfaceC2224fU) {
        this.A00.A0O(new D6(this, interfaceC2224fU));
    }

    public final void A0H(final InterfaceC2226fW interfaceC2226fW) {
        this.A00.A0P(new InterfaceC2766ol() { // from class: com.facebook.ads.redexgen.X.2s
            @Override // com.facebook.ads.redexgen.core.C5L
            public final void AGa(int i2, int i3, int i4, float f) {
                interfaceC2226fW.AGa(i2, i3, i4, f);
            }
        });
    }

    public final void A0I(boolean z2) {
        this.A00.A0S(z2);
    }

    public final boolean A0J() {
        return this.A00.A0T();
    }

    public final boolean A0K() {
        return this.A00.A0J() != null;
    }
}
