package com.smartdigimkt.u6;

import android.content.ContentValues;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class a extends b<com.smartdigimkt.p6.l> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile a f38827c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f38828b;

    /* JADX INFO: renamed from: com.smartdigimkt.u6.a$a, reason: collision with other inner class name */
    public static class C0626a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f38829a = "adx_offer_tracking";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f38830b = "placement_id";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f38831c = "dsp_id";
        public static final String d = "offer_id";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f38832e = "tk_type";
        public static final String f = "extra_info";
        public static final String g = "create_time";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final String f38833h = "CREATE TABLE IF NOT EXISTS adx_offer_tracking(placement_id TEXT ,dsp_id TEXT ,offer_id TEXT ,tk_type INTEGER ,extra_info TEXT ,create_time INTEGER)";
    }

    private a(c cVar) {
        super(cVar);
        this.f38828b = a.class.getName();
    }

    public static a a(c cVar) {
        if (f38827c == null) {
            synchronized (a.class) {
                try {
                    if (f38827c == null) {
                        f38827c = new a(cVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f38827c;
    }

    private long d() {
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            return calendar.getTimeInMillis();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public void c() {
        try {
            String str = "create_time < " + d();
            if (b() == null) {
                return;
            }
            b().delete("adx_offer_tracking", str, null);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0044 A[Catch: all -> 0x002d, PHI: r1
  0x0044: PHI (r1v5 android.database.Cursor) = (r1v3 android.database.Cursor), (r1v4 android.database.Cursor), (r1v6 android.database.Cursor) binds: [B:12:0x0030, B:16:0x0037, B:23:0x0042] A[DONT_GENERATE, DONT_INLINE], TryCatch #3 {, blocks: (B:6:0x0028, B:24:0x0044, B:20:0x003d, B:21:0x0040, B:15:0x0034), top: B:34:0x0002, inners: #2 }] */
    public synchronized List<com.smartdigimkt.p6.g> e() {
        Cursor cursorQuery;
        try {
            cursorQuery = a().query("adx_offer_tracking", null, "create_time >= ? ", new String[]{String.valueOf(d())}, null, null, null);
            try {
                List<com.smartdigimkt.p6.g> listA = a(cursorQuery);
                cursorQuery.close();
                listA.size();
                cursorQuery.close();
                return listA;
            } catch (Exception unused) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return null;
            } catch (OutOfMemoryError unused2) {
                try {
                    System.gc();
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                } catch (Throwable th) {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    throw th;
                }
            } catch (Throwable unused3) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return null;
            }
        } catch (Exception unused4) {
            cursorQuery = null;
        } catch (OutOfMemoryError unused5) {
            cursorQuery = null;
        } catch (Throwable unused6) {
            cursorQuery = null;
        }
    }

    public synchronized long a(com.smartdigimkt.p6.g gVar) {
        if (b() == null || gVar == null) {
            return -1L;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("placement_id", gVar.d());
            contentValues.put("dsp_id", gVar.a());
            contentValues.put("offer_id", gVar.c());
            contentValues.put("tk_type", Integer.valueOf(gVar.e()));
            contentValues.put("extra_info", gVar.b());
            contentValues.put("create_time", Long.valueOf(System.currentTimeMillis()));
            gVar.a();
            gVar.c();
            return b().insert("adx_offer_tracking", null, contentValues);
        } catch (Exception unused) {
            return -1L;
        }
    }

    private synchronized List<com.smartdigimkt.p6.g> a(Cursor cursor) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        if (cursor != null && cursor.getCount() > 0) {
            while (cursor.moveToNext()) {
                try {
                    com.smartdigimkt.p6.g gVar = new com.smartdigimkt.p6.g();
                    int columnIndex = cursor.getColumnIndex("placement_id");
                    if (columnIndex >= 0) {
                        gVar.d(cursor.getString(columnIndex));
                    }
                    int columnIndex2 = cursor.getColumnIndex("dsp_id");
                    if (columnIndex2 >= 0) {
                        gVar.a(cursor.getString(columnIndex2));
                    }
                    int columnIndex3 = cursor.getColumnIndex("offer_id");
                    if (columnIndex3 >= 0) {
                        gVar.c(cursor.getString(columnIndex3));
                    }
                    int columnIndex4 = cursor.getColumnIndex("tk_type");
                    if (columnIndex4 >= 0) {
                        gVar.a(cursor.getInt(columnIndex4));
                    }
                    int columnIndex5 = cursor.getColumnIndex("extra_info");
                    if (columnIndex5 >= 0) {
                        gVar.b(cursor.getString(columnIndex5));
                    }
                    arrayList.add(gVar);
                } catch (Throwable unused) {
                }
            }
        }
        return arrayList;
    }
}
