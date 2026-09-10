package androidx.sqlite.driver;

import android.database.sqlite.SQLiteDatabase;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteDriver;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/sqlite/driver/AndroidSQLiteDriver;", "Landroidx/sqlite/SQLiteDriver;", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AndroidSQLiteDriver implements SQLiteDriver {
    @Override // androidx.sqlite.SQLiteDriver
    public final SQLiteConnection open(String fileName) {
        Intrinsics.f(fileName, "fileName");
        SQLiteDatabase sQLiteDatabaseOpenOrCreateDatabase = SQLiteDatabase.openOrCreateDatabase(fileName, (SQLiteDatabase.CursorFactory) null);
        Intrinsics.c(sQLiteDatabaseOpenOrCreateDatabase);
        return new SupportSQLiteConnection(new FrameworkSQLiteDatabase(sQLiteDatabaseOpenOrCreateDatabase));
    }
}
