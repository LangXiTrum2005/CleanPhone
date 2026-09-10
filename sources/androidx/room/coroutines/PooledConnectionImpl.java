package androidx.room.coroutines;

import androidx.room.TransactionScope;
import androidx.room.Transactor;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Landroidx/room/coroutines/PooledConnectionImpl;", "Landroidx/room/Transactor;", "Landroidx/room/coroutines/RawConnectionAccessor;", "TransactionItem", "TransactionImpl", "StatementWrapper", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class PooledConnectionImpl implements Transactor, RawConnectionAccessor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConnectionElementKey f8300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConnectionWithLock f8301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayDeque f8302c;
    public volatile boolean d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/coroutines/PooledConnectionImpl$StatementWrapper;", "Landroidx/sqlite/SQLiteStatement;", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class StatementWrapper implements SQLiteStatement {
        @Override // androidx.sqlite.SQLiteStatement
        public final boolean P0() {
            throw null;
        }

        @Override // java.lang.AutoCloseable
        public final void close() {
            throw null;
        }

        @Override // androidx.sqlite.SQLiteStatement
        public final int getColumnCount() {
            throw null;
        }

        @Override // androidx.sqlite.SQLiteStatement
        public final String getColumnName(int i2) {
            throw null;
        }

        @Override // androidx.sqlite.SQLiteStatement
        public final double getDouble(int i2) {
            throw null;
        }

        @Override // androidx.sqlite.SQLiteStatement
        public final long getLong(int i2) {
            throw null;
        }

        @Override // androidx.sqlite.SQLiteStatement
        public final boolean isNull(int i2) {
            throw null;
        }

        @Override // androidx.sqlite.SQLiteStatement
        public final void reset() {
            throw null;
        }

        @Override // androidx.sqlite.SQLiteStatement
        public final void w() {
            throw null;
        }

        @Override // androidx.sqlite.SQLiteStatement
        public final String y0(int i2) {
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/room/coroutines/PooledConnectionImpl$TransactionImpl;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/room/TransactionScope;", "Landroidx/room/coroutines/RawConnectionAccessor;", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class TransactionImpl<T> implements TransactionScope<T>, RawConnectionAccessor {
        public TransactionImpl() {
        }

        @Override // androidx.room.PooledConnection
        public final Object b(String str, Function1 function1, ContinuationImpl continuationImpl) {
            PooledConnectionImpl.this.b(str, function1, continuationImpl);
            throw null;
        }

        @Override // androidx.room.coroutines.RawConnectionAccessor
        /* JADX INFO: renamed from: d */
        public final SQLiteConnection getF8287b() {
            return PooledConnectionImpl.this.f8301b;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/coroutines/PooledConnectionImpl$TransactionItem;", "", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TransactionItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f8305a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f8306b = false;

        public TransactionItem(int i2) {
            this.f8305a = i2;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[Transactor.SQLiteTransactionType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Transactor.SQLiteTransactionType sQLiteTransactionType = Transactor.SQLiteTransactionType.X;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Transactor.SQLiteTransactionType sQLiteTransactionType2 = Transactor.SQLiteTransactionType.X;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public PooledConnectionImpl(ConnectionElementKey connectionElementKey, ConnectionWithLock connectionWithLock, boolean z2) {
        Intrinsics.f(connectionElementKey, "connectionElementKey");
        this.f8300a = connectionElementKey;
        this.f8301b = connectionWithLock;
        this.f8302c = new ArrayDeque();
    }

    @Override // androidx.room.Transactor
    public final Object a(Transactor.SQLiteTransactionType sQLiteTransactionType, Function2 function2, SuspendLambda suspendLambda) {
        if (this.d) {
            SQLite.b(21, "Connection is recycled");
            throw null;
        }
        ConnectionElement connectionElement = (ConnectionElement) suspendLambda.getF0().get(this.f8300a);
        if (connectionElement != null && connectionElement.f8281Y == this) {
            return g(sQLiteTransactionType, function2, suspendLambda);
        }
        SQLite.b(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.room.PooledConnection
    public final Object b(String str, Function1 function1, ContinuationImpl continuationImpl) {
        PooledConnectionImpl$usePrepared$1 pooledConnectionImpl$usePrepared$1;
        if (continuationImpl instanceof PooledConnectionImpl$usePrepared$1) {
            pooledConnectionImpl$usePrepared$1 = (PooledConnectionImpl$usePrepared$1) continuationImpl;
            int i2 = pooledConnectionImpl$usePrepared$1.g0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pooledConnectionImpl$usePrepared$1.g0 = i2 - Integer.MIN_VALUE;
            } else {
                pooledConnectionImpl$usePrepared$1 = new PooledConnectionImpl$usePrepared$1(this, continuationImpl);
            }
        } else {
            pooledConnectionImpl$usePrepared$1 = new PooledConnectionImpl$usePrepared$1(this, continuationImpl);
        }
        Object obj = pooledConnectionImpl$usePrepared$1.e0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = pooledConnectionImpl$usePrepared$1.g0;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Mutex mutex = (Mutex) pooledConnectionImpl$usePrepared$1.Z;
            Function1 function2 = pooledConnectionImpl$usePrepared$1.f8310Y;
            String str2 = pooledConnectionImpl$usePrepared$1.X;
            ResultKt.b(obj);
            try {
                this.f8301b.R0(str2);
                throw null;
            } catch (Throwable th) {
                mutex.b(null);
                throw th;
            }
        }
        ResultKt.b(obj);
        if (this.d) {
            SQLite.b(21, "Connection is recycled");
            throw null;
        }
        ConnectionElement connectionElement = (ConnectionElement) pooledConnectionImpl$usePrepared$1.getF0().get(this.f8300a);
        if (connectionElement == null || connectionElement.f8281Y != this) {
            SQLite.b(21, "Attempted to use connection on a different coroutine");
            throw null;
        }
        ConnectionWithLock connectionWithLock = this.f8301b;
        pooledConnectionImpl$usePrepared$1.X = str;
        pooledConnectionImpl$usePrepared$1.f8310Y = function1;
        pooledConnectionImpl$usePrepared$1.Z = connectionWithLock;
        pooledConnectionImpl$usePrepared$1.g0 = 1;
        throw null;
    }

    @Override // androidx.room.Transactor
    public final Boolean c(Continuation continuation) {
        if (this.d) {
            SQLite.b(21, "Connection is recycled");
            throw null;
        }
        ConnectionElement connectionElement = (ConnectionElement) continuation.getF0().get(this.f8300a);
        if (connectionElement == null || connectionElement.f8281Y != this) {
            SQLite.b(21, "Attempted to use connection on a different coroutine");
            throw null;
        }
        if (this.f8302c.isEmpty()) {
            throw null;
        }
        return true;
    }

    @Override // androidx.room.coroutines.RawConnectionAccessor
    /* JADX INFO: renamed from: d */
    public final SQLiteConnection getF8287b() {
        return this.f8301b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object e(Transactor.SQLiteTransactionType sQLiteTransactionType, ContinuationImpl continuationImpl) {
        PooledConnectionImpl$beginTransaction$1 pooledConnectionImpl$beginTransaction$1;
        ArrayDeque arrayDeque = this.f8302c;
        if (continuationImpl instanceof PooledConnectionImpl$beginTransaction$1) {
            pooledConnectionImpl$beginTransaction$1 = (PooledConnectionImpl$beginTransaction$1) continuationImpl;
            int i2 = pooledConnectionImpl$beginTransaction$1.f0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pooledConnectionImpl$beginTransaction$1.f0 = i2 - Integer.MIN_VALUE;
            } else {
                pooledConnectionImpl$beginTransaction$1 = new PooledConnectionImpl$beginTransaction$1(this, continuationImpl);
            }
        } else {
            pooledConnectionImpl$beginTransaction$1 = new PooledConnectionImpl$beginTransaction$1(this, continuationImpl);
        }
        Object obj = pooledConnectionImpl$beginTransaction$1.Z;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = pooledConnectionImpl$beginTransaction$1.f0;
        ConnectionWithLock connectionWithLock = this.f8301b;
        if (i3 == 0) {
            ResultKt.b(obj);
            pooledConnectionImpl$beginTransaction$1.X = sQLiteTransactionType;
            pooledConnectionImpl$beginTransaction$1.f8307Y = connectionWithLock;
            pooledConnectionImpl$beginTransaction$1.f0 = 1;
            throw null;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Mutex mutex = (Mutex) pooledConnectionImpl$beginTransaction$1.f8307Y;
        Transactor.SQLiteTransactionType sQLiteTransactionType2 = pooledConnectionImpl$beginTransaction$1.X;
        ResultKt.b(obj);
        try {
            int i4 = arrayDeque.Z;
            if (arrayDeque.isEmpty()) {
                int iOrdinal = sQLiteTransactionType2.ordinal();
                if (iOrdinal == 0) {
                    SQLite.a(connectionWithLock, "BEGIN DEFERRED TRANSACTION");
                } else if (iOrdinal == 1) {
                    SQLite.a(connectionWithLock, "BEGIN IMMEDIATE TRANSACTION");
                } else {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    SQLite.a(connectionWithLock, "BEGIN EXCLUSIVE TRANSACTION");
                }
            } else {
                SQLite.a(connectionWithLock, "SAVEPOINT '" + i4 + '\'');
            }
            arrayDeque.addLast(new TransactionItem(i4));
            Unit unit = Unit.f43263a;
            mutex.b(null);
            return unit;
        } catch (Throwable th) {
            mutex.b(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object f(boolean z2, ContinuationImpl continuationImpl) {
        PooledConnectionImpl$endTransaction$1 pooledConnectionImpl$endTransaction$1;
        ArrayDeque arrayDeque = this.f8302c;
        if (continuationImpl instanceof PooledConnectionImpl$endTransaction$1) {
            pooledConnectionImpl$endTransaction$1 = (PooledConnectionImpl$endTransaction$1) continuationImpl;
            int i2 = pooledConnectionImpl$endTransaction$1.f0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pooledConnectionImpl$endTransaction$1.f0 = i2 - Integer.MIN_VALUE;
            } else {
                pooledConnectionImpl$endTransaction$1 = new PooledConnectionImpl$endTransaction$1(this, continuationImpl);
            }
        } else {
            pooledConnectionImpl$endTransaction$1 = new PooledConnectionImpl$endTransaction$1(this, continuationImpl);
        }
        Object obj = pooledConnectionImpl$endTransaction$1.Z;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = pooledConnectionImpl$endTransaction$1.f0;
        ConnectionWithLock connectionWithLock = this.f8301b;
        if (i3 == 0) {
            ResultKt.b(obj);
            pooledConnectionImpl$endTransaction$1.f8308Y = connectionWithLock;
            pooledConnectionImpl$endTransaction$1.X = z2;
            pooledConnectionImpl$endTransaction$1.f0 = 1;
            throw null;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        boolean z3 = pooledConnectionImpl$endTransaction$1.X;
        Mutex mutex = (Mutex) pooledConnectionImpl$endTransaction$1.f8308Y;
        ResultKt.b(obj);
        try {
            if (arrayDeque.isEmpty()) {
                throw new IllegalStateException("Not in a transaction");
            }
            TransactionItem transactionItem = (TransactionItem) CollectionsKt.T(arrayDeque);
            if (!z3 || transactionItem.f8306b) {
                if (arrayDeque.isEmpty()) {
                    SQLite.a(connectionWithLock, "ROLLBACK TRANSACTION");
                } else {
                    SQLite.a(connectionWithLock, "ROLLBACK TRANSACTION TO SAVEPOINT '" + transactionItem.f8305a + '\'');
                }
            } else if (arrayDeque.isEmpty()) {
                SQLite.a(connectionWithLock, "END TRANSACTION");
            } else {
                SQLite.a(connectionWithLock, "RELEASE SAVEPOINT '" + transactionItem.f8305a + '\'');
            }
            Unit unit = Unit.f43263a;
            mutex.b(null);
            return unit;
        } catch (Throwable th) {
            mutex.b(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x008c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0097 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:62:0x00bb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:67:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00b9, code lost:
    
        if (r3 == r1) goto L62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(androidx.room.Transactor.SQLiteTransactionType r12, kotlin.jvm.functions.Function2 r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r14 instanceof androidx.room.coroutines.PooledConnectionImpl$transaction$1
            if (r0 == 0) goto L13
            r0 = r14
            androidx.room.coroutines.PooledConnectionImpl$transaction$1 r0 = (androidx.room.coroutines.PooledConnectionImpl$transaction$1) r0
            int r1 = r0.g0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g0 = r1
            goto L18
        L13:
            androidx.room.coroutines.PooledConnectionImpl$transaction$1 r0 = new androidx.room.coroutines.PooledConnectionImpl$transaction$1
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.e0
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.X
            int r2 = r0.g0
            kotlin.Unit r3 = kotlin.Unit.f43263a
            r4 = 5
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 0
            r9 = 1
            r10 = 0
            if (r2 == 0) goto L66
            if (r2 == r9) goto L5d
            if (r2 == r7) goto L55
            if (r2 == r6) goto L4f
            if (r2 == r5) goto L49
            if (r2 == r4) goto L3b
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L3b:
            java.lang.Throwable r12 = r0.f8309Y
            java.lang.Object r13 = r0.X
            java.lang.Throwable r13 = (java.lang.Throwable) r13
            kotlin.ResultKt.b(r14)     // Catch: android.database.SQLException -> L46
            goto Lc5
        L46:
            r14 = move-exception
            goto Lc0
        L49:
            java.lang.Object r12 = r0.X
            kotlin.ResultKt.b(r14)
            return r12
        L4f:
            java.lang.Object r12 = r0.X
            kotlin.ResultKt.b(r14)
            return r12
        L55:
            int r12 = r0.Z
            kotlin.ResultKt.b(r14)     // Catch: java.lang.Throwable -> L5b
            goto L8a
        L5b:
            r12 = move-exception
            goto L98
        L5d:
            java.lang.Object r12 = r0.X
            r13 = r12
            kotlin.jvm.functions.Function2 r13 = (kotlin.jvm.functions.Function2) r13
            kotlin.ResultKt.b(r14)
            goto L77
        L66:
            kotlin.ResultKt.b(r14)
            if (r12 != 0) goto L6d
            androidx.room.Transactor$SQLiteTransactionType r12 = androidx.room.Transactor.SQLiteTransactionType.X
        L6d:
            r0.X = r13
            r0.g0 = r9
            r11.e(r12, r0)
            if (r3 != r1) goto L77
            goto Lbb
        L77:
            androidx.room.coroutines.PooledConnectionImpl$TransactionImpl r12 = new androidx.room.coroutines.PooledConnectionImpl$TransactionImpl     // Catch: java.lang.Throwable -> L5b
            r12.<init>()     // Catch: java.lang.Throwable -> L5b
            r0.X = r10     // Catch: java.lang.Throwable -> L5b
            r0.Z = r9     // Catch: java.lang.Throwable -> L5b
            r0.g0 = r7     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r14 = r13.invoke(r12, r0)     // Catch: java.lang.Throwable -> L5b
            if (r14 != r1) goto L89
            goto Lbb
        L89:
            r12 = r9
        L8a:
            if (r12 == 0) goto L8d
            r8 = r9
        L8d:
            r0.X = r14
            r0.g0 = r6
            r11.f(r8, r0)
            if (r3 != r1) goto L97
            goto Lbb
        L97:
            return r14
        L98:
            boolean r13 = r12 instanceof androidx.room.coroutines.ConnectionPool.RollbackException     // Catch: java.lang.Throwable -> Laa
            if (r13 == 0) goto Lac
            androidx.room.coroutines.ConnectionPool$RollbackException r12 = (androidx.room.coroutines.ConnectionPool.RollbackException) r12     // Catch: java.lang.Throwable -> Laa
            r12 = 0
            r0.X = r12
            r0.g0 = r5
            r11.f(r8, r0)
            if (r3 != r1) goto La9
            goto Lbb
        La9:
            return r12
        Laa:
            r12 = move-exception
            goto Lb0
        Lac:
            throw r12     // Catch: java.lang.Throwable -> Lad
        Lad:
            r13 = move-exception
            r10 = r12
            r12 = r13
        Lb0:
            r0.X = r10     // Catch: android.database.SQLException -> Lbe
            r0.f8309Y = r12     // Catch: android.database.SQLException -> Lbe
            r0.g0 = r4     // Catch: android.database.SQLException -> Lbe
            r11.f(r8, r0)     // Catch: android.database.SQLException -> Lbe
            if (r3 != r1) goto Lc5
        Lbb:
            return r1
        Lbc:
            r13 = r10
            goto Lc0
        Lbe:
            r14 = move-exception
            goto Lbc
        Lc0:
            if (r13 == 0) goto Lc6
            kotlin.ExceptionsKt.a(r13, r14)
        Lc5:
            throw r12
        Lc6:
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.coroutines.PooledConnectionImpl.g(androidx.room.Transactor$SQLiteTransactionType, kotlin.jvm.functions.Function2, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
