package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class QF implements InterfaceC1825Xr {
    public final C1824Xq A00;
    public final InterfaceC1825Xr A01;

    public QF(InterfaceC1825Xr interfaceC1825Xr, int i2, int i3) {
        this.A01 = interfaceC1825Xr;
        this.A00 = new C1824Xq(i2, i3);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1825Xr
    public final void AH8(String str) {
        this.A00.A04(str);
        if (this.A00.A02() != null && AbstractC1827Xt.A08(this.A00)) {
            this.A01.AH8(this.A00.A02());
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1825Xr
    public final void flush() {
        this.A00.A03();
        while (this.A00.A02() != null) {
            if (AbstractC1827Xt.A08(this.A00)) {
                this.A01.AH8(this.A00.A02());
            }
            this.A00.A03();
        }
    }
}
