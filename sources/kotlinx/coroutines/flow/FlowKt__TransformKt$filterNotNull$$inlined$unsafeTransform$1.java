package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 implements Flow<Object> {
    public final /* synthetic */ MutableStateFlow X;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public final class AnonymousClass2<T> implements FlowCollector {
        public final /* synthetic */ FlowCollector X;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1, reason: invalid class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2", f = "Transform.kt", l = {50}, m = "emit")
        public final class AnonymousClass1 extends ContinuationImpl {
            public /* synthetic */ Object X;

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public int f44952Y;

            public AnonymousClass1(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.X = obj;
                this.f44952Y |= Integer.MIN_VALUE;
                return AnonymousClass2.this.emit(null, this);
            }
        }

        public AnonymousClass2(FlowCollector flowCollector) {
            this.X = flowCollector;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1;
            if (continuation instanceof AnonymousClass1) {
                anonymousClass1 = (AnonymousClass1) continuation;
                int i2 = anonymousClass1.f44952Y;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    anonymousClass1.f44952Y = i2 - Integer.MIN_VALUE;
                } else {
                    anonymousClass1 = new AnonymousClass1(continuation);
                }
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
            Object obj2 = anonymousClass1.X;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            int i3 = anonymousClass1.f44952Y;
            if (i3 == 0) {
                ResultKt.b(obj2);
                if (obj != null) {
                    anonymousClass1.f44952Y = 1;
                    if (this.X.emit(obj, anonymousClass1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
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

    public FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(MutableStateFlow mutableStateFlow) {
        this.X = mutableStateFlow;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        Object objCollect = this.X.collect(new AnonymousClass2(flowCollector), continuation);
        return objCollect == CoroutineSingletons.X ? objCollect : Unit.f43263a;
    }
}
