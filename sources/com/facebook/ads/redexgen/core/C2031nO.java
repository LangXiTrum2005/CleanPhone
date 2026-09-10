package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.nO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2031nO implements InterfaceC03721j {
    public final InterfaceC03691g A00;

    public C2031nO(InterfaceC03691g interfaceC03691g) {
        this.A00 = interfaceC03691g;
    }

    public final InterfaceC03691g A00() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03721j
    public final NI ABh() {
        return new NI(this);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03721j
    public final C2033nQ ABi() {
        return new C2033nQ(this);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03721j
    public final C2033nQ ABj(String str) {
        return new C2033nQ(this, str);
    }
}
