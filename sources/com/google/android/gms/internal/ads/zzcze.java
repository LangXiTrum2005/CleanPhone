package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcze {
    private final AtomicLong zza;

    public zzcze(zzfic zzficVar) {
        AtomicLong atomicLong = new AtomicLong();
        this.zza = atomicLong;
        atomicLong.set(zzficVar.zza.zza.zzu.get());
    }

    public final long zza() {
        return this.zza.get();
    }

    public final void zzb(long j) {
        this.zza.set(j);
    }
}
