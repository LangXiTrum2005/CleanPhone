package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzgnq extends zzgos {
    private String zza;
    private String zzb;

    @Override // com.google.android.gms.internal.ads.zzgos
    public final zzgos zza(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgos
    public final zzgos zzb(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgos
    public final zzgot zzc() {
        return new zzgnr(this.zza, this.zzb, null);
    }
}
