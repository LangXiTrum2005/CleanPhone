package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ke1 extends k00 implements ge1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f16420c;

    public ke1(ScheduledExecutorService scheduledExecutorService) {
        super((ExecutorService) scheduledExecutorService);
        this.f16420c = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
        pe1 pe1Var = new pe1(Executors.callable(runnable, null));
        return new ie1(pe1Var, this.f16420c.schedule(pe1Var, j10, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        je1 je1Var = new je1(runnable);
        return new ie1(je1Var, this.f16420c.scheduleAtFixedRate(je1Var, j10, j11, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        je1 je1Var = new je1(runnable);
        return new ie1(je1Var, this.f16420c.scheduleWithFixedDelay(je1Var, j10, j11, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j10, TimeUnit timeUnit) {
        pe1 pe1Var = new pe1(callable);
        return new ie1(pe1Var, this.f16420c.schedule(pe1Var, j10, timeUnit));
    }
}
