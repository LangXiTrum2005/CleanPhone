package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Kk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1491Kk implements Comparable<C1491Kk> {
    public final int A00;
    public final C1482Kb A01;

    public C1491Kk(int i2, C1482Kb c1482Kb) {
        this.A00 = i2;
        this.A01 = c1482Kb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C1491Kk c1491Kk) {
        return Integer.compare(this.A00, c1491Kk.A00);
    }
}
