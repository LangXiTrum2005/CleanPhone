package tl;

import com.google.android.gms.internal.ads.k3;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class o0 extends zl.n {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final o0 f51376h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f51377i = new a(17);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zl.d f51378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f51379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public n0 f51380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public q0 f51381d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f51382e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte f51383f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f51384g;

    static {
        o0 o0Var = new o0();
        f51376h = o0Var;
        o0Var.f51380c = n0.INV;
        o0Var.f51381d = q0.f51409t;
        o0Var.f51382e = 0;
    }

    public o0() {
        this.f51383f = (byte) -1;
        this.f51384g = -1;
        this.f51378a = zl.d.f55026a;
    }

    @Override // zl.a
    public final int d() {
        int i10 = this.f51384g;
        if (i10 != -1) {
            return i10;
        }
        int iB = (this.f51379b & 1) == 1 ? k3.b(1, this.f51380c.f51370a) : 0;
        if ((this.f51379b & 2) == 2) {
            iB += k3.e(2, this.f51381d);
        }
        if ((this.f51379b & 4) == 4) {
            iB += k3.c(3, this.f51382e);
        }
        int size = this.f51378a.size() + iB;
        this.f51384g = size;
        return size;
    }

    @Override // zl.a
    public final zl.i g() {
        return m0.f();
    }

    @Override // zl.a
    public final zl.i h() {
        m0 m0VarF = m0.f();
        m0VarF.g(this);
        return m0VarF;
    }

    @Override // zl.a
    public final void i(k3 k3Var) throws IOException {
        d();
        if ((this.f51379b & 1) == 1) {
            k3Var.p(1, this.f51380c.f51370a);
        }
        if ((this.f51379b & 2) == 2) {
            k3Var.s(2, this.f51381d);
        }
        if ((this.f51379b & 4) == 4) {
            k3Var.q(3, this.f51382e);
        }
        k3Var.v(this.f51378a);
    }

    @Override // zl.u
    public final boolean isInitialized() {
        byte b10 = this.f51383f;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if ((this.f51379b & 2) != 2 || this.f51381d.isInitialized()) {
            this.f51383f = (byte) 1;
            return true;
        }
        this.f51383f = (byte) 0;
        return false;
    }

    public o0(m0 m0Var) {
        this.f51383f = (byte) -1;
        this.f51384g = -1;
        this.f51378a = m0Var.f55044a;
    }

    public o0(zl.e eVar, zl.g gVar) {
        this.f51383f = (byte) -1;
        this.f51384g = -1;
        n0 n0Var = n0.INV;
        this.f51380c = n0Var;
        this.f51381d = q0.f51409t;
        boolean z10 = false;
        this.f51382e = 0;
        zl.c cVar = new zl.c();
        k3 k3VarL = k3.l(cVar, 1);
        while (!z10) {
            try {
                try {
                    int iN = eVar.n();
                    if (iN != 0) {
                        p0 p0VarU = null;
                        n0 n0Var2 = null;
                        if (iN == 8) {
                            int iK = eVar.k();
                            if (iK == 0) {
                                n0Var2 = n0.IN;
                            } else if (iK == 1) {
                                n0Var2 = n0.OUT;
                            } else if (iK == 2) {
                                n0Var2 = n0Var;
                            } else if (iK == 3) {
                                n0Var2 = n0.STAR;
                            }
                            if (n0Var2 == null) {
                                k3VarL.z(iN);
                                k3VarL.z(iK);
                            } else {
                                this.f51379b |= 1;
                                this.f51380c = n0Var2;
                            }
                        } else if (iN == 18) {
                            if ((this.f51379b & 2) == 2) {
                                q0 q0Var = this.f51381d;
                                q0Var.getClass();
                                p0VarU = q0.u(q0Var);
                            }
                            q0 q0Var2 = (q0) eVar.g(q0.f51410u, gVar);
                            this.f51381d = q0Var2;
                            if (p0VarU != null) {
                                p0VarU.g(q0Var2);
                                this.f51381d = p0VarU.e();
                            }
                            this.f51379b |= 2;
                        } else if (iN != 24) {
                            if (!eVar.q(iN, k3VarL)) {
                            }
                        } else {
                            this.f51379b |= 4;
                            this.f51382e = eVar.k();
                        }
                    }
                    z10 = true;
                } catch (zl.q e10) {
                    e10.f55076a = this;
                    throw e10;
                } catch (IOException e11) {
                    zl.q qVar = new zl.q(e11.getMessage());
                    qVar.f55076a = this;
                    throw qVar;
                }
            } catch (Throwable th2) {
                try {
                    k3VarL.j();
                } catch (IOException unused) {
                } finally {
                    this.f51378a = cVar.h();
                }
                throw th2;
            }
        }
        try {
            k3VarL.j();
        } catch (IOException unused2) {
        } finally {
            this.f51378a = cVar.h();
        }
    }
}
