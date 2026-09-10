package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.iH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1722iH extends BY {
    public final /* synthetic */ CH A00;

    public C1722iH(CH ch) {
        this.A00 = ch;
    }

    @Override // com.facebook.ads.redexgen.core.BY
    public final void A05() {
        if (this.A00.A05()) {
            this.A00.A02();
            this.A00.A05.postDelayed(this, this.A00.A02);
        }
    }
}
