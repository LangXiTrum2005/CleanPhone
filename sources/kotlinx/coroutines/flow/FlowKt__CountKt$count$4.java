package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class FlowKt__CountKt$count$4<T> implements FlowCollector {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        FlowKt__CountKt$count$4$emit$1 flowKt__CountKt$count$4$emit$1;
        if (continuation instanceof FlowKt__CountKt$count$4$emit$1) {
            flowKt__CountKt$count$4$emit$1 = (FlowKt__CountKt$count$4$emit$1) continuation;
            int i2 = flowKt__CountKt$count$4$emit$1.e0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                flowKt__CountKt$count$4$emit$1.e0 = i2 - Integer.MIN_VALUE;
            } else {
                flowKt__CountKt$count$4$emit$1 = new FlowKt__CountKt$count$4$emit$1(this, continuation);
            }
        } else {
            flowKt__CountKt$count$4$emit$1 = new FlowKt__CountKt$count$4$emit$1(this, continuation);
        }
        Object obj2 = flowKt__CountKt$count$4$emit$1.f44876Y;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = flowKt__CountKt$count$4$emit$1.e0;
        if (i3 == 0) {
            ResultKt.b(obj2);
            flowKt__CountKt$count$4$emit$1.X = this;
            flowKt__CountKt$count$4$emit$1.e0 = 1;
            throw null;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        FlowKt__CountKt$count$4 flowKt__CountKt$count$4 = (FlowKt__CountKt$count$4) flowKt__CountKt$count$4$emit$1.X;
        ResultKt.b(obj2);
        if (!((Boolean) obj2).booleanValue()) {
            return Unit.f43263a;
        }
        flowKt__CountKt$count$4.getClass();
        throw null;
    }
}
