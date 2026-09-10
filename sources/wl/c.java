package wl;

import com.google.android.gms.internal.ads.k3;
import java.io.IOException;
import zl.n;
import zl.q;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends n {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f53405g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final tl.a f53406h = new tl.a(25);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zl.d f53407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f53408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f53409c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f53410d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte f53411e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f53412f;

    static {
        c cVar = new c();
        f53405g = cVar;
        cVar.f53409c = 0;
        cVar.f53410d = 0;
    }

    public c() {
        this.f53411e = (byte) -1;
        this.f53412f = -1;
        this.f53407a = zl.d.f55026a;
    }

    public static a l(c cVar) {
        a aVar = new a(1);
        aVar.h(cVar);
        return aVar;
    }

    @Override // zl.a
    public final int d() {
        int i10 = this.f53412f;
        if (i10 != -1) {
            return i10;
        }
        int iC = (this.f53408b & 1) == 1 ? k3.c(1, this.f53409c) : 0;
        if ((this.f53408b & 2) == 2) {
            iC += k3.c(2, this.f53410d);
        }
        int size = this.f53407a.size() + iC;
        this.f53412f = size;
        return size;
    }

    @Override // zl.a
    public final zl.i g() {
        return new a(1);
    }

    @Override // zl.a
    public final zl.i h() {
        return l(this);
    }

    @Override // zl.a
    public final void i(k3 k3Var) throws IOException {
        d();
        if ((this.f53408b & 1) == 1) {
            k3Var.q(1, this.f53409c);
        }
        if ((this.f53408b & 2) == 2) {
            k3Var.q(2, this.f53410d);
        }
        k3Var.v(this.f53407a);
    }

    @Override // zl.u
    public final boolean isInitialized() {
        if (this.f53411e == 1) {
            return true;
        }
        this.f53411e = (byte) 1;
        return true;
    }

    public c(a aVar) {
        this.f53411e = (byte) -1;
        this.f53412f = -1;
        this.f53407a = aVar.f55044a;
    }

    public c(zl.e eVar) {
        this.f53411e = (byte) -1;
        this.f53412f = -1;
        boolean z10 = false;
        this.f53409c = 0;
        this.f53410d = 0;
        zl.c cVar = new zl.c();
        k3 k3VarL = k3.l(cVar, 1);
        while (!z10) {
            try {
                try {
                    int iN = eVar.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.f53408b |= 1;
                            this.f53409c = eVar.k();
                        } else if (iN != 16) {
                            if (!eVar.q(iN, k3VarL)) {
                            }
                        } else {
                            this.f53408b |= 2;
                            this.f53410d = eVar.k();
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
                    this.f53407a = cVar.h();
                }
                throw th2;
            }
        }
        try {
            k3VarL.j();
        } catch (IOException unused2) {
        } finally {
            this.f53407a = cVar.h();
        }
    }
}
