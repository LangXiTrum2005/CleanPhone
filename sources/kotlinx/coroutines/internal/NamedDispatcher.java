package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Delay;
import kotlinx.coroutines.DisposableHandle;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0097A¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/internal/NamedDispatcher;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlinx/coroutines/Delay;", "", "time", "", "delay", "(J)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NamedDispatcher extends CoroutineDispatcher implements Delay {
    @Override // kotlinx.coroutines.Delay
    public final void S(long j, CancellableContinuationImpl cancellableContinuationImpl) {
        throw null;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void U(CoroutineContext coroutineContext, Runnable runnable) {
        throw null;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void Y(CoroutineContext coroutineContext, Runnable runnable) {
        throw null;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final boolean c0(CoroutineContext coroutineContext) {
        throw null;
    }

    @Override // kotlinx.coroutines.Delay
    public final DisposableHandle i(long j, Runnable runnable, CoroutineContext coroutineContext) {
        throw null;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final String toString() {
        return null;
    }
}
