package androidx.room;

import androidx.room.concurrent.CloseBarrier;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "androidx.room.TriggerBasedInvalidationTracker", f = "InvalidationTracker.kt", l = {TTAdConstant.DOWNLOAD_URL_AND_PACKAGE_NAME}, m = "notifyInvalidation")
final class TriggerBasedInvalidationTracker$notifyInvalidation$1 extends ContinuationImpl {
    public CloseBarrier X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public /* synthetic */ Object f8265Y;
    public final /* synthetic */ TriggerBasedInvalidationTracker Z;
    public int e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TriggerBasedInvalidationTracker$notifyInvalidation$1(TriggerBasedInvalidationTracker triggerBasedInvalidationTracker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.Z = triggerBasedInvalidationTracker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f8265Y = obj;
        this.e0 |= Integer.MIN_VALUE;
        return this.Z.d(this);
    }
}
