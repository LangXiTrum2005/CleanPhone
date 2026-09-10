package androidx.paging;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004*\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", "", "T1", "T2", "R", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 176)
@DebugMetadata(c = "androidx.paging.FlowExtKt$combineWithoutBatching$2$1$1", f = "FlowExt.kt", l = {147}, m = "invokeSuspend")
public final class FlowExtKt$combineWithoutBatching$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Flow f7791Y;
    public final /* synthetic */ AtomicInteger Z;
    public final /* synthetic */ SimpleProducerScope e0;
    public final /* synthetic */ UnbatchedFlowCombiner f0;
    public final /* synthetic */ int g0;

    /* JADX INFO: renamed from: androidx.paging.FlowExtKt$combineWithoutBatching$2$1$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u008a@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "T1", "T2", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 176)
    public final class AnonymousClass1<T> implements FlowCollector {
        public final /* synthetic */ UnbatchedFlowCombiner X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final /* synthetic */ int f7792Y;

        public AnonymousClass1(UnbatchedFlowCombiner unbatchedFlowCombiner, int i2) {
            this.X = unbatchedFlowCombiner;
            this.f7792Y = i2;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
        
            if (kotlinx.coroutines.YieldKt.a(r0) == r1) goto L21;
         */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof androidx.paging.FlowExtKt$combineWithoutBatching$2$1$1$1$emit$1
                if (r0 == 0) goto L13
                r0 = r7
                androidx.paging.FlowExtKt$combineWithoutBatching$2$1$1$1$emit$1 r0 = (androidx.paging.FlowExtKt$combineWithoutBatching$2$1$1$1$emit$1) r0
                int r1 = r0.Z
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.Z = r1
                goto L18
            L13:
                androidx.paging.FlowExtKt$combineWithoutBatching$2$1$1$1$emit$1 r0 = new androidx.paging.FlowExtKt$combineWithoutBatching$2$1$1$1$emit$1
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.X
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.X
                int r2 = r0.Z
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L36
                if (r2 == r4) goto L32
                if (r2 != r3) goto L2a
                kotlin.ResultKt.b(r7)
                goto L4f
            L2a:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L32:
                kotlin.ResultKt.b(r7)
                goto L46
            L36:
                kotlin.ResultKt.b(r7)
                r0.Z = r4
                androidx.paging.UnbatchedFlowCombiner r7 = r5.X
                int r2 = r5.f7792Y
                java.lang.Object r6 = r7.a(r2, r6, r0)
                if (r6 != r1) goto L46
                goto L4e
            L46:
                r0.Z = r3
                java.lang.Object r6 = kotlinx.coroutines.YieldKt.a(r0)
                if (r6 != r1) goto L4f
            L4e:
                return r1
            L4f:
                kotlin.Unit r6 = kotlin.Unit.f43263a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.FlowExtKt$combineWithoutBatching$2$1$1.AnonymousClass1.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowExtKt$combineWithoutBatching$2$1$1(Flow flow, AtomicInteger atomicInteger, SimpleProducerScope simpleProducerScope, UnbatchedFlowCombiner unbatchedFlowCombiner, int i2, Continuation continuation) {
        super(2, continuation);
        this.f7791Y = flow;
        this.Z = atomicInteger;
        this.e0 = simpleProducerScope;
        this.f0 = unbatchedFlowCombiner;
        this.g0 = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        UnbatchedFlowCombiner unbatchedFlowCombiner = this.f0;
        return new FlowExtKt$combineWithoutBatching$2$1$1(this.f7791Y, this.Z, this.e0, unbatchedFlowCombiner, this.g0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((FlowExtKt$combineWithoutBatching$2$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f43263a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i2 = this.X;
        AtomicInteger atomicInteger = this.Z;
        SimpleProducerScope simpleProducerScope = this.e0;
        try {
            if (i2 == 0) {
                ResultKt.b(obj);
                Flow flow = this.f7791Y;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f0, this.g0);
                this.X = 1;
                if (flow.collect(anonymousClass1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            if (atomicInteger.decrementAndGet() == 0) {
                simpleProducerScope.x(null);
            }
            return Unit.f43263a;
        } catch (Throwable th) {
            if (atomicInteger.decrementAndGet() == 0) {
                simpleProducerScope.x(null);
            }
            throw th;
        }
    }
}
