package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Kk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1322Kk implements Comparable<C1322Kk> {
    public final int A00;
    public final C1313Kb A01;

    public C1322Kk(int i, C1313Kb c1313Kb) {
        this.A00 = i;
        this.A01 = c1313Kb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C1322Kk c1322Kk) {
        return Integer.compare(this.A00, c1322Kk.A00);
    }
}
