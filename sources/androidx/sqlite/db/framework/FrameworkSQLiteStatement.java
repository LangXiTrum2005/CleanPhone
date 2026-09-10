package androidx.sqlite.db.framework;

import android.database.sqlite.SQLiteStatement;
import androidx.sqlite.db.SupportSQLiteStatement;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteStatement;", "Landroidx/sqlite/db/framework/FrameworkSQLiteProgram;", "Landroidx/sqlite/db/SupportSQLiteStatement;", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FrameworkSQLiteStatement extends FrameworkSQLiteProgram implements SupportSQLiteStatement {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final SQLiteStatement f8378Y;

    public FrameworkSQLiteStatement(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f8378Y = sQLiteStatement;
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public final int E() {
        return this.f8378Y.executeUpdateDelete();
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public final long b0() {
        return this.f8378Y.executeInsert();
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public final void execute() {
        this.f8378Y.execute();
    }
}
