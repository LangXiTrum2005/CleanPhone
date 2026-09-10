package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.f4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2198f4 extends AbstractRunnableC1787Wc {
    public final /* synthetic */ C2296ge A00;

    public C2198f4(C2296ge c2296ge) {
        this.A00 = c2296ge;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1787Wc
    public final void A07() {
        for (TY ty : TX.A02()) {
            TX.A0A(this.A00, ty.A02(), ty.A00(), ty.A01(), false);
        }
        TX.A02().clear();
    }
}
