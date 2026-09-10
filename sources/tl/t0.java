package tl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class t0 extends zl.j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f51470d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f51471e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f51472f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f51473g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public u0 f51474h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List f51475i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List f51476j;

    public static t0 f() {
        t0 t0Var = new t0();
        t0Var.f51474h = u0.INV;
        List list = Collections.EMPTY_LIST;
        t0Var.f51475i = list;
        t0Var.f51476j = list;
        return t0Var;
    }

    @Override // zl.i
    public final zl.a a() {
        v0 v0VarE = e();
        if (v0VarE.isInitialized()) {
            return v0VarE;
        }
        throw new aa.b();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // zl.i
    public final zl.i b(zl.e eVar, zl.g gVar) throws Throwable {
        v0 v0Var = null;
        try {
            try {
                v0.f51496n.getClass();
                g(new v0(eVar, gVar));
                return this;
            } catch (zl.q e10) {
                v0 v0Var2 = (v0) e10.f55076a;
                try {
                    throw e10;
                } catch (Throwable th2) {
                    th = th2;
                    v0Var = v0Var2;
                    if (v0Var != null) {
                        g(v0Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            if (v0Var != null) {
                g(v0Var);
            }
            throw th;
        }
    }

    @Override // zl.i
    public final /* bridge */ /* synthetic */ zl.i c(zl.n nVar) {
        g((v0) nVar);
        return this;
    }

    public final Object clone() {
        t0 t0VarF = f();
        t0VarF.g(e());
        return t0VarF;
    }

    public final v0 e() {
        v0 v0Var = new v0(this);
        int i10 = this.f51470d;
        int i11 = (i10 & 1) != 1 ? 0 : 1;
        v0Var.f51499d = this.f51471e;
        if ((i10 & 2) == 2) {
            i11 |= 2;
        }
        v0Var.f51500e = this.f51472f;
        if ((i10 & 4) == 4) {
            i11 |= 4;
        }
        v0Var.f51501f = this.f51473g;
        if ((i10 & 8) == 8) {
            i11 |= 8;
        }
        v0Var.f51502g = this.f51474h;
        if ((i10 & 16) == 16) {
            this.f51475i = Collections.unmodifiableList(this.f51475i);
            this.f51470d &= -17;
        }
        v0Var.f51503h = this.f51475i;
        if ((this.f51470d & 32) == 32) {
            this.f51476j = Collections.unmodifiableList(this.f51476j);
            this.f51470d &= -33;
        }
        v0Var.f51504i = this.f51476j;
        v0Var.f51498c = i11;
        return v0Var;
    }

    public final void g(v0 v0Var) {
        if (v0Var == v0.f51495m) {
            return;
        }
        int i10 = v0Var.f51498c;
        if ((i10 & 1) == 1) {
            int i11 = v0Var.f51499d;
            this.f51470d = 1 | this.f51470d;
            this.f51471e = i11;
        }
        if ((i10 & 2) == 2) {
            int i12 = v0Var.f51500e;
            this.f51470d = 2 | this.f51470d;
            this.f51472f = i12;
        }
        if ((i10 & 4) == 4) {
            boolean z10 = v0Var.f51501f;
            this.f51470d = 4 | this.f51470d;
            this.f51473g = z10;
        }
        if ((i10 & 8) == 8) {
            u0 u0Var = v0Var.f51502g;
            u0Var.getClass();
            this.f51470d = 8 | this.f51470d;
            this.f51474h = u0Var;
        }
        if (!v0Var.f51503h.isEmpty()) {
            if (this.f51475i.isEmpty()) {
                this.f51475i = v0Var.f51503h;
                this.f51470d &= -17;
            } else {
                if ((this.f51470d & 16) != 16) {
                    this.f51475i = new ArrayList(this.f51475i);
                    this.f51470d |= 16;
                }
                this.f51475i.addAll(v0Var.f51503h);
            }
        }
        if (!v0Var.f51504i.isEmpty()) {
            if (this.f51476j.isEmpty()) {
                this.f51476j = v0Var.f51504i;
                this.f51470d &= -33;
            } else {
                if ((this.f51470d & 32) != 32) {
                    this.f51476j = new ArrayList(this.f51476j);
                    this.f51470d |= 32;
                }
                this.f51476j.addAll(v0Var.f51504i);
            }
        }
        d(v0Var);
        this.f55044a = this.f55044a.h(v0Var.f51497b);
    }
}
