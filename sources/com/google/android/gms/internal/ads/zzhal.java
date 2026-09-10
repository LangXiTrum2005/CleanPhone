package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhal {
    private static final CopyOnWriteArrayList zza = new CopyOnWriteArrayList();

    public static zzhak zza(String str) throws GeneralSecurityException {
        for (zzhak zzhakVar : zza) {
            if (zzhakVar.zza()) {
                return zzhakVar;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: ".concat(String.valueOf(str)));
    }
}
