package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.Waiter;
import kotlinx.coroutines.internal.Segment;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/channels/ReceiveCatching;", "E", "Lkotlinx/coroutines/Waiter;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class ReceiveCatching<E> implements Waiter {
    public final CancellableContinuationImpl X;

    public ReceiveCatching(CancellableContinuationImpl cancellableContinuationImpl) {
        this.X = cancellableContinuationImpl;
    }

    @Override // kotlinx.coroutines.Waiter
    public final void a(Segment segment, int i2) {
        this.X.a(segment, i2);
    }
}
