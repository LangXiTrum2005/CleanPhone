package androidx.room.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "androidx.room.coroutines.PassthroughConnection", f = "PassthroughConnectionPool.kt", l = {127}, m = "transaction")
final class PassthroughConnection$transaction$1<R> extends ContinuationImpl {
    public int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public /* synthetic */ Object f8290Y;
    public final /* synthetic */ PassthroughConnection Z;
    public int e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PassthroughConnection$transaction$1(PassthroughConnection passthroughConnection, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.Z = passthroughConnection;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f8290Y = obj;
        this.e0 |= Integer.MIN_VALUE;
        return this.Z.e(null, null, this);
    }
}
