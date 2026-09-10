package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ep, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C1173Ep extends AbstractRunnableC1618Wc {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C1168Ek A02;

    public C1173Ep(C1168Ek c1168Ek, int i, int i2) {
        this.A02 = c1168Ek;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1618Wc
    public final void A07() {
        this.A02.A0C.A02(new C1156Dy(this.A00, this.A01));
    }
}
