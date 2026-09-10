package kotlinx.coroutines.channels;

import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt", f = "Channels.common.kt", l = {209}, m = "toList")
final class ChannelsKt__Channels_commonKt$toList$1<E> extends ContinuationImpl {
    public List X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public List f44802Y;
    public ReceiveChannel Z;
    public ChannelIterator e0;
    public /* synthetic */ Object f0;
    public int g0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f0 = obj;
        int i2 = (this.g0 | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.g0 = i2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        ReceiveChannel receiveChannel = null;
        if (i2 == 0) {
            ResultKt.b(obj);
            CollectionsKt.p();
            try {
                throw null;
            } catch (Throwable th) {
                th = th;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ChannelIterator channelIterator = this.e0;
            ReceiveChannel receiveChannel2 = this.Z;
            List list = this.f44802Y;
            List list2 = this.X;
            try {
                ResultKt.b(obj);
                while (((Boolean) obj).booleanValue()) {
                    list.add(channelIterator.next());
                    this.X = list2;
                    this.f44802Y = list;
                    this.Z = receiveChannel2;
                    this.e0 = channelIterator;
                    this.g0 = 1;
                    obj = channelIterator.b(this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                receiveChannel2.a(null);
                return CollectionsKt.m(list2);
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
