package tl;

import com.google.android.gms.internal.ads.k3;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class n extends zl.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final n f51359e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f51360f = new a(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zl.d f51361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f51362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte f51363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f51364d;

    static {
        n nVar = new n();
        f51359e = nVar;
        nVar.f51362b = Collections.EMPTY_LIST;
    }

    public n() {
        this.f51363c = (byte) -1;
        this.f51364d = -1;
        this.f51361a = zl.d.f55026a;
    }

    @Override // zl.a
    public final int d() {
        int i10 = this.f51364d;
        if (i10 != -1) {
            return i10;
        }
        int iE = 0;
        for (int i11 = 0; i11 < this.f51362b.size(); i11++) {
            iE += k3.e(1, (zl.a) this.f51362b.get(i11));
        }
        int size = this.f51361a.size() + iE;
        this.f51364d = size;
        return size;
    }

    @Override // zl.a
    public final zl.i g() {
        m mVar = new m(0);
        mVar.f51354d = Collections.EMPTY_LIST;
        return mVar;
    }

    @Override // zl.a
    public final zl.i h() {
        m mVar = new m(0);
        mVar.f51354d = Collections.EMPTY_LIST;
        mVar.j(this);
        return mVar;
    }

    @Override // zl.a
    public final void i(k3 k3Var) throws IOException {
        d();
        for (int i10 = 0; i10 < this.f51362b.size(); i10++) {
            k3Var.s(1, (zl.a) this.f51362b.get(i10));
        }
        k3Var.v(this.f51361a);
    }

    @Override // zl.u
    public final boolean isInitialized() {
        byte b10 = this.f51363c;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < this.f51362b.size(); i10++) {
            if (!((r) this.f51362b.get(i10)).isInitialized()) {
                this.f51363c = (byte) 0;
                return false;
            }
        }
        this.f51363c = (byte) 1;
        return true;
    }

    public n(m mVar) {
        this.f51363c = (byte) -1;
        this.f51364d = -1;
        this.f51361a = mVar.f55044a;
    }

    public n(zl.e eVar, zl.g gVar) {
        this.f51363c = (byte) -1;
        this.f51364d = -1;
        this.f51362b = Collections.EMPTY_LIST;
        zl.c cVar = new zl.c();
        k3 k3VarL = k3.l(cVar, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    int iN = eVar.n();
                    if (iN != 0) {
                        if (iN != 10) {
                            if (!eVar.q(iN, k3VarL)) {
                            }
                        } else {
                            if (!z11) {
                                this.f51362b = new ArrayList();
                                z11 = true;
                            }
                            this.f51362b.add(eVar.g(r.f51429j, gVar));
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
                if (z11) {
                    this.f51362b = Collections.unmodifiableList(this.f51362b);
                }
                try {
                    k3VarL.j();
                } catch (IOException unused) {
                } finally {
                    this.f51361a = cVar.h();
                }
                throw th2;
            }
        }
        if (z11) {
            this.f51362b = Collections.unmodifiableList(this.f51362b);
        }
        try {
            k3VarL.j();
        } catch (IOException unused2) {
        } finally {
            this.f51361a = cVar.h();
        }
    }
}
