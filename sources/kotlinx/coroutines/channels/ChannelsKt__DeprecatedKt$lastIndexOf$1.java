package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", l = {514}, m = "lastIndexOf")
final class ChannelsKt__DeprecatedKt$lastIndexOf$1<E> extends ContinuationImpl {
    public Ref.IntRef X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Ref.IntRef f44818Y;
    public ReceiveChannel Z;
    public ChannelIterator e0;
    public /* synthetic */ Object f0;
    public int g0;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f0 = obj;
        int i2 = (this.g0 | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.g0 = i2;
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
            ChannelIterator channelIterator = this.e0;
            ReceiveChannel receiveChannel2 = this.Z;
            Ref.IntRef intRef = this.f44818Y;
            Ref.IntRef intRef2 = this.X;
            try {
                ResultKt.b(obj);
                while (((Boolean) obj).booleanValue()) {
                    if (Intrinsics.a(null, channelIterator.next())) {
                        intRef2.X = intRef.X;
                    }
                    intRef.X++;
                    this.X = intRef2;
                    this.f44818Y = intRef;
                    this.Z = receiveChannel2;
                    this.e0 = channelIterator;
                    this.g0 = 1;
                    obj = channelIterator.b(this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                receiveChannel2.a(null);
                return new Integer(intRef2.X);
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
