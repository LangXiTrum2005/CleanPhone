package kotlinx.coroutines.flow.internal;

import com.google.android.gms.ads.RequestConfiguration;
import com.startapp.sdk.components.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.internal.ThreadContextKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b \u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/flow/internal/ChannelFlowOperator;", "S", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/flow/internal/ChannelFlow;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ChannelFlowOperator<S, T> extends ChannelFlow<T> {
    public final Flow e0;

    public ChannelFlowOperator(int i2, CoroutineContext coroutineContext, BufferOverflow bufferOverflow, Flow flow) {
        super(coroutineContext, i2, bufferOverflow);
        this.e0 = flow;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0070  */
    /* JADX WARN: Code duplicated, block: B:26:0x0078 A[RETURN] */
    @Override // kotlinx.coroutines.flow.internal.ChannelFlow, kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        Object objCollect;
        Unit unit = Unit.f43263a;
        if (this.f44995Y == -3) {
            CoroutineContext f0 = continuation.getF45023Y();
            Boolean bool = Boolean.FALSE;
            e eVar = new e(3);
            CoroutineContext coroutineContext = this.X;
            CoroutineContext coroutineContextPlus = !((Boolean) coroutineContext.fold(bool, eVar)).booleanValue() ? f0.plus(coroutineContext) : CoroutineContextKt.a(f0, coroutineContext, false);
            if (Intrinsics.a(coroutineContextPlus, f0)) {
                Object objI = i(flowCollector, continuation);
                if (objI == CoroutineSingletons.X) {
                    return objI;
                }
            } else {
                ContinuationInterceptor.Key key = ContinuationInterceptor.Key.X;
                if (Intrinsics.a(coroutineContextPlus.get(key), f0.get(key))) {
                    CoroutineContext f1 = continuation.getF45023Y();
                    if (!(flowCollector instanceof SendingCollector) && !(flowCollector instanceof NopCollector)) {
                        flowCollector = new UndispatchedContextCollector(flowCollector, f1);
                    }
                    Object objA = ChannelFlowKt.a(coroutineContextPlus, flowCollector, ThreadContextKt.b(coroutineContextPlus), new ChannelFlowOperator$collectWithContextUndispatched$2(this, null), continuation);
                    if (objA == CoroutineSingletons.X) {
                        return objA;
                    }
                } else {
                    objCollect = super.collect(flowCollector, continuation);
                    if (objCollect == CoroutineSingletons.X) {
                        return objCollect;
                    }
                }
            }
        } else {
            objCollect = super.collect(flowCollector, continuation);
            if (objCollect == CoroutineSingletons.X) {
                return objCollect;
            }
        }
        return unit;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public final Object e(ProducerScope producerScope, Continuation continuation) {
        Object objI = i(new SendingCollector(producerScope), continuation);
        return objI == CoroutineSingletons.X ? objI : Unit.f43263a;
    }

    public abstract Object i(FlowCollector flowCollector, Continuation continuation);

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public final String toString() {
        return this.e0 + " -> " + super.toString();
    }
}
