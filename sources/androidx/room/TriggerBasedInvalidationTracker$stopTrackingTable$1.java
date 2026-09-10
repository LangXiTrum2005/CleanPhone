package androidx.room;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "androidx.room.TriggerBasedInvalidationTracker", f = "InvalidationTracker.kt", l = {347}, m = "stopTrackingTable")
final class TriggerBasedInvalidationTracker$stopTrackingTable$1 extends ContinuationImpl {
    public PooledConnection X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public String f8271Y;
    public String[] Z;
    public int e0;
    public int f0;
    public /* synthetic */ Object g0;
    public final /* synthetic */ TriggerBasedInvalidationTracker h0;
    public int i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TriggerBasedInvalidationTracker$stopTrackingTable$1(TriggerBasedInvalidationTracker triggerBasedInvalidationTracker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.h0 = triggerBasedInvalidationTracker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.g0 = obj;
        this.i0 |= Integer.MIN_VALUE;
        return TriggerBasedInvalidationTracker.c(this.h0, null, 0, this);
    }
}
