package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.intrinsics.CancellableKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/LazyStandaloneCoroutine;", "Lkotlinx/coroutines/StandaloneCoroutine;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class LazyStandaloneCoroutine extends StandaloneCoroutine {
    public final Continuation e0;

    /* JADX WARN: Multi-variable type inference failed */
    public LazyStandaloneCoroutine(CoroutineContext coroutineContext, Function2 function2) {
        super(coroutineContext, false);
        this.e0 = ((BaseContinuationImpl) function2).create(this, this);
    }

    @Override // kotlinx.coroutines.JobSupport
    public final void i0() {
        CancellableKt.a(this.e0, this);
    }
}
