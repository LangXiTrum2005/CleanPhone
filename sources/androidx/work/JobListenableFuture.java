package androidx.work;

import androidx.work.impl.utils.futures.SettableFuture;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.JobImpl;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/work/JobListenableFuture;", "R", "Lcom/google/common/util/concurrent/ListenableFuture;", "work-runtime-ktx_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class JobListenableFuture<R> implements ListenableFuture<R> {
    public final SettableFuture X = new SettableFuture();

    public JobListenableFuture(JobImpl jobImpl) {
        jobImpl.s(new Function1<Throwable, Unit>() { // from class: androidx.work.JobListenableFuture.1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Throwable th = (Throwable) obj;
                JobListenableFuture jobListenableFuture = JobListenableFuture.this;
                if (th == null) {
                    if (!jobListenableFuture.X.isDone()) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                } else if (th instanceof CancellationException) {
                    jobListenableFuture.X.cancel(true);
                } else {
                    SettableFuture settableFuture = jobListenableFuture.X;
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        th = cause;
                    }
                    settableFuture.j(th);
                }
                return Unit.f43263a;
            }
        });
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        this.X.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z2) {
        return this.X.cancel(z2);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.X.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.X.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.X.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.X.get(j, timeUnit);
    }
}
