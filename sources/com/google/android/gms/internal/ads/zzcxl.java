package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcxl implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;

    private zzcxl(zzijp zzijpVar, zzijp zzijpVar2) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
    }

    public static zzcxl zza(zzijp zzijpVar, zzijp zzijpVar2) {
        return new zzcxl(zzijpVar, zzijpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzcxk((zzcxo) this.zza.zzb(), ((zzdab) this.zzb).zza());
    }
}
