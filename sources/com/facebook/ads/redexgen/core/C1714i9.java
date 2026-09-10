package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.i9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1714i9 implements InterfaceC0635Cj {
    public int A00;
    public final InterfaceC0635Cj A01;

    public C1714i9(InterfaceC0635Cj interfaceC0635Cj, int i) {
        this.A01 = interfaceC0635Cj;
        this.A00 = i;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0635Cj
    public final void AGG(String str) {
        if (this.A00 > 0) {
            this.A01.AGG(str);
            this.A00--;
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0635Cj
    public final void flush() {
        this.A01.flush();
    }
}
