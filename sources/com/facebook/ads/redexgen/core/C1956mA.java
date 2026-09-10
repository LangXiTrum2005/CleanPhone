package com.facebook.ads.redexgen.core;

import com.facebook.ads.internal.protocol.AdErrorType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.mA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1956mA extends BY {
    public final /* synthetic */ N0 A00;
    public final /* synthetic */ AnonymousClass38 A01;
    public final /* synthetic */ C0885Ma A02;

    public C1956mA(C0885Ma c0885Ma, AnonymousClass38 anonymousClass38, N0 n0) {
        this.A02 = c0885Ma;
        this.A01 = anonymousClass38;
        this.A00 = n0;
    }

    @Override // com.facebook.ads.redexgen.core.BY
    public final void A05() {
        this.A02.A0T(this.A01);
        this.A02.A0Q(this.A00);
        this.A02.A00 = null;
        AdErrorType adErrorType = AdErrorType.RV_AD_TIMEOUT;
        this.A02.A0B.A0F().A5W(adErrorType.getErrorCode(), adErrorType.getDefaultErrorMessage());
        this.A02.A07.A0G(new C0597Ag(adErrorType, ""));
    }
}
