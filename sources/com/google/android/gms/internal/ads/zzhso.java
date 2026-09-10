package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhso implements zzhjy {
    private static final zzhso zza = new zzhso();
    private static final zzhjs zzb = zzhjs.zzd(zzhsl.zza, zzhim.class, zzhap.class);

    public static void zzc() throws GeneralSecurityException {
        zzhjb.zza().zzc(zza);
        zzhjb.zza().zzb(zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzhjy
    public final Class zza() {
        return zzhap.class;
    }

    @Override // com.google.android.gms.internal.ads.zzhjy
    public final Class zzb() {
        return zzhap.class;
    }

    @Override // com.google.android.gms.internal.ads.zzhjy
    public final /* bridge */ /* synthetic */ Object zze(zzhih zzhihVar, zzhip zzhipVar, zzhjx zzhjxVar) throws GeneralSecurityException {
        zzhiq zzhiqVarZza = !zzhipVar.zza() ? zzhiz.zza().zzb().zza(zzhihVar, zzhipVar, "public_key_sign", "sign") : zzhit.zza;
        zzhai zzhaiVar = (zzhai) zzhihVar;
        return new zzhsn(new zzhsm((zzhap) zzhjxVar.zza(zzhaiVar.zzc()), zzhaiVar.zzc().zzc()), zzhiqVarZza);
    }
}
