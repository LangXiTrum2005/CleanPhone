package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhbd {
    public static final /* synthetic */ int zza = 0;
    private static final zzhhv zzb = zzb();

    public static zzgzu zza() throws GeneralSecurityException {
        if (zzhhc.zza()) {
            throw new GeneralSecurityException("Cannot use non-FIPS-compliant AeadConfigurationV1 in FIPS mode");
        }
        return zzb;
    }

    private static zzhhv zzb() {
        try {
            zzhjt zzhjtVarZza = zzhjw.zza();
            zzhbj.zzd(zzhjtVarZza);
            zzhjtVarZza.zza(zzhjs.zzd(zzhbb.zza, zzhbl.class, zzgzq.class));
            zzhjtVarZza.zza(zzhjs.zzd(zzhaz.zza, zzhcd.class, zzgzq.class));
            zzhjtVarZza.zza(zzhjs.zzd(zzhba.zza, zzhcm.class, zzgzq.class));
            zzhjtVarZza.zza(zzhjs.zzd(zzhay.zza, zzhbv.class, zzgzq.class));
            zzhjtVarZza.zza(zzhjs.zzd(zzhax.zza, zzhcu.class, zzgzq.class));
            zzhjtVarZza.zza(zzhjs.zzd(zzhaw.zza, zzhep.class, zzgzq.class));
            zzhjtVarZza.zza(zzhjs.zzd(zzhbc.zza, zzhej.class, zzgzq.class));
            return zzhhv.zzb(zzhjtVarZza.zzc());
        } catch (GeneralSecurityException e2) {
            throw new IllegalStateException(e2);
        }
    }
}
