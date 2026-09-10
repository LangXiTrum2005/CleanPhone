package tl;

import com.google.android.gms.internal.ads.k3;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class g extends zl.n {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final g f51228g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f51229h = new a(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zl.d f51230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f51231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f51232c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f51233d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte f51234e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f51235f;

    static {
        g gVar = new g();
        f51228g = gVar;
        gVar.f51232c = 0;
        gVar.f51233d = Collections.EMPTY_LIST;
    }

    public g() {
        this.f51234e = (byte) -1;
        this.f51235f = -1;
        this.f51230a = zl.d.f55026a;
    }

    @Override // zl.a
    public final int d() {
        int i10 = this.f51235f;
        if (i10 != -1) {
            return i10;
        }
        int iC = (this.f51231b & 1) == 1 ? k3.c(1, this.f51232c) : 0;
        for (int i11 = 0; i11 < this.f51233d.size(); i11++) {
            iC += k3.e(2, (zl.a) this.f51233d.get(i11));
        }
        int size = this.f51230a.size() + iC;
        this.f51235f = size;
        return size;
    }

    @Override // zl.a
    public final zl.i g() {
        f fVar = new f(0);
        fVar.f51212d = Collections.EMPTY_LIST;
        return fVar;
    }

    @Override // zl.a
    public final zl.i h() {
        f fVar = new f(0);
        fVar.f51212d = Collections.EMPTY_LIST;
        fVar.k(this);
        return fVar;
    }

    @Override // zl.a
    public final void i(k3 k3Var) throws IOException {
        d();
        if ((this.f51231b & 1) == 1) {
            k3Var.q(1, this.f51232c);
        }
        for (int i10 = 0; i10 < this.f51233d.size(); i10++) {
            k3Var.s(2, (zl.a) this.f51233d.get(i10));
        }
        k3Var.v(this.f51230a);
    }

    @Override // zl.u
    public final boolean isInitialized() {
        byte b10 = this.f51234e;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if ((this.f51231b & 1) != 1) {
            this.f51234e = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < this.f51233d.size(); i10++) {
            if (!((e) this.f51233d.get(i10)).isInitialized()) {
                this.f51234e = (byte) 0;
                return false;
            }
        }
        this.f51234e = (byte) 1;
        return true;
    }

    public g(f fVar) {
        this.f51234e = (byte) -1;
        this.f51235f = -1;
        this.f51230a = fVar.f55044a;
    }

    public g(zl.e eVar, zl.g gVar) {
        this.f51234e = (byte) -1;
        this.f51235f = -1;
        boolean z10 = false;
        this.f51232c = 0;
        this.f51233d = Collections.EMPTY_LIST;
        zl.c cVar = new zl.c();
        k3 k3VarL = k3.l(cVar, 1);
        char c4 = 0;
        while (!z10) {
            try {
                try {
                    try {
                        int iN = eVar.n();
                        if (iN != 0) {
                            if (iN == 8) {
                                this.f51231b |= 1;
                                this.f51232c = eVar.k();
                            } else if (iN != 18) {
                                if (!eVar.q(iN, k3VarL)) {
                                }
                            } else {
                                if ((c4 & 2) != 2) {
                                    this.f51233d = new ArrayList();
                                    c4 = 2;
                                }
                                this.f51233d.add(eVar.g(e.f51191h, gVar));
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
                if ((c4 & 2) == 2) {
                    this.f51233d = Collections.unmodifiableList(this.f51233d);
                }
                try {
                    k3VarL.j();
                } catch (IOException unused) {
                } finally {
                    this.f51230a = cVar.h();
                }
                throw th2;
            }
        }
        if ((c4 & 2) == 2) {
            this.f51233d = Collections.unmodifiableList(this.f51233d);
        }
        try {
            k3VarL.j();
        } catch (IOException unused2) {
        } finally {
            this.f51230a = cVar.h();
        }
    }
}
