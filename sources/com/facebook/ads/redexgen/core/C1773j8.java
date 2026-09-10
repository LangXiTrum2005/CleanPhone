package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.j8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1773j8 extends BY {
    public final /* synthetic */ C1771j6 A00;

    public C1773j8(C1771j6 c1771j6) {
        this.A00 = c1771j6;
    }

    @Override // com.facebook.ads.redexgen.core.BY
    public final void A05() throws Exception {
        C1771j6.A00(this.A00);
        if (this.A00.A01 > 0) {
            try {
                Thread.sleep(this.A00.A01);
            } catch (InterruptedException unused) {
            }
        }
        this.A00.A0B();
    }
}
