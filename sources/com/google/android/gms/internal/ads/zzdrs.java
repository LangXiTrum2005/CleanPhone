package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdrs implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;

    private zzdrs(zzijp zzijpVar, zzijp zzijpVar2) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
    }

    public static zzdrs zza(zzijp zzijpVar, zzijp zzijpVar2) {
        return new zzdrs(zzijpVar, zzijpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdrr((zzdnh) this.zza.zzb(), ((zzdoe) this.zzb).zza());
    }
}
