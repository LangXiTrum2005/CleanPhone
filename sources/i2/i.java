package i2;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.ironsource.Z3;
import f2.k1;
import i1.t0;
import java.util.Map;
import java.util.Objects;
import l1.y;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends t0 {
    public static final i F = new i(new h());
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final SparseArray D;
    public final SparseBooleanArray E;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f42778w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f42779x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f42780y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final boolean f42781z;

    static {
        d5.u.m(1000, 1001, 1002, 1003, 1004);
        d5.u.m(1005, 1006, 1007, 1008, 1009);
        d5.u.m(1010, 1011, 1012, Z3.f28072i, Z3.f28073j);
        y.G(1015);
        y.G(Z3.l);
        y.G(1017);
        y.G(1018);
    }

    public i(h hVar) {
        super(hVar);
        this.f42778w = hVar.f42774w;
        this.f42779x = hVar.f42775x;
        this.f42780y = hVar.f42776y;
        this.f42781z = hVar.f42777z;
        this.A = hVar.A;
        this.B = hVar.B;
        this.C = hVar.C;
        this.D = hVar.D;
        this.E = hVar.E;
    }

    @Override // i1.t0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            i iVar = (i) obj;
            if (super.equals(iVar) && this.f42778w == iVar.f42778w && this.f42779x == iVar.f42779x && this.f42780y == iVar.f42780y && this.f42781z == iVar.f42781z && this.A == iVar.A && this.B == iVar.B && this.C == iVar.C) {
                SparseBooleanArray sparseBooleanArray = iVar.E;
                SparseBooleanArray sparseBooleanArray2 = this.E;
                int size = sparseBooleanArray2.size();
                if (sparseBooleanArray.size() == size) {
                    for (int i10 = 0; i10 < size; i10++) {
                        if (sparseBooleanArray.indexOfKey(sparseBooleanArray2.keyAt(i10)) >= 0) {
                        }
                    }
                    SparseArray sparseArray = iVar.D;
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
                                        k1 k1Var = (k1) entry.getKey();
                                        if (!map2.containsKey(k1Var) || !Objects.equals(entry.getValue(), map2.get(k1Var))) {
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

    @Override // i1.t0
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.f42778w ? 1 : 0)) * 961) + (this.f42779x ? 1 : 0)) * 961) + (this.f42780y ? 1 : 0)) * 28629151) + (this.f42781z ? 1 : 0)) * 31) + (this.A ? 1 : 0)) * 31) + (this.B ? 1 : 0)) * 961) + (this.C ? 1 : 0)) * 31;
    }
}
