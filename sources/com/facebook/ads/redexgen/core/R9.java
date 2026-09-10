package com.facebook.ads.redexgen.core;

import android.util.SparseArray;
import java.util.ArrayList;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class R9 {
    public SparseArray<R8> A00 = new SparseArray<>();
    public int A01 = 0;

    private final long A00(long j, long j2) {
        if (j == 0) {
            return j2;
        }
        return ((j / 4) * 3) + (j2 / 4);
    }

    private R8 A01(int i2) {
        R8 r8 = this.A00.get(i2);
        if (r8 == null) {
            R8 r9 = new R8();
            this.A00.put(i2, r9);
            return r9;
        }
        return r8;
    }

    private final void A02() {
        for (int i2 = 0; i2 < i; i2++) {
            this.A00.valueAt(i2).A03.clear();
        }
    }

    public final RK A03(int i2) {
        R8 r8 = this.A00.get(i2);
        if (r8 != null && !r8.A03.isEmpty()) {
            ArrayList<RK> arrayList = r8.A03;
            return arrayList.remove(arrayList.size() - 1);
        }
        return null;
    }

    public final void A04() {
        this.A01--;
    }

    public final void A05(int i2, long j) {
        R8 r8A01 = A01(i2);
        r8A01.A01 = A00(r8A01.A01, j);
    }

    public final void A06(int i2, long j) {
        R8 r8A01 = A01(i2);
        r8A01.A02 = A00(r8A01.A02, j);
    }

    public final void A07(AbstractC1648Qq abstractC1648Qq) {
        this.A01++;
    }

    public final void A08(AbstractC1648Qq abstractC1648Qq, AbstractC1648Qq abstractC1648Qq2, boolean z2) {
        if (abstractC1648Qq != null) {
            A04();
        }
        if (!z2 && this.A01 == 0) {
            A02();
        }
        if (abstractC1648Qq2 != null) {
            A07(abstractC1648Qq2);
        }
    }

    public final void A09(RK rk) {
        int iA0N = rk.A0N();
        ArrayList<RK> arrayList = A01(iA0N).A03;
        int i2 = this.A00.get(iA0N).A00;
        int viewType = arrayList.size();
        if (i2 <= viewType) {
            return;
        }
        rk.A0W();
        arrayList.add(rk);
    }

    public final boolean A0A(int i2, long j, long j2) {
        long j3 = A01(i2).A01;
        return j3 == 0 || j + j3 < j2;
    }

    public final boolean A0B(int i2, long j, long j2) {
        long j3 = A01(i2).A02;
        return j3 == 0 || j + j3 < j2;
    }
}
