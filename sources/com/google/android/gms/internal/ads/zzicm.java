package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes4.dex */
final class zzicm {
    private static final zzicm zza = new zzicm();
    private final ConcurrentMap zzc = new ConcurrentHashMap();
    private final zzicv zzb = new zzibt();

    private zzicm() {
    }

    public static zzicm zza() {
        return zza;
    }

    public final zzicu zzb(Class cls) {
        zzibe.zza(cls, "messageType");
        ConcurrentMap concurrentMap = this.zzc;
        zzicu zzicuVarZza = (zzicu) concurrentMap.get(cls);
        if (zzicuVarZza == null) {
            zzicuVarZza = this.zzb.zza(cls);
            zzicu zzicuVar = (zzicu) concurrentMap.putIfAbsent(cls, zzicuVarZza);
            if (zzicuVar != null) {
                return zzicuVar;
            }
        }
        return zzicuVarZza;
    }
}
