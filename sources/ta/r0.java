package ta;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class r0 extends oa.q implements ScheduledFuture, ListenableFuture, Future {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f50649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScheduledFuture f50650c;

    public r0(r rVar, ScheduledFuture scheduledFuture) {
        this.f50649b = rVar;
        this.f50650c = scheduledFuture;
    }

    public final boolean A(boolean z10) {
        return this.f50649b.cancel(z10);
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        this.f50649b.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        boolean zA = A(z10);
        if (zA) {
            this.f50650c.cancel(z10);
        }
        return zA;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.f50650c.compareTo(delayed);
    }

    @Override // oa.q
    public final Object f() {
        return this.f50649b;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f50649b.get();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f50650c.getDelay(timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f50649b.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f50649b.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        return this.f50649b.get(j10, timeUnit);
    }
}
