package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.f4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2029f4 extends AbstractRunnableC1618Wc {
    public final /* synthetic */ C2127ge A00;

    public C2029f4(C2127ge c2127ge) {
        this.A00 = c2127ge;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1618Wc
    public final void A07() {
        for (TY ty : TX.A02()) {
            TX.A0A(this.A00, ty.A02(), ty.A00(), ty.A01(), false);
        }
        TX.A02().clear();
    }
}
