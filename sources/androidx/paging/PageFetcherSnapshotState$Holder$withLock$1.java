package androidx.paging;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 176)
@DebugMetadata(c = "androidx.paging.PageFetcherSnapshotState$Holder", f = "PageFetcherSnapshotState.kt", l = {TTAdConstant.AD_ID_IS_NULL_CODE}, m = "withLock")
final class PageFetcherSnapshotState$Holder$withLock$1<T> extends ContinuationImpl {
    public /* synthetic */ Object X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f7849Y;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.X = obj;
        this.f7849Y |= Integer.MIN_VALUE;
        throw null;
    }
}
