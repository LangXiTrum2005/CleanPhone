package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1853kQ extends BL {
    public final /* synthetic */ C1852kP A00;

    public C1853kQ(C1852kP c1852kP) {
        this.A00 = c1852kP;
    }

    @Override // com.facebook.ads.redexgen.core.BL
    public final void A01() {
        if (this.A00.A01.A00.A00() != null) {
            this.A00.A01.A00.A00().onAdsLoaded();
        }
    }
}
