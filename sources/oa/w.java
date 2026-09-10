package oa;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class w extends y {
    public static y f(int i10) {
        if (i10 < 0) {
            return y.f47347b;
        }
        return i10 > 0 ? y.f47348c : y.f47346a;
    }

    @Override // oa.y
    public final y a(int i10, int i11) {
        return f(Integer.compare(i10, i11));
    }

    @Override // oa.y
    public final y b(Object obj, Object obj2, Comparator comparator) {
        return f(comparator.compare(obj, obj2));
    }

    @Override // oa.y
    public final y c(boolean z10, boolean z11) {
        return f(Boolean.compare(z10, z11));
    }

    @Override // oa.y
    public final y d(boolean z10, boolean z11) {
        return f(Boolean.compare(z11, z10));
    }

    @Override // oa.y
    public final int e() {
        return 0;
    }
}
