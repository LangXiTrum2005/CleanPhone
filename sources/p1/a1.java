package p1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a1 extends f2.s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i1.o0 f47925c;

    public a1(i1.p0 p0Var) {
        super(p0Var);
        this.f47925c = new i1.o0();
    }

    @Override // f2.s, i1.p0
    public final i1.n0 f(int i10, i1.n0 n0Var, boolean z10) {
        i1.p0 p0Var = this.f40443b;
        i1.n0 n0VarF = p0Var.f(i10, n0Var, z10);
        if (p0Var.m(n0VarF.f42584c, this.f47925c, 0L).a()) {
            n0VarF.h(n0Var.f42582a, n0Var.f42583b, n0Var.f42584c, n0Var.f42585d, n0Var.f42586e, i1.c.f42523c, true);
            return n0VarF;
        }
        n0VarF.f42587f = true;
        return n0VarF;
    }
}
