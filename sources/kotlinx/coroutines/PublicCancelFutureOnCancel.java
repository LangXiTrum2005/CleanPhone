package kotlinx.coroutines;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/PublicCancelFutureOnCancel;", "Lkotlinx/coroutines/CancelHandler;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class PublicCancelFutureOnCancel implements CancelHandler {
    @Override // kotlinx.coroutines.CancelHandler
    public final void b(Throwable th) {
        if (th != null) {
            throw null;
        }
    }

    public final String toString() {
        return "CancelFutureOnCancel[null]";
    }
}
