package kotlinx.coroutines;

import kotlin.Metadata;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/DisposeOnCancel;", "Lkotlinx/coroutines/CancelHandler;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class DisposeOnCancel implements CancelHandler {
    public final DisposableHandle X;

    public DisposeOnCancel(DisposableHandle disposableHandle) {
        this.X = disposableHandle;
    }

    @Override // kotlinx.coroutines.CancelHandler
    public final void b(Throwable th) {
        this.X.dispose();
    }

    public final String toString() {
        return "DisposeOnCancel[" + this.X + AbstractJsonLexerKt.END_LIST;
    }
}
