package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdtn implements zzijg {
    private final zzijp zza;

    private zzdtn(zzijp zzijpVar) {
        this.zza = zzijpVar;
    }

    public static zzdtn zza(zzijp zzijpVar) {
        return new zzdtn(zzijpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return ((zzdab) this.zza).zza().zzp.zza == 3 ? "rewarded_interstitial" : "rewarded";
    }
}
