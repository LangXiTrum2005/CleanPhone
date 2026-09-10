package kotlinx.coroutines.flow.internal;

import com.google.android.gms.ads.RequestConfiguration;
import kotlinx.coroutines.channels.BufferOverflow;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.coroutines.EmptyCoroutineContext;
import p002kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: ChannelFlow.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0002B3\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0015\u001a\u00020\u00142\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0094@¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lkotlinx/coroutines/flow/internal/marial;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/flow/internal/ChannelFlowOperator;", "Lkotlinx/coroutines/flow/dern;", "flow", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "<init>", "(Lkotlinx/coroutines/flow/dern;Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)V", "Lkotlinx/coroutines/flow/internal/ChannelFlow;", "taiyuan", "(Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)Lkotlinx/coroutines/flow/internal/ChannelFlow;", "cutely", "()Lkotlinx/coroutines/flow/dern;", "Lkotlinx/coroutines/flow/wireman;", "collector", "", "monoploid", "(Lkotlinx/coroutines/flow/wireman;Lwretchedly/dern;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class marial<T> extends ChannelFlowOperator<T, T> {
    public /* synthetic */ marial(kotlinx.coroutines.flow.dern dernVar, CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(dernVar, (i2 & 2) != 0 ? EmptyCoroutineContext.INSTANCE : coroutineContext, (i2 & 4) != 0 ? -3 : i, (i2 & 8) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public kotlinx.coroutines.flow.dern<T> cutely() {
        return (kotlinx.coroutines.flow.dern<T>) this.flow;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // kotlinx.coroutines.flow.internal.ChannelFlowOperator
    public Object monoploid(kotlinx.coroutines.flow.wireman<? super T> wiremanVar, wretchedly.dern<? super Unit> dernVar) {
        Object objCollect = this.flow.collect((kotlinx.coroutines.flow.wireman<? super S>) wiremanVar, dernVar);
        return objCollect == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objCollect : Unit.f29295attabal;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public ChannelFlow<T> taiyuan(CoroutineContext context, int capacity, BufferOverflow onBufferOverflow) {
        return new marial(this.flow, context, capacity, onBufferOverflow);
    }

    public marial(kotlinx.coroutines.flow.dern<? extends T> dernVar, CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        super(dernVar, coroutineContext, i, bufferOverflow);
    }
}
