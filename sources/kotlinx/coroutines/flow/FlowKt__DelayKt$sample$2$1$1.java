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
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.internal.ChildCancelledException;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lkotlinx/coroutines/channels/ChannelResult;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$1", f = "Delay.kt", l = {}, m = "invokeSuspend")
final class FlowKt__DelayKt$sample$2$1$1 extends SuspendLambda implements Function2<ChannelResult<? extends Object>, Continuation<? super Unit>, Object> {
    public /* synthetic */ Object X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f44883Y;
    public final /* synthetic */ ReceiveChannel Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$sample$2$1$1(Ref.ObjectRef objectRef, ReceiveChannel receiveChannel, Continuation continuation) {
        super(2, continuation);
        this.f44883Y = objectRef;
        this.Z = receiveChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FlowKt__DelayKt$sample$2$1$1 flowKt__DelayKt$sample$2$1$1 = new FlowKt__DelayKt$sample$2$1$1(this.f44883Y, this.Z, continuation);
        flowKt__DelayKt$sample$2$1$1.X = obj;
        return flowKt__DelayKt$sample$2$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        FlowKt__DelayKt$sample$2$1$1 flowKt__DelayKt$sample$2$1$1 = (FlowKt__DelayKt$sample$2$1$1) create(new ChannelResult(((ChannelResult) obj).f44798a), (Continuation) obj2);
        Unit unit = Unit.f43263a;
        flowKt__DelayKt$sample$2$1$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        ResultKt.b(obj);
        Object obj2 = ((ChannelResult) this.X).f44798a;
        boolean z2 = obj2 instanceof ChannelResult.Failed;
        Ref.ObjectRef objectRef = this.f44883Y;
        if (!z2) {
            objectRef.X = obj2;
        }
        if (z2) {
            Throwable thA = ChannelResult.a(obj2);
            if (thA != null) {
                throw thA;
            }
            this.Z.a(new ChildCancelledException());
            objectRef.X = NullSurrogateKt.f45020c;
        }
        return Unit.f43263a;
    }
}
