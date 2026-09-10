package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1868kf extends BL {
    public final /* synthetic */ C1867ke A00;

    public C1868kf(C1867ke c1867ke) {
        this.A00 = c1867ke;
    }

    @Override // com.facebook.ads.redexgen.core.BL
    public final void A01() {
        if (this.A00.A01.A06() != null) {
            this.A00.A01.A06().onLoggingImpression(this.A00.A01.A07());
        }
    }
}
