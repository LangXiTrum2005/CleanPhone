package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhcx {
    public static final /* synthetic */ int zza = 0;
    private static final zzhjs zzb = zzhjs.zzd(zzhcw.zza, zzhcu.class, zzgzq.class);
    private static final zzhhz zzc = zzhcv.zza;
    private static final zzgzy zzd = zzhij.zze("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", zzgzq.class, zzhoz.SYMMETRIC, zzhny.zze());

    public static void zza(boolean z2) throws GeneralSecurityException {
        if (!zzhhb.zza(1)) {
            throw new GeneralSecurityException("Registering ChaCha20Poly1305 is not supported in FIPS mode");
        }
        int i2 = zzhfz.zza;
        zzhfz.zza(zzhje.zza());
        zzhjb.zza().zzb(zzb);
        zzhiv.zza().zzb(zzc, zzhcz.class);
        zzhja zzhjaVarZza = zzhja.zza();
        HashMap map = new HashMap();
        map.put("CHACHA20_POLY1305", zzhcz.zzb(zzhcy.zza));
        map.put("CHACHA20_POLY1305_RAW", zzhcz.zzb(zzhcy.zzc));
        zzhjaVarZza.zzd(Collections.unmodifiableMap(map));
        zzhia.zza().zzb(zzd, true);
    }
}
