package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Kq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C1328Kq extends AbstractRunnableC1618Wc {
    public final /* synthetic */ AbstractC1816bb A00;

    public C1328Kq(AbstractC1816bb abstractC1816bb) {
        this.A00 = abstractC1816bb;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1618Wc
    public final void A07() {
        if (!this.A00.isPressed()) {
            this.A00.setPressed(true);
            this.A00.postOnAnimationDelayed(this.A00.A0A, 250L);
        } else {
            this.A00.postDelayed(this, this.A00.A08);
        }
    }
}
