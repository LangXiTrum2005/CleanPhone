package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzayf implements zzfvd {
    final /* synthetic */ zzfuf zza;

    public zzayf(zzfuf zzfufVar) {
        this.zza = zzfufVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfvd
    public final void zza(int i2, long j) {
        this.zza.zzb(i2, System.currentTimeMillis() - j);
    }

    @Override // com.google.android.gms.internal.ads.zzfvd
    public final void zzb(int i2, long j, String str) {
        this.zza.zzf(i2, System.currentTimeMillis() - j, str);
    }
}
