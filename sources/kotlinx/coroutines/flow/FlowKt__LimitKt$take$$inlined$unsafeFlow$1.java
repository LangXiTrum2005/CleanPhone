package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FlowKt__LimitKt$take$$inlined$unsafeFlow$1 implements Flow<Object> {
    public final /* synthetic */ Flow X;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1", f = "Limit.kt", l = {112}, m = "collect")
    public final class AnonymousClass1 extends ContinuationImpl {
        public /* synthetic */ Object X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public int f44911Y;
        public Object e0;

        public AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.X = obj;
            this.f44911Y |= Integer.MIN_VALUE;
            return FlowKt__LimitKt$take$$inlined$unsafeFlow$1.this.collect(null, this);
        }
    }

    public FlowKt__LimitKt$take$$inlined$unsafeFlow$1(Flow flow) {
        this.X = flow;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0063  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        AnonymousClass1 anonymousClass1;
        AbortFlowException e2;
        Object obj;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i2 = anonymousClass1.f44911Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.f44911Y = i2 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object obj2 = anonymousClass1.X;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = anonymousClass1.f44911Y;
        if (i3 == 0) {
            ResultKt.b(obj2);
            Object obj3 = new Object();
            Ref.IntRef intRef = new Ref.IntRef();
            try {
                Flow flow = this.X;
                FlowKt__LimitKt$take$2$1 flowKt__LimitKt$take$2$1 = new FlowKt__LimitKt$take$2$1(intRef, flowCollector, obj3);
                anonymousClass1.e0 = obj3;
                anonymousClass1.f44911Y = 1;
                if (((ReadonlySharedFlow) flow).X.collect(flowKt__LimitKt$take$2$1, anonymousClass1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } catch (AbortFlowException e3) {
                e2 = e3;
                obj = obj3;
                if (e2.X != obj) {
                    throw e2;
                }
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = anonymousClass1.e0;
            try {
                ResultKt.b(obj2);
            } catch (AbortFlowException e4) {
                e2 = e4;
                if (e2.X != obj) {
                    throw e2;
                }
            }
        }
        return Unit.f43263a;
    }
}
