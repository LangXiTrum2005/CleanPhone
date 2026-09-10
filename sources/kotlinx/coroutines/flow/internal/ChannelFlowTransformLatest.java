package kotlinx.coroutines.flow.internal;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/flow/internal/ChannelFlowTransformLatest;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "R", "Lkotlinx/coroutines/flow/internal/ChannelFlowOperator;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChannelFlowTransformLatest<T, R> extends ChannelFlowOperator<T, R> {
    public final SuspendLambda f0;

    /* JADX WARN: Multi-variable type inference failed */
    public ChannelFlowTransformLatest(Function3 function3, Flow flow, CoroutineContext coroutineContext, int i2, BufferOverflow bufferOverflow) {
        super(i2, coroutineContext, bufferOverflow, flow);
        this.f0 = (SuspendLambda) function3;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function3] */
    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public final ChannelFlow f(CoroutineContext coroutineContext, int i2, BufferOverflow bufferOverflow) {
        return new ChannelFlowTransformLatest(this.f0, this.e0, coroutineContext, i2, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlowOperator
    public final Object i(FlowCollector flowCollector, Continuation continuation) {
        Object objD = CoroutineScopeKt.d(new ChannelFlowTransformLatest$flowCollect$3(this, flowCollector, null), continuation);
        return objD == CoroutineSingletons.X ? objD : Unit.f43263a;
    }
}
