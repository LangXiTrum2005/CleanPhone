package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.ironsource.Z3;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends in {
    public static final h F = new h(new g());
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final SparseArray D;
    public final SparseBooleanArray E;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f15007w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f15008x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f15009y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final boolean f15010z;

    static {
        String str = uu0.f20901a;
        Integer.toString(1000, 36);
        Integer.toString(1001, 36);
        Integer.toString(1002, 36);
        Integer.toString(1003, 36);
        Integer.toString(1004, 36);
        Integer.toString(1005, 36);
        Integer.toString(1006, 36);
        Integer.toString(1007, 36);
        Integer.toString(1008, 36);
        Integer.toString(1009, 36);
        Integer.toString(1010, 36);
        Integer.toString(1011, 36);
        Integer.toString(1012, 36);
        Integer.toString(Z3.f28072i, 36);
        Integer.toString(Z3.f28073j, 36);
        Integer.toString(1015, 36);
        Integer.toString(Z3.l, 36);
        Integer.toString(1017, 36);
        Integer.toString(1018, 36);
    }

    public h(g gVar) {
        super(gVar);
        this.f15007w = gVar.f14622w;
        this.f15008x = gVar.f14623x;
        this.f15009y = gVar.f14624y;
        this.f15010z = gVar.f14625z;
        this.A = gVar.A;
        this.B = gVar.B;
        this.C = gVar.C;
        this.D = gVar.D;
        this.E = gVar.E;
    }

    @Override // com.google.android.gms.internal.ads.in
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h.class == obj.getClass()) {
            h hVar = (h) obj;
            if (super.equals(hVar) && this.f15007w == hVar.f15007w && this.f15008x == hVar.f15008x && this.f15009y == hVar.f15009y && this.f15010z == hVar.f15010z && this.A == hVar.A && this.B == hVar.B && this.C == hVar.C) {
                SparseBooleanArray sparseBooleanArray = hVar.E;
                SparseBooleanArray sparseBooleanArray2 = this.E;
                int size = sparseBooleanArray2.size();
                if (sparseBooleanArray.size() == size) {
                    for (int i10 = 0; i10 < size; i10++) {
                        if (sparseBooleanArray.indexOfKey(sparseBooleanArray2.keyAt(i10)) >= 0) {
                        }
                    }
                    SparseArray sparseArray = hVar.D;
                    SparseArray sparseArray2 = this.D;
                    int size2 = sparseArray2.size();
                    if (sparseArray.size() == size2) {
                        for (int i11 = 0; i11 < size2; i11++) {
                            int iIndexOfKey = sparseArray.indexOfKey(sparseArray2.keyAt(i11));
                            if (iIndexOfKey >= 0) {
                                Map map = (Map) sparseArray2.valueAt(i11);
                                Map map2 = (Map) sparseArray.valueAt(iIndexOfKey);
                                if (map2.size() == map.size()) {
                                    for (Map.Entry entry : map.entrySet()) {
                                        v42 v42Var = (v42) entry.getKey();
                                        if (!map2.containsKey(v42Var) || !Objects.equals(entry.getValue(), map2.get(v42Var))) {
                                        }
                                    }
                                }
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.in
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.f15007w ? 1 : 0)) * 961) + (this.f15008x ? 1 : 0)) * 961) + (this.f15009y ? 1 : 0)) * 28629151) + (this.f15010z ? 1 : 0)) * 31) + (this.A ? 1 : 0)) * 31) + (this.B ? 1 : 0)) * 961) + (this.C ? 1 : 0)) * 31;
    }
}
