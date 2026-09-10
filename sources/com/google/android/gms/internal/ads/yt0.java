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
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class yt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f22363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f22364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a50 f22365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ut0 f22366d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final lt0 f22367e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ku0 f22368f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final kw0 f22369g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final nu0 f22370h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ListenableFuture f22371i;

    public yt0(Context context, Executor executor, a50 a50Var, lt0 lt0Var, ut0 ut0Var, nu0 nu0Var, ku0 ku0Var) {
        this.f22363a = context;
        this.f22364b = executor;
        this.f22365c = a50Var;
        this.f22367e = lt0Var;
        this.f22366d = ut0Var;
        this.f22370h = nu0Var;
        this.f22368f = ku0Var;
        this.f22369g = a50Var.c();
    }

    public final boolean a(zzm zzmVar, String str, ps1 ps1Var, mp0 mp0Var) {
        jw0 jw0Var;
        Executor executor = this.f22364b;
        if (str == null) {
            int i10 = zze.zza;
            zzo.zzf("Ad unit ID should not be null for rewarded video ad.");
            executor.execute(new x60(this, 27));
            return false;
        }
        ListenableFuture listenableFuture = this.f22371i;
        if (listenableFuture != null && !listenableFuture.isDone()) {
            return false;
        }
        if (((Boolean) zzba.zzc().a(am.n3)).booleanValue()) {
            zzay.zzc();
        }
        boolean zBooleanValue = ((Boolean) an.f12466c.o()).booleanValue();
        lt0 lt0Var = this.f22367e;
        if (!zBooleanValue || lt0Var.zzd() == null) {
            jw0Var = null;
        } else {
            jw0Var = (jw0) ((m50) ((xg0) lt0Var.zzd())).f17258g.zzb();
            jw0Var.i(5);
            jw0Var.c(zzmVar.zzp);
            jw0Var.d(zzmVar.zzm);
        }
        boolean z10 = zzmVar.zzf;
        Context context = this.f22363a;
        v71.p(context, z10);
        if (((Boolean) zzba.zzc().a(am.f12393va)).booleanValue() && z10) {
            ((lj0) this.f22365c.C.zzb()).b(true);
        }
        Pair pair = new Pair("api-call", Long.valueOf(zzmVar.zzz));
        ((p9.b) zzt.zzk()).getClass();
        Bundle bundleC = rb0.c(pair, new Pair("dynamite-enter", Long.valueOf(System.currentTimeMillis())));
        nu0 nu0Var = this.f22370h;
        nu0Var.f17959c = str;
        nu0Var.f17958b = zzr.zzc();
        nu0Var.f17957a = zzmVar;
        nu0Var.f17975t = bundleC;
        ou0 ou0VarA = nu0Var.a();
        fw0 fw0VarD = fw0.d(context, ps1.X(ou0VarA), 5, zzmVar);
        wt0 wt0Var = new wt0();
        wt0Var.f21604a = ou0VarA;
        ListenableFuture listenableFutureE = lt0Var.e(new lj1(28, wt0Var, (Object) null), new uo0(this, 3));
        this.f22371i = listenableFutureE;
        listenableFutureE.addListener(new zd1(0, listenableFutureE, new o8(this, mp0Var, jw0Var, fw0VarD, wt0Var, 6)), executor);
        return true;
    }

    public final c50 b(jt0 jt0Var) {
        c50 c50Var = new c50(this.f22365c.f11854b, 1);
        v90 v90Var = new v90();
        v90Var.f21135a = this.f22363a;
        v90Var.f21136b = ((wt0) jt0Var).f21604a;
        v90Var.f21138d = this.f22368f;
        c50Var.f13047f = new w90(v90Var);
        c50Var.f13046e = new bc0(new ac0());
        return c50Var;
    }
}
