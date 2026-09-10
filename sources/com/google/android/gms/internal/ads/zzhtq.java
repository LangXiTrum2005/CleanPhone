package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhtq {
    public static final /* synthetic */ int zza = 0;
    private static final zzhjs zzb = zzhjs.zzd(zzhtn.zza, zzhtk.class, zzhap.class);
    private static final zzhjs zzc = zzhjs.zzd(zzhtp.zza, zzhtm.class, zzhaq.class);
    private static final zzhao zzd = zzhij.zzf("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey", zzhap.class, zzhqm.zzl());
    private static final zzgzy zze = zzhij.zze("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey", zzhaq.class, zzhoz.ASYMMETRIC_PUBLIC, zzhqo.zzi());
    private static final zzhhz zzf = zzhto.zza;
    private static final int zzg = 2;

    public static void zza(boolean z2) throws GeneralSecurityException {
        int i2 = zzg;
        if (!zzhhb.zza(i2)) {
            throw new GeneralSecurityException("Can not use RSA SSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i3 = zzhve.zza;
        zzhve.zza(zzhje.zza());
        zzhja zzhjaVarZza = zzhja.zza();
        HashMap map = new HashMap();
        BigInteger bigInteger = zzhti.zza;
        zzhtf zzhtfVar = new zzhtf(null);
        zzhtg zzhtgVar = zzhtg.zza;
        zzhtfVar.zzd(zzhtgVar);
        zzhtfVar.zze(zzhtgVar);
        zzhtfVar.zzf(32);
        zzhtfVar.zza(3072);
        BigInteger bigInteger2 = zzhti.zza;
        zzhtfVar.zzb(bigInteger2);
        zzhth zzhthVar = zzhth.zza;
        zzhtfVar.zzc(zzhthVar);
        map.put("RSA_SSA_PSS_3072_SHA256_F4", zzhtfVar.zzg());
        zzhtf zzhtfVar2 = new zzhtf(null);
        zzhtfVar2.zzd(zzhtgVar);
        zzhtfVar2.zze(zzhtgVar);
        zzhtfVar2.zzf(32);
        zzhtfVar2.zza(3072);
        zzhtfVar2.zzb(bigInteger2);
        zzhth zzhthVar2 = zzhth.zzd;
        zzhtfVar2.zzc(zzhthVar2);
        map.put("RSA_SSA_PSS_3072_SHA256_F4_RAW", zzhtfVar2.zzg());
        map.put("RSA_SSA_PSS_3072_SHA256_SHA256_32_F4", zzhsk.zzk);
        zzhtf zzhtfVar3 = new zzhtf(null);
        zzhtg zzhtgVar2 = zzhtg.zzc;
        zzhtfVar3.zzd(zzhtgVar2);
        zzhtfVar3.zze(zzhtgVar2);
        zzhtfVar3.zzf(64);
        zzhtfVar3.zza(4096);
        zzhtfVar3.zzb(bigInteger2);
        zzhtfVar3.zzc(zzhthVar);
        map.put("RSA_SSA_PSS_4096_SHA512_F4", zzhtfVar3.zzg());
        zzhtf zzhtfVar4 = new zzhtf(null);
        zzhtfVar4.zzd(zzhtgVar2);
        zzhtfVar4.zze(zzhtgVar2);
        zzhtfVar4.zzf(64);
        zzhtfVar4.zza(4096);
        zzhtfVar4.zzb(bigInteger2);
        zzhtfVar4.zzc(zzhthVar2);
        map.put("RSA_SSA_PSS_4096_SHA512_F4_RAW", zzhtfVar4.zzg());
        map.put("RSA_SSA_PSS_4096_SHA512_SHA512_64_F4", zzhsk.zzl);
        zzhjaVarZza.zzd(Collections.unmodifiableMap(map));
        zzhjb.zza().zzb(zzb);
        zzhjb.zza().zzb(zzc);
        zzhiv.zza().zzb(zzf, zzhti.class);
        zzhia.zza().zzf(zzd, i2, true);
        zzhia.zza().zzf(zze, i2, false);
    }
}
