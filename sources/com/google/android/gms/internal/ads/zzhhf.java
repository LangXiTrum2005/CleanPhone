package com.google.android.gms.internal.ads;

import java.security.Provider;
import java.security.Security;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhhf {
    private static final String[] zza = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};

    @Nullable
    public static Provider zza() {
        String[] strArr = zza;
        for (int i2 = 0; i2 < 3; i2++) {
            Provider provider = Security.getProvider(strArr[i2]);
            if (provider != null) {
                return provider;
            }
        }
        return null;
    }
}
