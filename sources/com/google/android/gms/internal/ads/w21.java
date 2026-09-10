package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class w21 implements t21 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f21392a = Executors.newSingleThreadScheduledExecutor();

    @Override // com.google.android.gms.internal.ads.t21
    public final void a(Runnable runnable, long j10) {
        this.f21392a.schedule(runnable, j10, TimeUnit.MILLISECONDS);
    }

    @Override // com.google.android.gms.internal.ads.t21
    public final void zzb() {
    }
}
