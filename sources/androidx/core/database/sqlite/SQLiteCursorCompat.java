package androidx.core.database.sqlite;

import android.database.sqlite.SQLiteCursor;

/* JADX INFO: loaded from: classes.dex */
public final class SQLiteCursorCompat {

    public static class Api28Impl {
        public static void a(SQLiteCursor sQLiteCursor, boolean z2) {
            sQLiteCursor.setFillWindowForwardOnly(z2);
        }
    }
}
