package oa;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class z extends m1 implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Comparator[] f47356a;

    public z(p pVar, p pVar2) {
        this.f47356a = new Comparator[]{pVar, pVar2};
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i10 = 0;
        while (true) {
            Comparator[] comparatorArr = this.f47356a;
            if (i10 >= comparatorArr.length) {
                return 0;
            }
            int iCompare = comparatorArr[i10].compare(obj, obj2);
            if (iCompare != 0) {
                return iCompare;
            }
            i10++;
        }
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof z) {
            return Arrays.equals(this.f47356a, ((z) obj).f47356a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f47356a);
    }

    public final String toString() {
        return defpackage.e.q(Arrays.toString(this.f47356a), ")", new StringBuilder("Ordering.compound("));
    }
}
