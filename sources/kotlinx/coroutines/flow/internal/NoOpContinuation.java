package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÂ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/flow/internal/NoOpContinuation;", "Lkotlin/coroutines/Continuation;", "", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class NoOpContinuation implements Continuation<Object> {
    public static final NoOpContinuation X = new NoOpContinuation();

    @Override // kotlin.coroutines.Continuation
    /* JADX INFO: renamed from: getContext */
    public final CoroutineContext getF45023Y() {
        return EmptyCoroutineContext.X;
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
    }
}
