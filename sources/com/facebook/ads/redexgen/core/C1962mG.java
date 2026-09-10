package com.facebook.ads.redexgen.core;

import com.facebook.ads.internal.protocol.AdErrorType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.mG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1962mG extends BY {
    public final /* synthetic */ C2010n3 A00;
    public final /* synthetic */ AnonymousClass38 A01;
    public final /* synthetic */ C0895Mr A02;

    public C1962mG(C0895Mr c0895Mr, AnonymousClass38 anonymousClass38, C2010n3 c2010n3) {
        this.A02 = c0895Mr;
        this.A01 = anonymousClass38;
        this.A00 = c2010n3;
    }

    @Override // com.facebook.ads.redexgen.core.BY
    public final void A05() {
        this.A02.A0T(this.A01);
        this.A02.A0Q(this.A00);
        this.A02.A00 = null;
        C0597Ag c0597AgA00 = C0597Ag.A00(AdErrorType.INTERSTITIAL_AD_TIMEOUT);
        this.A02.A0B.A0F().A5W(c0597AgA00.A03().getErrorCode(), c0597AgA00.A04());
        this.A02.A07.A0G(c0597AgA00);
    }
}
