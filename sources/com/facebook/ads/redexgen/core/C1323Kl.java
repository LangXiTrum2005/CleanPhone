package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Kl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C1323Kl extends AbstractRunnableC1618Wc {
    public final /* synthetic */ AbstractC1816bb A00;

    public C1323Kl(AbstractC1816bb abstractC1816bb) {
        this.A00 = abstractC1816bb;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1618Wc
    public final void A07() {
        this.A00.setPressed(false);
        this.A00.postOnAnimationDelayed(this.A00.A09, this.A00.A08);
    }
}
