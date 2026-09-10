package com.smartdigimkt.u6;

import android.content.ContentValues;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class g extends b<com.smartdigimkt.p6.k> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile g f38866c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f38867b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f38868a = "dsp_offer_install_record";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f38869b = "dsp_id";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f38870c = "dsp_offer_id";
        public static final String d = "package_name";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f38871e = "last_update_time";
        public static final String f = "CREATE TABLE IF NOT EXISTS dsp_offer_install_record(dsp_id TEXT ,dsp_offer_id TEXT ,package_name TEXT ,last_update_time INTEGER)";
    }

    private g(c cVar) {
        super(cVar);
        this.f38867b = g.class.getName();
    }

    public static g a(c cVar) {
        if (f38866c == null) {
            synchronized (g.class) {
                try {
                    if (f38866c == null) {
                        f38866c = new g(cVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f38866c;
    }

    public synchronized long a(com.smartdigimkt.p6.k kVar) {
        if (b() != null && kVar != null) {
            if (!a(kVar.a(), kVar.b())) {
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("dsp_id", kVar.a());
                    contentValues.put("dsp_offer_id", kVar.b());
                    contentValues.put("package_name", kVar.c());
                    contentValues.put("last_update_time", Long.valueOf(System.currentTimeMillis()));
                    kVar.a();
                    kVar.b();
                    kVar.c();
                    return b().insert("dsp_offer_install_record", null, contentValues);
                } catch (Exception unused) {
                }
            } else {
                kVar.a();
                kVar.b();
                kVar.c();
            }
            return -1L;
        }
        return -1L;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0043 A[Catch: all -> 0x0027, PHI: r0
  0x0043: PHI (r0v7 android.database.Cursor) = 
  (r0v1 android.database.Cursor)
  (r0v4 android.database.Cursor)
  (r0v5 android.database.Cursor)
  (r0v8 android.database.Cursor)
 binds: [B:18:0x002f, B:22:0x0037, B:28:0x0041, B:16:0x002c] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {, blocks: (B:9:0x0021, B:29:0x0043, B:26:0x003d, B:27:0x0040, B:20:0x0032, B:4:0x0002, B:6:0x0018, B:8:0x001e), top: B:35:0x0002, inners: #2, #5, #4 }] */
    private synchronized boolean a(String str, String str2) {
        Cursor cursorQuery = null;
        try {
            cursorQuery = a().query("dsp_offer_install_record", null, "dsp_id = ?  AND dsp_offer_id = ? ", new String[]{str, str2}, null, null, null);
            if (cursorQuery == null || cursorQuery.getCount() <= 0) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return false;
            }
            cursorQuery.close();
            cursorQuery.close();
            return true;
        } catch (Exception unused) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        } catch (OutOfMemoryError unused2) {
            Cursor cursor = cursorQuery;
            try {
                System.gc();
                if (cursor != null) {
                    cursorQuery = cursor;
                    cursorQuery.close();
                }
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                    throw th;
                }
                throw th;
            }
        } catch (Throwable unused3) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    public synchronized List<com.smartdigimkt.p6.j> a(int i2) {
        ArrayList arrayList = new ArrayList();
        if (i2 <= 0) {
            return arrayList;
        }
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = a().query("dsp_offer_install_record", null, null, null, null, null, "last_update_time DESC", i2 + "");
                List<com.smartdigimkt.p6.k> listA = a(cursorQuery);
                cursorQuery.close();
                listA.size();
                arrayList.addAll(listA);
            } catch (Exception unused) {
                if (cursorQuery != null) {
                }
                return arrayList;
            } catch (OutOfMemoryError unused2) {
                System.gc();
                if (cursorQuery != null) {
                }
                return arrayList;
            } catch (Throwable unused3) {
                if (cursorQuery != null) {
                }
                return arrayList;
            }
            cursorQuery.close();
            return arrayList;
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
                throw th;
            }
            throw th;
        }
    }

    private synchronized List<com.smartdigimkt.p6.k> a(Cursor cursor) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        if (cursor != null && cursor.getCount() > 0) {
            while (cursor.moveToNext()) {
                try {
                    com.smartdigimkt.p6.k kVar = new com.smartdigimkt.p6.k();
                    kVar.a(cursor.getString(cursor.getColumnIndex("dsp_id")));
                    kVar.b(cursor.getString(cursor.getColumnIndex("dsp_offer_id")));
                    kVar.c(cursor.getString(cursor.getColumnIndex("package_name")));
                    arrayList.add(kVar);
                } catch (Throwable unused) {
                }
            }
        }
        return arrayList;
    }
}
