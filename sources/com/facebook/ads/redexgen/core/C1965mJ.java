package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.mJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1965mJ extends BY {
    public final /* synthetic */ AbstractC1964mI A00;
    public final /* synthetic */ C0597Ag A01;

    public C1965mJ(AbstractC1964mI abstractC1964mI, C0597Ag c0597Ag) {
        this.A00 = abstractC1964mI;
        this.A01 = c0597Ag;
    }

    @Override // com.facebook.ads.redexgen.core.BY
    public final void A05() {
        this.A00.A0B.A0F().A5W(this.A01.A03().getErrorCode(), this.A01.A04());
        if (this.A00.A07 != null) {
            this.A00.A07.A0G(this.A01);
        }
    }
}
