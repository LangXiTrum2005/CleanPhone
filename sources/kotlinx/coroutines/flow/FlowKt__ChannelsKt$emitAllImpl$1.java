package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ReceiveChannel;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ChannelsKt", f = "Channels.kt", l = {32, 33}, m = "emitAllImpl$FlowKt__ChannelsKt")
final class FlowKt__ChannelsKt$emitAllImpl$1<T> extends ContinuationImpl {
    public FlowCollector X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public ReceiveChannel f44871Y;
    public ChannelIterator Z;
    public boolean e0;
    public /* synthetic */ Object f0;
    public int g0;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f0 = obj;
        this.g0 |= Integer.MIN_VALUE;
        return FlowKt__ChannelsKt.a(null, null, false, this);
    }
}
