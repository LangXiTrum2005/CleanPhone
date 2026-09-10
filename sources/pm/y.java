package pm;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class y implements al.a, sm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f48488a;

    public abstract im.n A();

    public abstract j0 M();

    public abstract n0 P();

    public abstract boolean Q();

    public abstract y U(qm.f fVar);

    public abstract a1 b0();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (Q() == yVar.Q()) {
            return c.u(qm.m.f49193a, b0(), yVar.b0());
        }
        return false;
    }

    @Override // al.a
    public final al.j getAnnotations() {
        return j.a(M());
    }

    public final int hashCode() {
        int iHashCode;
        int i10 = this.f48488a;
        if (i10 != 0) {
            return i10;
        }
        if (c.j(this)) {
            iHashCode = super.hashCode();
        } else {
            iHashCode = (Q() ? 1 : 0) + ((t().hashCode() + (P().hashCode() * 31)) * 31);
        }
        this.f48488a = iHashCode;
        return iHashCode;
    }

    public abstract List t();
}
