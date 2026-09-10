package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.mR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1972mR implements C7I {
    public final /* synthetic */ C04102v A00;

    public C1972mR(C04102v c04102v) {
        this.A00 = c04102v;
    }

    @Override // com.facebook.ads.redexgen.core.C7I
    public final void ACF() {
        this.A00.A04.AC9();
    }

    @Override // com.facebook.ads.redexgen.core.C7I
    public final void ACG() {
        this.A00.A04.AC8(AdError.CACHE_ERROR);
    }
}
