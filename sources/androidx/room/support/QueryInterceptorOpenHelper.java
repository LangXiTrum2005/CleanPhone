package androidx.room.support;

import androidx.room.DelegatingOpenHelper;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/room/support/QueryInterceptorOpenHelper;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "Landroidx/room/DelegatingOpenHelper;", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class QueryInterceptorOpenHelper implements SupportSQLiteOpenHelper, DelegatingOpenHelper {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public final String getDatabaseName() {
        throw null;
    }

    @Override // androidx.room.DelegatingOpenHelper
    public final SupportSQLiteOpenHelper getDelegate() {
        return null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public final SupportSQLiteDatabase getWritableDatabase() {
        throw null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public final void setWriteAheadLoggingEnabled(boolean z2) {
        throw null;
    }
}
