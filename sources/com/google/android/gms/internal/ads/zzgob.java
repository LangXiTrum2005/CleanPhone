package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgob {
    private static final zzglz zza = new zzglz() { // from class: com.google.android.gms.internal.ads.zzgny
        @Override // com.google.android.gms.internal.ads.zzglz
        public final zzgdx zza(zzgek zzgekVar, Integer num) {
            return zzgob.zzb((zzgof) zzgekVar, num);
        }
    };
    private static final zzgmx zzb = zzgmx.zzb(new zzgmv() { // from class: com.google.android.gms.internal.ads.zzgnz
        @Override // com.google.android.gms.internal.ads.zzgmv
        public final Object zza(zzgdx zzgdxVar) {
            return zzgob.zzc((zzgnx) zzgdxVar);
        }
    }, zzgnx.class, zzgog.class);
    private static final zzgmx zzc = zzgmx.zzb(new zzgmv() { // from class: com.google.android.gms.internal.ads.zzgoa
        @Override // com.google.android.gms.internal.ads.zzgmv
        public final Object zza(zzgdx zzgdxVar) {
            return zzgob.zza((zzgnx) zzgdxVar);
        }
    }, zzgnx.class, zzgej.class);
    private static final zzgdy zzd = zzgli.zzd("type.googleapis.com/google.crypto.tink.AesCmacKey", zzgej.class, zzgsj.SYMMETRIC, zzgqb.zzh());

    public static /* synthetic */ zzgej zza(zzgnx zzgnxVar) throws GeneralSecurityException {
        zze(zzgnxVar.zzb());
        return zzgvl.zza(zzgnxVar);
    }

    public static /* synthetic */ zzgnx zzb(zzgof zzgofVar, Integer num) throws GeneralSecurityException {
        zze(zzgofVar);
        zzgnv zzgnvVar = new zzgnv(null);
        zzgnvVar.zzc(zzgofVar);
        zzgnvVar.zza(zzgvp.zzc(zzgofVar.zzc()));
        zzgnvVar.zzb(num);
        return zzgnvVar.zzd();
    }

    public static /* synthetic */ zzgog zzc(zzgnx zzgnxVar) throws GeneralSecurityException {
        zze(zzgnxVar.zzb());
        return new zzgpq(zzgnxVar);
    }

    public static void zzd(boolean z) throws GeneralSecurityException {
        if (!zzgks.zza(1)) {
            throw new GeneralSecurityException("Registering AES CMAC is not supported in FIPS mode");
        }
        int i = zzgpo.zza;
        zzgpo.zze(zzgmk.zzc());
        zzgma.zzb().zzc(zza, zzgof.class);
        zzgmh.zza().zze(zzb);
        zzgmh.zza().zze(zzc);
        zzgmg zzgmgVarZzb = zzgmg.zzb();
        HashMap map = new HashMap();
        zzgof zzgofVar = zzgpj.zzc;
        map.put("AES_CMAC", zzgofVar);
        map.put("AES256_CMAC", zzgofVar);
        zzgoc zzgocVar = new zzgoc(null);
        zzgocVar.zza(32);
        zzgocVar.zzb(16);
        zzgocVar.zzc(zzgod.zzd);
        map.put("AES256_CMAC_RAW", zzgocVar.zzd());
        zzgmgVarZzb.zzd(Collections.unmodifiableMap(map));
        zzgkz.zzc().zzd(zzd, true);
    }

    private static void zze(zzgof zzgofVar) throws GeneralSecurityException {
        if (zzgofVar.zzc() != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }
}
