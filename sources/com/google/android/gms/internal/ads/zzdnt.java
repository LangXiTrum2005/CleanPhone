package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdnt implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;

    private zzdnt(zzijp zzijpVar, zzijp zzijpVar2) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
    }

    public static zzdnt zza(zzijp zzijpVar, zzijp zzijpVar2) {
        return new zzdnt(zzijpVar, zzijpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdnq(((zzcwb) this.zza).zza(), ((zzdmk) this.zzb).zza());
    }
}
