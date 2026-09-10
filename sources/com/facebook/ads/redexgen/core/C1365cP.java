package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1365cP extends BY {
    public final /* synthetic */ C1361cL A00;

    public C1365cP(C1361cL c1361cL) {
        this.A00 = c1361cL;
    }

    @Override // com.facebook.ads.redexgen.core.BY
    public final void A05() {
        if (!this.A00.A04) {
            this.A00.A0C.A02(new KX(this.A00.getCurrentPositionInMillis()));
            this.A00.A08.postDelayed(this, this.A00.A01);
        }
    }
}
