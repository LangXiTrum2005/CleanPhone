package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2476jo implements O3 {
    public final /* synthetic */ C11867w A00;

    public C2476jo(C11867w c11867w) {
        this.A00 = c11867w;
    }

    @Override // com.facebook.ads.redexgen.core.O3
    public final void AFF(AdError adError) {
        this.A00.A01.AFp(this.A00, adError);
    }

    @Override // com.facebook.ads.redexgen.core.O3
    public final void AFG() {
        this.A00.A0C.set(true);
        this.A00.A01.AFm(this.A00);
    }
}
