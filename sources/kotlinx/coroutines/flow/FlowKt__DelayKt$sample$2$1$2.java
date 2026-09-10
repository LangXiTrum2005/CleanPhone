package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "it"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$2", f = "Delay.kt", l = {293}, m = "invokeSuspend")
final class FlowKt__DelayKt$sample$2$1$2 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
    public int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f44884Y;
    public final /* synthetic */ FlowCollector Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$sample$2$1$2(Continuation continuation, Ref.ObjectRef objectRef, FlowCollector flowCollector) {
        super(2, continuation);
        this.f44884Y = objectRef;
        this.Z = flowCollector;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FlowKt__DelayKt$sample$2$1$2(continuation, this.f44884Y, this.Z);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((FlowKt__DelayKt$sample$2$1$2) create((Unit) obj, (Continuation) obj2)).invokeSuspend(Unit.f43263a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i2 = this.X;
        Unit unit = Unit.f43263a;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return unit;
        }
        ResultKt.b(obj);
        Ref.ObjectRef objectRef = this.f44884Y;
        Object obj2 = objectRef.X;
        if (obj2 != null) {
            objectRef.X = null;
            if (obj2 == NullSurrogateKt.f45018a) {
                obj2 = null;
            }
            this.X = 1;
            if (this.Z.emit(obj2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return unit;
    }
}
