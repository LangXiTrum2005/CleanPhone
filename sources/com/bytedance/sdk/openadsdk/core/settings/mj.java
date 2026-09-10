package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;
import android.widget.Toast;
import com.applovin.sdk.AppLovinMediationProvider;
import com.bytedance.sdk.component.utils.ac;
import com.bytedance.sdk.component.utils.ihz;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.nr;
import com.bytedance.sdk.openadsdk.core.oh;
import com.bytedance.sdk.openadsdk.utils.dzy;
import com.google.android.gms.ads.AdSize;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.pgl.ssdk.ces.out.PglSSConfig;
import com.vungle.ads.internal.signals.SignalManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class mj extends qt {
    static final ArrayList<String> ka = new ArrayList<>(Arrays.asList("ja", "en", "ko", "zh", "th", "vi", "id", "ru", "ar", "fr", DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR, "it", "es", "hi", "pt", "zh-Hant", "ms", "pl", "tr"));
    private Set<String> fi;
    public boolean ik;

    public mj(qt.ri riVar) {
        super(riVar);
        this.fi = Collections.synchronizedSet(new HashSet());
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.qt
    public String ri() {
        try {
            String str = "tt_sdk_settings_sr.prop";
            if (nr.ri() == null || ihz.ri(nr.ri())) {
                return str;
            }
            return "tt_sdk_settings_sr_" + ihz.ik(nr.ri()) + ".prop";
        } catch (Throwable unused) {
            return "tt_sdk_settings_sr";
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.fi
    public void ri(JSONObject jSONObject) {
        int iOptInt;
        fi.ri riVarLr = lr();
        JSONObject jSONObjectDi = sf.lr().di();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("digest");
        this.ik = (jSONObjectOptJSONObject == null || jSONObjectDi == null || !jSONObjectOptJSONObject.toString().equals(jSONObjectDi.toString())) ? false : true;
        if (jSONObjectOptJSONObject != null) {
            riVarLr.ri("digest", jSONObjectOptJSONObject.toString());
        } else {
            riVarLr.ri("digest");
        }
        riVarLr.ri("data_time", jSONObject.optLong("data_time"));
        if (jSONObject.has("req_inter_min")) {
            long jOptLong = jSONObject.optLong("req_inter_min", 10L) * ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
            if (jOptLong < 0 || jOptLong > SignalManager.TWENTY_FOUR_HOURS_MILLIS) {
                jOptLong = TTAdConstant.AD_MAX_EVENT_TIME;
            }
            riVarLr.ri("req_inter_min", jOptLong);
        }
        if (jSONObject.has("lp_new_style")) {
            riVarLr.ri("landingpage_new_style", jSONObject.optInt("lp_new_style", Integer.MAX_VALUE));
        }
        if (jSONObject.has("blank_detect_rate")) {
            int iOptInt2 = jSONObject.optInt("blank_detect_rate", 30);
            if (iOptInt2 < 0 || iOptInt2 > 100) {
                iOptInt2 = 30;
            }
            riVarLr.ri("blank_detect_rate", iOptInt2);
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("feq_policy");
        if (jSONObjectOptJSONObject2 != null) {
            if (jSONObjectOptJSONObject2.has(IronSourceConstants.EVENTS_DURATION)) {
                riVarLr.ri(IronSourceConstants.EVENTS_DURATION, jSONObjectOptJSONObject2.optLong(IronSourceConstants.EVENTS_DURATION) * 1000);
            }
            if (jSONObjectOptJSONObject2.has(AppLovinMediationProvider.MAX)) {
                riVarLr.ri(AppLovinMediationProvider.MAX, jSONObjectOptJSONObject2.optInt(AppLovinMediationProvider.MAX));
            }
        }
        if (jSONObject.has("vbtt")) {
            riVarLr.ri("vbtt", jSONObject.optInt("vbtt", 5));
        }
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("abtest");
        if (jSONObjectOptJSONObject3 != null) {
            if (jSONObjectOptJSONObject3.has("version")) {
                riVarLr.ri("ab_test_version", jSONObjectOptJSONObject3.optString("version"));
            }
            if (jSONObjectOptJSONObject3.has("param")) {
                riVarLr.ri("ab_test_param", jSONObjectOptJSONObject3.optString("param"));
            }
        } else {
            sf.lr().mj();
        }
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("log_rate_conf");
        if (jSONObjectOptJSONObject4 != null && jSONObjectOptJSONObject4.has("global_rate")) {
            riVarLr.ri("global_rate", (float) jSONObjectOptJSONObject4.optDouble("global_rate", 1.0d));
        }
        if (jSONObject.has("pyload_h5")) {
            riVarLr.ri("pyload_h5", jSONObject.optString("pyload_h5"));
        }
        if (jSONObject.has("pure_pyload_h5")) {
            riVarLr.ri("playableLoadH5Url", jSONObject.optString("pure_pyload_h5"));
        }
        if (jSONObject.has("ads_url")) {
            riVarLr.ri("ads_url", jSONObject.optString("ads_url"));
        }
        if (jSONObject.has("settings_url")) {
            riVarLr.ri("settings_url", jSONObject.optString("settings_url"));
        }
        if (jSONObject.has("app_log_url")) {
            riVarLr.ri("app_log_url", jSONObject.optString("app_log_url"));
        }
        if (jSONObject.has(CampaignEx.JSON_KEY_PRIVACY_URL)) {
            riVarLr.ri("policy_url", jSONObject.optString(CampaignEx.JSON_KEY_PRIVACY_URL));
        }
        if (jSONObject.has("consent_url")) {
            riVarLr.ri("consent_url", jSONObject.optString("consent_url"));
        }
        if (jSONObject.has("ivrv_downward")) {
            riVarLr.ri("ivrv_downward", jSONObject.optInt("ivrv_downward", 0));
        }
        if (jSONObject.has("dc")) {
            riVarLr.ri("dc", jSONObject.optString("dc"));
        }
        sf.lr().ri(jSONObject, riVarLr);
        if (jSONObject.has("if_both_open")) {
            riVarLr.ri("if_both_open", jSONObject.optInt("if_both_open", 0));
        }
        if (jSONObject.has("support_tnc")) {
            riVarLr.ri("support_tnc", jSONObject.optInt("support_tnc", 1));
        }
        if (jSONObject.has("insert_js_config")) {
            riVarLr.ri("insert_js_config", jSONObject.optString("insert_js_config", ""));
        }
        if (jSONObject.has("max_tpl_cnts")) {
            riVarLr.ri("max_tpl_cnts", jSONObject.optInt("max_tpl_cnts", 100));
        }
        if (jSONObject.has("target_region")) {
            riVarLr.ri("target_region", jSONObject.optString("target_region", ""));
        }
        JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("app_common_config");
        if (jSONObjectOptJSONObject5 != null) {
            if (jSONObjectOptJSONObject5.has("force_language")) {
                String strOptString = jSONObjectOptJSONObject5.optString("force_language");
                if (!TextUtils.isEmpty(strOptString) && ka.contains(strOptString)) {
                    riVarLr.ri("force_language", strOptString);
                }
            }
            if (jSONObjectOptJSONObject5.has("fetch_tpl_timeout_ctrl")) {
                riVarLr.ri("fetch_tpl_timeout_ctrl", jSONObjectOptJSONObject5.optInt("fetch_tpl_timeout_ctrl", IronSourceError.ERROR_CAPPING_VALIDATION_FAILED));
            }
            if (jSONObjectOptJSONObject5.has("fetch_tpl_second")) {
                riVarLr.ri("fetch_tpl_second", jSONObjectOptJSONObject5.optInt("fetch_tpl_second", 0));
            }
            if (jSONObjectOptJSONObject5.has("support_gzip")) {
                riVarLr.ri("support_gzip", jSONObjectOptJSONObject5.optBoolean("support_gzip", false));
            }
            if (jSONObjectOptJSONObject5.has("aes_key")) {
                riVarLr.ri("aes_key", jSONObjectOptJSONObject5.optString("aes_key"));
            }
            if (jSONObjectOptJSONObject5.has("support_rtl")) {
                riVarLr.ri("support_rtl", jSONObjectOptJSONObject5.optBoolean("support_rtl", false));
            }
            if (jSONObjectOptJSONObject5.has("ad_revenue_enable")) {
                riVarLr.ri("ad_revenue_enable", jSONObjectOptJSONObject5.optBoolean("ad_revenue_enable", true));
            }
            if (jSONObjectOptJSONObject5.has("gecko_hosts")) {
                try {
                    this.fi.clear();
                    JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject5.optJSONArray("gecko_hosts");
                    if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() != 0) {
                        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                            this.fi.add(jSONArrayOptJSONArray.getString(i));
                        }
                    }
                    this.fi = ri(this.fi);
                    riVarLr.ri("gecko_hosts", jSONArrayOptJSONArray.toString());
                } catch (Throwable th) {
                    ac.ik("GeckoLog: settings json error ".concat(String.valueOf(th)), new Object[0]);
                }
            }
        }
        if (jSONObject.has("read_video_from_cache")) {
            riVarLr.ri("read_video_from_cache", jSONObject.optInt("read_video_from_cache", 1));
        }
        ik.ri(jSONObject.optJSONArray("ad_slot_conf_list"));
        JSONObject jSONObjectOptJSONObject6 = jSONObject.optJSONObject("privacy");
        if (jSONObjectOptJSONObject6 != null) {
            if (jSONObjectOptJSONObject6.has("ad_enable")) {
                riVarLr.ri("privacy_ad_enable", jSONObjectOptJSONObject6.optInt("ad_enable", Integer.MAX_VALUE));
            }
            if (jSONObjectOptJSONObject6.has("personalized_ad")) {
                riVarLr.ri("privacy_personalized_ad", jSONObjectOptJSONObject6.optInt("personalized_ad", Integer.MAX_VALUE));
            }
            if (jSONObjectOptJSONObject6.has("sladar_enable")) {
                riVarLr.ri("privacy_sladar_enable", jSONObjectOptJSONObject6.optInt("sladar_enable", Integer.MAX_VALUE));
            }
            if (jSONObjectOptJSONObject6.has("app_log_enable")) {
                riVarLr.ri("privacy_app_log_enable", jSONObjectOptJSONObject6.optInt("app_log_enable", Integer.MAX_VALUE));
            }
            if (jSONObjectOptJSONObject6.has("debug_unlock")) {
                riVarLr.ri("privacy_debug_unlock", jSONObjectOptJSONObject6.optInt("debug_unlock", Integer.MAX_VALUE));
            }
            if (jSONObjectOptJSONObject6.has(PglSSConfig.CUSTOMINFO_KEY_ALLOWED_FIELDS)) {
                String strOptString2 = jSONObjectOptJSONObject6.optString(PglSSConfig.CUSTOMINFO_KEY_ALLOWED_FIELDS, "");
                if (!TextUtils.isEmpty(strOptString2)) {
                    riVarLr.ri("privacy_fields_allowed", strOptString2);
                } else {
                    riVarLr.ri("privacy_fields_allowed");
                }
            }
            if (jSONObjectOptJSONObject6.has("app_reg")) {
                int iOptInt3 = jSONObjectOptJSONObject6.optInt("app_reg", -1);
                if (iOptInt3 == 0 && oh.ri().ka() == 1 && com.bytedance.sdk.openadsdk.wjv.fi.ri("app_register_alert_enable", false)) {
                    dzy.ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.settings.mj.1
                        @Override // java.lang.Runnable
                        public void run() {
                            Toast.makeText(nr.ri(), "Appid is not registered on pangle media platform", 1).show();
                        }
                    });
                }
                riVarLr.ri("privacy_app_reg", iOptInt3 == 1);
                com.bytedance.sdk.openadsdk.core.qt.lr.ri().ri(iOptInt3);
            }
        }
        if (jSONObject.has("video_cache_config")) {
            riVarLr.ri("video_cache_config", jSONObject.optString("video_cache_config"));
        }
        if (jSONObject.has("loaded_recall_time")) {
            int iOptInt4 = jSONObject.optInt("loaded_recall_time", 0);
            if (iOptInt4 != 0 && iOptInt4 != 1) {
                iOptInt4 = 0;
            }
            riVarLr.ri("loadedCallbackOpportunity", iOptInt4);
        }
        if (jSONObject.has("splash_video_load_strategy")) {
            int iOptInt5 = jSONObject.optInt("splash_video_load_strategy", 0);
            if (iOptInt5 < 0 || iOptInt5 > 3) {
                iOptInt5 = 0;
            }
            riVarLr.ri("splash_video_load_strategy", iOptInt5);
        }
        if (jSONObject.has("user_compliance_status")) {
            com.bytedance.sdk.openadsdk.core.qt.lr.ri().lr(jSONObject.optInt("user_compliance_status", -1));
        }
        if (jSONObject.has("user_compliance_status_reason")) {
            com.bytedance.sdk.openadsdk.core.qt.lr.ri().ri(jSONObject.optString("user_compliance_status_reason", ""));
        }
        if (jSONObject.has("allow_req_time")) {
            com.bytedance.sdk.openadsdk.core.qt.lr.ri().ri(jSONObject.optLong("allow_req_time", com.bytedance.sdk.openadsdk.core.qt.lr.ri.longValue()));
        }
        if (jSONObject.has("allow_blind_mode_request_ad")) {
            riVarLr.ri("allow_blind_mode_request_ad", jSONObject.optBoolean("allow_blind_mode_request_ad", false));
        }
        JSONObject jSONObjectOptJSONObject7 = jSONObject.optJSONObject("bus_con");
        if (jSONObjectOptJSONObject7 != null) {
            if (jSONObjectOptJSONObject7.has("bus_con_sec_type")) {
                riVarLr.ri("bus_con_sec_type", jSONObjectOptJSONObject7.optInt("bus_con_sec_type", Integer.MAX_VALUE));
            }
            if (jSONObjectOptJSONObject7.has("bus_con_adshow_check_enable")) {
                riVarLr.ri("bus_con_adshow_check_enable", jSONObjectOptJSONObject7.optBoolean("bus_con_adshow_check_enable", true));
            }
            if (jSONObjectOptJSONObject7.has("bus_con_token_thread_count")) {
                riVarLr.ri("bus_con_token_thread_count", jSONObjectOptJSONObject7.optInt("bus_con_token_thread_count", 4));
            }
            if (jSONObjectOptJSONObject7.has("bus_con_video_keep_screen_on")) {
                riVarLr.ri("bus_con_video_keep_screen_on", jSONObjectOptJSONObject7.optInt("bus_con_video_keep_screen_on", 1));
            }
            if (jSONObjectOptJSONObject7.has("bus_con_auto_click_delay")) {
                riVarLr.ri("bus_con_auto_click_delay", jSONObjectOptJSONObject7.optInt("bus_con_auto_click_delay", IronSourceError.ERROR_CAPPING_VALIDATION_FAILED));
            }
            if (jSONObjectOptJSONObject7.has("bus_con_express_host")) {
                riVarLr.ri("bus_con_express_host", jSONObjectOptJSONObject7.optString("bus_con_express_host", "https://lf-static.tiktokpangle-cdn-us.com/obj/ad-pattern-tx/"));
            }
            if (jSONObjectOptJSONObject7.has("bus_con_check_clz")) {
                riVarLr.ri("bus_con_check_clz", jSONObjectOptJSONObject7.optString("bus_con_check_clz", ""));
            }
            if (jSONObjectOptJSONObject7.has("bus_con_url_check")) {
                riVarLr.ri("bus_con_url_check", jSONObjectOptJSONObject7.optInt("bus_con_url_check", 1));
            }
            if (jSONObjectOptJSONObject7.has("bus_con_behavior_count")) {
                riVarLr.ri("bus_con_behavior_count", jSONObjectOptJSONObject7.optInt("bus_con_behavior_count", AdSize.MEDIUM_RECTANGLE_WIDTH));
            }
            String str = sf.ri;
            if (jSONObjectOptJSONObject7.has(str)) {
                riVarLr.ri(str, jSONObjectOptJSONObject7.optBoolean(str, false));
            }
            String str2 = sf.lr;
            if (jSONObjectOptJSONObject7.has(str2)) {
                riVarLr.ri(str2, jSONObjectOptJSONObject7.optInt(str2, 10000));
            }
            String str3 = sf.ik;
            if (jSONObjectOptJSONObject7.has(str3)) {
                riVarLr.ri(str3, (float) jSONObjectOptJSONObject7.optDouble(str3, 1.0d));
            }
            if (jSONObjectOptJSONObject7.has("bus_con_slide_num")) {
                int iOptInt6 = jSONObjectOptJSONObject7.optInt("bus_con_slide_num", 2);
                if (iOptInt6 <= 0) {
                    iOptInt6 = 2;
                }
                riVarLr.ri("bus_con_slide_num", iOptInt6);
            }
        }
        if (jSONObject.has("perf_con")) {
            try {
                JSONObject jSONObjectOptJSONObject8 = jSONObject.optJSONObject("perf_con");
                if (jSONObjectOptJSONObject8 != null) {
                    if (jSONObjectOptJSONObject8.has("perf_con_applog_send")) {
                        String strOptString3 = jSONObjectOptJSONObject8.optString("perf_con_applog_send");
                        if (!TextUtils.isEmpty(strOptString3)) {
                            riVarLr.ri("perf_con_applog_send", strOptString3);
                        }
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_apm_native")) {
                        riVarLr.ri("perf_con_apm_native", jSONObjectOptJSONObject8.optInt("perf_con_apm_native"));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_webview_preload_cache")) {
                        riVarLr.ri("perf_con_webview_preload_cache", jSONObjectOptJSONObject8.optInt("perf_con_webview_preload_cache"));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_webview_preload_cache_v3")) {
                        riVarLr.ri("perf_con_webview_preload_cache_v3", jSONObjectOptJSONObject8.optInt("perf_con_webview_preload_cache_v3"));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_webview_cache_count")) {
                        riVarLr.ri("perf_con_webview_cache_count", jSONObjectOptJSONObject8.optInt("perf_con_webview_cache_count", 0));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_webview_cache_count_v3")) {
                        riVarLr.ri("perf_con_webview_cache_count_v3", jSONObjectOptJSONObject8.optInt("perf_con_webview_cache_count_v3", 0));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_thread_stack_size") && (iOptInt = jSONObjectOptJSONObject8.optInt("perf_con_thread_stack_size")) >= -524288 && iOptInt <= 0) {
                        riVarLr.ri("perf_con_thread_stack_size", iOptInt);
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_thread_pool_config")) {
                        String strOptString4 = jSONObjectOptJSONObject8.optString("perf_con_thread_pool_config");
                        if (!TextUtils.isEmpty(strOptString4)) {
                            riVarLr.ri("perf_con_thread_pool_config", strOptString4);
                        }
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_is_new_net_thread")) {
                        riVarLr.ri("perf_con_is_new_net_thread", jSONObjectOptJSONObject8.optInt("perf_con_is_new_net_thread", 0));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_adlog_expire_time")) {
                        riVarLr.ri("perf_con_adlog_expire_time", jSONObjectOptJSONObject8.optLong("perf_con_adlog_expire_time"));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_adlog_turn_off_retry_ad")) {
                        riVarLr.ri("perf_con_adlog_turn_off_retry_ad", jSONObjectOptJSONObject8.optLong("perf_con_adlog_turn_off_retry_ad"));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_adlog_turn_off_retry_stats")) {
                        riVarLr.ri("perf_con_adlog_turn_off_retry_stats", jSONObjectOptJSONObject8.optLong("perf_con_adlog_turn_off_retry_stats"));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_applog_rate")) {
                        riVarLr.ri("perf_con_applog_rate", jSONObjectOptJSONObject8.optString("perf_con_applog_rate"));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_track_url_strategy")) {
                        riVarLr.ri("perf_con_track_url_strategy", jSONObjectOptJSONObject8.optString("perf_con_track_url_strategy"));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_drawable_code")) {
                        riVarLr.ri("perf_con_drawable_code", jSONObjectOptJSONObject8.optInt("perf_con_drawable_code", 0));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_close_button_delay_check_time")) {
                        riVarLr.ri("perf_con_close_button_delay_check_time", jSONObjectOptJSONObject8.optInt("perf_con_close_button_delay_check_time", -1));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_drop2rt_skip_label_list")) {
                        riVarLr.ri("perf_con_drop2rt_skip_label_list", jSONObjectOptJSONObject8.optString("perf_con_drop2rt_skip_label_list"));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_sync_gaid")) {
                        riVarLr.ri("perf_con_sync_gaid", jSONObjectOptJSONObject8.optInt("perf_con_sync_gaid"));
                    }
                }
            } catch (Throwable th2) {
                ac.ik("SettingsDefaultRepository", th2.getMessage());
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("app_common_config", jSONObjectOptJSONObject5);
            jSONObject2.put("perf_con", jSONObject.optJSONObject("perf_con"));
            jSONObject2.put("bus_con", jSONObject.optJSONObject("bus_con"));
        } catch (JSONException e) {
            ac.ik("SettingsDefaultRepository", "coreSettingJson", e.getMessage());
        }
        riVarLr.ri("core_settings", jSONObject2.toString());
        if (jSONObject.has("dual_event_url")) {
            riVarLr.ri("dual_event_url", jSONObject.optString("dual_event_url"));
        }
        if (jSONObject.has("token_enable")) {
            riVarLr.ri("token_enable", jSONObject.optInt("token_enable"));
        }
        if (jSONObject.has("token_adx_ids")) {
            String strOptString5 = jSONObject.optString("token_adx_ids", "");
            if (!TextUtils.isEmpty(strOptString5)) {
                riVarLr.ri("token_adx_ids", strOptString5);
            } else {
                riVarLr.ri("token_adx_ids");
            }
        }
        if (jSONObject.has("ads_url_backup")) {
            String strOptString6 = jSONObject.optString("ads_url_backup", "");
            if (!TextUtils.isEmpty(strOptString6)) {
                riVarLr.ri("ads_url_backup", strOptString6);
            } else {
                riVarLr.ri("ads_url_backup");
            }
        }
        riVarLr.ri();
        sf.lr().ig();
        fi();
    }

    public static Set<String> ri(Set<String> set) {
        try {
            if (set == null) {
                return new HashSet();
            }
            HashSet hashSet = new HashSet();
            for (String str : set) {
                if (!TextUtils.isEmpty(str)) {
                    hashSet.add(str);
                }
            }
            return hashSet;
        } catch (Throwable unused) {
            return new HashSet();
        }
    }
}
