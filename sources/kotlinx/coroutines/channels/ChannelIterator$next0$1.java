package kotlinx.coroutines.channels;

import com.p004ironsource.mediationsdk.logger.IronSourceError;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelIterator$DefaultImpls", f = "Channel.kt", l = {IronSourceError.ERROR_BN_INIT_FAILED_AFTER_LOAD}, m = "next")
final class ChannelIterator$next0$1<E> extends ContinuationImpl {
    public /* synthetic */ Object X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f44796Y;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.X = obj;
        int i2 = (this.f44796Y | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.f44796Y = i2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        if (i2 == 0) {
            ResultKt.b(obj);
            this.f44796Y = 1;
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        if (((Boolean) obj).booleanValue()) {
            throw null;
        }
        throw new ClosedReceiveChannelException("Channel was closed");
    }
}
