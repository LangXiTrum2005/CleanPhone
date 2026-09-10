package com.bytedance.sdk.component.mo.qdl.lnr;

import android.text.TextUtils;
import com.bytedance.sdk.component.mo.qdl.jpc;
import com.bytedance.sdk.component.mo.qdl.mzz;
import com.bytedance.sdk.component.mo.qdl.ud.mml;
import com.google.android.gms.ads.AdError;
import com.p004ironsource.qt;
import com.smartdigimkt.m6.a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class qdl {
    private static final LinkedList<String> qdl = new LinkedList<>();
    private static final LinkedList<String> ud = new LinkedList<>();
    private static final LinkedList<String> lnr = new LinkedList<>();
    private static final LinkedList<String> mml = new LinkedList<>();
    private static final Map<String, Integer> mzz = new HashMap();
    private static HashMap<String, Integer> mo = null;
    private static String wd = "upload_init";
    private static int jpc = 0;
    private static int tvp = 0;

    public static long jpc(com.bytedance.sdk.component.mo.qdl.mml.qdl qdlVar) {
        if (qdlVar == null || qdlVar.wd() == null || !ud()) {
            return 0L;
        }
        try {
            return new JSONObject(qdlVar.wd().optString("ad_extra_data")).optLong("sdk_event_index");
        } catch (Exception e2) {
            e2.getMessage();
            return 0L;
        }
    }

    private static synchronized String lnr(String str) {
        StringBuilder sb;
        try {
            LinkedList<String> linkedList = lnr;
            if (linkedList.size() >= 10) {
                linkedList.removeFirst();
                linkedList.add(str);
            } else {
                linkedList.add(str);
            }
            sb = new StringBuilder();
            Iterator<String> it = linkedList.iterator();
            while (it.hasNext()) {
                sb.append(it.next());
                sb.append(",");
            }
        } catch (Throwable th) {
            throw th;
        }
        return sb.toString();
    }

    private static synchronized void mml(String str) {
        LinkedList<String> linkedList = mml;
        if (linkedList.size() < 10) {
            linkedList.add(str);
        } else {
            linkedList.removeFirst();
            linkedList.add(str);
        }
    }

    private static synchronized String mo() {
        StringBuilder sb;
        try {
            sb = new StringBuilder();
            Iterator<String> it = mml.iterator();
            while (it.hasNext()) {
                sb.append(it.next());
                sb.append(",");
            }
        } catch (Throwable th) {
            throw th;
        }
        return sb.toString();
    }

    public static String mzz(com.bytedance.sdk.component.mo.qdl.mml.qdl qdlVar) {
        if (qdlVar == null || qdlVar.wd() == null || lnr()) {
            return null;
        }
        String strOptString = qdlVar.wd().optString("log_extra");
        if (!TextUtils.isEmpty(strOptString)) {
            try {
                return new JSONObject(strOptString).optString("req_id");
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public static void qdl() {
        if (mo != null) {
            return;
        }
        String[] strArr = {"first_view", "open_splash", "ad_landing_webview_init", "show_failed_topview", "adstyle_template_show", "splash_init_monitor_first", "download_video_succeed", "shake_skip", "receive", "video_over_auto", "render_time", "splash_ad", "preload_start", "mute", "covered", "download_image_failed", "splash_init_monitor_all", "preload_success_time", "download_video_start_sdk", "download_video_count", "not_showing_reason", "download_image_succeed", "load_video_success", "launch_covered", "download_video_prepare", "download_video_start", "boarding", "ad_wap_stat", "splash_pick", "preload_fail", "should_show", "adstyle_template_fill", "unmute", "preload_success", a.r.f36795l, "stop_showing_monitor", "download_video_no_download", "track_url", "download_creative_duration", "adstyle_template_render", "download_video_count_splash_sdk", "landing_preload_finish", "adstyle_template_load", "load_ad_duration", "client_false_show", "client_false", "download_video_failed", "data_invalid", "topview_boarding", "topview_start_download", "topview_show_confirmed", "splash_start_download", "topview_show_rejected", "splash_no_download", "redownload_video_count", "topview_other_show", "topview_no_download", "ad_selected", "invalid_model", "topview_deliver", "ad_no_selected", "topview_ad_download_retry_label", "request", qt.f26623n, "parse_finished", "front_performance", "ad_resp", "ad_resp_nodata", "preload_finish", "transit_show", "splash_switch", "block_splash_F2", "render_picture_time", "network_type", "play_start_error", "load_video_error", "render_picture_timeout", "py_loading_success", "download_status", "first_screen_load_finish", "landing_preload_failed", "data_received", "preload_result", "show_result", "reponse", "valid_time", "brand_satefy_context", "topview_ad_link_fail_label", "end_feed_request", "start_feed_request", "set_feed_data", "delayinstall_conflict_with_back_dialog", "clean_fetch_apk_head_failed", "cleanspace_download_after_quite_clean", "fps_too_low", "open_policy", "landing_perf_stats", "preload_topview", "show_effect_start", "dislike_monitor", "hour_show", "hour_skip", "triggered", "click_sound_switch", "enter_loft", "download_resume", "install_view_result", "contiguous_ad_event", "contiguous_ad_remove_event", "report_monitor", "open_landing_blank", "dynamic_ad", "report_load_failed", "ad_download_failed", "download_video_start_first_sdk", "splash_receive", "video_play", "clean_fetch_apk_head_switch_close", "label_external_permission", "pause_reserve_wifi_switch_status", "landing_download_dialog_show", "download_connect", "download_uncompleted", "pause_reserve_wifi_dialog_show", "download_io", "pause_reserve_wifi_confirm", "skvc_load_time", "segment_io", "click_no", "pause_reserve_wifi_cancel_on_wifi", "udp_stop", "mma_url", "error_save_sp", "download_notification_try_show", "ttd_pref_monitor", "item_above_the_fold_stay_time", "ttdownloader_unity", "bdad_query_log", "bdad_load_finish", "bdad_load", "bdad_load_fail", AdError.UNDEFINED_DOMAIN, "valid_stock", "show_filter", "splash_pk_result", "endcard_page_info", "page_on_create", "statistics_feed_docker", "show_search_card_word", "ad_new_video_render_start_label", "ad_new_video_play_start_label", "ad_new_video_ad_patch_data_set_null_label", "ad_new_video_ad_patch_play_label", "ad_new_video_ad_patch_render_label", "debug_touch_start", "try_second_request", "egg_unzip_success", "tap_2", "anti_0_result", "anti_2_result", "egg_unzip_no_start", "preload_no_start", "bind_impression_212202", "guide_auth_dialog_cancel", "show_im_entry", "sub_reco_impression_v2", "sync_request_log_mask", "no_send_sync_request", "load_timeout", "send_sync_request", "sync_request_not_show", "show_subv_tt_video_food", "track", "custom_event", "rd_landing_page_stat", "update_local_data", "showlimit", "upload_result", "debug_othershow", "debug_otherclick", "ad_show_time", "push_launch", "union_send_duplicate", "mnpl_js_finish_load", "mnpl_resource_finish_load", "mnpl_material_render_timeout", "mnpl_render_timing", "mnpl_vedio_interactive_timegap", "click_non_rectify_area", "start_impression", "end_impression", "picture_render_time", "splash_stop_show", "skip_post", "skan_show_start", "skan_show_end", "load_video_start", "rifle_ad_monitor", "download_video_redownload", "splash_video_quality", "splash_video_end", "splash_video_pause", "splash_video_failed", "adtrace_start_clear", "adtrace_clear_past_data", "adtrace_end_clear", "adtrace_write_success", "adtrace_write_failed", "adtrace_read_result", "adtrace_read_success", "adtrace_read_failed", "pick_model", "cache_model", "adtrace_reparse_file", "deeplink_failed_all", "ad_live_degenerate", "ad_live_miss", "live_play_fail", "sko_show_success", "sko_show_fail", "commerce_apps_open", "commerce_apps_jump", "pic_card_show", "live_ad_card_render_finish", "adtrace_select", "received_card_status", "live_ad_page_load_success", "mp_download_result", "download_video_cancel", "jump_count", "adtrace_try_show", "show_cart_entrance", "live_ad_page_load_fail", "click_interacted", "pop_up", "pop_up_cancel", "stream_loadtime", "mnpl_guide_comp_render", "thirdquartile", "customer_feed_pause", "customer_play_start", "customer_feed_break", "click_area_log", "customer_feed_continue", "customer_feed_play", "mnpl_resource_start_preload", "mnpl_resource_finish_preload", "customer_feed_over", "get_preload_ad", "web_inspect_status", "web_report_status", "preload_begin", "preload_end", "open_begin", "open_end", "pangle_live_sdk_monitor", "success", "rifle_load_state", "rifle_uri_load_state", "component_init", "component_release", "ad_lynx_download_sendAdLog", "dynamic2_render", "lynx_card_show", "pop_up_download", "live_shelf_commodity_show", "unity_fe_click", "enter_ads_explain", "adx_ads_switch", "personal_ads_switch", "qc_product_picture_cancel", "qc_product_picture_save", "qc_product_picture_press", "qc_product_detail_show", "qc_price_instruction_click", "qc_edit_sku_num_click", "service_description_page_duration", "enter_business_qualification_page ", "service_description_page_show", "order_words_fe", "qc_payment_mode_show", "qc_click_ali_pay", "qc_district_addr_click", "qc_auto_information_add", "qc_dial_consult_cancel_btn_click", "qc_dial_consult_show", "qc_maomadeng_click", "qc_maomadeng_show", "slide_product_big_picture", "qc_service_description_close", "appstore_manager_request", "preload_video_result", "preload_video_start", "adtrace_bind", "topview_ad_link_match_event", "skip_leisure_interact_render", "click_start_download", "ad_lynx_landing_page_exception", "lynx_page_res_download_monitor_event", "live_fail", "live_over", "render_live_picture_success", "render_live_picture_fail", "live_play_success", "live_play_close", "item_play_pver", "ad_gap_info", "item_play_over", "has_period_first_chance", "enter_live_auto", "mnpl_material_video_scene_show", "ad_rerank", "in_web_click", "post_request_failed", "destroy", "bidding_load", "bidding_receive", "in_web_scroll", "tobsdk_livesdk_live_show", "xigua_ad_rerank", "applink_unity", "top_ad_show", "top_button_show", "skip_button_show", "skip_click", "shake_show", "skip_result", "show_personal_compliance_button_click", "personal_compliance_click", "ad_click_result", "ad_preload_video", "popup_show", "topview_feed_down", "qr_scan", "qr_show", "topview_popup_show", "topview_feed_over", "topview_feed_show", "feed_down", "engine_ad_send", "permission_click", "policy_click", "download_start_click", "mini_playable_style_report", "load_detect", "aweme_show_info", "click_convert_anchor_detail_page", "click_anchor_gift_button", "show_anchor_gift_page", "click_anchor_gift_card", "show_anchor_gift_card", "anchor_convert_button", "show_anchor_page", "search_result_click", "sdk_session_launch", "not_use_app_link_sdk", "click_ios_check", "auto_open", "bind_click_area", "page_load", "show_finish", "next_fresh", "play_ready", "splash_pk_time", "unshow", "feed_show_failed", "othershow_cancel", "lu_cache", "realtime_splash_result", "channel_override_result", "internal_jump_live_status", "mnpl_video_play_backward", "splash_enter_foreground", "splash_enter_background", "button_light", "long_press", "webview_material_missing_key_error", "live_life_project_click_card", "mnpl_click_event", "show_anchor_convert_button", "bdar_log_info", "bdar_ad_request", "bdar_lynx_template_load_time", "bdar_lynx_fallback", "bdar_fetch_template_data", "bdar_lynx_render_time", "bdar_video_play_effective", "bdar_video_first_frame", "bdar_lynx_jsb_error", "invalidate_back_url_monitor_event", "lynx_page_plugin_exception_event", "live_custom_interaction", "pinch", "if_splash_card", "splash_card_show", "card_show_fail", "splash_card_click", "splash_card_close", "wind_icon_click", "excluded", "show_error", "toutiao_ad_receive", "show_ad", "toutiao_ad_excluded", "close_card", "lynx_status", "qpon_join", "apk_download_user", "comment_key_word_show", "v3_show_ad", "show_wish_button", "enterSection", "single_comment_show", "enter_product_detail", "xigua_ad_request", "qpon_apply", "splash_total_duration", "splash_render_duration", "download_template_duration", "homepage_hot", "homepage_follow", "homepage_fresh", "video_play_success", "general_search", "video_render_cost", "single_ad_render_cost", "unexpected_accurate_pause", "mnpl_interact_skip", "web_report_request_url", "web_report_init_status", "first_request", "video_ended", "mnpl_script_error", "open_wechat_failed_shake", "open_wechat_shacke", "open_wechat_success_shake", "options_popup", "close_pers_ads_type", "check_closed_type", "ad_guide_panel", "learn_ads", "learn_adx_ads", "learn_pers_ads", "resume_closed_type", "twist", "open_wechat_shake"};
        mo = new HashMap<>(446);
        for (int i2 = 0; i2 < 446; i2++) {
            mo.put(strArr[i2], 1);
        }
    }

    private static String rq(com.bytedance.sdk.component.mo.qdl.mml.qdl qdlVar) {
        if (qdlVar == null || qdlVar.wd() == null || !ud()) {
            return null;
        }
        JSONObject jSONObjectWd = qdlVar.wd();
        try {
            return new JSONObject(qdlVar.mml() == 1 ? jSONObjectWd.optString("event_extra") : jSONObjectWd.optString("ad_extra_data")).optString("sdk_session_id");
        } catch (JSONException e2) {
            e2.getMessage();
            return null;
        }
    }

    public static void to(com.bytedance.sdk.component.mo.qdl.mml.qdl qdlVar) {
        try {
            if (ud()) {
                mzz mzzVarJtx = jpc.wd().jtx();
                if (!TextUtils.isEmpty(qdlVar.lnr())) {
                    ud.qdl(mml.mml.tid(), 1);
                }
                if (mzzVarJtx == null || !mzzVarJtx.ud()) {
                    return;
                }
                if (qdlVar.mml() == 1) {
                    ud(qdlVar);
                    lnr(qdlVar);
                    qdlVar.lnr();
                    rq(qdlVar);
                    return;
                }
                if (qdlVar.mml() == 0) {
                    if (qdlVar.ud() != 3) {
                        if (tvp(qdlVar) != 0) {
                            qdl(qdlVar);
                        } else {
                            qdl(qdlVar);
                        }
                        jpc(qdlVar);
                        qdlVar.lnr();
                        rq(qdlVar);
                        return;
                    }
                    if (qdlVar.wd() != null) {
                        qdlVar.wd().optString("event");
                        jpc(qdlVar);
                        tvp(qdlVar);
                        qdlVar.lnr();
                        rq(qdlVar);
                    }
                }
            }
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    public static long tvp(com.bytedance.sdk.component.mo.qdl.mml.qdl qdlVar) {
        if (qdlVar == null || qdlVar.wd() == null || !ud()) {
            return 0L;
        }
        try {
            return new JSONObject(qdlVar.wd().optString("ad_extra_data")).optLong("sdk_event_valid_index");
        } catch (Exception e2) {
            e2.getMessage();
            return 0L;
        }
    }

    private static synchronized String ud(String str) {
        StringBuilder sb;
        try {
            LinkedList<String> linkedList = ud;
            if (linkedList.size() >= 10) {
                linkedList.removeFirst();
                linkedList.add(str);
            } else {
                linkedList.add(str);
            }
            sb = new StringBuilder();
            Iterator<String> it = linkedList.iterator();
            while (it.hasNext()) {
                sb.append(it.next());
                sb.append(",");
            }
        } catch (Throwable th) {
            throw th;
        }
        return sb.toString();
    }

    public static void wd(com.bytedance.sdk.component.mo.qdl.mml.qdl qdlVar) {
        try {
            if (jpc.wd().jtx().wd()) {
                mml.mml.qdl(System.currentTimeMillis() - qdlVar.jpc());
                qdlVar.ud(System.currentTimeMillis());
                if (qdlVar.mml() == 0 && jpc.wd().jtx() != null && jpc.wd().jtx().qdl()) {
                    String strQdl = qdl(qdlVar);
                    if (qdl(strQdl)) {
                        return;
                    }
                    JSONObject jSONObjectWd = qdlVar.wd();
                    String strOptString = qdlVar.wd().optString("ad_extra_data");
                    if (TextUtils.isEmpty(strOptString)) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("save_success_labels", ud(strQdl + "_" + tvp(qdlVar)));
                        jSONObjectWd.put("ad_extra_data", jSONObject.toString());
                        return;
                    }
                    JSONObject jSONObject2 = new JSONObject(strOptString);
                    if (TextUtils.isEmpty(jSONObject2.optString("save_success_labels"))) {
                        jSONObject2.put("save_success_labels", ud(strQdl + "_" + tvp(qdlVar)));
                    }
                    jSONObjectWd.put("ad_extra_data", jSONObject2.toString());
                }
            }
        } catch (Exception unused) {
        }
    }

    public static void mo(com.bytedance.sdk.component.mo.qdl.mml.qdl qdlVar) {
        try {
            if (qdlVar.mml() == 0 && jpc.wd().jtx() != null && jpc.wd().jtx().qdl()) {
                JSONObject jSONObjectWd = qdlVar.wd();
                String strQdl = qdl(qdlVar);
                if (qdl(strQdl)) {
                    return;
                }
                mzz(qdlVar);
                String strOptString = jSONObjectWd.optString("ad_extra_data");
                if (!TextUtils.isEmpty(strOptString)) {
                    JSONObject jSONObject = new JSONObject(strOptString);
                    if (TextUtils.isEmpty(jSONObject.optString("will_send_labels"))) {
                        jSONObject.put("will_send_labels", lnr(strQdl + "_" + tvp(qdlVar)));
                        jSONObject.put("send_success_valid_labels", mo());
                    }
                    jSONObjectWd.put("ad_extra_data", jSONObject.toString());
                    return;
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("will_send_labels", lnr(strQdl + "_" + tvp(qdlVar)));
                jSONObject2.put("send_success_valid_labels", mo());
                jSONObjectWd.put("ad_extra_data", jSONObject2.toString());
            }
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    public static synchronized int mml(com.bytedance.sdk.component.mo.qdl.mml.qdl qdlVar) {
        if (qdlVar != null) {
            if (qdlVar.wd() != null) {
                if (!ud()) {
                    return 0;
                }
                try {
                    return new JSONObject(qdlVar.wd().optString("ad_extra_data")).optInt("sdk_event_self_count");
                } catch (Exception unused) {
                    return 0;
                }
            }
        }
        return 0;
    }

    public static String qdl(com.bytedance.sdk.component.mo.qdl.mml.qdl qdlVar) {
        if (qdlVar == null || qdlVar.wd() == null || lnr()) {
            return null;
        }
        if (qdlVar.ud() == 3) {
            return qdlVar.wd().optString("event");
        }
        return qdlVar.wd().optString("label");
    }

    public static boolean mzz() {
        return ud() || mml();
    }

    public static int lnr(com.bytedance.sdk.component.mo.qdl.mml.qdl qdlVar) {
        if (qdlVar == null || qdlVar.wd() == null || !ud()) {
            return -1;
        }
        try {
            return new JSONObject(qdlVar.wd().optString("event_extra")).optInt("stats_index");
        } catch (JSONException unused) {
            return -1;
        }
    }

    public static String ud(com.bytedance.sdk.component.mo.qdl.mml.qdl qdlVar) {
        if (qdlVar == null || qdlVar.wd() == null || lnr()) {
            return null;
        }
        return qdlVar.wd().optString("type");
    }

    public static boolean qdl(String str) {
        HashMap<String, Integer> map = mo;
        if (map == null || str == null) {
            return false;
        }
        return map.containsKey(str);
    }

    public static boolean ud() {
        mzz mzzVarJtx = jpc.wd().jtx();
        return mzzVarJtx != null && mzzVarJtx.mo() == 0;
    }

    public static void qdl(List<com.bytedance.sdk.component.mo.qdl.mml.qdl> list, int i2) {
        try {
            if (jpc.wd().jtx().wd()) {
                for (com.bytedance.sdk.component.mo.qdl.mml.qdl qdlVar : list) {
                    if (qdlVar != null && qdlVar.tvp() != 0) {
                        long jCurrentTimeMillis = System.currentTimeMillis() - qdlVar.tvp();
                        com.bytedance.sdk.component.mo.qdl.ud.qdl.qdl qdlVar2 = mml.mml;
                        qdlVar2.wak().incrementAndGet();
                        qdlVar2.zlt().getAndAdd(jCurrentTimeMillis);
                        qdlVar.lnr(System.currentTimeMillis());
                    }
                    if (qdlVar != null) {
                        mo(qdlVar);
                    }
                }
                mml.mml.irn().getAndAdd(list.size());
            }
        } catch (Exception unused) {
        }
    }

    public static boolean lnr() {
        mzz mzzVarJtx = jpc.wd().jtx();
        return mzzVarJtx != null && mzzVarJtx.mo() == 2;
    }

    public static boolean mml() {
        mzz mzzVarJtx = jpc.wd().jtx();
        return mzzVarJtx != null && mzzVarJtx.mo() == 1;
    }

    public static void qdl(JSONObject jSONObject, com.bytedance.sdk.component.mo.qdl.mml.qdl.qdl qdlVar) {
        mzz mzzVarJtx = jpc.wd().jtx();
        if (mzzVarJtx != null && mzzVarJtx.ud() && mzz()) {
            jSONObject.optString("label");
            qdlVar.mzz();
        }
    }

    public static void qdl(List<com.bytedance.sdk.component.mo.qdl.mml.qdl> list, int i2, String str) {
        mzz mzzVarJtx = jpc.wd().jtx();
        if (mzzVarJtx == null || !mzzVarJtx.ud() || list == null || lnr()) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        boolean z2 = false;
        for (com.bytedance.sdk.component.mo.qdl.mml.qdl qdlVar : list) {
            if (qdlVar.mml() == 0) {
                JSONObject jSONObjectWd = qdlVar.wd();
                String strQdl = qdl(qdlVar);
                if (qdlVar.ud() == 3) {
                    if (jSONObjectWd != null) {
                        strQdl = jSONObjectWd.optString("event");
                    }
                    android.support.v4.media.a.A(sb, " [v3:", strQdl, "] ");
                } else {
                    long jJpc = jpc(qdlVar);
                    long jTvp = tvp(qdlVar);
                    int iMml = mml(qdlVar);
                    sb.append(" [");
                    sb.append(jJpc);
                    sb.append("_");
                    sb.append(strQdl);
                    if (jTvp != 0) {
                        sb.append("_");
                        sb.append(jTvp);
                    }
                    if (iMml == 0) {
                        sb.append("] ");
                    } else {
                        sb.append("_");
                        sb.append(iMml);
                        sb.append("] ");
                    }
                }
                z2 = true;
            } else if (qdlVar.mml() == 1) {
                String strUd = ud(qdlVar);
                int iLnr = lnr(qdlVar);
                sb.append(" [");
                sb.append(iLnr);
                sb.append("_");
                sb.append(strUd);
                sb.append("] ");
            }
        }
        if (z2) {
            qdl(i2);
            list.size();
        } else {
            qdl(i2);
            list.size();
        }
    }

    public static String qdl(int i2) {
        switch (i2) {
            case 1:
                return "flush once";
            case 2:
                return "flush memory db";
            case 3:
                return "flush memory";
            case 4:
                return "new event";
            case 5:
                return "server busy";
            case 6:
                return "empty message";
            case 7:
                return "net error";
            default:
                return "default";
        }
    }

    private static void qdl(com.bytedance.sdk.component.mo.qdl.mml.qdl qdlVar, String str, mzz mzzVar) {
        String strQdl = qdl(qdlVar);
        if (qdl(strQdl)) {
            return;
        }
        String strMzz = mzz(qdlVar);
        if (qdlVar.mml() == 0 && mzzVar.qdl()) {
            StringBuilder sbX = android.support.v4.media.a.x(strQdl, "_");
            sbX.append(tvp(qdlVar));
            sbX.append("_");
            sbX.append(strMzz);
            sbX.append("_");
            sbX.append(str);
            mml(sbX.toString());
        }
    }

    public static void qdl(boolean z2, int i2, com.bytedance.sdk.component.mo.qdl.mml.qdl qdlVar) {
        mzz mzzVarJtx = jpc.wd().jtx();
        if (lnr() || mzzVarJtx == null || !mzzVarJtx.ud()) {
            return;
        }
        qdl(i2);
        TextUtils.isEmpty(ud(qdlVar));
        TextUtils.isEmpty(qdl(qdlVar));
    }

    public static void qdl(int i2, List<com.bytedance.sdk.component.mo.qdl.mml.qdl> list, long j) {
        if (jpc.wd().jtx().wd()) {
            long jCurrentTimeMillis = System.currentTimeMillis() - j;
            if (i2 == 200) {
                com.bytedance.sdk.component.mo.qdl.ud.qdl.qdl qdlVar = mml.mml;
                qdlVar.en().getAndAdd(jCurrentTimeMillis);
                qdlVar.ijp().incrementAndGet();
                qdlVar.mlb().getAndAdd(list.size());
                qdlVar.ag().getAndAdd(list.size());
                return;
            }
            if (i2 == -1) {
                mml.mml.lte().getAndAdd(list.size());
            } else {
                mml.mml.yh().getAndAdd(list.size());
            }
            com.bytedance.sdk.component.mo.qdl.ud.qdl.qdl qdlVar2 = mml.mml;
            qdlVar2.nz().getAndAdd(jCurrentTimeMillis);
            qdlVar2.zy().incrementAndGet();
        }
    }

    public static void qdl(List<com.bytedance.sdk.component.mo.qdl.mml.qdl> list, String str) {
        try {
            mzz mzzVarJtx = jpc.wd().jtx();
            if (mzzVarJtx == null || !mzzVarJtx.wd() || list == null) {
                return;
            }
            for (com.bytedance.sdk.component.mo.qdl.mml.qdl qdlVar : list) {
                if (qdlVar != null) {
                    qdl(qdlVar, str, mzzVarJtx);
                }
            }
        } catch (Exception e2) {
            e2.getMessage();
        }
    }
}
