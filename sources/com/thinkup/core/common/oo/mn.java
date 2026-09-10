package com.thinkup.core.common.oo;

import android.content.ContentValues;
import android.database.Cursor;
import com.thinkup.core.common.on.mmo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class mn extends n<mmo> {
    private static mn m = null;
    private static final String o = "com.thinkup.core.common.oo.mn";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f42262n;

    public static class o {
        public static final String m = "id";
        public static final String m0 = "extra";
        public static final String mo = "CREATE TABLE IF NOT EXISTS request_info(id TEXT, req_type INTEGER, req_url TEXT, req_head TEXT, req_content TEXT, time INTEGER, extra TEXT )";

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final String f42263n = "req_type";
        public static final String o = "request_info";
        public static final String o0 = "req_url";
        public static final String om = "req_content";
        public static final String on = "time";
        public static final String oo = "req_head";
    }

    private mn(o0 o0Var) {
        super(o0Var);
        this.f42262n = 1000;
    }

    private synchronized void m() {
        try {
            if (o0() == null) {
                return;
            }
            o0().delete("request_info", null, null);
        } catch (Exception unused) {
        }
    }

    public static mn o(o0 o0Var) {
        if (m == null) {
            synchronized (mn.class) {
                try {
                    if (m == null) {
                        m = new mn(o0Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return m;
    }

    public final synchronized int m(mmo mmoVar) {
        if (o0() == null || mmoVar == null) {
            return -1;
        }
        try {
            return o0().delete("request_info", "id=?", new String[]{mmoVar.o});
        } catch (Throwable unused) {
            return -1;
        }
    }

    public final synchronized long o(mmo mmoVar) {
        Throwable th;
        Cursor cursorQuery;
        if (o0() == null) {
            return -1L;
        }
        Cursor cursor = null;
        try {
            cursorQuery = n().query("request_info", null, null, null, null, null, null);
            try {
                if (cursorQuery.getCount() >= this.f42262n) {
                    m();
                }
            } catch (Exception unused) {
                if (cursorQuery != null) {
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("id", mmoVar.o);
                contentValues.put("req_type", Integer.valueOf(mmoVar.m));
                contentValues.put("req_url", mmoVar.o0);
                contentValues.put("req_head", mmoVar.f42200n);
                contentValues.put("req_content", mmoVar.oo);
                contentValues.put("time", Long.valueOf(mmoVar.om));
                contentValues.put("extra", mmoVar.on);
                return o0().insert("request_info", null, contentValues);
            } catch (Throwable th2) {
                th = th2;
                cursor = cursorQuery;
                if (cursor != null) {
                    try {
                        cursor.close();
                        throw th;
                    } catch (Exception unused2) {
                        throw th;
                    }
                }
                throw th;
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
            contentValues2.put("id", mmoVar.o);
            contentValues2.put("req_type", Integer.valueOf(mmoVar.m));
            contentValues2.put("req_url", mmoVar.o0);
            contentValues2.put("req_head", mmoVar.f42200n);
            contentValues2.put("req_content", mmoVar.oo);
            contentValues2.put("time", Long.valueOf(mmoVar.om));
            contentValues2.put("extra", mmoVar.on);
            return o0().insert("request_info", null, contentValues2);
        } catch (Exception unused5) {
            return -1L;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0099 A[Catch: all -> 0x008d, PHI: r1
  0x0099: PHI (r1v5 android.database.Cursor) = (r1v3 android.database.Cursor), (r1v4 android.database.Cursor), (r1v6 android.database.Cursor) binds: [B:23:0x0097, B:28:0x00a1, B:36:0x00ae] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #7 {, blocks: (B:13:0x0088, B:19:0x0091, B:24:0x0099, B:32:0x00a7, B:33:0x00aa, B:27:0x009e), top: B:46:0x0002, inners: #0 }] */
    public final synchronized List<mmo> o() {
        Cursor cursorQuery;
        try {
            cursorQuery = n().query("request_info", null, null, null, null, null, "time", "10");
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.getCount() > 0) {
                        ArrayList arrayList = new ArrayList();
                        while (cursorQuery.moveToNext()) {
                            mmo mmoVar = new mmo();
                            mmoVar.o = cursorQuery.getString(cursorQuery.getColumnIndex("id"));
                            mmoVar.m = cursorQuery.getInt(cursorQuery.getColumnIndex("req_type"));
                            mmoVar.o0 = cursorQuery.getString(cursorQuery.getColumnIndex("req_url"));
                            mmoVar.f42200n = cursorQuery.getString(cursorQuery.getColumnIndex("req_head"));
                            mmoVar.oo = cursorQuery.getString(cursorQuery.getColumnIndex("req_content"));
                            mmoVar.om = cursorQuery.getLong(cursorQuery.getColumnIndex("time"));
                            mmoVar.on = cursorQuery.getString(cursorQuery.getColumnIndex("extra"));
                            arrayList.add(mmoVar);
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
