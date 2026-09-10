package wl;

import com.google.android.gms.internal.ads.k3;
import java.io.IOException;
import zl.n;
import zl.q;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends n {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f53397g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final tl.a f53398h = new tl.a(24);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zl.d f53399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f53400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f53401c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f53402d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte f53403e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f53404f;

    static {
        b bVar = new b();
        f53397g = bVar;
        bVar.f53401c = 0;
        bVar.f53402d = 0;
    }

    public b() {
        this.f53403e = (byte) -1;
        this.f53404f = -1;
        this.f53399a = zl.d.f55026a;
    }

    @Override // zl.a
    public final int d() {
        int i10 = this.f53404f;
        if (i10 != -1) {
            return i10;
        }
        int iC = (this.f53400b & 1) == 1 ? k3.c(1, this.f53401c) : 0;
        if ((this.f53400b & 2) == 2) {
            iC += k3.c(2, this.f53402d);
        }
        int size = this.f53399a.size() + iC;
        this.f53404f = size;
        return size;
    }

    @Override // zl.a
    public final zl.i g() {
        return new a(0);
    }

    @Override // zl.a
    public final zl.i h() {
        a aVar = new a(0);
        aVar.g(this);
        return aVar;
    }

    @Override // zl.a
    public final void i(k3 k3Var) throws IOException {
        d();
        if ((this.f53400b & 1) == 1) {
            k3Var.q(1, this.f53401c);
        }
        if ((this.f53400b & 2) == 2) {
            k3Var.q(2, this.f53402d);
        }
        k3Var.v(this.f53399a);
    }

    @Override // zl.u
    public final boolean isInitialized() {
        if (this.f53403e == 1) {
            return true;
        }
        this.f53403e = (byte) 1;
        return true;
    }

    public b(a aVar) {
        this.f53403e = (byte) -1;
        this.f53404f = -1;
        this.f53399a = aVar.f55044a;
    }

    public b(zl.e eVar) {
        this.f53403e = (byte) -1;
        this.f53404f = -1;
        boolean z10 = false;
        this.f53401c = 0;
        this.f53402d = 0;
        zl.c cVar = new zl.c();
        k3 k3VarL = k3.l(cVar, 1);
        while (!z10) {
            try {
                try {
                    int iN = eVar.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.f53400b |= 1;
                            this.f53401c = eVar.k();
                        } else if (iN != 16) {
                            if (!eVar.q(iN, k3VarL)) {
                            }
                        } else {
                            this.f53400b |= 2;
                            this.f53402d = eVar.k();
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
                    this.f53399a = cVar.h();
                }
                throw th2;
            }
        }
        try {
            k3VarL.j();
        } catch (IOException unused2) {
        } finally {
            this.f53399a = cVar.h();
        }
    }
}
