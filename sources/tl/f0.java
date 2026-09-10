package tl;

import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okio.Segment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class f0 extends zl.j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f51214d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f51215e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f51216f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f51217g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public q0 f51218h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f51219i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List f51220j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public q0 f51221k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public List f51222m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List f51223n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public y0 f51224o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f51225p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f51226q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public List f51227r;

    public static f0 f() {
        f0 f0Var = new f0();
        f0Var.f51215e = 518;
        f0Var.f51216f = 2054;
        q0 q0Var = q0.f51409t;
        f0Var.f51218h = q0Var;
        List list = Collections.EMPTY_LIST;
        f0Var.f51220j = list;
        f0Var.f51221k = q0Var;
        f0Var.f51222m = list;
        f0Var.f51223n = list;
        f0Var.f51224o = y0.l;
        f0Var.f51227r = list;
        return f0Var;
    }

    @Override // zl.i
    public final zl.a a() {
        g0 g0VarE = e();
        if (g0VarE.isInitialized()) {
            return g0VarE;
        }
        throw new aa.b();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // zl.i
    public final zl.i b(zl.e eVar, zl.g gVar) throws Throwable {
        g0 g0Var = null;
        try {
            try {
                g0.f51237v.getClass();
                g(new g0(eVar, gVar));
                return this;
            } catch (zl.q e10) {
                g0 g0Var2 = (g0) e10.f55076a;
                try {
                    throw e10;
                } catch (Throwable th2) {
                    th = th2;
                    g0Var = g0Var2;
                    if (g0Var != null) {
                        g(g0Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            if (g0Var != null) {
                g(g0Var);
            }
            throw th;
        }
    }

    @Override // zl.i
    public final /* bridge */ /* synthetic */ zl.i c(zl.n nVar) {
        g((g0) nVar);
        return this;
    }

    public final Object clone() {
        f0 f0VarF = f();
        f0VarF.g(e());
        return f0VarF;
    }

    public final g0 e() {
        g0 g0Var = new g0(this);
        int i10 = this.f51214d;
        int i11 = (i10 & 1) != 1 ? 0 : 1;
        g0Var.f51240d = this.f51215e;
        if ((i10 & 2) == 2) {
            i11 |= 2;
        }
        g0Var.f51241e = this.f51216f;
        if ((i10 & 4) == 4) {
            i11 |= 4;
        }
        g0Var.f51242f = this.f51217g;
        if ((i10 & 8) == 8) {
            i11 |= 8;
        }
        g0Var.f51243g = this.f51218h;
        if ((i10 & 16) == 16) {
            i11 |= 16;
        }
        g0Var.f51244h = this.f51219i;
        if ((i10 & 32) == 32) {
            this.f51220j = Collections.unmodifiableList(this.f51220j);
            this.f51214d &= -33;
        }
        g0Var.f51245i = this.f51220j;
        if ((i10 & 64) == 64) {
            i11 |= 32;
        }
        g0Var.f51246j = this.f51221k;
        if ((i10 & 128) == 128) {
            i11 |= 64;
        }
        g0Var.f51247k = this.l;
        if ((this.f51214d & NotificationCompat.FLAG_LOCAL_ONLY) == 256) {
            this.f51222m = Collections.unmodifiableList(this.f51222m);
            this.f51214d &= -257;
        }
        g0Var.l = this.f51222m;
        if ((this.f51214d & 512) == 512) {
            this.f51223n = Collections.unmodifiableList(this.f51223n);
            this.f51214d &= -513;
        }
        g0Var.f51248m = this.f51223n;
        if ((i10 & 1024) == 1024) {
            i11 |= 128;
        }
        g0Var.f51250o = this.f51224o;
        if ((i10 & com.ironsource.mediationsdk.metadata.a.f29616n) == 2048) {
            i11 |= NotificationCompat.FLAG_LOCAL_ONLY;
        }
        g0Var.f51251p = this.f51225p;
        if ((i10 & 4096) == 4096) {
            i11 |= 512;
        }
        g0Var.f51252q = this.f51226q;
        if ((this.f51214d & Segment.SIZE) == 8192) {
            this.f51227r = Collections.unmodifiableList(this.f51227r);
            this.f51214d &= -8193;
        }
        g0Var.f51253r = this.f51227r;
        g0Var.f51239c = i11;
        return g0Var;
    }

    public final void g(g0 g0Var) {
        y0 y0Var;
        q0 q0Var;
        q0 q0Var2;
        if (g0Var == g0.f51236u) {
            return;
        }
        int i10 = g0Var.f51239c;
        if ((i10 & 1) == 1) {
            int i11 = g0Var.f51240d;
            this.f51214d = 1 | this.f51214d;
            this.f51215e = i11;
        }
        if ((i10 & 2) == 2) {
            int i12 = g0Var.f51241e;
            this.f51214d = 2 | this.f51214d;
            this.f51216f = i12;
        }
        if ((i10 & 4) == 4) {
            int i13 = g0Var.f51242f;
            this.f51214d = 4 | this.f51214d;
            this.f51217g = i13;
        }
        if ((i10 & 8) == 8) {
            q0 q0Var3 = g0Var.f51243g;
            if ((this.f51214d & 8) != 8 || (q0Var2 = this.f51218h) == q0.f51409t) {
                this.f51218h = q0Var3;
            } else {
                p0 p0VarU = q0.u(q0Var2);
                p0VarU.g(q0Var3);
                this.f51218h = p0VarU.e();
            }
            this.f51214d |= 8;
        }
        if ((g0Var.f51239c & 16) == 16) {
            int i14 = g0Var.f51244h;
            this.f51214d = 16 | this.f51214d;
            this.f51219i = i14;
        }
        if (!g0Var.f51245i.isEmpty()) {
            if (this.f51220j.isEmpty()) {
                this.f51220j = g0Var.f51245i;
                this.f51214d &= -33;
            } else {
                if ((this.f51214d & 32) != 32) {
                    this.f51220j = new ArrayList(this.f51220j);
                    this.f51214d |= 32;
                }
                this.f51220j.addAll(g0Var.f51245i);
            }
        }
        if ((g0Var.f51239c & 32) == 32) {
            q0 q0Var4 = g0Var.f51246j;
            if ((this.f51214d & 64) != 64 || (q0Var = this.f51221k) == q0.f51409t) {
                this.f51221k = q0Var4;
            } else {
                p0 p0VarU2 = q0.u(q0Var);
                p0VarU2.g(q0Var4);
                this.f51221k = p0VarU2.e();
            }
            this.f51214d |= 64;
        }
        if ((g0Var.f51239c & 64) == 64) {
            int i15 = g0Var.f51247k;
            this.f51214d |= 128;
            this.l = i15;
        }
        if (!g0Var.l.isEmpty()) {
            if (this.f51222m.isEmpty()) {
                this.f51222m = g0Var.l;
                this.f51214d &= -257;
            } else {
                if ((this.f51214d & NotificationCompat.FLAG_LOCAL_ONLY) != 256) {
                    this.f51222m = new ArrayList(this.f51222m);
                    this.f51214d |= NotificationCompat.FLAG_LOCAL_ONLY;
                }
                this.f51222m.addAll(g0Var.l);
            }
        }
        if (!g0Var.f51248m.isEmpty()) {
            if (this.f51223n.isEmpty()) {
                this.f51223n = g0Var.f51248m;
                this.f51214d &= -513;
            } else {
                if ((this.f51214d & 512) != 512) {
                    this.f51223n = new ArrayList(this.f51223n);
                    this.f51214d |= 512;
                }
                this.f51223n.addAll(g0Var.f51248m);
            }
        }
        if ((g0Var.f51239c & 128) == 128) {
            y0 y0Var2 = g0Var.f51250o;
            if ((this.f51214d & 1024) != 1024 || (y0Var = this.f51224o) == y0.l) {
                this.f51224o = y0Var2;
            } else {
                x0 x0Var = new x0();
                q0 q0Var5 = q0.f51409t;
                x0Var.f51544g = q0Var5;
                x0Var.f51546i = q0Var5;
                x0Var.f(y0Var);
                x0Var.f(y0Var2);
                this.f51224o = x0Var.e();
            }
            this.f51214d |= 1024;
        }
        int i16 = g0Var.f51239c;
        if ((i16 & NotificationCompat.FLAG_LOCAL_ONLY) == 256) {
            int i17 = g0Var.f51251p;
            this.f51214d |= com.ironsource.mediationsdk.metadata.a.f29616n;
            this.f51225p = i17;
        }
        if ((i16 & 512) == 512) {
            int i18 = g0Var.f51252q;
            this.f51214d |= 4096;
            this.f51226q = i18;
        }
        if (!g0Var.f51253r.isEmpty()) {
            if (this.f51227r.isEmpty()) {
                this.f51227r = g0Var.f51253r;
                this.f51214d &= -8193;
            } else {
                if ((this.f51214d & Segment.SIZE) != 8192) {
                    this.f51227r = new ArrayList(this.f51227r);
                    this.f51214d |= Segment.SIZE;
                }
                this.f51227r.addAll(g0Var.f51253r);
            }
        }
        d(g0Var);
        this.f55044a = this.f55044a.h(g0Var.f51238b);
    }
}
