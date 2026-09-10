package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1459dw extends BY {
    public final /* synthetic */ C0850Kq A00;

    public C1459dw(C0850Kq c0850Kq) {
        this.A00 = c0850Kq;
    }

    @Override // com.facebook.ads.redexgen.core.BY
    public final void A05() {
        if (this.A00.A00 != null) {
            this.A00.A00.A12();
        }
        this.A00.A08.setToolbarActionMode(this.A00.getCloseButtonStyle());
        this.A00.A08.A07();
        this.A00.A05.set(true);
    }
}
