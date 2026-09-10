package tk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class f1 extends kotlin.jvm.internal.o implements jk.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f50974e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g1 f50975f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f1(g1 g1Var, int i10) {
        super(0);
        this.f50974e = i10;
        this.f50975f = g1Var;
    }

    @Override // jk.a
    public final Object invoke() {
        switch (this.f50974e) {
            case 0:
                return q1.a(this.f50975f, false);
            default:
                g1 g1Var = this.f50975f;
                cl.p0 setter = g1Var.l().h().getSetter();
                return setter == null ? bm.m.g(g1Var.l().h(), al.i.f3645a) : setter;
        }
    }
}
