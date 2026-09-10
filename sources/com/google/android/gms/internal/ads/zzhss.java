package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhss implements zzhjy {
    private static final zzhss zza = new zzhss();
    private static final zzhjs zzb = zzhjs.zzd(zzhsp.zza, zzhim.class, zzhaq.class);

    public static void zzc() throws GeneralSecurityException {
        zzhjb.zza().zzc(zza);
        zzhjb.zza().zzb(zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzhjy
    public final Class zza() {
        return zzhaq.class;
    }

    @Override // com.google.android.gms.internal.ads.zzhjy
    public final Class zzb() {
        return zzhaq.class;
    }

    @Override // com.google.android.gms.internal.ads.zzhjy
    public final /* bridge */ /* synthetic */ Object zze(zzhih zzhihVar, zzhip zzhipVar, zzhjx zzhjxVar) throws GeneralSecurityException {
        zzhxc zzhxcVarZzd;
        zzhjn zzhjnVar = new zzhjn();
        for (int i2 = 0; i2 < zzhihVar.zzd(); i2++) {
            zzhag zzhagVarZze = ((zzhai) zzhihVar).zze(i2);
            if (zzhagVarZze.zzb().equals(zzgzz.zza)) {
                zzhaq zzhaqVar = (zzhaq) zzhjxVar.zza(zzhagVarZze);
                zzgzx zzgzxVarZza = zzhagVarZze.zza();
                if (zzgzxVarZza instanceof zzhtu) {
                    zzhxcVarZzd = ((zzhtu) zzgzxVarZza).zze();
                } else {
                    if (!(zzgzxVarZza instanceof zzhim)) {
                        String name = zzgzxVarZza.getClass().getName();
                        String strValueOf = String.valueOf(zzgzxVarZza.zza());
                        throw new GeneralSecurityException(androidx.media3.extractor.text.ttml.a.q(new StringBuilder(name.length() + 59 + strValueOf.length()), "Cannot get output prefix for key of class ", name, " with parameters ", strValueOf));
                    }
                    zzhxcVarZzd = ((zzhim) zzgzxVarZza).zzd();
                }
                zzhjnVar.zza(zzhxcVarZzd, new zzhsq(zzhaqVar, zzhagVarZze.zzc()));
            }
        }
        return new zzhsr(zzhjnVar.zzb(), !zzhipVar.zza() ? zzhiz.zza().zzb().zza(zzhihVar, zzhipVar, "public_key_verify", "verify") : zzhit.zza);
    }
}
