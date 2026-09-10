package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhmc implements zzhkv {
    private zzhmc(zzhkn zzhknVar, Provider provider) throws GeneralSecurityException {
        if (!zzhhb.zza(1)) {
            throw new GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode.");
        }
        try {
            Mac.getInstance("AESCMAC", provider);
            zzhknVar.zze().zzc();
            zzhknVar.zzf();
            new SecretKeySpec(zzhknVar.zzd().zzc(zzgzv.zza()), "AES");
        } catch (NoSuchAlgorithmException e2) {
            throw new GeneralSecurityException("AES-CMAC not available.", e2);
        }
    }

    public static zzhkv zza(zzhkn zzhknVar, Provider provider) throws GeneralSecurityException {
        return new zzhmc(zzhknVar, provider);
    }
}
