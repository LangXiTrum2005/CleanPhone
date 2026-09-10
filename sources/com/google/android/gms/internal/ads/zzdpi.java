package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdpi implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;

    private zzdpi(zzijp zzijpVar, zzijp zzijpVar2) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
    }

    public static zzdpi zza(zzijp zzijpVar, zzijp zzijpVar2) {
        return new zzdpi(zzijpVar, zzijpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdph((zzdua) this.zza.zzb(), ((zzdmn) this.zzb).zza());
    }
}
