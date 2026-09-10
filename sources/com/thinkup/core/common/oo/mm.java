package com.thinkup.core.common.oo;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.thinkup.core.common.on.mo0;
import com.thinkup.core.common.on.moo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class mm extends n<mo0> {
    private static volatile mm m = null;
    private static final String o = "mm";

    public static class o {
        static final String m = "placement_id";
        public static final String m0 = "CREATE INDEX IF NOT EXISTS idx_placement_id ON dyn_wf_ad_source_filter(placement_id)";
        public static final String mm = "CREATE INDEX IF NOT EXISTS idx_ad_request_id ON dyn_wf_ad_source_filter(request_id)";
        public static final String mn = "CREATE INDEX IF NOT EXISTS idx_expired_timestamp ON dyn_wf_ad_source_filter(expired_timestamp)";
        public static final String mo = "CREATE INDEX IF NOT EXISTS idx_ad_source_id ON dyn_wf_ad_source_filter(ad_source_id)";

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final String f42261n = "ad_source_id";
        public static final String n0 = "CREATE INDEX IF NOT EXISTS idx_match_error_code ON dyn_wf_ad_source_filter(match_error_code)";
        static final String o = "dyn_wf_ad_source_filter";
        static final String o0 = "request_id";
        static final String om = "match_error_code";
        public static final String on = "CREATE TABLE IF NOT EXISTS dyn_wf_ad_source_filter(placement_id TEXT ,ad_source_id TEXT ,request_id TEXT ,match_error_code TEXT ,expired_timestamp INTEGER)";
        static final String oo = "expired_timestamp";
    }

    private mm(o0 o0Var) {
        super(o0Var);
    }

    private Map<String, Integer> n(String str) {
        HashMap map = new HashMap();
        Cursor cursorQuery = null;
        try {
            String[] strArr = {str, String.valueOf(System.currentTimeMillis())};
            cursorQuery = n().query("dyn_wf_ad_source_filter", new String[]{"ad_source_id", "count(request_id)"}, "placement_id = ? AND expired_timestamp >= ?", strArr, "ad_source_id", null, null);
            while (cursorQuery.moveToNext()) {
                map.put(cursorQuery.getString(o(cursorQuery, "ad_source_id")), Integer.valueOf(cursorQuery.getInt(1)));
            }
        } catch (Throwable th) {
            try {
                th.getMessage();
                if (cursorQuery != null) {
                }
                map.size();
                return map;
            } catch (Throwable th2) {
                if (cursorQuery == null) {
                    throw th2;
                }
                cursorQuery.close();
                throw th2;
            }
        }
        cursorQuery.close();
        map.size();
        return map;
    }

    public static mm o(Context context) {
        if (m == null) {
            synchronized (mm.class) {
                try {
                    if (m == null) {
                        m = new mm(oo.o(context));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return m;
    }

    public final synchronized void m(String str) {
        try {
            o0().delete("dyn_wf_ad_source_filter", "placement_id = ? AND expired_timestamp < ?", new String[]{str, String.valueOf(System.currentTimeMillis())});
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    private boolean m(mo0 mo0Var) {
        Cursor cursorQuery = n().query("dyn_wf_ad_source_filter", new String[]{"request_id"}, "request_id = ? AND ad_source_id = ?", new String[]{mo0Var.on(), mo0Var.o()}, null, null, null);
        if (cursorQuery != null && cursorQuery.getCount() > 0) {
            cursorQuery.close();
            return true;
        }
        if (cursorQuery == null) {
            return false;
        }
        cursorQuery.close();
        return false;
    }

    public final synchronized void o(mo0 mo0Var) {
        if (mo0Var == null) {
            return;
        }
        try {
            SQLiteDatabase sQLiteDatabaseO0 = o0();
            ContentValues contentValues = new ContentValues();
            contentValues.put("placement_id", mo0Var.m());
            contentValues.put("ad_source_id", mo0Var.o());
            contentValues.put("request_id", mo0Var.on());
            contentValues.put("match_error_code", mo0Var.m0());
            contentValues.put("expired_timestamp", Long.valueOf(mo0Var.om()));
            Cursor cursorQuery = n().query("dyn_wf_ad_source_filter", new String[]{"request_id"}, "request_id = ? AND ad_source_id = ?", new String[]{mo0Var.on(), mo0Var.o()}, null, null, null);
            if (cursorQuery != null && cursorQuery.getCount() > 0) {
                cursorQuery.close();
                sQLiteDatabaseO0.update("dyn_wf_ad_source_filter", contentValues, "request_id = ? AND ad_source_id = ?", new String[]{mo0Var.on(), mo0Var.o()});
            } else {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                sQLiteDatabaseO0.insertOrThrow("dyn_wf_ad_source_filter", null, contentValues);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public final synchronized moo o(String str) {
        moo mooVar;
        mooVar = new moo(str);
        Cursor cursorQuery = null;
        try {
            String[] strArr = {str, "", String.valueOf(System.currentTimeMillis())};
            cursorQuery = n().query("dyn_wf_ad_source_filter", new String[]{"ad_source_id", "match_error_code", "count(request_id)"}, "placement_id = ? AND match_error_code IS NOT NULL AND match_error_code != ? AND expired_timestamp >= ?", strArr, "ad_source_id,match_error_code", null, "ad_source_id");
            HashMap map = new HashMap();
            while (cursorQuery.moveToNext()) {
                String string = cursorQuery.getString(o(cursorQuery, "ad_source_id"));
                String string2 = cursorQuery.getString(o(cursorQuery, "match_error_code"));
                int i2 = cursorQuery.getInt(2);
                List arrayList = (List) map.get(string);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(new moo.o(string2, i2));
                map.put(string, arrayList);
            }
            map.size();
            mooVar.o(map);
        } catch (Throwable th) {
            try {
                th.getMessage();
                if (cursorQuery != null) {
                }
            } catch (Throwable th2) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                    throw th2;
                }
                throw th2;
            }
        }
        cursorQuery.close();
        mooVar.m(n(str));
        return mooVar;
    }

    private static int o(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        throw new IllegalArgumentException("columnIndex must >= 0.");
    }
}
