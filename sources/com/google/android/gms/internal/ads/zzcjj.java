package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzcjj implements com.google.android.gms.ads.nonagon.signalgeneration.zzab {
    private final zzcih zza;
    private zzcvc zzb;
    private com.google.android.gms.ads.nonagon.signalgeneration.zzaz zzc;

    public /* synthetic */ zzcjj(zzcih zzcihVar, zzcjm zzcjmVar) {
        this.zza = zzcihVar;
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzab
    public final /* bridge */ /* synthetic */ com.google.android.gms.ads.nonagon.signalgeneration.zzab zza(zzcvc zzcvcVar) {
        this.zzb = zzcvcVar;
        return this;
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzab
    public final /* bridge */ /* synthetic */ com.google.android.gms.ads.nonagon.signalgeneration.zzab zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzaz zzazVar) {
        this.zzc = zzazVar;
        return this;
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzab
    public final com.google.android.gms.ads.nonagon.signalgeneration.zzac zzc() {
        zzhez.zzc(this.zzb, zzcvc.class);
        zzhez.zzc(this.zzc, com.google.android.gms.ads.nonagon.signalgeneration.zzaz.class);
        return new zzcjk(this.zza, this.zzc, new zzcsf(), new zzcue(), new zzdsl(), this.zzb, null, null, null);
    }
}
