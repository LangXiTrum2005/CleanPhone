package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdtm implements zzijg {
    private final zzijp zza;

    private zzdtm(zzijp zzijpVar) {
        this.zza = zzijpVar;
    }

    public static zzdtm zza(zzijp zzijpVar) {
        return new zzdtm(zzijpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbfp.zza.EnumC0185zza enumC0185zza = ((zzdab) this.zza).zza().zzp.zza == 3 ? zzbfp.zza.EnumC0185zza.REWARDED_INTERSTITIAL : zzbfp.zza.EnumC0185zza.REWARD_BASED_VIDEO_AD;
        zzijo.zzb(enumC0185zza);
        return enumC0185zza;
    }
}
