package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzs;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzj;
import com.google.android.gms.ads.internal.zzt;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f14129a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzj f14130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h00 f14131c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f14132d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f14133e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public VersionInfoParcel f14134f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f14135g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public com.google.android.gms.internal.consent_sdk.d f14136h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public yh0 f14137i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Boolean f14138j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicInteger f14139k;
    public final AtomicInteger l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e00 f14140m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f14141n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ListenableFuture f14142o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AtomicBoolean f14143p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AtomicBoolean f14144q;

    public f00() {
        zzj zzjVar = new zzj();
        this.f14130b = zzjVar;
        this.f14131c = new h00(zzay.zzf(), zzjVar);
        this.f14132d = false;
        this.f14136h = null;
        this.f14137i = null;
        this.f14138j = null;
        this.f14139k = new AtomicInteger(0);
        this.l = new AtomicInteger(0);
        this.f14140m = new e00();
        this.f14141n = new Object();
        this.f14143p = new AtomicBoolean();
        this.f14144q = new AtomicBoolean(false);
    }

    public final com.google.android.gms.internal.consent_sdk.d a() {
        com.google.android.gms.internal.consent_sdk.d dVar;
        synchronized (this.f14129a) {
            dVar = this.f14136h;
        }
        return dVar;
    }

    public final void b(Context context, VersionInfoParcel versionInfoParcel, yh0 yh0Var) {
        com.google.android.gms.internal.consent_sdk.d dVar;
        synchronized (this.f14129a) {
            try {
                if (!this.f14132d) {
                    this.f14133e = context.getApplicationContext();
                    this.f14134f = versionInfoParcel;
                    zzt.zzg().b(this.f14131c);
                    this.f14130b.zza(this.f14133e);
                    zw.d(this.f14133e, this.f14134f);
                    this.f14137i = yh0Var;
                    zzt.zzm();
                    if (((Boolean) zzba.zzc().a(am.N2)).booleanValue()) {
                        dVar = new com.google.android.gms.internal.consent_sdk.d();
                    } else {
                        zze.zza("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                        dVar = null;
                    }
                    this.f14136h = dVar;
                    if (dVar != null) {
                        v71.j(new d00(this).zzb(), "AppState.registerCsiReporter", l00.f16615h);
                    }
                    Context context2 = this.f14133e;
                    if (((Boolean) zzba.zzc().a(am.N9)).booleanValue()) {
                        try {
                            ((ConnectivityManager) context2.getSystemService("connectivity")).registerDefaultNetworkCallback(new uf(this));
                        } catch (RuntimeException e10) {
                            int i10 = zze.zza;
                            zzo.zzj("Failed to register network callback", e10);
                            this.f14143p.set(true);
                        }
                    }
                    this.f14132d = true;
                    h();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (((Boolean) zzba.zzc().a(am.Ef)).booleanValue()) {
            return;
        }
        zzt.zzc().zze(context, versionInfoParcel.afmaVersion);
    }

    public final Resources c() {
        if (this.f14134f.isClientJar) {
            return this.f14133e.getResources();
        }
        try {
            if (((Boolean) zzba.zzc().a(am.f12458zc)).booleanValue()) {
                return zzs.zzb(this.f14133e).getResources();
            }
            zzs.zzb(this.f14133e).getResources();
            return null;
        } catch (zzr e10) {
            int i10 = zze.zza;
            zzo.zzj("Cannot load resource from dynamite apk or local jar", e10);
            return null;
        }
    }

    public final void d(String str, Throwable th2) {
        zw.d(this.f14133e, this.f14134f).a(str, th2);
    }

    public final void e(String str, Throwable th2) {
        zw.d(this.f14133e, this.f14134f).b(th2, str, ((Double) pn.f18742f.o()).floatValue());
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0039 A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:4:0x0007, B:6:0x000b, B:8:0x001d, B:10:0x002f, B:13:0x0039, B:14:0x0042), top: B:19:0x0007 }] */
    public final void f(String str, Throwable th2) {
        Context context = this.f14133e;
        VersionInfoParcel versionInfoParcel = this.f14134f;
        synchronized (zw.l) {
            try {
                if (zw.f22725n == null) {
                    if (((Boolean) zzba.zzc().a(am.J8)).booleanValue()) {
                        if (((Boolean) zzba.zzc().a(am.I8)).booleanValue()) {
                            zw.f22725n = new jq(10);
                        } else {
                            zw.f22725n = new zw(context, versionInfoParcel);
                        }
                    } else {
                        zw.f22725n = new jq(10);
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        zw.f22725n.a(str, th2);
    }

    public final zzj g() {
        zzj zzjVar;
        synchronized (this.f14129a) {
            zzjVar = this.f14130b;
        }
        return zzjVar;
    }

    public final ListenableFuture h() {
        if (this.f14133e != null) {
            if (!((Boolean) zzba.zzc().a(am.V3)).booleanValue()) {
                synchronized (this.f14141n) {
                    try {
                        ListenableFuture listenableFuture = this.f14142o;
                        if (listenableFuture != null) {
                            return listenableFuture;
                        }
                        ListenableFuture listenableFutureB = l00.f16608a.b(new sf(this, 1));
                        this.f14142o = listenableFutureB;
                        return listenableFutureB;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
        return zw1.d(new ArrayList());
    }

    public final boolean i(Context context) {
        if (((Boolean) zzba.zzc().a(am.N9)).booleanValue()) {
            return this.f14143p.get();
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
