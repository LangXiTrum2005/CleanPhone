package com.smartdigimkt.u6;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes6.dex */
public class d extends c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static d f38837c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f38838b;

    private d(Context context) {
        super(context);
        this.f38838b = getClass().getSimpleName();
    }

    public static d a(Context context) {
        if (f38837c == null) {
            synchronized (d.class) {
                try {
                    if (f38837c == null) {
                        f38837c = new d(context.getApplicationContext());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f38837c;
    }

    private void c(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'sdkconfig'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'request_info'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'offer_action_record'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'offer_data_cache'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'dsp_offer_show_record'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'dsp_offer_install_record'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'inspect_info'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'video_res_cache_info'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'notice_url_fail_info'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'download_task'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'adx_offer_tracking'");
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void d(SQLiteDatabase sQLiteDatabase) {
        c(sQLiteDatabase);
        b(sQLiteDatabase);
    }

    @Override // com.smartdigimkt.u6.c
    public int b() {
        return 2;
    }

    @Override // com.smartdigimkt.u6.c
    public void b(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        while (i2 < i3) {
            if (i2 == 1) {
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS sdkconfig(key TEXT ,type TEXT ,lastupdatetime TEXT ,value TEXT )");
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS request_info(id TEXT, req_type INTEGER, req_url TEXT, req_head TEXT, req_content TEXT, time INTEGER, extra TEXT )");
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS offer_action_record(adsource_id TEXT ,type INTEGER ,unit_id TEXT ,click_count INTEGER ,show_count INTEGER ,expire_time INTEGER )");
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS offer_data_cache(placement_id TEXT ,bid_id TEXT ,adsource_id TEXT ,network_firm_id INTEGER ,bid_result TEXT ,offer_data TEXT ,out_date_timestamp INTEGER ,vast_parse_result TEXT)");
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS dsp_offer_show_record(dsp_id TEXT ,dsp_offer_id TEXT ,show_limit INTEGER ,show_count INTEGER ,create_time INTEGER ,last_update_time INTEGER)");
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS dsp_offer_install_record(dsp_id TEXT ,dsp_offer_id TEXT ,package_name TEXT ,last_update_time INTEGER)");
                sQLiteDatabase.execSQL(j.a.f);
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS video_res_cache_info(video_url TEXT, file_path TEXT, ready_rate INTEGER, download_size INTEGER, total_size INTEGER, update_time INTEGER )");
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS notice_url_fail_info(id TEXT, req_type INTEGER, req_url TEXT, req_head TEXT, first_fail_time INTEGER, offer_out_date_time INTEGER, retry_count INTEGER )");
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS download_task(unique_id TEXT ,click_id TEXT ,request_id TEXT ,offer_id TEXT ,pkg_name TEXT ,url TEXT ,title TEXT ,deeplink_click_action TEXT ,icon_url TEXT ,deeplink_url TEXT ,file_path TEXT ,placement_id TEXT ,ad_source_id TEXT ,network_firm_id TEXT ,app_name TEXT ,download_failed_scene_list TEXT ,dsp_id TEXT ,action_offer_download_tk TEXT ,app_desc TEXT ,apk_verify INTEGER ,enable_use_webview_ua INTEGER ,download_type INTEGER ,notification_type INTEGER ,int_open_switch INTEGER ,int_open_time INTEGER ,offer_source_type INTEGER ,part_count INTEGER ,enable_part_download INTEGER ,download_start_timestamp INTEGER ,download_end_timestamp INTEGER ,status INTEGER ,is_upload_installed_agentevent INTEGER ,progress INTEGER ,file_size INTEGER ,apk_redownload INTEGER ,apk_allow_install_in_bg INTEGER ,offer_cache_time INTEGER ,downloading_scene INTEGER ,recover_download_scene INTEGER)");
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS adx_offer_tracking(placement_id TEXT ,dsp_id TEXT ,offer_id TEXT ,tk_type INTEGER ,extra_info TEXT ,create_time INTEGER)");
            }
            i2++;
        }
    }

    @Override // com.smartdigimkt.u6.c
    public String a() {
        return "sdm.db";
    }

    @Override // com.smartdigimkt.u6.c
    public void a(SQLiteDatabase sQLiteDatabase) {
        b(sQLiteDatabase);
    }

    @Override // com.smartdigimkt.u6.c
    public void a(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        c(sQLiteDatabase);
        b(sQLiteDatabase);
    }

    private void b(SQLiteDatabase sQLiteDatabase) {
        try {
            b(sQLiteDatabase, 1, 2);
        } catch (Throwable th) {
            th.printStackTrace();
            th.getMessage();
        }
    }
}
