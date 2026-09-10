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
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "value", "Lkotlinx/coroutines/channels/ChannelResult;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2", f = "Delay.kt", l = {236}, m = "invokeSuspend")
final class FlowKt__DelayKt$debounceInternal$1$3$2 extends SuspendLambda implements Function2<ChannelResult<? extends Object>, Continuation<? super Unit>, Object> {
    public Ref.ObjectRef X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f44879Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ Ref.ObjectRef e0;
    public final /* synthetic */ FlowCollector f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$debounceInternal$1$3$2(Continuation continuation, Ref.ObjectRef objectRef, FlowCollector flowCollector) {
        super(2, continuation);
        this.e0 = objectRef;
        this.f0 = flowCollector;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FlowKt__DelayKt$debounceInternal$1$3$2 flowKt__DelayKt$debounceInternal$1$3$2 = new FlowKt__DelayKt$debounceInternal$1$3$2(continuation, this.e0, this.f0);
        flowKt__DelayKt$debounceInternal$1$3$2.Z = obj;
        return flowKt__DelayKt$debounceInternal$1$3$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((FlowKt__DelayKt$debounceInternal$1$3$2) create(new ChannelResult(((ChannelResult) obj).f44798a), (Continuation) obj2)).invokeSuspend(Unit.f43263a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i2 = this.f44879Y;
        if (i2 == 0) {
            ResultKt.b(obj);
            Object obj2 = ((ChannelResult) this.Z).f44798a;
            boolean z2 = obj2 instanceof ChannelResult.Failed;
            objectRef = this.e0;
            if (!z2) {
                objectRef.X = obj2;
            }
            if (z2) {
                Throwable thA = ChannelResult.a(obj2);
                if (thA != null) {
                    throw thA;
                }
                Object obj3 = objectRef.X;
                if (obj3 != null) {
                    if (obj3 == NullSurrogateKt.f45018a) {
                        obj3 = null;
                    }
                    this.Z = obj2;
                    this.X = objectRef;
                    this.f44879Y = 1;
                    if (this.f0.emit(obj3, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    objectRef2 = objectRef;
                }
                objectRef.X = NullSurrogateKt.f45020c;
            }
            return Unit.f43263a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        objectRef2 = this.X;
        ResultKt.b(obj);
        objectRef = objectRef2;
        objectRef.X = NullSurrogateKt.f45020c;
        return Unit.f43263a;
    }
}
