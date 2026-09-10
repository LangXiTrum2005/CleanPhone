package com.thinkup.core.common.oo;

import android.content.ContentValues;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class m extends n<com.thinkup.core.common.o.n0> {
    private static volatile m m;
    private final String o;

    public static class o {
        public static final String m = "placement_id";
        public static final String m0 = "CREATE TABLE IF NOT EXISTS adx_offer_tracking(placement_id TEXT ,dsp_id TEXT ,offer_id TEXT ,tk_type INTEGER ,extra_info TEXT ,create_time INTEGER)";

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final String f42259n = "dsp_id";
        public static final String o = "adx_offer_tracking";
        public static final String o0 = "offer_id";
        public static final String om = "extra_info";
        public static final String on = "create_time";
        public static final String oo = "tk_type";
    }

    private m(o0 o0Var) {
        super(o0Var);
        this.o = m.class.getName();
    }

    public static m o(o0 o0Var) {
        if (m == null) {
            synchronized (m.class) {
                try {
                    if (m == null) {
                        m = new m(o0Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return m;
    }

    private static long oo() {
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

    public final void m() {
        try {
            String str = "create_time < " + oo();
            if (o0() == null) {
                return;
            }
            o0().delete("adx_offer_tracking", str, null);
        } catch (Exception unused) {
        }
    }

    public final synchronized long o(com.thinkup.core.common.o.on onVar) {
        if (o0() == null) {
            return -1L;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("placement_id", onVar.o());
            contentValues.put("dsp_id", onVar.m());
            contentValues.put("offer_id", onVar.n());
            contentValues.put("tk_type", Integer.valueOf(onVar.o0()));
            contentValues.put("extra_info", onVar.oo());
            contentValues.put("create_time", Long.valueOf(System.currentTimeMillis()));
            onVar.m();
            onVar.n();
            return o0().insert("adx_offer_tracking", null, contentValues);
        } catch (Exception unused) {
            return -1L;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0032 A[Catch: all -> 0x002d, PHI: r1
  0x0032: PHI (r1v5 android.database.Cursor) = (r1v3 android.database.Cursor), (r1v4 android.database.Cursor), (r1v6 android.database.Cursor) binds: [B:12:0x0030, B:17:0x003a, B:25:0x0047] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #6 {, blocks: (B:6:0x0028, B:13:0x0032, B:21:0x0040, B:22:0x0043, B:16:0x0037), top: B:35:0x0002, inners: #5 }] */
    public final synchronized List<com.thinkup.core.common.o.on> o() {
        Cursor cursorQuery;
        try {
            cursorQuery = n().query("adx_offer_tracking", null, "create_time >= ? ", new String[]{String.valueOf(oo())}, null, null, null);
            try {
                List<com.thinkup.core.common.o.on> listO = o(cursorQuery);
                cursorQuery.close();
                listO.size();
                cursorQuery.close();
                return listO;
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

    private synchronized List<com.thinkup.core.common.o.on> o(Cursor cursor) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        if (cursor != null && cursor.getCount() > 0) {
            while (cursor.moveToNext()) {
                try {
                    com.thinkup.core.common.o.on onVar = new com.thinkup.core.common.o.on();
                    int columnIndex = cursor.getColumnIndex("placement_id");
                    if (columnIndex >= 0) {
                        onVar.o(cursor.getString(columnIndex));
                    }
                    int columnIndex2 = cursor.getColumnIndex("dsp_id");
                    if (columnIndex2 >= 0) {
                        onVar.m(cursor.getString(columnIndex2));
                    }
                    int columnIndex3 = cursor.getColumnIndex("offer_id");
                    if (columnIndex3 >= 0) {
                        onVar.n(cursor.getString(columnIndex3));
                    }
                    int columnIndex4 = cursor.getColumnIndex("tk_type");
                    if (columnIndex4 >= 0) {
                        onVar.o(cursor.getInt(columnIndex4));
                    }
                    int columnIndex5 = cursor.getColumnIndex("extra_info");
                    if (columnIndex5 >= 0) {
                        onVar.o0(cursor.getString(columnIndex5));
                    }
                    arrayList.add(onVar);
                } catch (Throwable unused) {
                }
            }
        }
        return arrayList;
    }
}
