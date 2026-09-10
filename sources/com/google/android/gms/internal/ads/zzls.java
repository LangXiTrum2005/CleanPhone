package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes3.dex */
public final class zzls implements zzkk {
    private boolean zza;
    private long zzb;
    private long zzc;
    private zzbe zzd = zzbe.zza;

    public zzls(zzcx zzcxVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final long zza() {
        long j = this.zzb;
        if (!this.zza) {
            return j;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.zzc;
        zzbe zzbeVar = this.zzd;
        return j + (zzbeVar.zzb == 1.0f ? zzei.zzs(jElapsedRealtime) : zzbeVar.zza(jElapsedRealtime));
    }

    public final void zzb(long j) {
        this.zzb = j;
        if (this.zza) {
            this.zzc = SystemClock.elapsedRealtime();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final zzbe zzc() {
        return this.zzd;
    }

    public final void zzd() {
        if (this.zza) {
            return;
        }
        this.zzc = SystemClock.elapsedRealtime();
        this.zza = true;
    }

    public final void zze() {
        if (this.zza) {
            zzb(zza());
            this.zza = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final void zzg(zzbe zzbeVar) {
        if (this.zza) {
            zzb(zza());
        }
        this.zzd = zzbeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final /* synthetic */ boolean zzj() {
        return false;
    }
}
