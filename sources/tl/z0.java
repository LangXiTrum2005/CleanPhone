package tl;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class z0 extends zl.i implements zl.u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f51581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f51582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f51583d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a1 f51584e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f51585f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f51586g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b1 f51587h;

    public static z0 f() {
        z0 z0Var = new z0();
        z0Var.f51584e = a1.ERROR;
        z0Var.f51587h = b1.LANGUAGE_VERSION;
        return z0Var;
    }

    @Override // zl.i
    public final zl.a a() {
        c1 c1VarE = e();
        c1VarE.isInitialized();
        return c1VarE;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // zl.i
    public final zl.i b(zl.e eVar, zl.g gVar) throws Throwable {
        c1 c1Var = null;
        try {
            try {
                c1.l.getClass();
                g(new c1(eVar));
                return this;
            } catch (zl.q e10) {
                c1 c1Var2 = (c1) e10.f55076a;
                try {
                    throw e10;
                } catch (Throwable th2) {
                    th = th2;
                    c1Var = c1Var2;
                    if (c1Var != null) {
                        g(c1Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            if (c1Var != null) {
                g(c1Var);
            }
            throw th;
        }
    }

    @Override // zl.i
    public final /* bridge */ /* synthetic */ zl.i c(zl.n nVar) {
        g((c1) nVar);
        return this;
    }

    public final Object clone() {
        z0 z0VarF = f();
        z0VarF.g(e());
        return z0VarF;
    }

    public final c1 e() {
        c1 c1Var = new c1(this);
        int i10 = this.f51581b;
        int i11 = (i10 & 1) != 1 ? 0 : 1;
        c1Var.f51155c = this.f51582c;
        if ((i10 & 2) == 2) {
            i11 |= 2;
        }
        c1Var.f51156d = this.f51583d;
        if ((i10 & 4) == 4) {
            i11 |= 4;
        }
        c1Var.f51157e = this.f51584e;
        if ((i10 & 8) == 8) {
            i11 |= 8;
        }
        c1Var.f51158f = this.f51585f;
        if ((i10 & 16) == 16) {
            i11 |= 16;
        }
        c1Var.f51159g = this.f51586g;
        if ((i10 & 32) == 32) {
            i11 |= 32;
        }
        c1Var.f51160h = this.f51587h;
        c1Var.f51154b = i11;
        return c1Var;
    }

    public final void g(c1 c1Var) {
        if (c1Var == c1.f51152k) {
            return;
        }
        int i10 = c1Var.f51154b;
        if ((i10 & 1) == 1) {
            int i11 = c1Var.f51155c;
            this.f51581b = 1 | this.f51581b;
            this.f51582c = i11;
        }
        if ((i10 & 2) == 2) {
            int i12 = c1Var.f51156d;
            this.f51581b = 2 | this.f51581b;
            this.f51583d = i12;
        }
        if ((i10 & 4) == 4) {
            a1 a1Var = c1Var.f51157e;
            a1Var.getClass();
            this.f51581b = 4 | this.f51581b;
            this.f51584e = a1Var;
        }
        int i13 = c1Var.f51154b;
        if ((i13 & 8) == 8) {
            int i14 = c1Var.f51158f;
            this.f51581b = 8 | this.f51581b;
            this.f51585f = i14;
        }
        if ((i13 & 16) == 16) {
            int i15 = c1Var.f51159g;
            this.f51581b = 16 | this.f51581b;
            this.f51586g = i15;
        }
        if ((i13 & 32) == 32) {
            b1 b1Var = c1Var.f51160h;
            b1Var.getClass();
            this.f51581b = 32 | this.f51581b;
            this.f51587h = b1Var;
        }
        this.f55044a = this.f55044a.h(c1Var.f51153a);
    }
}
