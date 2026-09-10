package com.thinkup.core.common.oo;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes6.dex */
public class o0m extends n<com.thinkup.core.common.o.nm> {
    private static volatile o0m m;
    private final String o;

    public static class o {
        public static final String m = "video_url";
        public static final String m0 = "CREATE TABLE IF NOT EXISTS video_res_cache_info(video_url TEXT, file_path TEXT, ready_rate INTEGER, download_size INTEGER, total_size INTEGER, update_time INTEGER )";

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final String f42275n = "file_path";
        public static final String o = "video_res_cache_info";
        public static final String o0 = "ready_rate";
        public static final String om = "total_size";
        public static final String on = "update_time";
        public static final String oo = "download_size";
    }

    private o0m(o0 o0Var) {
        super(o0Var);
        this.o = "o0m";
    }

    public static o0m o(o0 o0Var) {
        if (m == null) {
            synchronized (o00.class) {
                try {
                    if (m == null) {
                        m = new o0m(o0Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return m;
    }

    private void o0(String str) {
        Cursor cursorQuery = null;
        try {
            cursorQuery = n().query("video_res_cache_info", null, null, null, null, null, null);
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

    private boolean oo(String str) {
        Cursor cursorQuery;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            cursorQuery = n().query("video_res_cache_info", new String[]{"video_url"}, "video_url=?", new String[]{str}, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.getCount() > 0) {
                        cursorQuery.close();
                        cursorQuery.close();
                        return true;
                    }
                } catch (Throwable unused) {
                    if (cursorQuery != null) {
                    }
                    return false;
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

    public final void m(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("update_time", Long.valueOf(System.currentTimeMillis()));
            o0().update("video_res_cache_info", contentValues, "video_url = ? ", new String[]{str});
        } catch (Throwable unused) {
        }
    }

    public final void n(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            o0().delete("video_res_cache_info", "video_url=?", new String[]{str});
        } catch (Throwable th) {
            th.getMessage();
        }
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
    public final java.util.List<com.thinkup.core.common.o.nm> m() {
        /*
            r11 = this;
            java.lang.String r0 = "update_time"
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r11.n()     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r4 = "video_res_cache_info"
            java.lang.String r10 = "update_time DESC"
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r2 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> Lb3
            int r3 = r2.getCount()     // Catch: java.lang.Throwable -> Lb3
            if (r3 <= 0) goto Lb5
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
            if (r3 == 0) goto Lb5
            int r3 = r2.getColumnIndex(r0)     // Catch: java.lang.Throwable -> Lb3
            long r3 = r2.getLong(r3)     // Catch: java.lang.Throwable -> Lb3
        L40:
            com.thinkup.core.common.o.nm r5 = new com.thinkup.core.common.o.nm     // Catch: java.lang.Throwable -> Lb3
            r5.<init>()     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r6 = "video_url"
            int r6 = r2.getColumnIndex(r6)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r6 = r2.getString(r6)     // Catch: java.lang.Throwable -> Lb3
            r5.o(r6)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r6 = "file_path"
            int r6 = r2.getColumnIndex(r6)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r6 = r2.getString(r6)     // Catch: java.lang.Throwable -> Lb3
            r5.m(r6)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r6 = "ready_rate"
            int r6 = r2.getColumnIndex(r6)     // Catch: java.lang.Throwable -> Lb3
            int r6 = r2.getInt(r6)     // Catch: java.lang.Throwable -> Lb3
            r5.o(r6)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r6 = "download_size"
            int r6 = r2.getColumnIndex(r6)     // Catch: java.lang.Throwable -> Lb3
            long r6 = r2.getLong(r6)     // Catch: java.lang.Throwable -> Lb3
            r5.m(r6)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r6 = "total_size"
            int r6 = r2.getColumnIndex(r6)     // Catch: java.lang.Throwable -> Lb3
            long r6 = r2.getLong(r6)     // Catch: java.lang.Throwable -> Lb3
            r5.o(r6)     // Catch: java.lang.Throwable -> Lb3
            int r6 = r2.getColumnIndex(r0)     // Catch: java.lang.Throwable -> Lb3
            long r6 = r2.getLong(r6)     // Catch: java.lang.Throwable -> Lb3
            r5.n(r6)     // Catch: java.lang.Throwable -> Lb3
            r1.add(r5)     // Catch: java.lang.Throwable -> Lb3
            boolean r5 = r2.moveToNext()     // Catch: java.lang.Throwable -> Lb3
            if (r5 != 0) goto L40
            android.database.sqlite.SQLiteDatabase r0 = r11.o0()     // Catch: java.lang.Throwable -> Lae
            java.lang.String r5 = "video_res_cache_info"
            java.lang.String r6 = "update_time<=?"
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> Lae
            java.lang.String[] r3 = new java.lang.String[]{r3}     // Catch: java.lang.Throwable -> Lae
            r0.delete(r5, r6, r3)     // Catch: java.lang.Throwable -> Lae
            goto Lb5
        Lae:
            r0 = move-exception
            r0.getMessage()     // Catch: java.lang.Throwable -> Lb3
            goto Lb5
        Lb3:
            r0 = move-exception
            goto Lb9
        Lb5:
            r2.close()
            goto Lbf
        Lb9:
            r0.getMessage()     // Catch: java.lang.Throwable -> Lc0
            if (r2 == 0) goto Lbf
            goto Lb5
        Lbf:
            return r1
        Lc0:
            r0 = move-exception
            if (r2 == 0) goto Lc6
            r2.close()
        Lc6:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.thinkup.core.common.oo.o0m.m():java.util.List");
    }

    public final synchronized void o(String str, String str2, long j, long j2, int i2) {
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
            if (oo(str)) {
                o0().update("video_res_cache_info", contentValues, "video_url = ? ", new String[]{str});
            } else {
                o0().insert("video_res_cache_info", null, contentValues);
            }
        } catch (Throwable unused) {
        }
    }

    public final com.thinkup.core.common.o.nm o(String str) {
        Cursor cursorQuery;
        try {
            cursorQuery = n().query("video_res_cache_info", null, "video_url=?", new String[]{str}, null, null, null);
            try {
                if (cursorQuery.moveToNext()) {
                    com.thinkup.core.common.o.nm nmVar = new com.thinkup.core.common.o.nm();
                    nmVar.o(str);
                    nmVar.m(cursorQuery.getString(cursorQuery.getColumnIndex("file_path")));
                    nmVar.o(cursorQuery.getInt(cursorQuery.getColumnIndex("ready_rate")));
                    nmVar.m(cursorQuery.getLong(cursorQuery.getColumnIndex("download_size")));
                    nmVar.o(cursorQuery.getLong(cursorQuery.getColumnIndex("total_size")));
                    nmVar.n(cursorQuery.getLong(cursorQuery.getColumnIndex("update_time")));
                    cursorQuery.close();
                    cursorQuery.close();
                    return nmVar;
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

    public final long o() {
        Cursor cursorQuery = null;
        try {
            cursorQuery = n().query("video_res_cache_info", new String[]{"sum(download_size)"}, null, null, null, null, null);
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
}
