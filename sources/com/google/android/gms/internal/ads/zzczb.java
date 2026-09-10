package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class zzczb implements zzdak, zzdhw, zzdfm, zzdba, zzbck {
    private final zzdbc zza;
    private final zzddd zzb;
    private final zzfhr zzc;
    private final ScheduledExecutorService zzd;
    private final Executor zze;
    private ScheduledFuture zzg;
    private final String zzi;
    private final zzgzf zzf = zzgzf.zze();
    private final AtomicBoolean zzh = new AtomicBoolean();

    public zzczb(zzdbc zzdbcVar, zzfhr zzfhrVar, ScheduledExecutorService scheduledExecutorService, Executor executor, String str, zzddd zzdddVar) {
        this.zza = zzdbcVar;
        this.zzc = zzfhrVar;
        this.zzd = scheduledExecutorService;
        this.zze = executor;
        this.zzi = str;
        this.zzb = zzdddVar;
    }

    private final boolean zzl() {
        return this.zzi.equals("com.google.ads.mediation.admob.AdMobAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzdak
    public final void zzd(zzbzm zzbzmVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzdfm
    public final synchronized void zzdG() {
        if (this.zzc.zze == 4) {
            this.zza.zza();
            return;
        }
        zzgzf zzgzfVar = this.zzf;
        if (zzgzfVar.isDone()) {
            return;
        }
        ScheduledFuture scheduledFuture = this.zzg;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        zzgzfVar.zza(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.ads.zzdfm
    public final void zzdH() {
    }

    @Override // com.google.android.gms.internal.ads.zzdak
    public final void zzdJ() {
    }

    @Override // com.google.android.gms.internal.ads.zzbck
    public final void zzdj(zzbcj zzbcjVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzmP)).booleanValue() && zzl() && zzbcjVar.zzj && this.zzh.compareAndSet(false, true) && this.zzc.zze != 3) {
            com.google.android.gms.ads.internal.util.zze.zza("Full screen 1px impression occurred");
            this.zza.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdak
    public final void zzds() {
    }

    @Override // com.google.android.gms.internal.ads.zzdak
    public final void zzdt() {
        zzfhr zzfhrVar = this.zzc;
        if (zzfhrVar.zze == 3) {
            return;
        }
        int i2 = zzfhrVar.zzY;
        if (i2 == 0 || i2 == 1) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzmP)).booleanValue() && zzl()) {
                return;
            }
            this.zza.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdak
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzdak
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzdhw
    public final void zzg() {
        zzfhr zzfhrVar = this.zzc;
        int i2 = zzfhrVar.zze;
        if (i2 == 3) {
            return;
        }
        if (i2 == 4) {
            this.zzb.zza();
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzca)).booleanValue() && zzfhrVar.zzY == 2) {
            int i3 = zzfhrVar.zzq;
            if (i3 == 0) {
                this.zza.zza();
            } else {
                zzgym.zzr(this.zzf, new zzcyz(this), this.zze);
                this.zzg = this.zzd.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcza
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzi();
                    }
                }, i3, TimeUnit.MILLISECONDS);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdhw
    public final void zzh() {
    }

    public final /* synthetic */ void zzi() {
        synchronized (this) {
            try {
                zzgzf zzgzfVar = this.zzf;
                if (zzgzfVar.isDone()) {
                    return;
                }
                zzgzfVar.zza(Boolean.TRUE);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdba
    public final synchronized void zzj(com.google.android.gms.ads.internal.client.zze zzeVar) {
        try {
            zzgzf zzgzfVar = this.zzf;
            if (zzgzfVar.isDone()) {
                return;
            }
            ScheduledFuture scheduledFuture = this.zzg;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            zzgzfVar.zzb(new Exception());
        } catch (Throwable th) {
            throw th;
        }
    }

    public final /* synthetic */ zzdbc zzk() {
        return this.zza;
    }
}
