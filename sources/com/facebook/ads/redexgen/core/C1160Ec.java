package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ec, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1160Ec implements Comparable<C1160Ec> {
    public final boolean A00;
    public final boolean A01;

    public C1160Ec(C2691qI c2691qI, int i) {
        this.A00 = (c2691qI.A0H & 1) != 0;
        this.A01 = C10489h.A0S(i, false);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C1160Ec c1160Ec) {
        return AbstractC2543ns.A01().A09(this.A01, c1160Ec.A01).A09(this.A00, c1160Ec.A00).A05();
    }
}
