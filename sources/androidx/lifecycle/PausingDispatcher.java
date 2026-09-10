package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/PausingDispatcher;", "Lkotlinx/coroutines/CoroutineDispatcher;", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PausingDispatcher extends CoroutineDispatcher {
    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void U(CoroutineContext context, Runnable block) {
        Intrinsics.f(context, "context");
        Intrinsics.f(block, "block");
        throw null;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final boolean c0(CoroutineContext context) {
        Intrinsics.f(context, "context");
        DefaultScheduler defaultScheduler = Dispatchers.f44752a;
        if (MainDispatcherLoader.f45042a.j0().c0(context)) {
            return true;
        }
        throw null;
    }
}
