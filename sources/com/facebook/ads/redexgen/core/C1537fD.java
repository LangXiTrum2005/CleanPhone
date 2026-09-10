package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.fD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1537fD {
    public float A00 = 1.0f;
    public int A01;
    public int A02;
    public long A03;

    public C1537fD(int i, int i2) {
        this.A02 = i;
        this.A01 = i2;
    }

    public final C1537fD A00(float f) {
        this.A00 = f;
        return this;
    }

    public final C1538fE A01() {
        return new C1538fE(this.A02, this.A01, this.A00, this.A03);
    }
}
