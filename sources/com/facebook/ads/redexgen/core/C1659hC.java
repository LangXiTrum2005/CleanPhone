package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1659hC implements InterfaceC0700Ew {
    public final /* synthetic */ C0690Em A00;

    public C1659hC(C0690Em c0690Em) {
        this.A00 = c0690Em;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0700Ew
    public final void ACT(boolean z) {
        this.A00.A0D(z);
        if (this.A00.A0C && this.A00.A00 != null) {
            this.A00.A00.setEnabled(z);
            this.A00.A00.setAlpha(z ? 1.0f : 0.3f);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0700Ew
    public final void ADC(boolean z) {
        this.A00.A0D(z);
        if (this.A00.A0C && this.A00.A02 != null) {
            this.A00.A02.setEnabled(z);
            this.A00.A02.setAlpha(z ? 1.0f : 0.3f);
        }
    }
}
