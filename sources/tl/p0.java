package tl;

import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okio.Segment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class p0 extends zl.j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f51390d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f51391e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f51392f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f51393g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public q0 f51394h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f51395i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f51396j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f51397k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f51398m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public q0 f51399n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f51400o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public q0 f51401p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f51402q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f51403r;

    public static p0 f() {
        p0 p0Var = new p0();
        p0Var.f51391e = Collections.EMPTY_LIST;
        q0 q0Var = q0.f51409t;
        p0Var.f51394h = q0Var;
        p0Var.f51399n = q0Var;
        p0Var.f51401p = q0Var;
        return p0Var;
    }

    @Override // zl.i
    public final zl.a a() {
        q0 q0VarE = e();
        if (q0VarE.isInitialized()) {
            return q0VarE;
        }
        throw new aa.b();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // zl.i
    public final zl.i b(zl.e eVar, zl.g gVar) throws Throwable {
        q0 q0Var = null;
        try {
            try {
                q0.f51410u.getClass();
                g(new q0(eVar, gVar));
                return this;
            } catch (zl.q e10) {
                q0 q0Var2 = (q0) e10.f55076a;
                try {
                    throw e10;
                } catch (Throwable th2) {
                    th = th2;
                    q0Var = q0Var2;
                    if (q0Var != null) {
                        g(q0Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            if (q0Var != null) {
                g(q0Var);
            }
            throw th;
        }
    }

    @Override // zl.i
    public final /* bridge */ /* synthetic */ zl.i c(zl.n nVar) {
        g((q0) nVar);
        return this;
    }

    public final Object clone() {
        p0 p0VarF = f();
        p0VarF.g(e());
        return p0VarF;
    }

    public final q0 e() {
        q0 q0Var = new q0(this);
        int i10 = this.f51390d;
        if ((i10 & 1) == 1) {
            this.f51391e = Collections.unmodifiableList(this.f51391e);
            this.f51390d &= -2;
        }
        q0Var.f51413d = this.f51391e;
        int i11 = (i10 & 2) != 2 ? 0 : 1;
        q0Var.f51414e = this.f51392f;
        if ((i10 & 4) == 4) {
            i11 |= 2;
        }
        q0Var.f51415f = this.f51393g;
        if ((i10 & 8) == 8) {
            i11 |= 4;
        }
        q0Var.f51416g = this.f51394h;
        if ((i10 & 16) == 16) {
            i11 |= 8;
        }
        q0Var.f51417h = this.f51395i;
        if ((i10 & 32) == 32) {
            i11 |= 16;
        }
        q0Var.f51418i = this.f51396j;
        if ((i10 & 64) == 64) {
            i11 |= 32;
        }
        q0Var.f51419j = this.f51397k;
        if ((i10 & 128) == 128) {
            i11 |= 64;
        }
        q0Var.f51420k = this.l;
        if ((i10 & NotificationCompat.FLAG_LOCAL_ONLY) == 256) {
            i11 |= 128;
        }
        q0Var.l = this.f51398m;
        if ((i10 & 512) == 512) {
            i11 |= NotificationCompat.FLAG_LOCAL_ONLY;
        }
        q0Var.f51421m = this.f51399n;
        if ((i10 & 1024) == 1024) {
            i11 |= 512;
        }
        q0Var.f51422n = this.f51400o;
        if ((i10 & com.ironsource.mediationsdk.metadata.a.f29616n) == 2048) {
            i11 |= 1024;
        }
        q0Var.f51423o = this.f51401p;
        if ((i10 & 4096) == 4096) {
            i11 |= com.ironsource.mediationsdk.metadata.a.f29616n;
        }
        q0Var.f51424p = this.f51402q;
        if ((i10 & Segment.SIZE) == 8192) {
            i11 |= 4096;
        }
        q0Var.f51425q = this.f51403r;
        q0Var.f51412c = i11;
        return q0Var;
    }

    public final p0 g(q0 q0Var) {
        q0 q0Var2;
        q0 q0Var3;
        q0 q0Var4;
        q0 q0Var5 = q0.f51409t;
        if (q0Var == q0Var5) {
            return this;
        }
        if (!q0Var.f51413d.isEmpty()) {
            if (this.f51391e.isEmpty()) {
                this.f51391e = q0Var.f51413d;
                this.f51390d &= -2;
            } else {
                if ((this.f51390d & 1) != 1) {
                    this.f51391e = new ArrayList(this.f51391e);
                    this.f51390d |= 1;
                }
                this.f51391e.addAll(q0Var.f51413d);
            }
        }
        int i10 = q0Var.f51412c;
        if ((i10 & 1) == 1) {
            boolean z10 = q0Var.f51414e;
            this.f51390d |= 2;
            this.f51392f = z10;
        }
        if ((i10 & 2) == 2) {
            int i11 = q0Var.f51415f;
            this.f51390d |= 4;
            this.f51393g = i11;
        }
        if ((i10 & 4) == 4) {
            q0 q0Var6 = q0Var.f51416g;
            if ((this.f51390d & 8) != 8 || (q0Var4 = this.f51394h) == q0Var5) {
                this.f51394h = q0Var6;
            } else {
                p0 p0VarU = q0.u(q0Var4);
                p0VarU.g(q0Var6);
                this.f51394h = p0VarU.e();
            }
            this.f51390d |= 8;
        }
        if ((q0Var.f51412c & 8) == 8) {
            int i12 = q0Var.f51417h;
            this.f51390d |= 16;
            this.f51395i = i12;
        }
        if (q0Var.s()) {
            int i13 = q0Var.f51418i;
            this.f51390d |= 32;
            this.f51396j = i13;
        }
        int i14 = q0Var.f51412c;
        if ((i14 & 32) == 32) {
            int i15 = q0Var.f51419j;
            this.f51390d |= 64;
            this.f51397k = i15;
        }
        if ((i14 & 64) == 64) {
            int i16 = q0Var.f51420k;
            this.f51390d |= 128;
            this.l = i16;
        }
        if ((i14 & 128) == 128) {
            int i17 = q0Var.l;
            this.f51390d |= NotificationCompat.FLAG_LOCAL_ONLY;
            this.f51398m = i17;
        }
        if ((i14 & NotificationCompat.FLAG_LOCAL_ONLY) == 256) {
            q0 q0Var7 = q0Var.f51421m;
            if ((this.f51390d & 512) != 512 || (q0Var3 = this.f51399n) == q0Var5) {
                this.f51399n = q0Var7;
            } else {
                p0 p0VarU2 = q0.u(q0Var3);
                p0VarU2.g(q0Var7);
                this.f51399n = p0VarU2.e();
            }
            this.f51390d |= 512;
        }
        int i18 = q0Var.f51412c;
        if ((i18 & 512) == 512) {
            int i19 = q0Var.f51422n;
            this.f51390d |= 1024;
            this.f51400o = i19;
        }
        if ((i18 & 1024) == 1024) {
            q0 q0Var8 = q0Var.f51423o;
            if ((this.f51390d & com.ironsource.mediationsdk.metadata.a.f29616n) != 2048 || (q0Var2 = this.f51401p) == q0Var5) {
                this.f51401p = q0Var8;
            } else {
                p0 p0VarU3 = q0.u(q0Var2);
                p0VarU3.g(q0Var8);
                this.f51401p = p0VarU3.e();
            }
            this.f51390d |= com.ironsource.mediationsdk.metadata.a.f29616n;
        }
        int i20 = q0Var.f51412c;
        if ((i20 & com.ironsource.mediationsdk.metadata.a.f29616n) == 2048) {
            int i21 = q0Var.f51424p;
            this.f51390d |= 4096;
            this.f51402q = i21;
        }
        if ((i20 & 4096) == 4096) {
            int i22 = q0Var.f51425q;
            this.f51390d |= Segment.SIZE;
            this.f51403r = i22;
        }
        d(q0Var);
        this.f55044a = this.f55044a.h(q0Var.f51411b);
        return this;
    }
}
