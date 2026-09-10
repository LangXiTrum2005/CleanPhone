package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {179}, m = "firstOrNull")
final class FlowKt__ReduceKt$firstOrNull$3<T> extends ContinuationImpl {
    public Ref.ObjectRef X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2 f44935Y;
    public /* synthetic */ Object Z;
    public int e0;

    /* JADX WARN: Code duplicated, block: B:29:0x0064  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FlowKt__ReduceKt$firstOrNull$3<T> flowKt__ReduceKt$firstOrNull$3;
        Ref.ObjectRef objectRef;
        AbortFlowException e2;
        FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2 flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2;
        this.Z = obj;
        this.e0 |= Integer.MIN_VALUE;
        Flow flow = null;
        if (this instanceof FlowKt__ReduceKt$firstOrNull$3) {
            int i2 = this.e0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                this.e0 = i2 - Integer.MIN_VALUE;
                flowKt__ReduceKt$firstOrNull$3 = this;
            } else {
                flowKt__ReduceKt$firstOrNull$3 = new FlowKt__ReduceKt$firstOrNull$3<>(this);
            }
        } else {
            flowKt__ReduceKt$firstOrNull$3 = new FlowKt__ReduceKt$firstOrNull$3<>(this);
        }
        Object obj2 = flowKt__ReduceKt$firstOrNull$3.Z;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = flowKt__ReduceKt$firstOrNull$3.e0;
        if (i3 == 0) {
            ResultKt.b(obj2);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2 flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$3 = new FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2(null, objectRef2);
            try {
                flowKt__ReduceKt$firstOrNull$3.X = objectRef2;
                flowKt__ReduceKt$firstOrNull$3.f44935Y = flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$3;
                flowKt__ReduceKt$firstOrNull$3.e0 = 1;
                if (flow.collect(flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$3, flowKt__ReduceKt$firstOrNull$3) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                objectRef = objectRef2;
            } catch (AbortFlowException e3) {
                objectRef = objectRef2;
                e2 = e3;
                flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2 = flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$3;
                if (e2.X != flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2) {
                    throw e2;
                }
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2 = flowKt__ReduceKt$firstOrNull$3.f44935Y;
            objectRef = flowKt__ReduceKt$firstOrNull$3.X;
            try {
                ResultKt.b(obj2);
            } catch (AbortFlowException e4) {
                e2 = e4;
                if (e2.X != flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2) {
                    throw e2;
                }
            }
        }
        return objectRef.X;
    }
}
