package tl;

import com.google.android.gms.internal.ads.k3;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class y0 extends zl.k {
    public static final y0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f51568m = new a(21);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zl.d f51569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f51570c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f51571d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f51572e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public q0 f51573f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f51574g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public q0 f51575h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f51576i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public byte f51577j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f51578k;

    static {
        y0 y0Var = new y0();
        l = y0Var;
        y0Var.f51571d = 0;
        y0Var.f51572e = 0;
        q0 q0Var = q0.f51409t;
        y0Var.f51573f = q0Var;
        y0Var.f51574g = 0;
        y0Var.f51575h = q0Var;
        y0Var.f51576i = 0;
    }

    public y0(x0 x0Var) {
        super(x0Var);
        this.f51577j = (byte) -1;
        this.f51578k = -1;
        this.f51569b = x0Var.f55044a;
    }

    @Override // zl.a
    public final int d() {
        int i10 = this.f51578k;
        if (i10 != -1) {
            return i10;
        }
        int iC = (this.f51570c & 1) == 1 ? k3.c(1, this.f51571d) : 0;
        if ((this.f51570c & 2) == 2) {
            iC += k3.c(2, this.f51572e);
        }
        if ((this.f51570c & 4) == 4) {
            iC += k3.e(3, this.f51573f);
        }
        if ((this.f51570c & 16) == 16) {
            iC += k3.e(4, this.f51575h);
        }
        if ((this.f51570c & 8) == 8) {
            iC += k3.c(5, this.f51574g);
        }
        if ((this.f51570c & 32) == 32) {
            iC += k3.c(6, this.f51576i);
        }
        int size = this.f51569b.size() + m() + iC;
        this.f51578k = size;
        return size;
    }

    @Override // zl.a
    public final zl.i g() {
        x0 x0Var = new x0();
        q0 q0Var = q0.f51409t;
        x0Var.f51544g = q0Var;
        x0Var.f51546i = q0Var;
        return x0Var;
    }

    @Override // zl.u
    public final zl.a getDefaultInstanceForType() {
        return l;
    }

    @Override // zl.a
    public final zl.i h() {
        x0 x0Var = new x0();
        q0 q0Var = q0.f51409t;
        x0Var.f51544g = q0Var;
        x0Var.f51546i = q0Var;
        x0Var.f(this);
        return x0Var;
    }

    @Override // zl.a
    public final void i(k3 k3Var) throws IOException {
        d();
        v6.c cVar = new v6.c(this);
        if ((this.f51570c & 1) == 1) {
            k3Var.q(1, this.f51571d);
        }
        if ((this.f51570c & 2) == 2) {
            k3Var.q(2, this.f51572e);
        }
        if ((this.f51570c & 4) == 4) {
            k3Var.s(3, this.f51573f);
        }
        if ((this.f51570c & 16) == 16) {
            k3Var.s(4, this.f51575h);
        }
        if ((this.f51570c & 8) == 8) {
            k3Var.q(5, this.f51574g);
        }
        if ((this.f51570c & 32) == 32) {
            k3Var.q(6, this.f51576i);
        }
        cVar.s(200, k3Var);
        k3Var.v(this.f51569b);
    }

    @Override // zl.u
    public final boolean isInitialized() {
        byte b10 = this.f51577j;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        int i10 = this.f51570c;
        if ((i10 & 2) != 2) {
            this.f51577j = (byte) 0;
            return false;
        }
        if ((i10 & 4) == 4 && !this.f51573f.isInitialized()) {
            this.f51577j = (byte) 0;
            return false;
        }
        if ((this.f51570c & 16) == 16 && !this.f51575h.isInitialized()) {
            this.f51577j = (byte) 0;
            return false;
        }
        if (l()) {
            this.f51577j = (byte) 1;
            return true;
        }
        this.f51577j = (byte) 0;
        return false;
    }

    public y0() {
        this.f51577j = (byte) -1;
        this.f51578k = -1;
        this.f51569b = zl.d.f55026a;
    }

    public y0(zl.e eVar, zl.g gVar) {
        this.f51577j = (byte) -1;
        this.f51578k = -1;
        boolean z10 = false;
        this.f51571d = 0;
        this.f51572e = 0;
        q0 q0Var = q0.f51409t;
        this.f51573f = q0Var;
        this.f51574g = 0;
        this.f51575h = q0Var;
        this.f51576i = 0;
        zl.c cVar = new zl.c();
        k3 k3VarL = k3.l(cVar, 1);
        while (!z10) {
            try {
                try {
                    int iN = eVar.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.f51570c |= 1;
                            this.f51571d = eVar.k();
                        } else if (iN != 16) {
                            p0 p0VarU = null;
                            if (iN == 26) {
                                if ((this.f51570c & 4) == 4) {
                                    q0 q0Var2 = this.f51573f;
                                    q0Var2.getClass();
                                    p0VarU = q0.u(q0Var2);
                                }
                                q0 q0Var3 = (q0) eVar.g(q0.f51410u, gVar);
                                this.f51573f = q0Var3;
                                if (p0VarU != null) {
                                    p0VarU.g(q0Var3);
                                    this.f51573f = p0VarU.e();
                                }
                                this.f51570c |= 4;
                            } else if (iN == 34) {
                                if ((this.f51570c & 16) == 16) {
                                    q0 q0Var4 = this.f51575h;
                                    q0Var4.getClass();
                                    p0VarU = q0.u(q0Var4);
                                }
                                q0 q0Var5 = (q0) eVar.g(q0.f51410u, gVar);
                                this.f51575h = q0Var5;
                                if (p0VarU != null) {
                                    p0VarU.g(q0Var5);
                                    this.f51575h = p0VarU.e();
                                }
                                this.f51570c |= 16;
                            } else if (iN == 40) {
                                this.f51570c |= 8;
                                this.f51574g = eVar.k();
                            } else if (iN != 48) {
                                if (!q(eVar, k3VarL, gVar, iN)) {
                                }
                            } else {
                                this.f51570c |= 32;
                                this.f51576i = eVar.k();
                            }
                        } else {
                            this.f51570c |= 2;
                            this.f51572e = eVar.k();
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
                    this.f51569b = cVar.h();
                }
                p();
                throw th2;
            }
        }
        try {
            k3VarL.j();
        } catch (IOException unused2) {
        } finally {
            this.f51569b = cVar.h();
        }
        p();
    }
}
