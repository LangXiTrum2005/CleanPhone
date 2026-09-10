package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2275jB implements SM {
    public final /* synthetic */ C1409Nu A00;

    public C2275jB(C1409Nu c1409Nu) {
        this.A00 = c1409Nu;
    }

    @Override // com.facebook.ads.redexgen.core.SM
    public final void ACx() {
        this.A00.A04.ACp();
    }

    @Override // com.facebook.ads.redexgen.core.SM
    public final void ACy() {
        this.A00.A04.ACo(AdError.CACHE_ERROR);
    }
}
