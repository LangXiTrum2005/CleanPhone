package tk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class d1 extends kotlin.jvm.internal.o implements jk.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f50961e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e1 f50962f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d1(e1 e1Var, int i10) {
        super(0);
        this.f50961e = i10;
        this.f50962f = e1Var;
    }

    @Override // jk.a
    public final Object invoke() {
        switch (this.f50961e) {
            case 0:
                return q1.a(this.f50962f, true);
            default:
                e1 e1Var = this.f50962f;
                cl.o0 getter = e1Var.l().h().getGetter();
                return getter == null ? bm.m.f(e1Var.l().h(), al.i.f3645a) : getter;
        }
    }
}
