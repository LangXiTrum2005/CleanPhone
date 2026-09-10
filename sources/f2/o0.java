package f2;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v0 f40422b;

    public /* synthetic */ o0(v0 v0Var, int i10) {
        this.f40421a = i10;
        this.f40422b = v0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f40421a) {
            case 0:
                this.f40422b.J = true;
                break;
            case 1:
                this.f40422b.o();
                break;
            default:
                v0 v0Var = this.f40422b;
                if (!v0Var.P) {
                    z zVar = v0Var.f40490r;
                    zVar.getClass();
                    zVar.h(v0Var);
                }
                break;
        }
    }
}
