package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Kl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C1492Kl extends AbstractRunnableC1787Wc {
    public final /* synthetic */ AbstractC1985bb A00;

    public C1492Kl(AbstractC1985bb abstractC1985bb) {
        this.A00 = abstractC1985bb;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1787Wc
    public final void A07() {
        this.A00.setPressed(false);
        this.A00.postOnAnimationDelayed(this.A00.A09, this.A00.A08);
    }
}
