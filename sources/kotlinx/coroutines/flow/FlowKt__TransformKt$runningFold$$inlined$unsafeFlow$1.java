package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1 implements Flow<Object> {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1", f = "Transform.kt", l = {110, 111}, m = "collect")
    public final class AnonymousClass1 extends ContinuationImpl {
        public /* synthetic */ Object X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public int f44958Y;
        public FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1 e0;
        public FlowCollector f0;

        public AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.X = obj;
            this.f44958Y |= Integer.MIN_VALUE;
            return FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1.this.collect(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        AnonymousClass1 anonymousClass1;
        FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1 flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i2 = anonymousClass1.f44958Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.f44958Y = i2 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object obj = anonymousClass1.X;
        Object obj2 = CoroutineSingletons.X;
        int i3 = anonymousClass1.f44958Y;
        if (i3 == 0) {
            ResultKt.b(obj);
            anonymousClass1.e0 = this;
            anonymousClass1.f0 = flowCollector;
            anonymousClass1.f44958Y = 1;
            if (flowCollector.emit(null, anonymousClass1) == obj2) {
                return obj2;
            }
            flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1 = this;
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                return Unit.f43263a;
            }
            flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1 = anonymousClass1.e0;
            ResultKt.b(obj);
        }
        flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1.getClass();
        anonymousClass1.e0 = null;
        anonymousClass1.f0 = null;
        anonymousClass1.f44958Y = 2;
        throw null;
    }
}
