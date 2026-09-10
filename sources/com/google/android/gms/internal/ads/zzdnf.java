package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzdnf implements zzgcd {
    final /* synthetic */ zzfbo zza;
    final /* synthetic */ zzfbr zzb;
    final /* synthetic */ zzcmk zzc;
    final /* synthetic */ zzdnl zzd;

    public zzdnf(zzdnl zzdnlVar, zzfbo zzfboVar, zzfbr zzfbrVar, zzcmk zzcmkVar) {
        this.zza = zzfboVar;
        this.zzb = zzfbrVar;
        this.zzc = zzcmkVar;
        this.zzd = zzdnlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcex zzcexVar = (zzcex) obj;
        zzcexVar.zzW(this.zza, this.zzb);
        zzcgp zzcgpVarZzN = zzcexVar.zzN();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjX)).booleanValue() && zzcgpVarZzN != null) {
            zzcmk zzcmkVar = this.zzc;
            zzdnl zzdnlVar = this.zzd;
            zzcgpVarZzN.zzK(zzcmkVar, zzdnlVar.zzi, zzdnlVar.zzj);
            zzcmk zzcmkVar2 = this.zzc;
            zzdnl zzdnlVar2 = this.zzd;
            zzcgpVarZzN.zzM(zzcmkVar2, zzdnlVar2.zzi, zzdnlVar2.zzd);
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzmQ)).booleanValue() || zzcgpVarZzN == null) {
            return;
        }
        zzcgpVarZzN.zzN(this.zza);
    }
}
