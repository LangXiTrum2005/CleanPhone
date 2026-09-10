package androidx.datastore.core;

import android.os.Build;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.File;
import java.io.IOException;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/datastore/core/FileStorageConnection;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/datastore/core/StorageConnection;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FileStorageConnection<T> implements StorageConnection<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f4652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Serializer f4653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterProcessCoordinator f4654c;
    public final Function0 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f4655e;
    public final MutexImpl f;

    public FileStorageConnection(File file, Serializer serializer, InterProcessCoordinator coordinator, Function0 function0) {
        Intrinsics.f(serializer, "serializer");
        Intrinsics.f(coordinator, "coordinator");
        this.f4652a = file;
        this.f4653b = serializer;
        this.f4654c = coordinator;
        this.d = function0;
        this.f4655e = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f = MutexKt.a();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0074 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0076  */
    /* JADX WARN: Code duplicated, block: B:33:0x007c A[Catch: all -> 0x007d, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x007d, blocks: (B:33:0x007c, B:43:0x008f, B:42:0x008c, B:39:0x0087), top: B:59:0x0020, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0097  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [androidx.datastore.core.FileStorageConnection] */
    /* JADX WARN: Type inference failed for: r0v13, types: [androidx.datastore.core.FileStorageConnection] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.datastore.core.FileStorageConnection$readScope$1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.datastore.core.FileStorageConnection] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.jvm.functions.Function3] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9, types: [androidx.datastore.core.StorageConnectionKt$readData$2] */
    @Override // androidx.datastore.core.StorageConnection
    public final Object b(Function3 function3, ContinuationImpl continuationImpl) throws Throwable {
        ?? fileStorageConnection$readScope$1;
        Throwable th;
        FileReadScope fileReadScope;
        ?? r8;
        ?? r0;
        if (continuationImpl instanceof FileStorageConnection$readScope$1) {
            FileStorageConnection$readScope$1 fileStorageConnection$readScope$2 = (FileStorageConnection$readScope$1) continuationImpl;
            int i2 = fileStorageConnection$readScope$2.g0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fileStorageConnection$readScope$2.g0 = i2 - Integer.MIN_VALUE;
                fileStorageConnection$readScope$1 = fileStorageConnection$readScope$2;
            } else {
                fileStorageConnection$readScope$1 = new FileStorageConnection$readScope$1(this, continuationImpl);
            }
        } else {
            fileStorageConnection$readScope$1 = new FileStorageConnection$readScope$1(this, continuationImpl);
        }
        Object obj = fileStorageConnection$readScope$1.e0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = fileStorageConnection$readScope$1.g0;
        try {
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function3 = fileStorageConnection$readScope$1.Z;
                fileReadScope = fileStorageConnection$readScope$1.f4656Y;
                fileStorageConnection$readScope$1 = fileStorageConnection$readScope$1.X;
                try {
                    ResultKt.b(obj);
                    r0 = fileStorageConnection$readScope$1;
                    r8 = function3;
                    try {
                        fileReadScope.close();
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    if (th == null) {
                        throw th;
                    }
                    if (r8 != 0) {
                        r0.f.b(null);
                    }
                    return obj;
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        fileReadScope.close();
                    } catch (Throwable th4) {
                        ExceptionsKt.a(th, th4);
                    }
                    throw th;
                }
            }
            ResultKt.b(obj);
            if (this.f4655e.get()) {
                throw new IllegalStateException("StorageConnection has already been disposed.");
            }
            boolean zTryLock = this.f.tryLock();
            try {
                FileReadScope fileReadScope2 = new FileReadScope(this.f4652a, this.f4653b);
                try {
                    Boolean boolValueOf = Boolean.valueOf(zTryLock);
                    fileStorageConnection$readScope$1.X = this;
                    fileStorageConnection$readScope$1.f4656Y = fileReadScope2;
                    fileStorageConnection$readScope$1.Z = zTryLock;
                    fileStorageConnection$readScope$1.g0 = 1;
                    Object objInvoke = ((StorageConnectionKt$readData$2) function3).invoke(fileReadScope2, boolValueOf, fileStorageConnection$readScope$1);
                    if (objInvoke == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = objInvoke;
                    r8 = zTryLock;
                    r0 = this;
                    fileReadScope = fileReadScope2;
                    fileReadScope.close();
                    th = null;
                    if (th == null) {
                        throw th;
                    }
                    if (r8 != 0) {
                        r0.f.b(null);
                    }
                    return obj;
                } catch (Throwable th5) {
                    th = th5;
                    function3 = zTryLock;
                    fileStorageConnection$readScope$1 = this;
                    fileReadScope = fileReadScope2;
                    fileReadScope.close();
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
                function3 = zTryLock;
                fileStorageConnection$readScope$1 = this;
                if (function3 != 0) {
                    fileStorageConnection$readScope$1.f.b(null);
                }
                throw th;
            }
        } catch (Throwable th7) {
            th = th7;
            if (function3 != 0) {
                fileStorageConnection$readScope$1.f.b(null);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00da A[Catch: all -> 0x0115, IOException -> 0x0117, TRY_ENTER, TryCatch #1 {IOException -> 0x0117, blocks: (B:43:0x00da, B:45:0x00e0, B:47:0x00e8, B:51:0x00f4, B:52:0x0114, B:48:0x00ed, B:59:0x0120, B:66:0x012d, B:65:0x012a), top: B:78:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00e0 A[Catch: all -> 0x0115, IOException -> 0x0117, TryCatch #1 {IOException -> 0x0117, blocks: (B:43:0x00da, B:45:0x00e0, B:47:0x00e8, B:51:0x00f4, B:52:0x0114, B:48:0x00ed, B:59:0x0120, B:66:0x012d, B:65:0x012a), top: B:78:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00e8 A[Catch: all -> 0x0115, IOException -> 0x0117, TryCatch #1 {IOException -> 0x0117, blocks: (B:43:0x00da, B:45:0x00e0, B:47:0x00e8, B:51:0x00f4, B:52:0x0114, B:48:0x00ed, B:59:0x0120, B:66:0x012d, B:65:0x012a), top: B:78:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00ed A[Catch: all -> 0x0115, IOException -> 0x0117, TryCatch #1 {IOException -> 0x0117, blocks: (B:43:0x00da, B:45:0x00e0, B:47:0x00e8, B:51:0x00f4, B:52:0x0114, B:48:0x00ed, B:59:0x0120, B:66:0x012d, B:65:0x012a), top: B:78:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f4 A[Catch: all -> 0x0115, IOException -> 0x0117, TryCatch #1 {IOException -> 0x0117, blocks: (B:43:0x00da, B:45:0x00e0, B:47:0x00e8, B:51:0x00f4, B:52:0x0114, B:48:0x00ed, B:59:0x0120, B:66:0x012d, B:65:0x012a), top: B:78:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0120 A[Catch: all -> 0x0115, IOException -> 0x0117, TRY_ENTER, TRY_LEAVE, TryCatch #1 {IOException -> 0x0117, blocks: (B:43:0x00da, B:45:0x00e0, B:47:0x00e8, B:51:0x00f4, B:52:0x0114, B:48:0x00ed, B:59:0x0120, B:66:0x012d, B:65:0x012a), top: B:78:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Instruction removed from duplicated block: B:51:0x00f4, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [int, kotlinx.coroutines.sync.Mutex] */
    @Override // androidx.datastore.core.StorageConnection
    public final Object c(Function2 function2, ContinuationImpl continuationImpl) throws IOException {
        FileStorageConnection$writeScope$1 fileStorageConnection$writeScope$1;
        File file;
        FileStorageConnection<T> fileStorageConnection;
        Mutex mutex;
        FileWriteScope fileWriteScope;
        Throwable th;
        FileWriteScope fileWriteScope2;
        File file2;
        FileStorageConnection<T> fileStorageConnection2;
        File file3;
        boolean zRenameTo;
        if (continuationImpl instanceof FileStorageConnection$writeScope$1) {
            fileStorageConnection$writeScope$1 = (FileStorageConnection$writeScope$1) continuationImpl;
            int i2 = fileStorageConnection$writeScope$1.h0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fileStorageConnection$writeScope$1.h0 = i2 - Integer.MIN_VALUE;
            } else {
                fileStorageConnection$writeScope$1 = new FileStorageConnection$writeScope$1(this, continuationImpl);
            }
        } else {
            fileStorageConnection$writeScope$1 = new FileStorageConnection$writeScope$1(this, continuationImpl);
        }
        Object obj = fileStorageConnection$writeScope$1.f0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        ?? r3 = fileStorageConnection$writeScope$1.h0;
        try {
            try {
                try {
                    try {
                        if (r3 == 0) {
                            ResultKt.b(obj);
                            if (this.f4655e.get()) {
                                throw new IllegalStateException("StorageConnection has already been disposed.");
                            }
                            File file4 = this.f4652a;
                            File parentFile = file4.getCanonicalFile().getParentFile();
                            if (parentFile != null) {
                                parentFile.mkdirs();
                                if (!parentFile.isDirectory()) {
                                    throw new IOException(android.support.v4.media.a.l(file4, "Unable to create parent directories of "));
                                }
                            }
                            MutexImpl mutexImpl = this.f;
                            fileStorageConnection$writeScope$1.X = this;
                            fileStorageConnection$writeScope$1.f4657Y = function2;
                            fileStorageConnection$writeScope$1.Z = mutexImpl;
                            fileStorageConnection$writeScope$1.h0 = 1;
                            if (mutexImpl.a(fileStorageConnection$writeScope$1) != coroutineSingletons) {
                                fileStorageConnection = this;
                                mutex = mutexImpl;
                            }
                            return coroutineSingletons;
                        }
                        if (r3 != 1) {
                            if (r3 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            fileWriteScope2 = fileStorageConnection$writeScope$1.e0;
                            File file5 = (File) fileStorageConnection$writeScope$1.Z;
                            mutex = (Mutex) fileStorageConnection$writeScope$1.f4657Y;
                            fileStorageConnection2 = fileStorageConnection$writeScope$1.X;
                            try {
                                ResultKt.b(obj);
                                file2 = file5;
                                try {
                                    fileWriteScope2.close();
                                    th = null;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                                if (th == null) {
                                    throw th;
                                }
                                if (file2.exists()) {
                                    file3 = fileStorageConnection2.f4652a;
                                    if (Build.VERSION.SDK_INT >= 26) {
                                        zRenameTo = Api26Impl.a(file2, file3);
                                    } else {
                                        zRenameTo = file2.renameTo(file3);
                                    }
                                    if (zRenameTo) {
                                        throw new IOException("Unable to rename " + file2 + " to " + fileStorageConnection2.f4652a + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                    }
                                }
                                mutex.b(null);
                                return Unit.f43263a;
                            } catch (Throwable th3) {
                                th = th3;
                                try {
                                    fileWriteScope2.close();
                                } catch (Throwable th4) {
                                    ExceptionsKt.a(th, th4);
                                }
                                throw th;
                            }
                        }
                        Mutex mutex2 = (Mutex) fileStorageConnection$writeScope$1.Z;
                        Function2 function3 = (Function2) fileStorageConnection$writeScope$1.f4657Y;
                        fileStorageConnection = fileStorageConnection$writeScope$1.X;
                        ResultKt.b(obj);
                        mutex = mutex2;
                        function2 = function3;
                        fileStorageConnection$writeScope$1.X = fileStorageConnection;
                        fileStorageConnection$writeScope$1.f4657Y = mutex;
                        fileStorageConnection$writeScope$1.Z = file;
                        fileStorageConnection$writeScope$1.e0 = fileWriteScope;
                        fileStorageConnection$writeScope$1.h0 = 2;
                        if (function2.invoke(fileWriteScope, fileStorageConnection$writeScope$1) != coroutineSingletons) {
                            file2 = file;
                            fileStorageConnection2 = fileStorageConnection;
                            fileWriteScope2 = fileWriteScope;
                            fileWriteScope2.close();
                            th = null;
                            if (th == null) {
                                throw th;
                            }
                            if (file2.exists()) {
                                file3 = fileStorageConnection2.f4652a;
                                if (Build.VERSION.SDK_INT >= 26) {
                                    zRenameTo = Api26Impl.a(file2, file3);
                                } else {
                                    zRenameTo = file2.renameTo(file3);
                                }
                                if (zRenameTo) {
                                    throw new IOException("Unable to rename " + file2 + " to " + fileStorageConnection2.f4652a + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                }
                            }
                            mutex.b(null);
                            return Unit.f43263a;
                        }
                        return coroutineSingletons;
                    } catch (Throwable th5) {
                        th = th5;
                        fileWriteScope2 = fileWriteScope;
                        fileWriteScope2.close();
                        throw th;
                    }
                    Serializer serializer = fileStorageConnection.f4653b;
                    Intrinsics.f(serializer, "serializer");
                    fileWriteScope = new FileWriteScope(file, serializer);
                } catch (IOException e2) {
                    e = e2;
                    if (file.exists()) {
                        file.delete();
                    }
                    throw e;
                }
                file = new File(fileStorageConnection.f4652a.getAbsolutePath() + ".tmp");
            } catch (Throwable th6) {
                r3.b(null);
                throw th6;
            }
        } catch (IOException e3) {
            e = e3;
            file = coroutineSingletons;
        }
    }

    @Override // androidx.datastore.core.Closeable
    public final void close() {
        this.f4655e.set(true);
        this.d.invoke();
    }

    @Override // androidx.datastore.core.StorageConnection
    /* JADX INFO: renamed from: e, reason: from getter */
    public final InterProcessCoordinator getF4654c() {
        return this.f4654c;
    }
}
