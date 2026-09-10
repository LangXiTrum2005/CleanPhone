package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Pn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0964Pn implements InterfaceC1437dZ {
    public final InterfaceC1486eN A00;

    public C0964Pn() {
        this(null);
    }

    public C0964Pn(InterfaceC1486eN interfaceC1486eN) {
        this.A00 = interfaceC1486eN;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1437dZ
    public final Q7 A58() {
        C03520o c03520o = new C03520o();
        if (this.A00 != null) {
            c03520o.A3t(this.A00);
        }
        return c03520o;
    }
}
