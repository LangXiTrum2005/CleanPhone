package com.ironsource;

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

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class C4 extends SQLiteOpenHelper implements E7 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static C4 f25836f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f25837g = " TEXT";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f25838h = " INTEGER";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f25839i = ",";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final D4 f25840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f25841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f25842c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f25843d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f25844e;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static abstract class a implements BaseColumns {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f25845a = "events";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f25846b = 4;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f25847c = "eventid";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f25848d = "timestamp";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f25849e = "type";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f25850f = "data";
    }

    public C4(Context context, String str, int i10) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i10);
        this.f25840a = new D4();
        this.f25841b = 4;
        this.f25842c = 400;
        this.f25843d = "DROP TABLE IF EXISTS events";
        this.f25844e = "CREATE TABLE events (_id INTEGER PRIMARY KEY,eventid INTEGER,timestamp INTEGER,type TEXT,data TEXT )";
    }

    public static synchronized C4 a(Context context, String str, int i10) {
        try {
            if (f25836f == null) {
                f25836f = new C4(context, str, i10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f25836f;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0034 A[Catch: all -> 0x0018, PHI: r1
  0x0034: PHI (r1v3 android.database.sqlite.SQLiteDatabase) = (r1v2 android.database.sqlite.SQLiteDatabase), (r1v4 android.database.sqlite.SQLiteDatabase) binds: [B:19:0x0032, B:8:0x0015] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0011, B:20:0x0034, B:18:0x002e, B:25:0x003c, B:27:0x0042, B:28:0x0045, B:16:0x001e), top: B:31:0x0001, inners: #1 }] */
    @Override // com.ironsource.E7
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
            } catch (Throwable th2) {
                th = th2;
                try {
                    C0474n4.d().a(th);
                    Log.e("IronSource", "Exception while clearing events: ", th);
                    if (sQLiteDatabaseA != null && sQLiteDatabaseA.isOpen()) {
                        sQLiteDatabaseA.close();
                    }
                } catch (Throwable th3) {
                    if (sQLiteDatabaseA != null && sQLiteDatabaseA.isOpen()) {
                        sQLiteDatabaseA.close();
                    }
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            sQLiteDatabaseA = null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY,eventid INTEGER,timestamp INTEGER,type TEXT,data TEXT )");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS events");
        onCreate(sQLiteDatabase);
    }

    @Override // com.ironsource.E7
    public synchronized void a(List<C0654x5> list, String str) {
        if (list != null) {
            if (!list.isEmpty()) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    SQLiteDatabase sQLiteDatabaseA = a(true);
                    try {
                        Iterator<C0654x5> it = list.iterator();
                        while (it.hasNext()) {
                            ContentValues contentValuesA = a(it.next(), str);
                            if (sQLiteDatabaseA != null && contentValuesA != null) {
                                sQLiteDatabaseA.insert("events", null, contentValuesA);
                            }
                        }
                        if (sQLiteDatabaseA != null && sQLiteDatabaseA.isOpen()) {
                            sQLiteDatabaseA.close();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        sQLiteDatabase = sQLiteDatabaseA;
                        try {
                            C0474n4.d().a(th);
                            Log.e("IronSource", "Exception while saving events: ", th);
                            if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                                sQLiteDatabaseA = sQLiteDatabase;
                            }
                        } catch (Throwable th3) {
                            if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                                sQLiteDatabase.close();
                            }
                            throw th3;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x009d A[Catch: all -> 0x006f, PHI: r3
  0x009d: PHI (r3v2 android.database.sqlite.SQLiteDatabase) = (r3v1 android.database.sqlite.SQLiteDatabase), (r3v3 android.database.sqlite.SQLiteDatabase) binds: [B:41:0x009b, B:30:0x0076] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #3 {all -> 0x006f, blocks: (B:3:0x0001, B:24:0x0065, B:26:0x006b, B:29:0x0072, B:42:0x009d, B:36:0x008c, B:38:0x0092, B:40:0x0097, B:48:0x00a6, B:50:0x00ac, B:52:0x00b1, B:54:0x00b7, B:55:0x00ba, B:34:0x007c), top: B:64:0x0001, inners: #0 }] */
    @Override // com.ironsource.E7
    public synchronized ArrayList<C0654x5> a(String str) {
        ArrayList<C0654x5> arrayList;
        Throwable th2;
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
                                int i10 = cursorQuery.getInt(columnIndex);
                                int columnIndex2 = cursorQuery.getColumnIndex("timestamp");
                                if (columnIndex2 >= 0) {
                                    long j10 = cursorQuery.getLong(columnIndex2);
                                    int columnIndex3 = cursorQuery.getColumnIndex("data");
                                    if (columnIndex3 >= 0) {
                                        arrayList.add(new C0654x5(i10, j10, cursorQuery.getString(columnIndex3)));
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
                } catch (Throwable th3) {
                    th2 = th3;
                    try {
                        C0474n4.d().a(th2);
                        Log.e("IronSource", "Exception while loading events: ", th2);
                        if (cursorQuery != null && !cursorQuery.isClosed()) {
                            cursorQuery.close();
                        }
                        if (sQLiteDatabaseA != null && sQLiteDatabaseA.isOpen()) {
                            sQLiteDatabaseA.close();
                        }
                    } catch (Throwable th4) {
                        if (cursorQuery != null && !cursorQuery.isClosed()) {
                            cursorQuery.close();
                        }
                        if (sQLiteDatabaseA == null || !sQLiteDatabaseA.isOpen()) {
                            throw th4;
                        }
                        sQLiteDatabaseA.close();
                        throw th4;
                    }
                }
            } catch (Throwable th5) {
                th2 = th5;
                sQLiteDatabaseA = null;
            }
        } catch (Throwable th6) {
            throw th6;
        }
        return arrayList;
    }

    private ContentValues a(C0654x5 c0654x5, String str) {
        if (c0654x5 == null) {
            return null;
        }
        ContentValues contentValues = new ContentValues(4);
        contentValues.put("eventid", Integer.valueOf(c0654x5.c()));
        contentValues.put("timestamp", Long.valueOf(c0654x5.d()));
        contentValues.put("type", str);
        contentValues.put("data", c0654x5.a());
        return contentValues;
    }

    private synchronized SQLiteDatabase a(boolean z10) throws Throwable {
        int i10 = 0;
        while (true) {
            try {
                if (z10) {
                    return this.f25840a.a(true, this);
                }
                return this.f25840a.a(false, this);
            } catch (Throwable th2) {
                try {
                    C0474n4.d().a(th2);
                    i10++;
                    if (i10 < 4) {
                        SystemClock.sleep(i10 * 400);
                    } else {
                        throw th2;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }
}
