package tl;

import com.google.android.gms.internal.ads.k3;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class c1 extends zl.n {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final c1 f51152k;
    public static final a l = new a(22);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zl.d f51153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f51154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f51155c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f51156d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a1 f51157e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f51158f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f51159g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b1 f51160h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public byte f51161i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f51162j;

    static {
        c1 c1Var = new c1();
        f51152k = c1Var;
        c1Var.f51155c = 0;
        c1Var.f51156d = 0;
        c1Var.f51157e = a1.ERROR;
        c1Var.f51158f = 0;
        c1Var.f51159g = 0;
        c1Var.f51160h = b1.LANGUAGE_VERSION;
    }

    public c1() {
        this.f51161i = (byte) -1;
        this.f51162j = -1;
        this.f51153a = zl.d.f55026a;
    }

    @Override // zl.a
    public final int d() {
        int i10 = this.f51162j;
        if (i10 != -1) {
            return i10;
        }
        int iC = (this.f51154b & 1) == 1 ? k3.c(1, this.f51155c) : 0;
        if ((this.f51154b & 2) == 2) {
            iC += k3.c(2, this.f51156d);
        }
        if ((this.f51154b & 4) == 4) {
            iC += k3.b(3, this.f51157e.f51105a);
        }
        if ((this.f51154b & 8) == 8) {
            iC += k3.c(4, this.f51158f);
        }
        if ((this.f51154b & 16) == 16) {
            iC += k3.c(5, this.f51159g);
        }
        if ((this.f51154b & 32) == 32) {
            iC += k3.b(6, this.f51160h.f51127a);
        }
        int size = this.f51153a.size() + iC;
        this.f51162j = size;
        return size;
    }

    @Override // zl.a
    public final zl.i g() {
        return z0.f();
    }

    @Override // zl.a
    public final zl.i h() {
        z0 z0VarF = z0.f();
        z0VarF.g(this);
        return z0VarF;
    }

    @Override // zl.a
    public final void i(k3 k3Var) throws IOException {
        d();
        if ((this.f51154b & 1) == 1) {
            k3Var.q(1, this.f51155c);
        }
        if ((this.f51154b & 2) == 2) {
            k3Var.q(2, this.f51156d);
        }
        if ((this.f51154b & 4) == 4) {
            k3Var.p(3, this.f51157e.f51105a);
        }
        if ((this.f51154b & 8) == 8) {
            k3Var.q(4, this.f51158f);
        }
        if ((this.f51154b & 16) == 16) {
            k3Var.q(5, this.f51159g);
        }
        if ((this.f51154b & 32) == 32) {
            k3Var.p(6, this.f51160h.f51127a);
        }
        k3Var.v(this.f51153a);
    }

    @Override // zl.u
    public final boolean isInitialized() {
        if (this.f51161i == 1) {
            return true;
        }
        this.f51161i = (byte) 1;
        return true;
    }

    public c1(z0 z0Var) {
        this.f51161i = (byte) -1;
        this.f51162j = -1;
        this.f51153a = z0Var.f55044a;
    }

    public c1(zl.e eVar) {
        this.f51161i = (byte) -1;
        this.f51162j = -1;
        boolean z10 = false;
        this.f51155c = 0;
        this.f51156d = 0;
        a1 a1Var = a1.ERROR;
        this.f51157e = a1Var;
        this.f51158f = 0;
        this.f51159g = 0;
        b1 b1Var = b1.LANGUAGE_VERSION;
        this.f51160h = b1Var;
        zl.c cVar = new zl.c();
        k3 k3VarL = k3.l(cVar, 1);
        while (!z10) {
            try {
                try {
                    int iN = eVar.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.f51154b |= 1;
                            this.f51155c = eVar.k();
                        } else if (iN != 16) {
                            b1 b1Var2 = null;
                            a1 a1Var2 = null;
                            if (iN == 24) {
                                int iK = eVar.k();
                                if (iK == 0) {
                                    a1Var2 = a1.WARNING;
                                } else if (iK == 1) {
                                    a1Var2 = a1Var;
                                } else if (iK == 2) {
                                    a1Var2 = a1.HIDDEN;
                                }
                                if (a1Var2 == null) {
                                    k3VarL.z(iN);
                                    k3VarL.z(iK);
                                } else {
                                    this.f51154b |= 4;
                                    this.f51157e = a1Var2;
                                }
                            } else if (iN == 32) {
                                this.f51154b |= 8;
                                this.f51158f = eVar.k();
                            } else if (iN == 40) {
                                this.f51154b |= 16;
                                this.f51159g = eVar.k();
                            } else if (iN != 48) {
                                if (!eVar.q(iN, k3VarL)) {
                                }
                            } else {
                                int iK2 = eVar.k();
                                if (iK2 == 0) {
                                    b1Var2 = b1Var;
                                } else if (iK2 == 1) {
                                    b1Var2 = b1.COMPILER_VERSION;
                                } else if (iK2 == 2) {
                                    b1Var2 = b1.API_VERSION;
                                }
                                if (b1Var2 == null) {
                                    k3VarL.z(iN);
                                    k3VarL.z(iK2);
                                } else {
                                    this.f51154b |= 32;
                                    this.f51160h = b1Var2;
                                }
                            }
                        } else {
                            this.f51154b |= 2;
                            this.f51156d = eVar.k();
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
                    this.f51153a = cVar.h();
                }
                throw th2;
            }
        }
        try {
            k3VarL.j();
        } catch (IOException unused2) {
        } finally {
            this.f51153a = cVar.h();
        }
    }
}
