package com.thinkup.core.common.oo;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.thinkup.core.common.n.o0n;

/* JADX INFO: loaded from: classes6.dex */
public class oo extends o0 {
    private static oo o;

    private oo(Context context) {
        super(context);
    }

    public static oo o(Context context) {
        if (o == null) {
            synchronized (oo.class) {
                try {
                    if (o == null) {
                        o = new oo(context.getApplicationContext());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return o;
    }

    private void oo(SQLiteDatabase sQLiteDatabase) {
        o0(sQLiteDatabase);
        n(sQLiteDatabase);
    }

    @Override // com.thinkup.core.common.oo.o0
    public final void m(SQLiteDatabase sQLiteDatabase) {
        o0(sQLiteDatabase);
        n(sQLiteDatabase);
    }

    @Override // com.thinkup.core.common.oo.o0
    public final String n() {
        return "thinkup.db";
    }

    @Override // com.thinkup.core.common.oo.o0
    public final int o0() {
        return 20;
    }

    private void n(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS sdkconfig(key TEXT ,type TEXT ,lastupdatetime TEXT ,value TEXT )");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS request_info(id TEXT, req_type INTEGER, req_url TEXT, req_head TEXT, req_content TEXT, time INTEGER, extra TEXT )");
            o(sQLiteDatabase, 3, 20);
            o0n.m().on();
            String str = com.thinkup.core.common.n.mo.o;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private static void o0(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'sdkconfig'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'request_info'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'placement_ad_impression'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'offer_action_record'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'offer_data_cache'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'dsp_offer_show_record'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'dsp_offer_install_record'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'inspect_info'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'video_res_cache_info'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'notice_url_fail_info'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'user_value_placement'");
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.thinkup.core.common.oo.o0
    public final void o(SQLiteDatabase sQLiteDatabase) {
        n(sQLiteDatabase);
    }

    @Override // com.thinkup.core.common.oo.o0
    public final void o(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        for (int i4 = i2; i4 < i3; i4++) {
            switch (i4) {
                case 1:
                case 2:
                    o0(sQLiteDatabase);
                    n(sQLiteDatabase);
                    break;
                case 3:
                    sQLiteDatabase.execSQL(o0o.o.mm);
                    break;
                case 4:
                    sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS offer_action_record(adsource_id TEXT ,type INTEGER ,unit_id TEXT ,click_count INTEGER ,show_count INTEGER ,expire_time INTEGER )");
                    sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS offer_data_cache(placement_id TEXT ,bid_id TEXT ,adsource_id TEXT ,network_firm_id INTEGER ,bid_result TEXT ,offer_data TEXT ,out_date_timestamp INTEGER ,vast_parse_result TEXT)");
                    break;
                case 5:
                    sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS dsp_offer_show_record(dsp_id TEXT ,dsp_offer_id TEXT ,show_limit INTEGER ,show_count INTEGER ,create_time INTEGER ,last_update_time INTEGER)");
                    sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS dsp_offer_install_record(dsp_id TEXT ,dsp_offer_id TEXT ,package_name TEXT ,last_update_time INTEGER)");
                    break;
                case 6:
                    sQLiteDatabase.execSQL(n0.o.on);
                    break;
                case 7:
                    sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS video_res_cache_info(video_url TEXT, file_path TEXT, ready_rate INTEGER, download_size INTEGER, total_size INTEGER, update_time INTEGER )");
                    break;
                case 8:
                    sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS notice_url_fail_info(id TEXT, req_type INTEGER, req_url TEXT, req_head TEXT, first_fail_time INTEGER, offer_out_date_time INTEGER, retry_count INTEGER )");
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'request_info'");
                    sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS request_info(id TEXT, req_type INTEGER, req_url TEXT, req_head TEXT, req_content TEXT, time INTEGER, extra TEXT )");
                    break;
                case 9:
                    sQLiteDatabase.execSQL(com.thinkup.core.o0.m.oo.o.n0);
                    break;
                case 10:
                    try {
                        sQLiteDatabase.execSQL(com.thinkup.core.o0.m.oo.o.n0);
                        break;
                    } catch (Throwable unused) {
                    }
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'offer_data_cache'");
                    sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS offer_data_cache(placement_id TEXT ,bid_id TEXT ,adsource_id TEXT ,network_firm_id INTEGER ,bid_result TEXT ,offer_data TEXT ,out_date_timestamp INTEGER ,vast_parse_result TEXT)");
                    break;
                case 11:
                    sQLiteDatabase.execSQL(com.thinkup.core.o0.m.oo.o.no);
                    sQLiteDatabase.execSQL(com.thinkup.core.o0.m.oo.o.nm);
                    break;
                case 12:
                    try {
                        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS download_task(unique_id TEXT ,click_id TEXT ,request_id TEXT ,offer_id TEXT ,pkg_name TEXT ,url TEXT ,title TEXT ,deeplink_click_action TEXT ,icon_url TEXT ,deeplink_url TEXT ,file_path TEXT ,placement_id TEXT ,ad_source_id TEXT ,network_firm_id TEXT ,app_name TEXT ,download_failed_scene_list TEXT ,dsp_id TEXT ,action_offer_download_tk TEXT ,app_desc TEXT ,apk_verify INTEGER ,enable_use_webview_ua INTEGER ,download_type INTEGER ,notification_type INTEGER ,int_open_switch INTEGER ,int_open_time INTEGER ,offer_source_type INTEGER ,part_count INTEGER ,enable_part_download INTEGER ,download_start_timestamp INTEGER ,download_end_timestamp INTEGER ,status INTEGER ,is_upload_installed_agentevent INTEGER ,progress INTEGER ,file_size INTEGER ,apk_redownload INTEGER ,apk_allow_install_in_bg INTEGER ,offer_cache_time INTEGER ,downloading_scene INTEGER ,recover_download_scene INTEGER)");
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                    break;
                case 13:
                    try {
                        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'offer_data_cache'");
                        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS offer_data_cache(placement_id TEXT ,bid_id TEXT ,adsource_id TEXT ,network_firm_id INTEGER ,bid_result TEXT ,offer_data TEXT ,out_date_timestamp INTEGER ,vast_parse_result TEXT)");
                    } catch (SQLException e2) {
                        e2.getMessage();
                    }
                    break;
                case 14:
                    try {
                        sQLiteDatabase.execSQL(n0.o.m0);
                    } catch (Throwable th2) {
                        th2.getMessage();
                    }
                    break;
                case 15:
                    if (i2 == 15) {
                        try {
                            sQLiteDatabase.execSQL(n0.o.mo);
                        } catch (Throwable th3) {
                            th3.getMessage();
                        }
                    }
                    break;
                case 16:
                    try {
                        sQLiteDatabase.execSQL(mm.o.on);
                        sQLiteDatabase.execSQL(mm.o.m0);
                        sQLiteDatabase.execSQL(mm.o.mo);
                        sQLiteDatabase.execSQL(mm.o.mm);
                        sQLiteDatabase.execSQL(mm.o.mn);
                        sQLiteDatabase.execSQL(mm.o.n0);
                    } catch (Throwable th4) {
                        th4.getMessage();
                    }
                    break;
                case 17:
                    try {
                        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS adx_offer_tracking(placement_id TEXT ,dsp_id TEXT ,offer_id TEXT ,tk_type INTEGER ,extra_info TEXT ,create_time INTEGER)");
                    } catch (Throwable unused2) {
                    }
                    break;
                case 18:
                    try {
                        sQLiteDatabase.execSQL(o.C0684o.o0m);
                    } catch (Throwable th5) {
                        th5.getMessage();
                    }
                    break;
                case 19:
                    try {
                        sQLiteDatabase.execSQL(o.C0684o.o0n);
                        sQLiteDatabase.execSQL(o.C0684o.oo0);
                        sQLiteDatabase.execSQL(o.C0684o.ooo);
                    } catch (Throwable th6) {
                        th6.getMessage();
                    }
                    break;
            }
        }
    }
}
