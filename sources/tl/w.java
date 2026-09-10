package tl;

import com.google.android.gms.internal.ads.k3;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class w extends zl.n {
    public static final w l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f51507m = new a(8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zl.d f51508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f51509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f51510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f51511d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public v f51512e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public q0 f51513f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f51514g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List f51515h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List f51516i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public byte f51517j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f51518k;

    static {
        w wVar = new w();
        l = wVar;
        wVar.f51510c = 0;
        wVar.f51511d = 0;
        wVar.f51512e = v.TRUE;
        wVar.f51513f = q0.f51409t;
        wVar.f51514g = 0;
        List list = Collections.EMPTY_LIST;
        wVar.f51515h = list;
        wVar.f51516i = list;
    }

    public w() {
        this.f51517j = (byte) -1;
        this.f51518k = -1;
        this.f51508a = zl.d.f55026a;
    }

    @Override // zl.a
    public final int d() {
        int i10 = this.f51518k;
        if (i10 != -1) {
            return i10;
        }
        int iC = (this.f51509b & 1) == 1 ? k3.c(1, this.f51510c) : 0;
        if ((this.f51509b & 2) == 2) {
            iC += k3.c(2, this.f51511d);
        }
        if ((this.f51509b & 4) == 4) {
            iC += k3.b(3, this.f51512e.f51494a);
        }
        if ((this.f51509b & 8) == 8) {
            iC += k3.e(4, this.f51513f);
        }
        if ((this.f51509b & 16) == 16) {
            iC += k3.c(5, this.f51514g);
        }
        for (int i11 = 0; i11 < this.f51515h.size(); i11++) {
            iC += k3.e(6, (zl.a) this.f51515h.get(i11));
        }
        for (int i12 = 0; i12 < this.f51516i.size(); i12++) {
            iC += k3.e(7, (zl.a) this.f51516i.get(i12));
        }
        int size = this.f51508a.size() + iC;
        this.f51518k = size;
        return size;
    }

    @Override // zl.a
    public final zl.i g() {
        return u.f();
    }

    @Override // zl.a
    public final zl.i h() {
        u uVarF = u.f();
        uVarF.g(this);
        return uVarF;
    }

    @Override // zl.a
    public final void i(k3 k3Var) throws IOException {
        d();
        if ((this.f51509b & 1) == 1) {
            k3Var.q(1, this.f51510c);
        }
        if ((this.f51509b & 2) == 2) {
            k3Var.q(2, this.f51511d);
        }
        if ((this.f51509b & 4) == 4) {
            k3Var.p(3, this.f51512e.f51494a);
        }
        if ((this.f51509b & 8) == 8) {
            k3Var.s(4, this.f51513f);
        }
        if ((this.f51509b & 16) == 16) {
            k3Var.q(5, this.f51514g);
        }
        for (int i10 = 0; i10 < this.f51515h.size(); i10++) {
            k3Var.s(6, (zl.a) this.f51515h.get(i10));
        }
        for (int i11 = 0; i11 < this.f51516i.size(); i11++) {
            k3Var.s(7, (zl.a) this.f51516i.get(i11));
        }
        k3Var.v(this.f51508a);
    }

    @Override // zl.u
    public final boolean isInitialized() {
        byte b10 = this.f51517j;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if ((this.f51509b & 8) == 8 && !this.f51513f.isInitialized()) {
            this.f51517j = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < this.f51515h.size(); i10++) {
            if (!((w) this.f51515h.get(i10)).isInitialized()) {
                this.f51517j = (byte) 0;
                return false;
            }
        }
        for (int i11 = 0; i11 < this.f51516i.size(); i11++) {
            if (!((w) this.f51516i.get(i11)).isInitialized()) {
                this.f51517j = (byte) 0;
                return false;
            }
        }
        this.f51517j = (byte) 1;
        return true;
    }

    public w(u uVar) {
        this.f51517j = (byte) -1;
        this.f51518k = -1;
        this.f51508a = uVar.f55044a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public w(zl.e eVar, zl.g gVar) {
        v vVar;
        this.f51517j = (byte) -1;
        this.f51518k = -1;
        boolean z10 = false;
        this.f51510c = 0;
        this.f51511d = 0;
        v vVar2 = v.TRUE;
        this.f51512e = vVar2;
        this.f51513f = q0.f51409t;
        this.f51514g = 0;
        List list = Collections.EMPTY_LIST;
        this.f51515h = list;
        this.f51516i = list;
        zl.c cVar = new zl.c();
        k3 k3VarL = k3.l(cVar, 1);
        int i10 = 0;
        while (!z10) {
            try {
                try {
                    try {
                        int iN = eVar.n();
                        if (iN != 0) {
                            if (iN == 8) {
                                this.f51509b |= 1;
                                this.f51510c = eVar.k();
                            } else if (iN != 16) {
                                Object objU = null;
                                if (iN == 24) {
                                    int iK = eVar.k();
                                    if (iK != 0) {
                                        if (iK == 1) {
                                            objU = v.FALSE;
                                        } else if (iK == 2) {
                                            objU = v.NULL;
                                        }
                                        vVar = objU;
                                    } else {
                                        vVar = vVar2;
                                    }
                                    if (vVar == 0) {
                                        k3VarL.z(iN);
                                        k3VarL.z(iK);
                                    } else {
                                        this.f51509b |= 4;
                                        this.f51512e = vVar;
                                    }
                                } else if (iN == 34) {
                                    if ((this.f51509b & 8) == 8) {
                                        q0 q0Var = this.f51513f;
                                        q0Var.getClass();
                                        objU = q0.u(q0Var);
                                    }
                                    p0 p0Var = objU;
                                    q0 q0Var2 = (q0) eVar.g(q0.f51410u, gVar);
                                    this.f51513f = q0Var2;
                                    if (p0Var != 0) {
                                        p0Var.g(q0Var2);
                                        this.f51513f = p0Var.e();
                                    }
                                    this.f51509b |= 8;
                                } else if (iN != 40) {
                                    a aVar = f51507m;
                                    if (iN == 50) {
                                        if ((i10 & 32) != 32) {
                                            this.f51515h = new ArrayList();
                                            i10 |= 32;
                                        }
                                        this.f51515h.add(eVar.g(aVar, gVar));
                                    } else if (iN != 58) {
                                        if (!eVar.q(iN, k3VarL)) {
                                        }
                                    } else {
                                        if ((i10 & 64) != 64) {
                                            this.f51516i = new ArrayList();
                                            i10 |= 64;
                                        }
                                        this.f51516i.add(eVar.g(aVar, gVar));
                                    }
                                } else {
                                    this.f51509b |= 16;
                                    this.f51514g = eVar.k();
                                }
                            } else {
                                this.f51509b |= 2;
                                this.f51511d = eVar.k();
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
                if ((i10 & 32) == 32) {
                    this.f51515h = Collections.unmodifiableList(this.f51515h);
                }
                if ((i10 & 64) == 64) {
                    this.f51516i = Collections.unmodifiableList(this.f51516i);
                }
                try {
                    k3VarL.j();
                } catch (IOException unused) {
                } finally {
                    this.f51508a = cVar.h();
                }
                throw th2;
            }
        }
        if ((i10 & 32) == 32) {
            this.f51515h = Collections.unmodifiableList(this.f51515h);
        }
        if ((i10 & 64) == 64) {
            this.f51516i = Collections.unmodifiableList(this.f51516i);
        }
        try {
            k3VarL.j();
        } catch (IOException unused2) {
        } finally {
            this.f51508a = cVar.h();
        }
    }
}
