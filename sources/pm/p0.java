package pm;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zk.m0 f48466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nl.a f48467b;

    public p0(zk.m0 typeParameter, nl.a typeAttr) {
        kotlin.jvm.internal.n.f(typeParameter, "typeParameter");
        kotlin.jvm.internal.n.f(typeAttr, "typeAttr");
        this.f48466a = typeParameter;
        this.f48467b = typeAttr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return kotlin.jvm.internal.n.a(p0Var.f48466a, this.f48466a) && kotlin.jvm.internal.n.a(p0Var.f48467b, this.f48467b);
    }

    public final int hashCode() {
        int iHashCode = this.f48466a.hashCode();
        return this.f48467b.hashCode() + (iHashCode * 31) + iHashCode;
    }

    public final String toString() {
        return "DataToEraseUpperBound(typeParameter=" + this.f48466a + ", typeAttr=" + this.f48467b + ')';
    }
}
