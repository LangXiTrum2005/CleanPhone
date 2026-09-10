package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/Unconfined;", "Lkotlinx/coroutines/CoroutineDispatcher;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Unconfined extends CoroutineDispatcher {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final /* synthetic */ int f44770Y = 0;

    static {
        new Unconfined();
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void U(CoroutineContext coroutineContext, Runnable runnable) {
        YieldContext yieldContext = (YieldContext) coroutineContext.get(YieldContext.f44771Y);
        if (yieldContext == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        yieldContext.X = true;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final CoroutineDispatcher e0(int i2) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
