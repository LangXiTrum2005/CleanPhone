package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes4.dex */
public final class zzena {
    private zzemr zza;

    public zzena() {
    }

    public static zzena zza(zzemr zzemrVar) {
        return new zzena(zzemrVar);
    }

    public final zzemr zzb(Clock clock, zzemt zzemtVar, zzejl zzejlVar, zzfpi zzfpiVar) {
        zzemr zzemrVar = this.zza;
        return zzemrVar != null ? zzemrVar : new zzemr(clock, zzemtVar, zzejlVar, zzfpiVar);
    }

    private zzena(zzemr zzemrVar) {
        this.zza = zzemrVar;
    }
}
