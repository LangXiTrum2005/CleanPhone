package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.i7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1713i7 implements InterfaceC0635Cj {
    public final C0634Ci A00;
    public final InterfaceC0635Cj A01;

    public C1713i7(InterfaceC0635Cj interfaceC0635Cj, int i, int i2) {
        this.A01 = interfaceC0635Cj;
        this.A00 = new C0634Ci(i, i2);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0635Cj
    public final void AGG(String str) {
        this.A00.A04(str);
        if (this.A00.A02() != null && AbstractC0637Cl.A08(this.A00)) {
            this.A01.AGG(this.A00.A02());
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0635Cj
    public final void flush() {
        this.A00.A03();
        while (this.A00.A02() != null) {
            if (AbstractC0637Cl.A08(this.A00)) {
                this.A01.AGG(this.A00.A02());
            }
            this.A00.A03();
        }
    }
}
