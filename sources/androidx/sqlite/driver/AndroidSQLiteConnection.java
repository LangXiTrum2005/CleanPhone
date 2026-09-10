package androidx.sqlite.driver;

import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/sqlite/driver/AndroidSQLiteConnection;", "Landroidx/sqlite/SQLiteConnection;", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AndroidSQLiteConnection implements SQLiteConnection {
    @Override // androidx.sqlite.SQLiteConnection
    public final SQLiteStatement R0(String sql) {
        Intrinsics.f(sql, "sql");
        throw null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        throw null;
    }

    @Override // androidx.sqlite.SQLiteConnection
    public final boolean v() {
        throw null;
    }
}
