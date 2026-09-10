package tk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class l0 extends kotlin.jvm.internal.o implements jk.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f51008e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q0 f51009f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(q0 q0Var, int i10) {
        super(0);
        this.f51008e = i10;
        this.f51009f = q0Var;
    }

    @Override // jk.a
    public final Object invoke() {
        switch (this.f51008e) {
            case 0:
                return qk.i0.m(this.f51009f.f51044b);
            default:
                return new o0(this.f51009f);
        }
    }
}
