package ud;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class i0 {
    public static final h0 Companion = new h0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final wj.d[] f52105d = {null, null, r9.b.t(wj.e.f53280a, new defpackage.c(22))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0 f52106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f1 f52107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f52108c;

    public /* synthetic */ i0(int i10, m0 m0Var, f1 f1Var, Map map) {
        if (1 != (i10 & 1)) {
            rn.k.a(i10, 1, g0.f52079a.d());
            throw null;
        }
        this.f52106a = m0Var;
        if ((i10 & 2) == 0) {
            this.f52107b = null;
        } else {
            this.f52107b = f1Var;
        }
        if ((i10 & 4) == 0) {
            this.f52108c = null;
        } else {
            this.f52108c = map;
        }
    }

    public static i0 a(i0 i0Var, m0 sessionDetails, f1 f1Var, Map map, int i10) {
        if ((i10 & 1) != 0) {
            sessionDetails = i0Var.f52106a;
        }
        if ((i10 & 2) != 0) {
            f1Var = i0Var.f52107b;
        }
        if ((i10 & 4) != 0) {
            map = i0Var.f52108c;
        }
        i0Var.getClass();
        kotlin.jvm.internal.n.f(sessionDetails, "sessionDetails");
        return new i0(sessionDetails, f1Var, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return kotlin.jvm.internal.n.a(this.f52106a, i0Var.f52106a) && kotlin.jvm.internal.n.a(this.f52107b, i0Var.f52107b) && kotlin.jvm.internal.n.a(this.f52108c, i0Var.f52108c);
    }

    public final int hashCode() {
        int iHashCode = this.f52106a.hashCode() * 31;
        f1 f1Var = this.f52107b;
        int iHashCode2 = (iHashCode + (f1Var == null ? 0 : Long.hashCode(f1Var.f52072a))) * 31;
        Map map = this.f52108c;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "SessionData(sessionDetails=" + this.f52106a + ", backgroundTime=" + this.f52107b + ", processDataMap=" + this.f52108c + ')';
    }

    public i0(m0 sessionDetails, f1 f1Var, Map map) {
        kotlin.jvm.internal.n.f(sessionDetails, "sessionDetails");
        this.f52106a = sessionDetails;
        this.f52107b = f1Var;
        this.f52108c = map;
    }
}
