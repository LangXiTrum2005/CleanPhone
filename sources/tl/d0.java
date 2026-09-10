package tl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class d0 extends zl.j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f51179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public l0 f51180e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public k0 f51181f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c0 f51182g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List f51183h;

    public static d0 f() {
        d0 d0Var = new d0();
        d0Var.f51180e = l0.f51346e;
        d0Var.f51181f = k0.f51331e;
        d0Var.f51182g = c0.f51142k;
        d0Var.f51183h = Collections.EMPTY_LIST;
        return d0Var;
    }

    @Override // zl.i
    public final zl.a a() {
        e0 e0VarE = e();
        if (e0VarE.isInitialized()) {
            return e0VarE;
        }
        throw new aa.b();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // zl.i
    public final zl.i b(zl.e eVar, zl.g gVar) throws Throwable {
        e0 e0Var = null;
        try {
            try {
                e0.f51199k.getClass();
                g(new e0(eVar, gVar));
                return this;
            } catch (zl.q e10) {
                e0 e0Var2 = (e0) e10.f55076a;
                try {
                    throw e10;
                } catch (Throwable th2) {
                    th = th2;
                    e0Var = e0Var2;
                    if (e0Var != null) {
                        g(e0Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            if (e0Var != null) {
                g(e0Var);
            }
            throw th;
        }
    }

    @Override // zl.i
    public final /* bridge */ /* synthetic */ zl.i c(zl.n nVar) {
        g((e0) nVar);
        return this;
    }

    public final Object clone() {
        d0 d0VarF = f();
        d0VarF.g(e());
        return d0VarF;
    }

    public final e0 e() {
        e0 e0Var = new e0(this);
        int i10 = this.f51179d;
        int i11 = (i10 & 1) != 1 ? 0 : 1;
        e0Var.f51202d = this.f51180e;
        if ((i10 & 2) == 2) {
            i11 |= 2;
        }
        e0Var.f51203e = this.f51181f;
        if ((i10 & 4) == 4) {
            i11 |= 4;
        }
        e0Var.f51204f = this.f51182g;
        if ((i10 & 8) == 8) {
            this.f51183h = Collections.unmodifiableList(this.f51183h);
            this.f51179d &= -9;
        }
        e0Var.f51205g = this.f51183h;
        e0Var.f51201c = i11;
        return e0Var;
    }

    public final void g(e0 e0Var) {
        c0 c0Var;
        k0 k0Var;
        l0 l0Var;
        if (e0Var == e0.f51198j) {
            return;
        }
        if ((e0Var.f51201c & 1) == 1) {
            l0 l0Var2 = e0Var.f51202d;
            if ((this.f51179d & 1) != 1 || (l0Var = this.f51180e) == l0.f51346e) {
                this.f51180e = l0Var2;
            } else {
                m mVar = new m(3);
                mVar.f51354d = zl.r.f55077b;
                mVar.l(l0Var);
                mVar.l(l0Var2);
                this.f51180e = mVar.g();
            }
            this.f51179d |= 1;
        }
        if ((e0Var.f51201c & 2) == 2) {
            k0 k0Var2 = e0Var.f51203e;
            if ((this.f51179d & 2) != 2 || (k0Var = this.f51181f) == k0.f51331e) {
                this.f51181f = k0Var2;
            } else {
                m mVar2 = new m(1);
                mVar2.f51354d = Collections.EMPTY_LIST;
                mVar2.k(k0Var);
                mVar2.k(k0Var2);
                this.f51181f = mVar2.f();
            }
            this.f51179d |= 2;
        }
        if ((e0Var.f51201c & 4) == 4) {
            c0 c0Var2 = e0Var.f51204f;
            if ((this.f51179d & 4) != 4 || (c0Var = this.f51182g) == c0.f51142k) {
                this.f51182g = c0Var2;
            } else {
                b0 b0VarF = b0.f();
                b0VarF.g(c0Var);
                b0VarF.g(c0Var2);
                this.f51182g = b0VarF.e();
            }
            this.f51179d |= 4;
        }
        if (!e0Var.f51205g.isEmpty()) {
            if (this.f51183h.isEmpty()) {
                this.f51183h = e0Var.f51205g;
                this.f51179d &= -9;
            } else {
                if ((this.f51179d & 8) != 8) {
                    this.f51183h = new ArrayList(this.f51183h);
                    this.f51179d |= 8;
                }
                this.f51183h.addAll(e0Var.f51205g);
            }
        }
        d(e0Var);
        this.f55044a = this.f55044a.h(e0Var.f51200b);
    }
}
