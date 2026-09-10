package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzt;
import java.util.HashSet;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f22703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f22704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a50 f22705c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hp0 f22706d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final jp0 f22707e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final FrameLayout f22708f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public jm f22709g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final jb0 f22710h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final kw0 f22711i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ub0 f22712j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final nu0 f22713k;
    public uv0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f22714m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public zze f22715n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public mp0 f22716o;

    public zs0(Context context, Executor executor, zzr zzrVar, a50 a50Var, hp0 hp0Var, jp0 jp0Var, nu0 nu0Var, ub0 ub0Var) {
        this.f22703a = context;
        this.f22704b = executor;
        this.f22705c = a50Var;
        this.f22706d = hp0Var;
        this.f22707e = jp0Var;
        this.f22713k = nu0Var;
        this.f22710h = new jb0((ScheduledExecutorService) a50Var.f11858d.zzb(), (p9.a) a50Var.f11862f.zzb(), (yh0) a50Var.f11874m.zzb());
        this.f22711i = a50Var.c();
        this.f22708f = new FrameLayout(context);
        this.f22712j = ub0Var;
        nu0Var.f17958b = zzrVar;
        this.f22714m = true;
        this.f22715n = null;
        this.f22716o = null;
    }

    public final boolean a(zzm zzmVar, String str, ps1 ps1Var, mp0 mp0Var) {
        f50 f50Var;
        int i10 = 0;
        Executor executor = this.f22704b;
        if (str == null) {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzf("Ad unit ID should not be null for banner ad.");
            executor.execute(new x60(this, 23));
            return false;
        }
        boolean zB = b();
        nu0 nu0Var = this.f22713k;
        if (!zB) {
            if (((Boolean) zzba.zzc().a(am.n3)).booleanValue()) {
                zzay.zzc();
            }
            boolean zBooleanValue = ((Boolean) zzba.zzc().a(am.f12393va)).booleanValue();
            a50 a50Var = this.f22705c;
            if (zBooleanValue && zzmVar.zzf) {
                ((lj0) a50Var.C.zzb()).b(true);
            }
            Pair pair = new Pair("api-call", Long.valueOf(zzmVar.zzz));
            ((p9.b) zzt.zzk()).getClass();
            Bundle bundleC = rb0.c(pair, new Pair("dynamite-enter", Long.valueOf(System.currentTimeMillis())));
            nu0Var.f17959c = str;
            nu0Var.f17957a = zzmVar;
            nu0Var.f17975t = bundleC;
            ou0 ou0VarA = nu0Var.a();
            int iX = ps1.X(ou0VarA);
            Context context = this.f22703a;
            fw0 fw0VarD = fw0.d(context, iX, 3, zzmVar);
            boolean zBooleanValue2 = ((Boolean) mn.f17490f.o()).booleanValue();
            hp0 hp0Var = this.f22706d;
            jw0 jw0Var = null;
            if (!zBooleanValue2 || !nu0Var.f17958b.zzk) {
                boolean zBooleanValue3 = ((Boolean) zzba.zzc().a(am.A9)).booleanValue();
                int i12 = 15;
                FrameLayout frameLayout = this.f22708f;
                ub0 ub0Var = this.f22712j;
                jb0 jb0Var = this.f22710h;
                if (zBooleanValue3) {
                    a50 a50Var2 = a50Var.f11854b;
                    v90 v90Var = new v90();
                    v90Var.f21135a = context;
                    v90Var.f21136b = ou0VarA;
                    w90 w90Var = new w90(v90Var);
                    ac0 ac0Var = new ac0();
                    ac0Var.d(hp0Var, executor);
                    ac0Var.b(hp0Var, executor);
                    bc0 bc0Var = new bc0(ac0Var);
                    so0 so0Var = new so0(this.f22709g, i10);
                    md0 md0Var = new md0(i10, ne0.f17780h, jw0Var);
                    md0 md0Var2 = new md0(i12, jb0Var, ub0Var);
                    f50Var = new f50(a50Var2, new vf(frameLayout, i12), md0Var, new tc0(9), bc0Var, w90Var, new so0(29), so0Var, md0Var2, null, null);
                } else {
                    a50 a50Var3 = a50Var.f11854b;
                    v90 v90Var2 = new v90();
                    v90Var2.f21135a = context;
                    v90Var2.f21136b = ou0VarA;
                    w90 w90Var2 = new w90(v90Var2);
                    ac0 ac0Var2 = new ac0();
                    HashSet hashSet = (HashSet) ac0Var2.f11979c;
                    ac0Var2.d(hp0Var, executor);
                    hashSet.add(new nc0(hp0Var, executor));
                    hashSet.add(new nc0(this.f22707e, executor));
                    ac0Var2.c(hp0Var, executor);
                    ((HashSet) ac0Var2.f11982f).add(new nc0(hp0Var, executor));
                    ((HashSet) ac0Var2.f11981e).add(new nc0(hp0Var, executor));
                    ((HashSet) ac0Var2.f11984h).add(new nc0(hp0Var, executor));
                    ac0Var2.a(hp0Var, executor);
                    ac0Var2.b(hp0Var, executor);
                    ((HashSet) ac0Var2.f11988m).add(new nc0(hp0Var, executor));
                    bc0 bc0Var2 = new bc0(ac0Var2);
                    so0 so0Var2 = new so0(this.f22709g, i10);
                    md0 md0Var3 = new md0(i10, ne0.f17780h, jw0Var);
                    int i13 = 15;
                    md0 md0Var4 = new md0(i13, jb0Var, ub0Var);
                    f50Var = new f50(a50Var3, new vf(frameLayout, i13), md0Var3, new tc0(9), bc0Var2, w90Var2, new so0(29), so0Var2, md0Var4, null, null);
                }
                if (((Boolean) an.f12466c.o()).booleanValue()) {
                    jw0Var = (jw0) f50Var.l.zzb();
                    jw0Var.i(3);
                    jw0Var.c(zzmVar.zzp);
                    jw0Var.d(zzmVar.zzm);
                }
                this.f22716o = mp0Var;
                v80 v80Var = (v80) f50Var.f14244t.zzb();
                uv0 uv0VarC = v80Var.c(v80Var.b());
                this.l = uv0VarC;
                uv0VarC.addListener(new zd1(i10, uv0VarC, new uw(this, jw0Var, fw0VarD, f50Var, 11, false)), executor);
                return true;
            }
            if (hp0Var != null) {
                hp0Var.j0(pi1.C(7, null, null));
            }
        } else if (!nu0Var.f17971p) {
            this.f22714m = true;
            return false;
        }
        return false;
    }

    public final boolean b() {
        uv0 uv0Var = this.l;
        return (uv0Var == null || uv0Var.f20915c.isDone()) ? false : true;
    }

    public final void c() {
        synchronized (this) {
            try {
                uv0 uv0Var = this.l;
                if (uv0Var != null && uv0Var.f20915c.isDone()) {
                    try {
                        p70 p70Var = (p70) this.l.f20915c.get();
                        this.l = null;
                        FrameLayout frameLayout = this.f22708f;
                        frameLayout.removeAllViews();
                        p70Var.getClass();
                        ViewParent parent = p70Var.f18543m.getParent();
                        if (parent instanceof ViewGroup) {
                            String str = p70Var.f17339f.f11954a;
                            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 78);
                            sb2.append("Banner view provided from ");
                            sb2.append(str);
                            sb2.append(" already has a parent view. Removing its old parent.");
                            String string = sb2.toString();
                            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                            zzo.zzi(string);
                            ((ViewGroup) parent).removeView(p70Var.f18543m);
                        }
                        ul ulVar = am.A9;
                        if (((Boolean) zzba.zzc().a(ulVar)).booleanValue()) {
                            x11 x11Var = p70Var.f17340g.f17733a;
                            hp0 hp0Var = this.f22706d;
                            nb0 nb0Var = (nb0) x11Var.f21703b;
                            nb0Var.f17734b = hp0Var;
                            nb0Var.f17735c = this.f22707e;
                        }
                        frameLayout.addView(p70Var.f18543m);
                        mp0 mp0Var = this.f22716o;
                        if (mp0Var != null) {
                            mp0Var.f(p70Var);
                        }
                        if (((Boolean) zzba.zzc().a(ulVar)).booleanValue()) {
                            Executor executor = this.f22704b;
                            hp0 hp0Var2 = this.f22706d;
                            Objects.requireNonNull(hp0Var2);
                            executor.execute(new x60(hp0Var2, 24));
                        }
                        int i11 = ((fu0) p70Var.f17334a.f16196b.f20920d).f14548d;
                        if (i11 >= 0) {
                            this.f22714m = false;
                            jb0 jb0Var = this.f22710h;
                            jb0Var.X0(i11);
                            jb0Var.Y0(p70Var.d());
                        } else {
                            this.f22714m = true;
                            this.f22710h.X0(p70Var.d());
                        }
                    } catch (InterruptedException | ExecutionException e10) {
                        d();
                        com.google.android.gms.ads.internal.util.zze.zzb("Error occurred while refreshing the ad. Making a new ad request.", e10);
                        this.f22714m = true;
                        this.f22710h.zzc();
                    }
                } else if (this.l != null) {
                    com.google.android.gms.ads.internal.util.zze.zza("Show timer went off but there is an ongoing ad request.");
                    this.f22714m = true;
                } else {
                    com.google.android.gms.ads.internal.util.zze.zza("No ad request was in progress or an ad was cached when show timer went off. Hence requesting a new ad.");
                    this.f22714m = true;
                    this.f22710h.zzc();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d() {
        this.l = null;
        zze zzeVar = this.f22715n;
        this.f22715n = null;
        if (((Boolean) zzba.zzc().a(am.A9)).booleanValue() && zzeVar != null) {
            this.f22704b.execute(new gm0(7, this, zzeVar));
        }
        mp0 mp0Var = this.f22716o;
        if (mp0Var != null) {
            mp0Var.mo168zza();
        }
    }
}
