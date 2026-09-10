package androidx.room.coroutines;

import android.database.SQLException;
import androidx.room.TransactionScope;
import androidx.room.Transactor;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/room/coroutines/PassthroughConnection;", "Landroidx/room/Transactor;", "Landroidx/room/coroutines/RawConnectionAccessor;", "PassthroughTransactor", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class PassthroughConnection implements Transactor, RawConnectionAccessor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function2 f8286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SQLiteConnection f8287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicInteger f8288c;
    public Transactor.SQLiteTransactionType d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/room/coroutines/PassthroughConnection$PassthroughTransactor;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/room/TransactionScope;", "Landroidx/room/coroutines/RawConnectionAccessor;", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class PassthroughTransactor<T> implements TransactionScope<T>, RawConnectionAccessor {
        public PassthroughTransactor() {
        }

        @Override // androidx.room.PooledConnection
        public final Object b(String str, Function1 function1, ContinuationImpl continuationImpl) {
            return PassthroughConnection.this.b(str, function1, continuationImpl);
        }

        @Override // androidx.room.coroutines.RawConnectionAccessor
        /* JADX INFO: renamed from: d */
        public final SQLiteConnection getF8287b() {
            return PassthroughConnection.this.f8287b;
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

    public PassthroughConnection(Function2 function2, SQLiteConnection delegate) {
        Intrinsics.f(delegate, "delegate");
        this.f8286a = function2;
        this.f8287b = delegate;
        this.f8288c = new AtomicInteger(0);
    }

    @Override // androidx.room.Transactor
    public final Object a(Transactor.SQLiteTransactionType sQLiteTransactionType, Function2 function2, SuspendLambda suspendLambda) {
        Object objInvoke = this.f8286a.invoke(new PassthroughConnection$withTransaction$2(this, sQLiteTransactionType, function2, null), suspendLambda);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        return objInvoke;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.room.PooledConnection
    public final Object b(String str, Function1 function1, ContinuationImpl continuationImpl) throws Exception {
        PassthroughConnection$usePrepared$1 passthroughConnection$usePrepared$1;
        if (continuationImpl instanceof PassthroughConnection$usePrepared$1) {
            passthroughConnection$usePrepared$1 = (PassthroughConnection$usePrepared$1) continuationImpl;
            int i2 = passthroughConnection$usePrepared$1.f0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                passthroughConnection$usePrepared$1.f0 = i2 - Integer.MIN_VALUE;
            } else {
                passthroughConnection$usePrepared$1 = new PassthroughConnection$usePrepared$1(this, continuationImpl);
            }
        } else {
            passthroughConnection$usePrepared$1 = new PassthroughConnection$usePrepared$1(this, continuationImpl);
        }
        Object objC = passthroughConnection$usePrepared$1.Z;
        Object obj = CoroutineSingletons.X;
        int i3 = passthroughConnection$usePrepared$1.f0;
        if (i3 == 0) {
            ResultKt.b(objC);
            passthroughConnection$usePrepared$1.X = str;
            passthroughConnection$usePrepared$1.f8291Y = function1;
            passthroughConnection$usePrepared$1.f0 = 1;
            objC = c(passthroughConnection$usePrepared$1);
            if (objC != obj) {
            }
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objC);
            return objC;
        }
        function1 = passthroughConnection$usePrepared$1.f8291Y;
        str = passthroughConnection$usePrepared$1.X;
        ResultKt.b(objC);
        if (((Boolean) objC).booleanValue()) {
            Function2 function2 = this.f8286a;
            PassthroughConnection$usePrepared$2 passthroughConnection$usePrepared$2 = new PassthroughConnection$usePrepared$2(this, str, function1, null);
            passthroughConnection$usePrepared$1.X = null;
            passthroughConnection$usePrepared$1.f8291Y = null;
            passthroughConnection$usePrepared$1.f0 = 2;
            Object objInvoke = function2.invoke(passthroughConnection$usePrepared$2, passthroughConnection$usePrepared$1);
            return objInvoke == obj ? obj : objInvoke;
        }
        SQLiteStatement sQLiteStatementR0 = this.f8287b.R0(str);
        try {
            Object objInvoke2 = function1.invoke(sQLiteStatementR0);
            AutoCloseableKt.a(sQLiteStatementR0, null);
            return objInvoke2;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AutoCloseableKt.a(sQLiteStatementR0, th);
                throw th2;
            }
        }
    }

    @Override // androidx.room.Transactor
    public final Boolean c(Continuation continuation) {
        return Boolean.valueOf(this.d != null || this.f8287b.v());
    }

    @Override // androidx.room.coroutines.RawConnectionAccessor
    /* JADX INFO: renamed from: d, reason: from getter */
    public final SQLiteConnection getF8287b() {
        return this.f8287b;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00ac A[Catch: SQLException -> 0x00af, TryCatch #2 {SQLException -> 0x00af, blocks: (B:55:0x00a6, B:57:0x00ac, B:60:0x00b1), top: B:70:0x00a6 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(Transactor.SQLiteTransactionType sQLiteTransactionType, Function2 function2, ContinuationImpl continuationImpl) {
        PassthroughConnection$transaction$1 passthroughConnection$transaction$1;
        ConnectionPool.RollbackException rollbackException;
        if (continuationImpl instanceof PassthroughConnection$transaction$1) {
            passthroughConnection$transaction$1 = (PassthroughConnection$transaction$1) continuationImpl;
            int i2 = passthroughConnection$transaction$1.e0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                passthroughConnection$transaction$1.e0 = i2 - Integer.MIN_VALUE;
            } else {
                passthroughConnection$transaction$1 = new PassthroughConnection$transaction$1(this, continuationImpl);
            }
        } else {
            passthroughConnection$transaction$1 = new PassthroughConnection$transaction$1(this, continuationImpl);
        }
        Object objInvoke = passthroughConnection$transaction$1.f8290Y;
        Object obj = CoroutineSingletons.X;
        int i3 = passthroughConnection$transaction$1.e0;
        AtomicInteger atomicInteger = this.f8288c;
        int i4 = 1;
        SQLiteConnection sQLiteConnection = this.f8287b;
        try {
            if (i3 == 0) {
                ResultKt.b(objInvoke);
                int iOrdinal = sQLiteTransactionType.ordinal();
                if (iOrdinal == 0) {
                    SQLite.a(sQLiteConnection, "BEGIN DEFERRED TRANSACTION");
                } else if (iOrdinal == 1) {
                    SQLite.a(sQLiteConnection, "BEGIN IMMEDIATE TRANSACTION");
                } else {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    SQLite.a(sQLiteConnection, "BEGIN EXCLUSIVE TRANSACTION");
                }
                if (atomicInteger.incrementAndGet() > 0) {
                    this.d = sQLiteTransactionType;
                }
                Object passthroughTransactor = new PassthroughTransactor();
                passthroughConnection$transaction$1.X = 1;
                passthroughConnection$transaction$1.e0 = 1;
                objInvoke = function2.invoke(passthroughTransactor, passthroughConnection$transaction$1);
                if (objInvoke == obj) {
                    return obj;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i4 = passthroughConnection$transaction$1.X;
                ResultKt.b(objInvoke);
            }
            if (atomicInteger.decrementAndGet() == 0) {
                this.d = null;
            }
            if (i4 != 0) {
                SQLite.a(sQLiteConnection, "END TRANSACTION");
                return objInvoke;
            }
            SQLite.a(sQLiteConnection, "ROLLBACK TRANSACTION");
            return objInvoke;
        } catch (Throwable th) {
            try {
                if (th instanceof ConnectionPool.RollbackException) {
                    ConnectionPool.RollbackException rollbackException2 = th;
                    if (atomicInteger.decrementAndGet() == 0) {
                        this.d = null;
                    }
                    SQLite.a(sQLiteConnection, "ROLLBACK TRANSACTION");
                    return null;
                }
                try {
                    throw th;
                } catch (Throwable th2) {
                    rollbackException = th;
                    th = th2;
                    if (atomicInteger.decrementAndGet() == 0) {
                        this.d = null;
                    }
                    SQLite.a(sQLiteConnection, "ROLLBACK TRANSACTION");
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                rollbackException = null;
            }
            try {
                if (atomicInteger.decrementAndGet() == 0) {
                    this.d = null;
                }
                SQLite.a(sQLiteConnection, "ROLLBACK TRANSACTION");
                throw th;
            } catch (SQLException e2) {
                if (rollbackException == null) {
                    throw e2;
                }
                ExceptionsKt.a(rollbackException, e2);
                throw th;
            }
        }
    }
}
