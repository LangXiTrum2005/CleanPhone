package com.bytedance.sdk.component.lc.Lxb.lk;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.lc.Lxb.JXs;
import com.bytedance.sdk.component.lc.Lxb.LD.ZU;
import com.bytedance.sdk.component.lc.Lxb.OY;
import com.google.android.gms.ads.AdError;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.newreward.player.view.hybrid.util.MRAIDCommunicatorUtil;
import com.umeng.analytics.pro.bc;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.J0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb {
    private static final LinkedList<String> Lxb = new LinkedList<>();
    private static final LinkedList<String> LD = new LinkedList<>();
    private static final LinkedList<String> lk = new LinkedList<>();
    private static final LinkedList<String> ZU = new LinkedList<>();
    private static final Map<String, Integer> JXs = new HashMap();
    private static HashMap<String, Integer> lc = null;
    private static String ebl = "upload_init";
    private static int OY = 0;
    private static int QAg = 0;

    private static String JVA(com.bytedance.sdk.component.lc.Lxb.ZU.Lxb lxb) {
        if (lxb == null || lxb.ebl() == null || !LD()) {
            return null;
        }
        JSONObject jSONObjectEbl = lxb.ebl();
        try {
            return new JSONObject(lxb.ZU() == 1 ? jSONObjectEbl.optString("event_extra") : jSONObjectEbl.optString("ad_extra_data")).optString("sdk_session_id");
        } catch (JSONException e) {
            e.getMessage();
            return null;
        }
    }

    public static String JXs(com.bytedance.sdk.component.lc.Lxb.ZU.Lxb lxb) {
        if (lxb == null || lxb.ebl() == null || lk()) {
            return null;
        }
        String strOptString = lxb.ebl().optString("log_extra");
        if (!TextUtils.isEmpty(strOptString)) {
            try {
                return new JSONObject(strOptString).optString("req_id");
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    private static synchronized String LD(String str) {
        StringBuilder sb;
        try {
            LinkedList<String> linkedList = LD;
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

    public static void Lxb() {
        if (lc != null) {
            return;
        }
        String[] strArr = {"first_view", "open_splash", "ad_landing_webview_init", "show_failed_topview", "adstyle_template_show", "splash_init_monitor_first", "download_video_succeed", "shake_skip", "receive", "video_over_auto", "render_time", "splash_ad", "preload_start", CampaignEx.JSON_NATIVE_VIDEO_MUTE, "covered", "download_image_failed", "splash_init_monitor_all", "preload_success_time", "download_video_start_sdk", "download_video_count", "not_showing_reason", "download_image_succeed", "load_video_success", "launch_covered", "download_video_prepare", "download_video_start", "boarding", "ad_wap_stat", "splash_pick", "preload_fail", "should_show", "adstyle_template_fill", CampaignEx.JSON_NATIVE_VIDEO_UNMUTE, "preload_success", "show_failed", "stop_showing_monitor", "download_video_no_download", "track_url", "download_creative_duration", "adstyle_template_render", "download_video_count_splash_sdk", "landing_preload_finish", "adstyle_template_load", "load_ad_duration", "client_false_show", "client_false", "download_video_failed", "data_invalid", "topview_boarding", "topview_start_download", "topview_show_confirmed", "splash_start_download", "topview_show_rejected", "splash_no_download", "redownload_video_count", "topview_other_show", "topview_no_download", "ad_selected", "invalid_model", "topview_deliver", "ad_no_selected", "topview_ad_download_retry_label", J0.REQUEST_KEY_EXTRA, "response", "parse_finished", "front_performance", "ad_resp", "ad_resp_nodata", "preload_finish", "transit_show", "splash_switch", "block_splash_F2", "render_picture_time", bc.T, "play_start_error", "load_video_error", "render_picture_timeout", "py_loading_success", "download_status", "first_screen_load_finish", "landing_preload_failed", "data_received", "preload_result", "show_result", "reponse", "valid_time", "brand_satefy_context", "topview_ad_link_fail_label", "end_feed_request", "start_feed_request", "set_feed_data", "delayinstall_conflict_with_back_dialog", "clean_fetch_apk_head_failed", "cleanspace_download_after_quite_clean", "fps_too_low", "open_policy", "landing_perf_stats", "preload_topview", "show_effect_start", "dislike_monitor", "hour_show", "hour_skip", "triggered", "click_sound_switch", "enter_loft", "download_resume", "install_view_result", "contiguous_ad_event", "contiguous_ad_remove_event", "report_monitor", "open_landing_blank", "dynamic_ad", "report_load_failed", "ad_download_failed", "download_video_start_first_sdk", "splash_receive", "video_play", "clean_fetch_apk_head_switch_close", "label_external_permission", "pause_reserve_wifi_switch_status", "landing_download_dialog_show", "download_connect", "download_uncompleted", "pause_reserve_wifi_dialog_show", "download_io", "pause_reserve_wifi_confirm", "skvc_load_time", "segment_io", "click_no", "pause_reserve_wifi_cancel_on_wifi", "udp_stop", "mma_url", "error_save_sp", "download_notification_try_show", "ttd_pref_monitor", "item_above_the_fold_stay_time", "ttdownloader_unity", "bdad_query_log", "bdad_load_finish", "bdad_load", "bdad_load_fail", AdError.UNDEFINED_DOMAIN, "valid_stock", "show_filter", "splash_pk_result", "endcard_page_info", "page_on_create", "statistics_feed_docker", "show_search_card_word", "ad_new_video_render_start_label", "ad_new_video_play_start_label", "ad_new_video_ad_patch_data_set_null_label", "ad_new_video_ad_patch_play_label", "ad_new_video_ad_patch_render_label", "debug_touch_start", "try_second_request", "egg_unzip_success", "tap_2", "anti_0_result", "anti_2_result", "egg_unzip_no_start", "preload_no_start", "bind_impression_212202", "guide_auth_dialog_cancel", "show_im_entry", "sub_reco_impression_v2", "sync_request_log_mask", "no_send_sync_request", "load_timeout", "send_sync_request", "sync_request_not_show", "show_subv_tt_video_food", "track", "custom_event", "rd_landing_page_stat", "update_local_data", "showlimit", "upload_result", "debug_othershow", "debug_otherclick", "ad_show_time", "push_launch", "union_send_duplicate", "mnpl_js_finish_load", "mnpl_resource_finish_load", "mnpl_material_render_timeout", "mnpl_render_timing", "mnpl_vedio_interactive_timegap", "click_non_rectify_area", "start_impression", "end_impression", "picture_render_time", "splash_stop_show", "skip_post", "skan_show_start", "skan_show_end", "load_video_start", "rifle_ad_monitor", "download_video_redownload", "splash_video_quality", "splash_video_end", "splash_video_pause", "splash_video_failed", "adtrace_start_clear", "adtrace_clear_past_data", "adtrace_end_clear", "adtrace_write_success", "adtrace_write_failed", "adtrace_read_result", "adtrace_read_success", "adtrace_read_failed", "pick_model", "cache_model", "adtrace_reparse_file", "deeplink_failed_all", "ad_live_degenerate", "ad_live_miss", "live_play_fail", "sko_show_success", "sko_show_fail", "commerce_apps_open", "commerce_apps_jump", "pic_card_show", "live_ad_card_render_finish", "adtrace_select", "received_card_status", "live_ad_page_load_success", "mp_download_result", "download_video_cancel", "jump_count", "adtrace_try_show", "show_cart_entrance", "live_ad_page_load_fail", "click_interacted", "pop_up", "pop_up_cancel", "stream_loadtime", "mnpl_guide_comp_render", "thirdquartile", "customer_feed_pause", "customer_play_start", "customer_feed_break", "click_area_log", "customer_feed_continue", "customer_feed_play", "mnpl_resource_start_preload", "mnpl_resource_finish_preload", "customer_feed_over", "get_preload_ad", "web_inspect_status", "web_report_status", "preload_begin", "preload_end", "open_begin", "open_end", "pangle_live_sdk_monitor", "success", "rifle_load_state", "rifle_uri_load_state", "component_init", "component_release", "ad_lynx_download_sendAdLog", "dynamic2_render", "lynx_card_show", "pop_up_download", "live_shelf_commodity_show", "unity_fe_click", "enter_ads_explain", "adx_ads_switch", "personal_ads_switch", "qc_product_picture_cancel", "qc_product_picture_save", "qc_product_picture_press", "qc_product_detail_show", "qc_price_instruction_click", "qc_edit_sku_num_click", "service_description_page_duration", "enter_business_qualification_page ", "service_description_page_show", "order_words_fe", "qc_payment_mode_show", "qc_click_ali_pay", "qc_district_addr_click", "qc_auto_information_add", "qc_dial_consult_cancel_btn_click", "qc_dial_consult_show", "qc_maomadeng_click", "qc_maomadeng_show", "slide_product_big_picture", "qc_service_description_close", "appstore_manager_request", "preload_video_result", "preload_video_start", "adtrace_bind", "topview_ad_link_match_event", "skip_leisure_interact_render", "click_start_download", "ad_lynx_landing_page_exception", "lynx_page_res_download_monitor_event", "live_fail", "live_over", "render_live_picture_success", "render_live_picture_fail", "live_play_success", "live_play_close", "item_play_pver", "ad_gap_info", "item_play_over", "has_period_first_chance", "enter_live_auto", "mnpl_material_video_scene_show", "ad_rerank", "in_web_click", "post_request_failed", "destroy", "bidding_load", "bidding_receive", "in_web_scroll", "tobsdk_livesdk_live_show", "xigua_ad_rerank", "applink_unity", "top_ad_show", "top_button_show", "skip_button_show", "skip_click", "shake_show", "skip_result", "show_personal_compliance_button_click", "personal_compliance_click", "ad_click_result", "ad_preload_video", "popup_show", "topview_feed_down", "qr_scan", "qr_show", "topview_popup_show", "topview_feed_over", "topview_feed_show", "feed_down", "engine_ad_send", "permission_click", "policy_click", "download_start_click", "mini_playable_style_report", "load_detect", "aweme_show_info", "click_convert_anchor_detail_page", "click_anchor_gift_button", "show_anchor_gift_page", "click_anchor_gift_card", "show_anchor_gift_card", "anchor_convert_button", "show_anchor_page", "search_result_click", "sdk_session_launch", "not_use_app_link_sdk", "click_ios_check", "auto_open", "bind_click_area", "page_load", "show_finish", "next_fresh", "play_ready", "splash_pk_time", "unshow", "feed_show_failed", "othershow_cancel", "lu_cache", "realtime_splash_result", "channel_override_result", "internal_jump_live_status", "mnpl_video_play_backward", "splash_enter_foreground", "splash_enter_background", "button_light", "long_press", "webview_material_missing_key_error", "live_life_project_click_card", "mnpl_click_event", "show_anchor_convert_button", "bdar_log_info", "bdar_ad_request", "bdar_lynx_template_load_time", "bdar_lynx_fallback", "bdar_fetch_template_data", "bdar_lynx_render_time", "bdar_video_play_effective", "bdar_video_first_frame", "bdar_lynx_jsb_error", "invalidate_back_url_monitor_event", "lynx_page_plugin_exception_event", "live_custom_interaction", "pinch", "if_splash_card", "splash_card_show", "card_show_fail", "splash_card_click", "splash_card_close", "wind_icon_click", "excluded", "show_error", "toutiao_ad_receive", "show_ad", "toutiao_ad_excluded", "close_card", "lynx_status", "qpon_join", "apk_download_user", "comment_key_word_show", "v3_show_ad", "show_wish_button", "enterSection", "single_comment_show", "enter_product_detail", "xigua_ad_request", "qpon_apply", "splash_total_duration", "splash_render_duration", "download_template_duration", "homepage_hot", "homepage_follow", "homepage_fresh", "video_play_success", "general_search", "video_render_cost", "single_ad_render_cost", "unexpected_accurate_pause", "mnpl_interact_skip", "web_report_request_url", "web_report_init_status", "first_request", "video_ended", "mnpl_script_error", "open_wechat_failed_shake", "open_wechat_shacke", "open_wechat_success_shake", "options_popup", "close_pers_ads_type", "check_closed_type", "ad_guide_panel", "learn_ads", "learn_adx_ads", "learn_pers_ads", "resume_closed_type", "twist", "open_wechat_shake"};
        lc = new HashMap<>(446);
        for (int i = 0; i < 446; i++) {
            lc.put(strArr[i], 1);
        }
    }

    public static long OY(com.bytedance.sdk.component.lc.Lxb.ZU.Lxb lxb) {
        if (lxb == null || lxb.ebl() == null || !LD()) {
            return 0L;
        }
        try {
            return new JSONObject(lxb.ebl().optString("ad_extra_data")).optLong("sdk_event_index");
        } catch (Exception e) {
            e.getMessage();
            return 0L;
        }
    }

    public static long QAg(com.bytedance.sdk.component.lc.Lxb.ZU.Lxb lxb) {
        if (lxb == null || lxb.ebl() == null || !LD()) {
            return 0L;
        }
        try {
            return new JSONObject(lxb.ebl().optString("ad_extra_data")).optLong("sdk_event_valid_index");
        } catch (Exception e) {
            e.getMessage();
            return 0L;
        }
    }

    private static synchronized void ZU(String str) {
        LinkedList<String> linkedList = ZU;
        if (linkedList.size() < 10) {
            linkedList.add(str);
        } else {
            linkedList.removeFirst();
            linkedList.add(str);
        }
    }

    public static void ebl(com.bytedance.sdk.component.lc.Lxb.ZU.Lxb lxb) {
        try {
            if (OY.ebl().VVE().ebl()) {
                ZU.ZU.Lxb(System.currentTimeMillis() - lxb.OY());
                lxb.LD(System.currentTimeMillis());
                if (lxb.ZU() == 0 && OY.ebl().VVE() != null && OY.ebl().VVE().Lxb()) {
                    String strLxb = Lxb(lxb);
                    if (Lxb(strLxb)) {
                        return;
                    }
                    JSONObject jSONObjectEbl = lxb.ebl();
                    String strOptString = lxb.ebl().optString("ad_extra_data");
                    if (TextUtils.isEmpty(strOptString)) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("save_success_labels", LD(strLxb + "_" + QAg(lxb)));
                        jSONObjectEbl.put("ad_extra_data", jSONObject.toString());
                        return;
                    }
                    JSONObject jSONObject2 = new JSONObject(strOptString);
                    if (TextUtils.isEmpty(jSONObject2.optString("save_success_labels"))) {
                        jSONObject2.put("save_success_labels", LD(strLxb + "_" + QAg(lxb)));
                    }
                    jSONObjectEbl.put("ad_extra_data", jSONObject2.toString());
                }
            }
        } catch (Exception unused) {
        }
    }

    private static synchronized String lc() {
        StringBuilder sb;
        try {
            sb = new StringBuilder();
            Iterator<String> it = ZU.iterator();
            while (it.hasNext()) {
                sb.append(it.next());
                sb.append(",");
            }
        } catch (Throwable th) {
            throw th;
        }
        return sb.toString();
    }

    private static synchronized String lk(String str) {
        StringBuilder sb;
        try {
            LinkedList<String> linkedList = lk;
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

    public static void nBu(com.bytedance.sdk.component.lc.Lxb.ZU.Lxb lxb) {
        try {
            if (LD()) {
                JXs jXsVVE = OY.ebl().VVE();
                if (!TextUtils.isEmpty(lxb.lk())) {
                    LD.Lxb(ZU.ZU.Nu(), 1);
                }
                if (jXsVVE == null || !jXsVVE.LD()) {
                    return;
                }
                if (lxb.ZU() == 1) {
                    LD(lxb);
                    lk(lxb);
                    lxb.lk();
                    JVA(lxb);
                    return;
                }
                if (lxb.ZU() == 0) {
                    if (lxb.LD() != 3) {
                        if (QAg(lxb) != 0) {
                            Lxb(lxb);
                        } else {
                            Lxb(lxb);
                        }
                        OY(lxb);
                        lxb.lk();
                        JVA(lxb);
                        return;
                    }
                    if (lxb.ebl() != null) {
                        lxb.ebl().optString(NotificationCompat.CATEGORY_EVENT);
                        OY(lxb);
                        QAg(lxb);
                        lxb.lk();
                        JVA(lxb);
                    }
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public static void lc(com.bytedance.sdk.component.lc.Lxb.ZU.Lxb lxb) {
        try {
            if (lxb.ZU() == 0 && OY.ebl().VVE() != null && OY.ebl().VVE().Lxb()) {
                JSONObject jSONObjectEbl = lxb.ebl();
                String strLxb = Lxb(lxb);
                if (Lxb(strLxb)) {
                    return;
                }
                JXs(lxb);
                String strOptString = jSONObjectEbl.optString("ad_extra_data");
                if (!TextUtils.isEmpty(strOptString)) {
                    JSONObject jSONObject = new JSONObject(strOptString);
                    if (TextUtils.isEmpty(jSONObject.optString("will_send_labels"))) {
                        jSONObject.put("will_send_labels", lk(strLxb + "_" + QAg(lxb)));
                        jSONObject.put("send_success_valid_labels", lc());
                    }
                    jSONObjectEbl.put("ad_extra_data", jSONObject.toString());
                    return;
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("will_send_labels", lk(strLxb + "_" + QAg(lxb)));
                jSONObject2.put("send_success_valid_labels", lc());
                jSONObjectEbl.put("ad_extra_data", jSONObject2.toString());
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public static String Lxb(com.bytedance.sdk.component.lc.Lxb.ZU.Lxb lxb) {
        if (lxb == null || lxb.ebl() == null || lk()) {
            return null;
        }
        if (lxb.LD() == 3) {
            return lxb.ebl().optString(NotificationCompat.CATEGORY_EVENT);
        }
        return lxb.ebl().optString("label");
    }

    public static synchronized int ZU(com.bytedance.sdk.component.lc.Lxb.ZU.Lxb lxb) {
        if (lxb != null) {
            if (lxb.ebl() != null) {
                if (!LD()) {
                    return 0;
                }
                try {
                    return new JSONObject(lxb.ebl().optString("ad_extra_data")).optInt("sdk_event_self_count");
                } catch (Exception unused) {
                    return 0;
                }
            }
        }
        return 0;
    }

    public static boolean JXs() {
        return LD() || ZU();
    }

    public static String LD(com.bytedance.sdk.component.lc.Lxb.ZU.Lxb lxb) {
        if (lxb == null || lxb.ebl() == null || lk()) {
            return null;
        }
        return lxb.ebl().optString("type");
    }

    public static int lk(com.bytedance.sdk.component.lc.Lxb.ZU.Lxb lxb) {
        if (lxb == null || lxb.ebl() == null || !LD()) {
            return -1;
        }
        try {
            return new JSONObject(lxb.ebl().optString("event_extra")).optInt("stats_index");
        } catch (JSONException unused) {
            return -1;
        }
    }

    public static boolean Lxb(String str) {
        HashMap<String, Integer> map = lc;
        if (map == null || str == null) {
            return false;
        }
        return map.containsKey(str);
    }

    public static boolean LD() {
        JXs jXsVVE = OY.ebl().VVE();
        return jXsVVE != null && jXsVVE.lc() == 0;
    }

    public static void Lxb(List<com.bytedance.sdk.component.lc.Lxb.ZU.Lxb> list, int i) {
        try {
            if (OY.ebl().VVE().ebl()) {
                for (com.bytedance.sdk.component.lc.Lxb.ZU.Lxb lxb : list) {
                    if (lxb != null && lxb.QAg() != 0) {
                        long jCurrentTimeMillis = System.currentTimeMillis() - lxb.QAg();
                        com.bytedance.sdk.component.lc.Lxb.LD.Lxb.Lxb lxb2 = ZU.ZU;
                        lxb2.Of().incrementAndGet();
                        lxb2.Sv().getAndAdd(jCurrentTimeMillis);
                        lxb.lk(System.currentTimeMillis());
                    }
                    if (lxb != null) {
                        lc(lxb);
                    }
                }
                ZU.ZU.JZE().getAndAdd(list.size());
            }
        } catch (Exception unused) {
        }
    }

    public static boolean lk() {
        JXs jXsVVE = OY.ebl().VVE();
        return jXsVVE != null && jXsVVE.lc() == 2;
    }

    public static boolean ZU() {
        JXs jXsVVE = OY.ebl().VVE();
        return jXsVVE != null && jXsVVE.lc() == 1;
    }

    public static void Lxb(JSONObject jSONObject, com.bytedance.sdk.component.lc.Lxb.ZU.Lxb.Lxb lxb) {
        JXs jXsVVE = OY.ebl().VVE();
        if (jXsVVE != null && jXsVVE.LD() && JXs()) {
            jSONObject.optString("label");
            lxb.JXs();
        }
    }

    public static void Lxb(List<com.bytedance.sdk.component.lc.Lxb.ZU.Lxb> list, int i, String str) {
        JXs jXsVVE = OY.ebl().VVE();
        if (jXsVVE == null || !jXsVVE.LD() || list == null || lk()) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        for (com.bytedance.sdk.component.lc.Lxb.ZU.Lxb lxb : list) {
            if (lxb.ZU() == 0) {
                JSONObject jSONObjectEbl = lxb.ebl();
                String strLxb = Lxb(lxb);
                if (lxb.LD() == 3) {
                    if (jSONObjectEbl != null) {
                        strLxb = jSONObjectEbl.optString(NotificationCompat.CATEGORY_EVENT);
                    }
                    sb.append(" [v3:");
                    sb.append(strLxb);
                    sb.append("] ");
                } else {
                    long jOY = OY(lxb);
                    long jQAg = QAg(lxb);
                    int iZU = ZU(lxb);
                    sb.append(" [");
                    sb.append(jOY);
                    sb.append("_");
                    sb.append(strLxb);
                    if (jQAg != 0) {
                        sb.append("_");
                        sb.append(jQAg);
                    }
                    if (iZU == 0) {
                        sb.append("] ");
                    } else {
                        sb.append("_");
                        sb.append(iZU);
                        sb.append("] ");
                    }
                }
                z = true;
            } else if (lxb.ZU() == 1) {
                String strLD = LD(lxb);
                int iLk = lk(lxb);
                sb.append(" [");
                sb.append(iLk);
                sb.append("_");
                sb.append(strLD);
                sb.append("] ");
            }
        }
        if (z) {
            Lxb(i);
            list.size();
        } else {
            Lxb(i);
            list.size();
        }
    }

    public static String Lxb(int i) {
        switch (i) {
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
                return MRAIDCommunicatorUtil.STATES_DEFAULT;
        }
    }

    private static void Lxb(com.bytedance.sdk.component.lc.Lxb.ZU.Lxb lxb, String str, JXs jXs) {
        String strLxb = Lxb(lxb);
        if (Lxb(strLxb)) {
            return;
        }
        String strJXs = JXs(lxb);
        if (lxb.ZU() == 0 && jXs.Lxb()) {
            StringBuilder sbQ = DM.q(strLxb, "_");
            sbQ.append(QAg(lxb));
            sbQ.append("_");
            sbQ.append(strJXs);
            sbQ.append("_");
            sbQ.append(str);
            ZU(sbQ.toString());
        }
    }

    public static void Lxb(boolean z, int i, com.bytedance.sdk.component.lc.Lxb.ZU.Lxb lxb) {
        JXs jXsVVE = OY.ebl().VVE();
        if (lk() || jXsVVE == null || !jXsVVE.LD()) {
            return;
        }
        Lxb(i);
        TextUtils.isEmpty(LD(lxb));
        TextUtils.isEmpty(Lxb(lxb));
    }

    public static void Lxb(int i, List<com.bytedance.sdk.component.lc.Lxb.ZU.Lxb> list, long j) {
        if (OY.ebl().VVE().ebl()) {
            long jCurrentTimeMillis = System.currentTimeMillis() - j;
            if (i == 200) {
                com.bytedance.sdk.component.lc.Lxb.LD.Lxb.Lxb lxb = ZU.ZU;
                lxb.jeq().getAndAdd(jCurrentTimeMillis);
                lxb.xr().incrementAndGet();
                lxb.wbY().getAndAdd(list.size());
                lxb.dR().getAndAdd(list.size());
                return;
            }
            if (i == -1) {
                ZU.ZU.FD().getAndAdd(list.size());
            } else {
                ZU.ZU.sRq().getAndAdd(list.size());
            }
            com.bytedance.sdk.component.lc.Lxb.LD.Lxb.Lxb lxb2 = ZU.ZU;
            lxb2.MGT().getAndAdd(jCurrentTimeMillis);
            lxb2.bG().incrementAndGet();
        }
    }

    public static void Lxb(List<com.bytedance.sdk.component.lc.Lxb.ZU.Lxb> list, String str) {
        try {
            JXs jXsVVE = OY.ebl().VVE();
            if (jXsVVE == null || !jXsVVE.ebl() || list == null) {
                return;
            }
            for (com.bytedance.sdk.component.lc.Lxb.ZU.Lxb lxb : list) {
                if (lxb != null) {
                    Lxb(lxb, str, jXsVVE);
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
