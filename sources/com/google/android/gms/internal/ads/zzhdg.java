package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhdg {
    public static final /* synthetic */ int zza = 0;
    private static final zzgzy zzb = zzhij.zze("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", zzgzq.class, zzhoz.SYMMETRIC, zzhpt.zze());
    private static final zzhhz zzc = zzhdf.zza;
    private static final zzhjs zzd = zzhjs.zzd(zzhde.zza, zzhdp.class, zzgzq.class);

    public static void zza(boolean z2) throws GeneralSecurityException {
        if (!zzhhb.zza(1)) {
            throw new GeneralSecurityException("Registering KMS Envelope AEAD is not supported in FIPS mode");
        }
        int i2 = zzhdy.zza;
        zzhdy.zza(zzhje.zza());
        zzhiv.zza().zzb(zzc, zzhdt.class);
        zzhjb.zza().zzb(zzd);
        zzhia.zza().zzb(zzb, true);
    }
}
