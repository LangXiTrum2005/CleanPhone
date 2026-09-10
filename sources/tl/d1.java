package tl;

import com.google.android.gms.internal.ads.k3;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class d1 extends zl.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d1 f51184e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f51185f = new a(23);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zl.d f51186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f51187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte f51188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f51189d;

    static {
        d1 d1Var = new d1();
        f51184e = d1Var;
        d1Var.f51187b = Collections.EMPTY_LIST;
    }

    public d1() {
        this.f51188c = (byte) -1;
        this.f51189d = -1;
        this.f51186a = zl.d.f55026a;
    }

    @Override // zl.a
    public final int d() {
        int i10 = this.f51189d;
        if (i10 != -1) {
            return i10;
        }
        int iE = 0;
        for (int i11 = 0; i11 < this.f51187b.size(); i11++) {
            iE += k3.e(1, (zl.a) this.f51187b.get(i11));
        }
        int size = this.f51186a.size() + iE;
        this.f51189d = size;
        return size;
    }

    @Override // zl.a
    public final zl.i g() {
        m mVar = new m(2);
        mVar.f51354d = Collections.EMPTY_LIST;
        return mVar;
    }

    @Override // zl.a
    public final zl.i h() {
        m mVar = new m(2);
        mVar.f51354d = Collections.EMPTY_LIST;
        mVar.m(this);
        return mVar;
    }

    @Override // zl.a
    public final void i(k3 k3Var) throws IOException {
        d();
        for (int i10 = 0; i10 < this.f51187b.size(); i10++) {
            k3Var.s(1, (zl.a) this.f51187b.get(i10));
        }
        k3Var.v(this.f51186a);
    }

    @Override // zl.u
    public final boolean isInitialized() {
        if (this.f51188c == 1) {
            return true;
        }
        this.f51188c = (byte) 1;
        return true;
    }

    public final m l() {
        m mVar = new m(2);
        mVar.f51354d = Collections.EMPTY_LIST;
        mVar.m(this);
        return mVar;
    }

    public d1(m mVar) {
        this.f51188c = (byte) -1;
        this.f51189d = -1;
        this.f51186a = mVar.f55044a;
    }

    public d1(zl.e eVar, zl.g gVar) {
        this.f51188c = (byte) -1;
        this.f51189d = -1;
        this.f51187b = Collections.EMPTY_LIST;
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
                                this.f51187b = new ArrayList();
                                z11 = true;
                            }
                            this.f51187b.add(eVar.g(c1.l, gVar));
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
                    this.f51187b = Collections.unmodifiableList(this.f51187b);
                }
                try {
                    k3VarL.j();
                } catch (IOException unused) {
                } finally {
                    this.f51186a = cVar.h();
                }
                throw th2;
            }
        }
        if (z11) {
            this.f51187b = Collections.unmodifiableList(this.f51187b);
        }
        try {
            k3VarL.j();
        } catch (IOException unused2) {
        } finally {
            this.f51186a = cVar.h();
        }
    }
}
