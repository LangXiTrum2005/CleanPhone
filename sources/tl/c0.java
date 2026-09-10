package tl;

import com.google.android.gms.internal.ads.k3;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class c0 extends zl.k {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final c0 f51142k;
    public static final a l = new a(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zl.d f51143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f51144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f51145d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f51146e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f51147f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public w0 f51148g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public d1 f51149h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public byte f51150i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f51151j;

    static {
        c0 c0Var = new c0();
        f51142k = c0Var;
        List list = Collections.EMPTY_LIST;
        c0Var.f51145d = list;
        c0Var.f51146e = list;
        c0Var.f51147f = list;
        c0Var.f51148g = w0.f51519g;
        c0Var.f51149h = d1.f51184e;
    }

    public c0(b0 b0Var) {
        super(b0Var);
        this.f51150i = (byte) -1;
        this.f51151j = -1;
        this.f51143b = b0Var.f55044a;
    }

    @Override // zl.a
    public final int d() {
        int i10 = this.f51151j;
        if (i10 != -1) {
            return i10;
        }
        int iE = 0;
        for (int i11 = 0; i11 < this.f51145d.size(); i11++) {
            iE += k3.e(3, (zl.a) this.f51145d.get(i11));
        }
        for (int i12 = 0; i12 < this.f51146e.size(); i12++) {
            iE += k3.e(4, (zl.a) this.f51146e.get(i12));
        }
        for (int i13 = 0; i13 < this.f51147f.size(); i13++) {
            iE += k3.e(5, (zl.a) this.f51147f.get(i13));
        }
        if ((this.f51144c & 1) == 1) {
            iE += k3.e(30, this.f51148g);
        }
        if ((this.f51144c & 2) == 2) {
            iE += k3.e(32, this.f51149h);
        }
        int size = this.f51143b.size() + m() + iE;
        this.f51151j = size;
        return size;
    }

    @Override // zl.a
    public final zl.i g() {
        return b0.f();
    }

    @Override // zl.u
    public final zl.a getDefaultInstanceForType() {
        return f51142k;
    }

    @Override // zl.a
    public final zl.i h() {
        b0 b0VarF = b0.f();
        b0VarF.g(this);
        return b0VarF;
    }

    @Override // zl.a
    public final void i(k3 k3Var) throws IOException {
        d();
        v6.c cVar = new v6.c(this);
        for (int i10 = 0; i10 < this.f51145d.size(); i10++) {
            k3Var.s(3, (zl.a) this.f51145d.get(i10));
        }
        for (int i11 = 0; i11 < this.f51146e.size(); i11++) {
            k3Var.s(4, (zl.a) this.f51146e.get(i11));
        }
        for (int i12 = 0; i12 < this.f51147f.size(); i12++) {
            k3Var.s(5, (zl.a) this.f51147f.get(i12));
        }
        if ((this.f51144c & 1) == 1) {
            k3Var.s(30, this.f51148g);
        }
        if ((this.f51144c & 2) == 2) {
            k3Var.s(32, this.f51149h);
        }
        cVar.s(200, k3Var);
        k3Var.v(this.f51143b);
    }

    @Override // zl.u
    public final boolean isInitialized() {
        byte b10 = this.f51150i;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < this.f51145d.size(); i10++) {
            if (!((y) this.f51145d.get(i10)).isInitialized()) {
                this.f51150i = (byte) 0;
                return false;
            }
        }
        for (int i11 = 0; i11 < this.f51146e.size(); i11++) {
            if (!((g0) this.f51146e.get(i11)).isInitialized()) {
                this.f51150i = (byte) 0;
                return false;
            }
        }
        for (int i12 = 0; i12 < this.f51147f.size(); i12++) {
            if (!((s0) this.f51147f.get(i12)).isInitialized()) {
                this.f51150i = (byte) 0;
                return false;
            }
        }
        if ((this.f51144c & 1) == 1 && !this.f51148g.isInitialized()) {
            this.f51150i = (byte) 0;
            return false;
        }
        if (l()) {
            this.f51150i = (byte) 1;
            return true;
        }
        this.f51150i = (byte) 0;
        return false;
    }

    public c0() {
        this.f51150i = (byte) -1;
        this.f51151j = -1;
        this.f51143b = zl.d.f55026a;
    }

    public c0(zl.e eVar, zl.g gVar) {
        this.f51150i = (byte) -1;
        this.f51151j = -1;
        List list = Collections.EMPTY_LIST;
        this.f51145d = list;
        this.f51146e = list;
        this.f51147f = list;
        this.f51148g = w0.f51519g;
        this.f51149h = d1.f51184e;
        zl.c cVar = new zl.c();
        k3 k3VarL = k3.l(cVar, 1);
        boolean z10 = false;
        int i10 = 0;
        while (!z10) {
            try {
                try {
                    int iN = eVar.n();
                    if (iN != 0) {
                        if (iN == 26) {
                            int i11 = (i10 == true ? 1 : 0) & 1;
                            i10 = i10;
                            if (i11 != 1) {
                                this.f51145d = new ArrayList();
                                i10 = (i10 == true ? 1 : 0) | 1;
                            }
                            this.f51145d.add(eVar.g(y.f51549v, gVar));
                        } else if (iN == 34) {
                            int i12 = (i10 == true ? 1 : 0) & 2;
                            i10 = i10;
                            if (i12 != 2) {
                                this.f51146e = new ArrayList();
                                i10 = (i10 == true ? 1 : 0) | 2;
                            }
                            this.f51146e.add(eVar.g(g0.f51237v, gVar));
                        } else if (iN != 42) {
                            m mVar = null;
                            f fVarL = null;
                            if (iN == 242) {
                                if ((this.f51144c & 1) == 1) {
                                    w0 w0Var = this.f51148g;
                                    w0Var.getClass();
                                    fVarL = w0.l(w0Var);
                                }
                                w0 w0Var2 = (w0) eVar.g(w0.f51520h, gVar);
                                this.f51148g = w0Var2;
                                if (fVarL != null) {
                                    fVarL.l(w0Var2);
                                    this.f51148g = fVarL.g();
                                }
                                this.f51144c |= 1;
                            } else if (iN != 258) {
                                if (!q(eVar, k3VarL, gVar, iN)) {
                                }
                            } else {
                                if ((this.f51144c & 2) == 2) {
                                    d1 d1Var = this.f51149h;
                                    d1Var.getClass();
                                    mVar = new m(2);
                                    mVar.f51354d = Collections.EMPTY_LIST;
                                    mVar.m(d1Var);
                                }
                                d1 d1Var2 = (d1) eVar.g(d1.f51185f, gVar);
                                this.f51149h = d1Var2;
                                if (mVar != null) {
                                    mVar.m(d1Var2);
                                    this.f51149h = mVar.i();
                                }
                                this.f51144c |= 2;
                            }
                        } else {
                            int i13 = (i10 == true ? 1 : 0) & 4;
                            i10 = i10;
                            if (i13 != 4) {
                                this.f51147f = new ArrayList();
                                i10 = (i10 == true ? 1 : 0) | 4;
                            }
                            this.f51147f.add(eVar.g(s0.f51450p, gVar));
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
                if (((i10 == true ? 1 : 0) & 1) == 1) {
                    this.f51145d = Collections.unmodifiableList(this.f51145d);
                }
                if (((i10 == true ? 1 : 0) & 2) == 2) {
                    this.f51146e = Collections.unmodifiableList(this.f51146e);
                }
                if (((i10 == true ? 1 : 0) & 4) == 4) {
                    this.f51147f = Collections.unmodifiableList(this.f51147f);
                }
                try {
                    k3VarL.j();
                } catch (IOException unused) {
                } finally {
                    this.f51143b = cVar.h();
                }
                p();
                throw th2;
            }
        }
        if (((i10 == true ? 1 : 0) & 1) == 1) {
            this.f51145d = Collections.unmodifiableList(this.f51145d);
        }
        if (((i10 == true ? 1 : 0) & 2) == 2) {
            this.f51146e = Collections.unmodifiableList(this.f51146e);
        }
        if (((i10 == true ? 1 : 0) & 4) == 4) {
            this.f51147f = Collections.unmodifiableList(this.f51147f);
        }
        try {
            k3VarL.j();
        } catch (IOException unused2) {
        } finally {
            this.f51143b = cVar.h();
        }
        p();
    }
}
