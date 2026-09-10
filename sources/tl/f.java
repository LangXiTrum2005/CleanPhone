package tl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends zl.i implements zl.u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f51210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f51211c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f51212d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f51213e;

    public /* synthetic */ f(int i10) {
        this.f51210b = i10;
    }

    public static f i() {
        f fVar = new f(1);
        fVar.f51212d = Collections.EMPTY_LIST;
        fVar.f51213e = -1;
        return fVar;
    }

    @Override // zl.i
    public final zl.a a() {
        switch (this.f51210b) {
            case 0:
                g gVarF = f();
                if (gVarF.isInitialized()) {
                    return gVarF;
                }
                throw new aa.b();
            case 1:
                w0 w0VarG = g();
                if (w0VarG.isInitialized()) {
                    return w0VarG;
                }
                throw new aa.b();
            default:
                e eVarE = e();
                if (eVarE.isInitialized()) {
                    return eVarE;
                }
                throw new aa.b();
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0020  */
    /* JADX WARN: Code duplicated, block: B:30:0x003f  */
    /* JADX WARN: Code duplicated, block: B:44:0x005c  */
    @Override // zl.i
    public final zl.i b(zl.e eVar, zl.g gVar) throws Throwable {
        switch (this.f51210b) {
            case 0:
                g gVar2 = null;
                try {
                    try {
                        k((g) g.f51229h.a(eVar, gVar));
                        return this;
                    } catch (zl.q e10) {
                        g gVar3 = (g) e10.f55076a;
                        try {
                            throw e10;
                        } catch (Throwable th2) {
                            th = th2;
                            gVar2 = gVar3;
                            if (gVar2 != null) {
                                k(gVar2);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (gVar2 != null) {
                        k(gVar2);
                    }
                    throw th;
                }
            case 1:
                w0 w0Var = null;
                try {
                    try {
                        w0.f51520h.getClass();
                        l(new w0(eVar, gVar));
                        return this;
                    } catch (zl.q e11) {
                        w0 w0Var2 = (w0) e11.f55076a;
                        try {
                            throw e11;
                        } catch (Throwable th4) {
                            th = th4;
                            w0Var = w0Var2;
                            if (w0Var != null) {
                                l(w0Var);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                    if (w0Var != null) {
                        l(w0Var);
                    }
                    throw th;
                }
            default:
                e eVar2 = null;
                try {
                    try {
                        e.f51191h.getClass();
                        j(new e(eVar, gVar));
                        return this;
                    } catch (zl.q e12) {
                        e eVar3 = (e) e12.f55076a;
                        try {
                            throw e12;
                        } catch (Throwable th6) {
                            th = th6;
                            eVar2 = eVar3;
                            if (eVar2 != null) {
                                j(eVar2);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th7) {
                    th = th7;
                    if (eVar2 != null) {
                        j(eVar2);
                    }
                    throw th;
                }
        }
    }

    @Override // zl.i
    public final /* bridge */ /* synthetic */ zl.i c(zl.n nVar) {
        switch (this.f51210b) {
            case 0:
                k((g) nVar);
                break;
            case 1:
                l((w0) nVar);
                break;
            default:
                j((e) nVar);
                break;
        }
        return this;
    }

    public final Object clone() {
        switch (this.f51210b) {
            case 0:
                f fVar = new f(0);
                fVar.f51212d = Collections.EMPTY_LIST;
                fVar.k(f());
                return fVar;
            case 1:
                f fVarI = i();
                fVarI.l(g());
                return fVarI;
            default:
                f fVar2 = new f(2);
                fVar2.f51212d = d.f51163p;
                fVar2.j(e());
                return fVar2;
        }
    }

    public e e() {
        e eVar = new e(this);
        int i10 = this.f51211c;
        int i11 = (i10 & 1) != 1 ? 0 : 1;
        eVar.f51194c = this.f51213e;
        if ((i10 & 2) == 2) {
            i11 |= 2;
        }
        eVar.f51195d = (d) this.f51212d;
        eVar.f51193b = i11;
        return eVar;
    }

    public g f() {
        g gVar = new g(this);
        int i10 = this.f51211c;
        int i11 = (i10 & 1) != 1 ? 0 : 1;
        gVar.f51232c = this.f51213e;
        if ((i10 & 2) == 2) {
            this.f51212d = Collections.unmodifiableList((List) this.f51212d);
            this.f51211c &= -3;
        }
        gVar.f51233d = (List) this.f51212d;
        gVar.f51231b = i11;
        return gVar;
    }

    public w0 g() {
        w0 w0Var = new w0(this);
        int i10 = this.f51211c;
        if ((i10 & 1) == 1) {
            this.f51212d = Collections.unmodifiableList((List) this.f51212d);
            this.f51211c &= -2;
        }
        w0Var.f51523c = (List) this.f51212d;
        int i11 = (i10 & 2) != 2 ? 0 : 1;
        w0Var.f51524d = this.f51213e;
        w0Var.f51522b = i11;
        return w0Var;
    }

    public void j(e eVar) {
        d dVar;
        if (eVar == e.f51190g) {
            return;
        }
        int i10 = eVar.f51193b;
        if ((i10 & 1) == 1) {
            int i11 = eVar.f51194c;
            this.f51211c = 1 | this.f51211c;
            this.f51213e = i11;
        }
        if ((i10 & 2) == 2) {
            d dVar2 = eVar.f51195d;
            if ((this.f51211c & 2) != 2 || (dVar = (d) this.f51212d) == d.f51163p) {
                this.f51212d = dVar2;
            } else {
                b bVarF = b.f();
                bVarF.g(dVar);
                bVarF.g(dVar2);
                this.f51212d = bVarF.e();
            }
            this.f51211c |= 2;
        }
        this.f55044a = this.f55044a.h(eVar.f51192a);
    }

    public void k(g gVar) {
        if (gVar == g.f51228g) {
            return;
        }
        if ((gVar.f51231b & 1) == 1) {
            int i10 = gVar.f51232c;
            this.f51211c = 1 | this.f51211c;
            this.f51213e = i10;
        }
        if (!gVar.f51233d.isEmpty()) {
            if (((List) this.f51212d).isEmpty()) {
                this.f51212d = gVar.f51233d;
                this.f51211c &= -3;
            } else {
                if ((this.f51211c & 2) != 2) {
                    this.f51212d = new ArrayList((List) this.f51212d);
                    this.f51211c |= 2;
                }
                ((List) this.f51212d).addAll(gVar.f51233d);
            }
        }
        this.f55044a = this.f55044a.h(gVar.f51230a);
    }

    public void l(w0 w0Var) {
        if (w0Var == w0.f51519g) {
            return;
        }
        if (!w0Var.f51523c.isEmpty()) {
            if (((List) this.f51212d).isEmpty()) {
                this.f51212d = w0Var.f51523c;
                this.f51211c &= -2;
            } else {
                if ((this.f51211c & 1) != 1) {
                    this.f51212d = new ArrayList((List) this.f51212d);
                    this.f51211c |= 1;
                }
                ((List) this.f51212d).addAll(w0Var.f51523c);
            }
        }
        if ((w0Var.f51522b & 1) == 1) {
            int i10 = w0Var.f51524d;
            this.f51211c |= 2;
            this.f51213e = i10;
        }
        this.f55044a = this.f55044a.h(w0Var.f51521a);
    }
}
