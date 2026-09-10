package androidx.datastore.core;

import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/datastore/core/MultiProcessCoordinator;", "Landroidx/datastore/core/InterProcessCoordinator;", "Companion", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MultiProcessCoordinator implements InterProcessCoordinator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineContext f4663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f4664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Flow f4665c;
    public final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f4666e;
    public final String f;
    public final MutexImpl g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Lazy f4667h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Lazy f4668i;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082D¢\u0006\u0006\n\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/datastore/core/MultiProcessCoordinator$Companion;", "", "", "DEADLOCK_ERROR_MESSAGE", "Ljava/lang/String;", "", "INITIAL_WAIT_MILLIS", "J", "MAX_WAIT_MILLIS", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Can't wrap try/catch for region: R(4:31|17|18|33) */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
        
            r2 = r0.getMessage();
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
        
            if (r2 == null) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0068, code lost:
        
            r13.X = r12;
            r13.f4669Y = r4;
            r13.e0 = 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0072, code lost:
        
            if (kotlinx.coroutines.DelayKt.a(r4, r13) == r1) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0079, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
        
            return r1;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0072 -> B:27:0x0075). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static final java.lang.Object a(java.io.FileOutputStream r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) throws java.io.IOException {
            /*
                boolean r0 = r13 instanceof androidx.datastore.core.MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1
                if (r0 == 0) goto L13
                r0 = r13
                androidx.datastore.core.MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1 r0 = (androidx.datastore.core.MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1) r0
                int r1 = r0.e0
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.e0 = r1
                goto L18
            L13:
                androidx.datastore.core.MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1 r0 = new androidx.datastore.core.MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1
                r0.<init>(r13)
            L18:
                java.lang.Object r13 = r0.Z
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.X
                int r2 = r0.e0
                r3 = 1
                if (r2 == 0) goto L34
                if (r2 != r3) goto L2c
                long r4 = r0.f4669Y
                java.io.FileOutputStream r12 = r0.X
                kotlin.ResultKt.b(r13)
                r13 = r0
                goto L75
            L2c:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r13)
                throw r12
            L34:
                kotlin.ResultKt.b(r13)
                r4 = 10
                r13 = r0
            L3a:
                r6 = 60000(0xea60, double:2.9644E-319)
                int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            */
            //  java.lang.String r2 = "lockFileStream.getChanne…LUE, /* shared= */ false)"
            /*
                if (r0 > 0) goto L7a
                java.nio.channels.FileChannel r6 = r12.getChannel()     // Catch: java.io.IOException -> L58
                r7 = 0
                r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r11 = 0
                java.nio.channels.FileLock r0 = r6.lock(r7, r9, r11)     // Catch: java.io.IOException -> L58
                kotlin.jvm.internal.Intrinsics.e(r0, r2)     // Catch: java.io.IOException -> L58
                r1 = r0
                goto L8d
            L58:
                r0 = move-exception
                java.lang.String r2 = r0.getMessage()
                if (r2 == 0) goto L79
                r6 = 0
                java.lang.String r7 = "Resource deadlock would occur"
                boolean r2 = kotlin.text.StringsKt.l(r2, r7, r6)
                if (r2 != r3) goto L79
                r13.X = r12
                r13.f4669Y = r4
                r13.e0 = r3
                java.lang.Object r0 = kotlinx.coroutines.DelayKt.a(r4, r13)
                if (r0 != r1) goto L75
                goto L8d
            L75:
                r0 = 2
                long r6 = (long) r0
                long r4 = r4 * r6
                goto L3a
            L79:
                throw r0
            L7a:
                java.nio.channels.FileChannel r6 = r12.getChannel()
                r7 = 0
                r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r11 = 0
                java.nio.channels.FileLock r1 = r6.lock(r7, r9, r11)
                kotlin.jvm.internal.Intrinsics.e(r1, r2)
            L8d:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.MultiProcessCoordinator.Companion.a(java.io.FileOutputStream, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
        }
    }

    public MultiProcessCoordinator(CoroutineContext context, File file) {
        Intrinsics.f(context, "context");
        Intrinsics.f(file, "file");
        this.f4663a = context;
        this.f4664b = file;
        Object obj = MulticastFileObserver.f4672b;
        this.f4665c = FlowKt.f(new MulticastFileObserver$Companion$observe$1(file, null));
        this.d = ".lock";
        this.f4666e = ".version";
        this.f = "fcntl failed: EAGAIN";
        this.g = MutexKt.a();
        this.f4667h = LazyKt.b(new Function0<File>() { // from class: androidx.datastore.core.MultiProcessCoordinator$lockFile$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() throws IOException {
                MultiProcessCoordinator multiProcessCoordinator = this.X;
                File file2 = new File(multiProcessCoordinator.f4664b.getAbsolutePath() + multiProcessCoordinator.d);
                MultiProcessCoordinator.f(multiProcessCoordinator, file2);
                return file2;
            }
        });
        this.f4668i = LazyKt.b(new Function0<SharedCounter>() { // from class: androidx.datastore.core.MultiProcessCoordinator$lazySharedCounter$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() throws Throwable {
                ParcelFileDescriptor parcelFileDescriptorOpen;
                System.loadLibrary("datastore_shared_counter");
                final MultiProcessCoordinator multiProcessCoordinator = this.X;
                try {
                    parcelFileDescriptorOpen = ParcelFileDescriptor.open((File) new Function0<File>() { // from class: androidx.datastore.core.MultiProcessCoordinator$lazySharedCounter$1.1
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() throws IOException {
                            MultiProcessCoordinator multiProcessCoordinator2 = multiProcessCoordinator;
                            File file2 = new File(multiProcessCoordinator2.f4664b.getAbsolutePath() + multiProcessCoordinator2.f4666e);
                            MultiProcessCoordinator.f(multiProcessCoordinator2, file2);
                            return file2;
                        }
                    }.invoke(), 939524096);
                    try {
                        int fd = parcelFileDescriptorOpen.getFd();
                        NativeSharedCounter nativeSharedCounter = SharedCounter.f4681b;
                        if (nativeSharedCounter.nativeTruncateFile(fd) != 0) {
                            throw new IOException("Failed to truncate counter file");
                        }
                        long jNativeCreateSharedCounter = nativeSharedCounter.nativeCreateSharedCounter(fd);
                        if (jNativeCreateSharedCounter < 0) {
                            throw new IOException("Failed to mmap counter file");
                        }
                        SharedCounter sharedCounter = new SharedCounter(jNativeCreateSharedCounter);
                        parcelFileDescriptorOpen.close();
                        return sharedCounter;
                    } catch (Throwable th) {
                        th = th;
                        if (parcelFileDescriptorOpen != null) {
                            parcelFileDescriptorOpen.close();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    parcelFileDescriptorOpen = null;
                }
            }
        });
    }

    public static final void f(MultiProcessCoordinator multiProcessCoordinator, File file) throws IOException {
        multiProcessCoordinator.getClass();
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                throw new IOException(android.support.v4.media.a.l(file, "Unable to create parent directories of "));
            }
        }
        if (file.exists()) {
            return;
        }
        file.createNewFile();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006f  */
    /* JADX WARN: Code duplicated, block: B:60:0x00de A[Catch: all -> 0x00e2, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00e2, blocks: (B:60:0x00de, B:72:0x00f9, B:73:0x00fc), top: B:85:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:72:0x00f9 A[Catch: all -> 0x00e2, TRY_ENTER, TryCatch #1 {all -> 0x00e2, blocks: (B:60:0x00de, B:72:0x00f9, B:73:0x00fc), top: B:85:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:81:0x0108  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.datastore.core.MultiProcessCoordinator$tryLock$1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r5v0, types: [int, java.io.Closeable] */
    @Override // androidx.datastore.core.InterProcessCoordinator
    public final Object a(Function2 function2, ContinuationImpl continuationImpl) throws Throwable {
        ?? multiProcessCoordinator$tryLock$1;
        String message;
        FileLock fileLockTryLock;
        FileLock fileLock;
        MutexImpl mutexImpl;
        boolean z2;
        FileInputStream fileInputStream;
        MutexImpl mutexImpl2;
        boolean z3;
        ?? r2 = function2;
        if (continuationImpl instanceof MultiProcessCoordinator$tryLock$1) {
            MultiProcessCoordinator$tryLock$1 multiProcessCoordinator$tryLock$2 = (MultiProcessCoordinator$tryLock$1) continuationImpl;
            int i2 = multiProcessCoordinator$tryLock$2.h0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                multiProcessCoordinator$tryLock$2.h0 = i2 - Integer.MIN_VALUE;
                multiProcessCoordinator$tryLock$1 = multiProcessCoordinator$tryLock$2;
            } else {
                multiProcessCoordinator$tryLock$1 = new MultiProcessCoordinator$tryLock$1(this, continuationImpl);
            }
        } else {
            multiProcessCoordinator$tryLock$1 = new MultiProcessCoordinator$tryLock$1(this, continuationImpl);
        }
        Object objInvoke = multiProcessCoordinator$tryLock$1.f0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        ?? r5 = multiProcessCoordinator$tryLock$1.h0;
        try {
            try {
                if (r5 != 0) {
                    if (r5 == 1) {
                        z3 = multiProcessCoordinator$tryLock$1.e0;
                        mutexImpl2 = multiProcessCoordinator$tryLock$1.X;
                        ResultKt.b(objInvoke);
                        if (z3) {
                            mutexImpl2.b(null);
                        }
                        return objInvoke;
                    }
                    if (r5 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z2 = multiProcessCoordinator$tryLock$1.e0;
                    fileLock = multiProcessCoordinator$tryLock$1.Z;
                    fileInputStream = multiProcessCoordinator$tryLock$1.f4671Y;
                    mutexImpl = multiProcessCoordinator$tryLock$1.X;
                    try {
                        ResultKt.b(objInvoke);
                        if (fileLock != null) {
                            fileLock.release();
                        }
                        kotlin.io.CloseableKt.a(fileInputStream, null);
                        if (z2) {
                            mutexImpl.b(null);
                        }
                        return objInvoke;
                    } catch (Throwable th) {
                        th = th;
                        if (fileLock != null) {
                            fileLock.release();
                        }
                        throw th;
                    }
                }
                ResultKt.b(objInvoke);
                MutexImpl mutexImpl3 = this.g;
                boolean zTryLock = mutexImpl3.tryLock();
                try {
                    if (zTryLock) {
                        FileInputStream fileInputStream2 = new FileInputStream((File) this.f4667h.getX());
                        try {
                            try {
                                fileLockTryLock = fileInputStream2.getChannel().tryLock(0L, Long.MAX_VALUE, true);
                            } catch (IOException e2) {
                                String message2 = e2.getMessage();
                                if ((message2 == null || !StringsKt.M(message2, this.f, false)) && ((message = e2.getMessage()) == null || !StringsKt.M(message, "Resource deadlock would occur", false))) {
                                    throw e2;
                                }
                                fileLockTryLock = null;
                            }
                            try {
                                Boolean boolValueOf = Boolean.valueOf(fileLockTryLock != null);
                                multiProcessCoordinator$tryLock$1.X = mutexImpl3;
                                multiProcessCoordinator$tryLock$1.f4671Y = fileInputStream2;
                                multiProcessCoordinator$tryLock$1.Z = fileLockTryLock;
                                multiProcessCoordinator$tryLock$1.e0 = zTryLock;
                                multiProcessCoordinator$tryLock$1.h0 = 2;
                                objInvoke = r2.invoke(boolValueOf, multiProcessCoordinator$tryLock$1);
                                if (objInvoke != coroutineSingletons) {
                                    mutexImpl = mutexImpl3;
                                    z2 = zTryLock;
                                    fileInputStream = fileInputStream2;
                                    fileLock = fileLockTryLock;
                                    if (fileLock != null) {
                                        fileLock.release();
                                    }
                                    kotlin.io.CloseableKt.a(fileInputStream, null);
                                    if (z2) {
                                        mutexImpl.b(null);
                                    }
                                    return objInvoke;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                fileLock = fileLockTryLock;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            fileLock = null;
                            if (fileLock != null) {
                                fileLock.release();
                            }
                            throw th;
                        }
                    } else {
                        Boolean bool = Boolean.FALSE;
                        multiProcessCoordinator$tryLock$1.X = mutexImpl3;
                        multiProcessCoordinator$tryLock$1.e0 = zTryLock;
                        multiProcessCoordinator$tryLock$1.h0 = 1;
                        objInvoke = r2.invoke(bool, multiProcessCoordinator$tryLock$1);
                        if (objInvoke != coroutineSingletons) {
                            mutexImpl2 = mutexImpl3;
                            z3 = zTryLock;
                            if (z3) {
                                mutexImpl2.b(null);
                            }
                            return objInvoke;
                        }
                    }
                    return coroutineSingletons;
                } catch (Throwable th4) {
                    th = th4;
                    multiProcessCoordinator$tryLock$1 = mutexImpl3;
                    r2 = zTryLock;
                    if (r2 != 0) {
                        multiProcessCoordinator$tryLock$1.b(null);
                    }
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Throwable th6) {
            ?? r4 = multiProcessCoordinator$tryLock$1;
            try {
                throw th6;
            } catch (Throwable th7) {
                try {
                    kotlin.io.CloseableKt.a(r5, th6);
                    throw th7;
                } catch (Throwable th8) {
                    th = th8;
                    r2 = r2;
                    multiProcessCoordinator$tryLock$1 = r4;
                    if (r2 != 0) {
                        multiProcessCoordinator$tryLock$1.b(null);
                    }
                    throw th;
                }
            }
        }
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Flow getF4665c() {
        return this.f4665c;
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    public final Object c(ContinuationImpl continuationImpl) {
        if (this.f4668i.isInitialized()) {
            return new Integer(SharedCounter.f4681b.nativeGetCounterValue(g().f4682a));
        }
        return BuildersKt.f(this.f4663a, new MultiProcessCoordinator$getVersion$$inlined$withLazyCounter$1(this, null), continuationImpl);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00bb A[Catch: all -> 0x00bf, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x00bf, blocks: (B:42:0x00bb, B:57:0x00da, B:58:0x00dd), top: B:66:0x0022, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00da A[Catch: all -> 0x00bf, TRY_ENTER, TryCatch #7 {all -> 0x00bf, blocks: (B:42:0x00bb, B:57:0x00da, B:58:0x00dd), top: B:66:0x0022, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.io.Closeable, java.lang.Object, kotlin.coroutines.intrinsics.CoroutineSingletons] */
    @Override // androidx.datastore.core.InterProcessCoordinator
    public final Object d(Function1 function1, ContinuationImpl continuationImpl) throws Throwable {
        MultiProcessCoordinator$lock$1 multiProcessCoordinator$lock$1;
        Mutex mutex;
        MultiProcessCoordinator multiProcessCoordinator;
        FileOutputStream fileOutputStream;
        Throwable th;
        Function1 function2;
        java.io.Closeable closeable;
        Mutex mutex2;
        ?? r10;
        FileLock fileLock;
        FileLock fileLock2;
        Object objInvoke;
        java.io.Closeable closeable2;
        ?? r11;
        Mutex mutex3;
        if (continuationImpl instanceof MultiProcessCoordinator$lock$1) {
            multiProcessCoordinator$lock$1 = (MultiProcessCoordinator$lock$1) continuationImpl;
            int i2 = multiProcessCoordinator$lock$1.g0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                multiProcessCoordinator$lock$1.g0 = i2 - Integer.MIN_VALUE;
            } else {
                multiProcessCoordinator$lock$1 = new MultiProcessCoordinator$lock$1(this, continuationImpl);
            }
        } else {
            multiProcessCoordinator$lock$1 = new MultiProcessCoordinator$lock$1(this, continuationImpl);
        }
        ?? r12 = multiProcessCoordinator$lock$1.e0;
        ?? r1 = CoroutineSingletons.X;
        int i3 = multiProcessCoordinator$lock$1.g0;
        try {
            try {
                try {
                    if (i3 == 0) {
                        ResultKt.b(r12);
                        mutex = this.g;
                        multiProcessCoordinator$lock$1.X = this;
                        multiProcessCoordinator$lock$1.f4670Y = function1;
                        multiProcessCoordinator$lock$1.Z = mutex;
                        multiProcessCoordinator$lock$1.g0 = 1;
                        if (mutex.a(multiProcessCoordinator$lock$1) != r1) {
                            multiProcessCoordinator = this;
                        }
                        return r1;
                    }
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            fileLock = (FileLock) multiProcessCoordinator$lock$1.Z;
                            closeable2 = (java.io.Closeable) multiProcessCoordinator$lock$1.f4670Y;
                            mutex3 = (Mutex) multiProcessCoordinator$lock$1.X;
                            try {
                                ResultKt.b(r12);
                                r11 = r12;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                try {
                                    kotlin.io.CloseableKt.a(closeable2, null);
                                    mutex3.b(null);
                                    return r11;
                                } catch (Throwable th2) {
                                    th = th2;
                                    r12 = mutex3;
                                    r12.b(null);
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                throw th;
                            }
                        }
                        closeable = (java.io.Closeable) multiProcessCoordinator$lock$1.Z;
                        mutex2 = (Mutex) multiProcessCoordinator$lock$1.f4670Y;
                        function2 = (Function1) multiProcessCoordinator$lock$1.X;
                        try {
                            ResultKt.b(r12);
                            r10 = r12;
                            fileLock2 = (FileLock) r10;
                            try {
                                multiProcessCoordinator$lock$1.X = mutex2;
                                multiProcessCoordinator$lock$1.f4670Y = closeable;
                                multiProcessCoordinator$lock$1.Z = fileLock2;
                                multiProcessCoordinator$lock$1.g0 = 3;
                                objInvoke = function2.invoke(multiProcessCoordinator$lock$1);
                                if (objInvoke != r1) {
                                    closeable2 = closeable;
                                    fileLock = fileLock2;
                                    r11 = objInvoke;
                                    mutex3 = mutex2;
                                    if (fileLock != null) {
                                        fileLock.release();
                                    }
                                    kotlin.io.CloseableKt.a(closeable2, null);
                                    mutex3.b(null);
                                    return r11;
                                }
                                return r1;
                            } catch (Throwable th4) {
                                fileLock = fileLock2;
                                th = th4;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                throw th;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            fileLock = null;
                            if (fileLock != null) {
                                fileLock.release();
                            }
                            throw th;
                        }
                    }
                    Mutex mutex4 = (Mutex) multiProcessCoordinator$lock$1.Z;
                    Function1 function3 = (Function1) multiProcessCoordinator$lock$1.f4670Y;
                    multiProcessCoordinator = (MultiProcessCoordinator) multiProcessCoordinator$lock$1.X;
                    ResultKt.b(r12);
                    mutex = mutex4;
                    function1 = function3;
                    multiProcessCoordinator$lock$1.X = function1;
                    multiProcessCoordinator$lock$1.f4670Y = mutex;
                    multiProcessCoordinator$lock$1.Z = fileOutputStream;
                    multiProcessCoordinator$lock$1.g0 = 2;
                    Object objA = Companion.a(fileOutputStream, multiProcessCoordinator$lock$1);
                    if (objA != r1) {
                        function2 = function1;
                        closeable = fileOutputStream;
                        mutex2 = mutex;
                        r10 = objA;
                        fileLock2 = (FileLock) r10;
                        multiProcessCoordinator$lock$1.X = mutex2;
                        multiProcessCoordinator$lock$1.f4670Y = closeable;
                        multiProcessCoordinator$lock$1.Z = fileLock2;
                        multiProcessCoordinator$lock$1.g0 = 3;
                        objInvoke = function2.invoke(multiProcessCoordinator$lock$1);
                        if (objInvoke != r1) {
                            closeable2 = closeable;
                            fileLock = fileLock2;
                            r11 = objInvoke;
                            mutex3 = mutex2;
                            if (fileLock != null) {
                                fileLock.release();
                            }
                            kotlin.io.CloseableKt.a(closeable2, null);
                            mutex3.b(null);
                            return r11;
                        }
                    }
                    return r1;
                } catch (Throwable th6) {
                    th = th6;
                    fileLock = null;
                    if (fileLock != null) {
                        fileLock.release();
                    }
                    throw th;
                }
                fileOutputStream = new FileOutputStream((File) multiProcessCoordinator.f4667h.getX());
            } catch (Throwable th7) {
                r12 = multiProcessCoordinator$lock$1;
                try {
                    throw th7;
                } catch (Throwable th8) {
                    kotlin.io.CloseableKt.a(r1, th7);
                    throw th8;
                }
            }
        } catch (Throwable th9) {
            th = th9;
        }
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    public final Object e(Continuation continuation) {
        if (this.f4668i.isInitialized()) {
            return new Integer(SharedCounter.f4681b.nativeIncrementAndGetCounterValue(g().f4682a));
        }
        return BuildersKt.f(this.f4663a, new MultiProcessCoordinator$incrementAndGetVersion$$inlined$withLazyCounter$1(this, null), continuation);
    }

    public final SharedCounter g() {
        return (SharedCounter) this.f4668i.getX();
    }
}
