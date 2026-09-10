package tl;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class m0 extends zl.i implements zl.u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f51355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public n0 f51356c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public q0 f51357d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f51358e;

    public static m0 f() {
        m0 m0Var = new m0();
        m0Var.f51356c = n0.INV;
        m0Var.f51357d = q0.f51409t;
        return m0Var;
    }

    @Override // zl.i
    public final zl.a a() {
        o0 o0VarE = e();
        if (o0VarE.isInitialized()) {
            return o0VarE;
        }
        throw new aa.b();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // zl.i
    public final zl.i b(zl.e eVar, zl.g gVar) throws Throwable {
        o0 o0Var = null;
        try {
            try {
                o0.f51377i.getClass();
                g(new o0(eVar, gVar));
                return this;
            } catch (zl.q e10) {
                o0 o0Var2 = (o0) e10.f55076a;
                try {
                    throw e10;
                } catch (Throwable th2) {
                    th = th2;
                    o0Var = o0Var2;
                    if (o0Var != null) {
                        g(o0Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            if (o0Var != null) {
                g(o0Var);
            }
            throw th;
        }
    }

    @Override // zl.i
    public final /* bridge */ /* synthetic */ zl.i c(zl.n nVar) {
        g((o0) nVar);
        return this;
    }

    public final Object clone() {
        m0 m0VarF = f();
        m0VarF.g(e());
        return m0VarF;
    }

    public final o0 e() {
        o0 o0Var = new o0(this);
        int i10 = this.f51355b;
        int i11 = (i10 & 1) != 1 ? 0 : 1;
        o0Var.f51380c = this.f51356c;
        if ((i10 & 2) == 2) {
            i11 |= 2;
        }
        o0Var.f51381d = this.f51357d;
        if ((i10 & 4) == 4) {
            i11 |= 4;
        }
        o0Var.f51382e = this.f51358e;
        o0Var.f51379b = i11;
        return o0Var;
    }

    public final void g(o0 o0Var) {
        q0 q0Var;
        if (o0Var == o0.f51376h) {
            return;
        }
        if ((o0Var.f51379b & 1) == 1) {
            n0 n0Var = o0Var.f51380c;
            n0Var.getClass();
            this.f51355b = 1 | this.f51355b;
            this.f51356c = n0Var;
        }
        if ((o0Var.f51379b & 2) == 2) {
            q0 q0Var2 = o0Var.f51381d;
            if ((this.f51355b & 2) != 2 || (q0Var = this.f51357d) == q0.f51409t) {
                this.f51357d = q0Var2;
            } else {
                p0 p0VarU = q0.u(q0Var);
                p0VarU.g(q0Var2);
                this.f51357d = p0VarU.e();
            }
            this.f51355b |= 2;
        }
        if ((o0Var.f51379b & 4) == 4) {
            int i10 = o0Var.f51382e;
            this.f51355b = 4 | this.f51355b;
            this.f51358e = i10;
        }
        this.f55044a = this.f55044a.h(o0Var.f51378a);
    }
}
