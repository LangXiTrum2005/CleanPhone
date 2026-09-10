package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 176)
public final class FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1 implements Flow<Object> {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
    public final class AnonymousClass1 extends ContinuationImpl {
        public /* synthetic */ Object X;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.X = obj;
            throw null;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1$2, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
    public final class AnonymousClass2<T> implements FlowCollector {

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1$2$1, reason: invalid class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1$2", f = "Transform.kt", l = {50, 50}, m = "emit")
        public final class AnonymousClass1 extends ContinuationImpl {
            public /* synthetic */ Object X;

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public int f44951Y;
            public Object e0;

            public AnonymousClass1(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.X = obj;
                this.f44951Y |= Integer.MIN_VALUE;
                AnonymousClass2.this.emit(null, this);
                return Unit.f43263a;
            }
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1;
            if (continuation instanceof AnonymousClass1) {
                anonymousClass1 = (AnonymousClass1) continuation;
                int i2 = anonymousClass1.f44951Y;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    anonymousClass1.f44951Y = i2 - Integer.MIN_VALUE;
                } else {
                    anonymousClass1 = new AnonymousClass1(continuation);
                }
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
            Object obj2 = anonymousClass1.X;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            int i3 = anonymousClass1.f44951Y;
            if (i3 == 0) {
                ResultKt.b(obj2);
                anonymousClass1.e0 = obj;
                throw null;
            }
            if (i3 == 1) {
                ResultKt.b(obj2);
                if (!((Boolean) obj2).booleanValue()) {
                    anonymousClass1.e0 = null;
                    anonymousClass1.f44951Y = 2;
                    throw null;
                }
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj2);
            }
            return Unit.f43263a;
        }
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        throw null;
    }
}
