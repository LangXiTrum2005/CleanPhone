package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class FlowKt__ErrorsKt$catchImpl$2<T> implements FlowCollector {
    public final /* synthetic */ FlowCollector X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f44900Y;

    public FlowKt__ErrorsKt$catchImpl$2(FlowCollector flowCollector, Ref.ObjectRef objectRef) {
        this.X = flowCollector;
        this.f44900Y = objectRef;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) throws Throwable {
        FlowKt__ErrorsKt$catchImpl$2$emit$1 flowKt__ErrorsKt$catchImpl$2$emit$1;
        FlowKt__ErrorsKt$catchImpl$2<T> flowKt__ErrorsKt$catchImpl$2;
        if (continuation instanceof FlowKt__ErrorsKt$catchImpl$2$emit$1) {
            flowKt__ErrorsKt$catchImpl$2$emit$1 = (FlowKt__ErrorsKt$catchImpl$2$emit$1) continuation;
            int i2 = flowKt__ErrorsKt$catchImpl$2$emit$1.e0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                flowKt__ErrorsKt$catchImpl$2$emit$1.e0 = i2 - Integer.MIN_VALUE;
            } else {
                flowKt__ErrorsKt$catchImpl$2$emit$1 = new FlowKt__ErrorsKt$catchImpl$2$emit$1(this, continuation);
            }
        } else {
            flowKt__ErrorsKt$catchImpl$2$emit$1 = new FlowKt__ErrorsKt$catchImpl$2$emit$1(this, continuation);
        }
        Object obj2 = flowKt__ErrorsKt$catchImpl$2$emit$1.f44901Y;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = flowKt__ErrorsKt$catchImpl$2$emit$1.e0;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            flowKt__ErrorsKt$catchImpl$2 = (FlowKt__ErrorsKt$catchImpl$2) flowKt__ErrorsKt$catchImpl$2$emit$1.X;
            try {
                ResultKt.b(obj2);
                return Unit.f43263a;
            } catch (Throwable th) {
                th = th;
                flowKt__ErrorsKt$catchImpl$2.f44900Y.X = th;
                throw th;
            }
        }
        ResultKt.b(obj2);
        try {
            FlowCollector flowCollector = this.X;
            flowKt__ErrorsKt$catchImpl$2$emit$1.X = this;
            flowKt__ErrorsKt$catchImpl$2$emit$1.e0 = 1;
            if (flowCollector.emit(obj, flowKt__ErrorsKt$catchImpl$2$emit$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return Unit.f43263a;
        } catch (Throwable th2) {
            th = th2;
            flowKt__ErrorsKt$catchImpl$2 = this;
            flowKt__ErrorsKt$catchImpl$2.f44900Y.X = th;
            throw th;
        }
    }
}
