package tl;

import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okio.Segment;
import com.google.android.gms.internal.ads.k3;
import com.ironsource.InterfaceC0435l1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class g0 extends zl.k {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final g0 f51236u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final a f51237v = new a(12);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zl.d f51238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f51239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f51240d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f51241e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f51242f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public q0 f51243g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f51244h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List f51245i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public q0 f51246j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f51247k;
    public List l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public List f51248m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f51249n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public y0 f51250o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f51251p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f51252q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public List f51253r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public byte f51254s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f51255t;

    static {
        g0 g0Var = new g0();
        f51236u = g0Var;
        g0Var.s();
    }

    public g0(f0 f0Var) {
        super(f0Var);
        this.f51249n = -1;
        this.f51254s = (byte) -1;
        this.f51255t = -1;
        this.f51238b = f0Var.f55044a;
    }

    @Override // zl.a
    public final int d() {
        int i10 = this.f51255t;
        if (i10 != -1) {
            return i10;
        }
        int iC = (this.f51239c & 2) == 2 ? k3.c(1, this.f51241e) : 0;
        if ((this.f51239c & 4) == 4) {
            iC += k3.c(2, this.f51242f);
        }
        if ((this.f51239c & 8) == 8) {
            iC += k3.e(3, this.f51243g);
        }
        for (int i11 = 0; i11 < this.f51245i.size(); i11++) {
            iC += k3.e(4, (zl.a) this.f51245i.get(i11));
        }
        if ((this.f51239c & 32) == 32) {
            iC += k3.e(5, this.f51246j);
        }
        if ((this.f51239c & 128) == 128) {
            iC += k3.e(6, this.f51250o);
        }
        if ((this.f51239c & NotificationCompat.FLAG_LOCAL_ONLY) == 256) {
            iC += k3.c(7, this.f51251p);
        }
        if ((this.f51239c & 512) == 512) {
            iC += k3.c(8, this.f51252q);
        }
        if ((this.f51239c & 16) == 16) {
            iC += k3.c(9, this.f51244h);
        }
        if ((this.f51239c & 64) == 64) {
            iC += k3.c(10, this.f51247k);
        }
        if ((this.f51239c & 1) == 1) {
            iC += k3.c(11, this.f51240d);
        }
        for (int i12 = 0; i12 < this.l.size(); i12++) {
            iC += k3.e(12, (zl.a) this.l.get(i12));
        }
        int iD = 0;
        for (int i13 = 0; i13 < this.f51248m.size(); i13++) {
            iD += k3.d(((Integer) this.f51248m.get(i13)).intValue());
        }
        int iD2 = iC + iD;
        if (!this.f51248m.isEmpty()) {
            iD2 = iD2 + 1 + k3.d(iD);
        }
        this.f51249n = iD;
        int iD3 = 0;
        for (int i14 = 0; i14 < this.f51253r.size(); i14++) {
            iD3 += k3.d(((Integer) this.f51253r.get(i14)).intValue());
        }
        int size = this.f51238b.size() + m() + (this.f51253r.size() * 2) + iD2 + iD3;
        this.f51255t = size;
        return size;
    }

    @Override // zl.a
    public final zl.i g() {
        return f0.f();
    }

    @Override // zl.u
    public final zl.a getDefaultInstanceForType() {
        return f51236u;
    }

    @Override // zl.a
    public final zl.i h() {
        f0 f0VarF = f0.f();
        f0VarF.g(this);
        return f0VarF;
    }

    @Override // zl.a
    public final void i(k3 k3Var) throws IOException {
        d();
        v6.c cVar = new v6.c(this);
        if ((this.f51239c & 2) == 2) {
            k3Var.q(1, this.f51241e);
        }
        if ((this.f51239c & 4) == 4) {
            k3Var.q(2, this.f51242f);
        }
        if ((this.f51239c & 8) == 8) {
            k3Var.s(3, this.f51243g);
        }
        for (int i10 = 0; i10 < this.f51245i.size(); i10++) {
            k3Var.s(4, (zl.a) this.f51245i.get(i10));
        }
        if ((this.f51239c & 32) == 32) {
            k3Var.s(5, this.f51246j);
        }
        if ((this.f51239c & 128) == 128) {
            k3Var.s(6, this.f51250o);
        }
        if ((this.f51239c & NotificationCompat.FLAG_LOCAL_ONLY) == 256) {
            k3Var.q(7, this.f51251p);
        }
        if ((this.f51239c & 512) == 512) {
            k3Var.q(8, this.f51252q);
        }
        if ((this.f51239c & 16) == 16) {
            k3Var.q(9, this.f51244h);
        }
        if ((this.f51239c & 64) == 64) {
            k3Var.q(10, this.f51247k);
        }
        if ((this.f51239c & 1) == 1) {
            k3Var.q(11, this.f51240d);
        }
        for (int i11 = 0; i11 < this.l.size(); i11++) {
            k3Var.s(12, (zl.a) this.l.get(i11));
        }
        if (this.f51248m.size() > 0) {
            k3Var.z(106);
            k3Var.z(this.f51249n);
        }
        for (int i12 = 0; i12 < this.f51248m.size(); i12++) {
            k3Var.r(((Integer) this.f51248m.get(i12)).intValue());
        }
        for (int i13 = 0; i13 < this.f51253r.size(); i13++) {
            k3Var.q(31, ((Integer) this.f51253r.get(i13)).intValue());
        }
        cVar.s(19000, k3Var);
        k3Var.v(this.f51238b);
    }

    @Override // zl.u
    public final boolean isInitialized() {
        byte b10 = this.f51254s;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        int i10 = this.f51239c;
        if ((i10 & 4) != 4) {
            this.f51254s = (byte) 0;
            return false;
        }
        if ((i10 & 8) == 8 && !this.f51243g.isInitialized()) {
            this.f51254s = (byte) 0;
            return false;
        }
        for (int i11 = 0; i11 < this.f51245i.size(); i11++) {
            if (!((v0) this.f51245i.get(i11)).isInitialized()) {
                this.f51254s = (byte) 0;
                return false;
            }
        }
        if ((this.f51239c & 32) == 32 && !this.f51246j.isInitialized()) {
            this.f51254s = (byte) 0;
            return false;
        }
        for (int i12 = 0; i12 < this.l.size(); i12++) {
            if (!((q0) this.l.get(i12)).isInitialized()) {
                this.f51254s = (byte) 0;
                return false;
            }
        }
        if ((this.f51239c & 128) == 128 && !this.f51250o.isInitialized()) {
            this.f51254s = (byte) 0;
            return false;
        }
        if (l()) {
            this.f51254s = (byte) 1;
            return true;
        }
        this.f51254s = (byte) 0;
        return false;
    }

    public final void s() {
        this.f51240d = 518;
        this.f51241e = 2054;
        this.f51242f = 0;
        q0 q0Var = q0.f51409t;
        this.f51243g = q0Var;
        this.f51244h = 0;
        List list = Collections.EMPTY_LIST;
        this.f51245i = list;
        this.f51246j = q0Var;
        this.f51247k = 0;
        this.l = list;
        this.f51248m = list;
        this.f51250o = y0.l;
        this.f51251p = 0;
        this.f51252q = 0;
        this.f51253r = list;
    }

    public g0() {
        this.f51249n = -1;
        this.f51254s = (byte) -1;
        this.f51255t = -1;
        this.f51238b = zl.d.f55026a;
    }

    public g0(zl.e eVar, zl.g gVar) {
        this.f51249n = -1;
        this.f51254s = (byte) -1;
        this.f51255t = -1;
        s();
        zl.c cVar = new zl.c();
        k3 k3VarL = k3.l(cVar, 1);
        boolean z10 = false;
        int i10 = 0;
        while (!z10) {
            try {
                try {
                    try {
                        int iN = eVar.n();
                        p0 p0VarU = null;
                        x0 x0Var = null;
                        p0 p0VarU2 = null;
                        switch (iN) {
                            case 0:
                                break;
                            case 8:
                                this.f51239c |= 2;
                                this.f51241e = eVar.k();
                                continue;
                            case 16:
                                this.f51239c |= 4;
                                this.f51242f = eVar.k();
                                continue;
                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                                if ((this.f51239c & 8) == 8) {
                                    q0 q0Var = this.f51243g;
                                    q0Var.getClass();
                                    p0VarU = q0.u(q0Var);
                                }
                                q0 q0Var2 = (q0) eVar.g(q0.f51410u, gVar);
                                this.f51243g = q0Var2;
                                if (p0VarU != null) {
                                    p0VarU.g(q0Var2);
                                    this.f51243g = p0VarU.e();
                                }
                                this.f51239c |= 8;
                                continue;
                            case 34:
                                int i11 = (i10 == true ? 1 : 0) & 32;
                                i10 = i10;
                                if (i11 != 32) {
                                    this.f51245i = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 32;
                                }
                                this.f51245i.add(eVar.g(v0.f51496n, gVar));
                                continue;
                            case 42:
                                if ((this.f51239c & 32) == 32) {
                                    q0 q0Var3 = this.f51246j;
                                    q0Var3.getClass();
                                    p0VarU2 = q0.u(q0Var3);
                                }
                                q0 q0Var4 = (q0) eVar.g(q0.f51410u, gVar);
                                this.f51246j = q0Var4;
                                if (p0VarU2 != null) {
                                    p0VarU2.g(q0Var4);
                                    this.f51246j = p0VarU2.e();
                                }
                                this.f51239c |= 32;
                                continue;
                            case 50:
                                if ((this.f51239c & 128) == 128) {
                                    y0 y0Var = this.f51250o;
                                    y0Var.getClass();
                                    x0Var = new x0();
                                    q0 q0Var5 = q0.f51409t;
                                    x0Var.f51544g = q0Var5;
                                    x0Var.f51546i = q0Var5;
                                    x0Var.f(y0Var);
                                }
                                y0 y0Var2 = (y0) eVar.g(y0.f51568m, gVar);
                                this.f51250o = y0Var2;
                                if (x0Var != null) {
                                    x0Var.f(y0Var2);
                                    this.f51250o = x0Var.e();
                                }
                                this.f51239c |= 128;
                                continue;
                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_RECEIVED_VALUE:
                                this.f51239c |= NotificationCompat.FLAG_LOCAL_ONLY;
                                this.f51251p = eVar.k();
                                continue;
                            case 64:
                                this.f51239c |= 512;
                                this.f51252q = eVar.k();
                                continue;
                            case 72:
                                this.f51239c |= 16;
                                this.f51244h = eVar.k();
                                continue;
                            case 80:
                                this.f51239c |= 64;
                                this.f51247k = eVar.k();
                                continue;
                            case 88:
                                this.f51239c |= 1;
                                this.f51240d = eVar.k();
                                continue;
                            case 98:
                                int i12 = (i10 == true ? 1 : 0) & NotificationCompat.FLAG_LOCAL_ONLY;
                                i10 = i10;
                                if (i12 != 256) {
                                    this.l = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | NotificationCompat.FLAG_LOCAL_ONLY;
                                }
                                this.l.add(eVar.g(q0.f51410u, gVar));
                                continue;
                            case InterfaceC0435l1.d.b.f29108e /* 104 */:
                                int i13 = (i10 == true ? 1 : 0) & 512;
                                i10 = i10;
                                if (i13 != 512) {
                                    this.f51248m = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 512;
                                }
                                this.f51248m.add(Integer.valueOf(eVar.k()));
                                continue;
                            case 106:
                                int iD = eVar.d(eVar.k());
                                int i14 = (i10 == true ? 1 : 0) & 512;
                                i10 = i10;
                                if (i14 != 512 && eVar.b() > 0) {
                                    i10 = i10;
                                    this.f51248m = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 512;
                                }
                                i10 = i10;
                                while (eVar.b() > 0) {
                                    this.f51248m.add(Integer.valueOf(eVar.k()));
                                }
                                eVar.c(iD);
                                continue;
                            case 248:
                                int i15 = (i10 == true ? 1 : 0) & Segment.SIZE;
                                i10 = i10;
                                if (i15 != 8192) {
                                    this.f51253r = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | Segment.SIZE;
                                }
                                this.f51253r.add(Integer.valueOf(eVar.k()));
                                continue;
                            case 250:
                                int iD2 = eVar.d(eVar.k());
                                int i16 = (i10 == true ? 1 : 0) & Segment.SIZE;
                                i10 = i10;
                                if (i16 != 8192 && eVar.b() > 0) {
                                    i10 = i10;
                                    this.f51253r = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | Segment.SIZE;
                                }
                                i10 = i10;
                                while (eVar.b() > 0) {
                                    this.f51253r.add(Integer.valueOf(eVar.k()));
                                }
                                eVar.c(iD2);
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
                    }
                } catch (IOException e11) {
                    zl.q qVar = new zl.q(e11.getMessage());
                    qVar.f55076a = this;
                    throw qVar;
                }
            } catch (Throwable th2) {
                if (((i10 == true ? 1 : 0) & 32) == 32) {
                    this.f51245i = Collections.unmodifiableList(this.f51245i);
                }
                if (((i10 == true ? 1 : 0) & NotificationCompat.FLAG_LOCAL_ONLY) == 256) {
                    this.l = Collections.unmodifiableList(this.l);
                }
                if (((i10 == true ? 1 : 0) & 512) == 512) {
                    this.f51248m = Collections.unmodifiableList(this.f51248m);
                }
                if (((i10 == true ? 1 : 0) & Segment.SIZE) == 8192) {
                    this.f51253r = Collections.unmodifiableList(this.f51253r);
                }
                try {
                    k3VarL.j();
                } catch (IOException unused) {
                } finally {
                    this.f51238b = cVar.h();
                }
                p();
                throw th2;
            }
        }
        if (((i10 == true ? 1 : 0) & 32) == 32) {
            this.f51245i = Collections.unmodifiableList(this.f51245i);
        }
        if (((i10 == true ? 1 : 0) & NotificationCompat.FLAG_LOCAL_ONLY) == 256) {
            this.l = Collections.unmodifiableList(this.l);
        }
        if (((i10 == true ? 1 : 0) & 512) == 512) {
            this.f51248m = Collections.unmodifiableList(this.f51248m);
        }
        if (((i10 == true ? 1 : 0) & Segment.SIZE) == 8192) {
            this.f51253r = Collections.unmodifiableList(this.f51253r);
        }
        try {
            k3VarL.j();
        } catch (IOException unused2) {
        } finally {
            this.f51238b = cVar.h();
        }
        p();
    }
}
