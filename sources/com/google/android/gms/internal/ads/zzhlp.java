package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhlp implements zzhjy {
    private static final zzhlp zza = new zzhlp();
    private static final zzhjs zzb = zzhjs.zzd(zzhlm.zza, zzhim.class, zzham.class);

    public static void zzc() throws GeneralSecurityException {
        zzhjb.zza().zzc(zza);
        zzhjb.zza().zzb(zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzhjy
    public final Class zza() {
        return zzham.class;
    }

    @Override // com.google.android.gms.internal.ads.zzhjy
    public final Class zzb() {
        return zzham.class;
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
                zzham zzhamVar = (zzham) zzhjxVar.zza(zzhagVarZze);
                zzgzx zzgzxVarZza = zzhagVarZze.zza();
                if (zzgzxVarZza instanceof zzhlk) {
                    zzhxcVarZzd = ((zzhlk) zzgzxVarZza).zze();
                } else {
                    if (!(zzgzxVarZza instanceof zzhim)) {
                        String name = zzgzxVarZza.getClass().getName();
                        String strValueOf = String.valueOf(zzgzxVarZza.zza());
                        throw new GeneralSecurityException(androidx.media3.extractor.text.ttml.a.q(new StringBuilder(name.length() + 59 + strValueOf.length()), "Cannot get output prefix for key of class ", name, " with parameters ", strValueOf));
                    }
                    zzhxcVarZzd = ((zzhim) zzgzxVarZza).zzd();
                }
                zzhjnVar.zza(zzhxcVarZzd, new zzhln(zzhamVar, zzhagVarZze.zzc()));
            }
        }
        if (zzhipVar.zza()) {
            zzhiqVar = zzhit.zza;
            zzhiqVarZza = zzhiqVar;
        } else {
            zzhir zzhirVarZzb = zzhiz.zza().zzb();
            zzhiq zzhiqVarZza2 = zzhirVarZzb.zza(zzhihVar, zzhipVar, "mac", "compute");
            zzhiqVarZza = zzhirVarZzb.zza(zzhihVar, zzhipVar, "mac", "verify");
            zzhiqVar = zzhiqVarZza2;
        }
        zzhai zzhaiVar = (zzhai) zzhihVar;
        return new zzhlo(new zzhln((zzham) zzhjxVar.zza(zzhaiVar.zzc()), zzhaiVar.zzc().zzc()), zzhjnVar.zzb(), zzhiqVar, zzhiqVarZza, null);
    }
}
