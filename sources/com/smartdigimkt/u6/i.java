package com.smartdigimkt.u6;

import android.content.ContentValues;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class i extends b<com.smartdigimkt.a7.d> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f38879c = "com.smartdigimkt.u6.i";
    private static i d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f38880b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f38881a = "request_info";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f38882b = "id";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f38883c = "req_type";
        public static final String d = "req_url";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f38884e = "req_head";
        public static final String f = "req_content";
        public static final String g = "time";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final String f38885h = "extra";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final String f38886i = "CREATE TABLE IF NOT EXISTS request_info(id TEXT, req_type INTEGER, req_url TEXT, req_head TEXT, req_content TEXT, time INTEGER, extra TEXT )";
    }

    public i(c cVar) {
        super(cVar);
        this.f38880b = 1000;
    }

    public static i a(c cVar) {
        if (d == null) {
            synchronized (i.class) {
                try {
                    if (d == null) {
                        d = new i(cVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return d;
    }

    public synchronized long b(com.smartdigimkt.a7.d dVar) {
        Throwable th;
        Cursor cursorQuery;
        if (b() == null) {
            return -1L;
        }
        Cursor cursor = null;
        try {
            cursorQuery = a().query("request_info", null, null, null, null, null, null);
            try {
                if (cursorQuery.getCount() >= this.f38880b) {
                    c();
                }
            } catch (Exception unused) {
                if (cursorQuery != null) {
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("id", dVar.f33779a);
                contentValues.put("req_type", Integer.valueOf(dVar.f33780b));
                contentValues.put("req_url", dVar.d);
                contentValues.put("req_head", dVar.f33781c);
                contentValues.put("req_content", dVar.f33782e);
                contentValues.put("time", Long.valueOf(dVar.f));
                contentValues.put("extra", dVar.g);
                return b().insert("request_info", null, contentValues);
            } catch (Throwable th2) {
                th = th2;
                cursor = cursorQuery;
                if (cursor == null) {
                    throw th;
                }
                try {
                    cursor.close();
                    throw th;
                } catch (Exception unused2) {
                    throw th;
                }
            }
        } catch (Exception unused3) {
            cursorQuery = null;
        } catch (Throwable th3) {
            th = th3;
        }
        try {
            cursorQuery.close();
        } catch (Exception unused4) {
        }
        try {
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("id", dVar.f33779a);
            contentValues2.put("req_type", Integer.valueOf(dVar.f33780b));
            contentValues2.put("req_url", dVar.d);
            contentValues2.put("req_head", dVar.f33781c);
            contentValues2.put("req_content", dVar.f33782e);
            contentValues2.put("time", Long.valueOf(dVar.f));
            contentValues2.put("extra", dVar.g);
            return b().insert("request_info", null, contentValues2);
        } catch (Exception unused5) {
            return -1L;
        }
    }

    public synchronized void c() {
        try {
            if (b() == null) {
            } else {
                b().delete("request_info", null, null);
            }
        } catch (Exception unused) {
        }
    }

    public synchronized int a(com.smartdigimkt.a7.d dVar) {
        if (b() == null || dVar == null) {
            return -1;
        }
        try {
            return b().delete("request_info", "id=?", new String[]{dVar.f33779a});
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00ae A[Catch: all -> 0x008f, PHI: r11
  0x00ae: PHI (r11v7 android.database.Cursor) = (r11v5 android.database.Cursor), (r11v6 android.database.Cursor), (r11v8 android.database.Cursor) binds: [B:23:0x009a, B:27:0x00a1, B:34:0x00ac] A[DONT_GENERATE, DONT_INLINE], TryCatch #7 {, blocks: (B:13:0x008a, B:19:0x0094, B:35:0x00ae, B:31:0x00a7, B:32:0x00aa, B:26:0x009e), top: B:45:0x0002, inners: #0 }] */
    public synchronized List<com.smartdigimkt.a7.d> a(int i2) {
        Cursor cursorQuery;
        try {
            cursorQuery = a().query("request_info", null, null, null, null, null, "time", String.valueOf(i2));
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.getCount() > 0) {
                        ArrayList arrayList = new ArrayList();
                        while (cursorQuery.moveToNext()) {
                            com.smartdigimkt.a7.d dVar = new com.smartdigimkt.a7.d();
                            dVar.f33779a = cursorQuery.getString(cursorQuery.getColumnIndex("id"));
                            dVar.f33780b = cursorQuery.getInt(cursorQuery.getColumnIndex("req_type"));
                            dVar.d = cursorQuery.getString(cursorQuery.getColumnIndex("req_url"));
                            dVar.f33781c = cursorQuery.getString(cursorQuery.getColumnIndex("req_head"));
                            dVar.f33782e = cursorQuery.getString(cursorQuery.getColumnIndex("req_content"));
                            dVar.f = cursorQuery.getLong(cursorQuery.getColumnIndex("time"));
                            dVar.g = cursorQuery.getString(cursorQuery.getColumnIndex("extra"));
                            arrayList.add(dVar);
                        }
                        cursorQuery.close();
                        cursorQuery.close();
                        return arrayList;
                    }
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
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return null;
        } catch (Exception unused4) {
            cursorQuery = null;
        } catch (OutOfMemoryError unused5) {
            cursorQuery = null;
        } catch (Throwable unused6) {
            cursorQuery = null;
        }
    }
}
