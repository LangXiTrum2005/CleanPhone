package androidx.datastore.core.okio;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.okio.OkioStorageConnection", f = "OkioStorage.kt", l = {113}, m = "readScope")
final class OkioStorageConnection$readScope$1<R> extends ContinuationImpl {
    public /* synthetic */ Object X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ OkioStorageConnection f4701Y;
    public int Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkioStorageConnection$readScope$1(OkioStorageConnection okioStorageConnection, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f4701Y = okioStorageConnection;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        this.f4701Y.b(null, this);
        throw null;
    }
}
