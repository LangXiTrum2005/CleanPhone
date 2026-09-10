package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhem {
    private static final zzhhz zza = zzhel.zza;
    private static final zzhjs zzb = zzhjs.zzd(zzhek.zza, zzhej.class, zzgzq.class);

    public static void zza(boolean z2) throws GeneralSecurityException {
        int i2 = zzhgo.zza;
        zzhgo.zza(zzhje.zza());
        zzhja zzhjaVarZza = zzhja.zza();
        HashMap map = new HashMap();
        map.put("XAES_256_GCM_192_BIT_NONCE", zzhei.zzg);
        map.put("XAES_256_GCM_192_BIT_NONCE_NO_PREFIX", zzhei.zzh);
        map.put("XAES_256_GCM_160_BIT_NONCE_NO_PREFIX", zzhei.zzi);
        map.put("X_AES_GCM_8_BYTE_SALT_NO_PREFIX", zzhei.zzj);
        zzhjaVarZza.zzd(Collections.unmodifiableMap(map));
        zzhjb.zza().zzb(zzb);
        zzhiv.zza().zzb(zza, zzheo.class);
    }
}
