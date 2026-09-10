package kotlinx.coroutines.flow.internal;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/flow/internal/ChannelFlowOperatorImpl;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/flow/internal/ChannelFlowOperator;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChannelFlowOperatorImpl<T> extends ChannelFlowOperator<T, T> {
    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public final ChannelFlow f(CoroutineContext coroutineContext, int i2, BufferOverflow bufferOverflow) {
        return new ChannelFlowOperatorImpl(i2, coroutineContext, bufferOverflow, this.e0);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public final Flow g() {
        return this.e0;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlowOperator
    public final Object i(FlowCollector flowCollector, Continuation continuation) {
        Object objCollect = this.e0.collect(flowCollector, continuation);
        return objCollect == CoroutineSingletons.X ? objCollect : Unit.f43263a;
    }
}
