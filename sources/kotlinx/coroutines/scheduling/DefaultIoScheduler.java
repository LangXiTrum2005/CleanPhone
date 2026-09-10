package kotlinx.coroutines.scheduling;

import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.internal.SystemPropsKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/scheduling/DefaultIoScheduler;", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "Ljava/util/concurrent/Executor;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DefaultIoScheduler extends ExecutorCoroutineDispatcher implements Executor {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final DefaultIoScheduler f45062Y = new DefaultIoScheduler();
    public static final CoroutineDispatcher Z;

    static {
        UnlimitedIoScheduler unlimitedIoScheduler = UnlimitedIoScheduler.f45070Y;
        int iA = SystemPropsKt.a();
        if (64 >= iA) {
            iA = 64;
        }
        Z = unlimitedIoScheduler.e0(SystemPropsKt.d(iA, 12, "kotlinx.coroutines.io.parallelism"));
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void U(CoroutineContext coroutineContext, Runnable runnable) {
        Z.U(coroutineContext, runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void Y(CoroutineContext coroutineContext, Runnable runnable) {
        Z.Y(coroutineContext, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final CoroutineDispatcher e0(int i2) {
        return UnlimitedIoScheduler.f45070Y.e0(1);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        U(EmptyCoroutineContext.X, runnable);
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher
    /* JADX INFO: renamed from: j0 */
    public final Executor getF44758Y() {
        return this;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final String toString() {
        return "Dispatchers.IO";
    }
}
