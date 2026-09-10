package cosurveillance;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: DelegatingScheduledExecutorService.java */
/* JADX INFO: loaded from: classes3.dex */
public class kowloon implements ScheduledExecutorService, AutoCloseable {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final ScheduledExecutorService f24084arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final ExecutorService f24085kowloon;

    public kowloon(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.f24085kowloon = executorService;
        this.f24084arytenoidectomy = scheduledExecutorService;
    }

    public static /* synthetic */ void cuirassed(Runnable runnable, arytenoidectomy.saneness sanenessVar) {
        try {
            runnable.run();
            sanenessVar.set(null);
        } catch (Exception e) {
            sanenessVar.attabal(e);
        }
    }

    public static /* synthetic */ void cutely(Callable callable, arytenoidectomy.saneness sanenessVar) {
        try {
            sanenessVar.set(callable.call());
        } catch (Exception e) {
            sanenessVar.attabal(e);
        }
    }

    public static /* synthetic */ void dovishness(Runnable runnable, arytenoidectomy.saneness sanenessVar) {
        try {
            runnable.run();
        } catch (Exception e) {
            sanenessVar.attabal(e);
        }
    }

    public static /* synthetic */ void formularize(Runnable runnable, arytenoidectomy.saneness sanenessVar) throws Exception {
        try {
            runnable.run();
        } catch (Exception e) {
            sanenessVar.attabal(e);
            throw e;
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f24085kowloon.awaitTermination(j, timeUnit);
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        demilitarize.impromptu.attabal(this);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f24085kowloon.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection2) throws InterruptedException {
        return this.f24085kowloon.invokeAll(collection2);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection2) throws ExecutionException, InterruptedException {
        return (T) this.f24085kowloon.invokeAny(collection2);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f24085kowloon.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f24085kowloon.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> schedule(final Runnable runnable, final long j, final TimeUnit timeUnit) {
        return new arytenoidectomy(new arytenoidectomy.dern() { // from class: cosurveillance.dern
            @Override // cosurveillance.arytenoidectomy.dern
            public final ScheduledFuture attabal(arytenoidectomy.saneness sanenessVar) {
                kowloon kowloonVar = this.f24071attabal;
                return kowloonVar.f24084arytenoidectomy.schedule(new Runnable() { // from class: cosurveillance.cutely
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f24069kowloon.f24085kowloon.execute(new Runnable() { // from class: cosurveillance.impassible
                            @Override // java.lang.Runnable
                            public final void run() {
                                kowloon.cuirassed(runnable, sanenessVar);
                            }
                        });
                    }
                }, j, timeUnit);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleAtFixedRate(final Runnable runnable, final long j, final long j2, final TimeUnit timeUnit) {
        return new arytenoidectomy(new arytenoidectomy.dern() { // from class: cosurveillance.beachfront
            @Override // cosurveillance.arytenoidectomy.dern
            public final ScheduledFuture attabal(arytenoidectomy.saneness sanenessVar) {
                kowloon kowloonVar = this.f24058attabal;
                return kowloonVar.f24084arytenoidectomy.scheduleAtFixedRate(new Runnable() { // from class: cosurveillance.taiyuan
                    @Override // java.lang.Runnable
                    public final void run() {
                        kowloonVar.f24085kowloon.execute(new Runnable() { // from class: cosurveillance.wireman
                            @Override // java.lang.Runnable
                            public final void run() throws Exception {
                                kowloon.formularize(runnable, sanenessVar);
                            }
                        });
                    }
                }, j, j2, timeUnit);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleWithFixedDelay(final Runnable runnable, final long j, final long j2, final TimeUnit timeUnit) {
        return new arytenoidectomy(new arytenoidectomy.dern() { // from class: cosurveillance.competently
            @Override // cosurveillance.arytenoidectomy.dern
            public final ScheduledFuture attabal(arytenoidectomy.saneness sanenessVar) {
                kowloon kowloonVar = this.f24063attabal;
                return kowloonVar.f24084arytenoidectomy.scheduleWithFixedDelay(new Runnable() { // from class: cosurveillance.formularize
                    @Override // java.lang.Runnable
                    public final void run() {
                        kowloonVar.f24085kowloon.execute(new Runnable() { // from class: cosurveillance.marial
                            @Override // java.lang.Runnable
                            public final void run() {
                                kowloon.dovishness(runnable, sanenessVar);
                            }
                        });
                    }
                }, j, j2, timeUnit);
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
        return this.f24085kowloon.submit(callable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection2, long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f24085kowloon.invokeAll(collection2, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection2, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return (T) this.f24085kowloon.invokeAny(collection2, j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public <V> ScheduledFuture<V> schedule(final Callable<V> callable, final long j, final TimeUnit timeUnit) {
        return new arytenoidectomy(new arytenoidectomy.dern() { // from class: cosurveillance.impromptu
            @Override // cosurveillance.arytenoidectomy.dern
            public final ScheduledFuture attabal(arytenoidectomy.saneness sanenessVar) {
                kowloon kowloonVar = this.f24080attabal;
                return kowloonVar.f24084arytenoidectomy.schedule(new Callable() { // from class: cosurveillance.apical
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.f24052kowloon.f24085kowloon.submit(new Runnable() { // from class: cosurveillance.triweekly
                            @Override // java.lang.Runnable
                            public final void run() {
                                kowloon.cutely(callable, sanenessVar);
                            }
                        });
                    }
                }, j, timeUnit);
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable runnable, T t) {
        return this.f24085kowloon.submit(runnable, t);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        return this.f24085kowloon.submit(runnable);
    }
}
