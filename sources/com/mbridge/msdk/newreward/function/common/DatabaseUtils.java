package com.mbridge.msdk.newreward.function.common;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.o0;

/* JADX INFO: loaded from: classes2.dex */
public final class DatabaseUtils {
    private DatabaseUtils() {
    }

    public static void beginTransaction(SQLiteDatabase sQLiteDatabase) {
        if (isDatabaseAvailable(sQLiteDatabase)) {
            try {
                sQLiteDatabase.beginTransaction();
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    o0.b("DatabaseUtils", "beginTransaction", e);
                }
            }
        }
    }

    public static void closeCursor(Cursor cursor) {
        if (cursor == null) {
            return;
        }
        try {
            cursor.close();
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                o0.b("DatabaseUtils", "closeCursor", e);
            }
        }
    }

    public static void endTransaction(SQLiteDatabase sQLiteDatabase) {
        if (isDatabaseAvailable(sQLiteDatabase) && sQLiteDatabase.inTransaction()) {
            try {
                sQLiteDatabase.endTransaction();
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    o0.b("DatabaseUtils", "endTransaction", e);
                }
            }
        }
    }

    public static boolean isDatabaseAvailable(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase == null) {
            return false;
        }
        try {
            return sQLiteDatabase.isOpen() && !sQLiteDatabase.isReadOnly();
        } catch (Exception unused) {
            return false;
        }
    }

    public static void setTransactionSuccessful(SQLiteDatabase sQLiteDatabase) {
        if (isDatabaseAvailable(sQLiteDatabase)) {
            try {
                sQLiteDatabase.setTransactionSuccessful();
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    o0.b("DatabaseUtils", "setTransactionSuccessful", e);
                }
            }
        }
    }
}
