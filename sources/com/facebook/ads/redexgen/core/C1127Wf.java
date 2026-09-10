package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1127Wf implements Uj {
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final U8 A06;

    public C1127Wf(U8 u8, long j, long j2, long j3, long j4, long j5, long j6) {
        this.A06 = u8;
        this.A03 = j;
        this.A05 = j2;
        this.A02 = j3;
        this.A04 = j4;
        this.A01 = j5;
        this.A00 = j6;
    }

    public final long A05(long j) {
        return this.A06.AJV(j);
    }

    @Override // com.facebook.ads.redexgen.core.Uj
    public final long A7j() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.core.Uj
    public final C1082Ui A8r(long j) {
        return new C1082Ui(new C1083Uk(j, U7.A05(this.A06.AJV(j), this.A05, this.A02, this.A04, this.A01, this.A00)));
    }

    @Override // com.facebook.ads.redexgen.core.Uj
    public final boolean AAY() {
        return true;
    }
}
