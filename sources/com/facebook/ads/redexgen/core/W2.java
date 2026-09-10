package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class W2 implements InterfaceC1956b8 {
    public final /* synthetic */ C1784Vz A00;

    public W2(C1784Vz c1784Vz) {
        this.A00 = c1784Vz;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1956b8
    public final void AE7(C1955b7 c1955b7) {
        this.A00.A0G.set(c1955b7.A00() != null);
        if (this.A00.A0H.get() && this.A00.A05 != null) {
            this.A00.A05.AFB(c1955b7.A00() != null);
        }
    }
}
