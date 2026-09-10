package com.ironsource.environment.thread;

import com.ironsource.C0448le;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements ScheduledExecutorService, AutoCloseable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0069a f28593c = new C0069a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference<Thread> f28594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f28595b;

    /* JADX INFO: renamed from: com.ironsource.environment.thread.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class C0069a {
        public /* synthetic */ C0069a(g gVar) {
            this();
        }

        public final a a(final String threadName) {
            n.f(threadName, "threadName");
            final AtomicReference atomicReference = new AtomicReference();
            return new a(atomicReference, new C0448le(1, new ThreadFactory() { // from class: com.ironsource.environment.thread.b
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    return a.C0069a.a(threadName, atomicReference, runnable);
                }
            }), null);
        }

        private C0069a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Thread a(String threadName, AtomicReference ref, Runnable runnable) {
            n.f(threadName, "$threadName");
            n.f(ref, "$ref");
            Thread thread = new Thread(runnable, threadName);
            ref.set(thread);
            return thread;
        }
    }

    public /* synthetic */ a(AtomicReference atomicReference, ScheduledExecutorService scheduledExecutorService, g gVar) {
        this(atomicReference, scheduledExecutorService);
    }

    public final boolean a() {
        return this.f28594a.get() == Thread.currentThread();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j10, TimeUnit timeUnit) {
        return this.f28595b.awaitTermination(j10, timeUnit);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
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
    public void execute(Runnable runnable) {
        this.f28595b.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
        return this.f28595b.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection) {
        return (T) this.f28595b.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f28595b.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f28595b.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
        return this.f28595b.schedule(runnable, j10, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        return this.f28595b.scheduleAtFixedRate(runnable, j10, j11, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        return this.f28595b.scheduleWithFixedDelay(runnable, j10, j11, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.f28595b.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        return this.f28595b.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        return this.f28595b.submit(runnable);
    }

    private a(AtomicReference<Thread> atomicReference, ScheduledExecutorService scheduledExecutorService) {
        this.f28594a = atomicReference;
        this.f28595b = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) {
        return this.f28595b.invokeAll(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) {
        return (T) this.f28595b.invokeAny(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j10, TimeUnit timeUnit) {
        return this.f28595b.schedule(callable, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable runnable, T t10) {
        return this.f28595b.submit(runnable, t10);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
        return this.f28595b.submit(callable);
    }
}
