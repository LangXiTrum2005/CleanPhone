package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class q70 implements gx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18956a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kx1 f18957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kx1 f18958c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kx1 f18959d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kx1 f18960e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final kx1 f18961f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final kx1 f18962g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final kx1 f18963h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final kx1 f18964i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final kx1 f18965j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final kx1 f18966k;

    public q70(w80 w80Var, fx1 fx1Var, u70 u70Var, u70 u70Var2, u70 u70Var3, u70 u70Var4, od0 od0Var, fx1 fx1Var2, er0 er0Var, fx1 fx1Var3) {
        this.f18961f = w80Var;
        this.f18957b = fx1Var;
        this.f18962g = u70Var;
        this.f18963h = u70Var2;
        this.f18964i = u70Var3;
        this.f18965j = u70Var4;
        this.f18959d = od0Var;
        this.f18958c = fx1Var2;
        this.f18966k = er0Var;
        this.f18960e = fx1Var3;
    }

    public p70 a() {
        k80 k80VarA = ((w80) this.f18961f).a();
        Context context = (Context) this.f18957b.zzb();
        eu0 eu0Var = (eu0) ((u70) this.f18962g).f20672b.f15435d;
        ic1.h(eu0Var);
        View view = (View) ((u70) this.f18963h).f20672b.f15434c;
        ic1.h(view);
        b30 b30Var = (b30) ((u70) this.f18964i).f20672b.f15436e;
        j80 j80Var = (j80) ((u70) this.f18965j).f20672b.f15433b;
        ne0 ne0Var = (ne0) ((od0) this.f18959d).f18238a.f17399b;
        ic1.h(ne0Var);
        return new p70(k80VarA, context, eu0Var, view, b30Var, j80Var, ne0Var, (rc0) ((fx1) this.f18958c).zzb(), fx1.b((er0) this.f18966k), (Executor) this.f18960e.zzb());
    }

    public nk0 b() {
        a50 a50Var = (a50) this.f18957b.zzb();
        Context contextA = ((o40) this.f18959d).a();
        VersionInfoParcel versionInfoParcelA = ((u40) this.f18960e).a();
        ou0 ou0VarA = ((z90) this.f18961f).a();
        k00 k00Var = l00.f16608a;
        ic1.h(k00Var);
        return new nk0(a50Var, contextA, versionInfoParcelA, ou0VarA, k00Var, (String) ((gx1) this.f18962g).zzb(), (jw0) ((fx1) this.f18958c).zzb(), (wh0) ((fx1) this.f18963h).zzb(), new jq(11), (ScheduledExecutorService) this.f18964i.zzb(), (mx0) this.f18965j.zzb(), new lb0(((ca0) this.f18966k).f13121b.zzb()));
    }

    public yn0 c() {
        return new yn0((a50) this.f18957b.zzb(), ((x90) this.f18961f).f21797b.a(), ((to0) this.f18959d).f20449b, ((cc0) this.f18960e).f13134b, (md0) ((e60) this.f18962g).f13858b, (jb0) ((h80) this.f18963h).f15207a.f17399b, (ViewGroup) ((vf) ((e60) this.f18964i).f13858b).f21157b, (ub0) ((fx1) this.f18958c).zzb(), (bo0) ((fx1) this.f18965j).zzb(), (sm0) ((fx1) this.f18966k).zzb());
    }

    @Override // com.google.android.gms.internal.ads.kx1
    public final Object zzb() {
        switch (this.f18956a) {
            case 0:
                return a();
            case 1:
                return new bg0(((z90) this.f18961f).a(), (Executor) this.f18957b.zzb(), (eh0) ((fx1) this.f18958c).zzb(), (Context) ((fx1) this.f18962g).zzb(), (yh0) this.f18959d.zzb(), (mx0) this.f18960e.zzb(), (ul0) this.f18963h.zzb(), (rg0) ((fx1) this.f18964i).zzb(), (wh0) ((fx1) this.f18965j).zzb(), (ji0) this.f18966k.zzb());
            case 2:
                return new qg0((ba0) ((fx1) this.f18958c).zzb(), (qa0) ((fx1) this.f18961f).zzb(), (wa0) this.f18957b.zzb(), (bb0) ((fx1) this.f18962g).zzb(), (tb0) this.f18959d.zzb(), (pc0) ((fx1) this.f18963h).zzb(), (yh0) this.f18960e.zzb(), (mx0) this.f18964i.zzb(), (ul0) this.f18965j.zzb(), (m60) ((fx1) this.f18966k).zzb());
            case 3:
                return b();
            case 4:
                return c();
            default:
                return new x31((fe1) this.f18957b.zzb(), (y31) this.f18959d.zzb(), (h41) this.f18960e.zzb(), (p21) ((hx1) this.f18961f).f15424a, (String) ((hx1) this.f18962g).f15424a, (xd) ((hx1) this.f18963h).f15424a, (lx1) this.f18964i, (lx1) this.f18965j, (lx1) this.f18958c, (a71) this.f18966k.zzb());
        }
    }

    public q70(z90 z90Var, kx1 kx1Var, fx1 fx1Var, fx1 fx1Var2, kx1 kx1Var2, kx1 kx1Var3, kx1 kx1Var4, fx1 fx1Var3, fx1 fx1Var4, kx1 kx1Var5) {
        this.f18961f = z90Var;
        this.f18957b = kx1Var;
        this.f18958c = fx1Var;
        this.f18962g = fx1Var2;
        this.f18959d = kx1Var2;
        this.f18960e = kx1Var3;
        this.f18963h = kx1Var4;
        this.f18964i = fx1Var3;
        this.f18965j = fx1Var4;
        this.f18966k = kx1Var5;
    }

    public q70(fx1 fx1Var, fx1 fx1Var2, fx1 fx1Var3, fx1 fx1Var4, fx1 fx1Var5, fx1 fx1Var6, fx1 fx1Var7, fx1 fx1Var8, fx1 fx1Var9, fx1 fx1Var10) {
        this.f18958c = fx1Var;
        this.f18961f = fx1Var2;
        this.f18957b = fx1Var3;
        this.f18962g = fx1Var4;
        this.f18959d = fx1Var5;
        this.f18963h = fx1Var6;
        this.f18960e = fx1Var7;
        this.f18964i = fx1Var8;
        this.f18965j = fx1Var9;
        this.f18966k = fx1Var10;
    }

    public q70(fx1 fx1Var, fx1 fx1Var2, fx1 fx1Var3, hx1 hx1Var, hx1 hx1Var2, hx1 hx1Var3, lx1 lx1Var, lx1 lx1Var2, lx1 lx1Var3, fx1 fx1Var4) {
        this.f18957b = fx1Var;
        this.f18959d = fx1Var2;
        this.f18960e = fx1Var3;
        this.f18961f = hx1Var;
        this.f18962g = hx1Var2;
        this.f18963h = hx1Var3;
        this.f18964i = lx1Var;
        this.f18965j = lx1Var2;
        this.f18958c = lx1Var3;
        this.f18966k = fx1Var4;
    }

    public q70(kx1 kx1Var, x90 x90Var, to0 to0Var, cc0 cc0Var, e60 e60Var, h80 h80Var, e60 e60Var2, fx1 fx1Var, fx1 fx1Var2, fx1 fx1Var3) {
        this.f18957b = kx1Var;
        this.f18961f = x90Var;
        this.f18959d = to0Var;
        this.f18960e = cc0Var;
        this.f18962g = e60Var;
        this.f18963h = h80Var;
        this.f18964i = e60Var2;
        this.f18958c = fx1Var;
        this.f18965j = fx1Var2;
        this.f18966k = fx1Var3;
    }

    public q70(kx1 kx1Var, kx1 kx1Var2, kx1 kx1Var3, z90 z90Var, gx1 gx1Var, fx1 fx1Var, fx1 fx1Var2, kx1 kx1Var4, kx1 kx1Var5, ca0 ca0Var) {
        this.f18957b = kx1Var;
        this.f18959d = kx1Var2;
        this.f18960e = kx1Var3;
        this.f18961f = z90Var;
        this.f18962g = gx1Var;
        this.f18958c = fx1Var;
        this.f18963h = fx1Var2;
        this.f18964i = kx1Var4;
        this.f18965j = kx1Var5;
        this.f18966k = ca0Var;
    }
}
