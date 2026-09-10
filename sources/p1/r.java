package p1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements l1.k, z8.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f48148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f48149c;

    public /* synthetic */ r(int i10, i1.j0 j0Var, i1.j0 j0Var2) {
        this.f48147a = i10;
        this.f48148b = j0Var;
        this.f48149c = j0Var2;
    }

    @Override // z8.b
    public Object execute() {
        com.google.android.gms.internal.consent_sdk.d dVar = (com.google.android.gms.internal.consent_sdk.d) this.f48148b;
        ((r1.s) dVar.f22984d).m((r8.i) this.f48149c, this.f48147a + 1, false);
        return null;
    }

    @Override // l1.k
    public void invoke(Object obj) {
        i1.j0 j0Var = (i1.j0) this.f48148b;
        i1.j0 j0Var2 = (i1.j0) this.f48149c;
        i1.i0 i0Var = (i1.i0) obj;
        i0Var.getClass();
        i0Var.n(this.f48147a, j0Var, j0Var2);
    }

    public /* synthetic */ r(com.google.android.gms.internal.consent_sdk.d dVar, r8.i iVar, int i10) {
        this.f48148b = dVar;
        this.f48149c = iVar;
        this.f48147a = i10;
    }
}
