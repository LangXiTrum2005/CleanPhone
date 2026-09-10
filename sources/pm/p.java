package pm;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class p extends o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f48465b;

    public p(c0 c0Var) {
        this.f48465b = c0Var;
    }

    @Override // pm.c0
    /* JADX INFO: renamed from: A0 */
    public final c0 m0(j0 newAttributes) {
        kotlin.jvm.internal.n.f(newAttributes, "newAttributes");
        return newAttributes != M() ? new e0(this, newAttributes) : this;
    }

    @Override // pm.o
    public final c0 B0() {
        return this.f48465b;
    }

    @Override // pm.c0
    /* JADX INFO: renamed from: z0 */
    public final c0 i0(boolean z10) {
        return z10 == Q() ? this : this.f48465b.i0(z10).m0(M());
    }
}
