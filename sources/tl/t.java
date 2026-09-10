package tl;

import com.google.android.gms.internal.ads.k3;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class t extends zl.k {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final t f51463g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f51464h = new a(7);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zl.d f51465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f51466c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f51467d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte f51468e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f51469f;

    static {
        t tVar = new t();
        f51463g = tVar;
        tVar.f51467d = 0;
    }

    public t(s sVar) {
        super(sVar);
        this.f51468e = (byte) -1;
        this.f51469f = -1;
        this.f51465b = sVar.f55044a;
    }

    @Override // zl.a
    public final int d() {
        int i10 = this.f51469f;
        if (i10 != -1) {
            return i10;
        }
        int size = this.f51465b.size() + m() + ((this.f51466c & 1) == 1 ? k3.c(1, this.f51467d) : 0);
        this.f51469f = size;
        return size;
    }

    @Override // zl.a
    public final zl.i g() {
        return new s();
    }

    @Override // zl.u
    public final zl.a getDefaultInstanceForType() {
        return f51463g;
    }

    @Override // zl.a
    public final zl.i h() {
        s sVar = new s();
        sVar.e(this);
        return sVar;
    }

    @Override // zl.a
    public final void i(k3 k3Var) throws IOException {
        d();
        v6.c cVar = new v6.c(this);
        if ((this.f51466c & 1) == 1) {
            k3Var.q(1, this.f51467d);
        }
        cVar.s(200, k3Var);
        k3Var.v(this.f51465b);
    }

    @Override // zl.u
    public final boolean isInitialized() {
        byte b10 = this.f51468e;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (l()) {
            this.f51468e = (byte) 1;
            return true;
        }
        this.f51468e = (byte) 0;
        return false;
    }

    public t() {
        this.f51468e = (byte) -1;
        this.f51469f = -1;
        this.f51465b = zl.d.f55026a;
    }

    public t(zl.e eVar, zl.g gVar) {
        this.f51468e = (byte) -1;
        this.f51469f = -1;
        boolean z10 = false;
        this.f51467d = 0;
        zl.c cVar = new zl.c();
        k3 k3VarL = k3.l(cVar, 1);
        while (!z10) {
            try {
                try {
                    int iN = eVar.n();
                    if (iN != 0) {
                        if (iN != 8) {
                            if (!q(eVar, k3VarL, gVar, iN)) {
                            }
                        } else {
                            this.f51466c |= 1;
                            this.f51467d = eVar.k();
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
                try {
                    k3VarL.j();
                } catch (IOException unused) {
                } finally {
                    this.f51465b = cVar.h();
                }
                p();
                throw th2;
            }
        }
        try {
            k3VarL.j();
        } catch (IOException unused2) {
        } finally {
            this.f51465b = cVar.h();
        }
        p();
    }
}
