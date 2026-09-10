package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2481jt implements InterfaceC1698Sp {
    public final /* synthetic */ C11867w A00;

    public C2481jt(C11867w c11867w) {
        this.A00 = c11867w;
    }

    private void A00(boolean z2) {
        if (!z2) {
            this.A00.A01.AFp(this.A00, AdError.CACHE_ERROR);
        } else {
            this.A00.A0C.set(true);
            this.A00.A01.AFm(this.A00);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1698Sp
    public final void ADL() {
        A00(false);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1698Sp
    public final void ADT() {
        A00(true);
    }
}
