package com.facebook.ads.redexgen.core;

import android.util.SparseArray;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class K1 {
    public C1476Jv A00;
    public C1478Jx A01;
    public final int A02;
    public final int A03;
    public final SparseArray<C1480Jz> A08 = new SparseArray<>();
    public final SparseArray<C1475Ju> A06 = new SparseArray<>();
    public final SparseArray<C1477Jw> A07 = new SparseArray<>();
    public final SparseArray<C1475Ju> A04 = new SparseArray<>();
    public final SparseArray<C1477Jw> A05 = new SparseArray<>();

    public K1(int i2, int i3) {
        this.A03 = i2;
        this.A02 = i3;
    }

    public final void A00() {
        this.A08.clear();
        this.A06.clear();
        this.A07.clear();
        this.A04.clear();
        this.A05.clear();
        this.A00 = null;
        this.A01 = null;
    }
}
