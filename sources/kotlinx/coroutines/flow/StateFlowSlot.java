package kotlinx.coroutines.flow;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.internal.AbstractSharedFlow;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowKt;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/flow/StateFlowSlot;", "Lkotlinx/coroutines/flow/internal/AbstractSharedFlowSlot;", "Lkotlinx/coroutines/flow/StateFlowImpl;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class StateFlowSlot extends AbstractSharedFlowSlot<StateFlowImpl<?>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f44988a = new AtomicReference(null);

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot
    public final boolean a(AbstractSharedFlow abstractSharedFlow) {
        AtomicReference atomicReference = this.f44988a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(StateFlowKt.f44986a);
        return true;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot
    public final Continuation[] b(AbstractSharedFlow abstractSharedFlow) {
        this.f44988a.set(null);
        return AbstractSharedFlowKt.f44994a;
    }
}
