package com.umeng.analytics.pro;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteOpenHelper;
import com.umeng.commonsdk.debug.UMRTLog;

/* JADX INFO: loaded from: classes3.dex */
public class be extends SQLiteOpenHelper {
    private static final Object b = new Object();
    private static be c = null;
    private static final String d = "CREATE TABLE IF NOT EXISTS stf(_id INTEGER PRIMARY KEY AUTOINCREMENT, _tp TEXT, _hd TEXT, _bd TEXT, _ts TEXT, _uuid TEXT, _re1 TEXT, _re2 TEXT)";
    private static final String e = "DROP TABLE IF EXISTS stf";
    private static final String f = "DELETE FROM stf WHERE _id IN( SELECT _id FROM stf ORDER BY _id LIMIT 1)";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f2511a;

    private be(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i) {
        super(context, str, cursorFactory, i);
        this.f2511a = context;
    }

    public static final int a() {
        return 1;
    }

    private void b(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL(d);
        } catch (SQLiteDatabaseCorruptException unused) {
            a(sQLiteDatabase);
        } catch (Throwable th) {
            UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> [有状态]创建二级缓存数据库失败: " + th.getMessage());
        }
    }

    private void d() {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase == null || !writableDatabase.isOpen()) {
                return;
            }
            try {
                writableDatabase.execSQL(f);
            } catch (Throwable unused) {
            }
            writableDatabase.close();
        } catch (Throwable unused2) {
        }
    }

    public boolean c() {
        return !b(bg.c);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        b(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public static be a(Context context) {
        be beVar;
        synchronized (b) {
            try {
                if (c == null) {
                    c = new be(context, bg.b, null, 1);
                }
                beVar = c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return beVar;
    }

    public void b() {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase == null || !writableDatabase.isOpen()) {
                return;
            }
            writableDatabase.close();
        } catch (Throwable unused) {
        }
    }

    private void a(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL(e);
            sQLiteDatabase.execSQL(d);
        } catch (SQLException unused) {
        }
    }

    public boolean b(String str) {
        SQLiteDatabase writableDatabase;
        Cursor cursorQuery = null;
        try {
            writableDatabase = getWritableDatabase();
            if (writableDatabase != null) {
                try {
                    if (writableDatabase.isOpen()) {
                        cursorQuery = writableDatabase.query(str, null, null, null, null, null, null, null);
                    }
                } catch (Throwable unused) {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    if (writableDatabase == null) {
                        return false;
                    }
                }
            }
            if (cursorQuery != null && cursorQuery.getCount() > 0) {
                cursorQuery.close();
                if (writableDatabase == null) {
                    return true;
                }
                writableDatabase.close();
                return true;
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            if (writableDatabase == null) {
                return false;
            }
            writableDatabase.close();
            return false;
        } catch (Throwable unused2) {
            writableDatabase = null;
        }
    }

    public void a(String str, ContentValues contentValues) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase == null || !writableDatabase.isOpen()) {
                return;
            }
            try {
                writableDatabase.beginTransaction();
                writableDatabase.insert(str, null, contentValues);
                writableDatabase.setTransactionSuccessful();
                UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> [有状态]插入二级缓存数据记录 成功。");
            } catch (Throwable unused) {
            }
            writableDatabase.endTransaction();
            writableDatabase.close();
        } catch (Throwable unused2) {
        }
    }

    public void a(String str, String str2, String[] strArr) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase == null || !writableDatabase.isOpen()) {
                return;
            }
            try {
                writableDatabase.beginTransaction();
                writableDatabase.delete(str, str2, strArr);
                writableDatabase.setTransactionSuccessful();
            } catch (Throwable unused) {
            }
            writableDatabase.endTransaction();
            writableDatabase.close();
        } catch (Throwable unused2) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0085  */
    public bf a(String str) {
        bf bfVar;
        Cursor cursor;
        bf bfVar2;
        try {
            Cursor cursorA = a(str, new String[]{bg.i, bg.e, bg.f, bg.g, bg.j, bg.k}, null, null, null, null, null, "1");
            if (cursorA != null) {
                try {
                    if (cursorA.moveToFirst()) {
                        bfVar = new bf();
                        try {
                            bfVar.f2512a = cursorA.getString(0);
                            bfVar.b = cursorA.getString(1);
                            String string = cursorA.getString(2);
                            String string2 = cursorA.getString(3);
                            bfVar.c = k.a(this.f2511a).d(string);
                            bfVar.d = k.a(this.f2511a).d(string2);
                            bfVar.e = cursorA.getString(4);
                            bfVar.f = cursorA.getString(5);
                            bfVar2 = bfVar;
                        } catch (Throwable unused) {
                            cursor = cursorA;
                            try {
                                d();
                                return bfVar;
                            } finally {
                                if (cursor != null) {
                                    cursor.close();
                                }
                            }
                        }
                    } else {
                        bfVar2 = null;
                    }
                } catch (Throwable unused2) {
                    cursor = cursorA;
                    bfVar = null;
                }
            } else {
                bfVar2 = null;
            }
            if (cursorA == null) {
                return bfVar2;
            }
            cursorA.close();
            return bfVar2;
        } catch (Throwable unused3) {
            bfVar = null;
            cursor = null;
        }
    }

    public void a(String str, String str2) {
        a(str, "_uuid=?", new String[]{str2});
    }

    public Cursor a(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase == null || !writableDatabase.isOpen()) {
                return null;
            }
            return writableDatabase.query(str, strArr, str2, strArr2, str3, str4, str5, str6);
        } catch (Throwable unused) {
            return null;
        }
    }
}
