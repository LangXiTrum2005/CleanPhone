package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.j7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1772j7 extends BY {
    public final /* synthetic */ C1771j6 A00;

    public C1772j7(C1771j6 c1771j6) {
        this.A00 = c1771j6;
    }

    @Override // com.facebook.ads.redexgen.core.BY
    public final void A05() {
        this.A00.A0C = false;
        if (this.A00.A0B.getQueue().isEmpty()) {
            this.A00.A0B.execute(this.A00.A0A);
        }
    }
}
