package androidx.paging;

import android.util.Log;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001¨\u0006\u0004"}, d2 = {"Landroidx/paging/PageFetcherSnapshot;", "", "Key", "Value", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PageFetcherSnapshot<Key, Value> {

    /* JADX INFO: renamed from: androidx.paging.PageFetcherSnapshot$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Key", "", "Value", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    final class AnonymousClass1 extends Lambda implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Object invoke() {
            return Unit.f43263a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7837a;

        static {
            int[] iArr = new int[LoadType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f7837a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:106:?, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:?, code lost:
    
        throw null;
     */
    /* JADX WARN: Type inference failed for: r8v2, types: [int, kotlinx.coroutines.sync.Mutex] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(androidx.paging.PageFetcherSnapshot r5, androidx.paging.LoadType r6, androidx.paging.GenerationalViewportHint r7, kotlin.coroutines.Continuation r8) {
        /*
            Method dump skipped, instruction units count: 610
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcherSnapshot.a(androidx.paging.PageFetcherSnapshot, androidx.paging.LoadType, androidx.paging.GenerationalViewportHint, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final Object b(PageFetcherSnapshot pageFetcherSnapshot, LoadType loadType, ViewportHint viewportHint, Continuation continuation) {
        pageFetcherSnapshot.getClass();
        int i2 = WhenMappings.f7837a[loadType.ordinal()];
        Unit unit = Unit.f43263a;
        if (i2 == 1) {
            pageFetcherSnapshot.c((ContinuationImpl) continuation);
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            return unit;
        }
        if (viewportHint != null) {
            throw null;
        }
        throw new IllegalStateException("Cannot retry APPEND / PREPEND load on PagingSource without ViewportHint");
    }

    public static String d(LoadType loadType, Object obj, PagingSource.LoadResult loadResult) {
        if (loadResult == null) {
            return "End " + loadType + " with loadkey " + obj + ". Load CANCELLED.";
        }
        return "End " + loadType + " with loadKey " + obj + ". Returned " + loadResult;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Type inference failed for: r2v1, types: [int, kotlinx.coroutines.sync.Mutex] */
    public final Object c(ContinuationImpl continuationImpl) {
        PageFetcherSnapshot$doInitialLoad$1 pageFetcherSnapshot$doInitialLoad$1;
        Mutex mutex;
        if (continuationImpl instanceof PageFetcherSnapshot$doInitialLoad$1) {
            pageFetcherSnapshot$doInitialLoad$1 = (PageFetcherSnapshot$doInitialLoad$1) continuationImpl;
            int i2 = pageFetcherSnapshot$doInitialLoad$1.h0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pageFetcherSnapshot$doInitialLoad$1.h0 = i2 - Integer.MIN_VALUE;
            } else {
                pageFetcherSnapshot$doInitialLoad$1 = new PageFetcherSnapshot$doInitialLoad$1(this, continuationImpl);
            }
        } else {
            pageFetcherSnapshot$doInitialLoad$1 = new PageFetcherSnapshot$doInitialLoad$1(this, continuationImpl);
        }
        Object obj = pageFetcherSnapshot$doInitialLoad$1.f0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        ?? r2 = pageFetcherSnapshot$doInitialLoad$1.h0;
        Unit unit = Unit.f43263a;
        try {
            try {
                switch (r2) {
                    case 0:
                        ResultKt.b(obj);
                        throw null;
                    case 1:
                        Mutex mutex2 = (Mutex) pageFetcherSnapshot$doInitialLoad$1.Z;
                        PageFetcherSnapshotState.Holder holder = (PageFetcherSnapshotState.Holder) pageFetcherSnapshot$doInitialLoad$1.f7843Y;
                        PageFetcherSnapshot pageFetcherSnapshot = (PageFetcherSnapshot) pageFetcherSnapshot$doInitialLoad$1.X;
                        ResultKt.b(obj);
                        holder.getClass();
                        pageFetcherSnapshot$doInitialLoad$1.X = pageFetcherSnapshot;
                        pageFetcherSnapshot$doInitialLoad$1.f7843Y = mutex2;
                        pageFetcherSnapshot$doInitialLoad$1.Z = null;
                        pageFetcherSnapshot$doInitialLoad$1.h0 = 2;
                        pageFetcherSnapshot.getClass();
                        throw null;
                    case 2:
                        Mutex mutex3 = (Mutex) pageFetcherSnapshot$doInitialLoad$1.f7843Y;
                        ResultKt.b(obj);
                        mutex3.b(null);
                        throw null;
                    case 3:
                        PageFetcherSnapshot pageFetcherSnapshot2 = (PageFetcherSnapshot) pageFetcherSnapshot$doInitialLoad$1.X;
                        ResultKt.b(obj);
                        PagingSource.LoadResult loadResult = (PagingSource.LoadResult) obj;
                        if (loadResult instanceof PagingSource.LoadResult.Page) {
                            pageFetcherSnapshot2.getClass();
                            throw null;
                        }
                        if (loadResult instanceof PagingSource.LoadResult.Error) {
                            if (Log.isLoggable("Paging", 2)) {
                                throw null;
                            }
                            pageFetcherSnapshot2.getClass();
                            throw null;
                        }
                        if (!(loadResult instanceof PagingSource.LoadResult.Invalid)) {
                            return unit;
                        }
                        if (Log.isLoggable("Paging", 2)) {
                            throw null;
                        }
                        pageFetcherSnapshot2.getClass();
                        throw null;
                    case 4:
                        MutexImpl mutexImpl = pageFetcherSnapshot$doInitialLoad$1.e0;
                        PageFetcherSnapshotState.Holder holder2 = (PageFetcherSnapshotState.Holder) pageFetcherSnapshot$doInitialLoad$1.Z;
                        PagingSource.LoadResult loadResult2 = (PagingSource.LoadResult) pageFetcherSnapshot$doInitialLoad$1.f7843Y;
                        ResultKt.b(obj);
                        try {
                            holder2.getClass();
                            throw null;
                        } catch (Throwable th) {
                            mutexImpl.b(null);
                            throw th;
                        }
                    case 5:
                        MutexImpl mutexImpl2 = pageFetcherSnapshot$doInitialLoad$1.e0;
                        PageFetcherSnapshotState.Holder holder3 = (PageFetcherSnapshotState.Holder) pageFetcherSnapshot$doInitialLoad$1.Z;
                        PagingSource.LoadResult loadResult3 = (PagingSource.LoadResult) pageFetcherSnapshot$doInitialLoad$1.f7843Y;
                        PageFetcherSnapshot pageFetcherSnapshot3 = (PageFetcherSnapshot) pageFetcherSnapshot$doInitialLoad$1.X;
                        ResultKt.b(obj);
                        holder3.getClass();
                        pageFetcherSnapshot3.getClass();
                        throw null;
                    case 6:
                        Mutex mutex4 = (Mutex) pageFetcherSnapshot$doInitialLoad$1.Z;
                        ResultKt.b(obj);
                        mutex4.b(null);
                        throw null;
                    case 7:
                        MutexImpl mutexImpl3 = pageFetcherSnapshot$doInitialLoad$1.e0;
                        PageFetcherSnapshotState.Holder holder4 = (PageFetcherSnapshotState.Holder) pageFetcherSnapshot$doInitialLoad$1.Z;
                        PageFetcherSnapshot pageFetcherSnapshot4 = (PageFetcherSnapshot) pageFetcherSnapshot$doInitialLoad$1.X;
                        ResultKt.b(obj);
                        try {
                            holder4.getClass();
                            pageFetcherSnapshot4.getClass();
                            throw null;
                        } catch (Throwable th2) {
                            mutexImpl3.b(null);
                            throw th2;
                        }
                    case 8:
                        MutexImpl mutexImpl4 = pageFetcherSnapshot$doInitialLoad$1.e0;
                        PageFetcherSnapshotState.Holder holder5 = (PageFetcherSnapshotState.Holder) pageFetcherSnapshot$doInitialLoad$1.Z;
                        PagingSource.LoadResult loadResult4 = (PagingSource.LoadResult) pageFetcherSnapshot$doInitialLoad$1.f7843Y;
                        PageFetcherSnapshot pageFetcherSnapshot5 = (PageFetcherSnapshot) pageFetcherSnapshot$doInitialLoad$1.X;
                        ResultKt.b(obj);
                        try {
                            holder5.getClass();
                            new LoadState.Error(((PagingSource.LoadResult.Error) loadResult4).X);
                            pageFetcherSnapshot$doInitialLoad$1.X = mutexImpl4;
                            pageFetcherSnapshot$doInitialLoad$1.f7843Y = null;
                            pageFetcherSnapshot$doInitialLoad$1.Z = null;
                            pageFetcherSnapshot$doInitialLoad$1.e0 = null;
                            pageFetcherSnapshot$doInitialLoad$1.h0 = 9;
                            pageFetcherSnapshot5.getClass();
                            throw null;
                        } catch (Throwable th3) {
                            th = th3;
                            mutex = mutexImpl4;
                        }
                        break;
                    case 9:
                        mutex = (Mutex) pageFetcherSnapshot$doInitialLoad$1.X;
                        try {
                            ResultKt.b(obj);
                            mutex.b(null);
                            return unit;
                        } catch (Throwable th4) {
                            th = th4;
                        }
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutex.b(null);
                throw th;
            } catch (Throwable th5) {
                r2.b(null);
                throw th5;
            }
        } catch (Throwable th6) {
            r2.b(null);
            throw th6;
        }
    }

    public final Object e(PageFetcherSnapshotState pageFetcherSnapshotState, LoadType loadType, int i2, int i3) {
        pageFetcherSnapshotState.getClass();
        int iOrdinal = loadType.ordinal();
        if (iOrdinal == 0) {
            throw new IllegalArgumentException("Cannot get loadId for loadType: REFRESH");
        }
        if (iOrdinal != 1 && iOrdinal != 2) {
            throw new NoWhenBranchMatchedException();
        }
        if (i2 != 0) {
            return null;
        }
        throw null;
    }
}
