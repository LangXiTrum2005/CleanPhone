package kotlinx.coroutines.flow;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.internal.ChannelFlow;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/flow/CallbackFlowBuilder;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/flow/ChannelFlowBuilder;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class CallbackFlowBuilder<T> extends ChannelFlowBuilder<T> {
    public final Function2 f0;

    public CallbackFlowBuilder(Function2 function2, CoroutineContext coroutineContext, int i2, BufferOverflow bufferOverflow) {
        super(function2, coroutineContext, i2, bufferOverflow);
        this.f0 = function2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.ChannelFlowBuilder, kotlinx.coroutines.flow.internal.ChannelFlow
    public final Object e(ProducerScope producerScope, Continuation continuation) {
        CallbackFlowBuilder$collectTo$1 callbackFlowBuilder$collectTo$1;
        if (continuation instanceof CallbackFlowBuilder$collectTo$1) {
            callbackFlowBuilder$collectTo$1 = (CallbackFlowBuilder$collectTo$1) continuation;
            int i2 = callbackFlowBuilder$collectTo$1.e0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                callbackFlowBuilder$collectTo$1.e0 = i2 - Integer.MIN_VALUE;
            } else {
                callbackFlowBuilder$collectTo$1 = new CallbackFlowBuilder$collectTo$1(this, (ContinuationImpl) continuation);
            }
        } else {
            callbackFlowBuilder$collectTo$1 = new CallbackFlowBuilder$collectTo$1(this, (ContinuationImpl) continuation);
        }
        Object obj = callbackFlowBuilder$collectTo$1.f44857Y;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = callbackFlowBuilder$collectTo$1.e0;
        if (i3 == 0) {
            ResultKt.b(obj);
            callbackFlowBuilder$collectTo$1.X = producerScope;
            callbackFlowBuilder$collectTo$1.e0 = 1;
            if (super.e(producerScope, callbackFlowBuilder$collectTo$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            producerScope = callbackFlowBuilder$collectTo$1.X;
            ResultKt.b(obj);
        }
        if (producerScope.z()) {
            return Unit.f43263a;
        }
        throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
    }

    @Override // kotlinx.coroutines.flow.ChannelFlowBuilder, kotlinx.coroutines.flow.internal.ChannelFlow
    public final ChannelFlow f(CoroutineContext coroutineContext, int i2, BufferOverflow bufferOverflow) {
        return new CallbackFlowBuilder(this.f0, coroutineContext, i2, bufferOverflow);
    }
}
