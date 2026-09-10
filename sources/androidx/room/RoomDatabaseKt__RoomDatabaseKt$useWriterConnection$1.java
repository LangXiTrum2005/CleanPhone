package androidx.room;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "androidx.room.RoomDatabaseKt__RoomDatabaseKt", f = "RoomDatabase.kt", l = {501, 501}, m = "useWriterConnection")
final class RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$1<R> extends ContinuationImpl {
    public RoomDatabase X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public /* synthetic */ Object f8237Y;
    public int Z;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
    
        if (r6 == r1) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            r5.f8237Y = r6
            int r0 = r5.Z
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 | r1
            int r0 = r0 - r1
            r5.Z = r0
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.X
            r2 = 0
            r3 = 2
            r4 = 1
            if (r0 == 0) goto L29
            if (r0 == r4) goto L23
            if (r0 != r3) goto L1b
            androidx.room.RoomDatabase r0 = r5.X
            kotlin.ResultKt.b(r6)
            goto L51
        L1b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L23:
            androidx.room.RoomDatabase r0 = r5.X
            kotlin.ResultKt.b(r6)
            goto L39
        L29:
            kotlin.ResultKt.b(r6)
            r5.X = r2
            r5.Z = r4
            r6 = 0
            kotlin.coroutines.CoroutineContext r6 = androidx.room.util.DBUtil.a(r2, r6, r5)
            if (r6 != r1) goto L38
            goto L50
        L38:
            r0 = r2
        L39:
            kotlin.coroutines.CoroutineContext r6 = (kotlin.coroutines.CoroutineContext) r6
            androidx.room.RoomExternalOperationElement r4 = androidx.room.RoomExternalOperationElement.X
            kotlin.coroutines.CoroutineContext r6 = r6.plus(r4)
            androidx.room.RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$2 r4 = new androidx.room.RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$2
            r4.<init>(r0, r2, r2)
            r5.X = r0
            r5.Z = r3
            java.lang.Object r6 = kotlinx.coroutines.BuildersKt.f(r6, r4, r5)
            if (r6 != r1) goto L51
        L50:
            return r1
        L51:
            androidx.room.InvalidationTracker r0 = r0.g()
            r0.b()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
