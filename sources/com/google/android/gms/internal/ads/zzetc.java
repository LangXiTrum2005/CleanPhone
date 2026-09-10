package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzetc implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;

    private zzetc(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3) {
        this.zza = zzijpVar2;
        this.zzb = zzijpVar3;
    }

    public static zzetc zza(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3) {
        return new zzetc(zzijpVar, zzijpVar2, zzijpVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzeta(zzflk.zzc(), ((zzdab) this.zza).zza(), ((zzcmj) this.zzb).zzb());
    }
}
