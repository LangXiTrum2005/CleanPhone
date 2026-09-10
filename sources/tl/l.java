package tl;

import com.google.android.gms.internal.ads.k3;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class l extends zl.k {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final l f51337i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f51338j = new a(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zl.d f51339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f51340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f51341d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f51342e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f51343f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte f51344g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f51345h;

    static {
        l lVar = new l();
        f51337i = lVar;
        lVar.f51341d = 6;
        List list = Collections.EMPTY_LIST;
        lVar.f51342e = list;
        lVar.f51343f = list;
    }

    public l(k kVar) {
        super(kVar);
        this.f51344g = (byte) -1;
        this.f51345h = -1;
        this.f51339b = kVar.f55044a;
    }

    @Override // zl.a
    public final int d() {
        int i10 = this.f51345h;
        if (i10 != -1) {
            return i10;
        }
        int iC = (this.f51340c & 1) == 1 ? k3.c(1, this.f51341d) : 0;
        for (int i11 = 0; i11 < this.f51342e.size(); i11++) {
            iC += k3.e(2, (zl.a) this.f51342e.get(i11));
        }
        int iD = 0;
        for (int i12 = 0; i12 < this.f51343f.size(); i12++) {
            iD += k3.d(((Integer) this.f51343f.get(i12)).intValue());
        }
        int size = this.f51339b.size() + m() + (this.f51343f.size() * 2) + iC + iD;
        this.f51345h = size;
        return size;
    }

    @Override // zl.a
    public final zl.i g() {
        return k.f();
    }

    @Override // zl.u
    public final zl.a getDefaultInstanceForType() {
        return f51337i;
    }

    @Override // zl.a
    public final zl.i h() {
        k kVarF = k.f();
        kVarF.g(this);
        return kVarF;
    }

    @Override // zl.a
    public final void i(k3 k3Var) throws IOException {
        d();
        v6.c cVar = new v6.c(this);
        if ((this.f51340c & 1) == 1) {
            k3Var.q(1, this.f51341d);
        }
        for (int i10 = 0; i10 < this.f51342e.size(); i10++) {
            k3Var.s(2, (zl.a) this.f51342e.get(i10));
        }
        for (int i11 = 0; i11 < this.f51343f.size(); i11++) {
            k3Var.q(31, ((Integer) this.f51343f.get(i11)).intValue());
        }
        cVar.s(19000, k3Var);
        k3Var.v(this.f51339b);
    }

    @Override // zl.u
    public final boolean isInitialized() {
        byte b10 = this.f51344g;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < this.f51342e.size(); i10++) {
            if (!((y0) this.f51342e.get(i10)).isInitialized()) {
                this.f51344g = (byte) 0;
                return false;
            }
        }
        if (l()) {
            this.f51344g = (byte) 1;
            return true;
        }
        this.f51344g = (byte) 0;
        return false;
    }

    public l() {
        this.f51344g = (byte) -1;
        this.f51345h = -1;
        this.f51339b = zl.d.f55026a;
    }

    public l(zl.e eVar, zl.g gVar) {
        this.f51344g = (byte) -1;
        this.f51345h = -1;
        this.f51341d = 6;
        List list = Collections.EMPTY_LIST;
        this.f51342e = list;
        this.f51343f = list;
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
                            this.f51340c |= 1;
                            this.f51341d = eVar.k();
                        } else if (iN == 18) {
                            if ((i10 & 2) != 2) {
                                this.f51342e = new ArrayList();
                                i10 |= 2;
                            }
                            this.f51342e.add(eVar.g(y0.f51568m, gVar));
                        } else if (iN == 248) {
                            if ((i10 & 4) != 4) {
                                this.f51343f = new ArrayList();
                                i10 |= 4;
                            }
                            this.f51343f.add(Integer.valueOf(eVar.k()));
                        } else if (iN != 250) {
                            if (!q(eVar, k3VarL, gVar, iN)) {
                            }
                        } else {
                            int iD = eVar.d(eVar.k());
                            if ((i10 & 4) != 4 && eVar.b() > 0) {
                                this.f51343f = new ArrayList();
                                i10 |= 4;
                            }
                            while (eVar.b() > 0) {
                                this.f51343f.add(Integer.valueOf(eVar.k()));
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
                if ((i10 & 2) == 2) {
                    this.f51342e = Collections.unmodifiableList(this.f51342e);
                }
                if ((i10 & 4) == 4) {
                    this.f51343f = Collections.unmodifiableList(this.f51343f);
                }
                try {
                    k3VarL.j();
                } catch (IOException unused) {
                } finally {
                    this.f51339b = cVar.h();
                }
                p();
                throw th2;
            }
        }
        if ((i10 & 2) == 2) {
            this.f51342e = Collections.unmodifiableList(this.f51342e);
        }
        if ((i10 & 4) == 4) {
            this.f51343f = Collections.unmodifiableList(this.f51343f);
        }
        try {
            k3VarL.j();
        } catch (IOException unused2) {
        } finally {
            this.f51339b = cVar.h();
        }
        p();
    }
}
