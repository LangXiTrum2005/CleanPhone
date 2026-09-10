package l4;

import android.database.Cursor;
import android.database.sqlite.SQLiteClosable;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteProgram;
import hn.u;
import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class b implements Closeable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f45021c = new String[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SQLiteClosable f45023b;

    public /* synthetic */ b(SQLiteClosable sQLiteClosable, int i10) {
        this.f45022a = i10;
        this.f45023b = sQLiteClosable;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f45022a) {
            case 0:
                ((SQLiteDatabase) this.f45023b).close();
                break;
            default:
                ((SQLiteProgram) this.f45023b).close();
                break;
        }
    }

    public void d() {
        ((SQLiteDatabase) this.f45023b).beginTransaction();
    }

    public void h(int i10, byte[] bArr) {
        ((SQLiteProgram) this.f45023b).bindBlob(i10, bArr);
    }

    public void j(int i10, long j10) {
        ((SQLiteProgram) this.f45023b).bindLong(i10, j10);
    }

    public void k(int i10) {
        ((SQLiteProgram) this.f45023b).bindNull(i10);
    }

    public void n(int i10, String str) {
        ((SQLiteProgram) this.f45023b).bindString(i10, str);
    }

    public void o() {
        ((SQLiteDatabase) this.f45023b).endTransaction();
    }

    public void p(String str) {
        ((SQLiteDatabase) this.f45023b).execSQL(str);
    }

    public Cursor q(String str) {
        return r(new u(str, 1));
    }

    public Cursor r(k4.c cVar) {
        return ((SQLiteDatabase) this.f45023b).rawQueryWithFactory(new a(cVar), cVar.d(), f45021c, null);
    }

    public void s() {
        ((SQLiteDatabase) this.f45023b).setTransactionSuccessful();
    }
}
