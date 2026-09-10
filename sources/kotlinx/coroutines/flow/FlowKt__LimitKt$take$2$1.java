package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class FlowKt__LimitKt$take$2$1<T> implements FlowCollector {
    public final /* synthetic */ Ref.IntRef X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f44912Y;
    public final /* synthetic */ Object Z;

    public FlowKt__LimitKt$take$2$1(Ref.IntRef intRef, FlowCollector flowCollector, Object obj) {
        this.X = intRef;
        this.f44912Y = flowCollector;
        this.Z = obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        FlowKt__LimitKt$take$2$1$emit$1 flowKt__LimitKt$take$2$1$emit$1;
        if (continuation instanceof FlowKt__LimitKt$take$2$1$emit$1) {
            flowKt__LimitKt$take$2$1$emit$1 = (FlowKt__LimitKt$take$2$1$emit$1) continuation;
            int i2 = flowKt__LimitKt$take$2$1$emit$1.Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                flowKt__LimitKt$take$2$1$emit$1.Z = i2 - Integer.MIN_VALUE;
            } else {
                flowKt__LimitKt$take$2$1$emit$1 = new FlowKt__LimitKt$take$2$1$emit$1(this, continuation);
            }
        } else {
            flowKt__LimitKt$take$2$1$emit$1 = new FlowKt__LimitKt$take$2$1$emit$1(this, continuation);
        }
        Object obj2 = flowKt__LimitKt$take$2$1$emit$1.X;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = flowKt__LimitKt$take$2$1$emit$1.Z;
        Unit unit = Unit.f43263a;
        if (i3 != 0) {
            if (i3 == 1) {
                ResultKt.b(obj2);
                return unit;
            }
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj2);
            return unit;
        }
        ResultKt.b(obj2);
        Ref.IntRef intRef = this.X;
        int i4 = intRef.X + 1;
        intRef.X = i4;
        FlowCollector flowCollector = this.f44912Y;
        if (i4 < 1) {
            flowKt__LimitKt$take$2$1$emit$1.Z = 1;
            return flowCollector.emit(obj, flowKt__LimitKt$take$2$1$emit$1) == coroutineSingletons ? coroutineSingletons : unit;
        }
        flowKt__LimitKt$take$2$1$emit$1.Z = 2;
        FlowKt__LimitKt.a(flowCollector, obj, this.Z, flowKt__LimitKt$take$2$1$emit$1);
        return coroutineSingletons;
    }
}
