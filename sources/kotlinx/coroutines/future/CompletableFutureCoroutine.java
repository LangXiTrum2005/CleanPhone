package kotlinx.coroutines.future;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.function.BiFunction;
import kotlin.Metadata;
import kotlin.Unit;
import kotlinx.coroutines.AbstractCoroutine;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u0018\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/future/CompletableFutureCoroutine;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/AbstractCoroutine;", "Ljava/util/function/BiFunction;", "", "", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class CompletableFutureCoroutine<T> extends AbstractCoroutine<T> implements BiFunction<T, Throwable, Unit> {
    @Override // java.util.function.BiFunction
    public final Unit apply(Object obj, Throwable th) {
        a(null);
        return Unit.f43263a;
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    public final void q0(boolean z2, Throwable th) {
        throw null;
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    public final void r0(Object obj) {
        throw null;
    }
}
