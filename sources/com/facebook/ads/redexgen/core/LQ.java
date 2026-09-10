package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class LQ extends AbstractRunnableC1787Wc {
    public final /* synthetic */ C1954b6 A00;

    public LQ(C1954b6 c1954b6) {
        this.A00 = c1954b6;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1787Wc
    public final void A07() {
        this.A00.A03();
        if (!this.A00.A08) {
            return;
        }
        this.A00.A0D.postDelayed(this.A00.A0F, 250L);
    }
}
