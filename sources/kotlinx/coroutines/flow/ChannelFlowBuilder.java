package kotlinx.coroutines.flow;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.internal.ChannelFlow;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/flow/ChannelFlowBuilder;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/flow/internal/ChannelFlow;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
class ChannelFlowBuilder<T> extends ChannelFlow<T> {
    public final SuspendLambda e0;

    /* JADX WARN: Multi-variable type inference failed */
    public ChannelFlowBuilder(Function2 function2, CoroutineContext coroutineContext, int i2, BufferOverflow bufferOverflow) {
        super(coroutineContext, i2, bufferOverflow);
        this.e0 = (SuspendLambda) function2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public Object e(ProducerScope producerScope, Continuation continuation) {
        Object objInvoke = this.e0.invoke(producerScope, continuation);
        return objInvoke == CoroutineSingletons.X ? objInvoke : Unit.f43263a;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public ChannelFlow f(CoroutineContext coroutineContext, int i2, BufferOverflow bufferOverflow) {
        return new ChannelFlowBuilder(this.e0, coroutineContext, i2, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public final String toString() {
        return "block[" + this.e0 + "] -> " + super.toString();
    }
}
