package tl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class b0 extends zl.j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f51117d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f51118e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f51119f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f51120g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public w0 f51121h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public d1 f51122i;

    public static b0 f() {
        b0 b0Var = new b0();
        List list = Collections.EMPTY_LIST;
        b0Var.f51118e = list;
        b0Var.f51119f = list;
        b0Var.f51120g = list;
        b0Var.f51121h = w0.f51519g;
        b0Var.f51122i = d1.f51184e;
        return b0Var;
    }

    @Override // zl.i
    public final zl.a a() {
        c0 c0VarE = e();
        if (c0VarE.isInitialized()) {
            return c0VarE;
        }
        throw new aa.b();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // zl.i
    public final zl.i b(zl.e eVar, zl.g gVar) throws Throwable {
        c0 c0Var = null;
        try {
            try {
                c0.l.getClass();
                g(new c0(eVar, gVar));
                return this;
            } catch (zl.q e10) {
                c0 c0Var2 = (c0) e10.f55076a;
                try {
                    throw e10;
                } catch (Throwable th2) {
                    th = th2;
                    c0Var = c0Var2;
                    if (c0Var != null) {
                        g(c0Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            if (c0Var != null) {
                g(c0Var);
            }
            throw th;
        }
    }

    @Override // zl.i
    public final /* bridge */ /* synthetic */ zl.i c(zl.n nVar) {
        g((c0) nVar);
        return this;
    }

    public final Object clone() {
        b0 b0VarF = f();
        b0VarF.g(e());
        return b0VarF;
    }

    public final c0 e() {
        c0 c0Var = new c0(this);
        int i10 = this.f51117d;
        if ((i10 & 1) == 1) {
            this.f51118e = Collections.unmodifiableList(this.f51118e);
            this.f51117d &= -2;
        }
        c0Var.f51145d = this.f51118e;
        if ((this.f51117d & 2) == 2) {
            this.f51119f = Collections.unmodifiableList(this.f51119f);
            this.f51117d &= -3;
        }
        c0Var.f51146e = this.f51119f;
        if ((this.f51117d & 4) == 4) {
            this.f51120g = Collections.unmodifiableList(this.f51120g);
            this.f51117d &= -5;
        }
        c0Var.f51147f = this.f51120g;
        int i11 = (i10 & 8) != 8 ? 0 : 1;
        c0Var.f51148g = this.f51121h;
        if ((i10 & 16) == 16) {
            i11 |= 2;
        }
        c0Var.f51149h = this.f51122i;
        c0Var.f51144c = i11;
        return c0Var;
    }

    public final void g(c0 c0Var) {
        d1 d1Var;
        w0 w0Var;
        if (c0Var == c0.f51142k) {
            return;
        }
        if (!c0Var.f51145d.isEmpty()) {
            if (this.f51118e.isEmpty()) {
                this.f51118e = c0Var.f51145d;
                this.f51117d &= -2;
            } else {
                if ((this.f51117d & 1) != 1) {
                    this.f51118e = new ArrayList(this.f51118e);
                    this.f51117d |= 1;
                }
                this.f51118e.addAll(c0Var.f51145d);
            }
        }
        if (!c0Var.f51146e.isEmpty()) {
            if (this.f51119f.isEmpty()) {
                this.f51119f = c0Var.f51146e;
                this.f51117d &= -3;
            } else {
                if ((this.f51117d & 2) != 2) {
                    this.f51119f = new ArrayList(this.f51119f);
                    this.f51117d |= 2;
                }
                this.f51119f.addAll(c0Var.f51146e);
            }
        }
        if (!c0Var.f51147f.isEmpty()) {
            if (this.f51120g.isEmpty()) {
                this.f51120g = c0Var.f51147f;
                this.f51117d &= -5;
            } else {
                if ((this.f51117d & 4) != 4) {
                    this.f51120g = new ArrayList(this.f51120g);
                    this.f51117d |= 4;
                }
                this.f51120g.addAll(c0Var.f51147f);
            }
        }
        if ((c0Var.f51144c & 1) == 1) {
            w0 w0Var2 = c0Var.f51148g;
            if ((this.f51117d & 8) != 8 || (w0Var = this.f51121h) == w0.f51519g) {
                this.f51121h = w0Var2;
            } else {
                f fVarL = w0.l(w0Var);
                fVarL.l(w0Var2);
                this.f51121h = fVarL.g();
            }
            this.f51117d |= 8;
        }
        if ((c0Var.f51144c & 2) == 2) {
            d1 d1Var2 = c0Var.f51149h;
            if ((this.f51117d & 16) != 16 || (d1Var = this.f51122i) == d1.f51184e) {
                this.f51122i = d1Var2;
            } else {
                m mVar = new m(2);
                mVar.f51354d = Collections.EMPTY_LIST;
                mVar.m(d1Var);
                mVar.m(d1Var2);
                this.f51122i = mVar.i();
            }
            this.f51117d |= 16;
        }
        d(c0Var);
        this.f55044a = this.f55044a.h(c0Var.f51143b);
    }
}
