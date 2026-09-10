package com.ironsource;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class E4 extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static D4 f25996a = new D4();

    public E4(Context context) {
        super(context, "reports", (SQLiteDatabase.CursorFactory) null, 1);
    }

    public static void a(K5 k8) {
        SQLiteDatabase sQLiteDatabase = null;
        try {
            SQLiteDatabase sQLiteDatabaseA = f25996a.a(true, new E4(C0474n4.d().a()));
            try {
                sQLiteDatabaseA.beginTransaction();
                ContentValues contentValues = new ContentValues();
                String strE = k8.e();
                String strB = k8.b();
                String strD = k8.d();
                contentValues.put("stack_trace", strE);
                contentValues.put("crash_date", strB);
                contentValues.put("crashType", strD);
                sQLiteDatabaseA.insert("REPORTS", null, contentValues);
                sQLiteDatabaseA.setTransactionSuccessful();
                sQLiteDatabaseA.endTransaction();
                sQLiteDatabaseA.close();
            } catch (Throwable th2) {
                th = th2;
                sQLiteDatabase = sQLiteDatabaseA;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.endTransaction();
                    sQLiteDatabase.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static K5 b(int i10) throws Throwable {
        SQLiteDatabase sQLiteDatabase = null;
        try {
            SQLiteDatabase sQLiteDatabaseA = f25996a.a(new E4(C0474n4.d().a()));
            try {
                Cursor cursorRawQuery = sQLiteDatabaseA.rawQuery("SELECT * FROM REPORTSWHERE id= " + i10 + ";", null);
                int i11 = cursorRawQuery.getInt(0);
                String string = cursorRawQuery.getString(1);
                String string2 = cursorRawQuery.getString(2);
                String string3 = cursorRawQuery.getString(3);
                cursorRawQuery.close();
                K5 k8 = new K5(i11, string, string2, string3);
                sQLiteDatabaseA.close();
                return k8;
            } catch (Throwable th2) {
                th = th2;
                sQLiteDatabase = sQLiteDatabaseA;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static Cursor c() throws Throwable {
        E4 e10 = new E4(C0474n4.d().a());
        new ArrayList();
        SQLiteDatabase sQLiteDatabase = null;
        try {
            SQLiteDatabase sQLiteDatabaseA = f25996a.a(e10);
            try {
                Cursor cursorRawQuery = sQLiteDatabaseA.rawQuery("SELECT * FROM REPORTS;", null);
                sQLiteDatabaseA.close();
                return cursorRawQuery;
            } catch (Throwable th2) {
                th = th2;
                sQLiteDatabase = sQLiteDatabaseA;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS REPORTS(id INTEGER PRIMARY KEY AUTOINCREMENT , stack_trace TEXT NOT NULL, crash_date TEXT NOT NULL,crashType TEXT NOT NULL );");
    }

    public static List<K5> b() {
        E4 e10 = new E4(C0474n4.d().a());
        ArrayList arrayList = new ArrayList();
        SQLiteDatabase sQLiteDatabase = null;
        try {
            SQLiteDatabase sQLiteDatabaseA = f25996a.a(e10);
            try {
                Cursor cursorRawQuery = sQLiteDatabaseA.rawQuery("SELECT * FROM REPORTS ;", null);
                if (cursorRawQuery.moveToFirst()) {
                    do {
                        arrayList.add(new K5(cursorRawQuery.getInt(0), cursorRawQuery.getString(1), cursorRawQuery.getString(2), cursorRawQuery.getString(3)));
                    } while (cursorRawQuery.moveToNext());
                }
                cursorRawQuery.close();
                sQLiteDatabaseA.close();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                sQLiteDatabase = sQLiteDatabaseA;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static Cursor a(int i10) throws Throwable {
        SQLiteDatabase sQLiteDatabase = null;
        try {
            SQLiteDatabase sQLiteDatabaseA = f25996a.a(new E4(C0474n4.d().a()));
            try {
                Cursor cursorRawQuery = sQLiteDatabaseA.rawQuery("SELECT * FROM REPORTSWHERE id= " + i10 + ";", null);
                sQLiteDatabaseA.close();
                return cursorRawQuery;
            } catch (Throwable th2) {
                th = th2;
                sQLiteDatabase = sQLiteDatabaseA;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static void a() {
        SQLiteDatabase sQLiteDatabaseA = null;
        try {
            sQLiteDatabaseA = f25996a.a(true, new E4(C0474n4.d().a()));
            sQLiteDatabaseA.execSQL("DELETE FROM REPORTS WHERE id >= 0;");
            sQLiteDatabaseA.close();
        } catch (Throwable th2) {
            if (sQLiteDatabaseA != null) {
                sQLiteDatabaseA.close();
            }
            throw th2;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }
}
