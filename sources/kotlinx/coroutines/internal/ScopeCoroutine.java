package kotlinx.coroutines.internal;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.CompletionStateKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/internal/ScopeCoroutine;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/AbstractCoroutine;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class ScopeCoroutine<T> extends AbstractCoroutine<T> implements CoroutineStackFrame {
    public final Continuation e0;

    public ScopeCoroutine(Continuation continuation, CoroutineContext coroutineContext) {
        super(coroutineContext, true);
        this.e0 = continuation;
    }

    @Override // kotlinx.coroutines.JobSupport
    public void B(Object obj) {
        DispatchedContinuationKt.a(CompletionStateKt.a(obj), IntrinsicsKt.b(this.e0));
    }

    @Override // kotlinx.coroutines.JobSupport
    public void C(Object obj) {
        this.e0.resumeWith(CompletionStateKt.a(obj));
    }

    @Override // kotlinx.coroutines.JobSupport
    public final boolean a0() {
        return true;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final CoroutineStackFrame getCallerFrame() {
        Continuation continuation = this.e0;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }
}
