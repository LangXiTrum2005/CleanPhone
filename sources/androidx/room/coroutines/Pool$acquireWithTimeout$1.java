package androidx.room.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "androidx.room.coroutines.Pool", f = "ConnectionPoolImpl.kt", l = {231}, m = "acquireWithTimeout-KLykuaI")
final class Pool$acquireWithTimeout$1 extends ContinuationImpl {
    public long X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Function0 f8298Y;
    public Ref.ObjectRef Z;
    public /* synthetic */ Object e0;
    public final /* synthetic */ Pool f0;
    public int g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pool$acquireWithTimeout$1(Pool pool, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f0 = pool;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0085 A[Catch: all -> 0x0089, TryCatch #1 {all -> 0x0089, blocks: (B:29:0x0081, B:31:0x0085, B:35:0x008d, B:40:0x0096), top: B:47:0x0081 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x008b  */
    /* JADX WARN: Code duplicated, block: B:35:0x008d A[Catch: all -> 0x0089, TryCatch #1 {all -> 0x0089, blocks: (B:29:0x0081, B:31:0x0085, B:35:0x008d, B:40:0x0096), top: B:47:0x0081 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0091  */
    /* JADX WARN: Code duplicated, block: B:40:0x0096 A[Catch: all -> 0x0089, TRY_LEAVE, TryCatch #1 {all -> 0x0089, blocks: (B:29:0x0081, B:31:0x0085, B:35:0x008d, B:40:0x0096), top: B:47:0x0081 }] */
    /* JADX WARN: Code duplicated, block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x006c -> B:24:0x006e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            r13.e0 = r14
            int r14 = r13.g0
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r14 = r14 | r0
            r13.g0 = r14
            r14 = 0
            androidx.room.coroutines.Pool r0 = r13.f0
            r1 = 0
            r0.getClass()
            boolean r3 = r13 instanceof androidx.room.coroutines.Pool$acquireWithTimeout$1
            if (r3 == 0) goto L22
            int r3 = r13.g0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L22
            int r3 = r3 - r4
            r13.g0 = r3
            r3 = r13
            goto L27
        L22:
            androidx.room.coroutines.Pool$acquireWithTimeout$1 r3 = new androidx.room.coroutines.Pool$acquireWithTimeout$1
            r3.<init>(r0, r13)
        L27:
            java.lang.Object r4 = r3.e0
            kotlin.coroutines.intrinsics.CoroutineSingletons r5 = kotlin.coroutines.intrinsics.CoroutineSingletons.X
            int r6 = r3.g0
            r7 = 0
            r8 = 1
            if (r6 == 0) goto L49
            if (r6 != r8) goto L41
            long r1 = r3.X
            kotlin.jvm.internal.Ref$ObjectRef r14 = r3.Z
            kotlin.jvm.functions.Function0 r6 = r3.f8298Y
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            kotlin.ResultKt.b(r4)     // Catch: java.lang.Throwable -> L3f
            goto L6e
        L3f:
            r4 = move-exception
            goto L7b
        L41:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L49:
            kotlin.ResultKt.b(r4)
        L4c:
            kotlin.jvm.internal.Ref$ObjectRef r4 = new kotlin.jvm.internal.Ref$ObjectRef
            r4.<init>()
            androidx.room.coroutines.Pool$acquireWithTimeout$2 r6 = new androidx.room.coroutines.Pool$acquireWithTimeout$2     // Catch: java.lang.Throwable -> L79
            r6.<init>(r4, r0, r7)     // Catch: java.lang.Throwable -> L79
            r9 = r14
            kotlin.jvm.functions.Function0 r9 = (kotlin.jvm.functions.Function0) r9     // Catch: java.lang.Throwable -> L79
            r3.f8298Y = r9     // Catch: java.lang.Throwable -> L79
            r3.Z = r4     // Catch: java.lang.Throwable -> L79
            r3.X = r1     // Catch: java.lang.Throwable -> L79
            r3.g0 = r8     // Catch: java.lang.Throwable -> L79
            long r9 = kotlinx.coroutines.DelayKt.c(r1)     // Catch: java.lang.Throwable -> L79
            java.lang.Object r6 = kotlinx.coroutines.TimeoutKt.b(r9, r6, r3)     // Catch: java.lang.Throwable -> L79
            if (r6 != r5) goto L6c
            goto L92
        L6c:
            r6 = r14
            r14 = r4
        L6e:
            r4 = r3
            r2 = r1
            r1 = r14
            r14 = r6
            r6 = r7
            goto L81
        L74:
            r11 = r6
            r6 = r14
            r14 = r4
            r4 = r11
            goto L7b
        L79:
            r6 = move-exception
            goto L74
        L7b:
            r11 = r1
            r1 = r14
            r14 = r6
            r6 = r4
            r4 = r3
            r2 = r11
        L81:
            boolean r9 = r6 instanceof kotlinx.coroutines.TimeoutCancellationException     // Catch: java.lang.Throwable -> L89
            if (r9 == 0) goto L8b
            r14.invoke()     // Catch: java.lang.Throwable -> L89
            goto L93
        L89:
            r14 = move-exception
            goto L97
        L8b:
            if (r6 != 0) goto L96
            java.lang.Object r1 = r1.X     // Catch: java.lang.Throwable -> L89
            if (r1 == 0) goto L93
            r5 = r1
        L92:
            return r5
        L93:
            r1 = r2
            r3 = r4
            goto L4c
        L96:
            throw r6     // Catch: java.lang.Throwable -> L89
        L97:
            java.lang.Object r0 = r1.X
            androidx.room.coroutines.ConnectionWithLock r0 = (androidx.room.coroutines.ConnectionWithLock) r0
            if (r0 == 0) goto L9e
            throw r7
        L9e:
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.coroutines.Pool$acquireWithTimeout$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
