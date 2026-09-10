package f2;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f0 implements l1.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f40333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f40334c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c2.g f40335d;

    public /* synthetic */ f0(i0 i0Var, u uVar, c2.g gVar, int i10) {
        this.f40332a = i10;
        this.f40333b = i0Var;
        this.f40334c = uVar;
        this.f40335d = gVar;
    }

    @Override // l1.g
    public final void accept(Object obj) {
        j0 j0Var = (j0) obj;
        switch (this.f40332a) {
            case 0:
                i0 i0Var = this.f40333b;
                j0Var.l(i0Var.f40369a, i0Var.f40370b, this.f40334c, this.f40335d);
                break;
            default:
                i0 i0Var2 = this.f40333b;
                j0Var.y(i0Var2.f40369a, i0Var2.f40370b, this.f40334c, this.f40335d);
                break;
        }
    }
}
