package androidx.sqlite;

import android.database.SQLException;
import kotlin.Metadata;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"sqlite"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class SQLite {
    public static final void a(SQLiteConnection sQLiteConnection, String sql) throws Exception {
        Intrinsics.f(sQLiteConnection, "<this>");
        Intrinsics.f(sql, "sql");
        SQLiteStatement sQLiteStatementR0 = sQLiteConnection.R0(sql);
        try {
            sQLiteStatementR0.P0();
            sQLiteStatementR0.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AutoCloseableKt.a(sQLiteStatementR0, th);
                throw th2;
            }
        }
    }

    public static final void b(int i2, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("Error code: " + i2);
        if (str != null) {
            sb.append(", message: ".concat(str));
        }
        throw new SQLException(sb.toString());
    }
}
