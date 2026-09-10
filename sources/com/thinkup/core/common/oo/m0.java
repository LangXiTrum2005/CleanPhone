package com.thinkup.core.common.oo;

import android.content.ContentValues;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class m0 extends n<com.thinkup.core.common.o.mn> {
    private static volatile m0 m;
    private final String o;

    public static class o {
        public static final String m = "dsp_id";

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final String f42260n = "dsp_offer_id";
        public static final String o = "dsp_offer_install_record";
        public static final String o0 = "package_name";
        public static final String om = "CREATE TABLE IF NOT EXISTS dsp_offer_install_record(dsp_id TEXT ,dsp_offer_id TEXT ,package_name TEXT ,last_update_time INTEGER)";
        public static final String oo = "last_update_time";
    }

    private m0(o0 o0Var) {
        super(o0Var);
        this.o = m0.class.getName();
    }

    public static m0 o(o0 o0Var) {
        if (m == null) {
            synchronized (m0.class) {
                try {
                    if (m == null) {
                        m = new m0(o0Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return m;
    }

    public final synchronized long o(com.thinkup.core.common.o.mn mnVar) {
        if (o0() == null) {
            return -1L;
        }
        if (!o(mnVar.o(), mnVar.m())) {
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("dsp_id", mnVar.o());
                contentValues.put("dsp_offer_id", mnVar.m());
                contentValues.put("package_name", mnVar.n());
                contentValues.put("last_update_time", Long.valueOf(System.currentTimeMillis()));
                mnVar.o();
                mnVar.m();
                mnVar.n();
                return o0().insert("dsp_offer_install_record", null, contentValues);
            } catch (Exception unused) {
            }
        } else {
            mnVar.o();
            mnVar.m();
            mnVar.n();
        }
        return -1L;
    }

    private synchronized boolean o(String str, String str2) {
        Cursor cursorQuery = null;
        try {
            cursorQuery = n().query("dsp_offer_install_record", null, "dsp_id = ?  AND dsp_offer_id = ? ", new String[]{str, str2}, null, null, null);
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
            }
        } catch (OutOfMemoryError unused2) {
            Cursor cursor = cursorQuery;
            try {
                System.gc();
                if (cursor != null) {
                    cursor.close();
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
            }
        }
    }

    public final synchronized List<com.thinkup.core.common.o.mm> o(int i2) {
        ArrayList arrayList = new ArrayList();
        if (i2 <= 0) {
            return arrayList;
        }
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = n().query("dsp_offer_install_record", null, null, null, null, null, "last_update_time DESC", String.valueOf(i2));
                List<com.thinkup.core.common.o.mn> listO = o(cursorQuery);
                cursorQuery.close();
                listO.size();
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

    private synchronized List<com.thinkup.core.common.o.mn> o(Cursor cursor) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        if (cursor != null && cursor.getCount() > 0) {
            while (cursor.moveToNext()) {
                try {
                    com.thinkup.core.common.o.mn mnVar = new com.thinkup.core.common.o.mn();
                    mnVar.o(cursor.getString(cursor.getColumnIndex("dsp_id")));
                    mnVar.m(cursor.getString(cursor.getColumnIndex("dsp_offer_id")));
                    mnVar.n(cursor.getString(cursor.getColumnIndex("package_name")));
                    arrayList.add(mnVar);
                } catch (Throwable unused) {
                }
            }
        }
        return arrayList;
    }
}
