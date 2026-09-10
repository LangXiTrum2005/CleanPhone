package com.adcolony.sdk;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
class p {
    public static void a(String str, ContentValues contentValues, SQLiteDatabase sQLiteDatabase) {
        try {
            try {
                try {
                    sQLiteDatabase.beginTransaction();
                    sQLiteDatabase.insertOrThrow(str, null, contentValues);
                    sQLiteDatabase.setTransactionSuccessful();
                } catch (Throwable th) {
                    new e0.a().a(android.support.v4.media.a.n("Error on insert to ", str, ", db version:")).a(sQLiteDatabase.getVersion()).a(". Values: " + contentValues.toString() + " caused: ").a(th.toString()).a(e0.f9132i);
                }
            } catch (SQLException e2) {
                new e0.a().a("Exception on insert to " + str + ", db version:").a(sQLiteDatabase.getVersion()).a(". Values: " + contentValues.toString() + " caused: ").a(e2.toString()).a(e0.g);
            }
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    public static void a(int i2, long j, String str, String str2, SQLiteDatabase sQLiteDatabase) {
        try {
            try {
                try {
                    sQLiteDatabase.beginTransaction();
                    if (str == null) {
                        str = "rowid";
                        j = -1;
                    }
                    if (i2 >= 0) {
                        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("select " + str + " from " + str2 + " order by " + str + " desc limit 1 offset " + i2, null);
                        if (cursorRawQuery.moveToFirst()) {
                            j = Math.max(j, cursorRawQuery.getLong(0));
                        }
                        cursorRawQuery.close();
                    }
                    if (j >= 0) {
                        sQLiteDatabase.execSQL("delete from " + str2 + " where " + str + " <= " + j);
                    }
                    sQLiteDatabase.setTransactionSuccessful();
                } catch (SQLException e2) {
                    new e0.a().a("Exception on deleting excessive rows:").a(e2.toString()).a(e0.g);
                }
            } finally {
                sQLiteDatabase.endTransaction();
            }
        } catch (Throwable th) {
            new e0.a().a("Error on deleting excessive rows:").a(th.toString()).a(e0.f9132i);
        }
    }
}
