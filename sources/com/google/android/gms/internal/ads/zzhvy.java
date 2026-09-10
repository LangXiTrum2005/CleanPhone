package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
final class zzhvy implements zzhwb {
    private final zzhwk zza;

    @Override // com.google.android.gms.internal.ads.zzhwb
    public final Object zza(String str) throws GeneralSecurityException {
        Iterator it = zzhwc.zza("GmsCore_OpenSSL", "AndroidOpenSSL").iterator();
        while (it.hasNext()) {
            try {
                return this.zza.zza(str, (Provider) it.next());
            } catch (Exception unused) {
            }
        }
        return this.zza.zza(str, null);
    }
}
