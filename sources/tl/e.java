package tl;

import com.google.android.gms.internal.ads.k3;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends zl.n {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final e f51190g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f51191h = new a(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zl.d f51192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f51193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f51194c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d f51195d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte f51196e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f51197f;

    static {
        e eVar = new e();
        f51190g = eVar;
        eVar.f51194c = 0;
        eVar.f51195d = d.f51163p;
    }

    public e() {
        this.f51196e = (byte) -1;
        this.f51197f = -1;
        this.f51192a = zl.d.f55026a;
    }

    @Override // zl.a
    public final int d() {
        int i10 = this.f51197f;
        if (i10 != -1) {
            return i10;
        }
        int iC = (this.f51193b & 1) == 1 ? k3.c(1, this.f51194c) : 0;
        if ((this.f51193b & 2) == 2) {
            iC += k3.e(2, this.f51195d);
        }
        int size = this.f51192a.size() + iC;
        this.f51197f = size;
        return size;
    }

    @Override // zl.a
    public final zl.i g() {
        f fVar = new f(2);
        fVar.f51212d = d.f51163p;
        return fVar;
    }

    @Override // zl.a
    public final zl.i h() {
        f fVar = new f(2);
        fVar.f51212d = d.f51163p;
        fVar.j(this);
        return fVar;
    }

    @Override // zl.a
    public final void i(k3 k3Var) throws IOException {
        d();
        if ((this.f51193b & 1) == 1) {
            k3Var.q(1, this.f51194c);
        }
        if ((this.f51193b & 2) == 2) {
            k3Var.s(2, this.f51195d);
        }
        k3Var.v(this.f51192a);
    }

    @Override // zl.u
    public final boolean isInitialized() {
        byte b10 = this.f51196e;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        int i10 = this.f51193b;
        if ((i10 & 1) != 1) {
            this.f51196e = (byte) 0;
            return false;
        }
        if ((i10 & 2) != 2) {
            this.f51196e = (byte) 0;
            return false;
        }
        if (this.f51195d.isInitialized()) {
            this.f51196e = (byte) 1;
            return true;
        }
        this.f51196e = (byte) 0;
        return false;
    }

    public e(f fVar) {
        this.f51196e = (byte) -1;
        this.f51197f = -1;
        this.f51192a = fVar.f55044a;
    }

    public e(zl.e eVar, zl.g gVar) {
        b bVarF;
        this.f51196e = (byte) -1;
        this.f51197f = -1;
        boolean z10 = false;
        this.f51194c = 0;
        this.f51195d = d.f51163p;
        zl.c cVar = new zl.c();
        k3 k3VarL = k3.l(cVar, 1);
        while (!z10) {
            try {
                try {
                    try {
                        int iN = eVar.n();
                        if (iN != 0) {
                            if (iN == 8) {
                                this.f51193b |= 1;
                                this.f51194c = eVar.k();
                            } else if (iN != 18) {
                                if (!eVar.q(iN, k3VarL)) {
                                }
                            } else {
                                if ((this.f51193b & 2) == 2) {
                                    d dVar = this.f51195d;
                                    dVar.getClass();
                                    bVarF = b.f();
                                    bVarF.g(dVar);
                                } else {
                                    bVarF = null;
                                }
                                d dVar2 = (d) eVar.g(d.f51164q, gVar);
                                this.f51195d = dVar2;
                                if (bVarF != null) {
                                    bVarF.g(dVar2);
                                    this.f51195d = bVarF.e();
                                }
                                this.f51193b |= 2;
                            }
                        }
                        z10 = true;
                    } catch (zl.q e10) {
                        e10.f55076a = this;
                        throw e10;
                    }
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
                    this.f51192a = cVar.h();
                }
                throw th2;
            }
        }
        try {
            k3VarL.j();
        } catch (IOException unused2) {
        } finally {
            this.f51192a = cVar.h();
        }
    }
}
