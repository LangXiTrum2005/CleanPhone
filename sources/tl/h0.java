package tl;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class h0 extends zl.i implements zl.u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f51278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f51279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f51280d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public i0 f51281e;

    public static h0 f() {
        h0 h0Var = new h0();
        h0Var.f51279c = -1;
        h0Var.f51281e = i0.PACKAGE;
        return h0Var;
    }

    @Override // zl.i
    public final zl.a a() {
        j0 j0VarE = e();
        if (j0VarE.isInitialized()) {
            return j0VarE;
        }
        throw new aa.b();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // zl.i
    public final zl.i b(zl.e eVar, zl.g gVar) throws Throwable {
        j0 j0Var = null;
        try {
            try {
                j0.f51319i.getClass();
                g(new j0(eVar));
                return this;
            } catch (zl.q e10) {
                j0 j0Var2 = (j0) e10.f55076a;
                try {
                    throw e10;
                } catch (Throwable th2) {
                    th = th2;
                    j0Var = j0Var2;
                    if (j0Var != null) {
                        g(j0Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            if (j0Var != null) {
                g(j0Var);
            }
            throw th;
        }
    }

    @Override // zl.i
    public final /* bridge */ /* synthetic */ zl.i c(zl.n nVar) {
        g((j0) nVar);
        return this;
    }

    public final Object clone() {
        h0 h0VarF = f();
        h0VarF.g(e());
        return h0VarF;
    }

    public final j0 e() {
        j0 j0Var = new j0(this);
        int i10 = this.f51278b;
        int i11 = (i10 & 1) != 1 ? 0 : 1;
        j0Var.f51322c = this.f51279c;
        if ((i10 & 2) == 2) {
            i11 |= 2;
        }
        j0Var.f51323d = this.f51280d;
        if ((i10 & 4) == 4) {
            i11 |= 4;
        }
        j0Var.f51324e = this.f51281e;
        j0Var.f51321b = i11;
        return j0Var;
    }

    public final void g(j0 j0Var) {
        if (j0Var == j0.f51318h) {
            return;
        }
        int i10 = j0Var.f51321b;
        if ((i10 & 1) == 1) {
            int i11 = j0Var.f51322c;
            this.f51278b = 1 | this.f51278b;
            this.f51279c = i11;
        }
        if ((i10 & 2) == 2) {
            int i12 = j0Var.f51323d;
            this.f51278b = 2 | this.f51278b;
            this.f51280d = i12;
        }
        if ((i10 & 4) == 4) {
            i0 i0Var = j0Var.f51324e;
            i0Var.getClass();
            this.f51278b = 4 | this.f51278b;
            this.f51281e = i0Var;
        }
        this.f55044a = this.f55044a.h(j0Var.f51320a);
    }
}
