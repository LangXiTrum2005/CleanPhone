package l4;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements SQLiteDatabase.CursorFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k4.c f45020a;

    public a(k4.c cVar) {
        this.f45020a = cVar;
    }

    @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        this.f45020a.a(new b(sQLiteQuery, 1));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }
}
