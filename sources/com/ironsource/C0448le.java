package com.ironsource;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.ironsource.le, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0448le extends ScheduledThreadPoolExecutor implements AutoCloseable {
    public C0448le() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void afterExecute(Runnable runnable, Throwable th2) {
        super.afterExecute(runnable, th2);
        if (th2 == null && (runnable instanceof Future) && ((Future) runnable).isDone()) {
            try {
                ((Future) runnable).get();
            } catch (InterruptedException e10) {
                C0474n4.d().a(e10);
                Thread.currentThread().interrupt();
            } catch (CancellationException e11) {
                C0474n4.d().a(e11);
            } catch (ExecutionException e12) {
                C0474n4.d().a(e12);
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        boolean zIsTerminated;
        if (this == ForkJoinPool.commonPool() || (zIsTerminated = isTerminated())) {
            return;
        }
        shutdown();
        boolean z10 = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z10) {
                    shutdownNow();
                    z10 = true;
                }
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public /* synthetic */ C0448le(int i10, ThreadFactory threadFactory, int i11, kotlin.jvm.internal.g gVar) {
        this((i11 & 1) != 0 ? C0466me.f29267a : i10, (i11 & 2) != 0 ? new ThreadFactoryC0337fa() : threadFactory);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0448le(int i10, ThreadFactory threadFactory) {
        super(i10, threadFactory);
        kotlin.jvm.internal.n.f(threadFactory, "threadFactory");
    }
}
