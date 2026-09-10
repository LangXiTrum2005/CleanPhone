package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class FlowKt__LimitKt$dropWhile$1$1<T> implements FlowCollector {
    public final /* synthetic */ Ref.BooleanRef X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f44908Y;
    public final /* synthetic */ SuspendLambda Z;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__LimitKt$dropWhile$1$1(Ref.BooleanRef booleanRef, FlowCollector flowCollector, Function2 function2) {
        this.X = booleanRef;
        this.f44908Y = flowCollector;
        this.Z = (SuspendLambda) function2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r9v4, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        FlowKt__LimitKt$dropWhile$1$1$emit$1 flowKt__LimitKt$dropWhile$1$1$emit$1;
        FlowKt__LimitKt$dropWhile$1$1<T> flowKt__LimitKt$dropWhile$1$1;
        if (continuation instanceof FlowKt__LimitKt$dropWhile$1$1$emit$1) {
            flowKt__LimitKt$dropWhile$1$1$emit$1 = (FlowKt__LimitKt$dropWhile$1$1$emit$1) continuation;
            int i2 = flowKt__LimitKt$dropWhile$1$1$emit$1.f0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                flowKt__LimitKt$dropWhile$1$1$emit$1.f0 = i2 - Integer.MIN_VALUE;
            } else {
                flowKt__LimitKt$dropWhile$1$1$emit$1 = new FlowKt__LimitKt$dropWhile$1$1$emit$1(this, continuation);
            }
        } else {
            flowKt__LimitKt$dropWhile$1$1$emit$1 = new FlowKt__LimitKt$dropWhile$1$1$emit$1(this, continuation);
        }
        Object objInvoke = flowKt__LimitKt$dropWhile$1$1$emit$1.Z;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = flowKt__LimitKt$dropWhile$1$1$emit$1.f0;
        Unit unit = Unit.f43263a;
        if (i3 == 0) {
            ResultKt.b(objInvoke);
            if (this.X.X) {
                flowKt__LimitKt$dropWhile$1$1$emit$1.f0 = 1;
                if (this.f44908Y.emit(obj, flowKt__LimitKt$dropWhile$1$1$emit$1) != coroutineSingletons) {
                    return unit;
                }
            } else {
                flowKt__LimitKt$dropWhile$1$1$emit$1.X = this;
                flowKt__LimitKt$dropWhile$1$1$emit$1.f44909Y = obj;
                flowKt__LimitKt$dropWhile$1$1$emit$1.f0 = 2;
                objInvoke = this.Z.invoke(obj, flowKt__LimitKt$dropWhile$1$1$emit$1);
                if (objInvoke != coroutineSingletons) {
                    flowKt__LimitKt$dropWhile$1$1 = this;
                }
            }
            return coroutineSingletons;
        }
        if (i3 == 1) {
            ResultKt.b(objInvoke);
            return unit;
        }
        if (i3 != 2) {
            if (i3 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objInvoke);
            return unit;
        }
        obj = flowKt__LimitKt$dropWhile$1$1$emit$1.f44909Y;
        flowKt__LimitKt$dropWhile$1$1 = (FlowKt__LimitKt$dropWhile$1$1) flowKt__LimitKt$dropWhile$1$1$emit$1.X;
        ResultKt.b(objInvoke);
        if (!((Boolean) objInvoke).booleanValue()) {
            flowKt__LimitKt$dropWhile$1$1.X.X = true;
            flowKt__LimitKt$dropWhile$1$1$emit$1.X = null;
            flowKt__LimitKt$dropWhile$1$1$emit$1.f44909Y = null;
            flowKt__LimitKt$dropWhile$1$1$emit$1.f0 = 3;
            if (flowKt__LimitKt$dropWhile$1$1.f44908Y.emit(obj, flowKt__LimitKt$dropWhile$1$1$emit$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return unit;
    }
}
