package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhmd implements zzhkv {
    public zzhmd(zzhkn zzhknVar) {
    }

    public static zzhkv zza(zzhkn zzhknVar) throws GeneralSecurityException {
        if (!zzhhb.zza(1)) {
            throw new GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode.");
        }
        Provider providerZza = zzhhf.zza();
        if (providerZza != null) {
            try {
                return zzhmc.zza(zzhknVar, providerZza);
            } catch (GeneralSecurityException unused) {
            }
        }
        return new zzhmd(zzhknVar);
    }
}
