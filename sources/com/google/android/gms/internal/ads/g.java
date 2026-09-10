package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends pm {
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final SparseArray D;
    public final SparseBooleanArray E;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f14622w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f14623x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f14624y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final boolean f14625z;

    public g() {
        super(0);
        this.D = new SparseArray();
        this.E = new SparseBooleanArray();
        this.f14622w = true;
        this.f14623x = true;
        this.f14624y = true;
        this.f14625z = true;
        this.A = true;
        this.B = true;
        this.C = true;
    }

    public g(h hVar) {
        b(hVar);
        this.f14622w = hVar.f15007w;
        this.f14623x = hVar.f15008x;
        this.f14624y = hVar.f15009y;
        this.f14625z = hVar.f15010z;
        this.A = hVar.A;
        this.B = hVar.B;
        this.C = hVar.C;
        SparseArray sparseArray = new SparseArray();
        int i10 = 0;
        while (true) {
            SparseArray sparseArray2 = hVar.D;
            if (i10 < sparseArray2.size()) {
                sparseArray.put(sparseArray2.keyAt(i10), new HashMap((Map) sparseArray2.valueAt(i10)));
                i10++;
            } else {
                this.D = sparseArray;
                this.E = hVar.E.clone();
                return;
            }
        }
    }
}
