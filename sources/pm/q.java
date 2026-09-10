package pm;

import com.ironsource.X3;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class q extends t0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t0 f48468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t0 f48469c;

    public q(t0 t0Var, t0 t0Var2) {
        this.f48468b = t0Var;
        this.f48469c = t0Var2;
    }

    @Override // pm.t0
    public final boolean a() {
        return this.f48468b.a() || this.f48469c.a();
    }

    @Override // pm.t0
    public final boolean b() {
        return this.f48468b.b() || this.f48469c.b();
    }

    @Override // pm.t0
    public final al.j c(al.j annotations) {
        kotlin.jvm.internal.n.f(annotations, "annotations");
        return this.f48469c.c(this.f48468b.c(annotations));
    }

    @Override // pm.t0
    public final q0 d(y yVar) {
        q0 q0VarD = this.f48468b.d(yVar);
        return q0VarD == null ? this.f48469c.d(yVar) : q0VarD;
    }

    @Override // pm.t0
    public final y f(int i10, y topLevelType) {
        kotlin.jvm.internal.n.f(topLevelType, "topLevelType");
        d5.u.n(i10, X3.i.L);
        return this.f48469c.f(i10, this.f48468b.f(i10, topLevelType));
    }
}
