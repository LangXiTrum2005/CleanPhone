package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1676hT implements InterfaceC0706Fc {
    public final /* synthetic */ C1669hM A00;

    public C1676hT(C1669hM c1669hM) {
        this.A00 = c1669hM;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0706Fc
    public final void ACB() {
        if (this.A00.A0V()) {
            this.A00.A0L();
            this.A00.A0a.setToolbarActionMessage("");
            this.A00.A0a.setToolbarActionMode(0);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0706Fc
    public final void AE1() {
        this.A00.A0F = false;
        this.A00.A0O.A07();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0706Fc
    public final void AE2() {
        this.A00.A0F = true;
        this.A00.A0O.A06();
    }
}
