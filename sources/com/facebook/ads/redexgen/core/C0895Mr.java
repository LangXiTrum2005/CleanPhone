package com.facebook.ads.redexgen.core;

import com.facebook.ads.CacheFlag;
import java.util.EnumSet;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0895Mr extends AbstractC1964mI {
    public C0895Mr(C1828k1 c1828k1, AnonymousClass37 anonymousClass37) {
        super(c1828k1, anonymousClass37);
    }

    private C1961mF A00(Runnable runnable) {
        return new C1961mF(this, runnable);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1964mI
    public final C2S A0I() {
        C2010n3 successfullyLoadedAdapter = (C2010n3) this.A01;
        if (successfullyLoadedAdapter != null) {
            return successfullyLoadedAdapter.A09();
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1964mI
    public final void A0P() {
        C2010n3 interstitialAdapter = (C2010n3) this.A01;
        interstitialAdapter.A0B();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1964mI
    public final void A0R(AnonymousClass23 anonymousClass23, C05608t c05608t, C05588r c05588r, AnonymousClass38 anonymousClass38) {
        C2010n3 c2010n3 = (C2010n3) anonymousClass23;
        C1962mG c1962mG = new C1962mG(this, anonymousClass38, c2010n3);
        A0H().postDelayed(c1962mG, c05608t.A05().A05());
        EnumSet<CacheFlag> enumSet = this.A08.A0B;
        if (enumSet == null) {
            enumSet = CacheFlag.ALL;
        }
        c2010n3.A0A(this.A0B, A00(c1962mG), anonymousClass38, enumSet, this.A08.A04, this.A08.A05, this.A08.A02);
    }
}
