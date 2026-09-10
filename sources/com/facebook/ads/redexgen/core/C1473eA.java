package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.eA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1473eA implements HI {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C1462dz A01;

    public C1473eA(C1462dz c1462dz, int i) {
        this.A01 = c1462dz;
        this.A00 = i;
    }

    @Override // com.facebook.ads.redexgen.core.HI
    public final void ACS() {
        this.A01.A0S(false, this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.HI
    public final void ACr(int i) {
        C1462dz.A02(this.A01, i);
    }

    @Override // com.facebook.ads.redexgen.core.HI
    public final void ADB(float f) {
        if (!this.A01.A08) {
            this.A01.A0H(f);
        }
    }

    @Override // com.facebook.ads.redexgen.core.HI
    public final void AF6(boolean z) {
        this.A01.A0R(z);
    }

    @Override // com.facebook.ads.redexgen.core.HI
    public final void AFY(String str) {
        this.A01.A0D.A0F().A3Q(str);
        this.A01.A0H.A4Z(this.A01.A0J.A7r());
        this.A01.A0I(3);
    }

    @Override // com.facebook.ads.redexgen.core.HI
    public final void AJh() {
        this.A01.setUnskippableSecondsComplete(false);
        this.A01.A0I.setProgressImmediate(0.0f);
        this.A01.A0I.setToolbarActionMode(2);
    }

    @Override // com.facebook.ads.redexgen.core.HI
    public final void AJi(float f) {
        this.A01.A0I.setProgress(100.0f * f);
    }
}
