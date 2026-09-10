package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", l = {179, 182}, m = "singleOrNull")
final class ChannelsKt__DeprecatedKt$singleOrNull$1<E> extends ContinuationImpl {
    public ReceiveChannel X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Object f44826Y;
    public /* synthetic */ Object Z;
    public int e0;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        ReceiveChannel receiveChannel;
        this.Z = obj;
        int i2 = (this.e0 | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.e0 = i2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        ReceiveChannel receiveChannel2 = null;
        if (i2 != 0) {
            if (i2 == 1) {
                ChannelIterator channelIterator = (ChannelIterator) this.f44826Y;
                ReceiveChannel receiveChannel3 = this.X;
                try {
                    ResultKt.b(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        receiveChannel3.a(null);
                        return null;
                    }
                    Object next = channelIterator.next();
                    this.X = receiveChannel3;
                    this.f44826Y = next;
                    this.e0 = 2;
                    Object objB = channelIterator.b(this);
                    if (objB == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj2 = next;
                    obj = objB;
                    receiveChannel = receiveChannel3;
                } catch (Throwable th) {
                    th = th;
                    receiveChannel2 = receiveChannel3;
                }
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.f44826Y;
                receiveChannel = this.X;
                try {
                    ResultKt.b(obj);
                } catch (Throwable th2) {
                    th = th2;
                    receiveChannel2 = receiveChannel;
                }
            }
            if (((Boolean) obj).booleanValue()) {
                receiveChannel.a(null);
                return null;
            }
            receiveChannel.a(null);
            return obj2;
        }
        ResultKt.b(obj);
        try {
            throw null;
        } catch (Throwable th3) {
            th = th3;
        }
        try {
            throw th;
        } catch (Throwable th4) {
            ChannelsKt.a(receiveChannel2, th);
            throw th4;
        }
    }
}
