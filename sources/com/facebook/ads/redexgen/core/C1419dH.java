package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1419dH {
    public final int A00;
    public final Y4 A01;
    public final Object A02;
    public final C0986Ql[] A03;
    public final QD[] A04;

    public C1419dH(C0986Ql[] c0986QlArr, QD[] qdArr, Y4 y4, Object obj) {
        this.A03 = c0986QlArr;
        this.A04 = (QD[]) qdArr.clone();
        this.A01 = y4;
        this.A02 = obj;
        this.A00 = c0986QlArr.length;
    }

    public final boolean A00(int i) {
        return this.A03[i] != null;
    }

    public final boolean A01(C1419dH c1419dH, int i) {
        return c1419dH != null && AbstractC1600gE.A1E(this.A03[i], c1419dH.A03[i]) && AbstractC1600gE.A1E(this.A04[i], c1419dH.A04[i]);
    }
}
