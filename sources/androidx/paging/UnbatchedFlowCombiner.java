package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function4;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/paging/UnbatchedFlowCombiner;", "T1", "T2", "", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class UnbatchedFlowCombiner<T1, T2> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SuspendLambda f7889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CompletableDeferred f7890b = CompletableDeferredKt.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MutexImpl f7891c = MutexKt.a();
    public final CompletableDeferred[] d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object[] f7892e;

    /* JADX WARN: Multi-variable type inference failed */
    public UnbatchedFlowCombiner(Function4 function4) {
        this.f7889a = (SuspendLambda) function4;
        CompletableDeferred[] completableDeferredArr = new CompletableDeferred[2];
        for (int i2 = 0; i2 < 2; i2++) {
            completableDeferredArr[i2] = CompletableDeferredKt.a();
        }
        this.d = completableDeferredArr;
        Object[] objArr = new Object[2];
        for (int i3 = 0; i3 < 2; i3++) {
            objArr[i3] = FlowExtKt.f7790a;
        }
        this.f7892e = objArr;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b2 A[Catch: all -> 0x00b7, LOOP:0: B:36:0x00a5->B:42:0x00b2, LOOP_END, TryCatch #0 {all -> 0x00b7, blocks: (B:34:0x00a0, B:39:0x00ab, B:46:0x00bd, B:48:0x00c3, B:51:0x00c8, B:53:0x00cd, B:57:0x00d7, B:55:0x00d2, B:56:0x00d5, B:42:0x00b2), top: B:67:0x00a0 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00c3 A[Catch: all -> 0x00b7, TryCatch #0 {all -> 0x00b7, blocks: (B:34:0x00a0, B:39:0x00ab, B:46:0x00bd, B:48:0x00c3, B:51:0x00c8, B:53:0x00cd, B:57:0x00d7, B:55:0x00d2, B:56:0x00d5, B:42:0x00b2), top: B:67:0x00a0 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00c8 A[Catch: all -> 0x00b7, LOOP:1: B:47:0x00c1->B:51:0x00c8, LOOP_END, TryCatch #0 {all -> 0x00b7, blocks: (B:34:0x00a0, B:39:0x00ab, B:46:0x00bd, B:48:0x00c3, B:51:0x00c8, B:53:0x00cd, B:57:0x00d7, B:55:0x00d2, B:56:0x00d5, B:42:0x00b2), top: B:67:0x00a0 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00cd A[Catch: all -> 0x00b7, TryCatch #0 {all -> 0x00b7, blocks: (B:34:0x00a0, B:39:0x00ab, B:46:0x00bd, B:48:0x00c3, B:51:0x00c8, B:53:0x00cd, B:57:0x00d7, B:55:0x00d2, B:56:0x00d5, B:42:0x00b2), top: B:67:0x00a0 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00d0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x00d2 A[Catch: all -> 0x00b7, TryCatch #0 {all -> 0x00b7, blocks: (B:34:0x00a0, B:39:0x00ab, B:46:0x00bd, B:48:0x00c3, B:51:0x00c8, B:53:0x00cd, B:57:0x00d7, B:55:0x00d2, B:56:0x00d5, B:42:0x00b2), top: B:67:0x00a0 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00d5 A[Catch: all -> 0x00b7, TryCatch #0 {all -> 0x00b7, blocks: (B:34:0x00a0, B:39:0x00ab, B:46:0x00bd, B:48:0x00c3, B:51:0x00c8, B:53:0x00cd, B:57:0x00d7, B:55:0x00d2, B:56:0x00d5, B:42:0x00b2), top: B:67:0x00a0 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x00af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007e, code lost:
    
        if (r2.r(r3) == r4) goto L59;
     */
    /* JADX WARN: Type inference failed for: r7v4, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function4] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(int r17, java.lang.Object r18, kotlin.coroutines.jvm.internal.ContinuationImpl r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.UnbatchedFlowCombiner.a(int, java.lang.Object, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
