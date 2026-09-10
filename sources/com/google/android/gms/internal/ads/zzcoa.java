package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzcoa implements com.google.android.gms.ads.nonagon.signalgeneration.zzab {
    private final zzcmv zza;
    private zzczt zzb;
    private com.google.android.gms.ads.nonagon.signalgeneration.zzay zzc;

    public /* synthetic */ zzcoa(zzcmv zzcmvVar, byte[] bArr) {
        this.zza = zzcmvVar;
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzab
    public final com.google.android.gms.ads.nonagon.signalgeneration.zzac zza() {
        zzijo.zzc(this.zzb, zzczt.class);
        zzijo.zzc(this.zzc, com.google.android.gms.ads.nonagon.signalgeneration.zzay.class);
        return new zzcob(this.zza, this.zzc, new zzcwq(), new zzcyr(), new zzdxt(), this.zzb, null, null);
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzab
    public final /* bridge */ /* synthetic */ com.google.android.gms.ads.nonagon.signalgeneration.zzab zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzay zzayVar) {
        this.zzc = zzayVar;
        return this;
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzab
    public final /* bridge */ /* synthetic */ com.google.android.gms.ads.nonagon.signalgeneration.zzab zzc(zzczt zzcztVar) {
        this.zzb = zzcztVar;
        return this;
    }
}
