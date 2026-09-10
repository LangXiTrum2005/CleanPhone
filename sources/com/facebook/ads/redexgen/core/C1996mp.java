package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.mp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1996mp implements AnonymousClass33 {
    public final /* synthetic */ N0 A00;

    public C1996mp(N0 n0) {
        this.A00 = n0;
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass33
    public final void AET(AdError adError) {
        this.A00.A01.AEz(this.A00, adError);
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass33
    public final void AEU() {
        this.A00.A0C.set(true);
        this.A00.A01.AEw(this.A00);
    }
}
