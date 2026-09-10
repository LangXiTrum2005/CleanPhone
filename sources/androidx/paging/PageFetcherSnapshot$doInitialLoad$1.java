package androidx.paging;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.sync.MutexImpl;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.PageFetcherSnapshot", f = "PageFetcherSnapshot.kt", l = {646, 284, 290, 667, 688, 326, 709, 730, 354}, m = "doInitialLoad")
final class PageFetcherSnapshot$doInitialLoad$1 extends ContinuationImpl {
    public Object X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Object f7843Y;
    public Object Z;
    public MutexImpl e0;
    public /* synthetic */ Object f0;
    public final /* synthetic */ PageFetcherSnapshot g0;
    public int h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcherSnapshot$doInitialLoad$1(PageFetcherSnapshot pageFetcherSnapshot, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.g0 = pageFetcherSnapshot;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f0 = obj;
        this.h0 |= Integer.MIN_VALUE;
        this.g0.c(this);
        return Unit.f43263a;
    }
}
