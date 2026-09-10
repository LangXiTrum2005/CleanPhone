package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzj;
import com.google.android.gms.ads.nonagon.devicetier.DeviceTierManager;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class te0 implements gx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20335a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fx1 f20336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kx1 f20337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kx1 f20338d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kx1 f20339e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final kx1 f20340f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final kx1 f20341g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final kx1 f20342h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final kx1 f20343i;

    public te0(k40 k40Var, z90 z90Var, kx1 kx1Var, e60 e60Var, gx1 gx1Var, gx1 gx1Var2, fx1 fx1Var, fx1 fx1Var2) {
        this.f20337c = k40Var;
        this.f20340f = z90Var;
        this.f20338d = kx1Var;
        this.f20341g = e60Var;
        this.f20342h = gx1Var;
        this.f20343i = gx1Var2;
        this.f20339e = fx1Var;
        this.f20336b = fx1Var2;
    }

    public se0 a() {
        zzj zzjVarZzb = ((k40) this.f20337c).zzb();
        ou0 ou0VarA = ((z90) this.f20340f).a();
        le0 le0Var = (le0) this.f20338d.zzb();
        je0 je0VarA = ((e60) this.f20341g).a();
        ze0 ze0Var = (ze0) ((gx1) this.f20342h).zzb();
        cf0 cf0Var = (cf0) ((gx1) this.f20343i).zzb();
        Executor executor = (Executor) this.f20339e.zzb();
        k00 k00Var = l00.f16608a;
        ic1.h(k00Var);
        return new se0(zzjVarZzb, ou0VarA, le0Var, je0VarA, ze0Var, cf0Var, executor, k00Var, (ge0) this.f20336b.zzb());
    }

    @Override // com.google.android.gms.internal.ads.kx1
    public final Object zzb() {
        switch (this.f20335a) {
            case 0:
                return a();
            case 1:
                return new lg0((ba0) this.f20336b.zzb(), (qa0) ((fx1) this.f20339e).zzb(), (wa0) this.f20337c.zzb(), (bb0) ((fx1) this.f20340f).zzb(), (tb0) this.f20338d.zzb(), ((t80) this.f20341g).a(), ((t80) this.f20342h).f20240b.n(), (m60) ((fx1) this.f20343i).zzb());
            case 2:
                return new wh0(((o40) this.f20337c).a(), (ci0) this.f20338d.zzb(), ((v40) this.f20339e).zzb(), ((z90) this.f20340f).a(), (String) this.f20336b.zzb(), (String) this.f20341g.zzb(), (qf) this.f20342h.zzb(), (DeviceTierManager) this.f20343i.zzb());
            case 3:
                return new lj0((oj0) this.f20336b.zzb(), (yj0) ((fx1) this.f20337c).zzb(), (bj0) ((fx1) this.f20338d).zzb(), ((o40) this.f20339e).a(), ((u40) this.f20340f).a(), (hj0) ((fx1) this.f20341g).zzb(), (vj0) ((fx1) this.f20342h).zzb(), new lz(), new lz(), ((q40) this.f20343i).zzb());
            case 4:
                k00 k00Var = l00.f16608a;
                ic1.h(k00Var);
                return new ur0(k00Var, (ScheduledExecutorService) this.f20337c.zzb(), (String) this.f20338d.zzb(), (yo0) this.f20339e.zzb(), (Context) this.f20336b.zzb(), ((z90) this.f20340f).a(), (vo0) ((fx1) this.f20341g).zzb(), (nh0) this.f20342h.zzb(), (zi0) this.f20343i.zzb());
            case 5:
                return new au0((String) ((hx1) this.f20340f).f15424a, (yt0) this.f20336b.zzb(), (Context) ((hx1) this.f20341g).f15424a, (ut0) ((fx1) this.f20342h).zzb(), (ku0) ((fx1) this.f20343i).zzb(), ((u40) this.f20337c).a(), (qf) this.f20338d.zzb(), (yh0) this.f20339e.zzb());
            default:
                return new gy0(((o40) this.f20337c).a(), ((u40) this.f20338d).a(), (ScheduledExecutorService) this.f20336b.zzb(), (sv0) ((fx1) this.f20339e).zzb(), vu0.h(((n40) this.f20340f).f17639b.a()), (p9.a) ((fx1) this.f20341g).zzb(), (qx0) ((fx1) this.f20342h).zzb(), ((s40) this.f20343i).a());
        }
    }

    public te0(o40 o40Var, u40 u40Var, fx1 fx1Var, fx1 fx1Var2, n40 n40Var, fx1 fx1Var3, fx1 fx1Var4, s40 s40Var) {
        this.f20337c = o40Var;
        this.f20338d = u40Var;
        this.f20336b = fx1Var;
        this.f20339e = fx1Var2;
        this.f20340f = n40Var;
        this.f20341g = fx1Var3;
        this.f20342h = fx1Var4;
        this.f20343i = s40Var;
    }

    public te0(o40 o40Var, fx1 fx1Var, v40 v40Var, z90 z90Var, fx1 fx1Var2, kx1 kx1Var, fx1 fx1Var3, fx1 fx1Var4) {
        this.f20337c = o40Var;
        this.f20338d = fx1Var;
        this.f20339e = v40Var;
        this.f20340f = z90Var;
        this.f20336b = fx1Var2;
        this.f20341g = kx1Var;
        this.f20342h = fx1Var3;
        this.f20343i = fx1Var4;
    }

    public te0(fx1 fx1Var, fx1 fx1Var2, fx1 fx1Var3, o40 o40Var, u40 u40Var, fx1 fx1Var4, fx1 fx1Var5, q40 q40Var) {
        this.f20336b = fx1Var;
        this.f20337c = fx1Var2;
        this.f20338d = fx1Var3;
        this.f20339e = o40Var;
        this.f20340f = u40Var;
        this.f20341g = fx1Var4;
        this.f20342h = fx1Var5;
        this.f20343i = q40Var;
    }

    public te0(fx1 fx1Var, fx1 fx1Var2, fx1 fx1Var3, fx1 fx1Var4, fx1 fx1Var5, t80 t80Var, t80 t80Var2, fx1 fx1Var6) {
        this.f20336b = fx1Var;
        this.f20339e = fx1Var2;
        this.f20337c = fx1Var3;
        this.f20340f = fx1Var4;
        this.f20338d = fx1Var5;
        this.f20341g = t80Var;
        this.f20342h = t80Var2;
        this.f20343i = fx1Var6;
    }

    public te0(hx1 hx1Var, fx1 fx1Var, hx1 hx1Var2, fx1 fx1Var2, fx1 fx1Var3, u40 u40Var, fx1 fx1Var4, fx1 fx1Var5) {
        this.f20340f = hx1Var;
        this.f20336b = fx1Var;
        this.f20341g = hx1Var2;
        this.f20342h = fx1Var2;
        this.f20343i = fx1Var3;
        this.f20337c = u40Var;
        this.f20338d = fx1Var4;
        this.f20339e = fx1Var5;
    }

    public te0(kx1 kx1Var, kx1 kx1Var2, kx1 kx1Var3, fx1 fx1Var, z90 z90Var, fx1 fx1Var2, kx1 kx1Var4, kx1 kx1Var5) {
        this.f20337c = kx1Var;
        this.f20338d = kx1Var2;
        this.f20339e = kx1Var3;
        this.f20336b = fx1Var;
        this.f20340f = z90Var;
        this.f20341g = fx1Var2;
        this.f20342h = kx1Var4;
        this.f20343i = kx1Var5;
    }
}
