package kotlinx.coroutines.flow.internal;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/flow/internal/StackFrameContinuation;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/coroutines/Continuation;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class StackFrameContinuation<T> implements Continuation<T>, CoroutineStackFrame {
    public final Continuation X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final CoroutineContext f45023Y;

    public StackFrameContinuation(Continuation continuation, CoroutineContext coroutineContext) {
        this.X = continuation;
        this.f45023Y = coroutineContext;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final CoroutineStackFrame getCallerFrame() {
        Continuation continuation = this.X;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    /* JADX INFO: renamed from: getContext, reason: from getter */
    public final CoroutineContext getF45023Y() {
        return this.f45023Y;
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        this.X.resumeWith(obj);
    }
}
