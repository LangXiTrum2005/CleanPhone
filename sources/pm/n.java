package pm;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class n extends o implements l, sm.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f48462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f48463c;

    public n(c0 c0Var, boolean z10) {
        this.f48462b = c0Var;
        this.f48463c = z10;
    }

    @Override // pm.c0
    /* JADX INFO: renamed from: A0 */
    public final c0 m0(j0 newAttributes) {
        kotlin.jvm.internal.n.f(newAttributes, "newAttributes");
        return new n(this.f48462b.m0(newAttributes), this.f48463c);
    }

    @Override // pm.o
    public final c0 B0() {
        return this.f48462b;
    }

    @Override // pm.o
    public final o D0(c0 c0Var) {
        return new n(c0Var, this.f48463c);
    }

    @Override // pm.o, pm.y
    public final boolean Q() {
        return false;
    }

    @Override // pm.l
    public final a1 o(y replacement) {
        kotlin.jvm.internal.n.f(replacement, "replacement");
        return c.m(replacement.b0(), this.f48463c);
    }

    @Override // pm.l
    public final boolean s() {
        c0 c0Var = this.f48462b;
        c0Var.P();
        return c0Var.P().e() instanceof zk.m0;
    }

    @Override // pm.c0
    public final String toString() {
        return this.f48462b + " & Any";
    }

    @Override // pm.c0
    /* JADX INFO: renamed from: z0 */
    public final c0 i0(boolean z10) {
        return z10 ? this.f48462b.i0(z10) : this;
    }
}
