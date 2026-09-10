package kotlinx.coroutines;

import java.util.concurrent.ScheduledFuture;
import kotlin.Metadata;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/DisposableFutureHandle;", "Lkotlinx/coroutines/DisposableHandle;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class DisposableFutureHandle implements DisposableHandle {
    public final ScheduledFuture X;

    public DisposableFutureHandle(ScheduledFuture scheduledFuture) {
        this.X = scheduledFuture;
    }

    @Override // kotlinx.coroutines.DisposableHandle
    public final void dispose() {
        this.X.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.X + AbstractJsonLexerKt.END_LIST;
    }
}
