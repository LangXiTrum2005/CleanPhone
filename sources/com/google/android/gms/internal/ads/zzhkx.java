package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhkx implements zzhjy {
    private static final zzhkx zza = new zzhkx();

    private zzhkx() {
    }

    public static void zzc() throws GeneralSecurityException {
        zzhjb.zza().zzc(zza);
    }

    @Override // com.google.android.gms.internal.ads.zzhjy
    public final Class zza() {
        return zzhkv.class;
    }

    @Override // com.google.android.gms.internal.ads.zzhjy
    public final Class zzb() {
        return zzhkv.class;
    }

    @Override // com.google.android.gms.internal.ads.zzhjy
    public final /* bridge */ /* synthetic */ Object zze(zzhih zzhihVar, zzhip zzhipVar, zzhjx zzhjxVar) throws GeneralSecurityException {
        zzhxc zzhxcVarZzd;
        zzhag zzhagVarZzc = ((zzhai) zzhihVar).zzc();
        zzhjn zzhjnVar = new zzhjn();
        for (int i2 = 0; i2 < zzhihVar.zzd(); i2++) {
            zzhag zzhagVarZze = ((zzhai) zzhihVar).zze(i2);
            if (zzhagVarZze.zzb().equals(zzgzz.zza)) {
                zzhkv zzhkvVar = (zzhkv) zzhjxVar.zza(zzhagVarZze);
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
                zzhjnVar.zza(zzhxcVarZzd, zzhkvVar);
            }
        }
        return new zzhkw(zzhjnVar.zzb(), (zzhkv) zzhjxVar.zza(zzhagVarZzc), null);
    }
}
