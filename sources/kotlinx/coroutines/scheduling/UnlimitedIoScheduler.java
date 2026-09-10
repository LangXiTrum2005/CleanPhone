package kotlinx.coroutines.scheduling;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.internal.LimitedDispatcherKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/scheduling/UnlimitedIoScheduler;", "Lkotlinx/coroutines/CoroutineDispatcher;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class UnlimitedIoScheduler extends CoroutineDispatcher {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final UnlimitedIoScheduler f45070Y = new UnlimitedIoScheduler();

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void U(CoroutineContext coroutineContext, Runnable runnable) {
        DefaultScheduler.Z.f45064Y.h(runnable, true, false);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void Y(CoroutineContext coroutineContext, Runnable runnable) {
        DefaultScheduler.Z.f45064Y.h(runnable, true, true);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final CoroutineDispatcher e0(int i2) {
        LimitedDispatcherKt.a(i2);
        return i2 >= TasksKt.d ? this : super.e0(i2);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final String toString() {
        return "Dispatchers.IO";
    }
}
