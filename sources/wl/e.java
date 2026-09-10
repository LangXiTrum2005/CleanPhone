package wl;

import com.google.android.gms.internal.ads.k3;
import java.io.IOException;
import zl.n;
import zl.q;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends n {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final e f53419j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final tl.a f53420k = new tl.a(26);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zl.d f53421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f53422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f53423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f53424d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f53425e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f53426f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f53427g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte f53428h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f53429i;

    static {
        e eVar = new e();
        f53419j = eVar;
        eVar.f53423c = b.f53397g;
        c cVar = c.f53405g;
        eVar.f53424d = cVar;
        eVar.f53425e = cVar;
        eVar.f53426f = cVar;
        eVar.f53427g = cVar;
    }

    public e() {
        this.f53428h = (byte) -1;
        this.f53429i = -1;
        this.f53421a = zl.d.f55026a;
    }

    @Override // zl.a
    public final int d() {
        int i10 = this.f53429i;
        if (i10 != -1) {
            return i10;
        }
        int iE = (this.f53422b & 1) == 1 ? k3.e(1, this.f53423c) : 0;
        if ((this.f53422b & 2) == 2) {
            iE += k3.e(2, this.f53424d);
        }
        if ((this.f53422b & 4) == 4) {
            iE += k3.e(3, this.f53425e);
        }
        if ((this.f53422b & 8) == 8) {
            iE += k3.e(4, this.f53426f);
        }
        if ((this.f53422b & 16) == 16) {
            iE += k3.e(5, this.f53427g);
        }
        int size = this.f53421a.size() + iE;
        this.f53429i = size;
        return size;
    }

    @Override // zl.a
    public final zl.i g() {
        return d.f();
    }

    @Override // zl.a
    public final zl.i h() {
        d dVarF = d.f();
        dVarF.g(this);
        return dVarF;
    }

    @Override // zl.a
    public final void i(k3 k3Var) throws IOException {
        d();
        if ((this.f53422b & 1) == 1) {
            k3Var.s(1, this.f53423c);
        }
        if ((this.f53422b & 2) == 2) {
            k3Var.s(2, this.f53424d);
        }
        if ((this.f53422b & 4) == 4) {
            k3Var.s(3, this.f53425e);
        }
        if ((this.f53422b & 8) == 8) {
            k3Var.s(4, this.f53426f);
        }
        if ((this.f53422b & 16) == 16) {
            k3Var.s(5, this.f53427g);
        }
        k3Var.v(this.f53421a);
    }

    @Override // zl.u
    public final boolean isInitialized() {
        if (this.f53428h == 1) {
            return true;
        }
        this.f53428h = (byte) 1;
        return true;
    }

    public e(d dVar) {
        this.f53428h = (byte) -1;
        this.f53429i = -1;
        this.f53421a = dVar.f55044a;
    }

    public e(zl.e eVar, zl.g gVar) {
        this.f53428h = (byte) -1;
        this.f53429i = -1;
        this.f53423c = b.f53397g;
        c cVar = c.f53405g;
        this.f53424d = cVar;
        this.f53425e = cVar;
        this.f53426f = cVar;
        this.f53427g = cVar;
        zl.c cVar2 = new zl.c();
        k3 k3VarL = k3.l(cVar2, 1);
        boolean z10 = false;
        while (!z10) {
            try {
                try {
                    int iN = eVar.n();
                    if (iN != 0) {
                        a aVarL = null;
                        if (iN == 10) {
                            if ((this.f53422b & 1) == 1) {
                                b bVar = this.f53423c;
                                bVar.getClass();
                                aVarL = new a(0);
                                aVarL.g(bVar);
                            }
                            b bVar2 = (b) eVar.g(b.f53398h, gVar);
                            this.f53423c = bVar2;
                            if (aVarL != null) {
                                aVarL.g(bVar2);
                                this.f53423c = aVarL.e();
                            }
                            this.f53422b |= 1;
                        } else if (iN == 18) {
                            if ((this.f53422b & 2) == 2) {
                                c cVar3 = this.f53424d;
                                cVar3.getClass();
                                aVarL = c.l(cVar3);
                            }
                            c cVar4 = (c) eVar.g(c.f53406h, gVar);
                            this.f53424d = cVar4;
                            if (aVarL != null) {
                                aVarL.h(cVar4);
                                this.f53424d = aVarL.f();
                            }
                            this.f53422b |= 2;
                        } else if (iN == 26) {
                            if ((this.f53422b & 4) == 4) {
                                c cVar5 = this.f53425e;
                                cVar5.getClass();
                                aVarL = c.l(cVar5);
                            }
                            c cVar6 = (c) eVar.g(c.f53406h, gVar);
                            this.f53425e = cVar6;
                            if (aVarL != null) {
                                aVarL.h(cVar6);
                                this.f53425e = aVarL.f();
                            }
                            this.f53422b |= 4;
                        } else if (iN == 34) {
                            if ((this.f53422b & 8) == 8) {
                                c cVar7 = this.f53426f;
                                cVar7.getClass();
                                aVarL = c.l(cVar7);
                            }
                            c cVar8 = (c) eVar.g(c.f53406h, gVar);
                            this.f53426f = cVar8;
                            if (aVarL != null) {
                                aVarL.h(cVar8);
                                this.f53426f = aVarL.f();
                            }
                            this.f53422b |= 8;
                        } else if (iN != 42) {
                            if (!eVar.q(iN, k3VarL)) {
                            }
                        } else {
                            if ((this.f53422b & 16) == 16) {
                                c cVar9 = this.f53427g;
                                cVar9.getClass();
                                aVarL = c.l(cVar9);
                            }
                            c cVar10 = (c) eVar.g(c.f53406h, gVar);
                            this.f53427g = cVar10;
                            if (aVarL != null) {
                                aVarL.h(cVar10);
                                this.f53427g = aVarL.f();
                            }
                            this.f53422b |= 16;
                        }
                    }
                    z10 = true;
                } catch (q e10) {
                    e10.f55076a = this;
                    throw e10;
                } catch (IOException e11) {
                    q qVar = new q(e11.getMessage());
                    qVar.f55076a = this;
                    throw qVar;
                }
            } catch (Throwable th2) {
                try {
                    k3VarL.j();
                } catch (IOException unused) {
                } finally {
                    this.f53421a = cVar2.h();
                }
                throw th2;
            }
        }
        try {
            k3VarL.j();
        } catch (IOException unused2) {
        } finally {
            this.f53421a = cVar2.h();
        }
    }
}
