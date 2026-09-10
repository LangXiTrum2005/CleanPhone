package kotlinx.coroutines;

import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/DispatcherExecutor;", "Ljava/util/concurrent/Executor;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class DispatcherExecutor implements Executor {
    public final CoroutineDispatcher X;

    public DispatcherExecutor(CoroutineDispatcher coroutineDispatcher) {
        this.X = coroutineDispatcher;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.X;
        CoroutineDispatcher coroutineDispatcher = this.X;
        if (coroutineDispatcher.c0(emptyCoroutineContext)) {
            coroutineDispatcher.U(emptyCoroutineContext, runnable);
        } else {
            runnable.run();
        }
    }

    public final String toString() {
        return this.X.toString();
    }
}
