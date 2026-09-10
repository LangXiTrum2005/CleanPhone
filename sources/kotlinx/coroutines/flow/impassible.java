package kotlinx.coroutines.flow;

import com.google.android.gms.ads.RequestConfiguration;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.monroe;
import p002kotlin.Metadata;
import p002kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: Share.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u001f\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ-\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001e\u0010\u0016\u001a\u00020\u00152\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0096A¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lkotlinx/coroutines/flow/impassible;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/flow/arytenoidectomy;", "", "Lkotlinx/coroutines/flow/internal/cutely;", "flow", "Lkotlinx/coroutines/monroe;", "job", "<init>", "(Lkotlinx/coroutines/flow/arytenoidectomy;Lkotlinx/coroutines/monroe;)V", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "Lkotlinx/coroutines/flow/dern;", "saneness", "(Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)Lkotlinx/coroutines/flow/dern;", "Lkotlinx/coroutines/flow/wireman;", "collector", "", "collect", "(Lkotlinx/coroutines/flow/wireman;Lwretchedly/dern;)Ljava/lang/Object;", "arytenoidectomy", "Lkotlinx/coroutines/monroe;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class impassible<T> implements arytenoidectomy<T>, dern, kotlinx.coroutines.flow.internal.cutely<T> {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public final monroe job;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final /* synthetic */ arytenoidectomy<T> f32281kowloon;

    /* JADX WARN: Multi-variable type inference failed */
    public impassible(arytenoidectomy<? extends T> arytenoidectomyVar, monroe monroeVar) {
        this.f32281kowloon = arytenoidectomyVar;
        this.job = monroeVar;
    }

    @Override // kotlinx.coroutines.flow.arytenoidectomy, kotlinx.coroutines.flow.dern
    public Object collect(wireman<? super T> wiremanVar, wretchedly.dern<?> dernVar) {
        return this.f32281kowloon.collect(wiremanVar, dernVar);
    }

    @Override // kotlinx.coroutines.flow.internal.cutely
    public dern<T> saneness(CoroutineContext context, int capacity, BufferOverflow onBufferOverflow) {
        return monoploid.marial(this, context, capacity, onBufferOverflow);
    }
}
