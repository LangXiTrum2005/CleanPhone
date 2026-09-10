package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1691hi implements CG {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractC1690hh A01;

    public C1691hi(AbstractC1690hh abstractC1690hh, int i) {
        this.A01 = abstractC1690hh;
        this.A00 = i;
    }

    @Override // com.facebook.ads.redexgen.core.CG
    public final void ACi() {
        this.A01.A03 = false;
        this.A01.A0V();
        this.A01.A0E.setToolbarActionMode(this.A01.getCloseButtonStyle());
        if (this.A01.A07 && this.A01.A06 != null) {
            this.A01.A06.A05();
            this.A01.A09.A4Z(new C1664hH().A6b());
        }
    }

    @Override // com.facebook.ads.redexgen.core.CG
    public final void AEg(float f) {
        this.A01.A0E.setProgress(100.0f * (1.0f - (f / this.A00)));
    }
}
