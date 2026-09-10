package i1;

import java.util.Collections;
import oa.n1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q0 f42665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oa.j0 f42666b;

    static {
        l1.y.G(0);
        l1.y.G(1);
    }

    public r0(q0 q0Var, int i10) {
        n1 n1VarB = oa.j0.B(Integer.valueOf(i10));
        if (!n1VarB.isEmpty() && (((Integer) Collections.min(n1VarB)).intValue() < 0 || ((Integer) Collections.max(n1VarB)).intValue() >= q0Var.f42659a)) {
            throw new IndexOutOfBoundsException();
        }
        this.f42665a = q0Var;
        this.f42666b = oa.j0.x(n1VarB);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r0.class == obj.getClass()) {
            r0 r0Var = (r0) obj;
            if (this.f42665a.equals(r0Var.f42665a) && this.f42666b.equals(r0Var.f42666b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f42666b.hashCode() * 31) + this.f42665a.hashCode();
    }
}
