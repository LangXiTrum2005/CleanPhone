package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1432dU implements HU {
    public final /* synthetic */ EC A00;
    public final /* synthetic */ C1431dT A01;
    public final /* synthetic */ C0770Ho A02;

    public C1432dU(C1431dT c1431dT, C0770Ho c0770Ho, EC ec) {
        this.A01 = c1431dT;
        this.A02 = c0770Ho;
        this.A00 = ec;
    }

    @Override // com.facebook.ads.redexgen.core.HU
    public final void AHe() {
        this.A01.A09();
        this.A01.A03 = this.A01.A05(this.A02, this.A00);
        if (this.A01.A01 != null && this.A01.A00 != null) {
            this.A01.A03.AAj(this.A01.A01, this.A01.A02, this.A01.A00);
        }
    }
}
