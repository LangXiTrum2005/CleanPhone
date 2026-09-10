package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.FileStorageConnection", f = "FileStorage.kt", l = {101}, m = "readScope")
final class FileStorageConnection$readScope$1<R> extends ContinuationImpl {
    public FileStorageConnection X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public FileReadScope f4656Y;
    public boolean Z;
    public /* synthetic */ Object e0;
    public final /* synthetic */ FileStorageConnection f0;
    public int g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileStorageConnection$readScope$1(FileStorageConnection fileStorageConnection, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f0 = fileStorageConnection;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e0 = obj;
        this.g0 |= Integer.MIN_VALUE;
        return this.f0.b(null, this);
    }
}
