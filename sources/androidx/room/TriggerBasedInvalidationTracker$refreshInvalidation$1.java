package androidx.room;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "androidx.room.TriggerBasedInvalidationTracker", f = "InvalidationTracker.kt", l = {372}, m = "refreshInvalidation$room_runtime")
final class TriggerBasedInvalidationTracker$refreshInvalidation$1 extends ContinuationImpl {
    public /* synthetic */ Object X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ TriggerBasedInvalidationTracker f8268Y;
    public int Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TriggerBasedInvalidationTracker$refreshInvalidation$1(TriggerBasedInvalidationTracker triggerBasedInvalidationTracker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f8268Y = triggerBasedInvalidationTracker;
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
            androidx.room.TriggerBasedInvalidationTracker r5 = r4.f8268Y
            r5.getClass()
            int r2 = r4.Z
            r3 = r2 & r1
            if (r3 == 0) goto L1a
            int r2 = r2 - r1
            r4.Z = r2
            r1 = r4
            goto L1f
        L1a:
            androidx.room.TriggerBasedInvalidationTracker$refreshInvalidation$1 r1 = new androidx.room.TriggerBasedInvalidationTracker$refreshInvalidation$1
            r1.<init>(r5, r4)
        L1f:
            java.lang.Object r2 = r1.X
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.X
            int r1 = r1.Z
            if (r1 == 0) goto L39
            r5 = 1
            if (r1 != r5) goto L31
            kotlin.ResultKt.b(r2)     // Catch: java.lang.Throwable -> L30
            java.util.Set r2 = (java.util.Set) r2     // Catch: java.lang.Throwable -> L30
            throw r0     // Catch: java.lang.Throwable -> L30
        L30:
            throw r0
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L39:
            kotlin.ResultKt.b(r2)
            r5.g(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.TriggerBasedInvalidationTracker$refreshInvalidation$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
