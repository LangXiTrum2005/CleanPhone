package pm;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class b0 extends p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f48413c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(c0 c0Var, int i10) {
        super(c0Var);
        this.f48413c = i10;
    }

    @Override // pm.o
    public final o D0(c0 c0Var) {
        switch (this.f48413c) {
            case 0:
                return new b0(c0Var, 0);
            default:
                return new b0(c0Var, 1);
        }
    }

    @Override // pm.o, pm.y
    public final boolean Q() {
        switch (this.f48413c) {
            case 0:
                return false;
            default:
                return true;
        }
    }
}
