package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1870kh extends BL {
    public final /* synthetic */ C1867ke A00;

    public C1870kh(C1867ke c1867ke) {
        this.A00 = c1867ke;
    }

    @Override // com.facebook.ads.redexgen.core.BL
    public final void A01() {
        if (this.A00.A01.A06() != null) {
            this.A00.A01.A06().onAdLoaded(this.A00.A01.A07());
        }
    }
}
