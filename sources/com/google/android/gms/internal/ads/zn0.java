package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zn0 implements yd1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f22673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fu0 f22674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ du0 f22675c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f22676d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lx0 f22677e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ju0 f22678f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bo0 f22679g;

    public zn0(bo0 bo0Var, long j10, fu0 fu0Var, du0 du0Var, String str, lx0 lx0Var, ju0 ju0Var) {
        this.f22673a = j10;
        this.f22674b = fu0Var;
        this.f22675c = du0Var;
        this.f22676d = str;
        this.f22677e = lx0Var;
        this.f22678f = ju0Var;
        Objects.requireNonNull(bo0Var);
        this.f22679g = bo0Var;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0067 A[Catch: all -> 0x0079, TryCatch #0 {all -> 0x0079, blocks: (B:30:0x0063, B:32:0x0067, B:34:0x0072, B:38:0x007d, B:40:0x0084, B:42:0x0096, B:43:0x00a9, B:45:0x00ad, B:47:0x00af, B:55:0x00e5, B:56:0x00ee, B:50:0x00ca, B:52:0x00ce, B:54:0x00d8), top: B:60:0x0063 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0072 A[Catch: all -> 0x0079, TryCatch #0 {all -> 0x0079, blocks: (B:30:0x0063, B:32:0x0067, B:34:0x0072, B:38:0x007d, B:40:0x0084, B:42:0x0096, B:43:0x00a9, B:45:0x00ad, B:47:0x00af, B:55:0x00e5, B:56:0x00ee, B:50:0x00ca, B:52:0x00ce, B:54:0x00d8), top: B:60:0x0063 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0082  */
    /* JADX WARN: Code duplicated, block: B:42:0x0096 A[Catch: all -> 0x0079, TryCatch #0 {all -> 0x0079, blocks: (B:30:0x0063, B:32:0x0067, B:34:0x0072, B:38:0x007d, B:40:0x0084, B:42:0x0096, B:43:0x00a9, B:45:0x00ad, B:47:0x00af, B:55:0x00e5, B:56:0x00ee, B:50:0x00ca, B:52:0x00ce, B:54:0x00d8), top: B:60:0x0063 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00ad A[Catch: all -> 0x0079, DONT_GENERATE, TryCatch #0 {all -> 0x0079, blocks: (B:30:0x0063, B:32:0x0067, B:34:0x0072, B:38:0x007d, B:40:0x0084, B:42:0x0096, B:43:0x00a9, B:45:0x00ad, B:47:0x00af, B:55:0x00e5, B:56:0x00ee, B:50:0x00ca, B:52:0x00ce, B:54:0x00d8), top: B:60:0x0063 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00af A[Catch: all -> 0x0079, TryCatch #0 {all -> 0x0079, blocks: (B:30:0x0063, B:32:0x0067, B:34:0x0072, B:38:0x007d, B:40:0x0084, B:42:0x0096, B:43:0x00a9, B:45:0x00ad, B:47:0x00af, B:55:0x00e5, B:56:0x00ee, B:50:0x00ca, B:52:0x00ce, B:54:0x00d8), top: B:60:0x0063 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0063 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.yd1
    public final void zza(Throwable th2) {
        int i10;
        zze zzeVar;
        Integer numValueOf;
        long j10;
        int i11;
        zze zzeVarC;
        int i12;
        zze zzeVar2;
        bo0 bo0Var = this.f22679g;
        ((p9.b) bo0Var.f12827a).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f22673a;
        if (th2 instanceof TimeoutException) {
            i10 = 2;
        } else if (th2 instanceof tn0) {
            i10 = 3;
        } else if (th2 instanceof CancellationException) {
            i10 = 4;
        } else if (th2 instanceof qu0) {
            i10 = 5;
        } else {
            if (th2 instanceof ck0) {
                i10 = pi1.c(th2).zza == 3 ? 1 : 6;
                if (((Boolean) zzba.zzc().a(am.f12339s2)).booleanValue() && (th2 instanceof rm0) && (zzeVar = ((rm0) th2).f19620b) != null) {
                    numValueOf = Integer.valueOf(zzeVar.zza);
                }
                synchronized (bo0Var) {
                    try {
                        if (bo0Var.f12831e) {
                            i11 = i10;
                            bo0Var.f12828b.j(this.f22674b, this.f22675c, i11, th2 instanceof rm0 ? (rm0) th2 : null, jElapsedRealtime);
                            j10 = jElapsedRealtime;
                        } else {
                            j10 = jElapsedRealtime;
                            i11 = i10;
                        }
                        if (((Boolean) zzba.zzc().a(am.K9)).booleanValue()) {
                            mx0 mx0Var = bo0Var.f12829c;
                            lx0 lx0Var = this.f22677e;
                            ju0 ju0Var = this.f22678f;
                            du0 du0Var = this.f22675c;
                            mx0Var.a(lx0Var.a(ju0Var, du0Var, du0Var.f13699n), du0Var.f13718x0);
                        }
                        if (bo0Var.f12833g) {
                            return;
                        }
                        LinkedHashMap linkedHashMap = bo0Var.f12830d;
                        du0 du0Var2 = this.f22675c;
                        linkedHashMap.put(du0Var2, new ao0(this.f22676d, du0Var2.f13686f0, i11, j10, numValueOf));
                        zzeVarC = pi1.c(th2);
                        i12 = zzeVarC.zza;
                        if ((i12 != 3 || i12 == 0) && (zzeVar2 = zzeVarC.zzd) != null && !zzeVar2.zzc.equals(MobileAds.ERROR_DOMAIN)) {
                        }
                        bo0Var.f12832f.c(du0Var2, j10, zzeVarC, false);
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
            i10 = 6;
        }
        numValueOf = null;
        synchronized (bo0Var) {
            if (bo0Var.f12831e) {
                i11 = i10;
                bo0Var.f12828b.j(this.f22674b, this.f22675c, i11, th2 instanceof rm0 ? (rm0) th2 : null, jElapsedRealtime);
                j10 = jElapsedRealtime;
            } else {
                j10 = jElapsedRealtime;
                i11 = i10;
            }
            if (((Boolean) zzba.zzc().a(am.K9)).booleanValue()) {
                mx0 mx0Var2 = bo0Var.f12829c;
                lx0 lx0Var2 = this.f22677e;
                ju0 ju0Var2 = this.f22678f;
                du0 du0Var3 = this.f22675c;
                mx0Var2.a(lx0Var2.a(ju0Var2, du0Var3, du0Var3.f13699n), du0Var3.f13718x0);
            }
            if (bo0Var.f12833g) {
                return;
            }
            LinkedHashMap linkedHashMap2 = bo0Var.f12830d;
            du0 du0Var4 = this.f22675c;
            linkedHashMap2.put(du0Var4, new ao0(this.f22676d, du0Var4.f13686f0, i11, j10, numValueOf));
            zzeVarC = pi1.c(th2);
            i12 = zzeVarC.zza;
            zzeVarC = i12 != 3 ? pi1.c(new rm0(13, zzeVarC.zzd)) : pi1.c(new rm0(13, zzeVarC.zzd));
            bo0Var.f12832f.c(du0Var4, j10, zzeVarC, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.yd1
    /* JADX INFO: renamed from: zzb */
    public final void mo164zzb(Object obj) {
        long j10;
        bo0 bo0Var = this.f22679g;
        ((p9.b) bo0Var.f12827a).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f22673a;
        synchronized (bo0Var) {
            try {
                if (bo0Var.f12831e) {
                    bo0Var.f12828b.j(this.f22674b, this.f22675c, 0, null, jElapsedRealtime);
                    j10 = jElapsedRealtime;
                } else {
                    j10 = jElapsedRealtime;
                }
                if (bo0Var.f12833g) {
                    return;
                }
                du0 du0Var = this.f22675c;
                synchronized (bo0Var) {
                    ao0 ao0Var = (ao0) bo0Var.f12830d.get(du0Var);
                    if (ao0Var != null && ao0Var.f12472c == 8) {
                        ((ao0) bo0Var.f12830d.get(du0Var)).f12473d = j10;
                    } else {
                        bo0Var.f12830d.put(du0Var, new ao0(this.f22676d, du0Var.f13686f0, 0, j10, null));
                    }
                    bo0Var.f12832f.c(du0Var, j10, null, true);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
