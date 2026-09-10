package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.mu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2001mu implements InterfaceC05277l {
    public final /* synthetic */ N0 A00;

    public C2001mu(N0 n0) {
        this.A00 = n0;
    }

    private void A00(boolean z) {
        if (!z) {
            this.A00.A01.AEz(this.A00, AdError.CACHE_ERROR);
        } else {
            this.A00.A0C.set(true);
            this.A00.A01.AEw(this.A00);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05277l
    public final void ACa() {
        A00(false);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05277l
    public final void ACj() {
        A00(true);
    }
}
