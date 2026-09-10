package kotlinx.coroutines.flow;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import kotlinx.coroutines.internal.Symbol;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1", f = "Delay.kt", l = {Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE}, m = "invokeSuspend")
final class FlowKt__DelayKt$debounceInternal$1$3$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    public int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f44878Y;
    public final /* synthetic */ Ref.ObjectRef Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$debounceInternal$1$3$1(Continuation continuation, Ref.ObjectRef objectRef, FlowCollector flowCollector) {
        super(1, continuation);
        this.f44878Y = flowCollector;
        this.Z = objectRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new FlowKt__DelayKt$debounceInternal$1$3$1(continuation, this.Z, this.f44878Y);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((FlowKt__DelayKt$debounceInternal$1$3$1) create((Continuation) obj)).invokeSuspend(Unit.f43263a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i2 = this.X;
        Ref.ObjectRef objectRef = this.Z;
        if (i2 == 0) {
            ResultKt.b(obj);
            Symbol symbol = NullSurrogateKt.f45018a;
            Object obj2 = objectRef.X;
            if (obj2 == symbol) {
                obj2 = null;
            }
            this.X = 1;
            if (this.f44878Y.emit(obj2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        objectRef.X = null;
        return Unit.f43263a;
    }
}
