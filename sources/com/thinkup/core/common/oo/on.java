package com.thinkup.core.common.oo;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.thinkup.core.common.on.onn;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class on extends n<onn> {
    private static volatile on m = null;
    private static final String o = "on";

    public static class o {
        public static final String m = "unique_id";
        public static final String m0 = "title";
        public static final String m00 = "apk_allow_install_in_bg";
        public static final String m0m = "app_name";
        public static final String m0n = "downloading_scene";
        public static final String m0o = "offer_cache_time";
        public static final String mm = "apk_verify";
        public static final String mm0 = "app_desc";
        public static final String mmo = "CREATE TABLE IF NOT EXISTS download_task(unique_id TEXT ,click_id TEXT ,request_id TEXT ,offer_id TEXT ,pkg_name TEXT ,url TEXT ,title TEXT ,deeplink_click_action TEXT ,icon_url TEXT ,deeplink_url TEXT ,file_path TEXT ,placement_id TEXT ,ad_source_id TEXT ,network_firm_id TEXT ,app_name TEXT ,download_failed_scene_list TEXT ,dsp_id TEXT ,action_offer_download_tk TEXT ,app_desc TEXT ,apk_verify INTEGER ,enable_use_webview_ua INTEGER ,download_type INTEGER ,notification_type INTEGER ,int_open_switch INTEGER ,int_open_time INTEGER ,offer_source_type INTEGER ,part_count INTEGER ,enable_part_download INTEGER ,download_start_timestamp INTEGER ,download_end_timestamp INTEGER ,status INTEGER ,is_upload_installed_agentevent INTEGER ,progress INTEGER ,file_size INTEGER ,apk_redownload INTEGER ,apk_allow_install_in_bg INTEGER ,offer_cache_time INTEGER ,downloading_scene INTEGER ,recover_download_scene INTEGER)";
        public static final String mn = "enable_use_webview_ua";
        public static final String mo = "deeplink_click_action";
        public static final String mo0 = "recover_download_scene";
        public static final String mom = "dsp_id";
        public static final String mon = "action_offer_download_tk";
        public static final String moo = "download_failed_scene_list";

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final String f42278n = "click_id";
        public static final String n0 = "download_type";
        public static final String nm = "int_open_switch";
        public static final String nn = "int_open_time";
        public static final String no = "notification_type";
        public static final String o = "download_task";
        public static final String o0 = "request_id";
        public static final String o00 = "icon_url";
        public static final String o0m = "offer_source_type";
        public static final String o0n = "file_path";
        public static final String o0o = "deeplink_url";
        public static final String om = "url";
        public static final String om0 = "status";
        public static final String omm = "placement_id";
        public static final String omn = "ad_source_id";
        public static final String omo = "is_upload_installed_agentevent";
        public static final String on = "pkg_name";
        public static final String on0 = "network_firm_id";
        public static final String onm = "file_size";
        public static final String onn = "apk_redownload";
        public static final String ono = "progress";
        public static final String oo = "offer_id";
        public static final String oo0 = "part_count";
        public static final String oom = "download_start_timestamp";
        public static final String oon = "download_end_timestamp";
        public static final String ooo = "enable_part_download";
    }

    private on(o0 o0Var) {
        super(o0Var);
    }

    private synchronized void m(onn onnVar) {
        if (onnVar != null) {
            try {
                if (!TextUtils.isEmpty(onnVar.mm())) {
                    SQLiteDatabase sQLiteDatabaseO0 = o0();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("unique_id", onnVar.mm());
                    contentValues.put("click_id", onnVar.mn());
                    contentValues.put("request_id", onnVar.n0());
                    contentValues.put("offer_id", onnVar.no());
                    contentValues.put("pkg_name", onnVar.nn());
                    contentValues.put("url", onnVar.nm());
                    contentValues.put("title", onnVar.o00());
                    contentValues.put("deeplink_click_action", onnVar.o0o());
                    contentValues.put("icon_url", onnVar.oom());
                    contentValues.put("deeplink_url", onnVar.oon());
                    contentValues.put("file_path", onnVar.on());
                    contentValues.put("apk_verify", Integer.valueOf(onnVar.on0()));
                    contentValues.put("enable_use_webview_ua", Integer.valueOf(onnVar.om0()));
                    contentValues.put("download_type", Integer.valueOf(onnVar.o0m()));
                    contentValues.put("notification_type", Integer.valueOf(onnVar.o0n()));
                    contentValues.put("int_open_switch", Integer.valueOf(onnVar.oo0()));
                    contentValues.put("int_open_time", Integer.valueOf(onnVar.ooo()));
                    contentValues.put("offer_source_type", Integer.valueOf(onnVar.omo()));
                    contentValues.put("part_count", Integer.valueOf(onnVar.m0()));
                    contentValues.put("enable_part_download", Integer.valueOf(onnVar.mo() ? 1 : 0));
                    contentValues.put("download_start_timestamp", Long.valueOf(onnVar.omm()));
                    contentValues.put("download_end_timestamp", Long.valueOf(onnVar.omn()));
                    contentValues.put("status", Integer.valueOf(onnVar.ono()));
                    contentValues.put("is_upload_installed_agentevent", Integer.valueOf(onnVar.onm()));
                    contentValues.put("placement_id", onnVar.o0());
                    contentValues.put("ad_source_id", onnVar.oo());
                    contentValues.put("network_firm_id", onnVar.om());
                    contentValues.put("progress", Long.valueOf(onnVar.onn()));
                    contentValues.put("file_size", Long.valueOf(onnVar.m00()));
                    contentValues.put("apk_redownload", Integer.valueOf(onnVar.m0o()));
                    contentValues.put("apk_allow_install_in_bg", Integer.valueOf(onnVar.m0m()));
                    contentValues.put("offer_cache_time", Long.valueOf(onnVar.m0n()));
                    contentValues.put("app_name", onnVar.mo0());
                    contentValues.put("downloading_scene", Integer.valueOf(onnVar.o()));
                    contentValues.put("recover_download_scene", Integer.valueOf(onnVar.m()));
                    contentValues.put("download_failed_scene_list", onnVar.n());
                    contentValues.put("dsp_id", onnVar.n());
                    contentValues.put("action_offer_download_tk", onnVar.moo());
                    contentValues.put("app_desc", onnVar.mom());
                    if (n(onnVar)) {
                        sQLiteDatabaseO0.update("download_task", contentValues, "unique_id = ?", new String[]{onnVar.mm()});
                    } else {
                        sQLiteDatabaseO0.insertOrThrow("download_task", null, contentValues);
                    }
                }
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }

    private boolean n(onn onnVar) {
        Cursor cursorQuery = n().query("download_task", new String[]{"unique_id"}, "unique_id = ?", new String[]{onnVar.mm()}, null, null, null);
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

    private static on o(Context context) {
        if (m == null) {
            synchronized (on.class) {
                try {
                    if (m == null) {
                        m = new on(oo.o(context));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return m;
    }

    private synchronized void oo() {
        try {
            o0().delete("download_task", "download_start_timestamp <= " + System.currentTimeMillis() + " - offer_cache_time", null);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    private synchronized void o(onn onnVar) {
        if (onnVar == null) {
            return;
        }
        try {
            SQLiteDatabase sQLiteDatabaseO0 = o0();
            if (n(onnVar)) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("progress", Long.valueOf(onnVar.onn()));
                sQLiteDatabaseO0.update("download_task", contentValues, "unique_id = ?", new String[]{onnVar.mm()});
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    private synchronized onn o(String str) {
        Cursor cursorQuery;
        try {
            onn onnVar = new onn();
            cursorQuery = n().query("download_task", null, "download_start_timestamp > " + System.currentTimeMillis() + " - offer_cache_time AND unique_id = '" + str + "'", null, null, null, "download_start_timestamp");
            try {
                if (cursorQuery.moveToFirst()) {
                    onnVar = o(cursorQuery);
                }
                cursorQuery.close();
                return onnVar;
            } catch (Throwable th) {
                th = th;
                try {
                    th.getMessage();
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                } catch (Throwable th2) {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            cursorQuery = null;
        }
    }

    private synchronized List<onn> o() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            cursorQuery = n().query("download_task", null, "download_start_timestamp <= " + System.currentTimeMillis() + " - offer_cache_time", null, null, null, "download_start_timestamp");
            while (cursorQuery.moveToNext()) {
                arrayList.add(o(cursorQuery));
            }
        } catch (Throwable th) {
            try {
                th.getMessage();
                if (cursorQuery != null) {
                }
            } catch (Throwable th2) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                throw th2;
            }
        }
        cursorQuery.close();
        return arrayList;
    }

    private synchronized List<onn> o(List<Integer> list, int i2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("status IN (");
            for (int i3 = 0; i3 < list.size(); i3++) {
                sb.append(list.get(i3));
                if (i3 != list.size() - 1) {
                    sb.append(",");
                }
            }
            sb.append(")");
            sb.append(" AND ");
            sb.append("download_start_timestamp");
            sb.append(" > ");
            sb.append(System.currentTimeMillis());
            sb.append(" - ");
            sb.append("offer_cache_time");
            if (i2 > 0) {
                sb.append(" AND ");
                sb.append("apk_redownload");
                sb.append(" = ");
                sb.append(i2);
            }
            cursorQuery = n().query("download_task", null, sb.toString(), null, null, null, "download_start_timestamp");
            while (cursorQuery.moveToNext()) {
                arrayList.add(o(cursorQuery));
            }
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
        return arrayList;
    }

    private synchronized List<onn> m() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            cursorQuery = n().query("download_task", null, "status = 5 AND is_upload_installed_agentevent != 1 AND download_end_timestamp >= " + (System.currentTimeMillis() - com.thinkup.core.oo.m0.om), null, null, null, "download_start_timestamp");
            while (cursorQuery.moveToNext()) {
                arrayList.add(o(cursorQuery));
            }
        } catch (Throwable th) {
            try {
                th.getMessage();
                if (cursorQuery != null) {
                }
            } catch (Throwable th2) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                throw th2;
            }
        }
        cursorQuery.close();
        return arrayList;
    }

    private synchronized onn m(List<Integer> list, int i2) {
        Throwable th;
        Cursor cursor;
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("status IN (");
            for (int i3 = 0; i3 < list.size(); i3++) {
                sb.append(list.get(i3));
                if (i3 != list.size() - 1) {
                    sb.append(",");
                }
            }
            sb.append(")");
            sb.append(" AND ");
            sb.append("download_start_timestamp");
            sb.append(" > ");
            sb.append(System.currentTimeMillis());
            sb.append(" - ");
            sb.append("offer_cache_time");
            Cursor cursorQuery = n().query("download_task", null, sb.toString(), null, null, null, "download_start_timestamp", String.valueOf(i2));
            try {
                if (cursorQuery.moveToFirst()) {
                    onn onnVarO = o(cursorQuery);
                    cursorQuery.close();
                    return onnVarO;
                }
                cursorQuery.close();
            } catch (Throwable th2) {
                cursor = cursorQuery;
                th = th2;
                try {
                    th.getMessage();
                    if (cursor != null) {
                        cursor.close();
                    }
                } catch (Throwable th3) {
                    if (cursor != null) {
                        cursor.close();
                        throw th3;
                    }
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            cursor = null;
        }
        return null;
    }

    private static onn o(Cursor cursor) {
        onn onnVar = new onn();
        try {
            onnVar.om(cursor.getString(o(cursor, "unique_id")));
            onnVar.on(cursor.getString(o(cursor, "click_id")));
            onnVar.m0(cursor.getString(o(cursor, "request_id")));
            onnVar.mo(cursor.getString(o(cursor, "offer_id")));
            onnVar.mm(cursor.getString(o(cursor, "url")));
            onnVar.mn(cursor.getString(o(cursor, "pkg_name")));
            onnVar.n0(cursor.getString(o(cursor, "title")));
            onnVar.no(cursor.getString(o(cursor, "deeplink_click_action")));
            onnVar.nm(cursor.getString(o(cursor, "icon_url")));
            onnVar.nn(cursor.getString(o(cursor, "deeplink_url")));
            onnVar.oo(cursor.getString(o(cursor, "file_path")));
            onnVar.m(cursor.getString(o(cursor, "placement_id")));
            onnVar.n(cursor.getString(o(cursor, "ad_source_id")));
            onnVar.o0(cursor.getString(o(cursor, "network_firm_id")));
            onnVar.o00(cursor.getString(o(cursor, "app_name")));
            onnVar.o(cursor.getString(o(cursor, "download_failed_scene_list")));
            onnVar.o0o(cursor.getString(o(cursor, "dsp_id")));
            onnVar.o0m(cursor.getString(o(cursor, "action_offer_download_tk")));
            onnVar.o0n(cursor.getString(o(cursor, "app_desc")));
            onnVar.mm(cursor.getInt(o(cursor, "apk_verify")));
            onnVar.m0(cursor.getInt(o(cursor, "enable_use_webview_ua")));
            onnVar.o0(cursor.getInt(o(cursor, "download_type")));
            onnVar.oo(cursor.getInt(o(cursor, "notification_type")));
            onnVar.om(cursor.getInt(o(cursor, "int_open_switch")));
            onnVar.on(cursor.getInt(o(cursor, "int_open_time")));
            onnVar.mo(cursor.getInt(o(cursor, "offer_source_type")));
            onnVar.n(cursor.getInt(o(cursor, "part_count")));
            boolean z2 = true;
            if (cursor.getInt(o(cursor, "enable_part_download")) != 1) {
                z2 = false;
            }
            onnVar.o(z2);
            onnVar.o(cursor.getLong(o(cursor, "download_start_timestamp")));
            onnVar.m(cursor.getLong(o(cursor, "download_end_timestamp")));
            onnVar.mn(cursor.getInt(o(cursor, "status")));
            onnVar.n0(cursor.getInt(o(cursor, "is_upload_installed_agentevent")));
            onnVar.n(cursor.getLong(o(cursor, "progress")));
            onnVar.o0(cursor.getLong(o(cursor, "file_size")));
            onnVar.no(cursor.getInt(o(cursor, "apk_redownload")));
            onnVar.nm(cursor.getInt(o(cursor, "apk_allow_install_in_bg")));
            onnVar.oo(cursor.getLong(o(cursor, "offer_cache_time")));
            onnVar.o(cursor.getInt(o(cursor, "downloading_scene")));
            onnVar.m(cursor.getInt(o(cursor, "recover_download_scene")));
            return onnVar;
        } catch (Throwable th) {
            th.getMessage();
            return onnVar;
        }
    }

    private synchronized void m(String str) {
        try {
            o0().delete("download_task", "unique_id = ?", new String[]{str});
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    private static int o(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        throw new IllegalArgumentException("columnIndex must >= 0.");
    }
}
