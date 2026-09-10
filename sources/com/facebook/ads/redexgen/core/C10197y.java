package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C10197y extends AbstractC2270j4 {
    public final /* synthetic */ C10177w A00;
    public final /* synthetic */ AbstractC2300jh A01;
    public final /* synthetic */ C10067l A02;
    public final /* synthetic */ boolean A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10197y(C10177w c10177w, boolean z, boolean z2, C10067l c10067l, AbstractC2300jh abstractC2300jh) {
        super(z);
        this.A00 = c10177w;
        this.A03 = z2;
        this.A02 = c10067l;
        this.A01 = abstractC2300jh;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2270j4
    public final void A00() {
        this.A00.A01.AFp(this.A01, AdError.CACHE_ERROR);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2270j4
    public final void A01(boolean z) {
        if (!C1581Up.A1t(this.A00.A04) || !this.A03) {
            if (this.A00.A05 == WK.A0J) {
                this.A00.A04.A0F().AER();
            }
            this.A00.A0C.set(true);
            this.A00.A01.AFm(this.A01);
            return;
        }
        this.A00.A06 = AbstractC1916dD.A01(this.A00.A04, this.A02, 0, new C2309jq(this));
    }
}
