package kotlinx.coroutines.flow.internal;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.internal.ThreadContextKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/flow/internal/UndispatchedContextCollector;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/flow/FlowCollector;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class UndispatchedContextCollector<T> implements FlowCollector<T> {
    public final CoroutineContext X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final Object f45024Y;
    public final Function2 Z;

    public UndispatchedContextCollector(FlowCollector flowCollector, CoroutineContext coroutineContext) {
        this.X = coroutineContext;
        this.f45024Y = ThreadContextKt.b(coroutineContext);
        this.Z = new UndispatchedContextCollector$emitRef$1(flowCollector, null);
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        Object objA = ChannelFlowKt.a(this.X, obj, this.f45024Y, this.Z, continuation);
        return objA == CoroutineSingletons.X ? objA : Unit.f43263a;
    }
}
