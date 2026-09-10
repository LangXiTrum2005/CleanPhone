package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C11887y extends AbstractC2439j4 {
    public final /* synthetic */ C11867w A00;
    public final /* synthetic */ AbstractC2469jh A01;
    public final /* synthetic */ C11757l A02;
    public final /* synthetic */ boolean A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11887y(C11867w c11867w, boolean z2, boolean z3, C11757l c11757l, AbstractC2469jh abstractC2469jh) {
        super(z2);
        this.A00 = c11867w;
        this.A03 = z3;
        this.A02 = c11757l;
        this.A01 = abstractC2469jh;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2439j4
    public final void A00() {
        this.A00.A01.AFp(this.A01, AdError.CACHE_ERROR);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2439j4
    public final void A01(boolean z2) {
        if (!C1750Up.A1t(this.A00.A04) || !this.A03) {
            if (this.A00.A05 == WK.A0J) {
                this.A00.A04.A0F().AER();
            }
            this.A00.A0C.set(true);
            this.A00.A01.AFm(this.A01);
            return;
        }
        this.A00.A06 = AbstractC2085dD.A01(this.A00.A04, this.A02, 0, new C2478jq(this));
    }
}
