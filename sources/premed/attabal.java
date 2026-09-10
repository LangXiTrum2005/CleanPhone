package premed;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.os.CancellationSignal;
import android.util.Pair;
import iconoclasm.beachfront;
import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: FrameworkSQLiteDatabase.java */
/* JADX INFO: loaded from: classes.dex */
public class attabal implements iconoclasm.saneness {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public static final String[] f35622arytenoidectomy = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public static final String[] f35623monoploid = new String[0];

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final SQLiteDatabase f35624kowloon;

    /* JADX INFO: renamed from: premed.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: FrameworkSQLiteDatabase.java */
    public class C0775attabal implements SQLiteDatabase.CursorFactory {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ iconoclasm.marial f35625attabal;

        public C0775attabal(iconoclasm.marial marialVar) {
            this.f35625attabal = marialVar;
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f35625attabal.saneness(new wireman(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    /* JADX INFO: compiled from: FrameworkSQLiteDatabase.java */
    public class saneness implements SQLiteDatabase.CursorFactory {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ iconoclasm.marial f35627attabal;

        public saneness(iconoclasm.marial marialVar) {
            this.f35627attabal = marialVar;
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f35627attabal.saneness(new wireman(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    public attabal(SQLiteDatabase sQLiteDatabase) {
        this.f35624kowloon = sQLiteDatabase;
    }

    @Override // iconoclasm.saneness
    public List<Pair<String, String>> apical() {
        return this.f35624kowloon.getAttachedDbs();
    }

    public boolean attabal(SQLiteDatabase sQLiteDatabase) {
        return this.f35624kowloon == sQLiteDatabase;
    }

    @Override // iconoclasm.saneness
    public void beachfront() {
        this.f35624kowloon.beginTransaction();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f35624kowloon.close();
    }

    @Override // iconoclasm.saneness
    public Cursor coffeecake(String str) {
        return overspeculate(new iconoclasm.attabal(str));
    }

    @Override // iconoclasm.saneness
    public void cord(String str, Object[] objArr) throws SQLException {
        this.f35624kowloon.execSQL(str, objArr);
    }

    @Override // iconoclasm.saneness
    public Cursor cultivated(iconoclasm.marial marialVar, CancellationSignal cancellationSignal) {
        return this.f35624kowloon.rawQueryWithFactory(new saneness(marialVar), marialVar.attabal(), f35623monoploid, null, cancellationSignal);
    }

    @Override // iconoclasm.saneness
    public boolean empress() {
        return this.f35624kowloon.inTransaction();
    }

    @Override // iconoclasm.saneness
    public String getPath() {
        return this.f35624kowloon.getPath();
    }

    @Override // iconoclasm.saneness
    public void impassible(String str) throws SQLException {
        this.f35624kowloon.execSQL(str);
    }

    @Override // iconoclasm.saneness
    public boolean isOpen() {
        return this.f35624kowloon.isOpen();
    }

    @Override // iconoclasm.saneness
    public beachfront mathsort(String str) {
        return new marial(this.f35624kowloon.compileStatement(str));
    }

    @Override // iconoclasm.saneness
    public void oilcan() {
        this.f35624kowloon.endTransaction();
    }

    @Override // iconoclasm.saneness
    public Cursor overspeculate(iconoclasm.marial marialVar) {
        return this.f35624kowloon.rawQueryWithFactory(new C0775attabal(marialVar), marialVar.attabal(), f35623monoploid, null);
    }

    @Override // iconoclasm.saneness
    public void preprohormone() {
        this.f35624kowloon.setTransactionSuccessful();
    }
}
