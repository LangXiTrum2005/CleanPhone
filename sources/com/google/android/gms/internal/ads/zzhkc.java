package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhkc {
    private static final ThreadLocal zza = new zzhkb();

    public static byte[] zza(int i2) {
        byte[] bArr = new byte[i2];
        ((SecureRandom) zza.get()).nextBytes(bArr);
        return bArr;
    }

    public static /* synthetic */ SecureRandom zzb() {
        SecureRandom secureRandomZzc = zzc();
        secureRandomZzc.nextLong();
        return secureRandomZzc;
    }

    private static SecureRandom zzc() {
        Provider providerZza = zzhhf.zza();
        if (providerZza != null) {
            try {
                return SecureRandom.getInstance("SHA1PRNG", providerZza);
            } catch (GeneralSecurityException unused) {
            }
        }
        Provider provider = null;
        try {
            provider = (Provider) Class.forName("org.conscrypt.Conscrypt").getMethod("newProvider", new Class[0]).invoke(null, new Object[0]);
        } catch (Throwable unused2) {
        }
        if (provider != null) {
            try {
                return SecureRandom.getInstance("SHA1PRNG", provider);
            } catch (GeneralSecurityException unused3) {
            }
        }
        return new SecureRandom();
    }
}
