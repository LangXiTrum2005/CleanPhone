package kotlinx.coroutines.future;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.concurrent.CompletionException;
import java.util.function.BiFunction;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0018\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u0002R\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/future/ContinuationHandler;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Ljava/util/function/BiFunction;", "", "", "Lkotlin/coroutines/Continuation;", "cont", "Lkotlin/coroutines/Continuation;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class ContinuationHandler<T> implements BiFunction<T, Throwable, Unit> {
    public volatile Continuation<? super T> cont;

    @Override // java.util.function.BiFunction
    public final Unit apply(Object obj, Throwable th) {
        Throwable cause;
        Throwable th2 = th;
        Continuation<? super T> continuation = this.cont;
        if (continuation != null) {
            if (th2 == null) {
                continuation.resumeWith(obj);
            } else {
                CompletionException completionException = th2 instanceof CompletionException ? (CompletionException) th2 : null;
                if (completionException != null && (cause = completionException.getCause()) != null) {
                    th2 = cause;
                }
                continuation.resumeWith(ResultKt.a(th2));
            }
        }
        return Unit.f43263a;
    }
}
