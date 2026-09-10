package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class rt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f19657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f19658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a50 f19659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hp0 f19660d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ut0 f19661e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public jm f19662f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final kw0 f19663g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final nu0 f19664h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public uv0 f19665i;

    public rt0(Context context, Executor executor, a50 a50Var, hp0 hp0Var, ut0 ut0Var, nu0 nu0Var) {
        this.f19657a = context;
        this.f19658b = executor;
        this.f19659c = a50Var;
        this.f19660d = hp0Var;
        this.f19664h = nu0Var;
        this.f19661e = ut0Var;
        this.f19663g = a50Var.c();
    }

    public final boolean a(zzm zzmVar, String str, ps1 ps1Var, mp0 mp0Var) {
        i50 i50Var;
        jw0 jw0Var;
        Executor executor = this.f19658b;
        if (str == null) {
            int i10 = zze.zza;
            zzo.zzf("Ad unit ID should not be null for interstitial ad.");
            executor.execute(new x60(this, 25));
            return false;
        }
        if (b()) {
            return false;
        }
        if (((Boolean) zzba.zzc().a(am.n3)).booleanValue()) {
            zzay.zzc();
        }
        boolean zBooleanValue = ((Boolean) zzba.zzc().a(am.f12393va)).booleanValue();
        a50 a50Var = this.f19659c;
        if (zBooleanValue && zzmVar.zzf) {
            ((lj0) a50Var.C.zzb()).b(true);
        }
        zzr zzrVar = ((ot0) ps1Var).f18357u;
        Pair pair = new Pair("api-call", Long.valueOf(zzmVar.zzz));
        ((p9.b) zzt.zzk()).getClass();
        Bundle bundleC = rb0.c(pair, new Pair("dynamite-enter", Long.valueOf(System.currentTimeMillis())));
        nu0 nu0Var = this.f19664h;
        nu0Var.f17959c = str;
        nu0Var.f17958b = zzrVar;
        nu0Var.f17957a = zzmVar;
        nu0Var.f17975t = bundleC;
        ou0 ou0VarA = nu0Var.a();
        int iX = ps1.X(ou0VarA);
        Context context = this.f19657a;
        fw0 fw0VarD = fw0.d(context, iX, 4, zzmVar);
        boolean zBooleanValue2 = ((Boolean) zzba.zzc().a(am.C9)).booleanValue();
        hp0 hp0Var = this.f19660d;
        if (zBooleanValue2) {
            a50 a50Var2 = a50Var.f11854b;
            v90 v90Var = new v90();
            v90Var.f21135a = context;
            v90Var.f21136b = ou0VarA;
            w90 w90Var = new w90(v90Var);
            ac0 ac0Var = new ac0();
            ac0Var.d(hp0Var, executor);
            ac0Var.b(hp0Var, executor);
            i50Var = new i50(a50Var2, new tc0(9), new bc0(ac0Var), w90Var, new so0(29), new so0(this.f19662f, 0), null, null);
        } else {
            ac0 ac0Var2 = new ac0();
            HashSet hashSet = (HashSet) ac0Var2.f11984h;
            HashSet hashSet2 = (HashSet) ac0Var2.f11981e;
            ut0 ut0Var = this.f19661e;
            if (ut0Var != null) {
                hashSet2.add(new nc0(ut0Var, executor));
                hashSet.add(new nc0(ut0Var, executor));
                ac0Var2.a(ut0Var, executor);
            }
            a50 a50Var3 = a50Var.f11854b;
            v90 v90Var2 = new v90();
            v90Var2.f21135a = context;
            v90Var2.f21136b = ou0VarA;
            w90 w90Var2 = new w90(v90Var2);
            ac0Var2.d(hp0Var, executor);
            hashSet2.add(new nc0(hp0Var, executor));
            hashSet.add(new nc0(hp0Var, executor));
            ac0Var2.a(hp0Var, executor);
            ((HashSet) ac0Var2.f11979c).add(new nc0(hp0Var, executor));
            ac0Var2.c(hp0Var, executor);
            ac0Var2.b(hp0Var, executor);
            ((HashSet) ac0Var2.f11988m).add(new nc0(hp0Var, executor));
            ((HashSet) ac0Var2.l).add(new nc0(hp0Var, executor));
            i50Var = new i50(a50Var3, new tc0(9), new bc0(ac0Var2), w90Var2, new so0(29), new so0(this.f19662f, 0), null, null);
        }
        if (((Boolean) an.f12466c.o()).booleanValue()) {
            jw0Var = (jw0) i50Var.f15584i.zzb();
            jw0Var.i(4);
            jw0Var.c(zzmVar.zzp);
            jw0Var.d(zzmVar.zzm);
        } else {
            jw0Var = null;
        }
        v80 v80Var = (v80) i50Var.f15589o.zzb();
        uv0 uv0VarC = v80Var.c(v80Var.b());
        this.f19665i = uv0VarC;
        uv0VarC.addListener(new zd1(0, uv0VarC, new o8(this, mp0Var, jw0Var, fw0VarD, i50Var, 5)), executor);
        return 1;
    }

    public final boolean b() {
        uv0 uv0Var = this.f19665i;
        return (uv0Var == null || uv0Var.f20915c.isDone()) ? false : true;
    }
}
