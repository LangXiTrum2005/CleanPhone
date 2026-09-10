package pm;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class e0 extends p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j0 f48427c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(c0 c0Var, j0 attributes) {
        super(c0Var);
        kotlin.jvm.internal.n.f(attributes, "attributes");
        this.f48427c = attributes;
    }

    @Override // pm.o
    public final o D0(c0 c0Var) {
        return new e0(c0Var, this.f48427c);
    }

    @Override // pm.o, pm.y
    public final j0 M() {
        return this.f48427c;
    }
}
