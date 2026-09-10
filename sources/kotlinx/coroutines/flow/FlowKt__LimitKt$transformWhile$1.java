package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "R", "Lkotlinx/coroutines/flow/FlowCollector;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1", f = "Limit.kt", l = {149}, m = "invokeSuspend")
final class FlowKt__LimitKt$transformWhile$1 extends SuspendLambda implements Function2<FlowCollector<Object>, Continuation<? super Unit>, Object> {
    public int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public /* synthetic */ Object f44918Y;
    public final /* synthetic */ Flow Z;
    public final /* synthetic */ SuspendLambda e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__LimitKt$transformWhile$1(Flow flow, Function3 function3, Continuation continuation) {
        super(2, continuation);
        this.Z = flow;
        this.e0 = (SuspendLambda) function3;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function3] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FlowKt__LimitKt$transformWhile$1 flowKt__LimitKt$transformWhile$1 = new FlowKt__LimitKt$transformWhile$1(this.Z, this.e0, continuation);
        flowKt__LimitKt$transformWhile$1.f44918Y = obj;
        return flowKt__LimitKt$transformWhile$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((FlowKt__LimitKt$transformWhile$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f43263a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x003f  */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function3] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1 flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i2 = this.X;
        if (i2 == 0) {
            ResultKt.b(obj);
            FlowCollector flowCollector = (FlowCollector) this.f44918Y;
            Flow flow = this.Z;
            FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1 flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$2 = new FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1(this.e0, flowCollector);
            try {
                this.f44918Y = flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$2;
                this.X = 1;
                if (flow.collect(flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } catch (AbortFlowException e2) {
                e = e2;
                flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1 = flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$2;
                if (e.X != flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1) {
                    throw e;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1 = (FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1) this.f44918Y;
            try {
                ResultKt.b(obj);
            } catch (AbortFlowException e3) {
                e = e3;
                if (e.X != flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1) {
                    throw e;
                }
            }
        }
        return Unit.f43263a;
    }
}
