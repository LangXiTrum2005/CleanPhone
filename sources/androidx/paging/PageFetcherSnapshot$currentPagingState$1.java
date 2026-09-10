package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.PageFetcherSnapshot", f = "PageFetcherSnapshot.kt", l = {646}, m = "currentPagingState")
final class PageFetcherSnapshot$currentPagingState$1 extends ContinuationImpl {
    public /* synthetic */ Object X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ PageFetcherSnapshot f7842Y;
    public int Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcherSnapshot$currentPagingState$1(PageFetcherSnapshot pageFetcherSnapshot, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f7842Y = pageFetcherSnapshot;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        throw null;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 0
            r4.X = r5
            int r5 = r4.Z
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r5 | r1
            r4.Z = r5
            androidx.paging.PageFetcherSnapshot r5 = r4.f7842Y
            r5.getClass()
            int r2 = r4.Z
            r3 = r2 & r1
            if (r3 == 0) goto L1a
            int r2 = r2 - r1
            r4.Z = r2
            r1 = r4
            goto L1f
        L1a:
            androidx.paging.PageFetcherSnapshot$currentPagingState$1 r1 = new androidx.paging.PageFetcherSnapshot$currentPagingState$1
            r1.<init>(r5, r4)
        L1f:
            java.lang.Object r5 = r1.X
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.X
            int r1 = r1.Z
            if (r1 == 0) goto L37
            r2 = 1
            if (r1 != r2) goto L2f
            kotlin.ResultKt.b(r5)
            throw r0     // Catch: java.lang.Throwable -> L2e
        L2e:
            throw r0
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L37:
            kotlin.ResultKt.b(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcherSnapshot$currentPagingState$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
