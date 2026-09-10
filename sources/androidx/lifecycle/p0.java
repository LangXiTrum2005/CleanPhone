package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o0 f4582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4583c;

    public p0(String str, o0 o0Var) {
        this.f4581a = str;
        this.f4582b = o0Var;
    }

    public final void b(o lifecycle, j4.e registry) {
        kotlin.jvm.internal.n.f(registry, "registry");
        kotlin.jvm.internal.n.f(lifecycle, "lifecycle");
        if (this.f4583c) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f4583c = true;
        lifecycle.a(this);
        registry.c(this.f4581a, this.f4582b.f4577e);
    }

    @Override // androidx.lifecycle.t
    public final void onStateChanged(v vVar, m mVar) {
        if (mVar == m.ON_DESTROY) {
            this.f4583c = false;
            vVar.getLifecycle().b(this);
        }
    }
}
