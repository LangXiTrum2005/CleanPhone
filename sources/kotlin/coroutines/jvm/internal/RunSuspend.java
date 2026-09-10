package kotlin.coroutines.jvm.internal;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkotlin/coroutines/jvm/internal/RunSuspend;", "Lkotlin/coroutines/Continuation;", "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class RunSuspend implements Continuation<Unit> {
    @Override // kotlin.coroutines.Continuation
    /* JADX INFO: renamed from: getContext */
    public final CoroutineContext getF45023Y() {
        return EmptyCoroutineContext.X;
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        synchronized (this) {
            notifyAll();
        }
    }
}
