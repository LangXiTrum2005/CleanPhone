package tl;

import com.google.android.gms.internal.ads.k3;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class r extends zl.n {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final r f51428i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f51429j = new a(6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zl.d f51430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f51431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p f51432c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f51433d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public w f51434e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public q f51435f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte f51436g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f51437h;

    static {
        r rVar = new r();
        f51428i = rVar;
        rVar.f51432c = p.RETURNS_CONSTANT;
        rVar.f51433d = Collections.EMPTY_LIST;
        rVar.f51434e = w.l;
        rVar.f51435f = q.AT_MOST_ONCE;
    }

    public r() {
        this.f51436g = (byte) -1;
        this.f51437h = -1;
        this.f51430a = zl.d.f55026a;
    }

    @Override // zl.a
    public final int d() {
        int i10 = this.f51437h;
        if (i10 != -1) {
            return i10;
        }
        int iB = (this.f51431b & 1) == 1 ? k3.b(1, this.f51432c.f51389a) : 0;
        for (int i11 = 0; i11 < this.f51433d.size(); i11++) {
            iB += k3.e(2, (zl.a) this.f51433d.get(i11));
        }
        if ((this.f51431b & 2) == 2) {
            iB += k3.e(3, this.f51434e);
        }
        if ((this.f51431b & 4) == 4) {
            iB += k3.b(4, this.f51435f.f51408a);
        }
        int size = this.f51430a.size() + iB;
        this.f51437h = size;
        return size;
    }

    @Override // zl.a
    public final zl.i g() {
        return o.f();
    }

    @Override // zl.a
    public final zl.i h() {
        o oVarF = o.f();
        oVarF.g(this);
        return oVarF;
    }

    @Override // zl.a
    public final void i(k3 k3Var) throws IOException {
        d();
        if ((this.f51431b & 1) == 1) {
            k3Var.p(1, this.f51432c.f51389a);
        }
        for (int i10 = 0; i10 < this.f51433d.size(); i10++) {
            k3Var.s(2, (zl.a) this.f51433d.get(i10));
        }
        if ((this.f51431b & 2) == 2) {
            k3Var.s(3, this.f51434e);
        }
        if ((this.f51431b & 4) == 4) {
            k3Var.p(4, this.f51435f.f51408a);
        }
        k3Var.v(this.f51430a);
    }

    @Override // zl.u
    public final boolean isInitialized() {
        byte b10 = this.f51436g;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < this.f51433d.size(); i10++) {
            if (!((w) this.f51433d.get(i10)).isInitialized()) {
                this.f51436g = (byte) 0;
                return false;
            }
        }
        if ((this.f51431b & 2) != 2 || this.f51434e.isInitialized()) {
            this.f51436g = (byte) 1;
            return true;
        }
        this.f51436g = (byte) 0;
        return false;
    }

    public r(o oVar) {
        this.f51436g = (byte) -1;
        this.f51437h = -1;
        this.f51430a = oVar.f55044a;
    }

    public r(zl.e eVar, zl.g gVar) {
        this.f51436g = (byte) -1;
        this.f51437h = -1;
        p pVar = p.RETURNS_CONSTANT;
        this.f51432c = pVar;
        this.f51433d = Collections.EMPTY_LIST;
        this.f51434e = w.l;
        q qVar = q.AT_MOST_ONCE;
        this.f51435f = qVar;
        zl.c cVar = new zl.c();
        k3 k3VarL = k3.l(cVar, 1);
        boolean z10 = false;
        char c4 = 0;
        while (!z10) {
            try {
                try {
                    int iN = eVar.n();
                    if (iN != 0) {
                        q qVar2 = null;
                        p pVar2 = null;
                        u uVarF = null;
                        if (iN == 8) {
                            int iK = eVar.k();
                            if (iK == 0) {
                                pVar2 = pVar;
                            } else if (iK == 1) {
                                pVar2 = p.CALLS;
                            } else if (iK == 2) {
                                pVar2 = p.RETURNS_NOT_NULL;
                            }
                            if (pVar2 == null) {
                                k3VarL.z(iN);
                                k3VarL.z(iK);
                            } else {
                                this.f51431b |= 1;
                                this.f51432c = pVar2;
                            }
                        } else if (iN == 18) {
                            int i10 = (c4 == true ? 1 : 0) & 2;
                            c4 = c4;
                            if (i10 != 2) {
                                this.f51433d = new ArrayList();
                                c4 = 2;
                            }
                            this.f51433d.add(eVar.g(w.f51507m, gVar));
                        } else if (iN == 26) {
                            if ((this.f51431b & 2) == 2) {
                                w wVar = this.f51434e;
                                wVar.getClass();
                                uVarF = u.f();
                                uVarF.g(wVar);
                            }
                            w wVar2 = (w) eVar.g(w.f51507m, gVar);
                            this.f51434e = wVar2;
                            if (uVarF != null) {
                                uVarF.g(wVar2);
                                this.f51434e = uVarF.e();
                            }
                            this.f51431b |= 2;
                        } else if (iN != 32) {
                            if (!eVar.q(iN, k3VarL)) {
                            }
                        } else {
                            int iK2 = eVar.k();
                            if (iK2 == 0) {
                                qVar2 = qVar;
                            } else if (iK2 == 1) {
                                qVar2 = q.EXACTLY_ONCE;
                            } else if (iK2 == 2) {
                                qVar2 = q.AT_LEAST_ONCE;
                            }
                            if (qVar2 == null) {
                                k3VarL.z(iN);
                                k3VarL.z(iK2);
                            } else {
                                this.f51431b |= 4;
                                this.f51435f = qVar2;
                            }
                        }
                    }
                    z10 = true;
                } catch (zl.q e10) {
                    e10.f55076a = this;
                    throw e10;
                } catch (IOException e11) {
                    zl.q qVar3 = new zl.q(e11.getMessage());
                    qVar3.f55076a = this;
                    throw qVar3;
                }
            } catch (Throwable th2) {
                if (((c4 == true ? 1 : 0) & 2) == 2) {
                    this.f51433d = Collections.unmodifiableList(this.f51433d);
                }
                try {
                    k3VarL.j();
                } catch (IOException unused) {
                } finally {
                    this.f51430a = cVar.h();
                }
                throw th2;
            }
        }
        if (((c4 == true ? 1 : 0) & 2) == 2) {
            this.f51433d = Collections.unmodifiableList(this.f51433d);
        }
        try {
            k3VarL.j();
        } catch (IOException unused2) {
        } finally {
            this.f51430a = cVar.h();
        }
    }
}
