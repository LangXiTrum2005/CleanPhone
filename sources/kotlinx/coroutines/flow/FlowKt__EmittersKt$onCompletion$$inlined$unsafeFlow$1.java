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
import kotlinx.coroutines.flow.internal.SafeCollector;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 implements Flow<Object> {
    public final /* synthetic */ Flow X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ SuspendLambda f44889Y;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1", f = "Emitters.kt", l = {110, 117, 124}, m = "collect")
    public final class AnonymousClass1 extends ContinuationImpl {
        public /* synthetic */ Object X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public int f44890Y;
        public Object e0;
        public FlowCollector f0;

        public AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.X = obj;
            this.f44890Y |= Integer.MIN_VALUE;
            return FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.this.collect(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1(Flow flow, Function3 function3) {
        this.X = flow;
        this.f44889Y = (SuspendLambda) function3;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007b  */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v4, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function3] */
    /* JADX WARN: Type inference failed for: r9v6, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function3] */
    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1;
        ThrowingCollector throwingCollector;
        ?? r2;
        SafeCollector safeCollector;
        Throwable th;
        SafeCollector safeCollector2;
        ?? r9;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i2 = anonymousClass1.f44890Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.f44890Y = i2 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object obj = anonymousClass1.X;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = anonymousClass1.f44890Y;
        if (i3 == 0) {
            ResultKt.b(obj);
            try {
                Flow flow = this.X;
                anonymousClass1.e0 = this;
                anonymousClass1.f0 = flowCollector;
                anonymousClass1.f44890Y = 1;
                if (flow.collect(flowCollector, anonymousClass1) != coroutineSingletons) {
                    flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 = this;
                    safeCollector = new SafeCollector(flowCollector, anonymousClass1.getF45023Y());
                    r9 = flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.f44889Y;
                    anonymousClass1.e0 = safeCollector;
                    anonymousClass1.f0 = null;
                    anonymousClass1.f44890Y = 3;
                    if (r9.invoke(safeCollector, null, anonymousClass1) != coroutineSingletons) {
                        safeCollector2 = safeCollector;
                        safeCollector2.releaseIntercepted();
                        return Unit.f43263a;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 = this;
                throwingCollector = new ThrowingCollector(th);
                r2 = flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.f44889Y;
                anonymousClass1.e0 = th;
                anonymousClass1.f0 = null;
                anonymousClass1.f44890Y = 2;
                if (FlowKt__EmittersKt.a(throwingCollector, r2, th, anonymousClass1) == coroutineSingletons) {
                    throw th;
                }
            }
            return coroutineSingletons;
        }
        if (i3 != 1) {
            if (i3 == 2) {
                Throwable th3 = (Throwable) anonymousClass1.e0;
                ResultKt.b(obj);
                throw th3;
            }
            if (i3 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            safeCollector2 = (SafeCollector) anonymousClass1.e0;
            try {
                ResultKt.b(obj);
                safeCollector2.releaseIntercepted();
                return Unit.f43263a;
            } catch (Throwable th4) {
                th = th4;
                safeCollector2.releaseIntercepted();
                throw th;
            }
        }
        flowCollector = anonymousClass1.f0;
        flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 = (FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1) anonymousClass1.e0;
        try {
            ResultKt.b(obj);
            safeCollector = new SafeCollector(flowCollector, anonymousClass1.getF45023Y());
            try {
                r9 = flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.f44889Y;
                anonymousClass1.e0 = safeCollector;
                anonymousClass1.f0 = null;
                anonymousClass1.f44890Y = 3;
                if (r9.invoke(safeCollector, null, anonymousClass1) != coroutineSingletons) {
                    safeCollector2 = safeCollector;
                    safeCollector2.releaseIntercepted();
                    return Unit.f43263a;
                }
                return coroutineSingletons;
            } catch (Throwable th5) {
                th = th5;
                safeCollector2 = safeCollector;
                safeCollector2.releaseIntercepted();
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
            throwingCollector = new ThrowingCollector(th);
            r2 = flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.f44889Y;
            anonymousClass1.e0 = th;
            anonymousClass1.f0 = null;
            anonymousClass1.f44890Y = 2;
            if (FlowKt__EmittersKt.a(throwingCollector, r2, th, anonymousClass1) == coroutineSingletons) {
                throw th;
            }
        }
    }
}
