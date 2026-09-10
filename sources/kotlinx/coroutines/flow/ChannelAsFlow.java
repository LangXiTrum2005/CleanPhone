package kotlinx.coroutines.flow;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import kotlinx.coroutines.flow.internal.SendingCollector;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002R\u000b\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/flow/ChannelAsFlow;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/flow/internal/ChannelFlow;", "Lkotlinx/atomicfu/AtomicBoolean;", "consumed", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class ChannelAsFlow<T> extends ChannelFlow<T> {
    public static final /* synthetic */ AtomicIntegerFieldUpdater g0 = AtomicIntegerFieldUpdater.newUpdater(ChannelAsFlow.class, "consumed$volatile");
    private volatile /* synthetic */ int consumed$volatile;
    public final BufferedChannel e0;
    public final boolean f0;

    public /* synthetic */ ChannelAsFlow(BufferedChannel bufferedChannel, boolean z2) {
        this(bufferedChannel, z2, EmptyCoroutineContext.X, -3, BufferOverflow.X);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public final String c() {
        return "channel=" + this.e0;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow, kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        Unit unit = Unit.f43263a;
        if (this.f44995Y == -3) {
            boolean z2 = this.f0;
            if (z2 && g0.getAndSet(this, 1) != 0) {
                throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
            }
            Object objA = FlowKt__ChannelsKt.a(flowCollector, this.e0, z2, continuation);
            if (objA == CoroutineSingletons.X) {
                return objA;
            }
        } else {
            Object objCollect = super.collect(flowCollector, continuation);
            if (objCollect == CoroutineSingletons.X) {
                return objCollect;
            }
        }
        return unit;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public final Object e(ProducerScope producerScope, Continuation continuation) {
        Object objA = FlowKt__ChannelsKt.a(new SendingCollector(producerScope), this.e0, this.f0, continuation);
        return objA == CoroutineSingletons.X ? objA : Unit.f43263a;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public final ChannelFlow f(CoroutineContext coroutineContext, int i2, BufferOverflow bufferOverflow) {
        return new ChannelAsFlow(this.e0, this.f0, coroutineContext, i2, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public final Flow g() {
        return new ChannelAsFlow(this.e0, this.f0);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public final ReceiveChannel h(CoroutineScope coroutineScope) {
        if (!this.f0 || g0.getAndSet(this, 1) == 0) {
            return this.f44995Y == -3 ? this.e0 : super.h(coroutineScope);
        }
        throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
    }

    public ChannelAsFlow(BufferedChannel bufferedChannel, boolean z2, CoroutineContext coroutineContext, int i2, BufferOverflow bufferOverflow) {
        super(coroutineContext, i2, bufferOverflow);
        this.e0 = bufferedChannel;
        this.f0 = z2;
        this.consumed$volatile = 0;
    }
}
