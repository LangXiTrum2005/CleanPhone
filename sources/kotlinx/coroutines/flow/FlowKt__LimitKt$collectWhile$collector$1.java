package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1", "Lkotlinx/coroutines/flow/FlowCollector;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 176)
public final class FlowKt__LimitKt$collectWhile$collector$1 implements FlowCollector<Object> {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        FlowKt__LimitKt$collectWhile$collector$1$emit$1 flowKt__LimitKt$collectWhile$collector$1$emit$1;
        if (continuation instanceof FlowKt__LimitKt$collectWhile$collector$1$emit$1) {
            flowKt__LimitKt$collectWhile$collector$1$emit$1 = (FlowKt__LimitKt$collectWhile$collector$1$emit$1) continuation;
            int i2 = flowKt__LimitKt$collectWhile$collector$1$emit$1.e0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                flowKt__LimitKt$collectWhile$collector$1$emit$1.e0 = i2 - Integer.MIN_VALUE;
            } else {
                flowKt__LimitKt$collectWhile$collector$1$emit$1 = new FlowKt__LimitKt$collectWhile$collector$1$emit$1(this, continuation);
            }
        } else {
            flowKt__LimitKt$collectWhile$collector$1$emit$1 = new FlowKt__LimitKt$collectWhile$collector$1$emit$1(this, continuation);
        }
        Object obj2 = flowKt__LimitKt$collectWhile$collector$1$emit$1.f44904Y;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = flowKt__LimitKt$collectWhile$collector$1$emit$1.e0;
        if (i3 == 0) {
            ResultKt.b(obj2);
            flowKt__LimitKt$collectWhile$collector$1$emit$1.X = this;
            flowKt__LimitKt$collectWhile$collector$1$emit$1.e0 = 1;
            throw null;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        FlowKt__LimitKt$collectWhile$collector$1 flowKt__LimitKt$collectWhile$collector$1 = flowKt__LimitKt$collectWhile$collector$1$emit$1.X;
        ResultKt.b(obj2);
        if (((Boolean) obj2).booleanValue()) {
            return Unit.f43263a;
        }
        throw new AbortFlowException(flowKt__LimitKt$collectWhile$collector$1);
    }
}
