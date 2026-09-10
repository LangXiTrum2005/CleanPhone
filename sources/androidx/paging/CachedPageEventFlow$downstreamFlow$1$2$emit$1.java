package androidx.paging;

import kotlin.Metadata;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.CachedPageEventFlow$downstreamFlow$1$2", f = "CachedPageEventFlow.kt", l = {105}, m = "emit")
final class CachedPageEventFlow$downstreamFlow$1$2$emit$1 extends ContinuationImpl {
    public Object X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public IndexedValue f7773Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ CachedPageEventFlow$downstreamFlow$1.AnonymousClass2 e0;
    public int f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CachedPageEventFlow$downstreamFlow$1$2$emit$1(CachedPageEventFlow$downstreamFlow$1.AnonymousClass2 anonymousClass2, Continuation continuation) {
        super(continuation);
        this.e0 = anonymousClass2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.Z = obj;
        this.f0 |= Integer.MIN_VALUE;
        return this.e0.emit(null, this);
    }
}
