package kotlinx.coroutines.flow;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.internal.SafeCollector;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/flow/SubscribedFlowCollector;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/flow/FlowCollector;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SubscribedFlowCollector<T> implements FlowCollector<T> {
    public final FlowCollector X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final SuspendLambda f44989Y;

    /* JADX WARN: Multi-variable type inference failed */
    public SubscribedFlowCollector(Function2 function2, FlowCollector flowCollector) {
        this.X = flowCollector;
        this.f44989Y = (SuspendLambda) function2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.coroutines.jvm.internal.ContinuationImpl] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v4, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    public final Object b(ContinuationImpl continuationImpl) {
        SubscribedFlowCollector$onSubscription$1 subscribedFlowCollector$onSubscription$1;
        SafeCollector safeCollector;
        SubscribedFlowCollector<T> subscribedFlowCollector;
        if (continuationImpl instanceof SubscribedFlowCollector$onSubscription$1) {
            subscribedFlowCollector$onSubscription$1 = (SubscribedFlowCollector$onSubscription$1) continuationImpl;
            int i2 = subscribedFlowCollector$onSubscription$1.f0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                subscribedFlowCollector$onSubscription$1.f0 = i2 - Integer.MIN_VALUE;
            } else {
                subscribedFlowCollector$onSubscription$1 = new SubscribedFlowCollector$onSubscription$1(this, continuationImpl);
            }
        } else {
            subscribedFlowCollector$onSubscription$1 = new SubscribedFlowCollector$onSubscription$1(this, continuationImpl);
        }
        Object obj = subscribedFlowCollector$onSubscription$1.Z;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        ?? r2 = subscribedFlowCollector$onSubscription$1.f0;
        Unit unit = Unit.f43263a;
        try {
            if (r2 == 0) {
                ResultKt.b(obj);
                safeCollector = new SafeCollector(this.X, subscribedFlowCollector$onSubscription$1.getF0());
                ?? r8 = this.f44989Y;
                subscribedFlowCollector$onSubscription$1.X = this;
                subscribedFlowCollector$onSubscription$1.f44990Y = safeCollector;
                subscribedFlowCollector$onSubscription$1.f0 = 1;
                if (r8.invoke(safeCollector, subscribedFlowCollector$onSubscription$1) != coroutineSingletons) {
                    subscribedFlowCollector = this;
                }
                return coroutineSingletons;
            }
            if (r2 != 1) {
                if (r2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                return unit;
            }
            safeCollector = subscribedFlowCollector$onSubscription$1.f44990Y;
            subscribedFlowCollector = subscribedFlowCollector$onSubscription$1.X;
            ResultKt.b(obj);
            safeCollector.releaseIntercepted();
            FlowCollector flowCollector = subscribedFlowCollector.X;
            r2 = flowCollector instanceof SubscribedFlowCollector;
            if (r2 != 0) {
                subscribedFlowCollector$onSubscription$1.X = null;
                subscribedFlowCollector$onSubscription$1.f44990Y = null;
                subscribedFlowCollector$onSubscription$1.f0 = 2;
                if (((SubscribedFlowCollector) flowCollector).b(subscribedFlowCollector$onSubscription$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return unit;
        } catch (Throwable th) {
            r2.releaseIntercepted();
            throw th;
        }
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        return this.X.emit(obj, continuation);
    }
}
