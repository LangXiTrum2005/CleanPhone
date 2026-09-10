package wl;

import com.google.android.gms.internal.ads.k3;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import zl.n;
import zl.q;
import zl.t;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class i extends n {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final i f53445m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final tl.a f53446n = new tl.a(28);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zl.d f53447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f53448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f53449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f53450d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f53451e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public h f53452f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f53453g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f53454h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List f53455i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f53456j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public byte f53457k;
    public int l;

    static {
        i iVar = new i();
        f53445m = iVar;
        iVar.f53449c = 1;
        iVar.f53450d = 0;
        iVar.f53451e = "";
        iVar.f53452f = h.NONE;
        List list = Collections.EMPTY_LIST;
        iVar.f53453g = list;
        iVar.f53455i = list;
    }

    public i() {
        this.f53454h = -1;
        this.f53456j = -1;
        this.f53457k = (byte) -1;
        this.l = -1;
        this.f53447a = zl.d.f55026a;
    }

    @Override // zl.a
    public final int d() {
        zl.d tVar;
        int i10 = this.l;
        if (i10 != -1) {
            return i10;
        }
        int iC = (this.f53448b & 1) == 1 ? k3.c(1, this.f53449c) : 0;
        if ((this.f53448b & 2) == 2) {
            iC += k3.c(2, this.f53450d);
        }
        if ((this.f53448b & 8) == 8) {
            iC += k3.b(3, this.f53452f.f53444a);
        }
        int iD = 0;
        for (int i11 = 0; i11 < this.f53453g.size(); i11++) {
            iD += k3.d(((Integer) this.f53453g.get(i11)).intValue());
        }
        int iD2 = iC + iD;
        if (!this.f53453g.isEmpty()) {
            iD2 = iD2 + 1 + k3.d(iD);
        }
        this.f53454h = iD;
        int iD3 = 0;
        for (int i12 = 0; i12 < this.f53455i.size(); i12++) {
            iD3 += k3.d(((Integer) this.f53455i.get(i12)).intValue());
        }
        int size = iD2 + iD3;
        if (!this.f53455i.isEmpty()) {
            size = size + 1 + k3.d(iD3);
        }
        this.f53456j = iD3;
        if ((this.f53448b & 4) == 4) {
            Object obj = this.f53451e;
            if (obj instanceof String) {
                try {
                    tVar = new t(((String) obj).getBytes("UTF-8"));
                    this.f53451e = tVar;
                } catch (UnsupportedEncodingException e10) {
                    throw new RuntimeException("UTF-8 not supported?", e10);
                }
            } else {
                tVar = (zl.d) obj;
            }
            size += tVar.size() + k3.g(tVar.size()) + k3.i(6);
        }
        int size2 = this.f53447a.size() + size;
        this.l = size2;
        return size2;
    }

    @Override // zl.a
    public final zl.i g() {
        return g.f();
    }

    @Override // zl.a
    public final zl.i h() {
        g gVarF = g.f();
        gVarF.g(this);
        return gVarF;
    }

    @Override // zl.a
    public final void i(k3 k3Var) throws IOException {
        zl.d tVar;
        d();
        if ((this.f53448b & 1) == 1) {
            k3Var.q(1, this.f53449c);
        }
        if ((this.f53448b & 2) == 2) {
            k3Var.q(2, this.f53450d);
        }
        if ((this.f53448b & 8) == 8) {
            k3Var.p(3, this.f53452f.f53444a);
        }
        if (this.f53453g.size() > 0) {
            k3Var.z(34);
            k3Var.z(this.f53454h);
        }
        for (int i10 = 0; i10 < this.f53453g.size(); i10++) {
            k3Var.r(((Integer) this.f53453g.get(i10)).intValue());
        }
        if (this.f53455i.size() > 0) {
            k3Var.z(42);
            k3Var.z(this.f53456j);
        }
        for (int i11 = 0; i11 < this.f53455i.size(); i11++) {
            k3Var.r(((Integer) this.f53455i.get(i11)).intValue());
        }
        if ((this.f53448b & 4) == 4) {
            Object obj = this.f53451e;
            if (obj instanceof String) {
                try {
                    tVar = new t(((String) obj).getBytes("UTF-8"));
                    this.f53451e = tVar;
                } catch (UnsupportedEncodingException e10) {
                    throw new RuntimeException("UTF-8 not supported?", e10);
                }
            } else {
                tVar = (zl.d) obj;
            }
            k3Var.B(6, 2);
            k3Var.z(tVar.size());
            k3Var.v(tVar);
        }
        k3Var.v(this.f53447a);
    }

    @Override // zl.u
    public final boolean isInitialized() {
        if (this.f53457k == 1) {
            return true;
        }
        this.f53457k = (byte) 1;
        return true;
    }

    public i(g gVar) {
        this.f53454h = -1;
        this.f53456j = -1;
        this.f53457k = (byte) -1;
        this.l = -1;
        this.f53447a = gVar.f55044a;
    }

    public i(zl.e eVar) {
        h hVar;
        this.f53454h = -1;
        this.f53456j = -1;
        this.f53457k = (byte) -1;
        this.l = -1;
        this.f53449c = 1;
        boolean z10 = false;
        this.f53450d = 0;
        this.f53451e = "";
        h hVar2 = h.NONE;
        this.f53452f = hVar2;
        List list = Collections.EMPTY_LIST;
        this.f53453g = list;
        this.f53455i = list;
        zl.c cVar = new zl.c();
        k3 k3VarL = k3.l(cVar, 1);
        int i10 = 0;
        while (!z10) {
            try {
                try {
                    int iN = eVar.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.f53448b |= 1;
                            this.f53449c = eVar.k();
                        } else if (iN == 16) {
                            this.f53448b |= 2;
                            this.f53450d = eVar.k();
                        } else if (iN == 24) {
                            int iK = eVar.k();
                            if (iK == 0) {
                                hVar = hVar2;
                            } else if (iK != 1) {
                                hVar = iK != 2 ? null : h.DESC_TO_CLASS_ID;
                            } else {
                                hVar = h.INTERNAL_TO_CLASS_ID;
                            }
                            if (hVar == null) {
                                k3VarL.z(iN);
                                k3VarL.z(iK);
                            } else {
                                this.f53448b |= 8;
                                this.f53452f = hVar;
                            }
                        } else if (iN == 32) {
                            if ((i10 & 16) != 16) {
                                this.f53453g = new ArrayList();
                                i10 |= 16;
                            }
                            this.f53453g.add(Integer.valueOf(eVar.k()));
                        } else if (iN == 34) {
                            int iD = eVar.d(eVar.k());
                            if ((i10 & 16) != 16 && eVar.b() > 0) {
                                this.f53453g = new ArrayList();
                                i10 |= 16;
                            }
                            while (eVar.b() > 0) {
                                this.f53453g.add(Integer.valueOf(eVar.k()));
                            }
                            eVar.c(iD);
                        } else if (iN == 40) {
                            if ((i10 & 32) != 32) {
                                this.f53455i = new ArrayList();
                                i10 |= 32;
                            }
                            this.f53455i.add(Integer.valueOf(eVar.k()));
                        } else if (iN == 42) {
                            int iD2 = eVar.d(eVar.k());
                            if ((i10 & 32) != 32 && eVar.b() > 0) {
                                this.f53455i = new ArrayList();
                                i10 |= 32;
                            }
                            while (eVar.b() > 0) {
                                this.f53455i.add(Integer.valueOf(eVar.k()));
                            }
                            eVar.c(iD2);
                        } else if (iN != 50) {
                            if (!eVar.q(iN, k3VarL)) {
                            }
                        } else {
                            t tVarE = eVar.e();
                            this.f53448b |= 4;
                            this.f53451e = tVarE;
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
                if ((i10 & 16) == 16) {
                    this.f53453g = Collections.unmodifiableList(this.f53453g);
                }
                if ((i10 & 32) == 32) {
                    this.f53455i = Collections.unmodifiableList(this.f53455i);
                }
                try {
                    k3VarL.j();
                } catch (IOException unused) {
                } finally {
                    this.f53447a = cVar.h();
                }
                throw th2;
            }
        }
        if ((i10 & 16) == 16) {
            this.f53453g = Collections.unmodifiableList(this.f53453g);
        }
        if ((i10 & 32) == 32) {
            this.f53455i = Collections.unmodifiableList(this.f53455i);
        }
        try {
            k3VarL.j();
        } catch (IOException unused2) {
        } finally {
            this.f53447a = cVar.h();
        }
    }
}
