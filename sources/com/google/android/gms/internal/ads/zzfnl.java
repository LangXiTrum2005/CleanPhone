package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzfnl implements zzgyj {
    final /* synthetic */ zzfno zza;
    final /* synthetic */ zzfne zzb;

    public zzfnl(zzfno zzfnoVar, zzfne zzfneVar) {
        this.zza = zzfnoVar;
        this.zzb = zzfneVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final void zza(Throwable th) {
        zzfne zzfneVar = this.zzb;
        zzfneVar.zzj(th);
        zzfneVar.zzd(false);
        this.zza.zza(zzfneVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final void zzb(Object obj) {
    }
}
