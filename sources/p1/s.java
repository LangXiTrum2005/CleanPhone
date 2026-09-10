package p1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s implements l1.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48155a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i1.z0 f48156b;

    public /* synthetic */ s(i1.z0 z0Var) {
        this.f48156b = z0Var;
    }

    @Override // l1.k
    public final void invoke(Object obj) {
        switch (this.f48155a) {
            case 0:
                ((i1.i0) obj).a(this.f48156b);
                break;
            default:
                q1.i iVar = (q1.i) ((q1.b) obj);
                b2.p pVar = iVar.f48568p;
                i1.z0 z0Var = this.f48156b;
                if (pVar != null) {
                    i1.p pVar2 = (i1.p) pVar.f5364c;
                    if (pVar2.f42651v == -1) {
                        i1.o oVarA = pVar2.a();
                        oVarA.f42607t = z0Var.f42723a;
                        oVarA.f42608u = z0Var.f42724b;
                        i1.p pVar3 = new i1.p(oVarA);
                        iVar.f48568p = new b2.p((String) pVar.f5365d, pVar.f5363b, 11, pVar3);
                    }
                }
                int i10 = z0Var.f42723a;
                break;
        }
    }

    public /* synthetic */ s(q1.a aVar, i1.z0 z0Var) {
        this.f48156b = z0Var;
    }
}
