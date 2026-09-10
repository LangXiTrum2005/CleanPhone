package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1 implements Flow<Object> {
    public final /* synthetic */ Flow X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ SuspendLambda f44914Y;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1", f = "Limit.kt", l = {120}, m = "collect")
    public final class AnonymousClass1 extends ContinuationImpl {
        public /* synthetic */ Object X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public int f44915Y;
        public FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1 e0;

        public AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.X = obj;
            this.f44915Y |= Integer.MIN_VALUE;
            return FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1.this.collect(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1(Function2 function2, Flow flow) {
        this.X = flow;
        this.f44914Y = (SuspendLambda) function2;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0053  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        AnonymousClass1 anonymousClass1;
        FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1 flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i2 = anonymousClass1.f44915Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.f44915Y = i2 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object obj = anonymousClass1.X;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = anonymousClass1.f44915Y;
        if (i3 == 0) {
            ResultKt.b(obj);
            Flow flow = this.X;
            FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1 flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$2 = new FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1(this.f44914Y, flowCollector);
            try {
                anonymousClass1.e0 = flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$2;
                anonymousClass1.f44915Y = 1;
                if (flow.collect(flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$2, anonymousClass1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } catch (AbortFlowException e2) {
                e = e2;
                flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1 = flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$2;
                if (e.X != flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1) {
                    throw e;
                }
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1 = anonymousClass1.e0;
            try {
                ResultKt.b(obj);
            } catch (AbortFlowException e3) {
                e = e3;
                if (e.X != flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1) {
                    throw e;
                }
            }
        }
        return Unit.f43263a;
    }
}
