package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Es, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C1345Es extends AbstractRunnableC1787Wc {
    public final /* synthetic */ C1337Ek A00;

    public C1345Es(C1337Ek c1337Ek) {
        this.A00 = c1337Ek;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1787Wc
    public final void A07() {
        if (!this.A00.A04) {
            UM um = this.A00.A0C;
            final int currentPositionInMillis = this.A00.getCurrentPositionInMillis();
            um.A02(new EB(currentPositionInMillis) { // from class: com.facebook.ads.redexgen.X.4A
            });
            this.A00.A08.postDelayed(this, this.A00.A01);
        }
    }
}
