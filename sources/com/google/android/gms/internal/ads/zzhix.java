package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhix {
    private static final zzhix zzb = new zzhix();
    private final Map zza = new HashMap();

    public static zzhix zza() {
        return zzb;
    }

    public final synchronized void zzb(zzhiw zzhiwVar, Class cls) throws GeneralSecurityException {
        try {
            Map map = this.zza;
            zzhiw zzhiwVar2 = (zzhiw) map.get(cls);
            if (zzhiwVar2 != null && !zzhiwVar2.equals(zzhiwVar)) {
                throw new GeneralSecurityException("Different key creator for parameters class already inserted");
            }
            map.put(cls, zzhiwVar);
        } catch (Throwable th) {
            throw th;
        }
    }
}
