package f2;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m1 extends l {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a f40407k;

    public m1(a aVar) {
        this.f40407k = aVar;
    }

    @Override // f2.l
    public final void A(Object obj, a aVar, i1.p0 p0Var) {
        D(p0Var);
    }

    public abstract void D(i1.p0 p0Var);

    public final void E() {
        B(null, this.f40407k);
    }

    public void F() {
        E();
    }

    @Override // f2.a
    public final i1.p0 i() {
        return this.f40407k.i();
    }

    @Override // f2.a
    public final i1.y k() {
        return this.f40407k.k();
    }

    @Override // f2.a
    public final boolean l() {
        return this.f40407k.l();
    }

    @Override // f2.a
    public final void p(n1.z zVar) {
        this.f40391j = zVar;
        this.f40390i = l1.y.q(null);
        F();
    }

    @Override // f2.a
    public void w(i1.y yVar) {
        this.f40407k.w(yVar);
    }

    @Override // f2.l
    public final c0 x(Object obj, c0 c0Var) {
        return C(c0Var);
    }

    @Override // f2.l
    public final long y(Object obj, long j10) {
        return j10;
    }

    @Override // f2.l
    public final int z(Object obj, int i10) {
        return i10;
    }

    public c0 C(c0 c0Var) {
        return c0Var;
    }
}
