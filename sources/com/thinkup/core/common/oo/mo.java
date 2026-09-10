package com.thinkup.core.common.oo;

import android.content.ContentValues;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class mo extends n<com.thinkup.core.common.o.n0> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static volatile mo f42264n;
    private final long m;
    private final String o;

    public static class o {
        public static final String m = "dsp_id";
        public static final String m0 = "CREATE TABLE IF NOT EXISTS dsp_offer_show_record(dsp_id TEXT ,dsp_offer_id TEXT ,show_limit INTEGER ,show_count INTEGER ,create_time INTEGER ,last_update_time INTEGER)";

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final String f42265n = "dsp_offer_id";
        public static final String o = "dsp_offer_show_record";
        public static final String o0 = "show_limit";
        public static final String om = "create_time";
        public static final String on = "last_update_time";
        public static final String oo = "show_count";
    }

    private mo(o0 o0Var) {
        super(o0Var);
        this.o = mo.class.getName();
        this.m = 86400000L;
    }

    public static mo o(o0 o0Var) {
        if (f42264n == null) {
            synchronized (mo.class) {
                try {
                    if (f42264n == null) {
                        f42264n = new mo(o0Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f42264n;
    }

    public final synchronized long m(com.thinkup.core.common.o.n0 n0Var) {
        if (o0() == null) {
            return -1L;
        }
        if (n0Var.n() <= 0) {
            return -1L;
        }
        com.thinkup.core.common.o.n0 n0VarO = o(n0Var.o(), n0Var.m());
        if (n0VarO != null) {
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("dsp_id", n0Var.o());
                contentValues.put("dsp_offer_id", n0Var.m());
                contentValues.put("show_limit", Integer.valueOf(n0Var.n()));
                contentValues.put("show_count", Integer.valueOf(n0VarO.o0() + 1));
                contentValues.put("last_update_time", Long.valueOf(System.currentTimeMillis()));
                n0Var.o();
                n0Var.m();
                n0VarO.o0();
                n0Var.n();
                return o0().update("dsp_offer_show_record", contentValues, "dsp_id = ? and dsp_offer_id = ? ", new String[]{n0Var.o(), n0Var.m()});
            } catch (Exception unused) {
            }
        }
        return -1L;
    }

    public final synchronized long o(com.thinkup.core.common.o.n0 n0Var) {
        if (o0() == null) {
            return -1L;
        }
        if (n0Var.n() <= 0) {
            return -1L;
        }
        try {
            if (o(n0Var.o(), n0Var.m()) == null) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("dsp_id", n0Var.o());
                contentValues.put("dsp_offer_id", n0Var.m());
                contentValues.put("show_limit", Integer.valueOf(n0Var.n()));
                contentValues.put("show_count", (Integer) 0);
                contentValues.put("create_time", Long.valueOf(System.currentTimeMillis()));
                contentValues.put("last_update_time", Long.valueOf(System.currentTimeMillis()));
                n0Var.o();
                n0Var.m();
                return o0().insert("dsp_offer_show_record", null, contentValues);
            }
            n0Var.o();
            n0Var.m();
            return -1L;
        } catch (Exception unused) {
        }
    }

    private synchronized com.thinkup.core.common.o.n0 o(String str, String str2) {
        Cursor cursorQuery;
        try {
            cursorQuery = n().query("dsp_offer_show_record", null, "dsp_id = ?  AND dsp_offer_id = ? ", new String[]{str, str2}, null, null, null);
            try {
                List<com.thinkup.core.common.o.n0> listO = o(cursorQuery);
                cursorQuery.close();
                if (listO.size() > 0) {
                    com.thinkup.core.common.o.n0 n0Var = listO.get(0);
                    cursorQuery.close();
                    return n0Var;
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

    private synchronized List<com.thinkup.core.common.o.n0> o(Cursor cursor) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        if (cursor != null && cursor.getCount() > 0) {
            while (cursor.moveToNext()) {
                try {
                    com.thinkup.core.common.o.n0 n0Var = new com.thinkup.core.common.o.n0();
                    n0Var.o(cursor.getString(cursor.getColumnIndex("dsp_id")));
                    n0Var.m(cursor.getString(cursor.getColumnIndex("dsp_offer_id")));
                    n0Var.o(cursor.getInt(cursor.getColumnIndex("show_limit")));
                    n0Var.m(cursor.getInt(cursor.getColumnIndex("show_count")));
                    arrayList.add(n0Var);
                } catch (Throwable unused) {
                }
            }
        }
        return arrayList;
    }

    public final synchronized List<com.thinkup.core.common.o.mm> o(int i2) {
        ArrayList arrayList = new ArrayList();
        if (i2 <= 0) {
            return arrayList;
        }
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = n().query("dsp_offer_show_record", null, "show_count > show_limit", null, null, null, "last_update_time DESC", String.valueOf(i2));
                List<com.thinkup.core.common.o.n0> listO = o(cursorQuery);
                listO.size();
                cursorQuery.close();
                arrayList.addAll(listO);
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

    public final void o() {
        try {
            String str = "create_time < " + (System.currentTimeMillis() - 86400000);
            if (o0() == null) {
                return;
            }
            o0().delete("dsp_offer_show_record", str, null);
        } catch (Exception unused) {
        }
    }
}
