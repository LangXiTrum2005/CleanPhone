package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.flow.internal.AbstractSharedFlow;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/flow/SharedFlowSlot;", "Lkotlinx/coroutines/flow/internal/AbstractSharedFlowSlot;", "Lkotlinx/coroutines/flow/SharedFlowImpl;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SharedFlowSlot extends AbstractSharedFlowSlot<SharedFlowImpl<?>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f44973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CancellableContinuationImpl f44974b;

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot
    public final boolean a(AbstractSharedFlow abstractSharedFlow) {
        SharedFlowImpl sharedFlowImpl = (SharedFlowImpl) abstractSharedFlow;
        if (this.f44973a >= 0) {
            return false;
        }
        long j = sharedFlowImpl.j0;
        if (j < sharedFlowImpl.k0) {
            sharedFlowImpl.k0 = j;
        }
        this.f44973a = j;
        return true;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot
    public final Continuation[] b(AbstractSharedFlow abstractSharedFlow) {
        long j = this.f44973a;
        this.f44973a = -1L;
        this.f44974b = null;
        return ((SharedFlowImpl) abstractSharedFlow).t(j);
    }
}
