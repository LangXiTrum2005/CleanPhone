package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-core"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
final /* synthetic */ class FlowKt__LimitKt {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final void a(FlowCollector flowCollector, Object obj, Object obj2, ContinuationImpl continuationImpl) {
        FlowKt__LimitKt$emitAbort$1 flowKt__LimitKt$emitAbort$1;
        if (continuationImpl instanceof FlowKt__LimitKt$emitAbort$1) {
            flowKt__LimitKt$emitAbort$1 = (FlowKt__LimitKt$emitAbort$1) continuationImpl;
            int i2 = flowKt__LimitKt$emitAbort$1.Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                flowKt__LimitKt$emitAbort$1.Z = i2 - Integer.MIN_VALUE;
            } else {
                flowKt__LimitKt$emitAbort$1 = new FlowKt__LimitKt$emitAbort$1(continuationImpl);
            }
        } else {
            flowKt__LimitKt$emitAbort$1 = new FlowKt__LimitKt$emitAbort$1(continuationImpl);
        }
        Object obj3 = flowKt__LimitKt$emitAbort$1.f44910Y;
        Object obj4 = CoroutineSingletons.X;
        int i3 = flowKt__LimitKt$emitAbort$1.Z;
        if (i3 == 0) {
            ResultKt.b(obj3);
            flowKt__LimitKt$emitAbort$1.X = obj2;
            flowKt__LimitKt$emitAbort$1.Z = 1;
            if (flowCollector.emit(obj, flowKt__LimitKt$emitAbort$1) == obj4) {
                return;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj2 = flowKt__LimitKt$emitAbort$1.X;
            ResultKt.b(obj3);
        }
        throw new AbortFlowException(obj2);
    }
}
