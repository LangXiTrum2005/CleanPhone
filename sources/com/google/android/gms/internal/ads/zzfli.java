package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfli implements zzijg {
    public static zzfli zza() {
        return zzflh.zza;
    }

    public static zzgyw zzc() {
        zzgyw zzgywVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzgE)).booleanValue()) {
            zzgywVar = zzcdo.zzc;
        } else {
            zzgywVar = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzgD)).booleanValue() ? zzcdo.zza : zzcdo.zzf;
        }
        zzijo.zzb(zzgywVar);
        return zzgywVar;
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* synthetic */ Object zzb() {
        return zzc();
    }
}
