package pm;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class z extends kotlin.jvm.internal.o implements jk.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f48493e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n0 f48494f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ List f48495g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(im.n nVar, List list, j0 j0Var, n0 n0Var, boolean z10) {
        super(1);
        this.f48494f = n0Var;
        this.f48495g = list;
    }

    @Override // jk.b
    public final Object invoke(Object obj) {
        switch (this.f48493e) {
            case 0:
                qm.f refiner = (qm.f) obj;
                kotlin.jvm.internal.n.f(refiner, "refiner");
                this.f48494f.e();
                break;
            default:
                qm.f kotlinTypeRefiner = (qm.f) obj;
                kotlin.jvm.internal.n.f(kotlinTypeRefiner, "kotlinTypeRefiner");
                this.f48494f.e();
                break;
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(List list, j0 j0Var, n0 n0Var, boolean z10) {
        super(1);
        this.f48494f = n0Var;
        this.f48495g = list;
    }
}
