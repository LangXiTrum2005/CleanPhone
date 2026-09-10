package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1433dV implements HT {
    public final /* synthetic */ C0843Kj A00;

    public C1433dV(C0843Kj c0843Kj) {
        this.A00 = c0843Kj;
    }

    @Override // com.facebook.ads.redexgen.core.HT
    public final void A9b() {
        if (this.A00.A03 instanceof LS) {
            ((LS) this.A00.A03).A1F();
            AF.A02(AE.A0e, null, ((AbstractC1476eD) this.A00).A02.A1g(), ((AbstractC1476eD) this.A00).A04.A0A());
        }
    }

    @Override // com.facebook.ads.redexgen.core.HT
    public final void AJ5() {
        if (this.A00.A03 instanceof LS) {
            ((LS) this.A00.A03).A1H(this.A00.A0M);
            AF.A02(AE.A0e, null, ((AbstractC1476eD) this.A00).A02.A1g(), ((AbstractC1476eD) this.A00).A04.A0A());
        }
        this.A00.A0g();
    }

    @Override // com.facebook.ads.redexgen.core.HT
    public final void AJJ() {
        this.A00.A0a();
        if (this.A00.A03 instanceof LS) {
            ((LS) this.A00.A03).getAdDetailsView().setVisibility(8);
        }
    }
}
