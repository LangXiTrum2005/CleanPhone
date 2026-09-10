package tl;

import com.google.android.gms.internal.ads.k3;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class w0 extends zl.n {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final w0 f51519g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f51520h = new a(20);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zl.d f51521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f51522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f51523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f51524d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte f51525e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f51526f;

    static {
        w0 w0Var = new w0();
        f51519g = w0Var;
        w0Var.f51523c = Collections.EMPTY_LIST;
        w0Var.f51524d = -1;
    }

    public w0() {
        this.f51525e = (byte) -1;
        this.f51526f = -1;
        this.f51521a = zl.d.f55026a;
    }

    public static f l(w0 w0Var) {
        f fVarI = f.i();
        fVarI.l(w0Var);
        return fVarI;
    }

    @Override // zl.a
    public final int d() {
        int i10 = this.f51526f;
        if (i10 != -1) {
            return i10;
        }
        int iC = 0;
        for (int i11 = 0; i11 < this.f51523c.size(); i11++) {
            iC += k3.e(1, (zl.a) this.f51523c.get(i11));
        }
        if ((this.f51522b & 1) == 1) {
            iC += k3.c(2, this.f51524d);
        }
        int size = this.f51521a.size() + iC;
        this.f51526f = size;
        return size;
    }

    @Override // zl.a
    public final zl.i g() {
        return f.i();
    }

    @Override // zl.a
    public final zl.i h() {
        return l(this);
    }

    @Override // zl.a
    public final void i(k3 k3Var) throws IOException {
        d();
        for (int i10 = 0; i10 < this.f51523c.size(); i10++) {
            k3Var.s(1, (zl.a) this.f51523c.get(i10));
        }
        if ((this.f51522b & 1) == 1) {
            k3Var.q(2, this.f51524d);
        }
        k3Var.v(this.f51521a);
    }

    @Override // zl.u
    public final boolean isInitialized() {
        byte b10 = this.f51525e;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < this.f51523c.size(); i10++) {
            if (!((q0) this.f51523c.get(i10)).isInitialized()) {
                this.f51525e = (byte) 0;
                return false;
            }
        }
        this.f51525e = (byte) 1;
        return true;
    }

    public final f m() {
        return l(this);
    }

    public w0(f fVar) {
        this.f51525e = (byte) -1;
        this.f51526f = -1;
        this.f51521a = fVar.f55044a;
    }

    public w0(zl.e eVar, zl.g gVar) {
        this.f51525e = (byte) -1;
        this.f51526f = -1;
        this.f51523c = Collections.EMPTY_LIST;
        this.f51524d = -1;
        zl.c cVar = new zl.c();
        k3 k3VarL = k3.l(cVar, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    try {
                        int iN = eVar.n();
                        if (iN != 0) {
                            if (iN == 10) {
                                if (!z11) {
                                    this.f51523c = new ArrayList();
                                    z11 = true;
                                }
                                this.f51523c.add(eVar.g(q0.f51410u, gVar));
                            } else if (iN != 16) {
                                if (!eVar.q(iN, k3VarL)) {
                                }
                            } else {
                                this.f51522b |= 1;
                                this.f51524d = eVar.k();
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
                if (z11) {
                    this.f51523c = Collections.unmodifiableList(this.f51523c);
                }
                try {
                    k3VarL.j();
                } catch (IOException unused) {
                } finally {
                    this.f51521a = cVar.h();
                }
                throw th2;
            }
        }
        if (z11) {
            this.f51523c = Collections.unmodifiableList(this.f51523c);
        }
        try {
            k3VarL.j();
        } catch (IOException unused2) {
        } finally {
            this.f51521a = cVar.h();
        }
    }
}
