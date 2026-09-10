package tl;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.ads.k3;
import com.ironsource.InterfaceC0435l1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class q0 extends zl.k {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final q0 f51409t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final a f51410u = new a(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zl.d f51411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f51412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f51413d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f51414e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f51415f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public q0 f51416g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f51417h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f51418i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f51419j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f51420k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public q0 f51421m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f51422n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public q0 f51423o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f51424p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f51425q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public byte f51426r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f51427s;

    static {
        q0 q0Var = new q0();
        f51409t = q0Var;
        q0Var.t();
    }

    public q0(p0 p0Var) {
        super(p0Var);
        this.f51426r = (byte) -1;
        this.f51427s = -1;
        this.f51411b = p0Var.f55044a;
    }

    public static p0 u(q0 q0Var) {
        p0 p0VarF = p0.f();
        p0VarF.g(q0Var);
        return p0VarF;
    }

    @Override // zl.a
    public final int d() {
        int i10 = this.f51427s;
        if (i10 != -1) {
            return i10;
        }
        int iC = (this.f51412c & 4096) == 4096 ? k3.c(1, this.f51425q) : 0;
        for (int i11 = 0; i11 < this.f51413d.size(); i11++) {
            iC += k3.e(2, (zl.a) this.f51413d.get(i11));
        }
        if ((this.f51412c & 1) == 1) {
            iC += k3.i(3) + 1;
        }
        if ((this.f51412c & 2) == 2) {
            iC += k3.c(4, this.f51415f);
        }
        if ((this.f51412c & 4) == 4) {
            iC += k3.e(5, this.f51416g);
        }
        if ((this.f51412c & 16) == 16) {
            iC += k3.c(6, this.f51418i);
        }
        if ((this.f51412c & 32) == 32) {
            iC += k3.c(7, this.f51419j);
        }
        if ((this.f51412c & 8) == 8) {
            iC += k3.c(8, this.f51417h);
        }
        if ((this.f51412c & 64) == 64) {
            iC += k3.c(9, this.f51420k);
        }
        if ((this.f51412c & NotificationCompat.FLAG_LOCAL_ONLY) == 256) {
            iC += k3.e(10, this.f51421m);
        }
        if ((this.f51412c & 512) == 512) {
            iC += k3.c(11, this.f51422n);
        }
        if ((this.f51412c & 128) == 128) {
            iC += k3.c(12, this.l);
        }
        if ((this.f51412c & 1024) == 1024) {
            iC += k3.e(13, this.f51423o);
        }
        if ((this.f51412c & com.ironsource.mediationsdk.metadata.a.f29616n) == 2048) {
            iC += k3.c(14, this.f51424p);
        }
        int size = this.f51411b.size() + m() + iC;
        this.f51427s = size;
        return size;
    }

    @Override // zl.a
    public final zl.i g() {
        return p0.f();
    }

    @Override // zl.u
    public final zl.a getDefaultInstanceForType() {
        return f51409t;
    }

    @Override // zl.a
    public final void i(k3 k3Var) throws IOException {
        d();
        v6.c cVar = new v6.c(this);
        if ((this.f51412c & 4096) == 4096) {
            k3Var.q(1, this.f51425q);
        }
        for (int i10 = 0; i10 < this.f51413d.size(); i10++) {
            k3Var.s(2, (zl.a) this.f51413d.get(i10));
        }
        if ((this.f51412c & 1) == 1) {
            boolean z10 = this.f51414e;
            k3Var.B(3, 0);
            k3Var.u(z10 ? 1 : 0);
        }
        if ((this.f51412c & 2) == 2) {
            k3Var.q(4, this.f51415f);
        }
        if ((this.f51412c & 4) == 4) {
            k3Var.s(5, this.f51416g);
        }
        if ((this.f51412c & 16) == 16) {
            k3Var.q(6, this.f51418i);
        }
        if ((this.f51412c & 32) == 32) {
            k3Var.q(7, this.f51419j);
        }
        if ((this.f51412c & 8) == 8) {
            k3Var.q(8, this.f51417h);
        }
        if ((this.f51412c & 64) == 64) {
            k3Var.q(9, this.f51420k);
        }
        if ((this.f51412c & NotificationCompat.FLAG_LOCAL_ONLY) == 256) {
            k3Var.s(10, this.f51421m);
        }
        if ((this.f51412c & 512) == 512) {
            k3Var.q(11, this.f51422n);
        }
        if ((this.f51412c & 128) == 128) {
            k3Var.q(12, this.l);
        }
        if ((this.f51412c & 1024) == 1024) {
            k3Var.s(13, this.f51423o);
        }
        if ((this.f51412c & com.ironsource.mediationsdk.metadata.a.f29616n) == 2048) {
            k3Var.q(14, this.f51424p);
        }
        cVar.s(200, k3Var);
        k3Var.v(this.f51411b);
    }

    @Override // zl.u
    public final boolean isInitialized() {
        byte b10 = this.f51426r;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < this.f51413d.size(); i10++) {
            if (!((o0) this.f51413d.get(i10)).isInitialized()) {
                this.f51426r = (byte) 0;
                return false;
            }
        }
        if ((this.f51412c & 4) == 4 && !this.f51416g.isInitialized()) {
            this.f51426r = (byte) 0;
            return false;
        }
        if ((this.f51412c & NotificationCompat.FLAG_LOCAL_ONLY) == 256 && !this.f51421m.isInitialized()) {
            this.f51426r = (byte) 0;
            return false;
        }
        if ((this.f51412c & 1024) == 1024 && !this.f51423o.isInitialized()) {
            this.f51426r = (byte) 0;
            return false;
        }
        if (l()) {
            this.f51426r = (byte) 1;
            return true;
        }
        this.f51426r = (byte) 0;
        return false;
    }

    public final boolean s() {
        return (this.f51412c & 16) == 16;
    }

    public final void t() {
        this.f51413d = Collections.EMPTY_LIST;
        this.f51414e = false;
        this.f51415f = 0;
        q0 q0Var = f51409t;
        this.f51416g = q0Var;
        this.f51417h = 0;
        this.f51418i = 0;
        this.f51419j = 0;
        this.f51420k = 0;
        this.l = 0;
        this.f51421m = q0Var;
        this.f51422n = 0;
        this.f51423o = q0Var;
        this.f51424p = 0;
        this.f51425q = 0;
    }

    @Override // zl.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public final p0 h() {
        return u(this);
    }

    public q0() {
        this.f51426r = (byte) -1;
        this.f51427s = -1;
        this.f51411b = zl.d.f55026a;
    }

    public q0(zl.e eVar, zl.g gVar) {
        this.f51426r = (byte) -1;
        this.f51427s = -1;
        t();
        zl.c cVar = new zl.c();
        k3 k3VarL = k3.l(cVar, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    int iN = eVar.n();
                    a aVar = f51410u;
                    p0 p0VarU = null;
                    switch (iN) {
                        case 0:
                            break;
                        case 8:
                            this.f51412c |= 4096;
                            this.f51425q = eVar.k();
                            continue;
                        case 18:
                            if (!z11) {
                                this.f51413d = new ArrayList();
                                z11 = true;
                            }
                            this.f51413d.add(eVar.g(o0.f51377i, gVar));
                            continue;
                        case 24:
                            this.f51412c |= 1;
                            this.f51414e = eVar.l() != 0;
                            continue;
                        case 32:
                            this.f51412c |= 2;
                            this.f51415f = eVar.k();
                            continue;
                        case 42:
                            if ((this.f51412c & 4) == 4) {
                                q0 q0Var = this.f51416g;
                                q0Var.getClass();
                                p0VarU = u(q0Var);
                            }
                            q0 q0Var2 = (q0) eVar.g(aVar, gVar);
                            this.f51416g = q0Var2;
                            if (p0VarU != null) {
                                p0VarU.g(q0Var2);
                                this.f51416g = p0VarU.e();
                            }
                            this.f51412c |= 4;
                            continue;
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE:
                            this.f51412c |= 16;
                            this.f51418i = eVar.k();
                            continue;
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_RECEIVED_VALUE:
                            this.f51412c |= 32;
                            this.f51419j = eVar.k();
                            continue;
                        case 64:
                            this.f51412c |= 8;
                            this.f51417h = eVar.k();
                            continue;
                        case 72:
                            this.f51412c |= 64;
                            this.f51420k = eVar.k();
                            continue;
                        case 82:
                            if ((this.f51412c & NotificationCompat.FLAG_LOCAL_ONLY) == 256) {
                                q0 q0Var3 = this.f51421m;
                                q0Var3.getClass();
                                p0VarU = u(q0Var3);
                            }
                            q0 q0Var4 = (q0) eVar.g(aVar, gVar);
                            this.f51421m = q0Var4;
                            if (p0VarU != null) {
                                p0VarU.g(q0Var4);
                                this.f51421m = p0VarU.e();
                            }
                            this.f51412c |= NotificationCompat.FLAG_LOCAL_ONLY;
                            continue;
                        case 88:
                            this.f51412c |= 512;
                            this.f51422n = eVar.k();
                            continue;
                        case 96:
                            this.f51412c |= 128;
                            this.l = eVar.k();
                            continue;
                        case 106:
                            if ((this.f51412c & 1024) == 1024) {
                                q0 q0Var5 = this.f51423o;
                                q0Var5.getClass();
                                p0VarU = u(q0Var5);
                            }
                            q0 q0Var6 = (q0) eVar.g(aVar, gVar);
                            this.f51423o = q0Var6;
                            if (p0VarU != null) {
                                p0VarU.g(q0Var6);
                                this.f51423o = p0VarU.e();
                            }
                            this.f51412c |= 1024;
                            continue;
                        case InterfaceC0435l1.d.b.f29113j /* 112 */:
                            this.f51412c |= com.ironsource.mediationsdk.metadata.a.f29616n;
                            this.f51424p = eVar.k();
                            continue;
                        default:
                            if (!q(eVar, k3VarL, gVar, iN)) {
                                break;
                            }
                            break;
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
                    this.f51413d = Collections.unmodifiableList(this.f51413d);
                }
                try {
                    k3VarL.j();
                } catch (IOException unused) {
                } finally {
                    this.f51411b = cVar.h();
                }
                p();
                throw th2;
            }
        }
        if (z11) {
            this.f51413d = Collections.unmodifiableList(this.f51413d);
        }
        try {
            k3VarL.j();
        } catch (IOException unused2) {
        } finally {
            this.f51411b = cVar.h();
        }
        p();
    }
}
