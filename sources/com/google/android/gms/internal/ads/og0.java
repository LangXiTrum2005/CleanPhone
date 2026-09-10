package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class og0 implements gx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18257a = 5;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fx1 f18258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kx1 f18259c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fx1 f18260d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kx1 f18261e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final kx1 f18262f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final kx1 f18263g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final kx1 f18264h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final kx1 f18265i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final kx1 f18266j;

    public og0(o40 o40Var, fx1 fx1Var, fx1 fx1Var2, u40 u40Var, o50 o50Var, fx1 fx1Var3, fx1 fx1Var4, fx1 fx1Var5, fx1 fx1Var6, fx1 fx1Var7) {
        this.f18259c = o40Var;
        this.f18258b = fx1Var;
        this.f18260d = fx1Var2;
        this.f18263g = u40Var;
        this.f18261e = fx1Var3;
        this.f18262f = fx1Var4;
        this.f18264h = fx1Var5;
        this.f18265i = fx1Var6;
        this.f18266j = fx1Var7;
    }

    @Override // com.google.android.gms.internal.ads.kx1
    public final Object zzb() {
        switch (this.f18257a) {
            case 0:
                return new mg0(((o40) this.f18259c).a(), (Executor) this.f18258b.zzb(), (qf) this.f18260d.zzb(), ((u40) this.f18263g).a(), o50.a(), (ul0) ((fx1) this.f18261e).zzb(), (mx0) ((fx1) this.f18262f).zzb(), (yh0) ((fx1) this.f18264h).zzb(), (zl0) ((fx1) this.f18265i).zzb(), (pu0) ((fx1) this.f18266j).zzb());
            case 1:
                Executor executor = (Executor) this.f18258b.zzb();
                Context contextA = ((o40) this.f18259c).a();
                WeakReference weakReference = ((m40) this.f18265i).f17239b.f15968d;
                ic1.h(weakReference);
                k00 k00Var = l00.f16608a;
                ic1.h(k00Var);
                return new yi0(executor, contextA, weakReference, k00Var, (nh0) this.f18260d.zzb(), (ScheduledExecutorService) ((fx1) this.f18261e).zzb(), (fi0) ((fx1) this.f18262f).zzb(), ((u40) this.f18263g).a(), new fc0(((ca0) this.f18266j).f13121b.zzb()), (kw0) ((fx1) this.f18264h).zzb());
            case 2:
                return new kp0((Context) ((hx1) this.f18259c).f15424a, (zzr) ((hx1) this.f18262f).f15424a, (String) ((hx1) this.f18264h).f15424a, (rt0) this.f18258b.zzb(), (hp0) this.f18260d.zzb(), (ut0) ((fx1) this.f18261e).zzb(), ((u40) this.f18265i).a(), (qf) this.f18266j.zzb(), (yh0) this.f18263g.zzb());
            case 3:
                Context contextA2 = ((o40) this.f18259c).a();
                String str = ((y80) ((g90) this.f18262f).f14800b.zzb()).f22193b.f12578e;
                ic1.h(str);
                return new oq0(contextA2, str, (String) this.f18264h.zzb(), (y80) this.f18258b.zzb(), (yu0) this.f18260d.zzb(), ((z90) this.f18265i).a(), (wh0) ((fx1) this.f18261e).zzb(), (d90) this.f18266j.zzb(), ((Long) this.f18263g.zzb()).longValue());
            case 4:
                bo0 bo0Var = (bo0) this.f18258b.zzb();
                VersionInfoParcel versionInfoParcelA = ((u40) this.f18259c).a();
                String str2 = ((y80) ((g90) this.f18261e).f14800b.zzb()).f22193b.f12578e;
                ic1.h(str2);
                return new lx0(bo0Var, versionInfoParcelA, str2, (String) this.f18262f.zzb(), ((o40) this.f18264h).a(), ((x90) this.f18265i).f21797b.f21465d, (mu0) this.f18260d.zzb(), (p9.a) this.f18266j.zzb(), (qf) this.f18263g.zzb());
            default:
                return new f61((z21) this.f18258b.zzb(), (z21) this.f18260d.zzb(), fx1.b((fx1) this.f18261e), (z21) ((fx1) this.f18262f).zzb(), (z21) ((fx1) this.f18264h).zzb(), fx1.b((fx1) this.f18265i), (File) ((fx1) this.f18266j).zzb(), (ExecutorService) this.f18259c.zzb(), (a71) this.f18263g.zzb());
        }
    }

    public og0(fx1 fx1Var, o40 o40Var, m40 m40Var, fx1 fx1Var2, fx1 fx1Var3, fx1 fx1Var4, u40 u40Var, ca0 ca0Var, fx1 fx1Var5) {
        this.f18258b = fx1Var;
        this.f18259c = o40Var;
        this.f18265i = m40Var;
        this.f18260d = fx1Var2;
        this.f18261e = fx1Var3;
        this.f18262f = fx1Var4;
        this.f18263g = u40Var;
        this.f18266j = ca0Var;
        this.f18264h = fx1Var5;
    }

    public og0(fx1 fx1Var, fx1 fx1Var2, fx1 fx1Var3, fx1 fx1Var4, fx1 fx1Var5, fx1 fx1Var6, fx1 fx1Var7, hx1 hx1Var, fx1 fx1Var8) {
        this.f18258b = fx1Var;
        this.f18260d = fx1Var2;
        this.f18261e = fx1Var3;
        this.f18262f = fx1Var4;
        this.f18264h = fx1Var5;
        this.f18265i = fx1Var6;
        this.f18266j = fx1Var7;
        this.f18259c = hx1Var;
        this.f18263g = fx1Var8;
    }

    public og0(fx1 fx1Var, kx1 kx1Var, g90 g90Var, kx1 kx1Var2, kx1 kx1Var3, x90 x90Var, fx1 fx1Var2, kx1 kx1Var4, kx1 kx1Var5) {
        this.f18258b = fx1Var;
        this.f18259c = kx1Var;
        this.f18261e = g90Var;
        this.f18262f = kx1Var2;
        this.f18264h = kx1Var3;
        this.f18265i = x90Var;
        this.f18260d = fx1Var2;
        this.f18266j = kx1Var4;
        this.f18263g = kx1Var5;
    }

    public og0(hx1 hx1Var, hx1 hx1Var2, hx1 hx1Var3, fx1 fx1Var, fx1 fx1Var2, fx1 fx1Var3, u40 u40Var, fx1 fx1Var4, fx1 fx1Var5) {
        this.f18259c = hx1Var;
        this.f18262f = hx1Var2;
        this.f18264h = hx1Var3;
        this.f18258b = fx1Var;
        this.f18260d = fx1Var2;
        this.f18261e = fx1Var3;
        this.f18265i = u40Var;
        this.f18266j = fx1Var4;
        this.f18263g = fx1Var5;
    }

    public og0(kx1 kx1Var, g90 g90Var, kx1 kx1Var2, fx1 fx1Var, fx1 fx1Var2, z90 z90Var, fx1 fx1Var3, kx1 kx1Var3, kx1 kx1Var4) {
        this.f18259c = kx1Var;
        this.f18262f = g90Var;
        this.f18264h = kx1Var2;
        this.f18258b = fx1Var;
        this.f18260d = fx1Var2;
        this.f18265i = z90Var;
        this.f18261e = fx1Var3;
        this.f18266j = kx1Var3;
        this.f18263g = kx1Var4;
    }
}
