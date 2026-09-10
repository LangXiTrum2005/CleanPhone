package tl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class m extends zl.i implements zl.u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f51352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f51353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f51354d;

    public /* synthetic */ m(int i10) {
        this.f51352b = i10;
    }

    @Override // zl.i
    public final zl.a a() {
        switch (this.f51352b) {
            case 0:
                n nVarE = e();
                if (nVarE.isInitialized()) {
                    return nVarE;
                }
                throw new aa.b();
            case 1:
                k0 k0VarF = f();
                if (k0VarF.isInitialized()) {
                    return k0VarF;
                }
                throw new aa.b();
            case 2:
                d1 d1VarI = i();
                d1VarI.isInitialized();
                return d1VarI;
            default:
                l0 l0VarG = g();
                l0VarG.isInitialized();
                return l0VarG;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0020  */
    /* JADX WARN: Code duplicated, block: B:30:0x003f  */
    /* JADX WARN: Code duplicated, block: B:44:0x005e  */
    /* JADX WARN: Code duplicated, block: B:58:0x007d  */
    @Override // zl.i
    public final zl.i b(zl.e eVar, zl.g gVar) throws Throwable {
        switch (this.f51352b) {
            case 0:
                n nVar = null;
                try {
                    try {
                        n.f51360f.getClass();
                        j(new n(eVar, gVar));
                        return this;
                    } catch (zl.q e10) {
                        n nVar2 = (n) e10.f55076a;
                        try {
                            throw e10;
                        } catch (Throwable th2) {
                            th = th2;
                            nVar = nVar2;
                            if (nVar != null) {
                                j(nVar);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (nVar != null) {
                        j(nVar);
                    }
                    throw th;
                }
            case 1:
                k0 k0Var = null;
                try {
                    try {
                        k0.f51332f.getClass();
                        k(new k0(eVar, gVar));
                        return this;
                    } catch (zl.q e11) {
                        k0 k0Var2 = (k0) e11.f55076a;
                        try {
                            throw e11;
                        } catch (Throwable th4) {
                            th = th4;
                            k0Var = k0Var2;
                            if (k0Var != null) {
                                k(k0Var);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                    if (k0Var != null) {
                        k(k0Var);
                    }
                    throw th;
                }
            case 2:
                d1 d1Var = null;
                try {
                    try {
                        d1.f51185f.getClass();
                        m(new d1(eVar, gVar));
                        return this;
                    } catch (zl.q e12) {
                        d1 d1Var2 = (d1) e12.f55076a;
                        try {
                            throw e12;
                        } catch (Throwable th6) {
                            th = th6;
                            d1Var = d1Var2;
                            if (d1Var != null) {
                                m(d1Var);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th7) {
                    th = th7;
                    if (d1Var != null) {
                        m(d1Var);
                    }
                    throw th;
                }
            default:
                l0 l0Var = null;
                try {
                    try {
                        l0.f51347f.getClass();
                        l(new l0(eVar));
                        return this;
                    } catch (zl.q e13) {
                        l0 l0Var2 = (l0) e13.f55076a;
                        try {
                            throw e13;
                        } catch (Throwable th8) {
                            th = th8;
                            l0Var = l0Var2;
                            if (l0Var != null) {
                                l(l0Var);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th9) {
                    th = th9;
                    if (l0Var != null) {
                        l(l0Var);
                    }
                    throw th;
                }
        }
    }

    @Override // zl.i
    public final /* bridge */ /* synthetic */ zl.i c(zl.n nVar) {
        switch (this.f51352b) {
            case 0:
                j((n) nVar);
                break;
            case 1:
                k((k0) nVar);
                break;
            case 2:
                m((d1) nVar);
                break;
            default:
                l((l0) nVar);
                break;
        }
        return this;
    }

    public final Object clone() {
        switch (this.f51352b) {
            case 0:
                m mVar = new m(0);
                mVar.f51354d = Collections.EMPTY_LIST;
                mVar.j(e());
                return mVar;
            case 1:
                m mVar2 = new m(1);
                mVar2.f51354d = Collections.EMPTY_LIST;
                mVar2.k(f());
                return mVar2;
            case 2:
                m mVar3 = new m(2);
                mVar3.f51354d = Collections.EMPTY_LIST;
                mVar3.m(i());
                return mVar3;
            default:
                m mVar4 = new m(3);
                mVar4.f51354d = zl.r.f55077b;
                mVar4.l(g());
                return mVar4;
        }
    }

    public n e() {
        n nVar = new n(this);
        if ((this.f51353c & 1) == 1) {
            this.f51354d = Collections.unmodifiableList(this.f51354d);
            this.f51353c &= -2;
        }
        nVar.f51362b = this.f51354d;
        return nVar;
    }

    public k0 f() {
        k0 k0Var = new k0(this);
        if ((this.f51353c & 1) == 1) {
            this.f51354d = Collections.unmodifiableList(this.f51354d);
            this.f51353c &= -2;
        }
        k0Var.f51334b = this.f51354d;
        return k0Var;
    }

    public l0 g() {
        l0 l0Var = new l0(this);
        if ((this.f51353c & 1) == 1) {
            this.f51354d = ((zl.s) this.f51354d).getUnmodifiableView();
            this.f51353c &= -2;
        }
        l0Var.f51349b = (zl.s) this.f51354d;
        return l0Var;
    }

    public d1 i() {
        d1 d1Var = new d1(this);
        if ((this.f51353c & 1) == 1) {
            this.f51354d = Collections.unmodifiableList(this.f51354d);
            this.f51353c &= -2;
        }
        d1Var.f51187b = this.f51354d;
        return d1Var;
    }

    public void j(n nVar) {
        if (nVar == n.f51359e) {
            return;
        }
        if (!nVar.f51362b.isEmpty()) {
            if (this.f51354d.isEmpty()) {
                this.f51354d = nVar.f51362b;
                this.f51353c &= -2;
            } else {
                if ((this.f51353c & 1) != 1) {
                    this.f51354d = new ArrayList(this.f51354d);
                    this.f51353c |= 1;
                }
                this.f51354d.addAll(nVar.f51362b);
            }
        }
        this.f55044a = this.f55044a.h(nVar.f51361a);
    }

    public void k(k0 k0Var) {
        if (k0Var == k0.f51331e) {
            return;
        }
        if (!k0Var.f51334b.isEmpty()) {
            if (this.f51354d.isEmpty()) {
                this.f51354d = k0Var.f51334b;
                this.f51353c &= -2;
            } else {
                if ((this.f51353c & 1) != 1) {
                    this.f51354d = new ArrayList(this.f51354d);
                    this.f51353c |= 1;
                }
                this.f51354d.addAll(k0Var.f51334b);
            }
        }
        this.f55044a = this.f55044a.h(k0Var.f51333a);
    }

    public void l(l0 l0Var) {
        if (l0Var == l0.f51346e) {
            return;
        }
        if (!l0Var.f51349b.isEmpty()) {
            if (((zl.s) this.f51354d).isEmpty()) {
                this.f51354d = l0Var.f51349b;
                this.f51353c &= -2;
            } else {
                if ((this.f51353c & 1) != 1) {
                    this.f51354d = new zl.r((zl.s) this.f51354d);
                    this.f51353c |= 1;
                }
                ((zl.s) this.f51354d).addAll(l0Var.f51349b);
            }
        }
        this.f55044a = this.f55044a.h(l0Var.f51348a);
    }

    public void m(d1 d1Var) {
        if (d1Var == d1.f51184e) {
            return;
        }
        if (!d1Var.f51187b.isEmpty()) {
            if (this.f51354d.isEmpty()) {
                this.f51354d = d1Var.f51187b;
                this.f51353c &= -2;
            } else {
                if ((this.f51353c & 1) != 1) {
                    this.f51354d = new ArrayList(this.f51354d);
                    this.f51353c |= 1;
                }
                this.f51354d.addAll(d1Var.f51187b);
            }
        }
        this.f55044a = this.f55044a.h(d1Var.f51186a);
    }
}
