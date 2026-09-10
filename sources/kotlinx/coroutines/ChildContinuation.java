package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.internal.DispatchedContinuationKt;
import kotlinx.coroutines.internal.Symbol;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/ChildContinuation;", "Lkotlinx/coroutines/JobNode;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class ChildContinuation extends JobNode {
    public final CancellableContinuationImpl f0;

    public ChildContinuation(CancellableContinuationImpl cancellableContinuationImpl) {
        this.f0 = cancellableContinuationImpl;
    }

    @Override // kotlinx.coroutines.JobNode
    public final boolean k() {
        return true;
    }

    @Override // kotlinx.coroutines.JobNode
    public final void l(Throwable th) {
        JobSupport jobSupportJ = j();
        CancellableContinuationImpl cancellableContinuationImpl = this.f0;
        Throwable thO = cancellableContinuationImpl.o(jobSupportJ);
        if (cancellableContinuationImpl.u()) {
            DispatchedContinuation dispatchedContinuation = (DispatchedContinuation) cancellableContinuationImpl.e0;
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = DispatchedContinuation.i0;
                Object obj = atomicReferenceFieldUpdater.get(dispatchedContinuation);
                Symbol symbol = DispatchedContinuationKt.f45030b;
                if (Intrinsics.a(obj, symbol)) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(dispatchedContinuation, symbol, thO)) {
                        if (atomicReferenceFieldUpdater.get(dispatchedContinuation) != symbol) {
                        }
                    }
                    return;
                } else {
                    if (obj instanceof Throwable) {
                        return;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(dispatchedContinuation, obj, null)) {
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(dispatchedContinuation) == obj);
                }
            }
        }
        cancellableContinuationImpl.f(thO);
        if (cancellableContinuationImpl.u()) {
            return;
        }
        cancellableContinuationImpl.m();
    }
}
