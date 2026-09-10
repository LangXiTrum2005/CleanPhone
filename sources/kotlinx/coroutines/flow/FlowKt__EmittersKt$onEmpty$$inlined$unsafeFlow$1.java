package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.internal.SafeCollector;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1 implements Flow<Object> {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1", f = "Emitters.kt", l = {110, 118}, m = "collect")
    public final class AnonymousClass1 extends ContinuationImpl {
        public /* synthetic */ Object X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public int f44891Y;
        public Object e0;
        public FlowCollector f0;
        public Ref.BooleanRef g0;

        public AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.X = obj;
            this.f44891Y |= Integer.MIN_VALUE;
            FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1.this.collect(null, this);
            return Unit.f43263a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        Throwable th;
        SafeCollector safeCollector;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i2 = anonymousClass1.f44891Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.f44891Y = i2 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object obj = anonymousClass1.X;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = anonymousClass1.f44891Y;
        if (i3 == 0) {
            ResultKt.b(obj);
            Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            booleanRef.X = true;
            anonymousClass1.e0 = this;
            anonymousClass1.f0 = flowCollector;
            anonymousClass1.g0 = booleanRef;
            anonymousClass1.f44891Y = 1;
            throw null;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            safeCollector = (SafeCollector) anonymousClass1.e0;
            try {
                ResultKt.b(obj);
                safeCollector.releaseIntercepted();
                return Unit.f43263a;
            } catch (Throwable th2) {
                th = th2;
                safeCollector.releaseIntercepted();
                throw th;
            }
        }
        Ref.BooleanRef booleanRef2 = anonymousClass1.g0;
        FlowCollector flowCollector2 = anonymousClass1.f0;
        FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1 flowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1 = (FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1) anonymousClass1.e0;
        ResultKt.b(obj);
        if (booleanRef2.X) {
            SafeCollector safeCollector2 = new SafeCollector(flowCollector2, anonymousClass1.getF45023Y());
            try {
                flowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1.getClass();
                anonymousClass1.e0 = safeCollector2;
                anonymousClass1.f0 = null;
                anonymousClass1.g0 = null;
                anonymousClass1.f44891Y = 2;
                throw null;
            } catch (Throwable th3) {
                th = th3;
                safeCollector = safeCollector2;
                safeCollector.releaseIntercepted();
                throw th;
            }
        }
        return Unit.f43263a;
    }
}
