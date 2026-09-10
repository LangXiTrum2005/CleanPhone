package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1", "Lkotlinx/coroutines/flow/FlowCollector;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1 implements FlowCollector<Object> {
    public final /* synthetic */ SuspendLambda X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f44919Y;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1", f = "Limit.kt", l = {131}, m = "emit")
    public final class AnonymousClass1 extends ContinuationImpl {
        public FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1 X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public /* synthetic */ Object f44920Y;
        public int Z;

        public AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f44920Y = obj;
            this.Z |= Integer.MIN_VALUE;
            return FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1.this.emit(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1(Function3 function3, FlowCollector flowCollector) {
        this.X = (SuspendLambda) function3;
        this.f44919Y = flowCollector;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v2, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function3] */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        AnonymousClass1 anonymousClass1;
        FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1 flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i2 = anonymousClass1.Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.Z = i2 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object objInvoke = anonymousClass1.f44920Y;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = anonymousClass1.Z;
        if (i3 == 0) {
            ResultKt.b(objInvoke);
            anonymousClass1.X = this;
            anonymousClass1.Z = 1;
            objInvoke = this.X.invoke(this.f44919Y, obj, anonymousClass1);
            if (objInvoke == coroutineSingletons) {
                return coroutineSingletons;
            }
            flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1 = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1 = anonymousClass1.X;
            ResultKt.b(objInvoke);
        }
        if (((Boolean) objInvoke).booleanValue()) {
            return Unit.f43263a;
        }
        throw new AbortFlowException(flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1);
    }
}
