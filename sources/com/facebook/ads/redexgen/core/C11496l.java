package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C11496l implements Comparable<C11496l> {
    public int A00;
    public long A01;
    public Object A02;
    public final C11677d A03;

    public C11496l(C11677d c11677d) {
        this.A03 = c11677d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C11496l c11496l) {
        if ((this.A02 == null) != (c11496l.A02 == null)) {
            return this.A02 != null ? -1 : 1;
        }
        if (this.A02 == null) {
            return 0;
        }
        int i2 = this.A00 - c11496l.A00;
        if (i2 != 0) {
            return i2;
        }
        int comparePeriodIndex = C5C.A08(this.A01, c11496l.A01);
        return comparePeriodIndex;
    }

    public final void A01(int i2, long j, Object obj) {
        this.A00 = i2;
        this.A01 = j;
        this.A02 = obj;
    }
}
