package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzgnk extends zzgns {
    private String zza;
    private String zzb;

    @Override // com.google.android.gms.internal.ads.zzgns
    public final zzgns zza(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgns
    public final zzgns zzb(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgns
    public final zzgnt zzc() {
        return new zzgnl(this.zza, this.zzb, null);
    }
}
