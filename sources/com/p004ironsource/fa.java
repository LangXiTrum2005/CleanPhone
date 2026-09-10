package com.p004ironsource;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.SystemClock;
import android.provider.BaseColumns;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class fa extends SQLiteOpenHelper implements bg {
    private static fa f = null;
    private static final String g = " TEXT";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f24999h = " INTEGER";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f25000i = ",";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ga f25001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f25002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f25003c;
    private final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f25004e;

    public static abstract class a implements BaseColumns {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f25005a = "events";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f25006b = 4;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f25007c = "eventid";
        public static final String d = "timestamp";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f25008e = "type";
        public static final String f = "data";
    }

    public fa(Context context, String str, int i2) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i2);
        this.f25001a = new ga();
        this.f25002b = 4;
        this.f25003c = 400;
        this.d = "DROP TABLE IF EXISTS events";
        this.f25004e = "CREATE TABLE events (_id INTEGER PRIMARY KEY,eventid INTEGER,timestamp INTEGER,type TEXT,data TEXT )";
    }

    private ContentValues a(zb zbVar, String str) {
        if (zbVar == null) {
            return null;
        }
        ContentValues contentValues = new ContentValues(4);
        contentValues.put("eventid", Integer.valueOf(zbVar.c()));
        contentValues.put("timestamp", Long.valueOf(zbVar.d()));
        contentValues.put("type", str);
        contentValues.put("data", zbVar.a());
        return contentValues;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0034 A[Catch: all -> 0x0018, PHI: r1
  0x0034: PHI (r1v3 android.database.sqlite.SQLiteDatabase) = (r1v2 android.database.sqlite.SQLiteDatabase), (r1v4 android.database.sqlite.SQLiteDatabase) binds: [B:19:0x0032, B:8:0x0015] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0011, B:20:0x0034, B:18:0x002e, B:25:0x003c, B:27:0x0042, B:28:0x0045, B:16:0x001e), top: B:31:0x0001, inners: #1 }] */
    @Override // com.p004ironsource.bg
    public synchronized void b(String str) {
        SQLiteDatabase sQLiteDatabaseA;
        String[] strArr = {str};
        try {
            sQLiteDatabaseA = a(true);
            try {
                sQLiteDatabaseA.delete("events", "type = ?", strArr);
                if (sQLiteDatabaseA.isOpen()) {
                    sQLiteDatabaseA.close();
                }
            } catch (Throwable th) {
                th = th;
                try {
                    q9.d().a(th);
                    Log.e("IronSource", "Exception while clearing events: ", th);
                    if (sQLiteDatabaseA != null && sQLiteDatabaseA.isOpen()) {
                        sQLiteDatabaseA.close();
                    }
                } catch (Throwable th2) {
                    if (sQLiteDatabaseA != null && sQLiteDatabaseA.isOpen()) {
                        sQLiteDatabaseA.close();
                    }
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            sQLiteDatabaseA = null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY,eventid INTEGER,timestamp INTEGER,type TEXT,data TEXT )");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS events");
        onCreate(sQLiteDatabase);
    }

    private synchronized SQLiteDatabase a(boolean z2) throws Throwable {
        int i2 = 0;
        while (true) {
            try {
                if (z2) {
                    return this.f25001a.a(true, this);
                }
                return this.f25001a.a(false, this);
            } catch (Throwable th) {
                try {
                    q9.d().a(th);
                    i2++;
                    if (i2 >= 4) {
                        throw th;
                    }
                    SystemClock.sleep(i2 * 400);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public static synchronized fa a(Context context, String str, int i2) {
        try {
            if (f == null) {
                f = new fa(context, str, i2);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x009d A[Catch: all -> 0x006f, PHI: r3
  0x009d: PHI (r3v2 android.database.sqlite.SQLiteDatabase) = (r3v1 android.database.sqlite.SQLiteDatabase), (r3v3 android.database.sqlite.SQLiteDatabase) binds: [B:41:0x009b, B:30:0x0076] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #3 {all -> 0x006f, blocks: (B:3:0x0001, B:24:0x0065, B:26:0x006b, B:29:0x0072, B:42:0x009d, B:36:0x008c, B:38:0x0092, B:40:0x0097, B:48:0x00a6, B:50:0x00ac, B:52:0x00b1, B:54:0x00b7, B:55:0x00ba, B:34:0x007c), top: B:64:0x0001, inners: #0 }] */
    @Override // com.p004ironsource.bg
    public synchronized ArrayList<zb> a(String str) {
        ArrayList<zb> arrayList;
        Throwable th;
        SQLiteDatabase sQLiteDatabaseA;
        try {
            arrayList = new ArrayList<>();
            Cursor cursorQuery = null;
            try {
                sQLiteDatabaseA = a(false);
                try {
                    cursorQuery = sQLiteDatabaseA.query("events", null, "type = ?", new String[]{str}, null, null, "timestamp ASC");
                    if (cursorQuery.getCount() > 0) {
                        cursorQuery.moveToFirst();
                        while (!cursorQuery.isAfterLast()) {
                            int columnIndex = cursorQuery.getColumnIndex("eventid");
                            if (columnIndex >= 0) {
                                int i2 = cursorQuery.getInt(columnIndex);
                                int columnIndex2 = cursorQuery.getColumnIndex("timestamp");
                                if (columnIndex2 >= 0) {
                                    long j = cursorQuery.getLong(columnIndex2);
                                    int columnIndex3 = cursorQuery.getColumnIndex("data");
                                    if (columnIndex3 >= 0) {
                                        arrayList.add(new zb(i2, j, cursorQuery.getString(columnIndex3)));
                                        cursorQuery.moveToNext();
                                    }
                                }
                            }
                        }
                        cursorQuery.close();
                    }
                    if (!cursorQuery.isClosed()) {
                        cursorQuery.close();
                    }
                    if (sQLiteDatabaseA.isOpen()) {
                        sQLiteDatabaseA.close();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        q9.d().a(th);
                        Log.e("IronSource", "Exception while loading events: ", th);
                        if (cursorQuery != null && !cursorQuery.isClosed()) {
                            cursorQuery.close();
                        }
                        if (sQLiteDatabaseA != null && sQLiteDatabaseA.isOpen()) {
                            sQLiteDatabaseA.close();
                        }
                    } catch (Throwable th3) {
                        if (cursorQuery != null && !cursorQuery.isClosed()) {
                            cursorQuery.close();
                        }
                        if (sQLiteDatabaseA == null || !sQLiteDatabaseA.isOpen()) {
                            throw th3;
                        }
                        sQLiteDatabaseA.close();
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                sQLiteDatabaseA = null;
            }
        } catch (Throwable th5) {
            throw th5;
        }
        return arrayList;
    }

    @Override // com.p004ironsource.bg
    public synchronized void a(List<zb> list, String str) {
        if (list != null) {
            if (!list.isEmpty()) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    SQLiteDatabase sQLiteDatabaseA = a(true);
                    try {
                        Iterator<zb> it = list.iterator();
                        while (it.hasNext()) {
                            ContentValues contentValuesA = a(it.next(), str);
                            if (sQLiteDatabaseA != null && contentValuesA != null) {
                                sQLiteDatabaseA.insert("events", null, contentValuesA);
                            }
                        }
                        if (sQLiteDatabaseA != null && sQLiteDatabaseA.isOpen()) {
                            sQLiteDatabaseA.close();
                        }
                    } catch (Throwable th) {
                        th = th;
                        sQLiteDatabase = sQLiteDatabaseA;
                        try {
                            q9.d().a(th);
                            Log.e("IronSource", "Exception while saving events: ", th);
                            if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                                sQLiteDatabaseA = sQLiteDatabase;
                            }
                        } catch (Throwable th2) {
                            if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                                sQLiteDatabase.close();
                            }
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        }
    }
}
