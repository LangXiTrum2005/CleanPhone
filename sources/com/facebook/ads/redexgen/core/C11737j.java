package com.facebook.ads.redexgen.core;

import com.facebook.ads.CacheFlag;
import java.util.EnumSet;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C11737j extends AbstractC2435j0 {
    public C11737j(C2300gi c2300gi, O7 o7) {
        super(c2300gi, o7);
    }

    private C2433iy A00(Runnable runnable) {
        return new C2433iy(this, runnable);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2435j0
    public final NQ A0I() {
        C2487jz successfullyLoadedAdapter = (C2487jz) this.A01;
        if (successfullyLoadedAdapter != null) {
            return successfullyLoadedAdapter.A09();
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2435j0
    public final void A0P() {
        C2487jz interstitialAdapter = (C2487jz) this.A01;
        interstitialAdapter.A0B();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2435j0
    public final void A0R(N1 n1, C1731Tw c1731Tw, C1729Tu c1729Tu, O8 o8) {
        C2487jz c2487jz = (C2487jz) n1;
        C2434iz c2434iz = new C2434iz(this, o8, c2487jz);
        A0H().postDelayed(c2434iz, c1731Tw.A05().A05());
        EnumSet<CacheFlag> enumSet = this.A08.A0B;
        if (enumSet == null) {
            enumSet = CacheFlag.ALL;
        }
        c2487jz.A0A(this.A0B, A00(c2434iz), o8, enumSet, this.A08.A04, this.A08.A05, this.A08.A02);
    }
}
