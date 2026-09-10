package androidx.room.paging;

import androidx.sqlite.SQLiteStatement;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/room/paging/CursorSQLiteStatement;", "Landroidx/sqlite/SQLiteStatement;", "Companion", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CursorSQLiteStatement implements SQLiteStatement {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/paging/CursorSQLiteStatement$Companion;", "", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

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
        throw new IllegalStateException("Only get*() calls are allowed on a Cursor backed SQLiteStatement");
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final String y0(int i2) {
        throw null;
    }
}
