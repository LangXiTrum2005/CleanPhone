package com.bytedance.sdk.openadsdk.ka;

import android.app.Application;
import android.os.SystemClock;
import android.text.TextUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bytedance.sdk.component.utils.ac;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.model.dw;
import com.bytedance.sdk.openadsdk.core.model.oh;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.zf;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.dzy;
import com.bytedance.sdk.openadsdk.utils.ig;
import com.bytedance.sdk.openadsdk.utils.pv;
import com.bytedance.sdk.openadsdk.utils.qd;
import com.ironsource.C3700q2;
import com.ironsource.X3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.pgl.ssdk.ces.out.DungeonFlag;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ik {
    public static void di(wjv wjvVar, String str, final JSONObject jSONObject) {
        ri(System.currentTimeMillis(), wjvVar, str, "click_playable_button", new com.bytedance.sdk.openadsdk.slm.lr.ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.47
            @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
            public JSONObject ri() {
                return jSONObject;
            }
        });
    }

    public static void fi(wjv wjvVar, final com.bytedance.sdk.openadsdk.slm.ri.ri riVar, final String str) {
        ri(System.currentTimeMillis(), wjvVar, str, "web_behavior_click", new com.bytedance.sdk.openadsdk.slm.lr.ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.30
            @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
            public JSONObject ik() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("arbi_current_url", riVar.ik());
                    jSONObject.put("current_url_index", riVar.ka());
                    jSONObject.put("arbi_start_x", riVar.fi());
                    jSONObject.put("arbi_start_y", riVar.di());
                    jSONObject.put("click_duration", riVar.xha());
                    jSONObject.put("is_trigger_jump", riVar.mj());
                    jSONObject.put("click_type", String.valueOf(riVar.tan()));
                } catch (Throwable th) {
                    ac.ik("TTAD.AdEvent", "onWebBehaviorClick", th.getMessage());
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
            public JSONObject ri() {
                try {
                    com.bytedance.sdk.openadsdk.slm.ri.ri riVar2 = riVar;
                    if (riVar2 == null || riVar2.ri() == -1) {
                        return null;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("hit_type", riVar.ri());
                    jSONObject.put("hit_extra", riVar.lr());
                    return jSONObject;
                } catch (Throwable unused) {
                    return null;
                }
            }
        });
    }

    public static void ik(wjv wjvVar, String str, final long j) {
        ri(System.currentTimeMillis(), wjvVar, str, "load_feeling_duration", new com.bytedance.sdk.openadsdk.slm.lr.ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.6
            @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
            public JSONObject lr() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(IronSourceConstants.EVENTS_DURATION, j);
                } catch (Throwable th) {
                    ac.ik("TTAD.AdEvent", th.getMessage());
                }
                jSONObject.toString();
                return jSONObject;
            }
        });
    }

    public static void ka(final wjv wjvVar, final String str, final int i) {
        ri(System.currentTimeMillis(), wjvVar, str, "material_status", new com.bytedance.sdk.openadsdk.slm.lr.ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.13
            @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
            public JSONObject ri() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("trigger_type", i);
                    jSONObject.put("image_mode", wjvVar.vz());
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static JSONObject lr(wjv wjvVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (dw.lr(wjvVar) && wjvVar.tp()) {
            try {
                jSONObject.put("is_new_playable", 1);
            } catch (Throwable th) {
                ac.ik(th.getMessage(), new Object[0]);
            }
        }
        ri(jSONObject);
        lr(jSONObject);
        return jSONObject;
    }

    public static void fi(wjv wjvVar, String str, final JSONObject jSONObject) {
        ri(System.currentTimeMillis(), wjvVar, str, "click_next_ad_button", new com.bytedance.sdk.openadsdk.slm.lr.ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.46
            @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
            public JSONObject ri() {
                return jSONObject;
            }
        });
    }

    public static void ik(wjv wjvVar, String str, final int i) {
        if (i == 200) {
            return;
        }
        ri(System.currentTimeMillis(), wjvVar, str, "check_meta_more", new com.bytedance.sdk.openadsdk.slm.lr.ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.8
            @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
            public JSONObject ik() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("error_code", i);
                    jSONObject.put("check_url", com.bytedance.sdk.openadsdk.core.settings.sf.lr().wjv());
                    return jSONObject;
                } catch (Throwable th) {
                    ac.ik(th.toString(), new Object[0]);
                    return jSONObject;
                }
            }
        });
    }

    public static void ka(wjv wjvVar, final com.bytedance.sdk.openadsdk.slm.ri.ri riVar, final String str) {
        ri(System.currentTimeMillis(), wjvVar, str, "web_behavior_scroll", new com.bytedance.sdk.openadsdk.slm.lr.ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.29
            @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
            public JSONObject ik() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("arbi_current_url", riVar.ik());
                    jSONObject.put("current_url_index", riVar.ka());
                    jSONObject.put("trigger_scroll_x", riVar.jbs());
                    jSONObject.put("trigger_scroll_y", riVar.qt());
                    jSONObject.put("arbi_offset_y", riVar.sf());
                    jSONObject.put("scroll_type", riVar.co());
                    jSONObject.put("scroll_duration", riVar.aw());
                } catch (Throwable th) {
                    ac.ik("TTAD.AdEvent", "onWebBehaviorScroll", th.getMessage());
                }
                return jSONObject;
            }
        });
    }

    public static void ri() {
        try {
            Class.forName(ik.class.getName());
        } catch (ClassNotFoundException unused) {
        }
    }

    public static class ri {
        public static void ri(String str, final JSONObject jSONObject, wjv wjvVar) {
            String strRi = ig.ri(wjvVar);
            if (strRi == null) {
                return;
            }
            ik.ri(System.currentTimeMillis(), wjvVar, strRi + "_landingpage", str, new com.bytedance.sdk.openadsdk.slm.lr.ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.ri.1
                @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
                public JSONObject ik() {
                    return jSONObject;
                }
            });
        }

        public static void ri(final int i, final int i2, wjv wjvVar) {
            String strRi = ig.ri(wjvVar);
            if (strRi == null) {
                return;
            }
            ik.ri(System.currentTimeMillis(), wjvVar, strRi + "_landingpage", "local_res_hit_rate", new com.bytedance.sdk.openadsdk.slm.lr.ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.ri.2
                @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
                public JSONObject ik() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("all_times", i2);
                        jSONObject.put("hit_times", i);
                    } catch (Throwable unused) {
                    }
                    return jSONObject;
                }
            });
        }

        public static void ri(final long j, final wjv wjvVar, String str, final ILoader iLoader, final String str2) {
            if (str == null) {
                return;
            }
            ik.ri(System.currentTimeMillis(), wjvVar, str, "landingpage_init", new com.bytedance.sdk.openadsdk.slm.lr.ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.ri.3
                @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
                public JSONObject ik() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        int iRi = com.bytedance.sdk.openadsdk.xha.lr.ri().ri(iLoader, str2);
                        jSONObject.put("url", wjvVar.smj());
                        jSONObject.put("channel_name", wjvVar.mvf());
                        jSONObject.put("interceptor_status", (TextUtils.isEmpty(wjvVar.mvf()) || iRi <= 0) ? 0 : 1);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("resource_count", iRi);
                        jSONObject.put("resource_info", jSONObject2);
                    } catch (Throwable unused) {
                    }
                    return jSONObject;
                }

                @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
                public JSONObject lr() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put(IronSourceConstants.EVENTS_DURATION, j);
                    } catch (Throwable unused) {
                    }
                    return jSONObject;
                }

                @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
                public JSONObject ri() {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(wjv.lr, wjvVar.evm() ? 1 : 0);
                        return jSONObject;
                    } catch (Throwable unused) {
                        return null;
                    }
                }
            });
        }

        public static void ri(final int i, final int i2, final int i3, final int i4, final wjv wjvVar, String str, final int i5) {
            if (str == null || TextUtils.isEmpty(wjvVar.mvf())) {
                return;
            }
            ik.ri(System.currentTimeMillis(), wjvVar, str, "landing_page_resource_detail", new com.bytedance.sdk.openadsdk.slm.lr.ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.ri.4
                @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
                public JSONObject ik() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("next_url", wjvVar.smj());
                        jSONObject.put("channel_name", wjvVar.mvf());
                        jSONObject.put("preload_status", i <= 0 ? 0 : 2);
                        jSONObject.put("first_page", i5);
                        jSONObject.put("preload_h5_type", wjvVar.qd());
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("channel_response", i);
                        jSONObject2.put("failResourceCount", i2);
                        jSONObject2.put("successCount", i3);
                        jSONObject2.put("failCount", i4);
                        jSONObject.put("resource_info", jSONObject2);
                    } catch (Throwable unused) {
                    }
                    return jSONObject;
                }
            });
        }
    }

    public static void ik(final wjv wjvVar, String str) {
        if (wjvVar == null || !wjv.ik(wjvVar) || wjvVar.pv() == null) {
            return;
        }
        ri(System.currentTimeMillis(), wjvVar, str, CampaignEx.JSON_NATIVE_VIDEO_ENDCARD_SHOW, new com.bytedance.sdk.openadsdk.slm.lr.ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.25
            @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
            public JSONObject ik() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.putOpt("url", wjvVar.pv().ik());
                    jSONObject.putOpt("id", wjvVar.pv().ri());
                    jSONObject.putOpt("md5", wjvVar.pv().lr());
                    if (wjvVar.eu() != null) {
                        jSONObject.putOpt("render_type", Integer.valueOf(wjvVar.eu().polloi()));
                    }
                } catch (Exception unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void ka(wjv wjvVar, String str, final JSONObject jSONObject) {
        ri(System.currentTimeMillis(), wjvVar, str, "show_next_ad_hint", new com.bytedance.sdk.openadsdk.slm.lr.ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.45
            @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
            public JSONObject ri() {
                return jSONObject;
            }
        });
    }

    public static void ri(wjv wjvVar, String str, final int i) {
        ri(System.currentTimeMillis(), wjvVar, str, "open_url_h5", new com.bytedance.sdk.openadsdk.slm.lr.ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.1
            @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
            public JSONObject ik() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.putOpt("render_type", "h5");
                    jSONObject.putOpt("render_type_2", 0);
                    jSONObject.putOpt("preload_status", Integer.valueOf(i));
                } catch (Exception unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void ri(final wjv wjvVar, String str) {
        ri(System.currentTimeMillis(), wjvVar, str, "endcard_load_start", new com.bytedance.sdk.openadsdk.slm.lr.ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.12
            @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
            public JSONObject ik() {
                JSONObject jSONObject = new JSONObject();
                try {
                    if (wjv.ik(wjvVar)) {
                        if (wjvVar.pv() != null) {
                            jSONObject.putOpt("url", wjvVar.pv().ik());
                            jSONObject.putOpt("id", wjvVar.pv().ri());
                            jSONObject.putOpt("md5", wjvVar.pv().lr());
                        }
                        if (wjvVar.eu() != null) {
                            jSONObject.putOpt("render_type", 7);
                            return jSONObject;
                        }
                    } else {
                        jSONObject.putOpt("url", wjvVar.eu().marial());
                        jSONObject.putOpt("style_id", wjvVar.xd());
                        if (wjvVar.eu() != null) {
                            jSONObject.putOpt("render_type", 0);
                        }
                    }
                    return jSONObject;
                } catch (Exception e) {
                    ac.ik(e.getMessage(), new Object[0]);
                    return jSONObject;
                }
            }
        });
    }

    public static void ik(wjv wjvVar, final com.bytedance.sdk.openadsdk.slm.ri.ri riVar, final String str) {
        ri(System.currentTimeMillis(), wjvVar, str, "web_behavior_stay", new com.bytedance.sdk.openadsdk.slm.lr.ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.28
            @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
            public JSONObject ik() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("arbi_current_url", riVar.ik());
                    jSONObject.put("current_url_index", riVar.ka());
                    jSONObject.put("arbi_stay_duration", riVar.bgr());
                    jSONObject.put("browsing_percentage", riVar.vr());
                    jSONObject.put("out_focus_scene", riVar.slm());
                } catch (Throwable th) {
                    ac.ik("TTAD.AdEvent", "onWebBehaviorStay", th.getMessage());
                }
                return jSONObject;
            }
        });
    }

    public static void ri(final wjv wjvVar, String str, final long j) {
        ri(System.currentTimeMillis(), wjvVar, str, "endcard_load_finish", new com.bytedance.sdk.openadsdk.slm.lr.ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.23
            @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
            public JSONObject ik() {
                JSONObject jSONObject = new JSONObject();
                try {
                    if (wjv.ik(wjvVar)) {
                        if (wjvVar.pv() != null) {
                            jSONObject.putOpt("url", wjvVar.pv().ik());
                            jSONObject.putOpt("id", wjvVar.pv().ri());
                            jSONObject.putOpt("md5", wjvVar.pv().lr());
                        }
                        if (wjvVar.eu() != null) {
                            jSONObject.putOpt("render_type", 7);
                            return jSONObject;
                        }
                    } else {
                        jSONObject.putOpt("url", wjvVar.eu().marial());
                        jSONObject.putOpt("style_id", wjvVar.xd());
                        if (wjvVar.eu() != null) {
                            jSONObject.putOpt("render_type", 0);
                        }
                    }
                    return jSONObject;
                } catch (Exception e) {
                    ac.ik(e.getMessage(), new Object[0]);
                    return jSONObject;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
            public JSONObject lr() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(IronSourceConstants.EVENTS_DURATION, j);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void ik(wjv wjvVar, String str, String str2, final JSONObject jSONObject) {
        if (wjvVar == null || jSONObject == null) {
            return;
        }
        ri(System.currentTimeMillis(), wjvVar, str, str2, new com.bytedance.sdk.openadsdk.slm.lr.ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.35
            @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
            public JSONObject ik() {
                return jSONObject;
            }
        });
    }

    public static void ri(final wjv wjvVar, String str, final long j, final int i, final String str2, final String str3) {
        ri(System.currentTimeMillis(), wjvVar, str, "endcard_load_fail", new com.bytedance.sdk.openadsdk.slm.lr.ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.33
            @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
            public JSONObject ik() {
                JSONObject jSONObject = new JSONObject();
                try {
                    if (wjv.ik(wjvVar)) {
                        if (wjvVar.pv() != null) {
                            jSONObject.putOpt("url", wjvVar.pv().ik());
                            jSONObject.putOpt("id", wjvVar.pv().ri());
                            jSONObject.putOpt("md5", wjvVar.pv().lr());
                        }
                        if (wjvVar.eu() != null) {
                            jSONObject.putOpt("render_type", 7);
                        }
                    } else {
                        jSONObject.putOpt("url", wjvVar.eu().marial());
                        jSONObject.putOpt("style_id", wjvVar.xd());
                        if (!TextUtils.isEmpty(str3)) {
                            jSONObject.putOpt("error_url", str3);
                        }
                        if (wjvVar.eu() != null) {
                            jSONObject.putOpt("render_type", 0);
                        }
                    }
                    jSONObject.put("error_code", i);
                    jSONObject.put("error_msg", str2);
                    return jSONObject;
                } catch (Exception e) {
                    ac.ik(e.getMessage(), new Object[0]);
                    return jSONObject;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
            public JSONObject lr() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(IronSourceConstants.EVENTS_DURATION, j);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void ik(wjv wjvVar, String str, JSONObject jSONObject) {
        if (wjvVar == null) {
            return;
        }
        ri(wjvVar, str, -1L, jSONObject, (JSONObject) null);
    }

    private static void lr(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            JSONObject jSONObjectRi = mj.ri();
            if (jSONObjectRi != null) {
                Iterator<String> itKeys = jSONObjectRi.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObject.put(next, jSONObjectRi.get(next));
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static void ri(final wjv wjvVar, String str, final long j, final int i, final int i2) {
        ri(System.currentTimeMillis(), wjvVar, str, "load", new com.bytedance.sdk.openadsdk.slm.lr.ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.44
            @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
            public JSONObject ik() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.putOpt("render_type", "h5");
                    jSONObject.putOpt("render_type_2", 0);
                    jSONObject.putOpt("interaction_method", Integer.valueOf(wjvVar.zb()));
                    jSONObject.put("first_page", i2);
                    jSONObject.put("preload_h5_type", wjvVar.qd());
                    int i3 = i;
                    if (i3 >= 0) {
                        jSONObject.putOpt("preload_status", Integer.valueOf(i3));
                    }
                } catch (Exception unused) {
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
            public JSONObject lr() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(IronSourceConstants.EVENTS_DURATION, Math.min(j, TTAdConstant.AD_MAX_EVENT_TIME));
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void ri(String str, wjv wjvVar, String str2, final Map<String, Object> map) {
        ri(System.currentTimeMillis(), wjvVar, str2, str, new com.bytedance.sdk.openadsdk.slm.lr.ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.48
            @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
            public JSONObject ik() {
                try {
                    if (map == null) {
                        return null;
                    }
                    JSONObject jSONObject = new JSONObject();
                    for (Map.Entry entry : map.entrySet()) {
                        jSONObject.put((String) entry.getKey(), entry.getValue());
                    }
                    return jSONObject;
                } catch (Exception unused) {
                    return null;
                }
            }
        });
    }

    @DungeonFlag
    public static void ri(wjv wjvVar, String str, JSONObject jSONObject, JSONObject jSONObject2) {
        ri(wjvVar, C3700q2.v, str, jSONObject, jSONObject2);
    }

    @DungeonFlag
    private static void ri(final wjv wjvVar, final String str, final String str2, final JSONObject jSONObject, final JSONObject jSONObject2) {
        if (wjvVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        if (wjvVar.feb() && C3700q2.v.equals(str)) {
            return;
        }
        if (C3700q2.v.equals(str)) {
            wjvVar.qt(true);
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        ri(new com.bytedance.sdk.component.mj.lr.ik("onShow") { // from class: com.bytedance.sdk.openadsdk.ka.ik.49
            @Override // java.lang.Runnable
            public void run() {
                final String strRi;
                if (com.bytedance.sdk.openadsdk.core.nr.ka().tan()) {
                    strRi = com.bytedance.sdk.openadsdk.core.sf.ri.ri.ri((Application) com.bytedance.sdk.openadsdk.core.nr.ri()).ri(str2, DeviceUtils.ri(), wjvVar.ur());
                } else {
                    strRi = "none";
                }
                ik.ri(jCurrentTimeMillis, wjvVar, str2, str, new com.bytedance.sdk.openadsdk.slm.lr.ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.49.1
                    @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
                    public JSONObject ik() {
                        try {
                            AnonymousClass49 anonymousClass49 = AnonymousClass49.this;
                            JSONObject jSONObject3 = jSONObject;
                            if (jSONObject3 != null) {
                                jSONObject3.put("interaction_method", wjvVar.zb());
                                AnonymousClass49 anonymousClass410 = AnonymousClass49.this;
                                jSONObject.put("real_interaction_method", wjvVar.nd());
                                jSONObject.put("video_skip_result", com.bytedance.sdk.openadsdk.core.nr.ka().aw(String.valueOf(wjvVar.ur())));
                                jSONObject.put("au_show", strRi);
                                return jSONObject;
                            }
                            JSONObject jSONObject4 = new JSONObject();
                            jSONObject4.put("interaction_method", wjvVar.zb());
                            jSONObject4.put("real_interaction_method", wjvVar.nd());
                            jSONObject4.put("video_skip_result", com.bytedance.sdk.openadsdk.core.nr.ka().aw(String.valueOf(wjvVar.ur())));
                            jSONObject4.put("au_show", strRi);
                            return jSONObject4;
                        } catch (Throwable unused) {
                            return null;
                        }
                    }

                    @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
                    public JSONObject lr() {
                        Object obj;
                        try {
                            zf.lr(wjvVar);
                            JSONObject jSONObject3 = new JSONObject();
                            try {
                                jSONObject3.putOpt("log_extra", wjvVar.yjg());
                                float fFloatValue = Double.valueOf((System.currentTimeMillis() / 1000) - wjvVar.jfv()).floatValue();
                                if (fFloatValue <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                    fFloatValue = 0.0f;
                                }
                                jSONObject3.putOpt("show_time", Float.valueOf(fFloatValue));
                                long jElapsedRealtime = SystemClock.elapsedRealtime() - wjvVar.jbs();
                                if (jElapsedRealtime > 0) {
                                    jSONObject3.put(IronSourceConstants.EVENTS_DURATION, jElapsedRealtime);
                                }
                                jSONObject3.putOpt("ua_policy", Integer.valueOf(wjvVar.hd()));
                                String strId = wjvVar.id();
                                if (!TextUtils.isEmpty(strId) && !TextUtils.isEmpty(strId)) {
                                    try {
                                        jSONObject3.put("ttdsp_price", Math.round(Float.parseFloat(strId) * 100000.0f));
                                    } catch (Throwable th) {
                                        jSONObject3.put("ttdsp_price", 0);
                                        ac.ik("TTAD.AdEvent", th.getMessage());
                                    }
                                }
                                if (wjvVar.iyl() == null) {
                                    return jSONObject3;
                                }
                                try {
                                    Object obj2 = wjvVar.iyl().get(TTAdConstant.SDK_BIDDING_TYPE);
                                    if (obj2 == null || Integer.parseInt(obj2.toString()) != 2 || (obj = wjvVar.iyl().get("price")) == null) {
                                        return jSONObject3;
                                    }
                                    jSONObject3.put("ttdsp_price", Math.round(Double.parseDouble(obj.toString()) * 100000.0d));
                                    return jSONObject3;
                                } catch (Throwable th2) {
                                    ac.ri("TTAD.AdEvent", "client bidding price error: ", th2);
                                    return jSONObject3;
                                }
                                return jSONObject3;
                            } catch (Exception unused) {
                                return jSONObject3;
                            }
                        } catch (Exception unused2) {
                            return null;
                        }
                    }

                    @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
                    public JSONObject ri() {
                        AnonymousClass49 anonymousClass49 = AnonymousClass49.this;
                        JSONObject jSONObject3 = jSONObject2;
                        return jSONObject3 == null ? ik.lr(wjvVar, new JSONObject()) : ik.lr(wjvVar, jSONObject3);
                    }
                });
                if (C3700q2.v.equals(str)) {
                    if (!wjvVar.udw()) {
                        if (wjvVar.vgs()) {
                            com.bytedance.sdk.openadsdk.core.aw.lr.ik.ri(wjvVar.amj(), new com.bytedance.sdk.openadsdk.core.aw.lr.ik.lr("show_urls", wjvVar));
                        } else {
                            ik.ri(wjvVar);
                        }
                    }
                    JSONObject jSONObject3 = jSONObject;
                    if (jSONObject3 != null) {
                        int iOptInt = jSONObject3.optInt("dynamic_show_type");
                        if (wjvVar.kt() == 1 && (iOptInt == 7 || iOptInt == 10)) {
                            com.bytedance.sdk.component.utils.jbs.ri().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ka.ik.49.2
                                @Override // java.lang.Runnable
                                public void run() {
                                    JSONObject jSONObject4 = new JSONObject();
                                    try {
                                        jSONObject4.put("auto_click", true);
                                        AnonymousClass49 anonymousClass49 = AnonymousClass49.this;
                                        ik.lr(wjvVar, str2, "click", jSONObject4);
                                    } catch (Exception unused) {
                                        ac.ik("TTAD.AdEvent", "ugen click exception");
                                    }
                                }
                            }, com.bytedance.sdk.openadsdk.core.settings.sf.lr().iph());
                        }
                    }
                    com.bytedance.sdk.openadsdk.core.sf.ik.ri(wjvVar, strRi);
                }
            }
        });
    }

    public static void lr(wjv wjvVar, String str, final long j) {
        if (wjvVar != null && j > 0 && j < 200000) {
            ri(System.currentTimeMillis(), wjvVar, str, "video_click_duration", new com.bytedance.sdk.openadsdk.slm.lr.ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.3
                @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
                public JSONObject ik() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("video_click_duration_time", j);
                    } catch (Throwable unused) {
                    }
                    return jSONObject;
                }
            });
        }
    }

    public static void lr(wjv wjvVar, String str, final int i) {
        ri(System.currentTimeMillis(), wjvVar, str, "check_meta", new com.bytedance.sdk.openadsdk.slm.lr.ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.7
            @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
            public JSONObject ik() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("error_code", i);
                    jSONObject.put("check_url", com.bytedance.sdk.openadsdk.core.settings.sf.lr().wjv());
                    return jSONObject;
                } catch (Throwable th) {
                    ac.ik(th.toString(), new Object[0]);
                    return jSONObject;
                }
            }
        });
    }

    public static void lr(final wjv wjvVar, String str) {
        ri(System.currentTimeMillis(), wjvVar, str, "picture_click", new com.bytedance.sdk.openadsdk.slm.lr.ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.14
            @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
            public JSONObject ik() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("ad_slot_type", wjvVar.lji());
                    jSONObject.put("interaction_method", wjvVar.zb());
                    return jSONObject;
                } catch (Throwable th) {
                    ac.ik(th.toString(), new Object[0]);
                    return jSONObject;
                }
            }
        });
    }

    public static void lr(wjv wjvVar, String str, String str2, final JSONObject jSONObject) {
        ri(System.currentTimeMillis(), wjvVar, str, str2, new com.bytedance.sdk.openadsdk.slm.lr.ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.18
            @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
            public JSONObject ik() {
                return jSONObject;
            }
        });
    }

    private static void ri(JSONObject jSONObject) {
        try {
            jSONObject.put("screen_scale", qd.di(com.bytedance.sdk.openadsdk.core.nr.ri()));
        } catch (Throwable unused) {
        }
    }

    public static void lr(final long j, final wjv wjvVar, String str, final String str2) {
        ri(System.currentTimeMillis(), wjvVar, str, "endcard_feeling_duraion", new com.bytedance.sdk.openadsdk.slm.lr.ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.24
            @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
            public JSONObject ik() {
                JSONObject jSONObject = new JSONObject();
                try {
                    if (wjv.ik(wjvVar)) {
                        if (wjvVar.pv() != null) {
                            jSONObject.putOpt("url", wjvVar.pv().ik());
                            jSONObject.putOpt("id", wjvVar.pv().ri());
                            jSONObject.putOpt("md5", wjvVar.pv().lr());
                        }
                        jSONObject.putOpt("from", str2);
                        if (wjvVar.eu() != null) {
                            jSONObject.putOpt("render_type", 7);
                            return jSONObject;
                        }
                    } else {
                        jSONObject.put("url", wjvVar.eu().marial());
                        jSONObject.put("style_id", wjvVar.xd());
                        if (wjvVar.eu() != null) {
                            jSONObject.putOpt("render_type", 0);
                        }
                    }
                    return jSONObject;
                } catch (Exception e) {
                    ac.ik(e.getMessage(), new Object[0]);
                    return jSONObject;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
            public JSONObject lr() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(IronSourceConstants.EVENTS_DURATION, j);
                    return jSONObject;
                } catch (Exception e) {
                    ac.ik(e.getMessage(), new Object[0]);
                    return jSONObject;
                }
            }
        });
    }

    public static void ri(wjv wjvVar) {
        if (TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.aw.ri(com.bytedance.sdk.openadsdk.core.nr.ri()))) {
            return;
        }
        com.bytedance.sdk.openadsdk.ka.ri.lr.ri(com.bytedance.sdk.openadsdk.ay.ri.ri(wjvVar.amj(), true), 1, wjvVar.tn());
    }

    public static void lr(wjv wjvVar, final com.bytedance.sdk.openadsdk.slm.ri.ri riVar, final String str) {
        ri(System.currentTimeMillis(), wjvVar, str, "web_behavior_load", new com.bytedance.sdk.openadsdk.slm.lr.ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.27
            @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
            public JSONObject ik() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("arbi_current_url", riVar.ik());
                    jSONObject.put("current_url_index", riVar.ka());
                    jSONObject.put("arbi_load_duration", riVar.nr());
                } catch (Throwable th) {
                    ac.ik("TTAD.AdEvent", "onWebBehaviorLoad", th.getMessage());
                }
                return jSONObject;
            }
        });
    }

    public static void lr(wjv wjvVar, String str, String str2, final JSONObject jSONObject, final long j) {
        if (wjvVar == null || jSONObject == null) {
            return;
        }
        ri(System.currentTimeMillis(), wjvVar, str, str2, new com.bytedance.sdk.openadsdk.slm.lr.ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.34
            @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
            public JSONObject ik() {
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
            public JSONObject lr() {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put(IronSourceConstants.EVENTS_DURATION, j);
                } catch (Throwable unused) {
                }
                return jSONObject2;
            }
        });
    }

    public static void lr(wjv wjvVar, String str, final JSONObject jSONObject) {
        ri(System.currentTimeMillis(), wjvVar, str, lr.di, new com.bytedance.sdk.openadsdk.slm.lr.ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.37
            @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
            public JSONObject ri() {
                return jSONObject;
            }
        });
    }

    public static void lr(wjv wjvVar, String str, JSONObject jSONObject, JSONObject jSONObject2) {
        ri(wjvVar, "activity_recreate", str, jSONObject, jSONObject2);
    }

    @DungeonFlag
    public static void ri(final String str, final wjv wjvVar, final String str2, final xha xhaVar) {
        if (wjvVar == null || xhaVar == null || !xhaVar.ri()) {
            return;
        }
        ri(System.currentTimeMillis(), wjvVar, str2, "ad_show_time", new com.bytedance.sdk.openadsdk.slm.lr.ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.50
            @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
            public JSONObject ik() {
                try {
                    xha xhaVar2 = xhaVar;
                    if (xhaVar2 == null || xhaVar2.lr() == null) {
                        return null;
                    }
                    JSONObject jSONObjectLr = xhaVar.lr();
                    if (str2.equals("open_ad")) {
                        jSONObjectLr.put("is_icon_only", wjvVar.ory() ? 1 : 0);
                    }
                    return jSONObjectLr;
                } catch (Throwable unused) {
                    return null;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
            public JSONObject lr() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(IronSourceConstants.EVENTS_DURATION, str);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void lr(wjv wjvVar, String str, int i, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("type", i);
        } catch (JSONException unused) {
        }
        lr(wjvVar, str, "download_app_ad_track", jSONObject);
    }

    public static void ri(final wjv wjvVar, final String str, final pv pvVar) {
        if (wjvVar == null) {
            return;
        }
        final long jKa = pvVar.ka();
        ri(System.currentTimeMillis(), wjvVar, str, "stay_duration", new com.bytedance.sdk.openadsdk.slm.lr.ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.2
            @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
            public JSONObject ik() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("click_stay_time", jKa);
                    jSONObject.put("click_time", pvVar.ri);
                    if (str.equals("open_ad")) {
                        jSONObject.put("is_icon_only", wjvVar.ory() ? 1 : 0);
                    }
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void ri(wjv wjvVar, final String str, final int i, final String str2, final long j, final boolean z, final int i2, final long j2) {
        ri(System.currentTimeMillis(), wjvVar, str, lr.ka, new com.bytedance.sdk.openadsdk.slm.lr.ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.4
            @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
            public JSONObject ik() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("invisible_scene", i);
                    jSONObject.put("arbi_current_url", str2);
                    jSONObject.put("loading_visible_time", j);
                    jSONObject.put("arbi_trigger_start", z);
                    jSONObject.put("arbi_convert_count", i2);
                    jSONObject.put("loading_start_timestamp", j2);
                } catch (Throwable th) {
                    ac.ik(th.toString(), new Object[0]);
                }
                return jSONObject;
            }
        });
    }

    public static void ri(wjv wjvVar, String str, final long j, final boolean z) {
        ri(System.currentTimeMillis(), wjvVar, str, "lp_loading", new com.bytedance.sdk.openadsdk.slm.lr.ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.5
            @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
            public JSONObject ik() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("if_lp_loading_success", z ? 1 : 2);
                    return jSONObject;
                } catch (Throwable th) {
                    ac.ik(th.toString(), new Object[0]);
                    return jSONObject;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
            public JSONObject lr() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(IronSourceConstants.EVENTS_DURATION, j);
                    return jSONObject;
                } catch (Throwable th) {
                    ac.ik(th.toString(), new Object[0]);
                    return jSONObject;
                }
            }
        });
    }

    public static void ri(wjv wjvVar, String str, final int i, final String str2, final int i2) {
        ri(System.currentTimeMillis(), wjvVar, str, lr.ri, new com.bytedance.sdk.openadsdk.slm.lr.ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.9
            @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
            public JSONObject ik() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("index", i);
                    jSONObject.put("arbi_current_url", str2);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
            public JSONObject ri() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("new_index", i2);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void ri(wjv wjvVar, final String str, final int i, final String str2, final float f) {
        ri(System.currentTimeMillis(), wjvVar, str, lr.lr, new com.bytedance.sdk.openadsdk.slm.lr.ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.10
            @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
            public JSONObject ik() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("index", i);
                    jSONObject.put("arbi_current_url", str2);
                    jSONObject.put("arbi_load_duration", f);
                } catch (Throwable th) {
                    ac.ik(th.toString(), new Object[0]);
                }
                return jSONObject;
            }
        });
    }

    public static void ri(wjv wjvVar, final String str, final int i, final String str2, final String str3, final int i2) {
        ri(System.currentTimeMillis(), wjvVar, str, lr.ik, new com.bytedance.sdk.openadsdk.slm.lr.ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.11
            @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
            public JSONObject ik() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("index", i);
                    jSONObject.put("arbi_current_url", str2);
                    jSONObject.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_LOAD_URL, str3);
                    jSONObject.put("url_flag", i2);
                } catch (Throwable th) {
                    ac.ik(th.toString(), new Object[0]);
                }
                return jSONObject;
            }
        });
    }

    @DungeonFlag
    public static void ri(final String str, final wjv wjvVar, final com.bytedance.sdk.openadsdk.core.model.co coVar, final String str2, final boolean z, final Map<String, Object> map, final int i) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        ri(new com.bytedance.sdk.component.mj.lr.ik("onClick") { // from class: com.bytedance.sdk.openadsdk.ka.ik.15
            @Override // java.lang.Runnable
            public void run() {
                wjv wjvVar2 = wjvVar;
                if (wjvVar2 == null) {
                    return;
                }
                ik.ri(jCurrentTimeMillis, wjvVar2, str2, str, new com.bytedance.sdk.openadsdk.slm.lr.ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.15.1
                    @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
                    public JSONObject lr() {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            com.bytedance.sdk.openadsdk.core.model.co coVar2 = coVar;
                            if (coVar2 != null) {
                                JSONObject jSONObjectRi = coVar2.ri();
                                jSONObjectRi.put("is_valid", z);
                                int i2 = i;
                                if (i2 > 0 && i2 <= 2) {
                                    jSONObjectRi.put("user_behavior_type", i2);
                                }
                                Map map2 = map;
                                if (map2 != null) {
                                    if (map2.containsKey(IronSourceConstants.EVENTS_DURATION)) {
                                        jSONObject.put(IronSourceConstants.EVENTS_DURATION, map.get(IronSourceConstants.EVENTS_DURATION));
                                    }
                                    for (Map.Entry entry : map.entrySet()) {
                                        if (!IronSourceConstants.EVENTS_DURATION.equals(entry.getKey())) {
                                            jSONObjectRi.put((String) entry.getKey(), entry.getValue());
                                        }
                                    }
                                }
                                jSONObjectRi.put("interaction_method", wjvVar.zb());
                                if (str2.equals("open_ad")) {
                                    jSONObjectRi.put("is_icon_only", wjvVar.ory() ? 1 : 0);
                                }
                                jSONObject.put("ad_extra_data", jSONObjectRi.toString());
                            }
                            jSONObject.putOpt("log_extra", wjvVar.yjg());
                            float fFloatValue = Double.valueOf((System.currentTimeMillis() / 1000) - wjvVar.jfv()).floatValue();
                            if (fFloatValue <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                fFloatValue = 0.0f;
                            }
                            jSONObject.putOpt("show_time", Float.valueOf(fFloatValue));
                            jSONObject.putOpt("ua_policy", Integer.valueOf(wjvVar.hd()));
                        } catch (Exception unused) {
                        }
                        return jSONObject;
                    }
                });
                if (!TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.aw.ri(com.bytedance.sdk.openadsdk.core.nr.ri())) && "click".equals(str)) {
                    com.bytedance.sdk.openadsdk.ka.ri.lr.ri(com.bytedance.sdk.openadsdk.ay.ri.ri(wjvVar.bfa(), true), 2, wjvVar.tn());
                }
                if ("click".equals(str)) {
                    zf.ik(wjvVar);
                }
            }
        });
    }

    public static void ri(wjv wjvVar, String str, String str2, final JSONObject jSONObject) {
        ri(System.currentTimeMillis(), wjvVar, str, str2, new com.bytedance.sdk.openadsdk.slm.lr.ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.16
            @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
            public JSONObject ik() {
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
            public JSONObject lr() {
                if (jSONObject == null) {
                    return null;
                }
                JSONObject jSONObject2 = new JSONObject();
                try {
                    if (!jSONObject.has(IronSourceConstants.EVENTS_DURATION)) {
                        return jSONObject2;
                    }
                    jSONObject2.put(IronSourceConstants.EVENTS_DURATION, jSONObject.get(IronSourceConstants.EVENTS_DURATION));
                    return jSONObject2;
                } catch (Exception e) {
                    ac.ik("TTAD.AdEvent", e.getMessage());
                    return jSONObject2;
                }
            }
        });
        if ("click".equals(str2)) {
            zf.ik(wjvVar);
        }
    }

    public static void ri(wjv wjvVar, String str, final String str2, final long j, final int i, JSONObject jSONObject, final xha xhaVar) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        final JSONObject jSONObject2 = jSONObject;
        ri(System.currentTimeMillis(), wjvVar, str, str2, new com.bytedance.sdk.openadsdk.slm.lr.ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.17
            @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
            public JSONObject ik() {
                xha xhaVar2;
                try {
                    if (("feed_break".equals(str2) || "feed_over".equals(str2)) && (xhaVar2 = xhaVar) != null) {
                        xhaVar2.ri(jSONObject2);
                    }
                    return jSONObject2;
                } catch (Throwable unused) {
                    return null;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
            public JSONObject lr() {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put(IronSourceConstants.EVENTS_DURATION, j);
                    jSONObject3.put("percent", i);
                } catch (Throwable unused) {
                }
                return jSONObject3;
            }
        });
    }

    public static void ri(wjv wjvVar, String str, String str2, final JSONObject jSONObject, final long j) {
        ri(System.currentTimeMillis(), wjvVar, str, str2, new com.bytedance.sdk.openadsdk.slm.lr.ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.19
            @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
            public JSONObject ik() {
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
            public JSONObject lr() {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put(IronSourceConstants.EVENTS_DURATION, j);
                } catch (Exception unused) {
                }
                return jSONObject2;
            }
        });
    }

    public static void ri(final wjv wjvVar, String str, String str2, final Map<String, Object> map) {
        ri(System.currentTimeMillis(), wjvVar, str, str2, new com.bytedance.sdk.openadsdk.slm.lr.ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.20
            @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
            public JSONObject ik() {
                JSONObject jSONObject = new JSONObject();
                try {
                    Map map2 = map;
                    if (map2 != null) {
                        for (Map.Entry entry : map2.entrySet()) {
                            jSONObject.put((String) entry.getKey(), entry.getValue());
                        }
                    }
                    jSONObject.put("dp_creative_type", wjvVar.yv());
                } catch (Exception unused) {
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
            public JSONObject lr() {
                JSONObject jSONObject = new JSONObject();
                try {
                    Map map2 = map;
                    if (map2 != null) {
                        Object obj = map2.get(IronSourceConstants.EVENTS_DURATION);
                        if (obj instanceof Long) {
                            jSONObject.put(IronSourceConstants.EVENTS_DURATION, obj);
                        }
                    }
                } catch (Exception unused) {
                }
                return jSONObject;
            }
        });
    }

    @DungeonFlag
    public static void ri(long j, wjv wjvVar, String str, String str2) {
        ri(j, wjvVar, str, str2, (com.bytedance.sdk.openadsdk.slm.lr.lr) null);
    }

    @DungeonFlag
    public static void ri(final long j, final wjv wjvVar, final String str, final String str2, final com.bytedance.sdk.openadsdk.slm.lr.lr lrVar) {
        if (wjvVar == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || ri(wjvVar.bnj(), str2)) {
            return;
        }
        ri(new com.bytedance.sdk.component.mj.lr.ik(str2) { // from class: com.bytedance.sdk.openadsdk.ka.ik.21
            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObject;
                try {
                    com.bytedance.sdk.openadsdk.slm.lr.lr lrVar2 = lrVar;
                    if (lrVar2 != null) {
                        jSONObject = lrVar2.lr();
                        if (jSONObject == null) {
                            try {
                                jSONObject = new JSONObject();
                            } catch (Exception unused) {
                            }
                        }
                    } else {
                        jSONObject = new JSONObject();
                    }
                    com.bytedance.sdk.openadsdk.slm.lr.lr lrVar3 = lrVar;
                    if (lrVar3 != null) {
                        JSONObject jSONObjectRi = lrVar3.ri();
                        JSONObject jSONObjectIk = lrVar.ik();
                        if (jSONObjectRi != null) {
                            if (jSONObjectIk == null) {
                                jSONObjectIk = new JSONObject();
                            }
                            jSONObjectIk.put("pag_json_data", jSONObjectRi.toString());
                            jSONObject.put("ad_extra_data", jSONObjectIk.toString());
                        } else if (jSONObjectIk != null) {
                            jSONObject.put("ad_extra_data", jSONObjectIk.toString());
                        }
                    }
                    jSONObject.putOpt("log_extra", wjvVar.yjg());
                    jSONObject.putOpt("ua_policy", Integer.valueOf(wjvVar.hd()));
                } catch (Exception unused2) {
                    jSONObject = null;
                }
                new com.bytedance.sdk.openadsdk.ka.ri.C0266ri(j, wjvVar).lr(str).ik(str2).fi(wjvVar.tn()).mj(wjvVar.fe()).ri(wjvVar.tyc()).ri(wjvVar.am()).ri(jSONObject).xha(wjvVar.jf()).ri((com.bytedance.sdk.openadsdk.ka.lr.ri) null);
            }
        });
    }

    public static void ri(wjv wjvVar, String str, final String str2, final int i) {
        ri(System.currentTimeMillis(), wjvVar, str, "playable_track", new com.bytedance.sdk.openadsdk.slm.lr.ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.22
            @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
            public JSONObject ik() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("playable_event", str2);
                } catch (Exception unused) {
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
            public JSONObject ri() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("is_new_playable", 1);
                    jSONObject.put("is_pre_render", i);
                } catch (Exception unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void ri(wjv wjvVar, final com.bytedance.sdk.openadsdk.slm.ri.ri riVar, final String str) {
        ri(System.currentTimeMillis(), wjvVar, str, "web_behavior_keyword", new com.bytedance.sdk.openadsdk.slm.lr.ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.26
            @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
            public JSONObject ik() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("arbi_current_url", riVar.ik());
                    jSONObject.put("keyword", riVar.bu());
                } catch (Throwable th) {
                    ac.ik("TTAD.AdEvent", "onWebBehaviorKeyword", th.getMessage());
                }
                return jSONObject;
            }
        });
    }

    public static void ri(final long j, final wjv wjvVar, String str) {
        if (wjvVar == null || !wjv.ik(wjvVar) || wjvVar.pv() == null) {
            return;
        }
        ri(System.currentTimeMillis(), wjvVar, str, "endcard_close", new com.bytedance.sdk.openadsdk.slm.lr.ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.31
            @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
            public JSONObject ik() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.putOpt("url", wjvVar.pv().ik());
                    jSONObject.putOpt("id", wjvVar.pv().ri());
                    jSONObject.putOpt("md5", wjvVar.pv().lr());
                    if (wjvVar.eu() == null) {
                        return jSONObject;
                    }
                    jSONObject.putOpt("render_type", Integer.valueOf(wjvVar.eu().polloi()));
                    return jSONObject;
                } catch (Exception e) {
                    ac.ik(e.getMessage(), new Object[0]);
                    return jSONObject;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
            public JSONObject lr() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(IronSourceConstants.EVENTS_DURATION, j);
                    return jSONObject;
                } catch (Exception e) {
                    ac.ik(e.getMessage(), new Object[0]);
                    return jSONObject;
                }
            }
        });
    }

    public static void ri(wjv wjvVar, String str, String str2, final long j, final JSONObject jSONObject) {
        if (wjvVar == null || jSONObject == null) {
            return;
        }
        ri(System.currentTimeMillis(), wjvVar, str, str2, new com.bytedance.sdk.openadsdk.slm.lr.ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.32
            @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
            public JSONObject ik() {
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
            public JSONObject lr() {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put(IronSourceConstants.EVENTS_DURATION, j);
                    return jSONObject2;
                } catch (Exception e) {
                    ac.ik("TTAD.AdEvent", e.getMessage());
                    return jSONObject2;
                }
            }
        });
    }

    public static void ri(wjv wjvVar, String str, final JSONObject jSONObject) {
        ri(System.currentTimeMillis(), wjvVar, str, lr.fi, new com.bytedance.sdk.openadsdk.slm.lr.ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.36
            @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
            public JSONObject ri() {
                return jSONObject;
            }
        });
    }

    public static void ri(String str, long j) {
        com.bytedance.sdk.openadsdk.core.mj.ik.ri(str, j);
    }

    @DungeonFlag
    public static void ri(final wjv wjvVar, final String str, final String str2, final String str3, final long j, final long j2, final JSONObject jSONObject, final boolean z) {
        if (wjvVar == null || ri(wjvVar.bnj(), str3)) {
            return;
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        ri(new com.bytedance.sdk.component.mj.lr.ik("sendJsAdEvent") { // from class: com.bytedance.sdk.openadsdk.ka.ik.38
            @Override // java.lang.Runnable
            public void run() {
                JSONArray jSONArrayOptJSONArray;
                String strTyc = wjvVar.tyc();
                if (jSONObject != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        String strOptString = jSONObject.optString("ad_extra_data");
                        if (!TextUtils.isEmpty(strOptString)) {
                            jSONObject2 = new JSONObject(strOptString);
                        }
                        if (!"click".equals(str3)) {
                            jSONObject2.put(X3.i.G, DeviceUtils.xha(com.bytedance.sdk.openadsdk.core.nr.ri()).toString());
                        }
                        if ("click".equals(str3)) {
                            if (z) {
                                jSONObject2.put("click_scence", 1);
                            } else if (dw.lr(wjvVar)) {
                                jSONObject2.put("click_scence", 3);
                            }
                        }
                        if (wjvVar.tp()) {
                            try {
                                JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("pag_json_data");
                                if (jSONObjectOptJSONObject == null) {
                                    jSONObjectOptJSONObject = new JSONObject();
                                }
                                jSONObjectOptJSONObject.put("is_new_playable", 1);
                                if (wjvVar.mm()) {
                                    jSONObjectOptJSONObject.put("is_pre_render", 1);
                                }
                                jSONObject2.put("pag_json_data", jSONObjectOptJSONObject.toString());
                            } catch (Throwable unused) {
                            }
                        }
                        if (com.bytedance.sdk.openadsdk.bgr.ri.ik(wjvVar)) {
                            JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("pag_json_data");
                            if (jSONObjectOptJSONObject2 == null) {
                                jSONObjectOptJSONObject2 = new JSONObject();
                            }
                            jSONObjectOptJSONObject2.put("is_lp_pre_render", wjvVar.wm() ? 1 : 0);
                            jSONObject2.put("pag_json_data", jSONObjectOptJSONObject2.toString());
                        }
                        jSONObject.put("ad_extra_data", jSONObject2.toString());
                        jSONObject.put("tag", str2);
                        int iOptInt = jSONObject2.optInt("agg_request_type", -1);
                        if (z && iOptInt == 2) {
                            strTyc = jSONObject2.optString("app_log_url");
                        }
                        int i = 0;
                        if ("click".equals(str3)) {
                            zf.ik(wjvVar);
                            float fFloatValue = Double.valueOf((System.currentTimeMillis() / 1000) - wjv.lr(jSONObject.optString("log_extra"))).floatValue();
                            JSONObject jSONObject3 = jSONObject;
                            if (fFloatValue <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                fFloatValue = 0.0f;
                            }
                            jSONObject3.putOpt("show_time", Float.valueOf(fFloatValue));
                            if (!TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.aw.ri(com.bytedance.sdk.openadsdk.core.nr.ri()))) {
                                if (z && iOptInt == 2) {
                                    JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("click_tracking_url");
                                    if (jSONArrayOptJSONArray2 != null) {
                                        ArrayList arrayList = new ArrayList();
                                        while (i < jSONArrayOptJSONArray2.length()) {
                                            arrayList.add(jSONArrayOptJSONArray2.optString(i));
                                            i++;
                                        }
                                        com.bytedance.sdk.openadsdk.ka.ri.lr.ri(com.bytedance.sdk.openadsdk.ay.ri.ri(arrayList, true), 2, String.valueOf(j));
                                    }
                                } else {
                                    wjv wjvVar2 = wjvVar;
                                    if (wjvVar2 != null) {
                                        com.bytedance.sdk.openadsdk.ka.ri.lr.ri(com.bytedance.sdk.openadsdk.ay.ri.ri(wjvVar2.bfa(), true), 2, wjvVar.tn());
                                    }
                                }
                            }
                        } else if (C3700q2.v.equals(str3) && !TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.aw.ri(com.bytedance.sdk.openadsdk.core.nr.ri())) && z && iOptInt == 2 && (jSONArrayOptJSONArray = jSONObject2.optJSONArray("show_tracking_url")) != null) {
                            ArrayList arrayList2 = new ArrayList();
                            while (i < jSONArrayOptJSONArray.length()) {
                                arrayList2.add(jSONArrayOptJSONArray.optString(i));
                                i++;
                            }
                            com.bytedance.sdk.openadsdk.ka.ri.lr.ri(com.bytedance.sdk.openadsdk.ay.ri.ri(arrayList2, true), 1, String.valueOf(j));
                        }
                    } catch (Exception unused2) {
                    }
                }
                new com.bytedance.sdk.openadsdk.ka.ri.C0266ri(jCurrentTimeMillis, wjvVar).ka(str).lr(str2).ik(str3).fi(String.valueOf(j)).di(String.valueOf(j2)).ri(strTyc).ri(wjvVar.am()).ri(jSONObject).mj(wjvVar.fe()).xha(wjvVar.jf()).ri((com.bytedance.sdk.openadsdk.ka.lr.ri) null);
            }
        });
    }

    public static void ri(final wjv wjvVar, String str, final long j, final JSONObject jSONObject, final JSONObject jSONObject2) {
        ri(System.currentTimeMillis(), wjvVar, "open_ad", str, new com.bytedance.sdk.openadsdk.slm.lr.ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.39
            @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
            public JSONObject ik() {
                try {
                    JSONObject jSONObject3 = jSONObject;
                    return jSONObject3 != null ? jSONObject3 : new JSONObject();
                } catch (Exception unused) {
                    return null;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
            public JSONObject lr() {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    long j2 = j;
                    if (j2 == -1) {
                        return jSONObject3;
                    }
                    jSONObject3.put(IronSourceConstants.EVENTS_DURATION, j2);
                    return jSONObject3;
                } catch (Exception e) {
                    ac.ik("TTAD.AdEvent", e.getMessage());
                    return jSONObject3;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
            public JSONObject ri() {
                JSONObject jSONObject3 = jSONObject2;
                if (jSONObject3 == null) {
                    jSONObject3 = new JSONObject();
                }
                try {
                    wjv wjvVar2 = wjvVar;
                    if (wjvVar2 != null) {
                        int iQt = wjvVar2.qt();
                        jSONObject3.putOpt("start_type", Integer.valueOf(iQt == 1 ? 1 : 2));
                        jSONObject3.putOpt("load_index", Integer.valueOf(iQt));
                        if (iQt == 1) {
                            jSONObject3.putOpt("init_to_ad_load_time", Long.valueOf(SystemClock.elapsedRealtime() - com.bytedance.sdk.openadsdk.core.vr.ik));
                        }
                    }
                    jSONObject3.putOpt("start_type_backup", Integer.valueOf(com.bytedance.sdk.openadsdk.component.xha.ri.ka()));
                    jSONObject3.putOpt("app_running_time", Long.valueOf(com.bytedance.sdk.openadsdk.component.xha.ri.lr()));
                    return jSONObject3;
                } catch (Exception e) {
                    e.getMessage();
                    return jSONObject3;
                }
            }
        });
    }

    public static void ri(final com.bytedance.sdk.component.mj.lr.ik ikVar) {
        if (ikVar == null) {
            return;
        }
        if (dzy.di()) {
            com.bytedance.sdk.component.utils.jbs.ri().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ka.ik.40
                @Override // java.lang.Runnable
                public void run() {
                    dzy.lr(ikVar, 10);
                }
            });
        } else if (!dzy.xha()) {
            dzy.lr(ikVar, 10);
        } else {
            ikVar.run();
        }
    }

    public static void ri(final com.bytedance.sdk.openadsdk.slm.ri.lr lrVar) {
        if (lrVar == null || lrVar.lr() == null) {
            return;
        }
        final wjv wjvVarLr = lrVar.lr();
        final int iAdz = wjvVarLr.adz();
        if (iAdz == 2 || iAdz == 8 || (ig.ka(wjvVarLr) && lr.ri.ka.equals(lrVar.ri()))) {
            ri(System.currentTimeMillis(), wjvVarLr, lrVar.ik(), "open_browser", new com.bytedance.sdk.openadsdk.slm.lr.ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.41
                @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
                public JSONObject ik() {
                    JSONArray jSONArrayOptJSONArray;
                    JSONObject jSONObject = new JSONObject();
                    try {
                        int iKa = lrVar.ka();
                        jSONObject.put("count", ig.qt(com.bytedance.sdk.openadsdk.core.nr.ri()));
                        jSONObject.put("interceptor", iKa);
                        jSONObject.put("success", lrVar.fi());
                        jSONObject.put("link", lrVar.ri());
                        jSONObject.put("interaction_type", iAdz);
                        jSONObject.put("real_interaction_type", lrVar.xha());
                        if (lrVar.ka() == 9) {
                            jSONObject.put("is_act_signals_api_available", lrVar.mj());
                            jSONObject.put("is_act_signals_callback", lrVar.jbs());
                        }
                        if (!TextUtils.isEmpty(lrVar.di())) {
                            jSONObject.put("exception_msg", lrVar.di());
                        }
                        if (iKa == 2 || iKa == 5) {
                            String strTt = wjvVarLr.tt();
                            if (!TextUtils.isEmpty(strTt) && (jSONArrayOptJSONArray = new JSONObject(strTt).optJSONArray("creatives")) != null && jSONArrayOptJSONArray.length() > 0) {
                                jSONObject.put("meta", jSONArrayOptJSONArray.optJSONObject(wjvVarLr.ik()));
                            }
                        }
                        return jSONObject;
                    } catch (Throwable th) {
                        ac.ik("TTAD.AdEvent", th.getMessage());
                        return jSONObject;
                    }
                }
            });
        }
    }

    public static void ri(JSONObject jSONObject, int i, int i2) {
        try {
            jSONObject.put("skip_show_time", i);
            jSONObject.put("skip_time", i2);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("skip_after_time", i2 - (i * 1000));
            jSONObject.put("pag_json_data", jSONObject2.toString());
        } catch (JSONException unused) {
        }
    }

    public static void ri(wjv wjvVar, String str, int i, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("type", i);
        } catch (JSONException unused) {
        }
        lr(wjvVar, str, "open_ad_land_page_links", jSONObject);
    }

    public static void ri(wjv wjvVar, String str, final boolean z, final boolean z2, final boolean z3, final boolean z4, final int i, final Map<String, Object> map) {
        ri(System.currentTimeMillis(), wjvVar, str, "start_show_plb", new com.bytedance.sdk.openadsdk.slm.lr.ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.42
            @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
            public JSONObject ik() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("isSkip", z);
                    jSONObject.put("force", z2);
                    jSONObject.put("isFromLandingPage", z3);
                    jSONObject.put("finishing", z4);
                    jSONObject.put("from", i);
                    Map map2 = map;
                    if (map2 != null) {
                        for (Map.Entry entry : map2.entrySet()) {
                            jSONObject.put((String) entry.getKey(), entry.getValue());
                        }
                    }
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void ri(final wjv wjvVar, final boolean z, String str, final String str2, final long j, final String str3, final String str4, final int i, final String str5) {
        if (TextUtils.isEmpty(str4)) {
            return;
        }
        ri(System.currentTimeMillis(), wjvVar, str, "load_ugen_template", new com.bytedance.sdk.openadsdk.slm.lr.ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.43
            @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
            public JSONObject ik() {
                wjv.ri riVarSez;
                oh ohVarZv;
                JSONObject jSONObject = new JSONObject();
                try {
                    String str6 = str4;
                    int iHashCode = str6.hashCode();
                    if (iHashCode != -1606803861) {
                        if (iHashCode != 3107) {
                            if (iHashCode == 2989536 && str6.equals("adv3") && (ohVarZv = wjvVar.zv()) != null) {
                                jSONObject.putOpt("url", ohVarZv.ik());
                                jSONObject.putOpt("id", ohVarZv.ri());
                                jSONObject.putOpt("md5", ohVarZv.lr());
                            }
                        } else if (str6.equals("ad") && (riVarSez = wjvVar.sez()) != null) {
                            jSONObject.putOpt("url", riVarSez.aw());
                            jSONObject.putOpt("id", riVarSez.ka());
                            jSONObject.putOpt("md5", riVarSez.bgr());
                        }
                    } else if (str6.equals(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD)) {
                        if (z) {
                            com.bytedance.sdk.openadsdk.core.co.mj.ri riVarIg = wjvVar.ig();
                            if (riVarIg != null) {
                                jSONObject.putOpt("url", riVarIg.ik());
                                jSONObject.putOpt("id", riVarIg.ri());
                                jSONObject.putOpt("md5", riVarIg.lr());
                            }
                        } else {
                            com.bytedance.sdk.openadsdk.core.co.mj.ri riVarPv = wjvVar.pv();
                            if (riVarPv != null) {
                                jSONObject.putOpt("url", riVarPv.ik());
                                jSONObject.putOpt("id", riVarPv.ri());
                                jSONObject.putOpt("md5", riVarPv.lr());
                            }
                        }
                    }
                    jSONObject.put("ugen_status", str2);
                    jSONObject.put("from", str3);
                    jSONObject.put("ugen_scene", str4);
                    if (X3.g.e.equals(str2)) {
                        jSONObject.put("error_code", i);
                        jSONObject.put("error_msg", str5);
                        return jSONObject;
                    }
                } catch (Throwable th) {
                    try {
                        jSONObject.put("error_code", 133);
                        jSONObject.put("error_msg", "send template error " + th.getMessage());
                    } catch (Throwable unused) {
                    }
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
            public JSONObject lr() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(IronSourceConstants.EVENTS_DURATION, j);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    private static boolean ri(int i, String str) {
        int iLr;
        try {
            Set<String> setHd = com.bytedance.sdk.openadsdk.core.settings.sf.lr().hd();
            if ((i == 1 && setHd != null && setHd.contains(str)) || (iLr = com.bytedance.sdk.openadsdk.core.settings.sf.lr().lr(str)) == 0) {
                return true;
            }
            return iLr != 100 && ((int) ((Math.random() * 100.0d) + 1.0d)) > iLr;
        } catch (Throwable th) {
            ac.ik("TTAD.AdEvent", th.getMessage());
            return false;
        }
    }

    public static JSONObject ri(int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad_show_order", i);
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }
}
