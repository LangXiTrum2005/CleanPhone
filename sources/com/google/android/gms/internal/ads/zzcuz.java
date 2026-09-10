package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcuz implements zzdby, zzbck, zzdfm {
    private final zzfhr zza;
    private final zzdbc zzb;
    private final zzdch zzc;
    private final zzddd zzf;
    private final AtomicBoolean zzd = new AtomicBoolean();
    private final AtomicBoolean zze = new AtomicBoolean();
    private final AtomicBoolean zzg = new AtomicBoolean();

    public zzcuz(zzfhr zzfhrVar, zzdbc zzdbcVar, zzdch zzdchVar, zzddd zzdddVar) {
        this.zza = zzfhrVar;
        this.zzb = zzdbcVar;
        this.zzc = zzdchVar;
        this.zzf = zzdddVar;
    }

    private final void zzd() {
        if (this.zzd.compareAndSet(false, true)) {
            this.zzb.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdfm
    public final void zzdG() {
        if (this.zza.zze == 4) {
            zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdfm
    public final void zzdH() {
    }

    @Override // com.google.android.gms.internal.ads.zzbck
    public final void zzdj(zzbcj zzbcjVar) {
        int i2 = this.zza.zze;
        if (i2 == 1) {
            if (zzbcjVar.zzj) {
                zzd();
            }
        } else if (i2 == 4 && zzbcjVar.zzj && this.zzg.compareAndSet(false, true)) {
            this.zzf.zza();
        }
        if (zzbcjVar.zzj && this.zze.compareAndSet(false, true)) {
            this.zzc.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdby
    public final synchronized void zzg() {
        int i2 = this.zza.zze;
        if (i2 == 1 || i2 == 4) {
            return;
        }
        zzd();
    }
}
