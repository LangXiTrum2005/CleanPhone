package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhrm {
    public static final /* synthetic */ int zza = 0;
    private static final zzhjs zzb = zzhjs.zzd(zzhrj.zza, zzhrg.class, zzhap.class);
    private static final zzhjs zzc = zzhjs.zzd(zzhrl.zza, zzhri.class, zzhaq.class);
    private static final zzhao zzd = zzhij.zzf("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey", zzhap.class, zzhog.zzg());
    private static final zzgzy zze = zzhij.zze("type.googleapis.com/google.crypto.tink.EcdsaPublicKey", zzhaq.class, zzhoz.ASYMMETRIC_PUBLIC, zzhoi.zzi());
    private static final zzhhz zzf = zzhrk.zza;
    private static final int zzg = 2;

    public static void zza(boolean z2) throws GeneralSecurityException {
        int i2 = zzg;
        if (!zzhhb.zza(i2)) {
            throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i3 = zzhub.zza;
        zzhub.zza(zzhje.zza());
        zzhja zzhjaVarZza = zzhja.zza();
        HashMap map = new HashMap();
        map.put("ECDSA_P256", zzhsk.zza);
        map.put("ECDSA_P256_IEEE_P1363", zzhsk.zzd);
        zzhqz zzhqzVar = new zzhqz(null);
        zzhqzVar.zzc(zzhrb.zza);
        zzhqzVar.zzb(zzhra.zza);
        zzhqzVar.zza(zzhrc.zza);
        zzhqzVar.zzd(zzhrd.zzd);
        map.put("ECDSA_P256_RAW", zzhqzVar.zze());
        map.put("ECDSA_P256_IEEE_P1363_WITHOUT_PREFIX", zzhsk.zzf);
        map.put("ECDSA_P384", zzhsk.zzb);
        map.put("ECDSA_P384_IEEE_P1363", zzhsk.zze);
        zzhqz zzhqzVar2 = new zzhqz(null);
        zzhqzVar2.zzc(zzhrb.zzc);
        zzhra zzhraVar = zzhra.zzb;
        zzhqzVar2.zzb(zzhraVar);
        zzhrc zzhrcVar = zzhrc.zzb;
        zzhqzVar2.zza(zzhrcVar);
        zzhrd zzhrdVar = zzhrd.zza;
        zzhqzVar2.zzd(zzhrdVar);
        map.put("ECDSA_P384_SHA512", zzhqzVar2.zze());
        zzhqz zzhqzVar3 = new zzhqz(null);
        zzhqzVar3.zzc(zzhrb.zzb);
        zzhqzVar3.zzb(zzhraVar);
        zzhqzVar3.zza(zzhrcVar);
        zzhqzVar3.zzd(zzhrdVar);
        map.put("ECDSA_P384_SHA384", zzhqzVar3.zze());
        map.put("ECDSA_P521", zzhsk.zzc);
        map.put("ECDSA_P521_IEEE_P1363", zzhsk.zzg);
        zzhjaVarZza.zzd(Collections.unmodifiableMap(map));
        zzhjb.zza().zzb(zzb);
        zzhjb.zza().zzb(zzc);
        zzhiv.zza().zzb(zzf, zzhre.class);
        zzhia.zza().zzf(zzd, i2, true);
        zzhia.zza().zzf(zze, i2, false);
    }
}
