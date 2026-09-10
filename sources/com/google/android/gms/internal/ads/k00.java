package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.X3;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class k00 extends AbstractExecutorService implements fe1, AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16234a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f16235b;

    public k00(Executor executor) {
        this.f16235b = executor;
    }

    public final ListenableFuture a(Runnable runnable) {
        return (ListenableFuture) super.submit(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j10, TimeUnit timeUnit) {
        switch (this.f16234a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return ((ExecutorService) this.f16235b).awaitTermination(j10, timeUnit);
        }
    }

    public final ListenableFuture b(Callable callable) {
        return (ListenableFuture) super.submit(callable);
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

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f16234a) {
            case 0:
                this.f16235b.execute(runnable);
                break;
            default:
                ((ExecutorService) this.f16235b).execute(runnable);
                break;
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        switch (this.f16234a) {
            case 0:
                return false;
            default:
                return ((ExecutorService) this.f16235b).isShutdown();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        switch (this.f16234a) {
            case 0:
                return false;
            default:
                return ((ExecutorService) this.f16235b).isTerminated();
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new pe1(Executors.callable(runnable, obj));
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        switch (this.f16234a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                ((ExecutorService) this.f16235b).shutdown();
                return;
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        switch (this.f16234a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return ((ExecutorService) this.f16235b).shutdownNow();
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Runnable runnable) {
        return (ListenableFuture) super.submit(runnable);
    }

    public String toString() {
        switch (this.f16234a) {
            case 1:
                ExecutorService executorService = (ExecutorService) this.f16235b;
                String string = super.toString();
                String strValueOf = String.valueOf(executorService);
                return d5.u.h(new StringBuilder(l1.d.r(String.valueOf(string).length(), 1, strValueOf.length(), 1)), string, X3.j.f27834d, strValueOf, X3.j.f27836e);
            default:
                return super.toString();
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Callable callable) {
        return new pe1(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return (ListenableFuture) super.submit(runnable, obj);
    }

    public k00(ExecutorService executorService) {
        executorService.getClass();
        this.f16235b = executorService;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Callable callable) {
        return (ListenableFuture) super.submit(callable);
    }
}
