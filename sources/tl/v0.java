package tl;

import com.google.android.gms.internal.ads.k3;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class v0 extends zl.k {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final v0 f51495m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f51496n = new a(19);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zl.d f51497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f51498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f51499d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f51500e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f51501f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public u0 f51502g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List f51503h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List f51504i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f51505j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public byte f51506k;
    public int l;

    static {
        v0 v0Var = new v0();
        f51495m = v0Var;
        v0Var.f51499d = 0;
        v0Var.f51500e = 0;
        v0Var.f51501f = false;
        v0Var.f51502g = u0.INV;
        List list = Collections.EMPTY_LIST;
        v0Var.f51503h = list;
        v0Var.f51504i = list;
    }

    public v0(t0 t0Var) {
        super(t0Var);
        this.f51505j = -1;
        this.f51506k = (byte) -1;
        this.l = -1;
        this.f51497b = t0Var.f55044a;
    }

    @Override // zl.a
    public final int d() {
        int i10 = this.l;
        if (i10 != -1) {
            return i10;
        }
        int iC = (this.f51498c & 1) == 1 ? k3.c(1, this.f51499d) : 0;
        if ((this.f51498c & 2) == 2) {
            iC += k3.c(2, this.f51500e);
        }
        if ((this.f51498c & 4) == 4) {
            iC += k3.i(3) + 1;
        }
        if ((this.f51498c & 8) == 8) {
            iC += k3.b(4, this.f51502g.f51489a);
        }
        for (int i11 = 0; i11 < this.f51503h.size(); i11++) {
            iC += k3.e(5, (zl.a) this.f51503h.get(i11));
        }
        int iD = 0;
        for (int i12 = 0; i12 < this.f51504i.size(); i12++) {
            iD += k3.d(((Integer) this.f51504i.get(i12)).intValue());
        }
        int iD2 = iC + iD;
        if (!this.f51504i.isEmpty()) {
            iD2 = iD2 + 1 + k3.d(iD);
        }
        this.f51505j = iD;
        int size = this.f51497b.size() + m() + iD2;
        this.l = size;
        return size;
    }

    @Override // zl.a
    public final zl.i g() {
        return t0.f();
    }

    @Override // zl.u
    public final zl.a getDefaultInstanceForType() {
        return f51495m;
    }

    @Override // zl.a
    public final zl.i h() {
        t0 t0VarF = t0.f();
        t0VarF.g(this);
        return t0VarF;
    }

    @Override // zl.a
    public final void i(k3 k3Var) throws IOException {
        d();
        v6.c cVar = new v6.c(this);
        if ((this.f51498c & 1) == 1) {
            k3Var.q(1, this.f51499d);
        }
        if ((this.f51498c & 2) == 2) {
            k3Var.q(2, this.f51500e);
        }
        if ((this.f51498c & 4) == 4) {
            boolean z10 = this.f51501f;
            k3Var.B(3, 0);
            k3Var.u(z10 ? 1 : 0);
        }
        if ((this.f51498c & 8) == 8) {
            k3Var.p(4, this.f51502g.f51489a);
        }
        for (int i10 = 0; i10 < this.f51503h.size(); i10++) {
            k3Var.s(5, (zl.a) this.f51503h.get(i10));
        }
        if (this.f51504i.size() > 0) {
            k3Var.z(50);
            k3Var.z(this.f51505j);
        }
        for (int i11 = 0; i11 < this.f51504i.size(); i11++) {
            k3Var.r(((Integer) this.f51504i.get(i11)).intValue());
        }
        cVar.s(1000, k3Var);
        k3Var.v(this.f51497b);
    }

    @Override // zl.u
    public final boolean isInitialized() {
        byte b10 = this.f51506k;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        int i10 = this.f51498c;
        if ((i10 & 1) != 1) {
            this.f51506k = (byte) 0;
            return false;
        }
        if ((i10 & 2) != 2) {
            this.f51506k = (byte) 0;
            return false;
        }
        for (int i11 = 0; i11 < this.f51503h.size(); i11++) {
            if (!((q0) this.f51503h.get(i11)).isInitialized()) {
                this.f51506k = (byte) 0;
                return false;
            }
        }
        if (l()) {
            this.f51506k = (byte) 1;
            return true;
        }
        this.f51506k = (byte) 0;
        return false;
    }

    public v0() {
        this.f51505j = -1;
        this.f51506k = (byte) -1;
        this.l = -1;
        this.f51497b = zl.d.f55026a;
    }

    public v0(zl.e eVar, zl.g gVar) {
        u0 u0Var;
        this.f51505j = -1;
        this.f51506k = (byte) -1;
        this.l = -1;
        this.f51499d = 0;
        this.f51500e = 0;
        this.f51501f = false;
        u0 u0Var2 = u0.INV;
        this.f51502g = u0Var2;
        List list = Collections.EMPTY_LIST;
        this.f51503h = list;
        this.f51504i = list;
        zl.c cVar = new zl.c();
        k3 k3VarL = k3.l(cVar, 1);
        boolean z10 = false;
        int i10 = 0;
        while (!z10) {
            try {
                try {
                    int iN = eVar.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.f51498c |= 1;
                            this.f51499d = eVar.k();
                        } else if (iN == 16) {
                            this.f51498c |= 2;
                            this.f51500e = eVar.k();
                        } else if (iN == 24) {
                            this.f51498c |= 4;
                            this.f51501f = eVar.l() != 0;
                        } else if (iN == 32) {
                            int iK = eVar.k();
                            if (iK == 0) {
                                u0Var = u0.IN;
                            } else if (iK != 1) {
                                u0Var = iK != 2 ? null : u0Var2;
                            } else {
                                u0Var = u0.OUT;
                            }
                            if (u0Var == null) {
                                k3VarL.z(iN);
                                k3VarL.z(iK);
                            } else {
                                this.f51498c |= 8;
                                this.f51502g = u0Var;
                            }
                        } else if (iN == 42) {
                            if ((i10 & 16) != 16) {
                                this.f51503h = new ArrayList();
                                i10 |= 16;
                            }
                            this.f51503h.add(eVar.g(q0.f51410u, gVar));
                        } else if (iN == 48) {
                            if ((i10 & 32) != 32) {
                                this.f51504i = new ArrayList();
                                i10 |= 32;
                            }
                            this.f51504i.add(Integer.valueOf(eVar.k()));
                        } else if (iN != 50) {
                            if (!q(eVar, k3VarL, gVar, iN)) {
                            }
                        } else {
                            int iD = eVar.d(eVar.k());
                            if ((i10 & 32) != 32 && eVar.b() > 0) {
                                this.f51504i = new ArrayList();
                                i10 |= 32;
                            }
                            while (eVar.b() > 0) {
                                this.f51504i.add(Integer.valueOf(eVar.k()));
                            }
                            eVar.c(iD);
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
                if ((i10 & 16) == 16) {
                    this.f51503h = Collections.unmodifiableList(this.f51503h);
                }
                if ((i10 & 32) == 32) {
                    this.f51504i = Collections.unmodifiableList(this.f51504i);
                }
                try {
                    k3VarL.j();
                } catch (IOException unused) {
                } finally {
                    this.f51497b = cVar.h();
                }
                p();
                throw th2;
            }
        }
        if ((i10 & 16) == 16) {
            this.f51503h = Collections.unmodifiableList(this.f51503h);
        }
        if ((i10 & 32) == 32) {
            this.f51504i = Collections.unmodifiableList(this.f51504i);
        }
        try {
            k3VarL.j();
        } catch (IOException unused2) {
        } finally {
            this.f51497b = cVar.h();
        }
        p();
    }
}
