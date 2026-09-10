package kotlinx.coroutines.flow;

import com.google.android.gms.ads.RequestConfiguration;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.monroe;
import p002kotlin.Metadata;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.coroutines.EmptyCoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Context.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a7\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a#\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/flow/dern;", "", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "attabal", "(Lkotlinx/coroutines/flow/dern;ILkotlinx/coroutines/channels/BufferOverflow;)Lkotlinx/coroutines/flow/dern;", "wireman", "(Lkotlinx/coroutines/flow/dern;)Lkotlinx/coroutines/flow/dern;", "Lkotlin/coroutines/CoroutineContext;", "context", "marial", "(Lkotlinx/coroutines/flow/dern;Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/flow/dern;", "", "dern", "(Lkotlin/coroutines/CoroutineContext;)V", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class competently {
    public static final <T> dern<T> attabal(dern<? extends T> dernVar, int i, BufferOverflow bufferOverflow) {
        if (i < 0 && i != -2 && i != -1) {
            throw new IllegalArgumentException(("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was " + i).toString());
        }
        if (i == -1 && bufferOverflow != BufferOverflow.SUSPEND) {
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        if (i == -1) {
            bufferOverflow = BufferOverflow.DROP_OLDEST;
            i = 0;
        }
        int i2 = i;
        BufferOverflow bufferOverflow2 = bufferOverflow;
        if (dernVar instanceof kotlinx.coroutines.flow.internal.cutely) {
            return kotlinx.coroutines.flow.internal.cutely.attabal.attabal((kotlinx.coroutines.flow.internal.cutely) dernVar, null, i2, bufferOverflow2, 1, null);
        }
        return new kotlinx.coroutines.flow.internal.marial(dernVar, null, i2, bufferOverflow2, 2, null);
    }

    public static final void dern(CoroutineContext coroutineContext) {
        if (coroutineContext.get(monroe.INSTANCE) == null) {
            return;
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + coroutineContext).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> dern<T> marial(dern<? extends T> dernVar, CoroutineContext coroutineContext) {
        dern(coroutineContext);
        if (Intrinsics.wireman(coroutineContext, EmptyCoroutineContext.INSTANCE)) {
            return dernVar;
        }
        if (dernVar instanceof kotlinx.coroutines.flow.internal.cutely) {
            return kotlinx.coroutines.flow.internal.cutely.attabal.attabal((kotlinx.coroutines.flow.internal.cutely) dernVar, coroutineContext, 0, null, 6, null);
        }
        return new kotlinx.coroutines.flow.internal.marial(dernVar, coroutineContext, 0, null, 12, null);
    }

    public static /* synthetic */ dern saneness(dern dernVar, int i, BufferOverflow bufferOverflow, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = -2;
        }
        if ((i2 & 2) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        return marial.dern(dernVar, i, bufferOverflow);
    }

    public static final <T> dern<T> wireman(dern<? extends T> dernVar) {
        return saneness(dernVar, -1, null, 2, null);
    }
}
