package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/channels/ChannelResult;", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2", f = "Channels.kt", l = {39}, m = "invokeSuspend")
final class ChannelsKt__ChannelsKt$trySendBlocking$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResult<? extends Unit>>, Object> {
    public int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public /* synthetic */ Object f44800Y;
    public final /* synthetic */ SendChannel Z;
    public final /* synthetic */ Object e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelsKt__ChannelsKt$trySendBlocking$2(SendChannel sendChannel, Object obj, Continuation continuation) {
        super(2, continuation);
        this.Z = sendChannel;
        this.e0 = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChannelsKt__ChannelsKt$trySendBlocking$2 channelsKt__ChannelsKt$trySendBlocking$2 = new ChannelsKt__ChannelsKt$trySendBlocking$2(this.Z, this.e0, continuation);
        channelsKt__ChannelsKt$trySendBlocking$2.f44800Y = obj;
        return channelsKt__ChannelsKt$trySendBlocking$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ChannelsKt__ChannelsKt$trySendBlocking$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f43263a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objA;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i2 = this.X;
        Object closed = Unit.f43263a;
        try {
            if (i2 == 0) {
                ResultKt.b(obj);
                SendChannel sendChannel = this.Z;
                Object obj2 = this.e0;
                this.X = 1;
                if (sendChannel.y(obj2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            objA = closed;
        } catch (Throwable th) {
            objA = ResultKt.a(th);
        }
        if (objA instanceof Result.Failure) {
            closed = new ChannelResult.Closed(Result.a(objA));
        }
        return new ChannelResult(closed);
    }
}
