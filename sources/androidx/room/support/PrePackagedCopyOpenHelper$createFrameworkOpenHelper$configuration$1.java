package androidx.room.support;

import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/room/support/PrePackagedCopyOpenHelper$createFrameworkOpenHelper$configuration$1", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Callback;", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PrePackagedCopyOpenHelper$createFrameworkOpenHelper$configuration$1 extends SupportSQLiteOpenHelper.Callback {
    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public final void e(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
        frameworkSQLiteDatabase.X.setVersion(0);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public final void c(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public final void f(FrameworkSQLiteDatabase frameworkSQLiteDatabase, int i2, int i3) {
    }
}
