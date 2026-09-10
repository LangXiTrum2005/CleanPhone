package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/CancelHandler;", "Lkotlinx/coroutines/NotCompleted;", "UserSupplied", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface CancelHandler extends NotCompleted {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/CancelHandler$UserSupplied;", "Lkotlinx/coroutines/CancelHandler;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class UserSupplied implements CancelHandler {
        public final Function1 X;

        public UserSupplied(Function1 function1) {
            this.X = function1;
        }

        @Override // kotlinx.coroutines.CancelHandler
        public final void b(Throwable th) {
            this.X.invoke(th);
        }

        public final String toString() {
            return "CancelHandler.UserSupplied[" + this.X.getClass().getSimpleName() + '@' + DebugStringsKt.a(this) + AbstractJsonLexerKt.END_LIST;
        }
    }

    void b(Throwable th);
}
