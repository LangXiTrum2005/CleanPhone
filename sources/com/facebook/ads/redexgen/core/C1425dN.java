package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1425dN implements GW {
    public final /* synthetic */ C1420dI A00;

    public C1425dN(C1420dI c1420dI) {
        this.A00 = c1420dI;
    }

    @Override // com.facebook.ads.redexgen.core.GW
    public final void AFU(int i) {
        this.A00.A0C(i, true);
        if (this.A00.A0H()) {
            this.A00.A07();
        } else {
            this.A00.A09(i);
        }
    }
}
