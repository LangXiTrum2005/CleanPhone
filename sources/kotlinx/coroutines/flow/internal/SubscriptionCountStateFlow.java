package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/flow/internal/SubscriptionCountStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "", "Lkotlinx/coroutines/flow/SharedFlowImpl;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class SubscriptionCountStateFlow extends SharedFlowImpl<Integer> implements StateFlow<Integer> {
    @Override // kotlinx.coroutines.flow.StateFlow
    public final Object getValue() {
        Integer numValueOf;
        synchronized (this) {
            Object[] objArr = this.i0;
            Intrinsics.c(objArr);
            numValueOf = Integer.valueOf(((Number) objArr[((int) ((this.j0 + ((long) ((int) ((n() + ((long) this.l0)) - this.j0)))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return numValueOf;
    }

    public final void u(int i2) {
        synchronized (this) {
            Object[] objArr = this.i0;
            Intrinsics.c(objArr);
            a(Integer.valueOf(((Number) objArr[((int) ((this.j0 + ((long) ((int) ((n() + ((long) this.l0)) - this.j0)))) - 1)) & (objArr.length - 1)]).intValue() + i2));
        }
    }
}
