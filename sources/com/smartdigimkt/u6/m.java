package com.smartdigimkt.u6;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes6.dex */
public class m extends b<com.smartdigimkt.p6.n> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile m f38913c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f38914b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f38915a = "offer_data_cache";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f38916b = "placement_id";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f38917c = "bid_id";
        public static final String d = "adsource_id";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f38918e = "network_firm_id";
        public static final String f = "bid_result";
        public static final String g = "offer_data";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final String f38919h = "out_date_timestamp";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final String f38920i = "vast_parse_result";
        public static final String j = "CREATE TABLE IF NOT EXISTS offer_data_cache(placement_id TEXT ,bid_id TEXT ,adsource_id TEXT ,network_firm_id INTEGER ,bid_result TEXT ,offer_data TEXT ,out_date_timestamp INTEGER ,vast_parse_result TEXT)";
    }

    private m(c cVar) {
        super(cVar);
        this.f38914b = m.class.getName();
    }

    public static m a(c cVar) {
        if (f38913c == null) {
            synchronized (m.class) {
                try {
                    if (f38913c == null) {
                        f38913c = new m(cVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f38913c;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003f A[Catch: all -> 0x0036, PHI: r10
  0x003f: PHI (r10v4 android.database.Cursor) = (r10v3 android.database.Cursor), (r10v5 android.database.Cursor) binds: [B:17:0x003d, B:14:0x0039] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #0 {all -> 0x0036, blocks: (B:9:0x0031, B:18:0x003f), top: B:24:0x0002 }] */
    public synchronized String b(String str) {
        Cursor cursorQuery;
        try {
            try {
                cursorQuery = a().query("offer_data_cache", new String[]{"vast_parse_result"}, "bid_id=?", new String[]{str}, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.getCount() > 0) {
                            cursorQuery.moveToNext();
                            String string = cursorQuery.getString(0);
                            cursorQuery.close();
                            string.length();
                            cursorQuery.close();
                            return string;
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
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void c() {
        try {
            b().delete("offer_data_cache", "out_date_timestamp < ? ", new String[]{String.valueOf(System.currentTimeMillis())});
        } catch (Throwable th) {
            com.smartdigimkt.i7.d.a("Error_SQL_DELETE", th.getMessage(), com.smartdigimkt.m6.b.p().q());
        }
    }

    public synchronized com.smartdigimkt.y6.d d(String str) {
        com.smartdigimkt.y6.d dVar;
        Cursor cursorQuery;
        dVar = new com.smartdigimkt.y6.d();
        try {
            cursorQuery = a().query("offer_data_cache", new String[]{"placement_id", "adsource_id", "bid_result"}, "out_date_timestamp>? AND placement_id=?", new String[]{String.valueOf(System.currentTimeMillis()), str}, null, null, null);
            while (cursorQuery.moveToNext()) {
                try {
                    String string = cursorQuery.getString(cursorQuery.getColumnIndex("adsource_id"));
                    com.smartdigimkt.y6.b bVarB = com.smartdigimkt.y6.b.b(cursorQuery.getString(cursorQuery.getColumnIndex("bid_result")));
                    if (bVarB != null) {
                        dVar.a(string, bVarB);
                    }
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
            cursorQuery = null;
        }
        if (cursorQuery != null) {
            try {
                cursorQuery.close();
            } catch (Throwable unused3) {
            }
        }
        return dVar;
    }

    public synchronized void e(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                b().delete("offer_data_cache", "bid_id = ? ", new String[]{str});
            }
        } catch (Throwable th) {
            com.smartdigimkt.i7.d.a("Error_SQL_DELETE", th.getMessage(), com.smartdigimkt.m6.b.p().q());
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0034 A[Catch: all -> 0x002b, PHI: r9
  0x0034: PHI (r9v4 android.database.Cursor) = (r9v3 android.database.Cursor), (r9v6 android.database.Cursor) binds: [B:17:0x0032, B:14:0x002e] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #2 {all -> 0x002b, blocks: (B:8:0x0025, B:18:0x0034), top: B:29:0x0001 }] */
    private synchronized boolean c(String str) {
        Cursor cursorQuery;
        try {
            try {
                cursorQuery = a().query("offer_data_cache", new String[]{"placement_id"}, "bid_id=?", new String[]{str}, null, null, null);
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
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized long a(String str, com.smartdigimkt.y6.b bVar) {
        try {
            if (b() == null || bVar == null) {
                return -1L;
            }
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("placement_id", str);
                contentValues.put("adsource_id", bVar.D);
                contentValues.put("network_firm_id", Integer.valueOf(bVar.s));
                contentValues.put("bid_id", bVar.f40233e);
                contentValues.put("bid_result", bVar.y());
                contentValues.put("out_date_timestamp", Long.valueOf(bVar.f40251u));
                if (!TextUtils.isEmpty(bVar.f40239B)) {
                    contentValues.put("offer_data", bVar.f40239B);
                }
                if (c(bVar.f40233e)) {
                    return b().update("offer_data_cache", contentValues, "bid_id = ? ", new String[]{bVar.f40233e});
                }
                return b().insert("offer_data_cache", null, contentValues);
            } catch (Exception unused) {
                return -1L;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized int a(com.smartdigimkt.y6.b bVar) {
        if (c(bVar.f40233e)) {
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("bid_result", bVar.y());
                return b().update("offer_data_cache", contentValues, "bid_id = ? ", new String[]{bVar.f40233e});
            } catch (Throwable unused) {
            }
        }
        return -1;
    }

    public synchronized long a(String str, String str2, String str3, String str4) {
        if (b() == null) {
            return -1L;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("offer_data", str4);
            if (!c(str3)) {
                return -1L;
            }
            return b().update("offer_data_cache", contentValues, "bid_id = ? ", new String[]{str3});
        } catch (Exception unused) {
            return -1L;
        }
    }

    public synchronized long a(String str, String str2) {
        if (b() == null) {
            return -1L;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("vast_parse_result", str2);
            if (c(str)) {
                str2.length();
                return b().update("offer_data_cache", contentValues, "bid_id = ? ", new String[]{str});
            }
            str2.length();
            return -1L;
        } catch (Exception unused) {
            return -1L;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0048 A[Catch: all -> 0x003f, PHI: r10
  0x0048: PHI (r10v4 android.database.Cursor) = (r10v3 android.database.Cursor), (r10v5 android.database.Cursor) binds: [B:17:0x0046, B:14:0x0042] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #2 {all -> 0x003f, blocks: (B:9:0x003a, B:18:0x0048), top: B:28:0x0002 }] */
    public synchronized com.smartdigimkt.p6.m a(String str) {
        Cursor cursorQuery;
        try {
            try {
                cursorQuery = a().query("offer_data_cache", new String[]{"offer_data", "out_date_timestamp"}, "bid_id=?", new String[]{str}, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.getCount() > 0) {
                            cursorQuery.moveToNext();
                            com.smartdigimkt.p6.m mVar = new com.smartdigimkt.p6.m(cursorQuery.getString(0), cursorQuery.getLong(1));
                            cursorQuery.close();
                            cursorQuery.close();
                            return mVar;
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
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }
}
