package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2332kD extends AbstractRunnableC1618Wc {
    public final /* synthetic */ N8 A00;

    public C2332kD(N8 n8) {
        this.A00 = n8;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1618Wc
    public final void A07() {
        this.A00.A07();
        this.A00.A02.A06();
        this.A00.A05.countDown();
    }
}
