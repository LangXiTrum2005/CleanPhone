package com.mbridge.msdk.tracker;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import android.util.Log;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f36845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f36846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f36847c = new Object();

    public c(b bVar, String str) {
        this.f36845a = bVar;
        this.f36846b = str;
    }

    private static boolean c(SQLiteDatabase sQLiteDatabase) {
        return sQLiteDatabase == null || !sQLiteDatabase.isOpen() || sQLiteDatabase.isReadOnly();
    }

    private static void d(SQLiteDatabase sQLiteDatabase) {
        if (y.b(sQLiteDatabase)) {
            return;
        }
        try {
            sQLiteDatabase.setTransactionSuccessful();
        } catch (Exception e10) {
            if (a.f36843a) {
                Log.e("TrackManager", "transactionSuccess: ", e10);
            }
        }
    }

    public long a(i iVar) {
        SQLiteDatabase writableDatabase;
        synchronized (this.f36847c) {
            long jInsert = -1;
            if (y.b(this.f36845a)) {
                return -1L;
            }
            try {
                writableDatabase = this.f36845a.getWritableDatabase();
            } catch (Exception e10) {
                if (a.f36843a) {
                    Log.e("TrackManager", "insert getWritableDatabase: " + e10.getMessage());
                }
                writableDatabase = null;
            }
            if (c(writableDatabase)) {
                return -1L;
            }
            try {
                try {
                    a(writableDatabase);
                    ContentValues contentValues = new ContentValues(16);
                    e eVarD = iVar.d();
                    contentValues.put("name", eVarD.g());
                    contentValues.put("type", Integer.valueOf(eVarD.m()));
                    contentValues.put("time_stamp", Long.valueOf(eVarD.l()));
                    contentValues.put("properties", eVarD.i().toString());
                    contentValues.put(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, Integer.valueOf(eVarD.h()));
                    contentValues.put("state", Integer.valueOf(iVar.j()));
                    contentValues.put("report_count", Integer.valueOf(iVar.h()));
                    contentValues.put("uuid", eVarD.n());
                    contentValues.put("ignore_max_timeout", Integer.valueOf(!eVarD.p() ? 1 : 0));
                    contentValues.put("ignore_max_retry_times", Integer.valueOf(!eVarD.o() ? 1 : 0));
                    contentValues.put("invalid_time", Long.valueOf(iVar.g()));
                    jInsert = writableDatabase.insert(this.f36846b, null, contentValues);
                    d(writableDatabase);
                    b(writableDatabase);
                } catch (Throwable th2) {
                    b(writableDatabase);
                    throw th2;
                }
            } catch (Exception e11) {
                if (a.f36843a) {
                    Log.e("TrackManager", "insert: " + e11.getMessage());
                }
                b(writableDatabase);
            }
            return jInsert;
        }
    }

    public int b() {
        SQLiteDatabase writableDatabase;
        synchronized (this.f36847c) {
            int iMax = 0;
            if (y.b(this.f36845a)) {
                return 0;
            }
            Cursor cursorQuery = null;
            try {
                writableDatabase = this.f36845a.getWritableDatabase();
            } catch (Exception e10) {
                if (a.f36843a) {
                    Log.e("TrackManager", "getAvailableCount getWritableDatabase: " + e10.getMessage());
                }
                writableDatabase = null;
            }
            try {
                if (c(writableDatabase)) {
                    return 0;
                }
                a(writableDatabase);
                cursorQuery = writableDatabase.query(this.f36846b, null, "state = ? OR state = ?", new String[]{String.valueOf(3), String.valueOf(0)}, null, null, null, null);
                if (cursorQuery != null && cursorQuery.moveToNext()) {
                    iMax = Math.max(cursorQuery.getCount(), 0);
                }
                d(writableDatabase);
                return iMax;
            } catch (Exception e11) {
                if (a.f36843a) {
                    Log.e("TrackManager", "getAvailableCount: " + e11.getMessage());
                }
            } finally {
                b(writableDatabase);
                y.a(cursorQuery);
            }
        }
    }

    public void c(List<i> list) {
        SQLiteDatabase writableDatabase;
        synchronized (this.f36847c) {
            if (y.b(this.f36845a) || y.b((List<?>) list)) {
                return;
            }
            try {
                writableDatabase = this.f36845a.getWritableDatabase();
            } catch (Exception e10) {
                if (a.f36843a) {
                    Log.e("TrackManager", "updateReportStateSuccess getWritableDatabase: " + e10.getMessage());
                }
                writableDatabase = null;
            }
            try {
                if (c(writableDatabase)) {
                    return;
                }
                a(writableDatabase);
                for (i iVar : list) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("state", (Integer) 2);
                    writableDatabase.update(this.f36846b, contentValues, "uuid = ?", new String[]{iVar.k()});
                }
                d(writableDatabase);
            } catch (Exception e11) {
                if (a.f36843a) {
                    Log.e("TrackManager", "updateReportStateSuccess: " + e11.getMessage());
                }
            } finally {
                b(writableDatabase);
            }
        }
    }

    public void c() {
        SQLiteDatabase writableDatabase;
        synchronized (this.f36847c) {
            if (y.b(this.f36845a)) {
                return;
            }
            try {
                writableDatabase = this.f36845a.getWritableDatabase();
            } catch (Exception e10) {
                if (a.f36843a) {
                    Log.e("TrackManager", "updateReportStateForReporting getWritableDatabase: " + e10.getMessage());
                }
                writableDatabase = null;
            }
            if (c(writableDatabase)) {
                return;
            }
            try {
                try {
                    a(writableDatabase);
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("state", (Integer) 3);
                    contentValues.put("report_error_message", "update from reporting");
                    writableDatabase.update(this.f36846b, contentValues, "state = ?", new String[]{String.valueOf(1)});
                    d(writableDatabase);
                    b(writableDatabase);
                } catch (Throwable th2) {
                    b(writableDatabase);
                    throw th2;
                }
            } catch (Exception e11) {
                if (a.f36843a) {
                    Log.e("TrackManager", "updateReportStateForReporting: " + e11.getMessage());
                }
                b(writableDatabase);
            }
        }
    }

    public void b(List<i> list) {
        SQLiteDatabase writableDatabase;
        synchronized (this.f36847c) {
            if (y.b(this.f36845a) || y.b((List<?>) list)) {
                return;
            }
            try {
                writableDatabase = this.f36845a.getWritableDatabase();
            } catch (Exception e10) {
                if (a.f36843a) {
                    Log.e("TrackManager", "updateReportStateReporting getWritableDatabase: " + e10.getMessage());
                }
                writableDatabase = null;
            }
            try {
                if (c(writableDatabase)) {
                    return;
                }
                a(writableDatabase);
                for (i iVar : list) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("state", (Integer) 1);
                    writableDatabase.update(this.f36846b, contentValues, "uuid = ?", new String[]{iVar.k()});
                }
                d(writableDatabase);
            } catch (Exception e11) {
                if (a.f36843a) {
                    Log.e("TrackManager", "updateReportStateReporting: " + e11.getMessage());
                }
            } finally {
                b(writableDatabase);
            }
        }
    }

    public List<i> a(int i10) {
        SQLiteDatabase writableDatabase;
        List<i> list;
        synchronized (this.f36847c) {
            Cursor cursor = null;
            List<i> listB = null;
            cursor = null;
            if (y.b(this.f36845a)) {
                return null;
            }
            try {
                writableDatabase = this.f36845a.getWritableDatabase();
            } catch (Exception e10) {
                if (a.f36843a) {
                    Log.e("TrackManager", "getAvailable getWritableDatabase: " + e10.getMessage());
                }
                writableDatabase = null;
            }
            if (c(writableDatabase)) {
                return null;
            }
            try {
                try {
                    a(writableDatabase);
                    Cursor cursorQuery = writableDatabase.query(this.f36846b, null, "state = ? OR state = ?", new String[]{String.valueOf(0), String.valueOf(3)}, null, null, "priority DESC", String.valueOf(i10));
                    try {
                        listB = y.b(cursorQuery);
                        d(writableDatabase);
                        b(writableDatabase);
                        y.a(cursorQuery);
                    } catch (Exception e11) {
                        e = e11;
                        List<i> list2 = listB;
                        cursor = cursorQuery;
                        list = list2;
                        if (a.f36843a) {
                            Log.e("TrackManager", "getAvailable: " + e.getMessage());
                        }
                        b(writableDatabase);
                        y.a(cursor);
                        listB = list;
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = cursorQuery;
                        b(writableDatabase);
                        y.a(cursor);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Exception e12) {
                e = e12;
                list = null;
            }
            return listB;
        }
    }

    private static void b(SQLiteDatabase sQLiteDatabase) {
        if (y.b(sQLiteDatabase) || !sQLiteDatabase.inTransaction()) {
            return;
        }
        try {
            sQLiteDatabase.endTransaction();
        } catch (Exception e10) {
            if (a.f36843a) {
                Log.e("TrackManager", "endTransaction: ", e10);
            }
        }
    }

    public void a(List<i> list) {
        SQLiteDatabase writableDatabase;
        synchronized (this.f36847c) {
            if (y.b(this.f36845a) || y.b((List<?>) list)) {
                return;
            }
            try {
                writableDatabase = this.f36845a.getWritableDatabase();
            } catch (Exception e10) {
                if (a.f36843a) {
                    Log.e("TrackManager", "updateReportStateFailed getWritableDatabase: " + e10.getMessage());
                }
                writableDatabase = null;
            }
            try {
                if (c(writableDatabase)) {
                    return;
                }
                a(writableDatabase);
                for (i iVar : list) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("state", Integer.valueOf(iVar.j()));
                    contentValues.put("report_count", Integer.valueOf(iVar.h()));
                    String strI = iVar.i();
                    if (!TextUtils.isEmpty(strI)) {
                        contentValues.put("report_error_message", strI);
                    }
                    writableDatabase.update(this.f36846b, contentValues, "uuid = ?", new String[]{iVar.k()});
                }
                d(writableDatabase);
            } catch (Exception e11) {
                if (a.f36843a) {
                    Log.e("TrackManager", "updateReportStateFailed: " + e11.getMessage());
                }
            } finally {
                b(writableDatabase);
            }
        }
    }

    public int a() {
        SQLiteDatabase writableDatabase;
        synchronized (this.f36847c) {
            int iDelete = -1;
            if (y.b(this.f36845a)) {
                return -1;
            }
            try {
                writableDatabase = this.f36845a.getWritableDatabase();
            } catch (Exception e10) {
                if (a.f36843a) {
                    Log.e("TrackManager", "deleteInvalidEvents getWritableDatabase: " + e10.getMessage());
                }
                writableDatabase = null;
            }
            if (c(writableDatabase)) {
                return -1;
            }
            try {
                try {
                    a(writableDatabase);
                    iDelete = writableDatabase.delete(this.f36846b, "state = ? OR state = ?", new String[]{String.valueOf(-1), String.valueOf(2)});
                    d(writableDatabase);
                    b(writableDatabase);
                } catch (Throwable th2) {
                    b(writableDatabase);
                    throw th2;
                }
            } catch (Exception e11) {
                if (a.f36843a) {
                    Log.e("TrackManager", "deleteInvalidEvents: " + e11.getMessage());
                }
                b(writableDatabase);
            }
            return iDelete;
        }
    }

    private static void a(SQLiteDatabase sQLiteDatabase) {
        if (y.b(sQLiteDatabase)) {
            return;
        }
        try {
            sQLiteDatabase.beginTransaction();
        } catch (Exception e10) {
            if (a.f36843a) {
                Log.e("TrackManager", "beginTransaction: ", e10);
            }
        }
    }
}
