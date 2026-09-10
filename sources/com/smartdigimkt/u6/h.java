package com.smartdigimkt.u6;

import android.content.ContentValues;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class h extends b<com.smartdigimkt.p6.l> {
    private static volatile h d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f38872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f38873c;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f38874a = "dsp_offer_show_record";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f38875b = "dsp_id";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f38876c = "dsp_offer_id";
        public static final String d = "show_limit";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f38877e = "show_count";
        public static final String f = "create_time";
        public static final String g = "last_update_time";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final String f38878h = "CREATE TABLE IF NOT EXISTS dsp_offer_show_record(dsp_id TEXT ,dsp_offer_id TEXT ,show_limit INTEGER ,show_count INTEGER ,create_time INTEGER ,last_update_time INTEGER)";
    }

    private h(c cVar) {
        super(cVar);
        this.f38872b = h.class.getName();
        this.f38873c = 86400000L;
    }

    public static h a(c cVar) {
        if (d == null) {
            synchronized (h.class) {
                try {
                    if (d == null) {
                        d = new h(cVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return d;
    }

    public synchronized long b(com.smartdigimkt.p6.l lVar) {
        if (b() != null && lVar != null) {
            if (lVar.d() <= 0) {
                return -1L;
            }
            com.smartdigimkt.p6.l lVarA = a(lVar.a(), lVar.b());
            if (lVarA != null) {
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("dsp_id", lVar.a());
                    contentValues.put("dsp_offer_id", lVar.b());
                    contentValues.put("show_limit", Integer.valueOf(lVar.d()));
                    contentValues.put("show_count", Integer.valueOf(lVarA.c() + 1));
                    contentValues.put("last_update_time", Long.valueOf(System.currentTimeMillis()));
                    lVar.a();
                    lVar.b();
                    lVarA.c();
                    lVar.d();
                    return b().update("dsp_offer_show_record", contentValues, "dsp_id = ? and dsp_offer_id = ? ", new String[]{lVar.a(), lVar.b()});
                } catch (Exception unused) {
                }
            }
            return -1L;
        }
        return -1L;
    }

    public void c() {
        try {
            String str = "create_time < " + (System.currentTimeMillis() - 86400000);
            if (b() == null) {
                return;
            }
            b().delete("dsp_offer_show_record", str, null);
        } catch (Exception unused) {
        }
    }

    public synchronized long a(com.smartdigimkt.p6.l lVar) {
        if (b() != null && lVar != null) {
            if (lVar.d() <= 0) {
                return -1L;
            }
            try {
                if (a(lVar.a(), lVar.b()) == null) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("dsp_id", lVar.a());
                    contentValues.put("dsp_offer_id", lVar.b());
                    contentValues.put("show_limit", Integer.valueOf(lVar.d()));
                    contentValues.put("show_count", (Integer) 0);
                    contentValues.put("create_time", Long.valueOf(System.currentTimeMillis()));
                    contentValues.put("last_update_time", Long.valueOf(System.currentTimeMillis()));
                    lVar.a();
                    lVar.b();
                    return b().insert("dsp_offer_show_record", null, contentValues);
                }
                lVar.a();
                lVar.b();
                return -1L;
            } catch (Exception unused) {
            }
        }
        return -1L;
    }

    private synchronized com.smartdigimkt.p6.l a(String str, String str2) {
        Cursor cursorQuery;
        try {
            cursorQuery = a().query("dsp_offer_show_record", null, "dsp_id = ?  AND dsp_offer_id = ? ", new String[]{str, str2}, null, null, null);
            try {
                List<com.smartdigimkt.p6.l> listA = a(cursorQuery);
                cursorQuery.close();
                if (listA.size() > 0) {
                    com.smartdigimkt.p6.l lVar = listA.get(0);
                    cursorQuery.close();
                    return lVar;
                }
            } catch (Exception unused) {
                if (cursorQuery != null) {
                }
                return null;
            } catch (OutOfMemoryError unused2) {
                try {
                    System.gc();
                    if (cursorQuery != null) {
                    }
                    return null;
                } catch (Throwable th) {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                        throw th;
                    }
                    throw th;
                }
            } catch (Throwable unused3) {
                if (cursorQuery != null) {
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
        cursorQuery.close();
        return null;
    }

    private synchronized List<com.smartdigimkt.p6.l> a(Cursor cursor) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        if (cursor != null && cursor.getCount() > 0) {
            while (cursor.moveToNext()) {
                try {
                    com.smartdigimkt.p6.l lVar = new com.smartdigimkt.p6.l();
                    lVar.a(cursor.getString(cursor.getColumnIndex("dsp_id")));
                    lVar.b(cursor.getString(cursor.getColumnIndex("dsp_offer_id")));
                    lVar.b(cursor.getInt(cursor.getColumnIndex("show_limit")));
                    lVar.a(cursor.getInt(cursor.getColumnIndex("show_count")));
                    arrayList.add(lVar);
                } catch (Throwable unused) {
                }
            }
        }
        return arrayList;
    }

    public synchronized List<com.smartdigimkt.p6.j> a(int i2) {
        ArrayList arrayList = new ArrayList();
        if (i2 <= 0) {
            return arrayList;
        }
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = a().query("dsp_offer_show_record", null, "show_count > show_limit", null, null, null, "last_update_time DESC", i2 + "");
                List<com.smartdigimkt.p6.l> listA = a(cursorQuery);
                listA.size();
                cursorQuery.close();
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
}
