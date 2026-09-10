package com.facebook.ads.redexgen.core;

import android.text.TextUtils;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.eM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1485eM extends JK {
    public final /* synthetic */ AbstractC1476eD A00;

    public C1485eM(AbstractC1476eD abstractC1476eD) {
        this.A00 = abstractC1476eD;
    }

    @Override // com.facebook.ads.redexgen.core.JK
    public final void A03() {
        if (!this.A00.A07.A07()) {
            this.A00.A07.A05();
            if (!TextUtils.isEmpty(this.A00.A02.A1g())) {
                this.A00.A05.AB0(this.A00.A02.A1g(), new FB().A03(this.A00.A0B).A02(this.A00.A07).A04(this.A00.A02.A0h()).A05());
                if (this.A00.A02.A1O()) {
                    this.A00.A04.A0F().ADl();
                }
                C0614Bh.A00(this.A00.A04).A0E(this.A00.A0A.A8b(), this.A00.A02.A1g());
                C03962h.A07(this.A00.A02.A1c(), this.A00.A04);
                this.A00.A04.A0F().A3B();
                AbstractC04153a.A02(this.A00.A02.A0g(), AbstractC0630Ce.A00(this.A00.A02.A0i()));
                this.A00.A09.A4Z(this.A00.A0A.A86());
            }
        }
    }
}
