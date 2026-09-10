package androidx.paging;

import com.thinkup.core.common.n.mo;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.CachedPageEventFlow$job$1$1", f = "CachedPageEventFlow.kt", l = {mo.oom.ono, 78}, m = "emit")
final class CachedPageEventFlow$job$1$1$emit$1 extends ContinuationImpl {
    public Object X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public /* synthetic */ Object f7775Y;
    public final /* synthetic */ CachedPageEventFlow$job$1.AnonymousClass1 Z;
    public int e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CachedPageEventFlow$job$1$1$emit$1(CachedPageEventFlow$job$1.AnonymousClass1 anonymousClass1, Continuation continuation) {
        super(continuation);
        this.Z = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f7775Y = obj;
        this.e0 |= Integer.MIN_VALUE;
        return this.Z.emit(null, this);
    }
}
