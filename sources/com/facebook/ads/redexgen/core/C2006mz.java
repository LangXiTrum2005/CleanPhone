package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.mz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2006mz implements InterfaceC0664Dm {
    public final /* synthetic */ N4 A00;
    public final /* synthetic */ M5 A01;

    public C2006mz(N4 n4, M5 m5) {
        this.A00 = n4;
        this.A01 = m5;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0664Dm
    public final void ADP() {
        this.A01.A0F().A4G(this.A00.A03 != null);
        if (this.A00.A03 != null) {
            this.A00.A03.A03();
        }
    }
}
