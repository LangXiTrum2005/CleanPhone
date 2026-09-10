package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1169Xw implements Comparable<C1169Xw> {
    public final int A00;
    public final C1160Xn A01;

    public C1169Xw(int i, C1160Xn c1160Xn) {
        this.A00 = i;
        this.A01 = c1160Xn;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C1169Xw c1169Xw) {
        return Integer.compare(this.A00, c1169Xw.A00);
    }
}
