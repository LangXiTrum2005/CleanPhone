package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.gV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1616gV extends BY {
    public final /* synthetic */ FW A00;

    public C1616gV(FW fw) {
        this.A00 = fw;
    }

    @Override // com.facebook.ads.redexgen.core.BY
    public final void A05() {
        if (this.A00.isPressed()) {
            this.A00.postDelayed(this, this.A00.A08);
        } else {
            this.A00.setPressed(true);
            this.A00.postOnAnimationDelayed(this.A00.A0A, 250L);
        }
    }
}
