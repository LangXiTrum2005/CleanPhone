package tk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class x0 extends kotlin.jvm.internal.o implements jk.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f51089e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ y0 f51090f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x0(y0 y0Var, int i10) {
        super(0);
        this.f51089e = i10;
        this.f51090f = y0Var;
    }

    @Override // jk.a
    public final Object invoke() {
        switch (this.f51089e) {
            case 0:
                return new w0(this.f51090f);
            default:
                return this.f51090f.k();
        }
    }
}
