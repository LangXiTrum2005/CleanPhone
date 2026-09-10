package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes4.dex */
public final class zzadf {
    private final Handler zza;
    private final zzadg zzb;

    public zzadf(Handler handler, zzadg zzadgVar) {
        if (zzadgVar != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.zza = handler;
        this.zzb = zzadgVar;
    }

    public final void zza(final zzik zzikVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzade
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzk(zzikVar);
                }
            });
        }
    }

    public final void zzb(final String str, final long j, final long j2) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzacv
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzl(str, j, j2);
                }
            });
        }
    }

    public final void zzc(final zzv zzvVar, final zzil zzilVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzacw
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzm(zzvVar, zzilVar);
                }
            });
        }
    }

    public final void zzd(final int i2, final long j) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzacx
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzn(i2, j);
                }
            });
        }
    }

    public final void zze(final long j, final int i2) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzacy
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzo(j, i2);
                }
            });
        }
    }

    public final void zzf(final zzbv zzbvVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzacz
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzp(zzbvVar);
                }
            });
        }
    }

    public final void zzg(final Object obj) {
        Handler handler = this.zza;
        if (handler != null) {
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzada
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzq(obj, jElapsedRealtime);
                }
            });
        }
    }

    public final void zzh(final String str) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzadb
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzr(str);
                }
            });
        }
    }

    public final void zzi(final zzik zzikVar) {
        zzikVar.zza();
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzadc
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzs(zzikVar);
                }
            });
        }
    }

    public final void zzj(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzadd
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzt(exc);
                }
            });
        }
    }

    public final /* synthetic */ void zzk(zzik zzikVar) {
        String str = zzfj.zza;
        this.zzb.zzb(zzikVar);
    }

    public final /* synthetic */ void zzl(String str, long j, long j2) {
        String str2 = zzfj.zza;
        this.zzb.zzc(str, j, j2);
    }

    public final /* synthetic */ void zzm(zzv zzvVar, zzil zzilVar) {
        String str = zzfj.zza;
        this.zzb.zzd(zzvVar, zzilVar);
    }

    public final /* synthetic */ void zzn(int i2, long j) {
        String str = zzfj.zza;
        this.zzb.zze(i2, j);
    }

    public final /* synthetic */ void zzo(long j, int i2) {
        String str = zzfj.zza;
        this.zzb.zzj(j, i2);
    }

    public final /* synthetic */ void zzp(zzbv zzbvVar) {
        String str = zzfj.zza;
        this.zzb.zzf(zzbvVar);
    }

    public final /* synthetic */ void zzq(Object obj, long j) {
        String str = zzfj.zza;
        this.zzb.zzg(obj, j);
    }

    public final /* synthetic */ void zzr(String str) {
        String str2 = zzfj.zza;
        this.zzb.zzh(str);
    }

    public final /* synthetic */ void zzs(zzik zzikVar) {
        zzikVar.zza();
        String str = zzfj.zza;
        this.zzb.zzi(zzikVar);
    }

    public final /* synthetic */ void zzt(Exception exc) {
        String str = zzfj.zza;
        this.zzb.zzk(exc);
    }
}
