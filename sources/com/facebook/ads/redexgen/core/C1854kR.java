package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1854kR extends BL {
    public final /* synthetic */ C1851kO A00;
    public final /* synthetic */ C0597Ag A01;

    public C1854kR(C1851kO c1851kO, C0597Ag c0597Ag) {
        this.A00 = c1851kO;
        this.A01 = c0597Ag;
    }

    @Override // com.facebook.ads.redexgen.core.BL
    public final void A01() {
        if (this.A00.A00.A00() != null) {
            this.A00.A00.A00().onAdError(C8.A00(this.A01));
        }
    }
}
