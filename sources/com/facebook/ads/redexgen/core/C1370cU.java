package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1370cU implements InterfaceC0818Jk {
    public final /* synthetic */ I7 A00;

    public C1370cU(I7 i7) {
        this.A00 = i7;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0818Jk
    public final void AGI() {
        if (this.A00.A02 != null) {
            this.A00.A02.A4Z(this.A00.A03.A8u());
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0818Jk
    public final void AGK(C0820Jm c0820Jm) {
        if (this.A00.A02 == null) {
            return;
        }
        if (c0820Jm != null && c0820Jm.A00()) {
            this.A00.A02.A4Z(this.A00.A03.A8v());
        } else {
            this.A00.A02.A4Z(this.A00.A03.A8u());
        }
    }
}
