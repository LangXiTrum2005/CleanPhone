package kotlinx.coroutines.flow.internal;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/flow/internal/ChannelLimitedFlowMerge;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/flow/internal/ChannelFlow;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChannelLimitedFlowMerge<T> extends ChannelFlow<T> {
    public final Object e0;

    public ChannelLimitedFlowMerge(Iterable iterable, CoroutineContext coroutineContext, int i2, BufferOverflow bufferOverflow) {
        super(coroutineContext, i2, bufferOverflow);
        this.e0 = iterable;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Iterable, java.lang.Object] */
    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public final Object e(ProducerScope producerScope, Continuation continuation) {
        SendingCollector sendingCollector = new SendingCollector(producerScope);
        Iterator it = this.e0.iterator();
        while (it.hasNext()) {
            BuildersKt.c(producerScope, null, null, new ChannelLimitedFlowMerge$collectTo$2$1((Flow) it.next(), sendingCollector, null), 3);
        }
        return Unit.f43263a;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Iterable, java.lang.Object] */
    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public final ChannelFlow f(CoroutineContext coroutineContext, int i2, BufferOverflow bufferOverflow) {
        return new ChannelLimitedFlowMerge(this.e0, coroutineContext, i2, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public final ReceiveChannel h(CoroutineScope coroutineScope) {
        ChannelFlow$collectToFun$1 channelFlow$collectToFun$1 = new ChannelFlow$collectToFun$1(this, null);
        return ProduceKt.b(coroutineScope, this.X, this.f44995Y, BufferOverflow.X, CoroutineStart.X, channelFlow$collectToFun$1);
    }
}
