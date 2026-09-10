package kotlinx.coroutines;

import java.util.concurrent.Executor;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0010\b\u0007\u0010\u0002\"\u00020\u00002\u00020\u0000B\u0002\b\u0001¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "Lkotlinx/coroutines/ExperimentalCoroutinesApi;", "CloseableCoroutineDispatcher", "kotlinx-coroutines-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ExecutorsKt {
    public static final Executor a(CoroutineDispatcher coroutineDispatcher) {
        Executor executorJ0;
        ExecutorCoroutineDispatcher executorCoroutineDispatcher = coroutineDispatcher instanceof ExecutorCoroutineDispatcher ? (ExecutorCoroutineDispatcher) coroutineDispatcher : null;
        return (executorCoroutineDispatcher == null || (executorJ0 = executorCoroutineDispatcher.getF44758Y()) == null) ? new DispatcherExecutor(coroutineDispatcher) : executorJ0;
    }

    public static final CoroutineDispatcher b(Executor executor) {
        CoroutineDispatcher coroutineDispatcher;
        DispatcherExecutor dispatcherExecutor = executor instanceof DispatcherExecutor ? (DispatcherExecutor) executor : null;
        return (dispatcherExecutor == null || (coroutineDispatcher = dispatcherExecutor.X) == null) ? new ExecutorCoroutineDispatcherImpl(executor) : coroutineDispatcher;
    }
}
