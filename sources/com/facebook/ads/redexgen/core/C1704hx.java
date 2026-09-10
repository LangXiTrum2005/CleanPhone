package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1704hx implements InterfaceC05006k {
    public final /* synthetic */ C1701hu A00;

    public C1704hx(C1701hu c1701hu) {
        this.A00 = c1701hu;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05006k
    public final boolean AA8() {
        if (this.A00.A0E.canGoBack()) {
            this.A00.A0E.goBack();
            return true;
        }
        return false;
    }
}
