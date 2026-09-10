package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1", f = "Delay.kt", l = {204}, m = "invokeSuspend")
final class FlowKt__DelayKt$debounceInternal$1$values$1 extends SuspendLambda implements Function2<ProducerScope<? super Object>, Continuation<? super Unit>, Object> {
    public int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public /* synthetic */ Object f44880Y;
    public final /* synthetic */ Flow Z;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final class AnonymousClass1<T> implements FlowCollector {
        public final /* synthetic */ ProducerScope X;

        public AnonymousClass1(ProducerScope producerScope) {
            this.X = producerScope;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, Continuation continuation) {
            FlowKt__DelayKt$debounceInternal$1$values$1$1$emit$1 flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1;
            if (continuation instanceof FlowKt__DelayKt$debounceInternal$1$values$1$1$emit$1) {
                flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1 = (FlowKt__DelayKt$debounceInternal$1$values$1$1$emit$1) continuation;
                int i2 = flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1.Z;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1.Z = i2 - Integer.MIN_VALUE;
                } else {
                    flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1 = new FlowKt__DelayKt$debounceInternal$1$values$1$1$emit$1(this, continuation);
                }
            } else {
                flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1 = new FlowKt__DelayKt$debounceInternal$1$values$1$1$emit$1(this, continuation);
            }
            Object obj2 = flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1.X;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            int i3 = flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1.Z;
            if (i3 == 0) {
                ResultKt.b(obj2);
                if (obj == null) {
                    obj = NullSurrogateKt.f45018a;
                }
                flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1.Z = 1;
                if (this.X.y(obj, flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj2);
            }
            return Unit.f43263a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$debounceInternal$1$values$1(Flow flow, Continuation continuation) {
        super(2, continuation);
        this.Z = flow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FlowKt__DelayKt$debounceInternal$1$values$1 flowKt__DelayKt$debounceInternal$1$values$1 = new FlowKt__DelayKt$debounceInternal$1$values$1(this.Z, continuation);
        flowKt__DelayKt$debounceInternal$1$values$1.f44880Y = obj;
        return flowKt__DelayKt$debounceInternal$1$values$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((FlowKt__DelayKt$debounceInternal$1$values$1) create((ProducerScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f43263a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i2 = this.X;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return Unit.f43263a;
        }
        ResultKt.b(obj);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1((ProducerScope) this.f44880Y);
        this.X = 1;
        ((StateFlowImpl) this.Z).collect(anonymousClass1, this);
        return coroutineSingletons;
    }
}
