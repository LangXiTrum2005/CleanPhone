package androidx.room.paging;

import android.database.AbstractCursor;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/paging/SQLiteStatementCursor;", "Landroid/database/AbstractCursor;", "room-paging"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SQLiteStatementCursor extends AbstractCursor {
    @Override // android.database.AbstractCursor, android.database.Cursor
    public final String[] getColumnNames() {
        throw null;
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public final int getCount() {
        return 0;
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public final double getDouble(int i2) {
        throw null;
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public final float getFloat(int i2) {
        throw null;
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public final int getInt(int i2) {
        throw null;
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public final long getLong(int i2) {
        throw null;
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public final short getShort(int i2) {
        throw null;
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public final String getString(int i2) {
        throw null;
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public final boolean isNull(int i2) {
        throw null;
    }

    @Override // android.database.AbstractCursor, android.database.CrossProcessCursor
    public final boolean onMove(int i2, int i3) {
        if (i2 + 1 == i3) {
            throw null;
        }
        throw new IllegalStateException("Compat cursor can only move forward one position at a time.");
    }
}
