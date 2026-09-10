package tl;

import com.google.android.gms.internal.ads.k3;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class e0 extends zl.k {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final e0 f51198j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f51199k = new a(11);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zl.d f51200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f51201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public l0 f51202d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public k0 f51203e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c0 f51204f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f51205g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte f51206h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f51207i;

    static {
        e0 e0Var = new e0();
        f51198j = e0Var;
        e0Var.f51202d = l0.f51346e;
        e0Var.f51203e = k0.f51331e;
        e0Var.f51204f = c0.f51142k;
        e0Var.f51205g = Collections.EMPTY_LIST;
    }

    public e0(d0 d0Var) {
        super(d0Var);
        this.f51206h = (byte) -1;
        this.f51207i = -1;
        this.f51200b = d0Var.f55044a;
    }

    @Override // zl.a
    public final int d() {
        int i10 = this.f51207i;
        if (i10 != -1) {
            return i10;
        }
        int iE = (this.f51201c & 1) == 1 ? k3.e(1, this.f51202d) : 0;
        if ((this.f51201c & 2) == 2) {
            iE += k3.e(2, this.f51203e);
        }
        if ((this.f51201c & 4) == 4) {
            iE += k3.e(3, this.f51204f);
        }
        for (int i11 = 0; i11 < this.f51205g.size(); i11++) {
            iE += k3.e(4, (zl.a) this.f51205g.get(i11));
        }
        int size = this.f51200b.size() + m() + iE;
        this.f51207i = size;
        return size;
    }

    @Override // zl.a
    public final zl.i g() {
        return d0.f();
    }

    @Override // zl.u
    public final zl.a getDefaultInstanceForType() {
        return f51198j;
    }

    @Override // zl.a
    public final zl.i h() {
        d0 d0VarF = d0.f();
        d0VarF.g(this);
        return d0VarF;
    }

    @Override // zl.a
    public final void i(k3 k3Var) throws IOException {
        d();
        v6.c cVar = new v6.c(this);
        if ((this.f51201c & 1) == 1) {
            k3Var.s(1, this.f51202d);
        }
        if ((this.f51201c & 2) == 2) {
            k3Var.s(2, this.f51203e);
        }
        if ((this.f51201c & 4) == 4) {
            k3Var.s(3, this.f51204f);
        }
        for (int i10 = 0; i10 < this.f51205g.size(); i10++) {
            k3Var.s(4, (zl.a) this.f51205g.get(i10));
        }
        cVar.s(200, k3Var);
        k3Var.v(this.f51200b);
    }

    @Override // zl.u
    public final boolean isInitialized() {
        byte b10 = this.f51206h;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if ((this.f51201c & 2) == 2 && !this.f51203e.isInitialized()) {
            this.f51206h = (byte) 0;
            return false;
        }
        if ((this.f51201c & 4) == 4 && !this.f51204f.isInitialized()) {
            this.f51206h = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < this.f51205g.size(); i10++) {
            if (!((j) this.f51205g.get(i10)).isInitialized()) {
                this.f51206h = (byte) 0;
                return false;
            }
        }
        if (l()) {
            this.f51206h = (byte) 1;
            return true;
        }
        this.f51206h = (byte) 0;
        return false;
    }

    public e0() {
        this.f51206h = (byte) -1;
        this.f51207i = -1;
        this.f51200b = zl.d.f55026a;
    }

    public e0(zl.e eVar, zl.g gVar) {
        this.f51206h = (byte) -1;
        this.f51207i = -1;
        this.f51202d = l0.f51346e;
        this.f51203e = k0.f51331e;
        this.f51204f = c0.f51142k;
        this.f51205g = Collections.EMPTY_LIST;
        zl.c cVar = new zl.c();
        k3 k3VarL = k3.l(cVar, 1);
        boolean z10 = false;
        char c4 = 0;
        while (!z10) {
            try {
                try {
                    int iN = eVar.n();
                    if (iN != 0) {
                        b0 b0VarF = null;
                        m mVar = null;
                        m mVar2 = null;
                        if (iN == 10) {
                            if ((this.f51201c & 1) == 1) {
                                l0 l0Var = this.f51202d;
                                l0Var.getClass();
                                mVar = new m(3);
                                mVar.f51354d = zl.r.f55077b;
                                mVar.l(l0Var);
                            }
                            l0 l0Var2 = (l0) eVar.g(l0.f51347f, gVar);
                            this.f51202d = l0Var2;
                            if (mVar != null) {
                                mVar.l(l0Var2);
                                this.f51202d = mVar.g();
                            }
                            this.f51201c |= 1;
                        } else if (iN == 18) {
                            if ((this.f51201c & 2) == 2) {
                                k0 k0Var = this.f51203e;
                                k0Var.getClass();
                                mVar2 = new m(1);
                                mVar2.f51354d = Collections.EMPTY_LIST;
                                mVar2.k(k0Var);
                            }
                            k0 k0Var2 = (k0) eVar.g(k0.f51332f, gVar);
                            this.f51203e = k0Var2;
                            if (mVar2 != null) {
                                mVar2.k(k0Var2);
                                this.f51203e = mVar2.f();
                            }
                            this.f51201c |= 2;
                        } else if (iN == 26) {
                            if ((this.f51201c & 4) == 4) {
                                c0 c0Var = this.f51204f;
                                c0Var.getClass();
                                b0VarF = b0.f();
                                b0VarF.g(c0Var);
                            }
                            c0 c0Var2 = (c0) eVar.g(c0.l, gVar);
                            this.f51204f = c0Var2;
                            if (b0VarF != null) {
                                b0VarF.g(c0Var2);
                                this.f51204f = b0VarF.e();
                            }
                            this.f51201c |= 4;
                        } else if (iN != 34) {
                            if (!q(eVar, k3VarL, gVar, iN)) {
                            }
                        } else {
                            int i10 = (c4 == true ? 1 : 0) & '\b';
                            c4 = c4;
                            if (i10 != 8) {
                                this.f51205g = new ArrayList();
                                c4 = '\b';
                            }
                            this.f51205g.add(eVar.g(j.K, gVar));
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
                if (((c4 == true ? 1 : 0) & '\b') == 8) {
                    this.f51205g = Collections.unmodifiableList(this.f51205g);
                }
                try {
                    k3VarL.j();
                } catch (IOException unused) {
                } finally {
                    this.f51200b = cVar.h();
                }
                p();
                throw th2;
            }
        }
        if (((c4 == true ? 1 : 0) & '\b') == 8) {
            this.f51205g = Collections.unmodifiableList(this.f51205g);
        }
        try {
            k3VarL.j();
        } catch (IOException unused2) {
        } finally {
            this.f51200b = cVar.h();
        }
        p();
    }
}
