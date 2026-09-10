package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ni, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2702ni implements InterfaceC1352Ez {
    public long A00;
    public long A01;
    public C2702ni A02;
    public C1351Ey A03;

    public C2702ni(long j, int i2) {
        A02(j, i2);
    }

    public final int A00(long j) {
        return ((int) (j - this.A01)) + this.A03.A00;
    }

    public final C2702ni A01() {
        this.A03 = null;
        C2702ni c2702ni = this.A02;
        this.A02 = null;
        return c2702ni;
    }

    public final void A02(long j, int i2) {
        AbstractC10843y.A08(this.A03 == null);
        this.A01 = j;
        this.A00 = ((long) i2) + j;
    }

    public final void A03(C1351Ey c1351Ey, C2702ni c2702ni) {
        this.A03 = c1351Ey;
        this.A02 = c2702ni;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1352Ez
    public final C1351Ey A6u() {
        return (C1351Ey) AbstractC10843y.A01(this.A03);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1352Ez
    public final C2702ni ACc() {
        if (this.A02 == null || this.A02.A03 == null) {
            return null;
        }
        return this.A02;
    }
}
