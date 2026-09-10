package fn;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class s0 implements cn.p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u0 f41147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f41148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f41149c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final cn.l f41150d;

    public s0(u0 u0Var, long j10, Object obj, cn.l lVar) {
        this.f41147a = u0Var;
        this.f41148b = j10;
        this.f41149c = obj;
        this.f41150d = lVar;
    }

    @Override // cn.p0
    public final void dispose() {
        u0 u0Var = this.f41147a;
        synchronized (u0Var) {
            if (this.f41148b >= u0Var.i0()) {
                Object[] objArr = u0Var.f41168g;
                kotlin.jvm.internal.n.c(objArr);
                long j10 = this.f41148b;
                if (objArr[((int) j10) & (objArr.length - 1)] == this) {
                    g.f(objArr, j10, g.f41070a);
                    u0Var.d0();
                }
            }
        }
    }
}
