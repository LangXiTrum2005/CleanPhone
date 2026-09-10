package androidx.room;

import androidx.sqlite.SQLiteStatement;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/room/BindOnlySQLiteStatement;", "Landroidx/sqlite/SQLiteStatement;", "Companion", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class BindOnlySQLiteStatement implements SQLiteStatement {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/room/BindOnlySQLiteStatement$Companion;", "", "", "ONLY_BIND_CALLS_ALLOWED_ERROR", "Ljava/lang/String;", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final boolean P0() {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final int getColumnCount() {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final String getColumnName(int i2) {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final List getColumnNames() {
        throw null;
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final double getDouble(int i2) {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
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
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final boolean isNull(int i2) {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final boolean l0() {
        throw null;
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final void reset() {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final void w() {
        throw null;
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final String y0(int i2) {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }
}
