package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class QI implements InterfaceC1825Xr {
    public int A00;
    public final InterfaceC1825Xr A01;

    public QI(InterfaceC1825Xr interfaceC1825Xr, int i2) {
        this.A01 = interfaceC1825Xr;
        this.A00 = i2;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1825Xr
    public final void AH8(String str) {
        if (this.A00 > 0) {
            this.A01.AH8(str);
            this.A00--;
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1825Xr
    public final void flush() {
        this.A01.flush();
    }
}
