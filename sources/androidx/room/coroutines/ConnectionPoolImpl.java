package androidx.room.coroutines;

import androidx.sqlite.SQLite;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/coroutines/ConnectionPoolImpl;", "Landroidx/room/coroutines/ConnectionPool;", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConnectionPoolImpl implements ConnectionPool {
    public volatile boolean X;

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.X) {
            return;
        }
        this.X = true;
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // androidx.room.coroutines.ConnectionPool
    public final Object x0(boolean z2, Function2 function2, ContinuationImpl continuationImpl) {
        ConnectionPoolImpl$useConnection$1 connectionPoolImpl$useConnection$1;
        if (continuationImpl instanceof ConnectionPoolImpl$useConnection$1) {
            connectionPoolImpl$useConnection$1 = (ConnectionPoolImpl$useConnection$1) continuationImpl;
            int i2 = connectionPoolImpl$useConnection$1.Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                connectionPoolImpl$useConnection$1.Z = i2 - Integer.MIN_VALUE;
            } else {
                connectionPoolImpl$useConnection$1 = new ConnectionPoolImpl$useConnection$1(this, continuationImpl);
            }
        } else {
            connectionPoolImpl$useConnection$1 = new ConnectionPoolImpl$useConnection$1(this, continuationImpl);
        }
        Object obj = connectionPoolImpl$useConnection$1.X;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = connectionPoolImpl$useConnection$1.Z;
        if (i3 == 0) {
            ResultKt.b(obj);
            if (!this.X) {
                throw null;
            }
            SQLite.b(21, "Connection pool is closed");
            throw null;
        }
        if (i3 == 1) {
            ResultKt.b(obj);
            return obj;
        }
        if (i3 == 2) {
            ResultKt.b(obj);
            return obj;
        }
        try {
            if (i3 != 3) {
                if (i3 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                throw null;
            }
            ResultKt.b(obj);
            ConnectionWithLock connectionWithLock = (ConnectionWithLock) obj;
            connectionWithLock.getClass();
            Intrinsics.f(null, "context");
            connectionWithLock.X = null;
            new Throwable();
            new PooledConnectionImpl(null, connectionWithLock, false);
            throw null;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    throw null;
                } catch (Throwable th3) {
                    ExceptionsKt.a(th, th3);
                    throw th2;
                }
            }
        }
    }
}
