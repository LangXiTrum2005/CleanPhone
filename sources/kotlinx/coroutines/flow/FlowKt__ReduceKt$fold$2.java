package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
public final class FlowKt__ReduceKt$fold$2<T> implements FlowCollector {
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        FlowKt__ReduceKt$fold$2$emit$1 flowKt__ReduceKt$fold$2$emit$1;
        if (continuation instanceof FlowKt__ReduceKt$fold$2$emit$1) {
            flowKt__ReduceKt$fold$2$emit$1 = (FlowKt__ReduceKt$fold$2$emit$1) continuation;
            int i2 = flowKt__ReduceKt$fold$2$emit$1.Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$fold$2$emit$1.Z = i2 - Integer.MIN_VALUE;
            } else {
                flowKt__ReduceKt$fold$2$emit$1 = new FlowKt__ReduceKt$fold$2$emit$1(this, continuation);
            }
        } else {
            flowKt__ReduceKt$fold$2$emit$1 = new FlowKt__ReduceKt$fold$2$emit$1(this, continuation);
        }
        Object obj2 = flowKt__ReduceKt$fold$2$emit$1.X;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = flowKt__ReduceKt$fold$2$emit$1.Z;
        if (i3 == 0) {
            ResultKt.b(obj2);
            throw null;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj2);
        throw null;
    }
}
