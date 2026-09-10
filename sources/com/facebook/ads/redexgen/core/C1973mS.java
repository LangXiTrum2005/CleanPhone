package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.mS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1973mS implements AnonymousClass33 {
    public final /* synthetic */ C04102v A00;

    public C1973mS(C04102v c04102v) {
        this.A00 = c04102v;
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass33
    public final void AET(AdError adError) {
        this.A00.A04.AC8(AdError.CACHE_ERROR);
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass33
    public final void AEU() {
        this.A00.A04.AC9();
    }
}
