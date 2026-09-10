package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends d0 implements t {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v f4530e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e0 f4531f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(e0 e0Var, v vVar, g0 g0Var) {
        super(e0Var, g0Var);
        this.f4531f = e0Var;
        this.f4530e = vVar;
    }

    @Override // androidx.lifecycle.d0
    public final void c() {
        this.f4530e.getLifecycle().b(this);
    }

    @Override // androidx.lifecycle.d0
    public final boolean e(v vVar) {
        return this.f4530e == vVar;
    }

    @Override // androidx.lifecycle.d0
    public final boolean f() {
        return ((x) this.f4530e.getLifecycle()).f4609d.compareTo(n.f4567d) >= 0;
    }

    @Override // androidx.lifecycle.t
    public final void onStateChanged(v vVar, m mVar) {
        v vVar2 = this.f4530e;
        n nVar = ((x) vVar2.getLifecycle()).f4609d;
        if (nVar == n.f4564a) {
            this.f4531f.i(this.f4536a);
            return;
        }
        n nVar2 = null;
        while (nVar2 != nVar) {
            b(f());
            nVar2 = nVar;
            nVar = ((x) vVar2.getLifecycle()).f4609d;
        }
    }
}
