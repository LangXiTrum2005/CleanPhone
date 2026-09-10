package androidx.sqlite.db.framework;

import android.database.sqlite.SQLiteProgram;
import androidx.sqlite.db.SupportSQLiteProgram;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteProgram;", "Landroidx/sqlite/db/SupportSQLiteProgram;", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class FrameworkSQLiteProgram implements SupportSQLiteProgram {
    public final SQLiteProgram X;

    public FrameworkSQLiteProgram(SQLiteProgram delegate) {
        Intrinsics.f(delegate, "delegate");
        this.X = delegate;
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void B0(int i2) {
        this.X.bindNull(i2);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void c(int i2, double d) {
        this.X.bindDouble(i2, d);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.X.close();
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void d0(int i2, String value) {
        Intrinsics.f(value, "value");
        this.X.bindString(i2, value);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void k0(int i2, long j) {
        this.X.bindLong(i2, j);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void r0(int i2, byte[] bArr) {
        this.X.bindBlob(i2, bArr);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void w() {
        this.X.clearBindings();
    }
}
