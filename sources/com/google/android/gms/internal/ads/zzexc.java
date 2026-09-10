package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzexc implements zzezv {
    private final boolean zza;

    public zzexc(boolean z2) {
        this.zza = z2;
    }

    @Override // com.google.android.gms.internal.ads.zzezv
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        ((zzczm) obj).zza.putBoolean("is_gbid", this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzezv
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ((zzczm) obj).zzb.putBoolean("is_gbid", this.zza);
    }
}
