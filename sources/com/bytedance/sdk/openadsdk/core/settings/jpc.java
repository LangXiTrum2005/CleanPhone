package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;
import android.widget.Toast;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.kdv;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.utils.fco;
import com.bytedance.sdk.openadsdk.utils.xmv;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.pgl.ssdk.ces.out.PglSSConfig;
import com.smartdigimkt.d2.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class jpc extends to {
    static final ArrayList<String> mml = new ArrayList<>(Arrays.asList(a.T, a.Z, a.f34402V, a.S, "th", "vi", "id", a.f34403Y, a.X, a.W, "de", "it", "es", "hi", "pt", "zh-Hant", "ms", "pl", "tr"));
    public boolean lnr;
    private Set<String> mzz;

    public jpc(to.qdl qdlVar) {
        super("tt_sdk_settings_sr.prop", qdlVar);
        this.mzz = Collections.synchronizedSet(new HashSet());
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.mzz
    public void qdl(JSONObject jSONObject) throws Throwable {
        int iOptInt;
        mzz.qdl qdlVarQdl = qdl();
        JSONObject jSONObjectWd = rq.lnr().wd();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("digest");
        this.lnr = (jSONObjectOptJSONObject == null || jSONObjectWd == null || !jSONObjectOptJSONObject.toString().equals(jSONObjectWd.toString())) ? false : true;
        if (jSONObjectOptJSONObject != null) {
            qdlVarQdl.qdl("digest", jSONObjectOptJSONObject.toString());
        } else {
            qdlVarQdl.qdl("digest");
        }
        qdlVarQdl.qdl("data_time", jSONObject.optLong("data_time"));
        if (jSONObject.has("req_inter_min")) {
            long jOptLong = jSONObject.optLong("req_inter_min", 10L) * ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
            if (jOptLong < 0 || jOptLong > 86400000) {
                jOptLong = TTAdConstant.AD_MAX_EVENT_TIME;
            }
            qdlVarQdl.qdl("req_inter_min", jOptLong);
        }
        if (jSONObject.has("lp_new_style")) {
            qdlVarQdl.qdl("landingpage_new_style", jSONObject.optInt("lp_new_style", Integer.MAX_VALUE));
        }
        if (jSONObject.has("blank_detect_rate")) {
            int iOptInt2 = jSONObject.optInt("blank_detect_rate", 30);
            if (iOptInt2 < 0 || iOptInt2 > 100) {
                iOptInt2 = 30;
            }
            qdlVarQdl.qdl("blank_detect_rate", iOptInt2);
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("feq_policy");
        if (jSONObjectOptJSONObject2 != null) {
            if (jSONObjectOptJSONObject2.has("duration")) {
                qdlVarQdl.qdl("duration", jSONObjectOptJSONObject2.optLong("duration") * 1000);
            }
            if (jSONObjectOptJSONObject2.has("max")) {
                qdlVarQdl.qdl("max", jSONObjectOptJSONObject2.optInt("max"));
            }
        }
        if (jSONObject.has("vbtt")) {
            qdlVarQdl.qdl("vbtt", jSONObject.optInt("vbtt", 5));
        }
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("abtest");
        if (jSONObjectOptJSONObject3 != null) {
            if (jSONObjectOptJSONObject3.has("version")) {
                qdlVarQdl.qdl("ab_test_version", jSONObjectOptJSONObject3.optString("version"));
            }
            if (jSONObjectOptJSONObject3.has("param")) {
                qdlVarQdl.qdl("ab_test_param", jSONObjectOptJSONObject3.optString("param"));
            }
        } else {
            rq.lnr().tvp();
        }
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("log_rate_conf");
        if (jSONObjectOptJSONObject4 != null && jSONObjectOptJSONObject4.has("global_rate")) {
            qdlVarQdl.qdl("global_rate", (float) jSONObjectOptJSONObject4.optDouble("global_rate", 1.0d));
        }
        if (jSONObject.has("pyload_h5")) {
            qdlVarQdl.qdl("pyload_h5", jSONObject.optString("pyload_h5"));
        }
        if (jSONObject.has("pure_pyload_h5")) {
            qdlVarQdl.qdl("playableLoadH5Url", jSONObject.optString("pure_pyload_h5"));
        }
        if (jSONObject.has("ads_url")) {
            qdlVarQdl.qdl("ads_url", jSONObject.optString("ads_url"));
        }
        if (jSONObject.has("settings_url")) {
            qdlVarQdl.qdl("settings_url", jSONObject.optString("settings_url"));
        }
        if (jSONObject.has("app_log_url")) {
            qdlVarQdl.qdl("app_log_url", jSONObject.optString("app_log_url"));
        }
        if (jSONObject.has("privacy_url")) {
            qdlVarQdl.qdl("policy_url", jSONObject.optString("privacy_url"));
        }
        if (jSONObject.has("consent_url")) {
            qdlVarQdl.qdl("consent_url", jSONObject.optString("consent_url"));
        }
        if (jSONObject.has("ivrv_downward")) {
            qdlVarQdl.qdl("ivrv_downward", jSONObject.optInt("ivrv_downward", 0));
        }
        if (jSONObject.has("dc")) {
            qdlVarQdl.qdl("dc", jSONObject.optString("dc"));
        }
        rq.lnr().qdl(jSONObject, qdlVarQdl);
        rq.lnr().ud(jSONObject, qdlVarQdl);
        if (jSONObject.has("if_both_open")) {
            qdlVarQdl.qdl("if_both_open", jSONObject.optInt("if_both_open", 0));
        }
        if (jSONObject.has("support_tnc")) {
            qdlVarQdl.qdl("support_tnc", jSONObject.optInt("support_tnc", 1));
        }
        if (jSONObject.has("insert_js_config")) {
            qdlVarQdl.qdl("insert_js_config", jSONObject.optString("insert_js_config", ""));
        }
        if (jSONObject.has("max_tpl_cnts")) {
            qdlVarQdl.qdl("max_tpl_cnts", jSONObject.optInt("max_tpl_cnts", 100));
        }
        if (jSONObject.has("target_region")) {
            qdlVarQdl.qdl("target_region", jSONObject.optString("target_region", ""));
        }
        JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("app_common_config");
        if (jSONObjectOptJSONObject5 != null) {
            if (jSONObjectOptJSONObject5.has("force_language")) {
                String strOptString = jSONObjectOptJSONObject5.optString("force_language");
                if (!TextUtils.isEmpty(strOptString) && mml.contains(strOptString)) {
                    qdlVarQdl.qdl("force_language", strOptString);
                }
            }
            if (jSONObjectOptJSONObject5.has("fetch_tpl_timeout_ctrl")) {
                qdlVarQdl.qdl("fetch_tpl_timeout_ctrl", jSONObjectOptJSONObject5.optInt("fetch_tpl_timeout_ctrl", 3000));
            }
            if (jSONObjectOptJSONObject5.has("fetch_tpl_second")) {
                qdlVarQdl.qdl("fetch_tpl_second", jSONObjectOptJSONObject5.optInt("fetch_tpl_second", 0));
            }
            if (jSONObjectOptJSONObject5.has("support_gzip")) {
                qdlVarQdl.qdl("support_gzip", jSONObjectOptJSONObject5.optBoolean("support_gzip", false));
            }
            if (jSONObjectOptJSONObject5.has("aes_key")) {
                qdlVarQdl.qdl("aes_key", jSONObjectOptJSONObject5.optString("aes_key"));
            }
            if (jSONObjectOptJSONObject5.has("support_rtl")) {
                qdlVarQdl.qdl("support_rtl", jSONObjectOptJSONObject5.optBoolean("support_rtl", false));
            }
            if (jSONObjectOptJSONObject5.has("ad_revenue_enable")) {
                qdlVarQdl.qdl("ad_revenue_enable", jSONObjectOptJSONObject5.optBoolean("ad_revenue_enable", true));
            }
            if (jSONObjectOptJSONObject5.has("gecko_hosts")) {
                try {
                    this.mzz.clear();
                    JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject5.optJSONArray("gecko_hosts");
                    if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() != 0) {
                        for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                            this.mzz.add(jSONArrayOptJSONArray.getString(i2));
                        }
                    }
                    this.mzz = qdl(this.mzz);
                    qdlVarQdl.qdl("gecko_hosts", jSONArrayOptJSONArray.toString());
                } catch (Throwable th) {
                    aaj.lnr("GeckoLog: settings json error ".concat(String.valueOf(th)), new Object[0]);
                }
            }
        }
        if (jSONObject.has("read_video_from_cache")) {
            qdlVarQdl.qdl("read_video_from_cache", jSONObject.optInt("read_video_from_cache", 1));
        }
        lnr.qdl(jSONObject.optJSONArray("ad_slot_conf_list"));
        JSONObject jSONObjectOptJSONObject6 = jSONObject.optJSONObject("privacy");
        if (jSONObjectOptJSONObject6 != null) {
            if (jSONObjectOptJSONObject6.has("ad_enable")) {
                qdlVarQdl.qdl("privacy_ad_enable", jSONObjectOptJSONObject6.optInt("ad_enable", Integer.MAX_VALUE));
            }
            if (jSONObjectOptJSONObject6.has("personalized_ad")) {
                qdlVarQdl.qdl("privacy_personalized_ad", jSONObjectOptJSONObject6.optInt("personalized_ad", Integer.MAX_VALUE));
            }
            if (jSONObjectOptJSONObject6.has("sladar_enable")) {
                qdlVarQdl.qdl("privacy_sladar_enable", jSONObjectOptJSONObject6.optInt("sladar_enable", Integer.MAX_VALUE));
            }
            if (jSONObjectOptJSONObject6.has("app_log_enable")) {
                qdlVarQdl.qdl("privacy_app_log_enable", jSONObjectOptJSONObject6.optInt("app_log_enable", Integer.MAX_VALUE));
            }
            if (jSONObjectOptJSONObject6.has("debug_unlock")) {
                qdlVarQdl.qdl("privacy_debug_unlock", jSONObjectOptJSONObject6.optInt("debug_unlock", Integer.MAX_VALUE));
            }
            if (jSONObjectOptJSONObject6.has(PglSSConfig.CUSTOMINFO_KEY_ALLOWED_FIELDS)) {
                String strOptString2 = jSONObjectOptJSONObject6.optString(PglSSConfig.CUSTOMINFO_KEY_ALLOWED_FIELDS, "");
                if (TextUtils.isEmpty(strOptString2)) {
                    qdlVarQdl.qdl("privacy_fields_allowed");
                } else {
                    qdlVarQdl.qdl("privacy_fields_allowed", strOptString2);
                }
            }
            if (jSONObjectOptJSONObject6.has("app_reg")) {
                int iOptInt3 = jSONObjectOptJSONObject6.optInt("app_reg", 1);
                if (iOptInt3 == 0 && kdv.qdl().mml() == 1) {
                    fco.qdl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.settings.jpc.1
                        @Override // java.lang.Runnable
                        public void run() {
                            Toast.makeText(yt.qdl(), "Appid is not registered on pangle media platform", 1).show();
                        }
                    });
                }
                qdlVarQdl.qdl("privacy_app_reg", iOptInt3 != 0);
            }
        }
        if (jSONObject.has("video_cache_config")) {
            qdlVarQdl.qdl("video_cache_config", jSONObject.optString("video_cache_config"));
        }
        if (jSONObject.has("loaded_recall_time")) {
            int iOptInt4 = jSONObject.optInt("loaded_recall_time", 0);
            if (iOptInt4 != 0 && iOptInt4 != 1) {
                iOptInt4 = 0;
            }
            qdlVarQdl.qdl("loadedCallbackOpportunity", iOptInt4);
        }
        if (jSONObject.has("splash_video_load_strategy")) {
            int iOptInt5 = jSONObject.optInt("splash_video_load_strategy", 0);
            if (iOptInt5 < 0 || iOptInt5 > 3) {
                iOptInt5 = 0;
            }
            qdlVarQdl.qdl("splash_video_load_strategy", iOptInt5);
        }
        if (jSONObject.has("allow_blind_mode_request_ad")) {
            qdlVarQdl.qdl("allow_blind_mode_request_ad", jSONObject.optBoolean("allow_blind_mode_request_ad", false));
        }
        JSONObject jSONObjectOptJSONObject7 = jSONObject.optJSONObject("bus_con");
        if (jSONObjectOptJSONObject7 != null) {
            if (jSONObjectOptJSONObject7.has("bus_con_send_log_type")) {
                qdlVarQdl.qdl("bus_con_send_log_type", jSONObjectOptJSONObject7.optInt("bus_con_send_log_type", 1));
            }
            if (jSONObjectOptJSONObject7.has("bus_con_sec_type")) {
                qdlVarQdl.qdl("bus_con_sec_type", jSONObjectOptJSONObject7.optInt("bus_con_sec_type", Integer.MAX_VALUE));
            }
            if (jSONObjectOptJSONObject7.has("bus_con_dislike_report_raw")) {
                qdlVarQdl.qdl("bus_con_dislike_report_raw", jSONObjectOptJSONObject7.optBoolean("bus_con_dislike_report_raw", false));
            }
            if (jSONObjectOptJSONObject7.has("bus_con_adshow_check_enable")) {
                qdlVarQdl.qdl("bus_con_adshow_check_enable", jSONObjectOptJSONObject7.optBoolean("bus_con_adshow_check_enable", true));
            }
            if (jSONObjectOptJSONObject7.has("bus_con_tnc_interval")) {
                qdlVarQdl.qdl("bus_con_tnc_interval", jSONObjectOptJSONObject7.optLong("bus_con_tnc_interval", TTAdConstant.AD_MAX_EVENT_TIME));
            }
            if (jSONObjectOptJSONObject7.has("bus_con_token_thread_count")) {
                qdlVarQdl.qdl("bus_con_token_thread_count", jSONObjectOptJSONObject7.optInt("bus_con_token_thread_count", 4));
            }
            if (jSONObjectOptJSONObject7.has("bus_con_video_keep_screen_on")) {
                qdlVarQdl.qdl("bus_con_video_keep_screen_on", jSONObjectOptJSONObject7.optInt("bus_con_video_keep_screen_on", 1));
            }
            if (jSONObjectOptJSONObject7.has("bus_con_auto_click_delay")) {
                qdlVarQdl.qdl("bus_con_auto_click_delay", jSONObjectOptJSONObject7.optInt("bus_con_auto_click_delay", 3000));
            }
            if (jSONObjectOptJSONObject7.has("bus_con_express_host")) {
                qdlVarQdl.qdl("bus_con_express_host", jSONObjectOptJSONObject7.optString("bus_con_express_host", "https://lf-static.tiktokpangle-cdn-us.com/obj/ad-pattern-tx/"));
            }
            if (jSONObjectOptJSONObject7.has("bus_con_check_clz")) {
                qdlVarQdl.qdl("bus_con_check_clz", jSONObjectOptJSONObject7.optString("bus_con_check_clz", ""));
            }
            if (jSONObjectOptJSONObject7.has("bus_con_url_check")) {
                qdlVarQdl.qdl("bus_con_url_check", jSONObjectOptJSONObject7.optInt("bus_con_url_check", 1));
            }
            if (jSONObjectOptJSONObject7.has("bus_con_behavior_count")) {
                qdlVarQdl.qdl("bus_con_behavior_count", jSONObjectOptJSONObject7.optInt("bus_con_behavior_count", 300));
            }
            String str = rq.qdl;
            if (jSONObjectOptJSONObject7.has(str)) {
                qdlVarQdl.qdl(str, jSONObjectOptJSONObject7.optBoolean(str, false));
            }
            String str2 = rq.ud;
            if (jSONObjectOptJSONObject7.has(str2)) {
                qdlVarQdl.qdl(str2, jSONObjectOptJSONObject7.optInt(str2, 10000));
            }
            String str3 = rq.lnr;
            if (jSONObjectOptJSONObject7.has(str3)) {
                qdlVarQdl.qdl(str3, (float) jSONObjectOptJSONObject7.optDouble(str3, 1.0d));
            }
        }
        if (jSONObject.has("perf_con")) {
            try {
                JSONObject jSONObjectOptJSONObject8 = jSONObject.optJSONObject("perf_con");
                if (jSONObjectOptJSONObject8 != null) {
                    if (jSONObjectOptJSONObject8.has("perf_con_stats_rate")) {
                        String strOptString3 = jSONObjectOptJSONObject8.optString("perf_con_stats_rate");
                        if (!TextUtils.isEmpty(strOptString3)) {
                            qdlVarQdl.qdl("perf_con_stats_rate", strOptString3);
                        }
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_applog_send")) {
                        String strOptString4 = jSONObjectOptJSONObject8.optString("perf_con_applog_send");
                        if (!TextUtils.isEmpty(strOptString4)) {
                            qdlVarQdl.qdl("perf_con_applog_send", strOptString4);
                        }
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_apm_native")) {
                        qdlVarQdl.qdl("perf_con_apm_native", jSONObjectOptJSONObject8.optInt("perf_con_apm_native"));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_webview_preload_cache")) {
                        qdlVarQdl.qdl("perf_con_webview_preload_cache", jSONObjectOptJSONObject8.optInt("perf_con_webview_preload_cache"));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_webview_preload_cache_v3")) {
                        qdlVarQdl.qdl("perf_con_webview_preload_cache_v3", jSONObjectOptJSONObject8.optInt("perf_con_webview_preload_cache_v3"));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_webview_cache_count")) {
                        qdlVarQdl.qdl("perf_con_webview_cache_count", jSONObjectOptJSONObject8.optInt("perf_con_webview_cache_count", 0));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_webview_cache_count_v3")) {
                        qdlVarQdl.qdl("perf_con_webview_cache_count_v3", jSONObjectOptJSONObject8.optInt("perf_con_webview_cache_count_v3", 0));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_thread_stack_size") && (iOptInt = jSONObjectOptJSONObject8.optInt("perf_con_thread_stack_size")) >= -524288 && iOptInt <= 0) {
                        qdlVarQdl.qdl("perf_con_thread_stack_size", iOptInt);
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_use_new_thread_pool")) {
                        qdlVarQdl.qdl("perf_con_use_new_thread_pool", jSONObjectOptJSONObject8.optInt("perf_con_use_new_thread_pool", 0));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_thread_pool_config")) {
                        String strOptString5 = jSONObjectOptJSONObject8.optString("perf_con_thread_pool_config");
                        if (!TextUtils.isEmpty(strOptString5)) {
                            qdlVarQdl.qdl("perf_con_thread_pool_config", strOptString5);
                        }
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_is_new_net_thread")) {
                        qdlVarQdl.qdl("perf_con_is_new_net_thread", jSONObjectOptJSONObject8.optInt("perf_con_is_new_net_thread", 0));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_use_prop")) {
                        xmv.qdl(jSONObjectOptJSONObject8.optInt("perf_con_use_prop", 1));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_adlog_expire_time")) {
                        qdlVarQdl.qdl("perf_con_adlog_expire_time", jSONObjectOptJSONObject8.optLong("perf_con_adlog_expire_time"));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_adlog_turn_off_retry_ad")) {
                        qdlVarQdl.qdl("perf_con_adlog_turn_off_retry_ad", jSONObjectOptJSONObject8.optLong("perf_con_adlog_turn_off_retry_ad"));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_adlog_turn_off_retry_stats")) {
                        qdlVarQdl.qdl("perf_con_adlog_turn_off_retry_stats", jSONObjectOptJSONObject8.optLong("perf_con_adlog_turn_off_retry_stats"));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_applog_rate")) {
                        qdlVarQdl.qdl("perf_con_applog_rate", jSONObjectOptJSONObject8.optString("perf_con_applog_rate"));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_track_url_strategy")) {
                        qdlVarQdl.qdl("perf_con_track_url_strategy", jSONObjectOptJSONObject8.optString("perf_con_track_url_strategy"));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_drawable_code")) {
                        qdlVarQdl.qdl("perf_con_drawable_code", jSONObjectOptJSONObject8.optInt("perf_con_drawable_code", 0));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_close_button_delay_check_time")) {
                        qdlVarQdl.qdl("perf_con_close_button_delay_check_time", jSONObjectOptJSONObject8.optInt("perf_con_close_button_delay_check_time", -1));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_drop2rt_skip_label_list")) {
                        qdlVarQdl.qdl("perf_con_drop2rt_skip_label_list", jSONObjectOptJSONObject8.optString("perf_con_drop2rt_skip_label_list"));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_crypt_V4_get_ad")) {
                        qdlVarQdl.qdl("perf_con_crypt_V4_get_ad", jSONObjectOptJSONObject8.optBoolean("perf_con_crypt_V4_get_ad", false));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_crypt_V4_applog")) {
                        qdlVarQdl.qdl("perf_con_crypt_V4_applog", jSONObjectOptJSONObject8.optBoolean("perf_con_crypt_V4_applog", false));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_crypt_V4")) {
                        qdlVarQdl.qdl("perf_con_crypt_V4", jSONObjectOptJSONObject8.optBoolean("perf_con_crypt_V4", false));
                    }
                }
            } catch (Throwable th2) {
                aaj.lnr("SettingsDefaultRepository", th2.getMessage());
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("app_common_config", jSONObjectOptJSONObject5);
            jSONObject2.put("perf_con", jSONObject.optJSONObject("perf_con"));
            jSONObject2.put("bus_con", jSONObject.optJSONObject("bus_con"));
        } catch (JSONException e2) {
            aaj.lnr("SettingsDefaultRepository", "coreSettingJson", e2.getMessage());
        }
        qdlVarQdl.qdl("core_settings", jSONObject2.toString());
        if (jSONObject.has("dual_event_url")) {
            qdlVarQdl.qdl("dual_event_url", jSONObject.optString("dual_event_url"));
        }
        if (jSONObject.has("token_enable")) {
            qdlVarQdl.qdl("token_enable", jSONObject.optInt("token_enable"));
        }
        if (jSONObject.has("token_adx_ids")) {
            String strOptString6 = jSONObject.optString("token_adx_ids", "");
            if (TextUtils.isEmpty(strOptString6)) {
                qdlVarQdl.qdl("token_adx_ids");
            } else {
                qdlVarQdl.qdl("token_adx_ids", strOptString6);
            }
        }
        qdlVarQdl.qdl();
        rq.lnr().gy();
        mml();
    }

    public static Set<String> qdl(Set<String> set) {
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
