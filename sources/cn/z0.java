package cn;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class z0 extends y0 implements i0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f6790b;

    public z0(Executor executor) {
        Method method;
        this.f6790b = executor;
        Method method2 = hn.a.f42414a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = hn.a.f42414a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // cn.i0
    public final p0 b(long j10, e2 e2Var, ak.k kVar) {
        Executor executor = this.f6790b;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(e2Var, j10, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e10) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e10);
                d0.i(kVar, cancellationException);
            }
        }
        return scheduledFutureSchedule != null ? new o0(scheduledFutureSchedule) : e0.f6703i.b(j10, e2Var, kVar);
    }

    @Override // cn.i0
    public final void c(long j10, l lVar) {
        Executor executor = this.f6790b;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            ta.i0 i0Var = new ta.i0(1, this, lVar);
            ak.k kVar = lVar.f6734e;
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(i0Var, j10, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e10) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e10);
                d0.i(kVar, cancellationException);
            }
        }
        if (scheduledFutureSchedule != null) {
            lVar.w(new h(scheduledFutureSchedule, 0));
        } else {
            e0.f6703i.c(j10, lVar);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f6790b;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof z0) && ((z0) obj).f6790b == this.f6790b;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f6790b);
    }

    @Override // cn.w
    public final void p(ak.k kVar, Runnable runnable) {
        try {
            this.f6790b.execute(runnable);
        } catch (RejectedExecutionException e10) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e10);
            d0.i(kVar, cancellationException);
            jn.e eVar = n0.f6748a;
            jn.d.f44017b.p(kVar, runnable);
        }
    }

    @Override // cn.y0
    public final Executor t() {
        return this.f6790b;
    }

    @Override // cn.w
    public final String toString() {
        return this.f6790b.toString();
    }
}
