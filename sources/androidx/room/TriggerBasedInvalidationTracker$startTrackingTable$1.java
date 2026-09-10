package androidx.room;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "androidx.room.TriggerBasedInvalidationTracker", f = "InvalidationTracker.kt", l = {328, 333}, m = "startTrackingTable")
final class TriggerBasedInvalidationTracker$startTrackingTable$1 extends ContinuationImpl {
    public PooledConnection X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public String f8270Y;
    public String[] Z;
    public int e0;
    public int f0;
    public int g0;
    public /* synthetic */ Object h0;
    public final /* synthetic */ TriggerBasedInvalidationTracker i0;
    public int j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TriggerBasedInvalidationTracker$startTrackingTable$1(TriggerBasedInvalidationTracker triggerBasedInvalidationTracker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.i0 = triggerBasedInvalidationTracker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.h0 = obj;
        this.j0 |= Integer.MIN_VALUE;
        return TriggerBasedInvalidationTracker.b(this.i0, null, 0, this);
    }
}
