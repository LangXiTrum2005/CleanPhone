package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", l = {41}, m = "consumeEach")
final class ChannelsKt__DeprecatedKt$consumeEach$1<E> extends ContinuationImpl {
    public Function1 X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public ReceiveChannel f44804Y;
    public ChannelIterator Z;
    public /* synthetic */ Object e0;
    public int f0;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e0 = obj;
        int i2 = (this.f0 | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.f0 = i2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        if (i2 == 0) {
            ResultKt.b(obj);
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ChannelIterator channelIterator = this.Z;
        ReceiveChannel receiveChannel = this.f44804Y;
        Function1 function1 = this.X;
        try {
            ResultKt.b(obj);
            while (((Boolean) obj).booleanValue()) {
                function1.invoke(channelIterator.next());
                this.X = function1;
                this.f44804Y = receiveChannel;
                this.Z = channelIterator;
                this.f0 = 1;
                obj = channelIterator.b(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            receiveChannel.a(null);
            return Unit.f43263a;
        } catch (Throwable th) {
            receiveChannel.a(null);
            throw th;
        }
    }
}
