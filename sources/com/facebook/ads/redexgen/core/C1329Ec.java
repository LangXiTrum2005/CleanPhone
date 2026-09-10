package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ec, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1329Ec implements Comparable<C1329Ec> {
    public final boolean A00;
    public final boolean A01;

    public C1329Ec(C2860qI c2860qI, int i2) {
        this.A00 = (c2860qI.A0H & 1) != 0;
        this.A01 = C12179h.A0S(i2, false);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C1329Ec c1329Ec) {
        return AbstractC2712ns.A01().A09(this.A01, c1329Ec.A01).A09(this.A00, c1329Ec.A00).A05();
    }
}
