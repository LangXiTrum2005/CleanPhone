package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ms, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1999ms implements C7I {
    public final /* synthetic */ N0 A00;
    public final /* synthetic */ boolean A01;

    public C1999ms(N0 n0, boolean z) {
        this.A00 = n0;
        this.A01 = z;
    }

    @Override // com.facebook.ads.redexgen.core.C7I
    public final void ACF() {
        if (!C05789m.A1m(this.A00.A04) || !this.A01) {
            this.A00.A0C.set(true);
            this.A00.A01.AEw(this.A00);
        } else {
            this.A00.A06 = AbstractC0748Gs.A01(this.A00.A04, (C0898Mu) this.A00.A03, 0, new C2000mt(this));
        }
    }

    @Override // com.facebook.ads.redexgen.core.C7I
    public final void ACG() {
        this.A00.A01.AEz(this.A00, AdError.CACHE_ERROR);
    }
}
