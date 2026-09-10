package com.google.android.gms.internal.ads;

import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
final class zzdty implements zzgcd {
    final /* synthetic */ zzdua zza;

    public zzdty(zzdua zzduaVar) {
        this.zza = zzduaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final void zza(Throwable th) {
        synchronized (this) {
            this.zza.zzc = true;
            this.zza.zzv("com.google.android.gms.ads.MobileAds", false, "Internal Error.", (int) (com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() - this.zza.zzd));
            this.zza.zze.zzd(new Exception());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final /* bridge */ /* synthetic */ void zzb(@Nullable Object obj) {
        final String str = (String) obj;
        synchronized (this) {
            this.zza.zzc = true;
            this.zza.zzv("com.google.android.gms.ads.MobileAds", true, "", (int) (com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() - this.zza.zzd));
            this.zza.zzi.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdtx
                @Override // java.lang.Runnable
                public final void run() {
                    zzdua.zzj(this.zza.zza, str);
                }
            });
        }
    }
}
