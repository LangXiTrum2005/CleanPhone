package androidx.room.coroutines;

import androidx.room.Transactor;
import com.unity3d.mediation.LevelPlayAdError;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "androidx.room.coroutines.PooledConnectionImpl", f = "ConnectionPoolImpl.kt", l = {LevelPlayAdError.ERROR_CODE_LOAD_WHILE_SHOW}, m = "beginTransaction")
final class PooledConnectionImpl$beginTransaction$1 extends ContinuationImpl {
    public Transactor.SQLiteTransactionType X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Object f8307Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ PooledConnectionImpl e0;
    public int f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PooledConnectionImpl$beginTransaction$1(PooledConnectionImpl pooledConnectionImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e0 = pooledConnectionImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.Z = obj;
        this.f0 |= Integer.MIN_VALUE;
        this.e0.e(null, this);
        return Unit.f43263a;
    }
}
