package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1864kb extends BY {
    public final /* synthetic */ C1863ka A00;
    public final /* synthetic */ LI A01;

    public C1864kb(C1863ka c1863ka, LI li) {
        this.A00 = c1863ka;
        this.A01 = li;
    }

    @Override // com.facebook.ads.redexgen.core.BY
    public final void A05() {
        this.A01.setAdViewabilityChecker(this.A00.A02.A1B());
        this.A00.A02.A1f(true, true);
    }
}
