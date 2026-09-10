package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2522kZ implements InterfaceC1530Lx {
    public final InterfaceC1527Lu A00;

    public C2522kZ(InterfaceC1527Lu interfaceC1527Lu) {
        this.A00 = interfaceC1527Lu;
    }

    public final InterfaceC1527Lu A00() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1530Lx
    public final C8J ACL() {
        return new C8J(this);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1530Lx
    public final C2526kd ACM() {
        return new C2526kd(this);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1530Lx
    public final C2526kd ACN(String str) {
        return new C2526kd(this, str);
    }
}
