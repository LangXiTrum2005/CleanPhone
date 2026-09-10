package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ep, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0693Ep {
    public final String A07;
    public long A01 = -1;
    public long A03 = -1;
    public long A04 = -1;
    public long A00 = -1;
    public long A05 = -1;
    public long A02 = -1;
    public long A06 = -1;

    public C0693Ep(String str) {
        this.A07 = str;
    }

    public final C0693Ep A00(long j) {
        this.A00 = j;
        return this;
    }

    public final C0693Ep A01(long j) {
        this.A01 = j;
        return this;
    }

    public final C0693Ep A02(long j) {
        this.A02 = j;
        return this;
    }

    public final C0693Ep A03(long j) {
        this.A03 = j;
        return this;
    }

    public final C0693Ep A04(long j) {
        this.A04 = j;
        return this;
    }

    public final C0693Ep A05(long j) {
        this.A05 = j;
        return this;
    }

    public final C0693Ep A06(long j) {
        this.A06 = j;
        return this;
    }

    public final C0694Eq A07() {
        return new C0694Eq(this.A07, this.A01, this.A03, this.A04, this.A00, this.A05, this.A02, this.A06);
    }
}
