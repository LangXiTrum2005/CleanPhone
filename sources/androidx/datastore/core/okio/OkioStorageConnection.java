package androidx.datastore.core.okio;

import androidx.datastore.core.InterProcessCoordinator;
import androidx.datastore.core.StorageConnection;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/datastore/core/okio/OkioStorageConnection;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/datastore/core/StorageConnection;", "datastore-core-okio"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OkioStorageConnection<T> implements StorageConnection<T> {
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // androidx.datastore.core.StorageConnection
    public final Object b(Function3 function3, ContinuationImpl continuationImpl) {
        OkioStorageConnection$readScope$1 okioStorageConnection$readScope$1;
        if (continuationImpl instanceof OkioStorageConnection$readScope$1) {
            okioStorageConnection$readScope$1 = (OkioStorageConnection$readScope$1) continuationImpl;
            int i2 = okioStorageConnection$readScope$1.Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                okioStorageConnection$readScope$1.Z = i2 - Integer.MIN_VALUE;
            } else {
                okioStorageConnection$readScope$1 = new OkioStorageConnection$readScope$1(this, continuationImpl);
            }
        } else {
            okioStorageConnection$readScope$1 = new OkioStorageConnection$readScope$1(this, continuationImpl);
        }
        Object obj = okioStorageConnection$readScope$1.X;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = okioStorageConnection$readScope$1.Z;
        if (i3 == 0) {
            ResultKt.b(obj);
            throw null;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        try {
            ResultKt.b(obj);
            throw null;
        } catch (Throwable th) {
            try {
                throw null;
            } catch (Throwable th2) {
                ExceptionsKt.a(th, th2);
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:39:?, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:?, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:?, code lost:
    
        throw null;
     */
    @Override // androidx.datastore.core.StorageConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(kotlin.jvm.functions.Function2 r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4 = this;
            r5 = 0
            boolean r0 = r6 instanceof androidx.datastore.core.okio.OkioStorageConnection$writeScope$1
            if (r0 == 0) goto L14
            r0 = r6
            androidx.datastore.core.okio.OkioStorageConnection$writeScope$1 r0 = (androidx.datastore.core.okio.OkioStorageConnection$writeScope$1) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.Z = r1
            goto L19
        L14:
            androidx.datastore.core.okio.OkioStorageConnection$writeScope$1 r0 = new androidx.datastore.core.okio.OkioStorageConnection$writeScope$1
            r0.<init>(r4, r6)
        L19:
            java.lang.Object r6 = r0.X
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.X
            int r0 = r0.Z
            if (r0 == 0) goto L42
            r1 = 1
            if (r0 == r1) goto L3d
            r1 = 2
            if (r0 != r1) goto L35
            kotlin.ResultKt.b(r6)     // Catch: java.lang.Throwable -> L2d
            throw r5     // Catch: java.lang.Throwable -> L2b
        L2b:
            r6 = move-exception
            throw r6     // Catch: java.io.IOException -> L34 java.lang.Throwable -> L41
        L2d:
            r6 = move-exception
            throw r5     // Catch: java.lang.Throwable -> L2f
        L2f:
            r0 = move-exception
            kotlin.ExceptionsKt.a(r6, r0)     // Catch: java.io.IOException -> L34 java.lang.Throwable -> L41
            throw r6     // Catch: java.io.IOException -> L34 java.lang.Throwable -> L41
        L34:
            throw r5     // Catch: java.lang.Throwable -> L41
        L35:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3d:
            kotlin.ResultKt.b(r6)
            throw r5     // Catch: java.lang.Throwable -> L41
        L41:
            throw r5
        L42:
            kotlin.ResultKt.b(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.okio.OkioStorageConnection.c(kotlin.jvm.functions.Function2, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // androidx.datastore.core.Closeable
    public final void close() {
        throw null;
    }

    @Override // androidx.datastore.core.StorageConnection
    public final InterProcessCoordinator e() {
        return null;
    }
}
