package kotlinx.coroutines;

import java.util.concurrent.ScheduledFuture;
import kotlin.Metadata;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/CancelFutureOnCancel;", "Lkotlinx/coroutines/CancelHandler;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class CancelFutureOnCancel implements CancelHandler {
    public final ScheduledFuture X;

    public CancelFutureOnCancel(ScheduledFuture scheduledFuture) {
        this.X = scheduledFuture;
    }

    @Override // kotlinx.coroutines.CancelHandler
    public final void b(Throwable th) {
        this.X.cancel(false);
    }

    public final String toString() {
        return "CancelFutureOnCancel[" + this.X + AbstractJsonLexerKt.END_LIST;
    }
}
