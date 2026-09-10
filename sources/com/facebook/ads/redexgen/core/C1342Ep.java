package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ep, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C1342Ep extends AbstractRunnableC1787Wc {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C1337Ek A02;

    public C1342Ep(C1337Ek c1337Ek, int i2, int i3) {
        this.A02 = c1337Ek;
        this.A00 = i2;
        this.A01 = i3;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1787Wc
    public final void A07() {
        this.A02.A0C.A02(new C1325Dy(this.A00, this.A01));
    }
}
