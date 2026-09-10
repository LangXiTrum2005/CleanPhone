package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.internal.DispatchedContinuationKt;
import kotlinx.coroutines.internal.Symbol;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CancellableContinuationKt {
    public static final void a(CancellableContinuationImpl cancellableContinuationImpl, DisposableHandle disposableHandle) {
        cancellableContinuationImpl.t(new DisposeOnCancel(disposableHandle));
    }

    public static final CancellableContinuationImpl b(Continuation continuation) {
        CancellableContinuationImpl cancellableContinuationImpl;
        CancellableContinuationImpl cancellableContinuationImpl2;
        if (!(continuation instanceof DispatchedContinuation)) {
            return new CancellableContinuationImpl(1, continuation);
        }
        DispatchedContinuation dispatchedContinuation = (DispatchedContinuation) continuation;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = DispatchedContinuation.i0;
            Object obj = atomicReferenceFieldUpdater.get(dispatchedContinuation);
            Symbol symbol = DispatchedContinuationKt.f45030b;
            cancellableContinuationImpl = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(dispatchedContinuation, symbol);
                cancellableContinuationImpl2 = null;
                break;
            }
            if (obj instanceof CancellableContinuationImpl) {
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(dispatchedContinuation, obj, symbol)) {
                        cancellableContinuationImpl2 = (CancellableContinuationImpl) obj;
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(dispatchedContinuation) == obj);
            } else if (obj != symbol && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (cancellableContinuationImpl2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = CancellableContinuationImpl.h0;
            Object obj2 = atomicReferenceFieldUpdater2.get(cancellableContinuationImpl2);
            if (!(obj2 instanceof CompletedContinuation) || ((CompletedContinuation) obj2).d == null) {
                CancellableContinuationImpl.g0.set(cancellableContinuationImpl2, 536870911);
                atomicReferenceFieldUpdater2.set(cancellableContinuationImpl2, Active.X);
                cancellableContinuationImpl = cancellableContinuationImpl2;
            } else {
                cancellableContinuationImpl2.m();
            }
            if (cancellableContinuationImpl != null) {
                return cancellableContinuationImpl;
            }
        }
        return new CancellableContinuationImpl(2, continuation);
    }
}
