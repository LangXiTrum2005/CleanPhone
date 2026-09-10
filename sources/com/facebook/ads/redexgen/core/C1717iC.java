package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.iC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1717iC implements InterfaceC0635Cj {
    public int A00;
    public final InterfaceC0635Cj A01;
    public final InterfaceC0635Cj A02;

    public C1717iC(InterfaceC0635Cj interfaceC0635Cj, int i, InterfaceC0635Cj interfaceC0635Cj2) {
        this.A01 = interfaceC0635Cj;
        this.A00 = i;
        this.A02 = interfaceC0635Cj2;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0635Cj
    public final void AGG(String str) {
        if (this.A00 > 0) {
            this.A01.AGG(str);
            this.A01.flush();
            this.A00--;
            return;
        }
        this.A02.AGG(str);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0635Cj
    public final void flush() {
        this.A02.flush();
    }
}
