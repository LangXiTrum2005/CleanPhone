package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhbj implements zzhjy {
    private static final zzhbj zza = new zzhbj();
    private static final zzhjs zzb = zzhjs.zzd(zzhbh.zza, zzhim.class, zzgzq.class);

    public static void zzc() throws GeneralSecurityException {
        zzhjb.zza().zzc(zza);
        zzhjb.zza().zzb(zzb);
    }

    public static void zzd(zzhjt zzhjtVar) throws GeneralSecurityException {
        zzhjtVar.zzb(zza);
    }

    @Override // com.google.android.gms.internal.ads.zzhjy
    public final Class zza() {
        return zzgzq.class;
    }

    @Override // com.google.android.gms.internal.ads.zzhjy
    public final Class zzb() {
        return zzgzq.class;
    }

    @Override // com.google.android.gms.internal.ads.zzhjy
    public final /* bridge */ /* synthetic */ Object zze(zzhih zzhihVar, zzhip zzhipVar, zzhjx zzhjxVar) throws GeneralSecurityException {
        zzhiq zzhiqVar;
        zzhiq zzhiqVarZza;
        zzhxc zzhxcVarZzd;
        zzhjn zzhjnVar = new zzhjn();
        for (int i2 = 0; i2 < zzhihVar.zzd(); i2++) {
            zzhag zzhagVarZze = ((zzhai) zzhihVar).zze(i2);
            if (zzhagVarZze.zzb().equals(zzgzz.zza)) {
                zzgzx zzgzxVarZza = zzhagVarZze.zza();
                if (zzgzxVarZza instanceof zzhbe) {
                    zzhxcVarZzd = ((zzhbe) zzgzxVarZza).zzc();
                } else {
                    if (!(zzgzxVarZza instanceof zzhim)) {
                        String name = zzgzxVarZza.getClass().getName();
                        String strValueOf = String.valueOf(zzgzxVarZza.zza());
                        throw new GeneralSecurityException(androidx.media3.extractor.text.ttml.a.q(new StringBuilder(name.length() + 59 + strValueOf.length()), "Cannot get output prefix for key of class ", name, " with parameters ", strValueOf));
                    }
                    zzhxcVarZzd = ((zzhim) zzgzxVarZza).zzd();
                }
                zzhjnVar.zza(zzhxcVarZzd, new zzhbg((zzgzq) zzhjxVar.zza(zzhagVarZze), zzhagVarZze.zzc()));
            }
        }
        if (zzhipVar.zza()) {
            zzhiqVar = zzhit.zza;
            zzhiqVarZza = zzhiqVar;
        } else {
            zzhir zzhirVarZzb = zzhiz.zza().zzb();
            zzhiq zzhiqVarZza2 = zzhirVarZzb.zza(zzhihVar, zzhipVar, "aead", "encrypt");
            zzhiqVarZza = zzhirVarZzb.zza(zzhihVar, zzhipVar, "aead", "decrypt");
            zzhiqVar = zzhiqVarZza2;
        }
        zzhai zzhaiVar = (zzhai) zzhihVar;
        return new zzhbi(new zzhbg((zzgzq) zzhjxVar.zza(zzhaiVar.zzc()), zzhaiVar.zzc().zzc()), zzhjnVar.zzb(), zzhiqVar, zzhiqVarZza, null);
    }
}
