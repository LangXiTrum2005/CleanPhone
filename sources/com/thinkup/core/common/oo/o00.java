package com.thinkup.core.common.oo;

import android.content.ContentValues;
import android.database.Cursor;
import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.on.nmo;
import com.thinkup.core.common.on.on0;
import com.thinkup.core.common.on.onm;

/* JADX INFO: loaded from: classes6.dex */
public class o00 extends n<com.thinkup.core.common.o.no> {
    private static volatile o00 m;
    private final String o;

    public static class o {
        public static final String m = "placement_id";
        public static final String m0 = "out_date_timestamp";
        public static final String mm = "CREATE TABLE IF NOT EXISTS offer_data_cache(placement_id TEXT ,bid_id TEXT ,adsource_id TEXT ,network_firm_id INTEGER ,bid_result TEXT ,offer_data TEXT ,out_date_timestamp INTEGER ,vast_parse_result TEXT)";
        public static final String mo = "vast_parse_result";

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final String f42274n = "bid_id";
        public static final String o = "offer_data_cache";
        public static final String o0 = "adsource_id";
        public static final String om = "bid_result";
        public static final String on = "offer_data";
        public static final String oo = "network_firm_id";
    }

    private o00(o0 o0Var) {
        super(o0Var);
        this.o = o00.class.getName();
    }

    public static o00 o(o0 o0Var) {
        if (m == null) {
            synchronized (o00.class) {
                try {
                    if (m == null) {
                        m = new o00(o0Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return m;
    }

    private synchronized boolean oo(String str) {
        Cursor cursorQuery;
        try {
            try {
                cursorQuery = n().query("offer_data_cache", new String[]{"placement_id"}, "bid_id=?", new String[]{str}, null, null, null);
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
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized onm m(String str) {
        onm onmVar;
        Cursor cursorQuery;
        onmVar = new onm();
        try {
            cursorQuery = n().query("offer_data_cache", new String[]{"placement_id", "adsource_id", "bid_result"}, "out_date_timestamp>? AND placement_id=?", new String[]{String.valueOf(System.currentTimeMillis()), str}, null, null, null);
            while (cursorQuery.moveToNext()) {
                try {
                    String string = cursorQuery.getString(cursorQuery.getColumnIndex("adsource_id"));
                    on0 on0VarO = on0.o(cursorQuery.getString(cursorQuery.getColumnIndex("bid_result")));
                    if (on0VarO != null) {
                        onmVar.o(string, on0VarO);
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
        return onmVar;
    }

    public final synchronized nmo n(String str) {
        Cursor cursorQuery;
        try {
            try {
                cursorQuery = n().query("offer_data_cache", new String[]{"offer_data", "out_date_timestamp"}, "bid_id=?", new String[]{str}, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.getCount() > 0) {
                            cursorQuery.moveToNext();
                            nmo nmoVar = new nmo(cursorQuery.getString(0), cursorQuery.getLong(1));
                            cursorQuery.close();
                            cursorQuery.close();
                            return nmoVar;
                        }
                    } catch (Throwable unused) {
                        if (cursorQuery != null) {
                        }
                        return null;
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

    public final synchronized String o0(String str) {
        Cursor cursorQuery;
        try {
            try {
                cursorQuery = n().query("offer_data_cache", new String[]{"vast_parse_result"}, "bid_id=?", new String[]{str}, null, null, null);
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
                        }
                        return null;
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

    public final synchronized void o(String str) {
        try {
            o0().delete("offer_data_cache", "bid_id = ? ", new String[]{str});
        } catch (Throwable th) {
            com.thinkup.core.common.oo0.oo.m("Error_SQL_DELETE", th.getMessage(), o0n.m().o0m());
        }
    }

    public final synchronized long o(String str, on0 on0Var) {
        if (o0() == null || on0Var == null) {
            return -1L;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("placement_id", str);
            contentValues.put("adsource_id", on0Var.mn);
            contentValues.put("network_firm_id", Integer.valueOf(on0Var.o0));
            contentValues.put("bid_id", on0Var.token);
            contentValues.put("bid_result", on0Var.m());
            contentValues.put("out_date_timestamp", Long.valueOf(on0Var.om));
            if (oo(on0Var.token)) {
                return o0().update("offer_data_cache", contentValues, "bid_id = ? ", new String[]{on0Var.token});
            }
            return o0().insert("offer_data_cache", null, contentValues);
        } catch (Exception unused) {
            return -1L;
        }
    }

    public final synchronized int o(on0 on0Var) {
        if (oo(on0Var.token)) {
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("bid_result", on0Var.m());
                return o0().update("offer_data_cache", contentValues, "bid_id = ? ", new String[]{on0Var.token});
            } catch (Throwable unused) {
            }
        }
        return -1;
    }

    public final synchronized long o(String str, String str2, String str3) {
        if (o0() == null) {
            return -1L;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("offer_data", str3);
            if (!oo(str2)) {
                return -1L;
            }
            return o0().update("offer_data_cache", contentValues, "bid_id = ? ", new String[]{str2});
        } catch (Exception unused) {
            return -1L;
        }
    }

    public final synchronized long o(String str, String str2) {
        if (o0() == null) {
            return -1L;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("vast_parse_result", str2);
            if (oo(str)) {
                str2.length();
                return o0().update("offer_data_cache", contentValues, "bid_id = ? ", new String[]{str});
            }
            str2.length();
            return -1L;
        } catch (Exception unused) {
            return -1L;
        }
    }
}
