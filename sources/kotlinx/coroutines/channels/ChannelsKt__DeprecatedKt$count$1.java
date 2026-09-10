package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", l = {514}, m = "count")
final class ChannelsKt__DeprecatedKt$count$1<E> extends ContinuationImpl {
    public Ref.IntRef X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public ReceiveChannel f44805Y;
    public ChannelIterator Z;
    public /* synthetic */ Object e0;
    public int f0;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e0 = obj;
        int i2 = (this.f0 | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.f0 = i2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        ReceiveChannel receiveChannel = null;
        if (i2 == 0) {
            ResultKt.b(obj);
            try {
                throw null;
            } catch (Throwable th) {
                th = th;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ChannelIterator channelIterator = this.Z;
            ReceiveChannel receiveChannel2 = this.f44805Y;
            Ref.IntRef intRef = this.X;
            try {
                ResultKt.b(obj);
                while (((Boolean) obj).booleanValue()) {
                    channelIterator.next();
                    intRef.X++;
                    this.X = intRef;
                    this.f44805Y = receiveChannel2;
                    this.Z = channelIterator;
                    this.f0 = 1;
                    obj = channelIterator.b(this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                receiveChannel2.a(null);
                return new Integer(intRef.X);
            } catch (Throwable th2) {
                th = th2;
                receiveChannel = receiveChannel2;
            }
        }
        try {
            throw th;
        } catch (Throwable th3) {
            ChannelsKt.a(receiveChannel, th);
            throw th3;
        }
    }
}
