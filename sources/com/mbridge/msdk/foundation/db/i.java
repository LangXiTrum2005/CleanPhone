package com.mbridge.msdk.foundation.db;

import android.content.ContentValues;
import android.database.Cursor;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class i extends a<com.mbridge.msdk.foundation.entity.f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static i f33490a;

    private i(f fVar) {
        super(fVar);
    }

    public static synchronized i a(f fVar) {
        try {
            if (f33490a == null) {
                f33490a = new i(fVar);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f33490a;
    }

    public synchronized void a(String str) {
        try {
            String[] strArr = {String.valueOf(System.currentTimeMillis() - 86400000), str};
            if (getWritableDatabase() != null) {
                getWritableDatabase().delete("fq_info", "time< ? and unitId=?", strArr);
            }
        } catch (Exception unused) {
        }
    }

    public synchronized void a(com.mbridge.msdk.foundation.entity.f fVar) {
        try {
            try {
                if (getWritableDatabase() == null) {
                    return;
                }
                if (fVar != null) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("id", fVar.a());
                    contentValues.put("time", Long.valueOf(fVar.b()));
                    contentValues.put("unitId", fVar.d());
                    contentValues.put("type", Integer.valueOf(fVar.c()));
                    if (a(fVar.d(), fVar.a())) {
                        getWritableDatabase().update("fq_info", contentValues, "id = ? AND unitId = ? ", new String[]{fVar.a(), fVar.d()});
                    } else {
                        getWritableDatabase().insert("fq_info", null, contentValues);
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private synchronized boolean a(String str, String str2) {
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("select id from fq_info where unitId= ?  and id= ? ", new String[]{str, str2});
            if (cursorRawQuery != null && cursorRawQuery.getCount() > 0) {
                cursorRawQuery.close();
                return true;
            }
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            return false;
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }
}
