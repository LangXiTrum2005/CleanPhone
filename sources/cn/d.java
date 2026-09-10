package cn;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c[] f6687a;

    public d(c[] cVarArr) {
        this.f6687a = cVarArr;
    }

    @Override // cn.i
    public final void a(Throwable th2) {
        b();
    }

    public final void b() {
        for (c cVar : this.f6687a) {
            p0 p0Var = cVar.f6681f;
            if (p0Var == null) {
                kotlin.jvm.internal.n.l("handle");
                throw null;
            }
            p0Var.dispose();
        }
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.f6687a + ']';
    }
}
