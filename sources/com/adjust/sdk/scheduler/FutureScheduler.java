package com.adjust.sdk.scheduler;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public interface FutureScheduler {
    ScheduledFuture<?> scheduleFuture(Runnable runnable, long j10);

    ScheduledFuture<?> scheduleFutureWithFixedDelay(Runnable runnable, long j10, long j11);

    <V> ScheduledFuture<V> scheduleFutureWithReturn(Callable<V> callable, long j10);

    void teardown();
}
