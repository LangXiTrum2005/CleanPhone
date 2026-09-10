package com.smartdigimkt.u6;

import android.content.ContentValues;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class k extends com.smartdigimkt.u6.b<k> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f38894b = "com.smartdigimkt.u6.k";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static k f38895c;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List<com.smartdigimkt.v3.e> f38896a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Map<String, com.smartdigimkt.v3.e> f38897b;
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f38898a = "notice_url_fail_info";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f38899b = "id";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f38900c = "req_type";
        public static final String d = "req_url";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f38901e = "req_head";
        public static final String f = "first_fail_time";
        public static final String g = "offer_out_date_time";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final String f38902h = "retry_count";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final String f38903i = "CREATE TABLE IF NOT EXISTS notice_url_fail_info(id TEXT, req_type INTEGER, req_url TEXT, req_head TEXT, first_fail_time INTEGER, offer_out_date_time INTEGER, retry_count INTEGER )";
    }

    public k(c cVar) {
        super(cVar);
    }

    public static k a(c cVar) {
        if (f38895c == null) {
            synchronized (k.class) {
                try {
                    if (f38895c == null) {
                        f38895c = new k(cVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f38895c;
    }

    public synchronized long b(com.smartdigimkt.v3.e eVar) {
        if (b() == null || eVar == null) {
            return -1L;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", eVar.f39086a);
            contentValues.put("req_type", Integer.valueOf(eVar.f39087b));
            contentValues.put("req_url", eVar.d);
            contentValues.put("req_head", eVar.f39088c);
            contentValues.put("first_fail_time", Long.valueOf(eVar.f39089e));
            contentValues.put("offer_out_date_time", Long.valueOf(eVar.f));
            contentValues.put("retry_count", Integer.valueOf(eVar.g));
            if (a(eVar.f39086a)) {
                return b().update("notice_url_fail_info", contentValues, "id = ? ", new String[]{eVar.f39086a});
            }
            return b().insert("notice_url_fail_info", null, contentValues);
        } catch (Exception unused) {
            return -1L;
        }
    }

    public synchronized void c() {
        try {
            if (b() == null) {
            } else {
                b().delete("notice_url_fail_info", null, null);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00ec A[Catch: all -> 0x00d5, PHI: r2
  0x00ec: PHI (r2v6 android.database.Cursor) = 
  (r2v3 android.database.Cursor)
  (r2v4 android.database.Cursor)
  (r2v5 android.database.Cursor)
  (r2v7 android.database.Cursor)
 binds: [B:30:0x00da, B:33:0x00e0, B:39:0x00ea, B:28:0x00d7] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #1 {, blocks: (B:3:0x0001, B:23:0x00d0, B:40:0x00ec, B:37:0x00e6, B:38:0x00e9, B:32:0x00dd), top: B:45:0x0001, inners: #0 }] */
    public synchronized a d() {
        a aVar = new a();
        List<com.smartdigimkt.v3.e> listSynchronizedList = Collections.synchronizedList(new ArrayList(8));
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(8);
        aVar.f38896a = listSynchronizedList;
        aVar.f38897b = concurrentHashMap;
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = a().query("notice_url_fail_info", null, null, null, null, null, "first_fail_time");
                if (cursorQuery != null && cursorQuery.getCount() > 0) {
                    ArrayList<com.smartdigimkt.v3.e> arrayList = new ArrayList(4);
                    while (cursorQuery.moveToNext()) {
                        com.smartdigimkt.v3.e eVar = new com.smartdigimkt.v3.e();
                        eVar.f39086a = cursorQuery.getString(cursorQuery.getColumnIndex("id"));
                        eVar.f39087b = cursorQuery.getInt(cursorQuery.getColumnIndex("req_type"));
                        eVar.d = cursorQuery.getString(cursorQuery.getColumnIndex("req_url"));
                        eVar.f39088c = cursorQuery.getString(cursorQuery.getColumnIndex("req_head"));
                        eVar.f39089e = cursorQuery.getLong(cursorQuery.getColumnIndex("first_fail_time"));
                        eVar.f = cursorQuery.getLong(cursorQuery.getColumnIndex("offer_out_date_time"));
                        eVar.g = cursorQuery.getInt(cursorQuery.getColumnIndex("retry_count"));
                        if (System.currentTimeMillis() < eVar.f) {
                            listSynchronizedList.add(eVar);
                            concurrentHashMap.put(eVar.f39086a, eVar);
                        } else {
                            arrayList.add(eVar);
                        }
                    }
                    cursorQuery.close();
                    if (arrayList.size() > 0) {
                        for (com.smartdigimkt.v3.e eVar2 : arrayList) {
                            eVar2.a();
                            a(eVar2);
                        }
                    }
                    cursorQuery.close();
                    return aVar;
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            } catch (Exception unused) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            } catch (OutOfMemoryError unused2) {
                System.gc();
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            } catch (Throwable unused3) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            }
            return aVar;
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    private boolean a(String str) {
        Cursor cursorQuery;
        try {
            cursorQuery = a().query("notice_url_fail_info", new String[]{"id"}, "id=?", new String[]{str}, "id", null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.getCount() > 0) {
                        cursorQuery.close();
                        cursorQuery.close();
                        return true;
                    }
                } catch (Throwable unused) {
                    if (cursorQuery == null) {
                        return false;
                    }
                }
            }
            if (cursorQuery == null) {
                return false;
            }
        } catch (Throwable unused2) {
            cursorQuery = null;
        }
        cursorQuery.close();
        return false;
    }

    public synchronized int a(com.smartdigimkt.v3.e eVar) {
        if (b() == null || eVar == null) {
            return -1;
        }
        try {
            return b().delete("notice_url_fail_info", "id=?", new String[]{eVar.f39086a});
        } catch (Throwable unused) {
            return -1;
        }
    }
}
