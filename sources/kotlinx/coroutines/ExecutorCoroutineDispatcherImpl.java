package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/ExecutorCoroutineDispatcherImpl;", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "Lkotlinx/coroutines/Delay;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ExecutorCoroutineDispatcherImpl extends ExecutorCoroutineDispatcher implements Delay {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final Executor f44758Y;

    public ExecutorCoroutineDispatcherImpl(Executor executor) {
        this.f44758Y = executor;
        if (executor instanceof ScheduledThreadPoolExecutor) {
            ((ScheduledThreadPoolExecutor) executor).setRemoveOnCancelPolicy(true);
        }
    }

    @Override // kotlinx.coroutines.Delay
    public final void S(long j, CancellableContinuationImpl cancellableContinuationImpl) {
        Executor executor = this.f44758Y;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(new ResumeUndispatchedRunnable(this, cancellableContinuationImpl), j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e2) {
                CancellationException cancellationExceptionA = ExceptionsKt.a("The task was rejected", e2);
                Job job = (Job) cancellableContinuationImpl.f0.get(Job.Key.X);
                if (job != null) {
                    job.a(cancellationExceptionA);
                }
            }
        }
        if (scheduledFutureSchedule != null) {
            cancellableContinuationImpl.t(new CancelFutureOnCancel(scheduledFutureSchedule));
        } else {
            DefaultExecutor.j0.S(j, cancellableContinuationImpl);
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void U(CoroutineContext coroutineContext, Runnable runnable) {
        try {
            this.f44758Y.execute(runnable);
        } catch (RejectedExecutionException e2) {
            CancellationException cancellationExceptionA = ExceptionsKt.a("The task was rejected", e2);
            Job job = (Job) coroutineContext.get(Job.Key.X);
            if (job != null) {
                job.a(cancellationExceptionA);
            }
            DefaultScheduler defaultScheduler = Dispatchers.f44752a;
            DefaultIoScheduler.f45062Y.U(coroutineContext, runnable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f44758Y;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ExecutorCoroutineDispatcherImpl) && ((ExecutorCoroutineDispatcherImpl) obj).f44758Y == this.f44758Y;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f44758Y);
    }

    @Override // kotlinx.coroutines.Delay
    public final DisposableHandle i(long j, Runnable runnable, CoroutineContext coroutineContext) {
        Executor executor = this.f44758Y;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e2) {
                CancellationException cancellationExceptionA = ExceptionsKt.a("The task was rejected", e2);
                Job job = (Job) coroutineContext.get(Job.Key.X);
                if (job != null) {
                    job.a(cancellationExceptionA);
                }
            }
        }
        return scheduledFutureSchedule != null ? new DisposableFutureHandle(scheduledFutureSchedule) : DefaultExecutor.j0.i(j, runnable, coroutineContext);
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher
    /* JADX INFO: renamed from: j0, reason: from getter */
    public final Executor getF44758Y() {
        return this.f44758Y;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final String toString() {
        return this.f44758Y.toString();
    }
}
