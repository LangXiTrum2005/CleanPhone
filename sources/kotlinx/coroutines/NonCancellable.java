package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.EmptySequence;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/NonCancellable;", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/Job;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NonCancellable extends AbstractCoroutineContextElement implements Job {
    public static final NonCancellable X = new NonCancellable(Job.Key.X);

    @Override // kotlinx.coroutines.Job
    public final void a(CancellationException cancellationException) {
    }

    @Override // kotlinx.coroutines.Job
    public final boolean h() {
        throw null;
    }

    @Override // kotlinx.coroutines.Job
    public final boolean isActive() {
        return true;
    }

    @Override // kotlinx.coroutines.Job
    public final boolean isCancelled() {
        return false;
    }

    @Override // kotlinx.coroutines.Job
    public final Sequence m() {
        return EmptySequence.f44657a;
    }

    @Override // kotlinx.coroutines.Job
    public final Object n(ContinuationImpl continuationImpl) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // kotlinx.coroutines.Job
    public final DisposableHandle o(boolean z2, boolean z3, Function1 function1) {
        return NonDisposableHandle.X;
    }

    @Override // kotlinx.coroutines.Job
    public final CancellationException p() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // kotlinx.coroutines.Job
    public final ChildHandle q(JobSupport jobSupport) {
        return NonDisposableHandle.X;
    }

    @Override // kotlinx.coroutines.Job
    public final DisposableHandle s(Function1 function1) {
        return NonDisposableHandle.X;
    }

    @Override // kotlinx.coroutines.Job
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }
}
