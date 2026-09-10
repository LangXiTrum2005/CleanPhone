package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class us0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f20881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f20882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a50 f20883c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ts0 f20884d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final lt0 f20885e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final VersionInfoParcel f20886f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final FrameLayout f20887g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final kw0 f20888h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final nu0 f20889i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ListenableFuture f20890j;

    public us0(Context context, Executor executor, a50 a50Var, lt0 lt0Var, ts0 ts0Var, nu0 nu0Var, VersionInfoParcel versionInfoParcel) {
        this.f20881a = context;
        this.f20882b = executor;
        this.f20883c = a50Var;
        this.f20885e = lt0Var;
        this.f20884d = ts0Var;
        this.f20889i = nu0Var;
        this.f20886f = versionInfoParcel;
        this.f20887g = new FrameLayout(context);
        this.f20888h = a50Var.c();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    public final synchronized boolean a(zzm zzmVar, String str, ps1 ps1Var, mp0 mp0Var) throws Throwable {
        us0 us0Var;
        Throwable th2;
        boolean z10;
        jw0 jw0Var;
        k70 k70Var;
        try {
            if (!zzmVar.zzb()) {
                if (((Boolean) dn.f13592d.o()).booleanValue()) {
                    try {
                        if (((Boolean) zzba.zzc().a(am.Oc)).booleanValue()) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                        us0Var = this;
                    }
                } else {
                    z10 = false;
                }
                if (this.f20886f.clientJarVersion < ((Integer) zzba.zzc().a(am.Pc)).intValue() || !z10) {
                    k9.c0.d("loadAd must be called on the main UI thread.");
                }
            }
            if (str == null) {
                int i10 = zze.zza;
                zzo.zzf("Ad unit ID should not be null for app open ad.");
                this.f20882b.execute(new x60(this, 22));
                return false;
            }
            if (this.f20890j != null) {
                return false;
            }
            if (((Boolean) zzba.zzc().a(am.n3)).booleanValue()) {
                zzay.zzc();
            }
            if (!((Boolean) an.f12466c.o()).booleanValue() || (k70Var = (k70) this.f20885e.zzd()) == null) {
                jw0Var = null;
            } else {
                jw0 jw0Var2 = (jw0) ((d50) k70Var).f13406f.zzb();
                jw0Var2.i(7);
                jw0Var2.c(zzmVar.zzp);
                jw0Var2.d(zzmVar.zzm);
                jw0Var = jw0Var2;
            }
            Context context = this.f20881a;
            boolean z11 = zzmVar.zzf;
            v71.p(context, z11);
            if (((Boolean) zzba.zzc().a(am.f12393va)).booleanValue() && z11) {
                ((lj0) this.f20883c.C.zzb()).b(true);
            }
            Pair pair = new Pair("api-call", Long.valueOf(zzmVar.zzz));
            try {
                try {
                    ((p9.b) zzt.zzk()).getClass();
                    Bundle bundleC = rb0.c(pair, new Pair("dynamite-enter", Long.valueOf(System.currentTimeMillis())));
                    nu0 nu0Var = this.f20889i;
                    nu0Var.f17959c = str;
                    nu0Var.f17958b = zzr.zzd();
                    nu0Var.f17957a = zzmVar;
                    nu0Var.f17975t = bundleC;
                    ou0 ou0VarA = nu0Var.a();
                    fw0 fw0VarD = fw0.d(context, ps1.X(ou0VarA), 7, zzmVar);
                    rs0 rs0Var = new rs0();
                    rs0Var.f19655a = ou0VarA;
                    ListenableFuture listenableFutureE = this.f20885e.e(new lj1(28, rs0Var, (Object) null), new vf(this, 28));
                    this.f20890j = listenableFutureE;
                    us0Var = this;
                    try {
                        try {
                            try {
                                listenableFutureE.addListener(new zd1(0, listenableFutureE, new o8(us0Var, mp0Var, jw0Var, fw0VarD, rs0Var, 4)), us0Var.f20882b);
                                return true;
                            } catch (Throwable th4) {
                                th = th4;
                                th2 = th;
                                throw th2;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                        }
                    } catch (Throwable th6) {
                        th2 = th6;
                        throw th2;
                    }
                } catch (Throwable th7) {
                    th = th7;
                    us0Var = this;
                }
            } catch (Throwable th8) {
                th = th8;
                us0Var = this;
            }
        } catch (Throwable th9) {
            us0Var = this;
            th2 = th9;
        }
        throw th2;
    }

    public final synchronized c50 b(jt0 jt0Var) {
        rs0 rs0Var = (rs0) jt0Var;
        if (((Boolean) zzba.zzc().a(am.B9)).booleanValue()) {
            v90 v90Var = new v90();
            v90Var.f21135a = this.f20881a;
            v90Var.f21136b = rs0Var.f19655a;
            w90 w90Var = new w90(v90Var);
            ac0 ac0Var = new ac0();
            ts0 ts0Var = this.f20884d;
            Executor executor = this.f20882b;
            ((HashSet) ac0Var.l).add(new nc0(ts0Var, executor));
            ac0Var.c(ts0Var, executor);
            bc0 bc0Var = new bc0(ac0Var);
            c50 c50Var = new c50(this.f20883c.f11854b, 0);
            c50Var.f13047f = w90Var;
            c50Var.f13046e = bc0Var;
            return c50Var;
        }
        ts0 ts0Var2 = this.f20884d;
        ts0 ts0Var3 = new ts0(ts0Var2.f20479a);
        ts0Var3.f20487i = ts0Var2;
        ac0 ac0Var2 = new ac0();
        Executor executor2 = this.f20882b;
        ac0Var2.a(ts0Var3, executor2);
        ((HashSet) ac0Var2.f11983g).add(new nc0(ts0Var3, executor2));
        ((HashSet) ac0Var2.f11989n).add(new nc0(ts0Var3, executor2));
        ((HashSet) ac0Var2.f11988m).add(new nc0(ts0Var3, executor2));
        ((HashSet) ac0Var2.l).add(new nc0(ts0Var3, executor2));
        ac0Var2.c(ts0Var3, executor2);
        ac0Var2.f11990o = ts0Var3;
        v90 v90Var2 = new v90();
        v90Var2.f21135a = this.f20881a;
        v90Var2.f21136b = rs0Var.f19655a;
        w90 w90Var2 = new w90(v90Var2);
        bc0 bc0Var2 = new bc0(ac0Var2);
        c50 c50Var2 = new c50(this.f20883c.f11854b, 0);
        c50Var2.f13047f = w90Var2;
        c50Var2.f13046e = bc0Var2;
        return c50Var2;
    }
}
