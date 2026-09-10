package androidx.datastore.core;

import com.google.android.gms.ads.RequestConfiguration;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/datastore/core/FileReadScope;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/datastore/core/ReadScope;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class FileReadScope<T> implements ReadScope<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f4644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Serializer f4645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f4646c;

    public FileReadScope(File file, Serializer serializer) {
        Intrinsics.f(serializer, "serializer");
        this.f4644a = file;
        this.f4645b = serializer;
        this.f4646c = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11, types: [androidx.datastore.core.FileReadScope] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r7v0, types: [androidx.datastore.core.FileReadScope, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [androidx.datastore.core.FileReadScope] */
    public static Object f(FileReadScope fileReadScope, ContinuationImpl continuationImpl) {
        FileReadScope$readData$1 fileReadScope$readData$1;
        Throwable th;
        java.io.Closeable closeable;
        FileInputStream fileInputStream;
        Throwable th2;
        if (continuationImpl instanceof FileReadScope$readData$1) {
            fileReadScope$readData$1 = (FileReadScope$readData$1) continuationImpl;
            int i2 = fileReadScope$readData$1.f0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fileReadScope$readData$1.f0 = i2 - Integer.MIN_VALUE;
            } else {
                fileReadScope$readData$1 = new FileReadScope$readData$1(fileReadScope, continuationImpl);
            }
        } else {
            fileReadScope$readData$1 = new FileReadScope$readData$1(fileReadScope, continuationImpl);
        }
        Object obj = fileReadScope$readData$1.Z;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        ?? r2 = fileReadScope$readData$1.f0;
        try {
            if (r2 != 0) {
                if (r2 == 1) {
                    fileInputStream = fileReadScope$readData$1.f4647Y;
                    r2 = (FileReadScope) fileReadScope$readData$1.X;
                    try {
                        ResultKt.b(obj);
                        kotlin.io.CloseableKt.a(fileInputStream, null);
                        return obj;
                    } catch (Throwable th3) {
                        th2 = th3;
                        try {
                            throw th2;
                        } catch (Throwable th4) {
                            kotlin.io.CloseableKt.a(fileInputStream, th2);
                            throw th4;
                        }
                    }
                }
                if (r2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                closeable = (java.io.Closeable) fileReadScope$readData$1.X;
                try {
                    ResultKt.b(obj);
                    kotlin.io.CloseableKt.a(closeable, null);
                    return obj;
                } catch (Throwable th5) {
                    th = th5;
                    try {
                        throw th;
                    } catch (Throwable th6) {
                        kotlin.io.CloseableKt.a(closeable, th);
                        throw th6;
                    }
                }
            }
            ResultKt.b(obj);
            if (fileReadScope.f4646c.get()) {
                throw new IllegalStateException("This scope has already been closed.");
            }
            try {
                FileInputStream fileInputStream2 = new FileInputStream(fileReadScope.f4644a);
                try {
                    Serializer serializer = fileReadScope.f4645b;
                    fileReadScope$readData$1.X = fileReadScope;
                    fileReadScope$readData$1.f4647Y = fileInputStream2;
                    fileReadScope$readData$1.f0 = 1;
                    Object from = serializer.readFrom(fileInputStream2, fileReadScope$readData$1);
                    if (from != coroutineSingletons) {
                        fileInputStream = fileInputStream2;
                        obj = from;
                        kotlin.io.CloseableKt.a(fileInputStream, null);
                        return obj;
                    }
                    return coroutineSingletons;
                } catch (Throwable th7) {
                    r2 = fileReadScope;
                    fileInputStream = fileInputStream2;
                    th2 = th7;
                    throw th2;
                }
            } catch (FileNotFoundException unused) {
                boolean zExists = fileReadScope.f4644a.exists();
                Serializer serializer2 = fileReadScope.f4645b;
                if (!zExists) {
                    return serializer2.getDefaultValue();
                }
                FileInputStream fileInputStream3 = new FileInputStream(fileReadScope.f4644a);
                try {
                    fileReadScope$readData$1.X = fileInputStream3;
                    fileReadScope$readData$1.f4647Y = null;
                    fileReadScope$readData$1.f0 = 2;
                    Object from2 = serializer2.readFrom(fileInputStream3, fileReadScope$readData$1);
                    if (from2 != coroutineSingletons) {
                        obj = from2;
                        closeable = fileInputStream3;
                        kotlin.io.CloseableKt.a(closeable, null);
                        return obj;
                    }
                } catch (Throwable th8) {
                    th = th8;
                    closeable = fileInputStream3;
                    throw th;
                }
            }
        } catch (FileNotFoundException unused2) {
            fileReadScope = r2;
        }
    }

    @Override // androidx.datastore.core.ReadScope
    public final Object a(Continuation continuation) {
        return f(this, (ContinuationImpl) continuation);
    }

    @Override // androidx.datastore.core.Closeable
    public final void close() {
        this.f4646c.set(true);
    }
}
