package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdtc implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;

    private zzdtc(zzijp zzijpVar, zzijp zzijpVar2) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
    }

    public static zzdtc zza(zzijp zzijpVar, zzijp zzijpVar2) {
        return new zzdtc(zzijpVar, zzijpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdtb((zzdbr) this.zza.zzb(), ((zzcwb) this.zzb).zza());
    }
}
