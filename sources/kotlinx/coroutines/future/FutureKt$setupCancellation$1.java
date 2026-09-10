package kotlinx.coroutines.future;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.ExceptionsKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class FutureKt$setupCancellation$1 implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Throwable th = (Throwable) obj2;
        if (th == null) {
            throw null;
        }
        if ((th instanceof CancellationException ? (CancellationException) th : null) != null) {
            throw null;
        }
        ExceptionsKt.a("CompletableFuture was completed exceptionally", th);
        throw null;
    }
}
