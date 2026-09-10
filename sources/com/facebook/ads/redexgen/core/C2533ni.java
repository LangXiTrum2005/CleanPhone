package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ni, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2533ni implements InterfaceC1183Ez {
    public long A00;
    public long A01;
    public C2533ni A02;
    public C1182Ey A03;

    public C2533ni(long j, int i) {
        A02(j, i);
    }

    public final int A00(long j) {
        return ((int) (j - this.A01)) + this.A03.A00;
    }

    public final C2533ni A01() {
        this.A03 = null;
        C2533ni c2533ni = this.A02;
        this.A02 = null;
        return c2533ni;
    }

    public final void A02(long j, int i) {
        AbstractC09153y.A08(this.A03 == null);
        this.A01 = j;
        this.A00 = ((long) i) + j;
    }

    public final void A03(C1182Ey c1182Ey, C2533ni c2533ni) {
        this.A03 = c1182Ey;
        this.A02 = c2533ni;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1183Ez
    public final C1182Ey A6u() {
        return (C1182Ey) AbstractC09153y.A01(this.A03);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1183Ez
    public final C2533ni ACc() {
        if (this.A02 == null || this.A02.A03 == null) {
            return null;
        }
        return this.A02;
    }
}
