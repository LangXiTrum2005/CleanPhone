package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/ResumeUndispatchedRunnable;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class ResumeUndispatchedRunnable implements Runnable {
    public final ExecutorCoroutineDispatcherImpl X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final CancellableContinuationImpl f44767Y;

    public ResumeUndispatchedRunnable(ExecutorCoroutineDispatcherImpl executorCoroutineDispatcherImpl, CancellableContinuationImpl cancellableContinuationImpl) {
        this.X = executorCoroutineDispatcherImpl;
        this.f44767Y = cancellableContinuationImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f44767Y.B(this.X, Unit.f43263a);
    }
}
