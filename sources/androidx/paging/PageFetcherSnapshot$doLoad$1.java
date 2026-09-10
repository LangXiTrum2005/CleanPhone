package androidx.paging;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.PageFetcherSnapshot", f = "PageFetcherSnapshot.kt", l = {647, 658, TTAdConstant.VIDEO_COVER_URL_CODE, 424, 679, 720, 472, 741, 495, 521, 752}, m = "doLoad")
final class PageFetcherSnapshot$doLoad$1 extends ContinuationImpl {
    public Object X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Object f7844Y;
    public Object Z;
    public Object e0;
    public Object f0;
    public Object g0;
    public /* synthetic */ Object h0;
    public final /* synthetic */ PageFetcherSnapshot i0;
    public int j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcherSnapshot$doLoad$1(PageFetcherSnapshot pageFetcherSnapshot, Continuation continuation) {
        super(continuation);
        this.i0 = pageFetcherSnapshot;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.h0 = obj;
        this.j0 |= Integer.MIN_VALUE;
        PageFetcherSnapshot.a(this.i0, null, null, this);
        return Unit.f43263a;
    }
}
