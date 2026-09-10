package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2353hZ extends R7 {
    public boolean A00 = false;
    public final /* synthetic */ AbstractC2348hU A01;

    public C2353hZ(AbstractC2348hU abstractC2348hU) {
        this.A01 = abstractC2348hU;
    }

    @Override // com.facebook.ads.redexgen.core.R7
    public final void A0L(C7M c7m, int i2) {
        super.A0L(c7m, i2);
        if (i2 == 0 && this.A00) {
            this.A00 = false;
            this.A01.A0F();
        }
    }

    @Override // com.facebook.ads.redexgen.core.R7
    public final void A0M(C7M c7m, int i2, int i3) {
        if (i2 != 0 || i3 != 0) {
            this.A00 = true;
        }
    }
}
