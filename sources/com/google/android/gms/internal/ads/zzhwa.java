package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
final class zzhwa implements zzhwb {
    private final zzhwk zza;

    @Override // com.google.android.gms.internal.ads.zzhwb
    public final Object zza(String str) throws GeneralSecurityException {
        Iterator it = zzhwc.zza("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt").iterator();
        Exception exc = null;
        while (it.hasNext()) {
            try {
                return this.zza.zza(str, (Provider) it.next());
            } catch (Exception e2) {
                if (exc == null) {
                    exc = e2;
                }
            }
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
