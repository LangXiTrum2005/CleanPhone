package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2444jB implements SM {
    public final /* synthetic */ C1578Nu A00;

    public C2444jB(C1578Nu c1578Nu) {
        this.A00 = c1578Nu;
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
