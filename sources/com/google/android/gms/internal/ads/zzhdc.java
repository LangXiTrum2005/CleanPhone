package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhdc {
    public static final /* synthetic */ int zza = 0;
    private static final zzhjs zzb = zzhjs.zzd(zzhdb.zza, zzhdh.class, zzgzq.class);
    private static final zzgzy zzc = zzhij.zze("type.googleapis.com/google.crypto.tink.KmsAeadKey", zzgzq.class, zzhoz.REMOTE, zzhpp.zze());
    private static final zzhhz zzd = zzhda.zza;

    public static void zza(boolean z2) throws GeneralSecurityException {
        if (!zzhhb.zza(1)) {
            throw new GeneralSecurityException("Registering KMS AEAD is not supported in FIPS mode");
        }
        int i2 = zzhdo.zza;
        zzhdo.zza(zzhje.zza());
        zzhjb.zza().zzb(zzb);
        zzhiv.zza().zzb(zzd, zzhdj.class);
        zzhia.zza().zzb(zzc, true);
    }
}
