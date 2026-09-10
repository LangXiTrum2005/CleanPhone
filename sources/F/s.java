package f;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements androidx.lifecycle.t, AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f40250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.o f40251b;

    public s(n nVar, t tVar, androidx.lifecycle.o oVar) {
        this.f40250a = nVar;
        this.f40251b = oVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f40251b.b(this);
    }

    @Override // androidx.lifecycle.t
    public final void onStateChanged(androidx.lifecycle.v vVar, androidx.lifecycle.m mVar) {
        androidx.lifecycle.m mVar2 = androidx.lifecycle.m.ON_START;
        n nVar = this.f40250a;
        if (mVar == mVar2) {
            nVar.c(true);
        } else if (mVar == androidx.lifecycle.m.ON_STOP) {
            nVar.c(false);
        }
        if (mVar == androidx.lifecycle.m.ON_DESTROY) {
            nVar.a();
            this.f40251b.b(this);
        }
    }
}
