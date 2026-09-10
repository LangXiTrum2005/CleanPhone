package kotlinx.coroutines.scheduling;

import kotlin.Metadata;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.internal.LimitedDispatcherKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/scheduling/DefaultScheduler;", "Lkotlinx/coroutines/scheduling/SchedulerCoroutineDispatcher;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DefaultScheduler extends SchedulerCoroutineDispatcher {
    public static final DefaultScheduler Z;

    static {
        int i2 = TasksKt.f45068c;
        int i3 = TasksKt.d;
        long j = TasksKt.f45069e;
        String str = TasksKt.f45066a;
        DefaultScheduler defaultScheduler = new DefaultScheduler();
        defaultScheduler.f45064Y = new CoroutineScheduler(i2, i3, str, j);
        Z = defaultScheduler;
    }

    @Override // kotlinx.coroutines.scheduling.SchedulerCoroutineDispatcher, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final CoroutineDispatcher e0(int i2) {
        LimitedDispatcherKt.a(1);
        return 1 >= TasksKt.f45068c ? this : super.e0(1);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final String toString() {
        return "Dispatchers.Default";
    }
}
