package com.google.android.gms.internal.ads;

import android.os.Handler;

/* JADX INFO: loaded from: classes4.dex */
public final class zzqx {
    private final Handler zza;
    private final zzqy zzb;

    public zzqx(Handler handler, zzqy zzqyVar) {
        this.zza = zzqyVar == null ? null : handler;
        this.zzb = zzqyVar;
    }

    public final void zza(final zzik zzikVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqw
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzn(zzikVar);
                }
            });
        }
    }

    public final void zzb(final String str, final long j, final long j2) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqk
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzo(str, j, j2);
                }
            });
        }
    }

    public final void zzc(final zzv zzvVar, final zzil zzilVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqn
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzp(zzvVar, zzilVar);
                }
            });
        }
    }

    public final void zzd(final long j) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqo
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzq(j);
                }
            });
        }
    }

    public final void zze(final int i2, final long j, final long j2) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqp
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzr(i2, j, j2);
                }
            });
        }
    }

    public final void zzf(final String str) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqq
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzs(str);
                }
            });
        }
    }

    public final void zzg(final zzik zzikVar) {
        zzikVar.zza();
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqr
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzt(zzikVar);
                }
            });
        }
    }

    public final void zzh(final boolean z2) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqs
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzu(z2);
                }
            });
        }
    }

    public final void zzi(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqt
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzv(exc);
                }
            });
        }
    }

    public final void zzj(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqu
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzw(exc);
                }
            });
        }
    }

    public final void zzk(final zzqz zzqzVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqv
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzx(zzqzVar);
                }
            });
        }
    }

    public final void zzl(final zzqz zzqzVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzql
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzy(zzqzVar);
                }
            });
        }
    }

    public final void zzm(final int i2) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqm
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzz(i2);
                }
            });
        }
    }

    public final /* synthetic */ void zzn(zzik zzikVar) {
        String str = zzfj.zza;
        this.zzb.zzl(zzikVar);
    }

    public final /* synthetic */ void zzo(String str, long j, long j2) {
        String str2 = zzfj.zza;
        this.zzb.zzm(str, j, j2);
    }

    public final /* synthetic */ void zzp(zzv zzvVar, zzil zzilVar) {
        String str = zzfj.zza;
        this.zzb.zzn(zzvVar, zzilVar);
    }

    public final /* synthetic */ void zzq(long j) {
        String str = zzfj.zza;
        this.zzb.zzo(j);
    }

    public final /* synthetic */ void zzr(int i2, long j, long j2) {
        String str = zzfj.zza;
        this.zzb.zzp(i2, j, j2);
    }

    public final /* synthetic */ void zzs(String str) {
        String str2 = zzfj.zza;
        this.zzb.zzq(str);
    }

    public final /* synthetic */ void zzt(zzik zzikVar) {
        zzikVar.zza();
        String str = zzfj.zza;
        this.zzb.zzr(zzikVar);
    }

    public final /* synthetic */ void zzu(boolean z2) {
        String str = zzfj.zza;
        this.zzb.zzs(z2);
    }

    public final /* synthetic */ void zzv(Exception exc) {
        String str = zzfj.zza;
        this.zzb.zzt(exc);
    }

    public final /* synthetic */ void zzw(Exception exc) {
        String str = zzfj.zza;
        this.zzb.zzu(exc);
    }

    public final /* synthetic */ void zzx(zzqz zzqzVar) {
        String str = zzfj.zza;
        this.zzb.zzv(zzqzVar);
    }

    public final /* synthetic */ void zzy(zzqz zzqzVar) {
        String str = zzfj.zza;
        this.zzb.zzw(zzqzVar);
    }

    public final /* synthetic */ void zzz(int i2) {
        String str = zzfj.zza;
        this.zzb.zzx(i2);
    }
}
