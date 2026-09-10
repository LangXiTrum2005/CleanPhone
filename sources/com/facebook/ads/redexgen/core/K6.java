package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class K6 extends AbstractRunnableC1787Wc {
    public final /* synthetic */ C1463Ji A00;
    public final /* synthetic */ boolean A01;

    public K6(C1463Ji c1463Ji, boolean z2) {
        this.A00 = c1463Ji;
        this.A01 = z2;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1787Wc
    public final void A07() {
        AbstractC1835Yb abstractC1835YbA0B = this.A00.A0b.A0B();
        if (abstractC1835YbA0B == null) {
            return;
        }
        abstractC1835YbA0B.setPageDetailsVisible((this.A01 || abstractC1835YbA0B.A0E()) ? false : true);
        abstractC1835YbA0B.setToolbarActionMode(this.A00.getCloseButtonStyle());
    }
}
