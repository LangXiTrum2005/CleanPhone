package kotlinx.coroutines.flow;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 implements Flow<Object> {
    public final /* synthetic */ Flow X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Object f44955Y;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public final class AnonymousClass2<T> implements FlowCollector {
        public final /* synthetic */ FlowCollector X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final /* synthetic */ Object f44956Y;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1, reason: invalid class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2", f = "Transform.kt", l = {50, Sdk.SDKMetric.SDKMetricType.AD_REWARD_USER_VALUE}, m = "emit")
        public final class AnonymousClass1 extends ContinuationImpl {
            public /* synthetic */ Object X;

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public int f44957Y;
            public Object e0;
            public FlowCollector f0;

            public AnonymousClass1(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.X = obj;
                this.f44957Y |= Integer.MIN_VALUE;
                return AnonymousClass2.this.emit(null, this);
            }
        }

        public AnonymousClass2(Function2 function2, FlowCollector flowCollector) {
            this.X = flowCollector;
            this.f44956Y = function2;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
        
            if (r6.emit(r2, r0) == r1) goto L22;
         */
        /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.jvm.functions.Function2] */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1.AnonymousClass2.AnonymousClass1
                if (r0 == 0) goto L13
                r0 = r7
                kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1 r0 = (kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1.AnonymousClass2.AnonymousClass1) r0
                int r1 = r0.f44957Y
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f44957Y = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.X
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.X
                int r2 = r0.f44957Y
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L3a
                if (r2 == r4) goto L32
                if (r2 != r3) goto L2a
                kotlin.ResultKt.b(r7)
                goto L5e
            L2a:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L32:
                kotlinx.coroutines.flow.FlowCollector r6 = r0.f0
                java.lang.Object r2 = r0.e0
                kotlin.ResultKt.b(r7)
                goto L50
            L3a:
                kotlin.ResultKt.b(r7)
                r0.e0 = r6
                kotlinx.coroutines.flow.FlowCollector r7 = r5.X
                r0.f0 = r7
                r0.f44957Y = r4
                java.lang.Object r2 = r5.f44956Y
                java.lang.Object r2 = r2.invoke(r6, r0)
                if (r2 != r1) goto L4e
                goto L5d
            L4e:
                r2 = r6
                r6 = r7
            L50:
                r7 = 0
                r0.e0 = r7
                r0.f0 = r7
                r0.f44957Y = r3
                java.lang.Object r6 = r6.emit(r2, r0)
                if (r6 != r1) goto L5e
            L5d:
                return r1
            L5e:
                kotlin.Unit r6 = kotlin.Unit.f43263a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(Function2 function2, Flow flow) {
        this.X = flow;
        this.f44955Y = function2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.jvm.functions.Function2] */
    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        Object objCollect = this.X.collect(new AnonymousClass2(this.f44955Y, flowCollector), continuation);
        return objCollect == CoroutineSingletons.X ? objCollect : Unit.f43263a;
    }
}
