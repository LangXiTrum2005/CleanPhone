package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.ads.internal.client.zzbk;
import com.google.android.gms.ads.internal.client.zzbt;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.client.zzcl;
import com.google.android.gms.ads.internal.client.zzcp;
import com.google.android.gms.ads.internal.client.zzcs;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.client.zzee;
import com.google.android.gms.ads.internal.client.zzfw;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzx;
import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class xs0 extends zzbt implements zzr, ri {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a50 f21990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f21991b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f21993d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final us0 f21994e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ts0 f21995f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final VersionInfoParcel f21996g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final yh0 f21997h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public h70 f21999j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public l70 f22000k;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AtomicBoolean f21992c = new AtomicBoolean();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f21998i = -1;

    public xs0(a50 a50Var, Context context, String str, us0 us0Var, ts0 ts0Var, VersionInfoParcel versionInfoParcel, yh0 yh0Var) {
        this.f21990a = a50Var;
        this.f21991b = context;
        this.f21993d = str;
        this.f21994e = us0Var;
        this.f21995f = ts0Var;
        this.f21996g = versionInfoParcel;
        this.f21997h = yh0Var;
        ts0Var.f20484f.set(this);
    }

    public final synchronized void x1(int i10) {
        try {
            if (this.f21992c.compareAndSet(false, true)) {
                this.f21995f.k();
                h70 h70Var = this.f21999j;
                if (h70Var != null) {
                    zzt.zzg().c(h70Var);
                }
                if (this.f22000k != null) {
                    long jElapsedRealtime = -1;
                    if (this.f21998i != -1) {
                        ((p9.b) zzt.zzk()).getClass();
                        jElapsedRealtime = SystemClock.elapsedRealtime() - this.f21998i;
                    }
                    this.f22000k.e(i10, jElapsedRealtime);
                }
                zzc();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzA() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzB() {
        ListenableFuture listenableFuture;
        listenableFuture = this.f21994e.f20890j;
        return (listenableFuture == null || listenableFuture.isDone()) ? false : true;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized zzea zzF() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzG(zzfw zzfwVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzI(zzx zzxVar) {
        this.f21994e.f20889i.f17965i = zzxVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzJ(zi ziVar) {
        this.f21995f.f20480b.set(ziVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final long zzU() {
        return 0L;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzY(zzcp zzcpVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final s9.a zzb() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzc() {
        k9.c0.d("destroy must be called on the main UI thread.");
        l70 l70Var = this.f22000k;
        if (l70Var != null) {
            l70Var.d();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzd() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdU(int i10) {
        if (i10 == 0) {
            throw null;
        }
        int i11 = i10 - 1;
        if (i11 == 0) {
            x1(2);
            return;
        }
        if (i11 == 1) {
            x1(4);
        } else if (i11 != 2) {
            x1(6);
        } else {
            x1(3);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdv() {
        l70 l70Var = this.f22000k;
        if (l70Var != null) {
            ((p9.b) zzt.zzk()).getClass();
            l70Var.e(1, SystemClock.elapsedRealtime() - this.f21998i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002b  */
    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zze(zzm zzmVar) {
        boolean z10;
        try {
            if (!zzmVar.zzb()) {
                if (((Boolean) dn.f13592d.o()).booleanValue()) {
                    if (((Boolean) zzba.zzc().a(am.Oc)).booleanValue()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else {
                    z10 = false;
                }
                if (this.f21996g.clientJarVersion < ((Integer) zzba.zzc().a(am.Pc)).intValue() || !z10) {
                    k9.c0.d("loadAd must be called on the main UI thread.");
                }
            }
            zzt.zzc();
            if (zzs.zzK(this.f21991b) && zzmVar.zzs == null) {
                int i10 = zze.zza;
                zzo.zzf("Failed to load the ad because app ID is missing.");
                this.f21995f.j0(pi1.C(4, null, null));
                return false;
            }
            if (zzB()) {
                return false;
            }
            this.f21992c = new AtomicBoolean();
            return this.f21994e.a(zzmVar, this.f21993d, new vs0(22), new uo0(this, 2));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzf() {
        k9.c0.d("pause must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzg() {
        k9.c0.d("resume must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzh() {
        if (this.f22000k != null) {
            ((p9.b) zzt.zzk()).getClass();
            this.f21998i = SystemClock.elapsedRealtime();
            int i10 = this.f22000k.f16764m;
            if (i10 > 0) {
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f21990a.f11858d.zzb();
                p9.a aVarZzk = zzt.zzk();
                h70 h70Var = new h70(scheduledExecutorService, aVarZzk);
                this.f21999j = h70Var;
                ws0 ws0Var = new ws0(this, 0);
                synchronized (h70Var) {
                    h70Var.f15199f = ws0Var;
                    ((p9.b) aVarZzk).getClass();
                    long j10 = i10;
                    h70Var.f15197d = SystemClock.elapsedRealtime() + j10;
                    h70Var.f15196c = scheduledExecutorService.schedule(ws0Var, j10, TimeUnit.MILLISECONDS);
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final Bundle zzk() {
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzl() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzm() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized com.google.android.gms.ads.internal.client.zzr zzn() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzo(com.google.android.gms.ads.internal.client.zzr zzrVar) {
        k9.c0.d("setAdSize must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzr() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzs() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized zzdx zzt() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzu() {
        return this.f21993d;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzcl zzv() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzbh zzw() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzx(jm jmVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzz(boolean z10) {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdT() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdq() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdw() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdx() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdy() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdz() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzC(xx xxVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzD(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzE(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzH(zzee zzeeVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzK(boolean z10) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzP(zzdq zzdqVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzR(s9.a aVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzS(zzcs zzcsVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzT(long j10) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzdS(zzbh zzbhVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzi(zzcl zzclVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzj(zzby zzbyVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzp(nw nwVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzy(zzbe zzbeVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzQ(zzm zzmVar, zzbk zzbkVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzq(pw pwVar, String str) {
    }
}
