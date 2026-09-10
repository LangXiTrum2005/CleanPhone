package com.thinkup.core.common.oo;

import android.content.ContentValues;
import android.database.Cursor;
import com.thinkup.core.common.on.nom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class nm extends n<nm> {
    private static nm m = null;
    private static final String o = "com.thinkup.core.common.oo.nm";

    public static class m {
        public static final String m = "id";
        public static final String m0 = "retry_count";
        public static final String mo = "CREATE TABLE IF NOT EXISTS notice_url_fail_info(id TEXT, req_type INTEGER, req_url TEXT, req_head TEXT, first_fail_time INTEGER, offer_out_date_time INTEGER, retry_count INTEGER )";

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final String f42268n = "req_type";
        public static final String o = "notice_url_fail_info";
        public static final String o0 = "req_url";
        public static final String om = "first_fail_time";
        public static final String on = "offer_out_date_time";
        public static final String oo = "req_head";
    }

    public static class o {
        public Map<String, nom> m;
        public List<nom> o;
    }

    private nm(o0 o0Var) {
        super(o0Var);
    }

    private synchronized void m() {
        try {
            if (o0() == null) {
                return;
            }
            o0().delete("notice_url_fail_info", null, null);
        } catch (Exception unused) {
        }
    }

    public static nm o(o0 o0Var) {
        if (m == null) {
            synchronized (nm.class) {
                try {
                    if (m == null) {
                        m = new nm(o0Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return m;
    }

    public final synchronized int m(nom nomVar) {
        if (o0() == null || nomVar == null) {
            return -1;
        }
        try {
            return o0().delete("notice_url_fail_info", "id=?", new String[]{nomVar.o});
        } catch (Throwable unused) {
            return -1;
        }
    }

    public final synchronized long o(nom nomVar) {
        if (o0() == null || nomVar == null) {
            return -1L;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", nomVar.o);
            contentValues.put("req_type", Integer.valueOf(nomVar.m));
            contentValues.put("req_url", nomVar.o0);
            contentValues.put("req_head", nomVar.f42218n);
            contentValues.put("first_fail_time", Long.valueOf(nomVar.oo));
            contentValues.put("offer_out_date_time", Long.valueOf(nomVar.om));
            contentValues.put("retry_count", Integer.valueOf(nomVar.on));
            if (o(nomVar.o)) {
                return o0().update("notice_url_fail_info", contentValues, "id = ? ", new String[]{nomVar.o});
            }
            return o0().insert("notice_url_fail_info", null, contentValues);
        } catch (Exception unused) {
            return -1L;
        }
    }

    private boolean o(String str) {
        Cursor cursorQuery;
        try {
            cursorQuery = n().query("notice_url_fail_info", new String[]{"id"}, "id=?", new String[]{str}, "id", null, null);
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

    public final synchronized o o() {
        o oVar = new o();
        List<nom> listSynchronizedList = Collections.synchronizedList(new ArrayList(8));
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(8);
        oVar.o = listSynchronizedList;
        oVar.m = concurrentHashMap;
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = n().query("notice_url_fail_info", null, null, null, null, null, "first_fail_time");
                if (cursorQuery == null || cursorQuery.getCount() <= 0) {
                    if (cursorQuery != null) {
                    }
                    return oVar;
                }
                ArrayList<nom> arrayList = new ArrayList(4);
                while (cursorQuery.moveToNext()) {
                    nom nomVar = new nom();
                    nomVar.o = cursorQuery.getString(cursorQuery.getColumnIndex("id"));
                    nomVar.m = cursorQuery.getInt(cursorQuery.getColumnIndex("req_type"));
                    nomVar.o0 = cursorQuery.getString(cursorQuery.getColumnIndex("req_url"));
                    nomVar.f42218n = cursorQuery.getString(cursorQuery.getColumnIndex("req_head"));
                    nomVar.oo = cursorQuery.getLong(cursorQuery.getColumnIndex("first_fail_time"));
                    nomVar.om = cursorQuery.getLong(cursorQuery.getColumnIndex("offer_out_date_time"));
                    nomVar.on = cursorQuery.getInt(cursorQuery.getColumnIndex("retry_count"));
                    if (System.currentTimeMillis() < nomVar.om) {
                        listSynchronizedList.add(nomVar);
                        concurrentHashMap.put(nomVar.o, nomVar);
                    } else {
                        arrayList.add(nomVar);
                    }
                }
                cursorQuery.close();
                if (arrayList.size() > 0) {
                    for (nom nomVar2 : arrayList) {
                        nomVar2.o();
                        m(nomVar2);
                    }
                }
                cursorQuery.close();
                return oVar;
            } catch (Exception unused) {
                if (cursorQuery != null) {
                }
            } catch (OutOfMemoryError unused2) {
                System.gc();
                if (cursorQuery != null) {
                }
            } catch (Throwable unused3) {
                if (cursorQuery != null) {
                }
            }
            cursorQuery.close();
            return oVar;
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }
}
