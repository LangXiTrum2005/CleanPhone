package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzfnk implements zzgyj {
    final /* synthetic */ zzfno zza;
    final /* synthetic */ zzfne zzb;
    final /* synthetic */ boolean zzc;

    public zzfnk(zzfno zzfnoVar, zzfne zzfneVar, boolean z2) {
        this.zza = zzfnoVar;
        this.zzb = zzfneVar;
        this.zzc = z2;
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final void zza(Throwable th) {
        zzfne zzfneVar = this.zzb;
        if (zzfneVar.zzb()) {
            zzfno zzfnoVar = this.zza;
            zzfneVar.zzj(th);
            zzfneVar.zzd(false);
            zzfnoVar.zza(zzfneVar);
            if (this.zzc) {
                zzfnoVar.zzh();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final void zzb(Object obj) {
        zzfne zzfneVar = this.zzb;
        zzfneVar.zzd(true);
        zzfno zzfnoVar = this.zza;
        zzfnoVar.zza(zzfneVar);
        if (this.zzc) {
            zzfnoVar.zzh();
        }
    }
}
