package il;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final s f43105d = new s(c0.STRICT, 6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f43106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wj.c f43107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c0 f43108c;

    public s(c0 c0Var, wj.c cVar, c0 c0Var2) {
        this.f43106a = c0Var;
        this.f43107b = cVar;
        this.f43108c = c0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f43106a == sVar.f43106a && kotlin.jvm.internal.n.a(this.f43107b, sVar.f43107b) && this.f43108c == sVar.f43108c;
    }

    public final int hashCode() {
        int iHashCode = this.f43106a.hashCode() * 31;
        wj.c cVar = this.f43107b;
        return this.f43108c.hashCode() + ((iHashCode + (cVar == null ? 0 : cVar.f53279d)) * 31);
    }

    public final String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.f43106a + ", sinceVersion=" + this.f43107b + ", reportLevelAfter=" + this.f43108c + ')';
    }

    public s(c0 c0Var, int i10) {
        this(c0Var, (i10 & 2) != 0 ? new wj.c(1, 0, 0) : null, c0Var);
    }
}
