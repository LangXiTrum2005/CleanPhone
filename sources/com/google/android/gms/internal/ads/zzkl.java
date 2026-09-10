package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzkl implements zzlo {
    private final Object zza;
    private zzbf zzb;

    public zzkl(Object obj, zzwb zzwbVar) {
        this.zza = obj;
        this.zzb = zzwbVar.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzlo
    public final Object zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzlo
    public final zzbf zzb() {
        return this.zzb;
    }

    public final void zzc(zzbf zzbfVar) {
        this.zzb = zzbfVar;
    }
}
