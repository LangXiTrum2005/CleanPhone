package com.facebook.ads.redexgen.core;

import android.util.SparseArray;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Jz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1480Jz {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final SparseArray<K0> A09;
    public final boolean A0A;

    public C1480Jz(int i2, boolean z2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, SparseArray<K0> sparseArray) {
        this.A03 = i2;
        this.A0A = z2;
        this.A08 = i3;
        this.A02 = i4;
        this.A04 = i5;
        this.A01 = i6;
        this.A00 = i7;
        this.A07 = i8;
        this.A06 = i9;
        this.A05 = i10;
        this.A09 = sparseArray;
    }

    public final void A00(C1480Jz c1480Jz) {
        SparseArray<K0> sparseArray = c1480Jz.A09;
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            SparseArray<K0> sparseArray2 = this.A09;
            int i3 = sparseArray.keyAt(i2);
            sparseArray2.put(i3, sparseArray.valueAt(i2));
        }
    }
}
