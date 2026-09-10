package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1398cw implements Comparable<C1398cw> {
    public final boolean A00;
    public final boolean A01;

    public C1398cw(ZM zm, int i) {
        this.A00 = (zm.A0H & 1) != 0;
        this.A01 = C04845u.A0S(i, false);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C1398cw c1398cw) {
        return AbstractC1895l7.A01().A09(this.A01, c1398cw.A01).A09(this.A00, c1398cw.A00).A05();
    }
}
