package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.eE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1477eE implements DP {
    public final /* synthetic */ AbstractC1476eD A00;

    public C1477eE(AbstractC1476eD abstractC1476eD) {
        this.A00 = abstractC1476eD;
    }

    @Override // com.facebook.ads.redexgen.core.DP
    public final void AC5(DQ dq) {
        if (dq.getToolbarActionMode() == 8) {
            this.A00.A0b();
            return;
        }
        this.A00.A06.A04(AE.A07, null);
        if (this.A00.A0f()) {
            return;
        }
        this.A00.A09.A4Z(this.A00.A0A.A7m());
    }
}
