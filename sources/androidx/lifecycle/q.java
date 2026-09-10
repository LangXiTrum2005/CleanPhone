package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements t, cn.a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f4584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ak.k f4585b;

    public q(o oVar, ak.k coroutineContext) {
        kotlin.jvm.internal.n.f(coroutineContext, "coroutineContext");
        this.f4584a = oVar;
        this.f4585b = coroutineContext;
        if (((x) oVar).f4609d == n.f4564a) {
            cn.d0.i(coroutineContext, null);
        }
    }

    @Override // cn.a0
    public final ak.k getCoroutineContext() {
        return this.f4585b;
    }

    @Override // androidx.lifecycle.t
    public final void onStateChanged(v vVar, m mVar) {
        o oVar = this.f4584a;
        if (((x) oVar).f4609d.compareTo(n.f4564a) <= 0) {
            oVar.b(this);
            cn.d0.i(this.f4585b, null);
        }
    }
}
