package tl;

import com.google.android.gms.internal.ads.k3;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class j0 extends zl.n {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final j0 f51318h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f51319i = new a(14);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zl.d f51320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f51321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f51322c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f51323d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public i0 f51324e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte f51325f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f51326g;

    static {
        j0 j0Var = new j0();
        f51318h = j0Var;
        j0Var.f51322c = -1;
        j0Var.f51323d = 0;
        j0Var.f51324e = i0.PACKAGE;
    }

    public j0() {
        this.f51325f = (byte) -1;
        this.f51326g = -1;
        this.f51320a = zl.d.f55026a;
    }

    @Override // zl.a
    public final int d() {
        int i10 = this.f51326g;
        if (i10 != -1) {
            return i10;
        }
        int iC = (this.f51321b & 1) == 1 ? k3.c(1, this.f51322c) : 0;
        if ((this.f51321b & 2) == 2) {
            iC += k3.c(2, this.f51323d);
        }
        if ((this.f51321b & 4) == 4) {
            iC += k3.b(3, this.f51324e.f51293a);
        }
        int size = this.f51320a.size() + iC;
        this.f51326g = size;
        return size;
    }

    @Override // zl.a
    public final zl.i g() {
        return h0.f();
    }

    @Override // zl.a
    public final zl.i h() {
        h0 h0VarF = h0.f();
        h0VarF.g(this);
        return h0VarF;
    }

    @Override // zl.a
    public final void i(k3 k3Var) throws IOException {
        d();
        if ((this.f51321b & 1) == 1) {
            k3Var.q(1, this.f51322c);
        }
        if ((this.f51321b & 2) == 2) {
            k3Var.q(2, this.f51323d);
        }
        if ((this.f51321b & 4) == 4) {
            k3Var.p(3, this.f51324e.f51293a);
        }
        k3Var.v(this.f51320a);
    }

    @Override // zl.u
    public final boolean isInitialized() {
        byte b10 = this.f51325f;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if ((this.f51321b & 2) == 2) {
            this.f51325f = (byte) 1;
            return true;
        }
        this.f51325f = (byte) 0;
        return false;
    }

    public j0(h0 h0Var) {
        this.f51325f = (byte) -1;
        this.f51326g = -1;
        this.f51320a = h0Var.f55044a;
    }

    public j0(zl.e eVar) {
        i0 i0Var;
        this.f51325f = (byte) -1;
        this.f51326g = -1;
        this.f51322c = -1;
        boolean z10 = false;
        this.f51323d = 0;
        i0 i0Var2 = i0.PACKAGE;
        this.f51324e = i0Var2;
        zl.c cVar = new zl.c();
        k3 k3VarL = k3.l(cVar, 1);
        while (!z10) {
            try {
                try {
                    int iN = eVar.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.f51321b |= 1;
                            this.f51322c = eVar.k();
                        } else if (iN == 16) {
                            this.f51321b |= 2;
                            this.f51323d = eVar.k();
                        } else if (iN != 24) {
                            if (!eVar.q(iN, k3VarL)) {
                            }
                        } else {
                            int iK = eVar.k();
                            if (iK == 0) {
                                i0Var = i0.CLASS;
                            } else if (iK != 1) {
                                i0Var = iK != 2 ? null : i0.LOCAL;
                            } else {
                                i0Var = i0Var2;
                            }
                            if (i0Var == null) {
                                k3VarL.z(iN);
                                k3VarL.z(iK);
                            } else {
                                this.f51321b |= 4;
                                this.f51324e = i0Var;
                            }
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
                    this.f51320a = cVar.h();
                }
                throw th2;
            }
        }
        try {
            k3VarL.j();
        } catch (IOException unused2) {
        } finally {
            this.f51320a = cVar.h();
        }
    }
}
