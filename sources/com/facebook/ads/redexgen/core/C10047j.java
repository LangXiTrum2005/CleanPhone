package com.facebook.ads.redexgen.core;

import com.facebook.ads.CacheFlag;
import java.util.EnumSet;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C10047j extends AbstractC2266j0 {
    public C10047j(C2131gi c2131gi, O7 o7) {
        super(c2131gi, o7);
    }

    private C2264iy A00(Runnable runnable) {
        return new C2264iy(this, runnable);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2266j0
    public final NQ A0I() {
        C2318jz successfullyLoadedAdapter = (C2318jz) this.A01;
        if (successfullyLoadedAdapter != null) {
            return successfullyLoadedAdapter.A09();
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2266j0
    public final void A0P() {
        C2318jz interstitialAdapter = (C2318jz) this.A01;
        interstitialAdapter.A0B();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2266j0
    public final void A0R(N1 n1, C1562Tw c1562Tw, C1560Tu c1560Tu, O8 o8) {
        C2318jz c2318jz = (C2318jz) n1;
        C2265iz c2265iz = new C2265iz(this, o8, c2318jz);
        A0H().postDelayed(c2265iz, c1562Tw.A05().A05());
        EnumSet<CacheFlag> enumSet = this.A08.A0B;
        if (enumSet == null) {
            enumSet = CacheFlag.ALL;
        }
        c2318jz.A0A(this.A0B, A00(c2265iz), o8, enumSet, this.A08.A04, this.A08.A05, this.A08.A02);
    }
}
