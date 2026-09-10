package tl;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class x0 extends zl.j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f51541d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f51542e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f51543f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public q0 f51544g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f51545h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public q0 f51546i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f51547j;

    @Override // zl.i
    public final zl.a a() {
        y0 y0VarE = e();
        if (y0VarE.isInitialized()) {
            return y0VarE;
        }
        throw new aa.b();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // zl.i
    public final zl.i b(zl.e eVar, zl.g gVar) throws Throwable {
        y0 y0Var = null;
        try {
            try {
                y0.f51568m.getClass();
                f(new y0(eVar, gVar));
                return this;
            } catch (zl.q e10) {
                y0 y0Var2 = (y0) e10.f55076a;
                try {
                    throw e10;
                } catch (Throwable th2) {
                    th = th2;
                    y0Var = y0Var2;
                    if (y0Var != null) {
                        f(y0Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            if (y0Var != null) {
                f(y0Var);
            }
            throw th;
        }
    }

    @Override // zl.i
    public final /* bridge */ /* synthetic */ zl.i c(zl.n nVar) {
        f((y0) nVar);
        return this;
    }

    public final Object clone() {
        x0 x0Var = new x0();
        q0 q0Var = q0.f51409t;
        x0Var.f51544g = q0Var;
        x0Var.f51546i = q0Var;
        x0Var.f(e());
        return x0Var;
    }

    public final y0 e() {
        y0 y0Var = new y0(this);
        int i10 = this.f51541d;
        int i11 = (i10 & 1) != 1 ? 0 : 1;
        y0Var.f51571d = this.f51542e;
        if ((i10 & 2) == 2) {
            i11 |= 2;
        }
        y0Var.f51572e = this.f51543f;
        if ((i10 & 4) == 4) {
            i11 |= 4;
        }
        y0Var.f51573f = this.f51544g;
        if ((i10 & 8) == 8) {
            i11 |= 8;
        }
        y0Var.f51574g = this.f51545h;
        if ((i10 & 16) == 16) {
            i11 |= 16;
        }
        y0Var.f51575h = this.f51546i;
        if ((i10 & 32) == 32) {
            i11 |= 32;
        }
        y0Var.f51576i = this.f51547j;
        y0Var.f51570c = i11;
        return y0Var;
    }

    public final void f(y0 y0Var) {
        q0 q0Var;
        q0 q0Var2;
        if (y0Var == y0.l) {
            return;
        }
        int i10 = y0Var.f51570c;
        if ((i10 & 1) == 1) {
            int i11 = y0Var.f51571d;
            this.f51541d = 1 | this.f51541d;
            this.f51542e = i11;
        }
        if ((i10 & 2) == 2) {
            int i12 = y0Var.f51572e;
            this.f51541d = 2 | this.f51541d;
            this.f51543f = i12;
        }
        if ((i10 & 4) == 4) {
            q0 q0Var3 = y0Var.f51573f;
            if ((this.f51541d & 4) != 4 || (q0Var2 = this.f51544g) == q0.f51409t) {
                this.f51544g = q0Var3;
            } else {
                p0 p0VarU = q0.u(q0Var2);
                p0VarU.g(q0Var3);
                this.f51544g = p0VarU.e();
            }
            this.f51541d |= 4;
        }
        int i13 = y0Var.f51570c;
        if ((i13 & 8) == 8) {
            int i14 = y0Var.f51574g;
            this.f51541d = 8 | this.f51541d;
            this.f51545h = i14;
        }
        if ((i13 & 16) == 16) {
            q0 q0Var4 = y0Var.f51575h;
            if ((this.f51541d & 16) != 16 || (q0Var = this.f51546i) == q0.f51409t) {
                this.f51546i = q0Var4;
            } else {
                p0 p0VarU2 = q0.u(q0Var);
                p0VarU2.g(q0Var4);
                this.f51546i = p0VarU2.e();
            }
            this.f51541d |= 16;
        }
        if ((y0Var.f51570c & 32) == 32) {
            int i15 = y0Var.f51576i;
            this.f51541d = 32 | this.f51541d;
            this.f51547j = i15;
        }
        d(y0Var);
        this.f55044a = this.f55044a.h(y0Var.f51569b);
    }
}
