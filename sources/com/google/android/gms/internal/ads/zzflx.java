package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: classes4.dex */
final class zzflx {
    final Runnable zza;
    final long zzb;
    ScheduledFuture zzc;
    final /* synthetic */ zzfly zzd;

    public zzflx(zzfly zzflyVar, Runnable runnable, long j) {
        Objects.requireNonNull(zzflyVar);
        this.zzd = zzflyVar;
        this.zza = runnable;
        this.zzb = j;
    }
}
