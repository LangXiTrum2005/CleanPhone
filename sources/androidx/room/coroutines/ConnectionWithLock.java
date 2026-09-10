package androidx.room.coroutines;

import androidx.collection.LruCache;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/room/coroutines/ConnectionWithLock;", "Landroidx/sqlite/SQLiteConnection;", "Lkotlinx/coroutines/sync/Mutex;", "PreparedStatementCache", "CachedStatement", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class ConnectionWithLock implements SQLiteConnection, Mutex {
    public CoroutineContext X;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/coroutines/ConnectionWithLock$CachedStatement;", "Landroidx/sqlite/SQLiteStatement;", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CachedStatement implements SQLiteStatement {
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
        public final List getColumnNames() {
            throw null;
        }

        @Override // androidx.sqlite.SQLiteStatement
        public final double getDouble(int i2) {
            throw null;
        }

        @Override // androidx.sqlite.SQLiteStatement
        public final float getFloat(int i2) {
            throw null;
        }

        @Override // androidx.sqlite.SQLiteStatement
        public final int getInt(int i2) {
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
        public final boolean l0() {
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

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Landroidx/room/coroutines/ConnectionWithLock$PreparedStatementCache;", "Landroidx/collection/LruCache;", "", "Landroidx/sqlite/SQLiteStatement;", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class PreparedStatementCache extends LruCache<String, SQLiteStatement> {
        @Override // androidx.collection.LruCache
        public final SQLiteStatement create(String str) {
            String key = str;
            Intrinsics.f(key, "key");
            throw null;
        }

        @Override // androidx.collection.LruCache
        public final void entryRemoved(boolean z2, String str, SQLiteStatement sQLiteStatement, SQLiteStatement sQLiteStatement2) throws Exception {
            String key = str;
            SQLiteStatement oldValue = sQLiteStatement;
            Intrinsics.f(key, "key");
            Intrinsics.f(oldValue, "oldValue");
            oldValue.close();
            super.entryRemoved(z2, key, oldValue, sQLiteStatement2);
        }
    }

    @Override // androidx.sqlite.SQLiteConnection
    public final SQLiteStatement R0(String sql) {
        Intrinsics.f(sql, "sql");
        Object obj = null;
        obj.getClass();
        throw null;
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public final Object a(Continuation continuation) {
        throw null;
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public final void b(Object obj) {
        throw null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        Object obj = null;
        obj.getClass();
        throw null;
    }

    public final String toString() {
        throw null;
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public final boolean tryLock() {
        throw null;
    }

    @Override // androidx.sqlite.SQLiteConnection
    public final boolean v() {
        throw null;
    }
}
