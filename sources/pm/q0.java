package pm;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class q0 {
    public abstract int a();

    public abstract y b();

    public abstract boolean c();

    public abstract q0 d(qm.f fVar);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return c() == q0Var.c() && a() == q0Var.a() && b().equals(q0Var.b());
    }

    public final int hashCode() {
        int iC = v0.i.c(a());
        if (y0.l(b())) {
            return (iC * 31) + 19;
        }
        return (iC * 31) + (c() ? 17 : b().hashCode());
    }

    public final String toString() {
        if (c()) {
            return "*";
        }
        if (a() == 1) {
            return b().toString();
        }
        return l1.d.v(a()) + " " + b();
    }
}
