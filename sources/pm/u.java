package pm;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class u extends t0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zk.m0[] f48477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q0[] f48478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f48479d;

    public u(zk.m0[] parameters, q0[] arguments, boolean z10) {
        kotlin.jvm.internal.n.f(parameters, "parameters");
        kotlin.jvm.internal.n.f(arguments, "arguments");
        this.f48477b = parameters;
        this.f48478c = arguments;
        this.f48479d = z10;
    }

    @Override // pm.t0
    public final boolean b() {
        return this.f48479d;
    }

    @Override // pm.t0
    public final q0 d(y yVar) {
        zk.g gVarE = yVar.P().e();
        zk.m0 m0Var = gVarE instanceof zk.m0 ? (zk.m0) gVarE : null;
        if (m0Var != null) {
            int index = m0Var.getIndex();
            zk.m0[] m0VarArr = this.f48477b;
            if (index < m0VarArr.length && kotlin.jvm.internal.n.a(m0VarArr[index].n(), m0Var.n())) {
                return this.f48478c[index];
            }
        }
        return null;
    }

    @Override // pm.t0
    public final boolean e() {
        return this.f48478c.length == 0;
    }
}
