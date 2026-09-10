package tk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class u0 extends kotlin.jvm.internal.o implements jk.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f51067e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v0 f51068f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(v0 v0Var, int i10) {
        super(0);
        this.f51067e = i10;
        this.f51068f = v0Var;
    }

    @Override // jk.a
    public final Object invoke() {
        switch (this.f51067e) {
            case 0:
                return new t0(this.f51068f);
            default:
                v0 v0Var = this.f51068f;
                return v0Var.l(v0Var.k(), null);
        }
    }
}
