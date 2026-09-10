package kotlinx.coroutines.flow;

import com.google.android.gms.ads.RequestConfiguration;
import kotlinx.coroutines.channels.BufferOverflow;
import p002kotlin.Metadata;
import p002kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: Share.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lkotlinx/coroutines/flow/molybdenite;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Lkotlinx/coroutines/flow/dern;", "upstream", "", "extraBufferCapacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "Lkotlin/coroutines/CoroutineContext;", "context", "<init>", "(Lkotlinx/coroutines/flow/dern;ILkotlinx/coroutines/channels/BufferOverflow;Lkotlin/coroutines/CoroutineContext;)V", "attabal", "Lkotlinx/coroutines/flow/dern;", "saneness", "I", "dern", "Lkotlinx/coroutines/channels/BufferOverflow;", "wireman", "Lkotlin/coroutines/CoroutineContext;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class molybdenite<T> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final dern<T> upstream;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final BufferOverflow onBufferOverflow;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final int extraBufferCapacity;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public final CoroutineContext context;

    /* JADX WARN: Multi-variable type inference failed */
    public molybdenite(dern<? extends T> dernVar, int i, BufferOverflow bufferOverflow, CoroutineContext coroutineContext) {
        this.upstream = dernVar;
        this.extraBufferCapacity = i;
        this.onBufferOverflow = bufferOverflow;
        this.context = coroutineContext;
    }
}
