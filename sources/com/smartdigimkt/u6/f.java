package com.smartdigimkt.u6;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.thinkup.core.oo.m0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class f extends b<com.smartdigimkt.w6.h> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f38845b = "f";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile f f38846c;

    public static class a {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public static final String f38847A = "ad_source_id";

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public static final String f38848B = "network_firm_id";
        public static final String C = "progress";
        public static final String D = "file_size";

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public static final String f38849E = "apk_redownload";

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public static final String f38850F = "apk_allow_install_in_bg";
        public static final String G = "offer_cache_time";
        public static final String H = "app_name";

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public static final String f38851I = "downloading_scene";

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        public static final String f38852J = "recover_download_scene";
        public static final String K = "download_failed_scene_list";
        public static final String L = "dsp_id";
        public static final String M = "action_offer_download_tk";

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        public static final String f38853N = "app_desc";
        public static final String O = "CREATE TABLE IF NOT EXISTS download_task(unique_id TEXT ,click_id TEXT ,request_id TEXT ,offer_id TEXT ,pkg_name TEXT ,url TEXT ,title TEXT ,deeplink_click_action TEXT ,icon_url TEXT ,deeplink_url TEXT ,file_path TEXT ,placement_id TEXT ,ad_source_id TEXT ,network_firm_id TEXT ,app_name TEXT ,download_failed_scene_list TEXT ,dsp_id TEXT ,action_offer_download_tk TEXT ,app_desc TEXT ,apk_verify INTEGER ,enable_use_webview_ua INTEGER ,download_type INTEGER ,notification_type INTEGER ,int_open_switch INTEGER ,int_open_time INTEGER ,offer_source_type INTEGER ,part_count INTEGER ,enable_part_download INTEGER ,download_start_timestamp INTEGER ,download_end_timestamp INTEGER ,status INTEGER ,is_upload_installed_agentevent INTEGER ,progress INTEGER ,file_size INTEGER ,apk_redownload INTEGER ,apk_allow_install_in_bg INTEGER ,offer_cache_time INTEGER ,downloading_scene INTEGER ,recover_download_scene INTEGER)";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f38854a = "download_task";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f38855b = "unique_id";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f38856c = "click_id";
        public static final String d = "request_id";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f38857e = "offer_id";
        public static final String f = "url";
        public static final String g = "pkg_name";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final String f38858h = "title";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final String f38859i = "deeplink_click_action";
        public static final String j = "apk_verify";
        public static final String k = "enable_use_webview_ua";

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final String f38860l = "download_type";
        public static final String m = "notification_type";

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final String f38861n = "int_open_switch";
        public static final String o = "int_open_time";

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final String f38862p = "icon_url";
        public static final String q = "deeplink_url";
        public static final String r = "offer_source_type";
        public static final String s = "file_path";
        public static final String t = "part_count";

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final String f38863u = "enable_part_download";
        public static final String v = "download_start_timestamp";

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final String f38864w = "download_end_timestamp";
        public static final String x = "status";
        public static final String y = "is_upload_installed_agentevent";

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final String f38865z = "placement_id";
    }

    private f(c cVar) {
        super(cVar);
    }

    public static f a(Context context) {
        if (f38846c == null) {
            synchronized (f.class) {
                try {
                    if (f38846c == null) {
                        f38846c = new f(d.a(context));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f38846c;
    }

    private boolean b(com.smartdigimkt.w6.h hVar) {
        Cursor cursorQuery = a().query("download_task", new String[]{"unique_id"}, "unique_id = ?", new String[]{hVar.K()}, null, null, null);
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

    public synchronized void c(com.smartdigimkt.w6.h hVar) {
        if (hVar == null) {
            return;
        }
        try {
            SQLiteDatabase sQLiteDatabaseB = b();
            if (b(hVar)) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("progress", Long.valueOf(hVar.F()));
                sQLiteDatabaseB.update("download_task", contentValues, "unique_id = ?", new String[]{hVar.K()});
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public synchronized List<com.smartdigimkt.w6.h> d() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            cursorQuery = a().query("download_task", null, "status = 5 AND is_upload_installed_agentevent != 1 AND download_end_timestamp >= " + (System.currentTimeMillis() - m0.om), null, null, null, "download_start_timestamp");
            while (cursorQuery.moveToNext()) {
                arrayList.add(a(cursorQuery));
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

    public synchronized List<com.smartdigimkt.w6.h> e() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            cursorQuery = a().query("download_task", null, "download_start_timestamp <= " + System.currentTimeMillis() + " - offer_cache_time", null, null, null, "download_start_timestamp");
            while (cursorQuery.moveToNext()) {
                arrayList.add(a(cursorQuery));
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

    public synchronized void a(com.smartdigimkt.w6.h hVar) {
        if (hVar != null) {
            try {
                if (!TextUtils.isEmpty(hVar.K())) {
                    SQLiteDatabase sQLiteDatabaseB = b();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("unique_id", hVar.K());
                    contentValues.put("click_id", hVar.g());
                    contentValues.put("request_id", hVar.H());
                    contentValues.put("offer_id", hVar.A());
                    contentValues.put("pkg_name", hVar.D());
                    contentValues.put("url", hVar.L());
                    contentValues.put("title", hVar.J());
                    contentValues.put("deeplink_click_action", hVar.h());
                    contentValues.put("icon_url", hVar.t());
                    contentValues.put("deeplink_url", hVar.i());
                    contentValues.put("file_path", hVar.r());
                    contentValues.put("apk_verify", Integer.valueOf(hVar.e()));
                    contentValues.put("enable_use_webview_ua", Integer.valueOf(hVar.q()));
                    contentValues.put("download_type", Integer.valueOf(hVar.n()));
                    contentValues.put("notification_type", Integer.valueOf(hVar.y()));
                    contentValues.put("int_open_switch", Integer.valueOf(hVar.u()));
                    contentValues.put("int_open_time", Integer.valueOf(hVar.v()));
                    contentValues.put("offer_source_type", Integer.valueOf(hVar.B()));
                    contentValues.put("part_count", Integer.valueOf(hVar.C()));
                    contentValues.put("enable_part_download", Integer.valueOf(hVar.M() ? 1 : 0));
                    contentValues.put("download_start_timestamp", Long.valueOf(hVar.m()));
                    contentValues.put("download_end_timestamp", Long.valueOf(hVar.k()));
                    contentValues.put("status", Integer.valueOf(hVar.I()));
                    contentValues.put("is_upload_installed_agentevent", Integer.valueOf(hVar.w()));
                    contentValues.put("placement_id", hVar.E());
                    contentValues.put("ad_source_id", hVar.b());
                    contentValues.put("network_firm_id", hVar.x());
                    contentValues.put("progress", Long.valueOf(hVar.F()));
                    contentValues.put("file_size", Long.valueOf(hVar.s()));
                    contentValues.put("apk_redownload", Integer.valueOf(hVar.d()));
                    contentValues.put("apk_allow_install_in_bg", Integer.valueOf(hVar.c()));
                    contentValues.put("offer_cache_time", Long.valueOf(hVar.z()));
                    contentValues.put("app_name", hVar.f());
                    contentValues.put("downloading_scene", Integer.valueOf(hVar.o()));
                    contentValues.put("recover_download_scene", Integer.valueOf(hVar.G()));
                    contentValues.put("download_failed_scene_list", hVar.l());
                    contentValues.put("dsp_id", hVar.l());
                    contentValues.put("action_offer_download_tk", hVar.a());
                    contentValues.put("app_desc", hVar.j());
                    if (b(hVar)) {
                        sQLiteDatabaseB.update("download_task", contentValues, "unique_id = ?", new String[]{hVar.K()});
                    } else {
                        sQLiteDatabaseB.insertOrThrow("download_task", null, contentValues);
                    }
                }
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }

    public synchronized com.smartdigimkt.w6.h b(String str) {
        Cursor cursorQuery;
        try {
            com.smartdigimkt.w6.h hVar = new com.smartdigimkt.w6.h();
            cursorQuery = a().query("download_task", null, "download_start_timestamp > " + System.currentTimeMillis() + " - offer_cache_time AND unique_id = '" + str + "'", null, null, null, "download_start_timestamp");
            try {
                if (cursorQuery.moveToFirst()) {
                    hVar = a(cursorQuery);
                }
                cursorQuery.close();
                return hVar;
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

    public synchronized void c() {
        try {
            b().delete("download_task", "download_start_timestamp <= " + System.currentTimeMillis() + " - offer_cache_time", null);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public synchronized List<com.smartdigimkt.w6.h> b(List<Integer> list, int i2) {
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
            cursorQuery = a().query("download_task", null, sb.toString(), null, null, null, "download_start_timestamp");
            while (cursorQuery.moveToNext()) {
                arrayList.add(a(cursorQuery));
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

    public synchronized com.smartdigimkt.w6.h a(List<Integer> list, int i2) {
        Throwable th;
        Cursor cursor;
        Cursor cursorQuery;
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
            cursorQuery = a().query("download_task", null, sb.toString(), null, null, null, "download_start_timestamp", String.valueOf(i2));
            try {
                if (cursorQuery.moveToFirst()) {
                    com.smartdigimkt.w6.h hVarA = a(cursorQuery);
                    cursorQuery.close();
                    return hVarA;
                }
            } catch (Throwable th2) {
                cursor = cursorQuery;
                th = th2;
                try {
                    th.getMessage();
                    if (cursor != null) {
                        cursorQuery = cursor;
                    }
                    return null;
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
        cursorQuery.close();
        return null;
    }

    public synchronized void a(String str) {
        try {
            b().delete("download_task", "unique_id = ?", new String[]{str});
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    private com.smartdigimkt.w6.h a(Cursor cursor) {
        com.smartdigimkt.w6.h hVar = new com.smartdigimkt.w6.h();
        try {
            hVar.r(cursor.getString(a(cursor, "unique_id")));
            hVar.d(cursor.getString(a(cursor, "click_id")));
            hVar.p(cursor.getString(a(cursor, "request_id")));
            hVar.m(cursor.getString(a(cursor, "offer_id")));
            hVar.s(cursor.getString(a(cursor, "url")));
            hVar.n(cursor.getString(a(cursor, "pkg_name")));
            hVar.q(cursor.getString(a(cursor, "title")));
            hVar.e(cursor.getString(a(cursor, "deeplink_click_action")));
            hVar.k(cursor.getString(a(cursor, "icon_url")));
            hVar.f(cursor.getString(a(cursor, "deeplink_url")));
            hVar.j(cursor.getString(a(cursor, "file_path")));
            hVar.o(cursor.getString(a(cursor, "placement_id")));
            hVar.b(cursor.getString(a(cursor, "ad_source_id")));
            hVar.l(cursor.getString(a(cursor, "network_firm_id")));
            hVar.c(cursor.getString(a(cursor, "app_name")));
            hVar.h(cursor.getString(a(cursor, "download_failed_scene_list")));
            hVar.i(cursor.getString(a(cursor, "dsp_id")));
            hVar.a(cursor.getString(a(cursor, "action_offer_download_tk")));
            hVar.g(cursor.getString(a(cursor, "app_desc")));
            hVar.c(cursor.getInt(a(cursor, "apk_verify")));
            hVar.f(cursor.getInt(a(cursor, "enable_use_webview_ua")));
            hVar.d(cursor.getInt(a(cursor, "download_type")));
            hVar.j(cursor.getInt(a(cursor, "notification_type")));
            hVar.g(cursor.getInt(a(cursor, "int_open_switch")));
            hVar.h(cursor.getInt(a(cursor, "int_open_time")));
            hVar.k(cursor.getInt(a(cursor, "offer_source_type")));
            hVar.l(cursor.getInt(a(cursor, "part_count")));
            boolean z2 = true;
            if (cursor.getInt(a(cursor, "enable_part_download")) != 1) {
                z2 = false;
            }
            hVar.a(z2);
            hVar.b(cursor.getLong(a(cursor, "download_start_timestamp")));
            hVar.a(cursor.getLong(a(cursor, "download_end_timestamp")));
            hVar.n(cursor.getInt(a(cursor, "status")));
            hVar.i(cursor.getInt(a(cursor, "is_upload_installed_agentevent")));
            hVar.e(cursor.getLong(a(cursor, "progress")));
            hVar.c(cursor.getLong(a(cursor, "file_size")));
            hVar.b(cursor.getInt(a(cursor, "apk_redownload")));
            hVar.a(cursor.getInt(a(cursor, "apk_allow_install_in_bg")));
            hVar.d(cursor.getLong(a(cursor, "offer_cache_time")));
            hVar.e(cursor.getInt(a(cursor, "downloading_scene")));
            hVar.m(cursor.getInt(a(cursor, "recover_download_scene")));
            return hVar;
        } catch (Throwable th) {
            th.getMessage();
            return hVar;
        }
    }

    private int a(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        throw new IllegalArgumentException("columnIndex must >= 0.");
    }
}
