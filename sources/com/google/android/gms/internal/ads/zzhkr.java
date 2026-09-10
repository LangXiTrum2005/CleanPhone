package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhkr {
    private static final zzhhz zza = zzhkq.zza;
    private static final zzhjs zzb = zzhjs.zzd(zzhko.zza, zzhkn.class, zzhkv.class);
    private static final zzhjs zzc = zzhjs.zzd(zzhkp.zza, zzhkn.class, zzham.class);
    private static final zzgzy zzd = zzhij.zze("type.googleapis.com/google.crypto.tink.AesCmacKey", zzham.class, zzhoz.SYMMETRIC, zzhmu.zzg());

    public static void zza(boolean z2) throws GeneralSecurityException {
        if (!zzhhb.zza(1)) {
            throw new GeneralSecurityException("Registering AES CMAC is not supported in FIPS mode");
        }
        int i2 = zzhma.zza;
        zzhma.zza(zzhje.zza());
        zzhiv.zza().zzb(zza, zzhku.class);
        zzhjb.zza().zzb(zzb);
        zzhjb.zza().zzb(zzc);
        zzhja zzhjaVarZza = zzhja.zza();
        HashMap map = new HashMap();
        zzhku zzhkuVar = zzhlv.zzc;
        map.put("AES_CMAC", zzhkuVar);
        map.put("AES256_CMAC", zzhkuVar);
        zzhks zzhksVar = new zzhks(null);
        zzhksVar.zza(32);
        zzhksVar.zzb(16);
        zzhksVar.zzc(zzhkt.zzd);
        map.put("AES256_CMAC_RAW", zzhksVar.zzd());
        zzhjaVarZza.zzd(Collections.unmodifiableMap(map));
        zzhia.zza().zzb(zzd, true);
    }

    public static /* synthetic */ zzhkn zzb(zzhku zzhkuVar, Integer num) throws GeneralSecurityException {
        zze(zzhkuVar);
        zzhkm zzhkmVar = new zzhkm(null);
        zzhkmVar.zza(zzhkuVar);
        zzhkmVar.zzb(zzhxe.zzb(zzhkuVar.zzc()));
        zzhkmVar.zzc(num);
        return zzhkmVar.zzd();
    }

    public static /* synthetic */ zzhkv zzc(zzhkn zzhknVar) throws GeneralSecurityException {
        zze(zzhknVar.zzf());
        return zzhmd.zza(zzhknVar);
    }

    public static /* synthetic */ zzham zzd(zzhkn zzhknVar) throws GeneralSecurityException {
        zze(zzhknVar.zzf());
        return zzhws.zza(zzhknVar);
    }

    private static void zze(zzhku zzhkuVar) throws GeneralSecurityException {
        if (zzhkuVar.zzc() != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }
}
