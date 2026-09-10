package com.google.common.util.concurrent;

import com.p004ironsource.d9;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class MoreExecutors {

    /* JADX INFO: renamed from: com.google.common.util.concurrent.MoreExecutors$1, reason: invalid class name */
    class AnonymousClass1 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.MoreExecutors$2, reason: invalid class name */
    class AnonymousClass2 implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.MoreExecutors$3, reason: invalid class name */
    class AnonymousClass3 extends WrappingExecutorService {
        @Override // com.google.common.util.concurrent.WrappingExecutorService
        public final Callable a(Callable callable) {
            throw null;
        }

        @Override // com.google.common.util.concurrent.WrappingExecutorService
        public final void b(Runnable runnable) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.MoreExecutors$4, reason: invalid class name */
    class AnonymousClass4 extends WrappingScheduledExecutorService {
        @Override // com.google.common.util.concurrent.WrappingExecutorService
        public final Callable a(Callable callable) {
            throw null;
        }

        @Override // com.google.common.util.concurrent.WrappingExecutorService
        public final void b(Runnable runnable) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.MoreExecutors$5, reason: invalid class name */
    class AnonymousClass5 implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            try {
                runnable.run();
            } catch (RejectedExecutionException unused) {
                throw null;
            }
        }
    }

    public static class Application {

        /* JADX INFO: renamed from: com.google.common.util.concurrent.MoreExecutors$Application$1, reason: invalid class name */
        class AnonymousClass1 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }
    }

    public static final class DirectExecutorService extends AbstractListeningExecutorService {
        @Override // java.util.concurrent.ExecutorService
        public final boolean awaitTermination(long j, TimeUnit timeUnit) {
            timeUnit.toNanos(j);
            throw null;
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            throw null;
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isShutdown() {
            throw null;
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isTerminated() {
            throw null;
        }

        @Override // java.util.concurrent.ExecutorService
        public final void shutdown() {
            throw null;
        }

        @Override // java.util.concurrent.ExecutorService
        public final List shutdownNow() {
            throw null;
        }
    }

    public static class ListeningDecorator extends AbstractListeningExecutorService {
        public final ExecutorService X;

        public ListeningDecorator(ExecutorService executorService) {
            executorService.getClass();
            this.X = executorService;
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean awaitTermination(long j, TimeUnit timeUnit) {
            return this.X.awaitTermination(j, timeUnit);
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.X.execute(runnable);
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isShutdown() {
            return this.X.isShutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isTerminated() {
            return this.X.isTerminated();
        }

        @Override // java.util.concurrent.ExecutorService
        public final void shutdown() {
            this.X.shutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public final List shutdownNow() {
            return this.X.shutdownNow();
        }

        public final String toString() {
            return super.toString() + d9.i.d + this.X + d9.i.f24752e;
        }
    }

    public static Executor a() {
        return DirectExecutor.X;
    }

    public static ListeningExecutorService b(ExecutorService executorService) {
        if (executorService instanceof ListeningExecutorService) {
            return (ListeningExecutorService) executorService;
        }
        return executorService instanceof ScheduledExecutorService ? new ScheduledListeningDecorator((ScheduledExecutorService) executorService) : new ListeningDecorator(executorService);
    }

    public static final class ScheduledListeningDecorator extends ListeningDecorator implements ListeningScheduledExecutorService {

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final ScheduledExecutorService f20136Y;

        public static final class ListenableScheduledTask<V> extends ForwardingListenableFuture.SimpleForwardingListenableFuture<V> implements ListenableScheduledFuture<V> {

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public final ScheduledFuture f20137Y;

            public ListenableScheduledTask(AbstractFuture abstractFuture, ScheduledFuture scheduledFuture) {
                super(abstractFuture);
                this.f20137Y = scheduledFuture;
            }

            @Override // com.google.common.util.concurrent.ForwardingFuture, java.util.concurrent.Future
            public final boolean cancel(boolean z2) {
                boolean zCancel = super.cancel(z2);
                if (zCancel) {
                    this.f20137Y.cancel(z2);
                }
                return zCancel;
            }

            @Override // java.lang.Comparable
            public final int compareTo(Delayed delayed) {
                return this.f20137Y.compareTo(delayed);
            }

            @Override // java.util.concurrent.Delayed
            public final long getDelay(TimeUnit timeUnit) {
                return this.f20137Y.getDelay(timeUnit);
            }
        }

        public static final class NeverSuccessfulListenableFutureTask extends AbstractFuture.TrustedFuture<Void> implements Runnable {
            public final Runnable i0;

            public NeverSuccessfulListenableFutureTask(Runnable runnable) {
                runnable.getClass();
                this.i0 = runnable;
            }

            @Override // com.google.common.util.concurrent.AbstractFuture
            public final String m() {
                return "task=[" + this.i0 + d9.i.f24752e;
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    this.i0.run();
                } catch (Throwable th) {
                    p(th);
                    throw th;
                }
            }
        }

        public ScheduledListeningDecorator(ScheduledExecutorService scheduledExecutorService) {
            super(scheduledExecutorService);
            this.f20136Y = scheduledExecutorService;
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
            TrustedListenableFutureTask trustedListenableFutureTask = new TrustedListenableFutureTask(callable);
            return new ListenableScheduledTask(trustedListenableFutureTask, this.f20136Y.schedule(trustedListenableFutureTask, j, timeUnit));
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            NeverSuccessfulListenableFutureTask neverSuccessfulListenableFutureTask = new NeverSuccessfulListenableFutureTask(runnable);
            return new ListenableScheduledTask(neverSuccessfulListenableFutureTask, this.f20136Y.scheduleAtFixedRate(neverSuccessfulListenableFutureTask, j, j2, timeUnit));
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            NeverSuccessfulListenableFutureTask neverSuccessfulListenableFutureTask = new NeverSuccessfulListenableFutureTask(runnable);
            return new ListenableScheduledTask(neverSuccessfulListenableFutureTask, this.f20136Y.scheduleWithFixedDelay(neverSuccessfulListenableFutureTask, j, j2, timeUnit));
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
            TrustedListenableFutureTask trustedListenableFutureTask = new TrustedListenableFutureTask(Executors.callable(runnable, null));
            return new ListenableScheduledTask(trustedListenableFutureTask, this.f20136Y.schedule(trustedListenableFutureTask, j, timeUnit));
        }
    }
}
