package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.n7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2014n7 extends BY {
    public final /* synthetic */ C2013n6 A00;
    public final /* synthetic */ LI A01;

    public C2014n7(C2013n6 c2013n6, LI li) {
        this.A00 = c2013n6;
        this.A01 = li;
    }

    @Override // com.facebook.ads.redexgen.core.BY
    public final void A05() {
        this.A00.A00.A0A();
        if (this.A00.A00.A0C != null) {
            this.A01.setAdViewabilityChecker(this.A00.A00.A0C);
            this.A00.A00.A0C.A0U();
        }
    }
}
