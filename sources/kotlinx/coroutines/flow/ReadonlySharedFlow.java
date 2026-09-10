package kotlinx.coroutines.flow;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.FusibleFlow;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004J\u001e\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096A¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n8\u0016X\u0096\u0005¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/flow/ReadonlySharedFlow;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/flow/SharedFlow;", "Lkotlinx/coroutines/flow/CancellableFlow;", "Lkotlinx/coroutines/flow/internal/FusibleFlow;", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;)Ljava/lang/Void;", "", "replayCache", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class ReadonlySharedFlow<T> implements SharedFlow<T>, CancellableFlow<T>, FusibleFlow<T> {
    public final /* synthetic */ MutableSharedFlow X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final Job f44968Y;

    public ReadonlySharedFlow(MutableSharedFlow mutableSharedFlow, Job job) {
        this.X = mutableSharedFlow;
        this.f44968Y = job;
    }

    @Override // kotlinx.coroutines.flow.internal.FusibleFlow
    public final Flow b(CoroutineContext coroutineContext, int i2, BufferOverflow bufferOverflow) {
        return SharedFlowKt.d(this, coroutineContext, i2, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        return this.X.collect(flowCollector, continuation);
    }
}
