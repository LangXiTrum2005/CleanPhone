package i1;

import oa.n1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v0 f42709b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oa.j0 f42710a;

    static {
        oa.f0 f0Var = oa.j0.f47265b;
        f42709b = new v0(n1.f47281e);
        l1.y.G(0);
    }

    public v0(n1 n1Var) {
        this.f42710a = oa.j0.x(n1Var);
    }

    public final boolean a(int i10) {
        int i11 = 0;
        while (true) {
            oa.j0 j0Var = this.f42710a;
            if (i11 >= j0Var.size()) {
                return false;
            }
            u0 u0Var = (u0) j0Var.get(i11);
            for (boolean z10 : u0Var.f42703e) {
                if (z10) {
                    if (u0Var.f42700b.f42661c != i10) {
                        break;
                    }
                    return true;
                }
            }
            i11++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v0.class != obj.getClass()) {
            return false;
        }
        return this.f42710a.equals(((v0) obj).f42710a);
    }

    public final int hashCode() {
        return this.f42710a.hashCode();
    }
}
