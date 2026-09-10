package androidx.datastore.core;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.FileStorageConnection", f = "FileStorage.kt", l = {Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE, 118}, m = "writeScope")
final class FileStorageConnection$writeScope$1 extends ContinuationImpl {
    public FileStorageConnection X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Object f4657Y;
    public Object Z;
    public FileWriteScope e0;
    public /* synthetic */ Object f0;
    public final /* synthetic */ FileStorageConnection g0;
    public int h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileStorageConnection$writeScope$1(FileStorageConnection fileStorageConnection, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.g0 = fileStorageConnection;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f0 = obj;
        this.h0 |= Integer.MIN_VALUE;
        return this.g0.c(null, this);
    }
}
