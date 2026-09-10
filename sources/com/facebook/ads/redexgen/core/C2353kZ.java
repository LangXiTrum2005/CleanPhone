package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2353kZ implements InterfaceC1361Lx {
    public final InterfaceC1358Lu A00;

    public C2353kZ(InterfaceC1358Lu interfaceC1358Lu) {
        this.A00 = interfaceC1358Lu;
    }

    public final InterfaceC1358Lu A00() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1361Lx
    public final C8J ACL() {
        return new C8J(this);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1361Lx
    public final C2357kd ACM() {
        return new C2357kd(this);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1361Lx
    public final C2357kd ACN(String str) {
        return new C2357kd(this, str);
    }
}
