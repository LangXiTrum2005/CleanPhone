package kotlinx.coroutines.channels;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.channels.BroadcastChannelImpl", f = "BroadcastChannel.kt", l = {179}, m = "send")
final class BroadcastChannelImpl$send$1 extends ContinuationImpl {
    public Iterator X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public /* synthetic */ Object f44777Y;
    public final /* synthetic */ BroadcastChannelImpl Z;
    public int e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BroadcastChannelImpl$send$1(BroadcastChannelImpl broadcastChannelImpl, Continuation continuation) {
        super(continuation);
        this.Z = broadcastChannelImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f44777Y = obj;
        this.e0 |= Integer.MIN_VALUE;
        return this.Z.y(null, this);
    }
}
