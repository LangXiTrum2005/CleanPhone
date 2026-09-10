package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhbp {
    public static final /* synthetic */ int zza = 0;
    private static final zzhjs zzb = zzhjs.zzd(zzhbo.zza, zzhbl.class, zzgzq.class);
    private static final zzgzy zzc = zzhij.zze("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", zzgzq.class, zzhoz.SYMMETRIC, zzhna.zzg());
    private static final zzhiw zzd = zzhbn.zza;
    private static final zzhhz zze = zzhbm.zza;
    private static final int zzf = 2;

    public static void zza(boolean z2) throws GeneralSecurityException {
        int i2 = zzf;
        if (!zzhhb.zza(i2)) {
            throw new GeneralSecurityException("Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i3 = zzhfa.zza;
        zzhfa.zza(zzhje.zza());
        zzhjb.zza().zzb(zzb);
        zzhja zzhjaVarZza = zzhja.zza();
        HashMap map = new HashMap();
        map.put("AES128_CTR_HMAC_SHA256", zzhei.zze);
        zzhbq zzhbqVar = new zzhbq(null);
        zzhbqVar.zza(16);
        zzhbqVar.zzb(32);
        zzhbqVar.zzd(16);
        zzhbqVar.zzc(16);
        zzhbr zzhbrVar = zzhbr.zzc;
        zzhbqVar.zzf(zzhbrVar);
        zzhbs zzhbsVar = zzhbs.zzc;
        zzhbqVar.zze(zzhbsVar);
        map.put("AES128_CTR_HMAC_SHA256_RAW", zzhbqVar.zzg());
        map.put("AES256_CTR_HMAC_SHA256", zzhei.zzf);
        zzhbq zzhbqVar2 = new zzhbq(null);
        zzhbqVar2.zza(32);
        zzhbqVar2.zzb(32);
        zzhbqVar2.zzd(32);
        zzhbqVar2.zzc(16);
        zzhbqVar2.zzf(zzhbrVar);
        zzhbqVar2.zze(zzhbsVar);
        map.put("AES256_CTR_HMAC_SHA256_RAW", zzhbqVar2.zzg());
        zzhjaVarZza.zzd(Collections.unmodifiableMap(map));
        zzhix.zza().zzb(zzd, zzhbt.class);
        zzhiv.zza().zzb(zze, zzhbt.class);
        zzhia.zza().zzf(zzc, i2, true);
    }
}
