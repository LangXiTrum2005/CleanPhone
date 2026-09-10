package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhru {
    public static final /* synthetic */ int zza = 0;
    private static final zzhjs zzb = zzhjs.zzd(zzhrs.zza, zzhrp.class, zzhap.class);
    private static final zzhjs zzc = zzhjs.zzd(zzhrt.zza, zzhrv.class, zzhaq.class);
    private static final zzhao zzd = zzhij.zzf("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey", zzhap.class, zzhon.zzg());
    private static final zzgzy zze = zzhij.zze("type.googleapis.com/google.crypto.tink.Ed25519PublicKey", zzhaq.class, zzhoz.ASYMMETRIC_PUBLIC, zzhop.zzg());
    private static final zzhiw zzf = zzhrr.zza;
    private static final zzhhz zzg = zzhrq.zza;

    public static void zza(boolean z2) throws GeneralSecurityException {
        if (!zzhhb.zza(1)) {
            throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        int i2 = zzhuk.zza;
        zzhuk.zza(zzhje.zza());
        zzhja zzhjaVarZza = zzhja.zza();
        HashMap map = new HashMap();
        map.put("ED25519", zzhro.zzb(zzhrn.zza));
        zzhrn zzhrnVar = zzhrn.zzd;
        map.put("ED25519_RAW", zzhro.zzb(zzhrnVar));
        map.put("ED25519WithRawOutput", zzhro.zzb(zzhrnVar));
        zzhjaVarZza.zzd(Collections.unmodifiableMap(map));
        zzhiv.zza().zzb(zzg, zzhro.class);
        zzhix.zza().zzb(zzf, zzhro.class);
        zzhjb.zza().zzb(zzb);
        zzhjb.zza().zzb(zzc);
        zzhia.zza().zzb(zzd, true);
        zzhia.zza().zzb(zze, false);
    }
}
