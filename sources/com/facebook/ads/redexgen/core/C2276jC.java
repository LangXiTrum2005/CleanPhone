package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2276jC implements O3 {
    public final /* synthetic */ C1409Nu A00;

    public C2276jC(C1409Nu c1409Nu) {
        this.A00 = c1409Nu;
    }

    @Override // com.facebook.ads.redexgen.core.O3
    public final void AFF(AdError adError) {
        this.A00.A04.ACo(AdError.CACHE_ERROR);
    }

    @Override // com.facebook.ads.redexgen.core.O3
    public final void AFG() {
        this.A00.A04.ACp();
    }
}
