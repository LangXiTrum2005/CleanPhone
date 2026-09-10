package com.facebook.ads.redexgen.core;

import android.text.TextUtils;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C1375Fx extends AbstractC2244fo {
    public final /* synthetic */ C4U A00;

    public C1375Fx(C4U c4u) {
        this.A00 = c4u;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2244fo
    public final void A03() {
        if (!this.A00.A04.A07()) {
            this.A00.setImpressionRecordingFlag(this.A00.A04);
            if (!TextUtils.isEmpty(this.A00.A08)) {
                this.A00.A0F.ABJ(this.A00.A08, new C1957b9().A03(this.A00.A07).A02(this.A00.A04).A04(this.A00.A0D.A0z()).A05());
                C1564Ng.A07(this.A00.A0D.A2A(), this.A00.A0E);
                this.A00.A0E.A0F().A3L();
                AbstractC1584Oa.A02(this.A00.A0D.A0y(), AbstractC1820Xm.A00(this.A00.A0D.A10()));
            }
        }
    }
}
