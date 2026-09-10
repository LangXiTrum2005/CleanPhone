package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhcq {
    public static final /* synthetic */ int zza = 0;
    private static final zzhjs zzb = zzhjs.zzd(zzhcn.zza, zzhcm.class, zzgzq.class);
    private static final zzhhz zzc = zzhcp.zza;
    private static final zzhiw zzd = zzhco.zza;
    private static final zzgzy zze = zzhij.zze("type.googleapis.com/google.crypto.tink.AesGcmSivKey", zzgzq.class, zzhoz.SYMMETRIC, zzhnu.zze());

    public static void zza(boolean z2) throws GeneralSecurityException {
        if (!zzhhb.zza(1)) {
            throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        int i2 = zzhft.zza;
        zzhft.zza(zzhje.zza());
        zzhja zzhjaVarZza = zzhja.zza();
        HashMap map = new HashMap();
        zzhcr zzhcrVar = new zzhcr(null);
        zzhcrVar.zza(16);
        zzhcs zzhcsVar = zzhcs.zza;
        zzhcrVar.zzb(zzhcsVar);
        map.put("AES128_GCM_SIV", zzhcrVar.zzc());
        zzhcr zzhcrVar2 = new zzhcr(null);
        zzhcrVar2.zza(16);
        zzhcs zzhcsVar2 = zzhcs.zzc;
        zzhcrVar2.zzb(zzhcsVar2);
        map.put("AES128_GCM_SIV_RAW", zzhcrVar2.zzc());
        zzhcr zzhcrVar3 = new zzhcr(null);
        zzhcrVar3.zza(32);
        zzhcrVar3.zzb(zzhcsVar);
        map.put("AES256_GCM_SIV", zzhcrVar3.zzc());
        zzhcr zzhcrVar4 = new zzhcr(null);
        zzhcrVar4.zza(32);
        zzhcrVar4.zzb(zzhcsVar2);
        map.put("AES256_GCM_SIV_RAW", zzhcrVar4.zzc());
        zzhjaVarZza.zzd(Collections.unmodifiableMap(map));
        zzhix.zza().zzb(zzd, zzhct.class);
        zzhiv.zza().zzb(zzc, zzhct.class);
        zzhjb.zza().zzb(zzb);
        zzhia.zza().zzb(zze, true);
    }
}
