package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2658n0 implements HY {
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final InterfaceC1401Gx A06;

    public C2658n0(InterfaceC1401Gx interfaceC1401Gx, long j, long j2, long j3, long j4, long j5, long j6) {
        this.A06 = interfaceC1401Gx;
        this.A03 = j;
        this.A05 = j2;
        this.A02 = j3;
        this.A04 = j4;
        this.A01 = j5;
        this.A00 = j6;
    }

    public final long A05(long j) {
        return this.A06.AKQ(j);
    }

    @Override // com.facebook.ads.redexgen.core.HY
    public final long A7t() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.core.HY
    public final HX A91(long j) {
        return new HX(new HZ(j, C1400Gw.A05(this.A06.AKQ(j), this.A05, this.A02, this.A04, this.A01, this.A00)));
    }

    @Override // com.facebook.ads.redexgen.core.HY
    public final boolean AAj() {
        return true;
    }
}
