package com.google.common.util.concurrent;

import com.ironsource.X3;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: MoreExecutors.java */
/* JADX INFO: loaded from: classes3.dex */
public final class rotuma {

    /* JADX INFO: compiled from: MoreExecutors.java */
    public class attabal implements Executor {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final /* synthetic */ AbstractFuture f22043arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ Executor f22044kowloon;

        public attabal(Executor executor, AbstractFuture abstractFuture) {
            this.f22044kowloon = executor;
            this.f22043arytenoidectomy = abstractFuture;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            try {
                this.f22044kowloon.execute(runnable);
            } catch (RejectedExecutionException e) {
                this.f22043arytenoidectomy.oilcan(e);
            }
        }
    }

    /* JADX INFO: compiled from: MoreExecutors.java */
    public static final class dern extends saneness implements ScheduledExecutorService, gintrap {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final ScheduledExecutorService f22045arytenoidectomy;

        /* JADX INFO: compiled from: MoreExecutors.java */
        public static final class attabal<V> extends impassible.attabal<V> implements dovishness<V> {

            /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
            public final ScheduledFuture<?> f22046arytenoidectomy;

            public attabal(adultoid<V> adultoidVar, ScheduledFuture<?> scheduledFuture) {
                super(adultoidVar);
                this.f22046arytenoidectomy = scheduledFuture;
            }

            @Override // com.google.common.util.concurrent.formularize, java.util.concurrent.Future
            public boolean cancel(boolean z) {
                boolean zCancel = super.cancel(z);
                if (zCancel) {
                    this.f22046arytenoidectomy.cancel(z);
                }
                return zCancel;
            }

            @Override // java.lang.Comparable
            /* JADX INFO: renamed from: cutely, reason: merged with bridge method [inline-methods] */
            public int compareTo(Delayed delayed) {
                return this.f22046arytenoidectomy.compareTo(delayed);
            }

            @Override // java.util.concurrent.Delayed
            public long getDelay(TimeUnit timeUnit) {
                return this.f22046arytenoidectomy.getDelay(timeUnit);
            }
        }

        /* JADX INFO: compiled from: MoreExecutors.java */
        public static final class saneness extends AbstractFuture.taiyuan<Void> implements Runnable {

            /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
            public final Runnable f22047adultoid;

            public saneness(Runnable runnable) {
                this.f22047adultoid = (Runnable) com.google.common.base.formularize.triweekly(runnable);
            }

            @Override // com.google.common.util.concurrent.AbstractFuture
            public String cord() {
                return "task=[" + this.f22047adultoid + X3.j.e;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    this.f22047adultoid.run();
                } catch (Throwable th) {
                    oilcan(th);
                    throw th;
                }
            }
        }

        public dern(ScheduledExecutorService scheduledExecutorService) {
            super(scheduledExecutorService);
            this.f22045arytenoidectomy = (ScheduledExecutorService) com.google.common.base.formularize.triweekly(scheduledExecutorService);
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public dovishness<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
            TrustedListenableFutureTask trustedListenableFutureTaskSeminary = TrustedListenableFutureTask.seminary(runnable, null);
            return new attabal(trustedListenableFutureTaskSeminary, this.f22045arytenoidectomy.schedule(trustedListenableFutureTaskSeminary, j, timeUnit));
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        /* JADX INFO: renamed from: cutely, reason: merged with bridge method [inline-methods] */
        public dovishness<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            saneness sanenessVar = new saneness(runnable);
            return new attabal(sanenessVar, this.f22045arytenoidectomy.scheduleWithFixedDelay(sanenessVar, j, j2, timeUnit));
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
        public dovishness<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            saneness sanenessVar = new saneness(runnable);
            return new attabal(sanenessVar, this.f22045arytenoidectomy.scheduleAtFixedRate(sanenessVar, j, j2, timeUnit));
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
        public <V> dovishness<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
            TrustedListenableFutureTask trustedListenableFutureTaskGrimness = TrustedListenableFutureTask.grimness(callable);
            return new attabal(trustedListenableFutureTaskGrimness, this.f22045arytenoidectomy.schedule(trustedListenableFutureTaskGrimness, j, timeUnit));
        }
    }

    /* JADX INFO: compiled from: MoreExecutors.java */
    public static class saneness extends com.google.common.util.concurrent.dern {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final ExecutorService f22048kowloon;

        public saneness(ExecutorService executorService) {
            this.f22048kowloon = (ExecutorService) com.google.common.base.formularize.triweekly(executorService);
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
            return this.f22048kowloon.awaitTermination(j, timeUnit);
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.f22048kowloon.execute(runnable);
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isShutdown() {
            return this.f22048kowloon.isShutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isTerminated() {
            return this.f22048kowloon.isTerminated();
        }

        @Override // java.util.concurrent.ExecutorService
        public final void shutdown() {
            this.f22048kowloon.shutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public final List<Runnable> shutdownNow() {
            return this.f22048kowloon.shutdownNow();
        }

        public final String toString() {
            return super.toString() + X3.j.d + this.f22048kowloon + X3.j.e;
        }
    }

    public static Executor attabal() {
        return DirectExecutor.INSTANCE;
    }

    public static Executor dern(Executor executor, AbstractFuture<?> abstractFuture) {
        com.google.common.base.formularize.triweekly(executor);
        com.google.common.base.formularize.triweekly(abstractFuture);
        return executor == attabal() ? executor : new attabal(executor, abstractFuture);
    }

    public static gintrap saneness(ExecutorService executorService) {
        if (executorService instanceof gintrap) {
            return (gintrap) executorService;
        }
        return executorService instanceof ScheduledExecutorService ? new dern((ScheduledExecutorService) executorService) : new saneness(executorService);
    }
}
