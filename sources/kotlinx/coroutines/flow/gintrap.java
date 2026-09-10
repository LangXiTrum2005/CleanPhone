package kotlinx.coroutines.flow;

import com.google.android.gms.ads.RequestConfiguration;
import kotlinx.coroutines.channels.BufferOverflow;
import p002kotlin.Metadata;
import p002kotlin.coroutines.CoroutineContext;
import pigboat.stratoscope;

/* JADX INFO: compiled from: StateFlow.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a=\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000e\"\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010\"\u0014\u0010\u0013\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010¨\u0006\u0014"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "value", "Lkotlinx/coroutines/flow/formularize;", "attabal", "(Ljava/lang/Object;)Lkotlinx/coroutines/flow/formularize;", "Lkotlinx/coroutines/flow/dovishness;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "Lkotlinx/coroutines/flow/dern;", "wireman", "(Lkotlinx/coroutines/flow/dovishness;Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)Lkotlinx/coroutines/flow/dern;", "Lpigboat/stratoscope;", "Lpigboat/stratoscope;", "NONE", "saneness", "PENDING", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class gintrap {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final stratoscope f32274attabal = new stratoscope("NONE");

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final stratoscope f32275saneness = new stratoscope("PENDING");

    public static final <T> formularize<T> attabal(T t) {
        if (t == null) {
            t = (T) kotlinx.coroutines.flow.internal.impassible.f32306attabal;
        }
        return new StateFlowImpl(t);
    }

    public static final <T> dern<T> wireman(dovishness<? extends T> dovishnessVar, CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        return (((i < 0 || i >= 2) && i != -2) || bufferOverflow != BufferOverflow.DROP_OLDEST) ? monoploid.marial(dovishnessVar, coroutineContext, i, bufferOverflow) : dovishnessVar;
    }
}
