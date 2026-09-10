package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.mq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1997mq implements C7I {
    public final /* synthetic */ N0 A00;

    public C1997mq(N0 n0) {
        this.A00 = n0;
    }

    @Override // com.facebook.ads.redexgen.core.C7I
    public final void ACF() {
        this.A00.A0C.set(true);
        this.A00.A01.AEw(this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.C7I
    public final void ACG() {
        this.A00.A01.AEz(this.A00, AdError.CACHE_ERROR);
    }
}
