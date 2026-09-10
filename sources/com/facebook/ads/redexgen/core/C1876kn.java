package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1876kn extends AnonymousClass67 {
    public boolean A00 = false;
    public final /* synthetic */ AbstractC1875km A01;

    public C1876kn(AbstractC1875km abstractC1875km) {
        this.A01 = abstractC1875km;
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass67
    public final void A0L(MG mg, int i) {
        super.A0L(mg, i);
        if (i == 0 && this.A00) {
            this.A00 = false;
            this.A01.A0F();
        }
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass67
    public final void A0M(MG mg, int i, int i2) {
        if (i != 0 || i2 != 0) {
            this.A00 = true;
        }
    }
}
