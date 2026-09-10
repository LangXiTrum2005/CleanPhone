package androidx.paging;

import com.p004ironsource.mediationsdk.logger.IronSourceError;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4$1", f = "PageFetcherSnapshot.kt", l = {646, 658, 125, 669, 128, 680, 692, 125, IronSourceError.ERROR_NT_LOAD_WHILE_LONG_INITIATION, 128, 714, 726, 125, 737, 128, 748}, m = "emit")
final class PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1 extends ContinuationImpl {
    public Object X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Object f7847Y;
    public Object Z;
    public Object e0;
    public Object f0;
    public Object g0;
    public Object h0;
    public /* synthetic */ Object i0;
    public final /* synthetic */ PageFetcherSnapshot$pageEventFlow$1.AnonymousClass4.AnonymousClass1 j0;
    public int k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1(PageFetcherSnapshot$pageEventFlow$1.AnonymousClass4.AnonymousClass1 anonymousClass1, Continuation continuation) {
        super(continuation);
        this.j0 = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.i0 = obj;
        this.k0 |= Integer.MIN_VALUE;
        return this.j0.b(this);
    }
}
