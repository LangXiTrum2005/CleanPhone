package tk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a1 extends kotlin.jvm.internal.o implements jk.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f50943e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b1 f50944f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a1(b1 b1Var, int i10) {
        super(0);
        this.f50943e = i10;
        this.f50944f = b1Var;
    }

    @Override // jk.a
    public final Object invoke() {
        switch (this.f50943e) {
            case 0:
                return new z0(this.f50944f);
            default:
                return this.f50944f.k();
        }
    }
}
