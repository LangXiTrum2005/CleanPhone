package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhle {
    public static final /* synthetic */ int zza = 0;
    private static final zzhjs zzb = zzhjs.zzd(zzhla.zza, zzhkz.class, zzhkv.class);
    private static final zzhjs zzc = zzhjs.zzd(zzhld.zza, zzhkz.class, zzham.class);
    private static final zzgzy zzd = zzhij.zze("type.googleapis.com/google.crypto.tink.HmacKey", zzham.class, zzhoz.SYMMETRIC, zzhot.zzh());
    private static final zzhiw zze = zzhlc.zza;
    private static final zzhhz zzf = zzhlb.zza;
    private static final int zzg = 2;

    public static void zza(boolean z2) throws GeneralSecurityException {
        int i2 = zzg;
        if (!zzhhb.zza(i2)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i3 = zzhmj.zza;
        zzhmj.zza(zzhje.zza());
        zzhjb.zza().zzb(zzb);
        zzhjb.zza().zzb(zzc);
        zzhja zzhjaVarZza = zzhja.zza();
        HashMap map = new HashMap();
        map.put("HMAC_SHA256_128BITTAG", zzhlv.zza);
        zzhlf zzhlfVar = new zzhlf(null);
        zzhlfVar.zza(32);
        zzhlfVar.zzb(16);
        zzhlh zzhlhVar = zzhlh.zzd;
        zzhlfVar.zzc(zzhlhVar);
        zzhlg zzhlgVar = zzhlg.zzc;
        zzhlfVar.zzd(zzhlgVar);
        map.put("HMAC_SHA256_128BITTAG_RAW", zzhlfVar.zze());
        zzhlf zzhlfVar2 = new zzhlf(null);
        zzhlfVar2.zza(32);
        zzhlfVar2.zzb(32);
        zzhlh zzhlhVar2 = zzhlh.zza;
        zzhlfVar2.zzc(zzhlhVar2);
        zzhlfVar2.zzd(zzhlgVar);
        map.put("HMAC_SHA256_256BITTAG", zzhlfVar2.zze());
        zzhlf zzhlfVar3 = new zzhlf(null);
        zzhlfVar3.zza(32);
        zzhlfVar3.zzb(32);
        zzhlfVar3.zzc(zzhlhVar);
        zzhlfVar3.zzd(zzhlgVar);
        map.put("HMAC_SHA256_256BITTAG_RAW", zzhlfVar3.zze());
        zzhlf zzhlfVar4 = new zzhlf(null);
        zzhlfVar4.zza(64);
        zzhlfVar4.zzb(16);
        zzhlfVar4.zzc(zzhlhVar2);
        zzhlg zzhlgVar2 = zzhlg.zze;
        zzhlfVar4.zzd(zzhlgVar2);
        map.put("HMAC_SHA512_128BITTAG", zzhlfVar4.zze());
        zzhlf zzhlfVar5 = new zzhlf(null);
        zzhlfVar5.zza(64);
        zzhlfVar5.zzb(16);
        zzhlfVar5.zzc(zzhlhVar);
        zzhlfVar5.zzd(zzhlgVar2);
        map.put("HMAC_SHA512_128BITTAG_RAW", zzhlfVar5.zze());
        zzhlf zzhlfVar6 = new zzhlf(null);
        zzhlfVar6.zza(64);
        zzhlfVar6.zzb(32);
        zzhlfVar6.zzc(zzhlhVar2);
        zzhlfVar6.zzd(zzhlgVar2);
        map.put("HMAC_SHA512_256BITTAG", zzhlfVar6.zze());
        zzhlf zzhlfVar7 = new zzhlf(null);
        zzhlfVar7.zza(64);
        zzhlfVar7.zzb(32);
        zzhlfVar7.zzc(zzhlhVar);
        zzhlfVar7.zzd(zzhlgVar2);
        map.put("HMAC_SHA512_256BITTAG_RAW", zzhlfVar7.zze());
        map.put("HMAC_SHA512_512BITTAG", zzhlv.zzb);
        zzhlf zzhlfVar8 = new zzhlf(null);
        zzhlfVar8.zza(64);
        zzhlfVar8.zzb(64);
        zzhlfVar8.zzc(zzhlhVar);
        zzhlfVar8.zzd(zzhlgVar2);
        map.put("HMAC_SHA512_512BITTAG_RAW", zzhlfVar8.zze());
        zzhjaVarZza.zzd(Collections.unmodifiableMap(map));
        zzhiv.zza().zzb(zzf, zzhli.class);
        zzhix.zza().zzb(zze, zzhli.class);
        zzhia.zza().zzf(zzd, i2, true);
    }
}
