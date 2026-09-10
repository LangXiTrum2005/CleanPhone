package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.internal.ThreadContextKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class DispatchedTaskKt {
    public static final void a(CancellableContinuationImpl cancellableContinuationImpl, Continuation continuation, boolean z2) {
        Object obj = CancellableContinuationImpl.h0.get(cancellableContinuationImpl);
        Throwable thE = cancellableContinuationImpl.e(obj);
        Object objA = thE != null ? ResultKt.a(thE) : cancellableContinuationImpl.g(obj);
        if (!z2) {
            continuation.resumeWith(objA);
            return;
        }
        Intrinsics.d(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        DispatchedContinuation dispatchedContinuation = (DispatchedContinuation) continuation;
        ContinuationImpl continuationImpl = dispatchedContinuation.f0;
        CoroutineContext z3 = continuationImpl.getF45023Y();
        Object objC = ThreadContextKt.c(z3, dispatchedContinuation.h0);
        UndispatchedCoroutine undispatchedCoroutineC = objC != ThreadContextKt.f45048a ? CoroutineContextKt.c(continuationImpl, z3, objC) : null;
        try {
            continuationImpl.resumeWith(objA);
        } finally {
            if (undispatchedCoroutineC == null || undispatchedCoroutineC.t0()) {
                ThreadContextKt.a(z3, objC);
            }
        }
    }
}
