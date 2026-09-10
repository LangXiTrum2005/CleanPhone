package kotlinx.coroutines;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.internal.ScopeCoroutine;
import kotlinx.coroutines.internal.ThreadContextKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002R\u0016\u0010\u0004\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/UndispatchedCoroutine;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/internal/ScopeCoroutine;", "", "threadLocalIsSet", "Z", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UndispatchedCoroutine<T> extends ScopeCoroutine<T> {
    public final ThreadLocal f0;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public UndispatchedCoroutine(Continuation continuation, CoroutineContext coroutineContext) {
        UndispatchedMarker undispatchedMarker = UndispatchedMarker.X;
        super(continuation, coroutineContext.get(undispatchedMarker) == null ? coroutineContext.plus(undispatchedMarker) : coroutineContext);
        this.f0 = new ThreadLocal();
        if (continuation.getF45023Y().get(ContinuationInterceptor.Key.X) instanceof CoroutineDispatcher) {
            return;
        }
        Object objC = ThreadContextKt.c(coroutineContext, null);
        ThreadContextKt.a(coroutineContext, objC);
        u0(coroutineContext, objC);
    }

    @Override // kotlinx.coroutines.internal.ScopeCoroutine, kotlinx.coroutines.JobSupport
    public final void C(Object obj) {
        if (this.threadLocalIsSet) {
            Pair pair = (Pair) this.f0.get();
            if (pair != null) {
                ThreadContextKt.a((CoroutineContext) pair.X, pair.f43249Y);
            }
            this.f0.remove();
        }
        Object objA = CompletionStateKt.a(obj);
        Continuation continuation = this.e0;
        CoroutineContext f0 = continuation.getF45023Y();
        Object objC = ThreadContextKt.c(f0, null);
        UndispatchedCoroutine undispatchedCoroutineC = objC != ThreadContextKt.f45048a ? CoroutineContextKt.c(continuation, f0, objC) : null;
        try {
            this.e0.resumeWith(objA);
        } finally {
            if (undispatchedCoroutineC == null || undispatchedCoroutineC.t0()) {
                ThreadContextKt.a(f0, objC);
            }
        }
    }

    public final boolean t0() {
        boolean z2 = this.threadLocalIsSet && this.f0.get() == null;
        this.f0.remove();
        return !z2;
    }

    public final void u0(CoroutineContext coroutineContext, Object obj) {
        this.threadLocalIsSet = true;
        this.f0.set(new Pair(coroutineContext, obj));
    }
}
