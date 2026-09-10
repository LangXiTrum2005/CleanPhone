package com.facebook.ads.redexgen.core;

import android.text.TextUtils;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.d4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1406d4 extends JK {
    public final /* synthetic */ C0842Ki A00;

    public C1406d4(C0842Ki c0842Ki) {
        this.A00 = c0842Ki;
    }

    @Override // com.facebook.ads.redexgen.core.JK
    public final void A03() {
        if (!this.A00.A0E.A07()) {
            this.A00.setImpressionRecordingFlag(this.A00.A0E);
            if (!TextUtils.isEmpty(this.A00.A0A)) {
                ((AbstractC1690hh) ((AbstractC1690hh) this.A00)).A0C.AB0(this.A00.A0A, new FB().A03(this.A00.A09).A02(this.A00.A0E).A04(((AbstractC1690hh) ((AbstractC1690hh) this.A00)).A0A.A0h()).A05());
                C03962h.A07(((AbstractC1690hh) ((AbstractC1690hh) this.A00)).A0A.A1c(), this.A00.A0D);
                this.A00.A0D.A0F().A3B();
                AbstractC04153a.A02(this.A00.A03.A0g(), AbstractC0630Ce.A00(((AbstractC1690hh) ((AbstractC1690hh) this.A00)).A0A.A0i()));
            }
        }
    }
}
