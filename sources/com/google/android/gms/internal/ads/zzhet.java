package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhet {
    public static final /* synthetic */ int zza = 0;
    private static final zzhjs zzb = zzhjs.zzd(zzhes.zza, zzhep.class, zzgzq.class);
    private static final zzgzy zzc = zzhij.zze("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", zzgzq.class, zzhoz.SYMMETRIC, zzhqw.zze());
    private static final zzhiw zzd = zzheq.zza;
    private static final zzhhz zze = zzher.zza;

    public static void zza(boolean z2) throws GeneralSecurityException {
        if (!zzhhb.zza(1)) {
            throw new GeneralSecurityException("Registering XChaCha20Poly1305 is not supported in FIPS mode");
        }
        int i2 = zzhgu.zza;
        zzhgu.zza(zzhje.zza());
        zzhjb.zza().zzb(zzb);
        zzhja zzhjaVarZza = zzhja.zza();
        HashMap map = new HashMap();
        map.put("XCHACHA20_POLY1305", zzhev.zzb(zzheu.zza));
        map.put("XCHACHA20_POLY1305_RAW", zzhev.zzb(zzheu.zzc));
        zzhjaVarZza.zzd(Collections.unmodifiableMap(map));
        zzhiv.zza().zzb(zze, zzhev.class);
        zzhix.zza().zzb(zzd, zzhev.class);
        zzhia.zza().zzb(zzc, true);
    }
}
