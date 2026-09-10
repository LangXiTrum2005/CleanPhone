package com.inmobi.media;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public final class A3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final SQLiteDatabase f22677b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final A3 f22676a = new A3();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f22678c = new Object();

    static {
        try {
            f22677b = new C3331z3(Uc.d()).getWritableDatabase();
        } catch (Exception unused) {
        }
    }

    @JvmStatic
    public static final int a(String tableName, ContentValues contentValues, String str, String[] strArr) {
        Intrinsics.f(tableName, "tableName");
        synchronized (f22678c) {
            long jA = a(tableName, contentValues);
            if (jA == -1) {
                return b(tableName, contentValues, str, strArr);
            }
            return (int) jA;
        }
    }

    @JvmStatic
    public static final int b(String tableName, ContentValues contentValues, String str, String[] strArr) {
        int iUpdateWithOnConflict;
        Intrinsics.f(tableName, "tableName");
        synchronized (f22678c) {
            SQLiteDatabase sQLiteDatabase = f22677b;
            iUpdateWithOnConflict = sQLiteDatabase != null ? sQLiteDatabase.updateWithOnConflict(tableName, contentValues, str, strArr, 4) : -1;
        }
        return iUpdateWithOnConflict;
    }

    @JvmStatic
    public static final List<ContentValues> b(String tableName, String[] strArr, String str, String[] strArr2, String str2, String str3, String str4, String str5) throws IOException {
        Cursor cursorQuery;
        Intrinsics.f(tableName, "tableName");
        synchronized (f22678c) {
            SQLiteDatabase sQLiteDatabase = f22677b;
            cursorQuery = sQLiteDatabase != null ? sQLiteDatabase.query(tableName, strArr, str, strArr2, str2, str3, str4, str5) : null;
        }
        if (cursorQuery != null) {
            try {
                ArrayList arrayList = new ArrayList();
                if (cursorQuery.moveToFirst()) {
                    do {
                        ContentValues contentValues = new ContentValues();
                        DatabaseUtils.cursorRowToContentValues(cursorQuery, contentValues);
                        arrayList.add(contentValues);
                    } while (cursorQuery.moveToNext());
                }
                cursorQuery.close();
                return arrayList;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.a(cursorQuery, th);
                    throw th2;
                }
            }
        }
        return EmptyList.X;
    }

    @JvmStatic
    public static final long a(String tableName, ContentValues contentValues) {
        long jInsertWithOnConflict;
        Intrinsics.f(tableName, "tableName");
        synchronized (f22678c) {
            SQLiteDatabase sQLiteDatabase = f22677b;
            jInsertWithOnConflict = sQLiteDatabase != null ? sQLiteDatabase.insertWithOnConflict(tableName, null, contentValues, 4) : -1L;
        }
        return jInsertWithOnConflict;
    }

    @JvmStatic
    public static final int a(String tableName, String str, String[] strArr) {
        int iDelete;
        Intrinsics.f(tableName, "tableName");
        synchronized (f22678c) {
            SQLiteDatabase sQLiteDatabase = f22677b;
            iDelete = sQLiteDatabase != null ? sQLiteDatabase.delete(tableName, str, strArr) : 0;
        }
        return iDelete;
    }

    @JvmStatic
    public static final void a(String tableName) {
        Intrinsics.f(tableName, "tableName");
        String str = "DROP TABLE IF EXISTS \"" + tableName + AbstractJsonLexerKt.STRING;
        synchronized (f22678c) {
            SQLiteDatabase sQLiteDatabase = f22677b;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.execSQL(str);
            }
        }
    }

    public final void a(String tableName, String tableSchema) {
        Intrinsics.f(tableName, "tableName");
        Intrinsics.f(tableSchema, "tableSchema");
        String str = "CREATE TABLE IF NOT EXISTS " + tableName + tableSchema + ';';
        synchronized (f22678c) {
            SQLiteDatabase sQLiteDatabase = f22677b;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.execSQL(str);
            }
        }
    }

    @JvmStatic
    public static final int a(String tableName, String[] strArr, String str, String[] strArr2, String str2, String str3, String str4, String str5) {
        Cursor cursorQuery;
        int columnIndex;
        Intrinsics.f(tableName, "tableName");
        synchronized (f22678c) {
            SQLiteDatabase sQLiteDatabase = f22677b;
            cursorQuery = sQLiteDatabase != null ? sQLiteDatabase.query(tableName, new String[]{"COUNT(*) AS count"}, str, strArr2, str2, str3, str4, str5) : null;
        }
        int i2 = 0;
        try {
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst() && (columnIndex = cursorQuery.getColumnIndex("count")) >= 0) {
                        i2 = cursorQuery.getInt(columnIndex);
                    }
                    cursorQuery.close();
                    return i2;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        CloseableKt.a(cursorQuery, th);
                        throw th2;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return i2;
    }
}
