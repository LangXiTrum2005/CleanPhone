package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ga, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C1378Ga extends AbstractRunnableC1787Wc {
    public final /* synthetic */ C11094x A00;

    public C1378Ga(C11094x c11094x) {
        this.A00 = c11094x;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1787Wc
    public final void A07() {
        if (this.A00.A00 != null) {
            this.A00.A00.A1F();
        }
        this.A00.A09.setToolbarActionMode(this.A00.getCloseButtonStyle());
        this.A00.A09.A0A();
        this.A00.A06.set(true);
    }
}
