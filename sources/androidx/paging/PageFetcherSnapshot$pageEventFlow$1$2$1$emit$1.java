package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2$1", f = "PageFetcherSnapshot.kt", l = {95}, m = "emit")
final class PageFetcherSnapshot$pageEventFlow$1$2$1$emit$1 extends ContinuationImpl {
    public /* synthetic */ Object X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ PageFetcherSnapshot$pageEventFlow$1.AnonymousClass2.AnonymousClass1 f7845Y;
    public int Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcherSnapshot$pageEventFlow$1$2$1$emit$1(PageFetcherSnapshot$pageEventFlow$1.AnonymousClass2.AnonymousClass1 anonymousClass1, Continuation continuation) {
        super(continuation);
        this.f7845Y = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.f7845Y.emit(null, this);
    }
}
