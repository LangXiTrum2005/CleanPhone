package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.j1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2436j1 extends AbstractRunnableC1787Wc {
    public final /* synthetic */ AbstractC2435j0 A00;
    public final /* synthetic */ C1772Vm A01;

    public C2436j1(AbstractC2435j0 abstractC2435j0, C1772Vm c1772Vm) {
        this.A00 = abstractC2435j0;
        this.A01 = c1772Vm;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1787Wc
    public final void A07() {
        this.A00.A0B.A0F().A5g(this.A01.A03().getErrorCode(), this.A01.A04());
        if (this.A00.A07 != null) {
            this.A00.A07.A0G(this.A01);
        }
    }
}
