package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhte {
    public static final /* synthetic */ int zza = 0;
    private static final zzhjs zzb = zzhjs.zzd(zzhtb.zza, zzhsy.class, zzhap.class);
    private static final zzhjs zzc = zzhjs.zzd(zzhtd.zza, zzhta.class, zzhaq.class);
    private static final zzhao zzd = zzhij.zzf("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey", zzhap.class, zzhqe.zzl());
    private static final zzgzy zze = zzhij.zze("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey", zzhaq.class, zzhoz.ASYMMETRIC_PUBLIC, zzhqg.zzi());
    private static final zzhhz zzf = zzhtc.zza;
    private static final int zzg = 2;

    public static void zza(boolean z2) throws GeneralSecurityException {
        int i2 = zzg;
        if (!zzhhb.zza(i2)) {
            throw new GeneralSecurityException("Can not use RSA SSA PKCS1 in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i3 = zzhuv.zza;
        zzhuv.zza(zzhje.zza());
        zzhja zzhjaVarZza = zzhja.zza();
        HashMap map = new HashMap();
        map.put("RSA_SSA_PKCS1_3072_SHA256_F4", zzhsk.zzh);
        BigInteger bigInteger = zzhsw.zza;
        zzhst zzhstVar = new zzhst(null);
        zzhstVar.zzd(zzhsu.zza);
        zzhstVar.zza(3072);
        BigInteger bigInteger2 = zzhsw.zza;
        zzhstVar.zzb(bigInteger2);
        zzhsv zzhsvVar = zzhsv.zzd;
        zzhstVar.zzc(zzhsvVar);
        map.put("RSA_SSA_PKCS1_3072_SHA256_F4_RAW", zzhstVar.zze());
        map.put("RSA_SSA_PKCS1_3072_SHA256_F4_WITHOUT_PREFIX", zzhsk.zzi);
        map.put("RSA_SSA_PKCS1_4096_SHA512_F4", zzhsk.zzj);
        zzhst zzhstVar2 = new zzhst(null);
        zzhstVar2.zzd(zzhsu.zzc);
        zzhstVar2.zza(4096);
        zzhstVar2.zzb(bigInteger2);
        zzhstVar2.zzc(zzhsvVar);
        map.put("RSA_SSA_PKCS1_4096_SHA512_F4_RAW", zzhstVar2.zze());
        zzhjaVarZza.zzd(map);
        zzhjb.zza().zzb(zzb);
        zzhjb.zza().zzb(zzc);
        zzhiv.zza().zzb(zzf, zzhsw.class);
        zzhia.zza().zzf(zzd, i2, true);
        zzhia.zza().zzf(zze, i2, false);
    }
}
