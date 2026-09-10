package com.smartdigimkt.u6;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.p004ironsource.dc;
import com.smartdigimkt.p6.o;

/* JADX INFO: loaded from: classes6.dex */
public class n extends b<o> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile n f38921c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f38922b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f38923a = "video_res_cache_info";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f38924b = "video_url";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f38925c = "file_path";
        public static final String d = "ready_rate";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f38926e = "download_size";
        public static final String f = "total_size";
        public static final String g = "update_time";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final String f38927h = "CREATE TABLE IF NOT EXISTS video_res_cache_info(video_url TEXT, file_path TEXT, ready_rate INTEGER, download_size INTEGER, total_size INTEGER, update_time INTEGER )";
    }

    private n(c cVar) {
        super(cVar);
        this.f38922b = dc.q;
    }

    public static n a(c cVar) {
        if (f38921c == null) {
            synchronized (m.class) {
                try {
                    if (f38921c == null) {
                        f38921c = new n(cVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f38921c;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0037 A[PHI: r11
  0x0037: PHI (r11v3 android.database.Cursor) = (r11v2 android.database.Cursor), (r11v4 android.database.Cursor) binds: [B:15:0x0035, B:12:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    private boolean b(String str) {
        Cursor cursorQuery;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            cursorQuery = a().query("video_res_cache_info", new String[]{"video_url"}, "video_url=?", new String[]{str}, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.getCount() > 0) {
                        cursorQuery.close();
                        cursorQuery.close();
                        return true;
                    }
                } catch (Throwable unused) {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        } catch (Throwable unused2) {
            cursorQuery = null;
        }
        return false;
    }

    public long c() {
        Cursor cursorQuery = null;
        try {
            cursorQuery = a().query("video_res_cache_info", new String[]{"sum(download_size)"}, null, null, null, null, null);
            if (cursorQuery.moveToNext()) {
                long j = cursorQuery.getLong(0);
                cursorQuery.close();
                cursorQuery.close();
                return j;
            }
        } catch (Throwable th) {
            try {
                th.getMessage();
                if (cursorQuery == null) {
                    return 0L;
                }
            } finally {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            }
        }
        return 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00ae, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00af, code lost:
    
        r0.getMessage();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List<com.smartdigimkt.p6.o> d() {
        /*
            r11 = this;
            java.lang.String r0 = "update_time"
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r11.a()     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r4 = "video_res_cache_info"
            java.lang.String r10 = "update_time DESC"
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r2 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> Lb3
            int r3 = r2.getCount()     // Catch: java.lang.Throwable -> Lb3
            if (r3 <= 0) goto Lb9
            int r3 = r2.getCount()     // Catch: java.lang.Throwable -> Lb3
            double r3 = (double) r3     // Catch: java.lang.Throwable -> Lb3
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r3 = r3 * r5
            double r3 = r3 + r5
            r5 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r3 = r3 / r5
            long r3 = java.lang.Math.round(r3)     // Catch: java.lang.Throwable -> Lb3
            int r3 = (int) r3     // Catch: java.lang.Throwable -> Lb3
            int r3 = r3 + (-1)
            boolean r3 = r2.moveToPosition(r3)     // Catch: java.lang.Throwable -> Lb3
            if (r3 == 0) goto Lb9
            int r3 = r2.getColumnIndex(r0)     // Catch: java.lang.Throwable -> Lb3
            long r3 = r2.getLong(r3)     // Catch: java.lang.Throwable -> Lb3
        L40:
            com.smartdigimkt.p6.o r5 = new com.smartdigimkt.p6.o     // Catch: java.lang.Throwable -> Lb3
            r5.<init>()     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r6 = "video_url"
            int r6 = r2.getColumnIndex(r6)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r6 = r2.getString(r6)     // Catch: java.lang.Throwable -> Lb3
            r5.b(r6)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r6 = "file_path"
            int r6 = r2.getColumnIndex(r6)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r6 = r2.getString(r6)     // Catch: java.lang.Throwable -> Lb3
            r5.a(r6)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r6 = "ready_rate"
            int r6 = r2.getColumnIndex(r6)     // Catch: java.lang.Throwable -> Lb3
            int r6 = r2.getInt(r6)     // Catch: java.lang.Throwable -> Lb3
            r5.a(r6)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r6 = "download_size"
            int r6 = r2.getColumnIndex(r6)     // Catch: java.lang.Throwable -> Lb3
            long r6 = r2.getLong(r6)     // Catch: java.lang.Throwable -> Lb3
            r5.a(r6)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r6 = "total_size"
            int r6 = r2.getColumnIndex(r6)     // Catch: java.lang.Throwable -> Lb3
            long r6 = r2.getLong(r6)     // Catch: java.lang.Throwable -> Lb3
            r5.c(r6)     // Catch: java.lang.Throwable -> Lb3
            int r6 = r2.getColumnIndex(r0)     // Catch: java.lang.Throwable -> Lb3
            long r6 = r2.getLong(r6)     // Catch: java.lang.Throwable -> Lb3
            r5.b(r6)     // Catch: java.lang.Throwable -> Lb3
            r1.add(r5)     // Catch: java.lang.Throwable -> Lb3
            boolean r5 = r2.moveToNext()     // Catch: java.lang.Throwable -> Lb3
            if (r5 != 0) goto L40
            android.database.sqlite.SQLiteDatabase r0 = r11.b()     // Catch: java.lang.Throwable -> Lae
            java.lang.String r5 = "video_res_cache_info"
            java.lang.String r6 = "update_time<=?"
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> Lae
            java.lang.String[] r3 = new java.lang.String[]{r3}     // Catch: java.lang.Throwable -> Lae
            r0.delete(r5, r6, r3)     // Catch: java.lang.Throwable -> Lae
            goto Lb9
        Lae:
            r0 = move-exception
            r0.getMessage()     // Catch: java.lang.Throwable -> Lb3
            goto Lb9
        Lb3:
            r0 = move-exception
            r0.getMessage()     // Catch: java.lang.Throwable -> Lbd
            if (r2 == 0) goto Lbc
        Lb9:
            r2.close()
        Lbc:
            return r1
        Lbd:
            r0 = move-exception
            if (r2 == 0) goto Lc3
            r2.close()
        Lc3:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smartdigimkt.u6.n.d():java.util.List");
    }

    public void e(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("update_time", Long.valueOf(System.currentTimeMillis()));
            b().update("video_res_cache_info", contentValues, "video_url = ? ", new String[]{str});
        } catch (Throwable unused) {
        }
    }

    public synchronized void a(String str, String str2, long j, long j2, int i2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("video_url", str);
            contentValues.put("file_path", str2);
            contentValues.put("ready_rate", Integer.valueOf(i2));
            contentValues.put("download_size", Long.valueOf(j2));
            contentValues.put("total_size", Long.valueOf(j));
            contentValues.put("update_time", Long.valueOf(System.currentTimeMillis()));
            if (b(str)) {
                b().update("video_res_cache_info", contentValues, "video_url = ? ", new String[]{str});
            } else {
                b().insert("video_res_cache_info", null, contentValues);
            }
        } catch (Throwable unused) {
        }
    }

    private void c(String str) {
        Cursor cursorQuery = null;
        try {
            cursorQuery = a().query("video_res_cache_info", null, null, null, null, null, null);
            cursorQuery.getCount();
            cursorQuery.close();
        } catch (Throwable th) {
            try {
                th.getMessage();
            } finally {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            }
        }
    }

    public o a(String str) {
        Cursor cursorQuery;
        try {
            cursorQuery = a().query("video_res_cache_info", null, "video_url=?", new String[]{str}, null, null, null);
            try {
                if (cursorQuery.moveToNext()) {
                    o oVar = new o();
                    oVar.b(str);
                    oVar.a(cursorQuery.getString(cursorQuery.getColumnIndex("file_path")));
                    oVar.a(cursorQuery.getInt(cursorQuery.getColumnIndex("ready_rate")));
                    oVar.a(cursorQuery.getLong(cursorQuery.getColumnIndex("download_size")));
                    oVar.c(cursorQuery.getLong(cursorQuery.getColumnIndex("total_size")));
                    oVar.b(cursorQuery.getLong(cursorQuery.getColumnIndex("update_time")));
                    cursorQuery.close();
                    cursorQuery.close();
                    return oVar;
                }
            } catch (Throwable unused) {
                if (cursorQuery != null) {
                }
                return null;
            }
        } catch (Throwable unused2) {
            cursorQuery = null;
        }
        cursorQuery.close();
        return null;
    }

    public void d(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            b().delete("video_res_cache_info", "video_url=?", new String[]{str});
        } catch (Throwable th) {
            th.getMessage();
        }
    }
}
