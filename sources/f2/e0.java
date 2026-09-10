package f2;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e0 implements l1.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i0 f40324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f40325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c2.g f40326c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f40327d;

    public /* synthetic */ e0(i0 i0Var, u uVar, c2.g gVar, int i10) {
        this.f40324a = i0Var;
        this.f40325b = uVar;
        this.f40326c = gVar;
        this.f40327d = i10;
    }

    @Override // l1.g
    public final void accept(Object obj) {
        j0 j0Var = (j0) obj;
        i0 i0Var = this.f40324a;
        j0Var.z(i0Var.f40369a, i0Var.f40370b, this.f40325b, this.f40326c, this.f40327d);
    }
}
