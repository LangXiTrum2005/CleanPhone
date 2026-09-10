package com.p004ironsource;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class ha extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ga f25225a = new ga();

    public ha(Context context) {
        super(context, "reports", (SQLiteDatabase.CursorFactory) null, 1);
    }

    public static Cursor a(int i2) throws Throwable {
        SQLiteDatabase sQLiteDatabase = null;
        try {
            SQLiteDatabase sQLiteDatabaseA = f25225a.a(new ha(q9.d().a()));
            try {
                Cursor cursorRawQuery = sQLiteDatabaseA.rawQuery("SELECT * FROM REPORTSWHERE id= " + i2 + ";", null);
                sQLiteDatabaseA.close();
                return cursorRawQuery;
            } catch (Throwable th) {
                th = th;
                sQLiteDatabase = sQLiteDatabaseA;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static mc b(int i2) throws Throwable {
        SQLiteDatabase sQLiteDatabase = null;
        try {
            SQLiteDatabase sQLiteDatabaseA = f25225a.a(new ha(q9.d().a()));
            try {
                Cursor cursorRawQuery = sQLiteDatabaseA.rawQuery("SELECT * FROM REPORTSWHERE id= " + i2 + ";", null);
                int i3 = cursorRawQuery.getInt(0);
                String string = cursorRawQuery.getString(1);
                String string2 = cursorRawQuery.getString(2);
                String string3 = cursorRawQuery.getString(3);
                cursorRawQuery.close();
                mc mcVar = new mc(i3, string, string2, string3);
                sQLiteDatabaseA.close();
                return mcVar;
            } catch (Throwable th) {
                th = th;
                sQLiteDatabase = sQLiteDatabaseA;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static Cursor c() throws Throwable {
        ha haVar = new ha(q9.d().a());
        new ArrayList();
        SQLiteDatabase sQLiteDatabase = null;
        try {
            SQLiteDatabase sQLiteDatabaseA = f25225a.a(haVar);
            try {
                Cursor cursorRawQuery = sQLiteDatabaseA.rawQuery("SELECT * FROM REPORTS;", null);
                sQLiteDatabaseA.close();
                return cursorRawQuery;
            } catch (Throwable th) {
                th = th;
                sQLiteDatabase = sQLiteDatabaseA;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS REPORTS(id INTEGER PRIMARY KEY AUTOINCREMENT , stack_trace TEXT NOT NULL, crash_date TEXT NOT NULL,crashType TEXT NOT NULL );");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
    }

    public static void a() {
        SQLiteDatabase sQLiteDatabaseA = null;
        try {
            sQLiteDatabaseA = f25225a.a(true, new ha(q9.d().a()));
            sQLiteDatabaseA.execSQL("DELETE FROM REPORTS WHERE id >= 0;");
            sQLiteDatabaseA.close();
        } catch (Throwable th) {
            if (sQLiteDatabaseA != null) {
                sQLiteDatabaseA.close();
            }
            throw th;
        }
    }

    public static List<mc> b() {
        ha haVar = new ha(q9.d().a());
        ArrayList arrayList = new ArrayList();
        SQLiteDatabase sQLiteDatabase = null;
        try {
            SQLiteDatabase sQLiteDatabaseA = f25225a.a(haVar);
            try {
                Cursor cursorRawQuery = sQLiteDatabaseA.rawQuery("SELECT * FROM REPORTS ;", null);
                if (cursorRawQuery.moveToFirst()) {
                    do {
                        arrayList.add(new mc(cursorRawQuery.getInt(0), cursorRawQuery.getString(1), cursorRawQuery.getString(2), cursorRawQuery.getString(3)));
                    } while (cursorRawQuery.moveToNext());
                }
                cursorRawQuery.close();
                sQLiteDatabaseA.close();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                sQLiteDatabase = sQLiteDatabaseA;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static void a(mc mcVar) {
        SQLiteDatabase sQLiteDatabase = null;
        try {
            SQLiteDatabase sQLiteDatabaseA = f25225a.a(true, new ha(q9.d().a()));
            try {
                sQLiteDatabaseA.beginTransaction();
                ContentValues contentValues = new ContentValues();
                String strE = mcVar.e();
                String strB = mcVar.b();
                String strD = mcVar.d();
                contentValues.put("stack_trace", strE);
                contentValues.put("crash_date", strB);
                contentValues.put("crashType", strD);
                sQLiteDatabaseA.insert("REPORTS", null, contentValues);
                sQLiteDatabaseA.setTransactionSuccessful();
                sQLiteDatabaseA.endTransaction();
                sQLiteDatabaseA.close();
            } catch (Throwable th) {
                th = th;
                sQLiteDatabase = sQLiteDatabaseA;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.endTransaction();
                    sQLiteDatabase.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
