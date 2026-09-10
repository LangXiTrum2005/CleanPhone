package kotlinx.coroutines.scheduling;

import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/scheduling/SchedulerCoroutineDispatcher;", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class SchedulerCoroutineDispatcher extends ExecutorCoroutineDispatcher {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public CoroutineScheduler f45064Y;

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void U(CoroutineContext coroutineContext, Runnable runnable) {
        CoroutineScheduler.i(this.f45064Y, runnable, 6);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void Y(CoroutineContext coroutineContext, Runnable runnable) {
        CoroutineScheduler.i(this.f45064Y, runnable, 2);
    }

    public void close() throws InterruptedException {
        this.f45064Y.close();
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher
    public final Executor j0() {
        return this.f45064Y;
    }
}
