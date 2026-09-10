package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.gC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1598gC implements CG {
    public final /* synthetic */ LS A00;

    public C1598gC(LS ls) {
        this.A00 = ls;
    }

    @Override // com.facebook.ads.redexgen.core.CG
    public final void ACi() {
        this.A00.A0B = false;
        if (this.A00.A06 != null) {
            this.A00.A06.setToolbarActionMode(this.A00.getCloseButtonStyle());
        }
    }

    @Override // com.facebook.ads.redexgen.core.CG
    public final void AEg(float f) {
        if (this.A00.A06 != null) {
            this.A00.A06.setProgressImmediate(100.0f * (1.0f - (f / this.A00.getAdInfo().A0I().A00())));
        }
    }
}
