package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5K, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C5K implements InterfaceC1437dZ {
    public InterfaceC1486eN A02;
    public InterfaceC1719iE<String> A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public final C1457du A07 = new C1457du();
    public int A00 = 8000;
    public int A01 = 8000;

    public final C5K A00(InterfaceC1486eN interfaceC1486eN) {
        this.A02 = interfaceC1486eN;
        return this;
    }

    public final C5K A01(String str) {
        this.A04 = str;
        return this;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1437dZ
    /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final C03530p A58() {
        C03530p c03530p = new C03530p(this.A04, this.A00, this.A01, this.A05, this.A07, this.A03, this.A06);
        if (this.A02 != null) {
            c03530p.A3t(this.A02);
        }
        return c03530p;
    }
}
