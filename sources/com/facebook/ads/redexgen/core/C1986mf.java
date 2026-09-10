package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.mf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1986mf implements FA {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractC1985me A01;
    public final /* synthetic */ C1744ie A02;

    public C1986mf(AbstractC1985me abstractC1985me, int i, C1744ie c1744ie) {
        this.A01 = abstractC1985me;
        this.A00 = i;
        this.A02 = c1744ie;
    }

    @Override // com.facebook.ads.redexgen.core.FA
    public final void ADM(boolean z) {
        if (this.A00 == 0) {
            this.A02.A1c(this.A01.A04);
        }
        this.A02.A1f(z, true);
    }
}
