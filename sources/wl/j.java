package wl;

import com.google.android.gms.internal.ads.k3;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import zl.n;
import zl.q;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class j extends n {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final j f53458g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final tl.a f53459h = new tl.a(27);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zl.d f53460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f53461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f53462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f53463d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte f53464e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f53465f;

    static {
        j jVar = new j();
        f53458g = jVar;
        List list = Collections.EMPTY_LIST;
        jVar.f53461b = list;
        jVar.f53462c = list;
    }

    public j() {
        this.f53463d = -1;
        this.f53464e = (byte) -1;
        this.f53465f = -1;
        this.f53460a = zl.d.f55026a;
    }

    @Override // zl.a
    public final int d() {
        int i10 = this.f53465f;
        if (i10 != -1) {
            return i10;
        }
        int iE = 0;
        for (int i11 = 0; i11 < this.f53461b.size(); i11++) {
            iE += k3.e(1, (zl.a) this.f53461b.get(i11));
        }
        int iD = 0;
        for (int i12 = 0; i12 < this.f53462c.size(); i12++) {
            iD += k3.d(((Integer) this.f53462c.get(i12)).intValue());
        }
        int iD2 = iE + iD;
        if (!this.f53462c.isEmpty()) {
            iD2 = iD2 + 1 + k3.d(iD);
        }
        this.f53463d = iD;
        int size = this.f53460a.size() + iD2;
        this.f53465f = size;
        return size;
    }

    @Override // zl.a
    public final zl.i g() {
        f fVar = new f();
        List list = Collections.EMPTY_LIST;
        fVar.f53431c = list;
        fVar.f53432d = list;
        return fVar;
    }

    @Override // zl.a
    public final zl.i h() {
        f fVar = new f();
        List list = Collections.EMPTY_LIST;
        fVar.f53431c = list;
        fVar.f53432d = list;
        fVar.f(this);
        return fVar;
    }

    @Override // zl.a
    public final void i(k3 k3Var) throws IOException {
        d();
        for (int i10 = 0; i10 < this.f53461b.size(); i10++) {
            k3Var.s(1, (zl.a) this.f53461b.get(i10));
        }
        if (this.f53462c.size() > 0) {
            k3Var.z(42);
            k3Var.z(this.f53463d);
        }
        for (int i11 = 0; i11 < this.f53462c.size(); i11++) {
            k3Var.r(((Integer) this.f53462c.get(i11)).intValue());
        }
        k3Var.v(this.f53460a);
    }

    @Override // zl.u
    public final boolean isInitialized() {
        if (this.f53464e == 1) {
            return true;
        }
        this.f53464e = (byte) 1;
        return true;
    }

    public j(f fVar) {
        this.f53463d = -1;
        this.f53464e = (byte) -1;
        this.f53465f = -1;
        this.f53460a = fVar.f55044a;
    }

    public j(zl.e eVar, zl.g gVar) {
        this.f53463d = -1;
        this.f53464e = (byte) -1;
        this.f53465f = -1;
        List list = Collections.EMPTY_LIST;
        this.f53461b = list;
        this.f53462c = list;
        zl.c cVar = new zl.c();
        k3 k3VarL = k3.l(cVar, 1);
        boolean z10 = false;
        int i10 = 0;
        while (!z10) {
            try {
                try {
                    int iN = eVar.n();
                    if (iN != 0) {
                        if (iN == 10) {
                            if ((i10 & 1) != 1) {
                                this.f53461b = new ArrayList();
                                i10 |= 1;
                            }
                            this.f53461b.add(eVar.g(i.f53446n, gVar));
                        } else if (iN == 40) {
                            if ((i10 & 2) != 2) {
                                this.f53462c = new ArrayList();
                                i10 |= 2;
                            }
                            this.f53462c.add(Integer.valueOf(eVar.k()));
                        } else if (iN != 42) {
                            if (!eVar.q(iN, k3VarL)) {
                            }
                        } else {
                            int iD = eVar.d(eVar.k());
                            if ((i10 & 2) != 2 && eVar.b() > 0) {
                                this.f53462c = new ArrayList();
                                i10 |= 2;
                            }
                            while (eVar.b() > 0) {
                                this.f53462c.add(Integer.valueOf(eVar.k()));
                            }
                            eVar.c(iD);
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
                if ((i10 & 1) == 1) {
                    this.f53461b = Collections.unmodifiableList(this.f53461b);
                }
                if ((i10 & 2) == 2) {
                    this.f53462c = Collections.unmodifiableList(this.f53462c);
                }
                try {
                    k3VarL.j();
                } catch (IOException unused) {
                } finally {
                    this.f53460a = cVar.h();
                }
                throw th2;
            }
        }
        if ((i10 & 1) == 1) {
            this.f53461b = Collections.unmodifiableList(this.f53461b);
        }
        if ((i10 & 2) == 2) {
            this.f53462c = Collections.unmodifiableList(this.f53462c);
        }
        try {
            k3VarL.j();
        } catch (IOException unused2) {
        } finally {
            this.f53460a = cVar.h();
        }
    }
}
