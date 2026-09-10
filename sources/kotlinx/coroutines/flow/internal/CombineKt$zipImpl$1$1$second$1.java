package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1", f = "Combine.kt", l = {86}, m = "invokeSuspend")
final class CombineKt$zipImpl$1$1$second$1 extends SuspendLambda implements Function2<ProducerScope<? super Object>, Continuation<? super Unit>, Object> {
    public int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public /* synthetic */ Object f45014Y;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final class AnonymousClass1<T> implements FlowCollector {
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, Continuation continuation) {
            CombineKt$zipImpl$1$1$second$1$1$emit$1 combineKt$zipImpl$1$1$second$1$1$emit$1;
            if (continuation instanceof CombineKt$zipImpl$1$1$second$1$1$emit$1) {
                combineKt$zipImpl$1$1$second$1$1$emit$1 = (CombineKt$zipImpl$1$1$second$1$1$emit$1) continuation;
                int i2 = combineKt$zipImpl$1$1$second$1$1$emit$1.Z;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    combineKt$zipImpl$1$1$second$1$1$emit$1.Z = i2 - Integer.MIN_VALUE;
                } else {
                    combineKt$zipImpl$1$1$second$1$1$emit$1 = new CombineKt$zipImpl$1$1$second$1$1$emit$1(this, continuation);
                }
            } else {
                combineKt$zipImpl$1$1$second$1$1$emit$1 = new CombineKt$zipImpl$1$1$second$1$1$emit$1(this, continuation);
            }
            Object obj2 = combineKt$zipImpl$1$1$second$1$1$emit$1.X;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            int i3 = combineKt$zipImpl$1$1$second$1$1$emit$1.Z;
            if (i3 == 0) {
                ResultKt.b(obj2);
                throw null;
            }
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj2);
            return Unit.f43263a;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CombineKt$zipImpl$1$1$second$1 combineKt$zipImpl$1$1$second$1 = new CombineKt$zipImpl$1$1$second$1(2, continuation);
        combineKt$zipImpl$1$1$second$1.f45014Y = obj;
        return combineKt$zipImpl$1$1$second$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CombineKt$zipImpl$1$1$second$1 combineKt$zipImpl$1$1$second$1 = (CombineKt$zipImpl$1$1$second$1) create((ProducerScope) obj, (Continuation) obj2);
        Unit unit = Unit.f43263a;
        combineKt$zipImpl$1$1$second$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i2 = this.X;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return Unit.f43263a;
        }
        ResultKt.b(obj);
        this.X = 1;
        throw null;
    }
}
