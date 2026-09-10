package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzfeo implements zzgcd {
    final /* synthetic */ zzfer zza;
    final /* synthetic */ zzfes zzb;

    public zzfeo(zzfes zzfesVar, zzfer zzferVar) {
        this.zza = zzferVar;
        this.zzb = zzfesVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final void zza(Throwable th) {
        synchronized (this.zzb) {
            this.zzb.zze = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        synchronized (this.zzb) {
            try {
                this.zzb.zze = null;
                this.zzb.zzd.addFirst(this.zza);
                zzfes zzfesVar = this.zzb;
                if (zzfesVar.zzf == 1) {
                    zzfesVar.zzh();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
