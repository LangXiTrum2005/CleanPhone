package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzcnj implements zzdyp {
    private final Long zza;
    private final String zzb;
    private final zzcmv zzc;
    private final zzcnl zzd;

    public zzcnj(zzcmv zzcmvVar, zzcnl zzcnlVar, Long l2, String str) {
        this.zzc = zzcmvVar;
        this.zzd = zzcnlVar;
        this.zza = l2;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdyp
    public final zzdyy zza() {
        long jLongValue = this.zza.longValue();
        zzcnl zzcnlVar = this.zzd;
        return zzdyz.zza(jLongValue, zzcnlVar.zzd(), zzcnlVar.zza(), this.zzc, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzdyp
    public final zzdzc zzb() {
        long jLongValue = this.zza.longValue();
        zzcnl zzcnlVar = this.zzd;
        return zzdzd.zza(jLongValue, zzcnlVar.zzd(), zzcnlVar.zza(), this.zzc, this.zzb);
    }
}
