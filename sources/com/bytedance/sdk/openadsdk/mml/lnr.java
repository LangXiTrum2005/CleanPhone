package com.bytedance.sdk.openadsdk.mml;

import android.app.Application;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.bqt;
import com.bytedance.sdk.openadsdk.core.model.ekw;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.model.vu;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.fco;
import com.bytedance.sdk.openadsdk.utils.gy;
import com.bytedance.sdk.openadsdk.utils.mrf;
import com.p004ironsource.d9;
import com.pgl.ssdk.ces.out.DungeonFlag;
import com.smartdigimkt.f3.b;
import com.smartdigimkt.x.g;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class lnr {
    public static void lnr(ljh ljhVar, String str, final long j) {
        qdl(System.currentTimeMillis(), ljhVar, str, "load_feeling_duration", new com.bytedance.sdk.openadsdk.bjy.lnr.qdl() { // from class: com.bytedance.sdk.openadsdk.mml.lnr.6
            @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
            public JSONObject ud() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", j);
                } catch (Throwable th) {
                    aaj.lnr("TTAD.AdEvent", th.getMessage());
                }
                jSONObject.toString();
                return jSONObject;
            }
        });
    }

    public static void mml(final ljh ljhVar, final String str, final int i2) {
        qdl(System.currentTimeMillis(), ljhVar, str, "material_status", new com.bytedance.sdk.openadsdk.bjy.lnr.qdl() { // from class: com.bytedance.sdk.openadsdk.mml.lnr.13
            @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
            public JSONObject qdl() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("trigger_type", i2);
                    jSONObject.put("image_mode", ljhVar.vxg());
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void mo(ljh ljhVar, String str, final JSONObject jSONObject) {
        qdl(System.currentTimeMillis(), ljhVar, str, "click_playable_button", new com.bytedance.sdk.openadsdk.bjy.lnr.qdl() { // from class: com.bytedance.sdk.openadsdk.mml.lnr.48
            @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
            public JSONObject qdl() {
                return jSONObject;
            }
        });
    }

    public static void mzz(ljh ljhVar, final com.bytedance.sdk.openadsdk.bjy.qdl.qdl qdlVar, final String str) {
        qdl(System.currentTimeMillis(), ljhVar, str, "web_behavior_click", new com.bytedance.sdk.openadsdk.bjy.lnr.qdl() { // from class: com.bytedance.sdk.openadsdk.mml.lnr.30
            @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
            public JSONObject lnr() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("arbi_current_url", qdlVar.lnr());
                    jSONObject.put("current_url_index", qdlVar.mml());
                    jSONObject.put("arbi_start_x", qdlVar.mzz());
                    jSONObject.put("arbi_start_y", qdlVar.mo());
                    jSONObject.put("click_duration", qdlVar.wd());
                    jSONObject.put("is_trigger_jump", qdlVar.jpc());
                    jSONObject.put("click_type", String.valueOf(qdlVar.exc()));
                } catch (Throwable th) {
                    aaj.lnr("TTAD.AdEvent", "onWebBehaviorClick", th.getMessage());
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
            public JSONObject qdl() {
                try {
                    com.bytedance.sdk.openadsdk.bjy.qdl.qdl qdlVar2 = qdlVar;
                    if (qdlVar2 == null || qdlVar2.qdl() == -1) {
                        return null;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("hit_type", qdlVar.qdl());
                    jSONObject.put("hit_extra", qdlVar.ud());
                    return jSONObject;
                } catch (Throwable unused) {
                    return null;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static JSONObject ud(ljh ljhVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (vu.ud(ljhVar) && ljhVar.ip()) {
            try {
                jSONObject.put("is_new_playable", 1);
            } catch (Throwable th) {
                aaj.lnr(th.getMessage(), new Object[0]);
            }
        }
        qdl(jSONObject);
        return jSONObject;
    }

    public static void lnr(ljh ljhVar, String str, final int i2) {
        qdl(System.currentTimeMillis(), ljhVar, str, "check_meta_more", new com.bytedance.sdk.openadsdk.bjy.lnr.qdl() { // from class: com.bytedance.sdk.openadsdk.mml.lnr.8
            @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
            public JSONObject lnr() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("error_code", i2);
                    jSONObject.put("check_url", com.bytedance.sdk.openadsdk.core.settings.rq.lnr().uw());
                    return jSONObject;
                } catch (Throwable th) {
                    aaj.lnr(th.toString(), new Object[0]);
                    return jSONObject;
                }
            }
        });
    }

    public static void mml(ljh ljhVar, final com.bytedance.sdk.openadsdk.bjy.qdl.qdl qdlVar, final String str) {
        qdl(System.currentTimeMillis(), ljhVar, str, "web_behavior_scroll", new com.bytedance.sdk.openadsdk.bjy.lnr.qdl() { // from class: com.bytedance.sdk.openadsdk.mml.lnr.29
            @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
            public JSONObject lnr() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("arbi_current_url", qdlVar.lnr());
                    jSONObject.put("current_url_index", qdlVar.mml());
                    jSONObject.put("trigger_scroll_x", qdlVar.tvp());
                    jSONObject.put("trigger_scroll_y", qdlVar.to());
                    jSONObject.put("arbi_offset_y", qdlVar.rq());
                    jSONObject.put("scroll_type", qdlVar.fs());
                    jSONObject.put("scroll_duration", qdlVar.exu());
                } catch (Throwable th) {
                    aaj.lnr("TTAD.AdEvent", "onWebBehaviorScroll", th.getMessage());
                }
                return jSONObject;
            }
        });
    }

    public static void mzz(ljh ljhVar, String str, final JSONObject jSONObject) {
        qdl(System.currentTimeMillis(), ljhVar, str, "click_next_ad_button", new com.bytedance.sdk.openadsdk.bjy.lnr.qdl() { // from class: com.bytedance.sdk.openadsdk.mml.lnr.47
            @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
            public JSONObject qdl() {
                return jSONObject;
            }
        });
    }

    public static void qdl() {
        try {
            Class.forName(lnr.class.getName());
        } catch (ClassNotFoundException unused) {
        }
    }

    public static class qdl {
        public static void qdl(String str, final JSONObject jSONObject, ljh ljhVar) {
            String strQdl = gy.qdl(ljhVar);
            if (strQdl == null) {
                return;
            }
            lnr.qdl(System.currentTimeMillis(), ljhVar, strQdl.concat("_landingpage"), str, new com.bytedance.sdk.openadsdk.bjy.lnr.qdl() { // from class: com.bytedance.sdk.openadsdk.mml.lnr.qdl.1
                @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
                public JSONObject lnr() {
                    return jSONObject;
                }
            });
        }

        public static void qdl(final int i2, final int i3, ljh ljhVar) {
            String strQdl = gy.qdl(ljhVar);
            if (strQdl == null) {
                return;
            }
            lnr.qdl(System.currentTimeMillis(), ljhVar, strQdl.concat("_landingpage"), "local_res_hit_rate", new com.bytedance.sdk.openadsdk.bjy.lnr.qdl() { // from class: com.bytedance.sdk.openadsdk.mml.lnr.qdl.2
                @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
                public JSONObject lnr() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("all_times", i3);
                        jSONObject.put("hit_times", i2);
                        return jSONObject;
                    } catch (Throwable th) {
                        Log.d("TTAD.AdEvent", "Gecko.localResHitRate error", th);
                        return jSONObject;
                    }
                }
            });
        }

        public static void qdl(final long j, final ljh ljhVar, String str, final ILoader iLoader, final String str2) {
            if (str == null) {
                return;
            }
            lnr.qdl(System.currentTimeMillis(), ljhVar, str, "landingpage_init", new com.bytedance.sdk.openadsdk.bjy.lnr.qdl() { // from class: com.bytedance.sdk.openadsdk.mml.lnr.qdl.3
                @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
                public JSONObject lnr() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        int iQdl = com.bytedance.sdk.openadsdk.wd.ud.qdl().qdl(iLoader, str2);
                        jSONObject.put("url", ljhVar.od());
                        jSONObject.put("channel_name", ljhVar.xmr());
                        jSONObject.put("interceptor_status", (TextUtils.isEmpty(ljhVar.xmr()) || iQdl <= 0) ? 0 : 1);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("resource_count", iQdl);
                        jSONObject.put("resource_info", jSONObject2);
                        return jSONObject;
                    } catch (Throwable th) {
                        Log.d("TTAD.AdEvent", "Gecko.localResHitRate error", th);
                        return jSONObject;
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
                public JSONObject qdl() {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(ljh.ud, ljhVar.se() ? 1 : 0);
                        return jSONObject;
                    } catch (Throwable unused) {
                        return null;
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
                public JSONObject ud() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("duration", j);
                        return jSONObject;
                    } catch (Throwable th) {
                        Log.d("TTAD.AdEvent", "Gecko.localResHitRate error", th);
                        return jSONObject;
                    }
                }
            });
        }

        public static void qdl(final int i2, final int i3, final int i4, final int i5, final ljh ljhVar, String str, final int i6) {
            if (str == null || TextUtils.isEmpty(ljhVar.xmr())) {
                return;
            }
            lnr.qdl(System.currentTimeMillis(), ljhVar, str, "landing_page_resource_detail", new com.bytedance.sdk.openadsdk.bjy.lnr.qdl() { // from class: com.bytedance.sdk.openadsdk.mml.lnr.qdl.4
                @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
                public JSONObject lnr() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("next_url", ljhVar.od());
                        jSONObject.put("channel_name", ljhVar.xmr());
                        jSONObject.put("preload_status", i2 <= 0 ? 0 : 2);
                        jSONObject.put("first_page", i6);
                        jSONObject.put("preload_h5_type", ljhVar.kdv());
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("channel_response", i2);
                        jSONObject2.put("failResourceCount", i3);
                        jSONObject2.put("successCount", i4);
                        jSONObject2.put("failCount", i5);
                        jSONObject.put("resource_info", jSONObject2);
                        return jSONObject;
                    } catch (Throwable th) {
                        Log.d("TTAD.AdEvent", "Gecko.localResHitRate error", th);
                        return jSONObject;
                    }
                }
            });
        }
    }

    public static void lnr(final ljh ljhVar, String str) {
        if (ljhVar == null || !ljh.lnr(ljhVar) || ljhVar.vu() == null) {
            return;
        }
        qdl(System.currentTimeMillis(), ljhVar, str, "endcard_show", new com.bytedance.sdk.openadsdk.bjy.lnr.qdl() { // from class: com.bytedance.sdk.openadsdk.mml.lnr.25
            @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
            public JSONObject lnr() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.putOpt("url", ljhVar.vu().lnr());
                    jSONObject.putOpt("id", ljhVar.vu().qdl());
                    jSONObject.putOpt("md5", ljhVar.vu().ud());
                    if (ljhVar.tdy() != null) {
                        jSONObject.putOpt("render_type", Integer.valueOf(ljhVar.tdy().mml()));
                    }
                } catch (Exception unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void mml(ljh ljhVar, String str, final JSONObject jSONObject) {
        qdl(System.currentTimeMillis(), ljhVar, str, "show_next_ad_hint", new com.bytedance.sdk.openadsdk.bjy.lnr.qdl() { // from class: com.bytedance.sdk.openadsdk.mml.lnr.46
            @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
            public JSONObject qdl() {
                return jSONObject;
            }
        });
    }

    public static void qdl(ljh ljhVar, String str, final int i2) {
        qdl(System.currentTimeMillis(), ljhVar, str, "open_url_h5", new com.bytedance.sdk.openadsdk.bjy.lnr.qdl() { // from class: com.bytedance.sdk.openadsdk.mml.lnr.1
            @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
            public JSONObject lnr() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.putOpt("render_type", "h5");
                    jSONObject.putOpt("render_type_2", 0);
                    jSONObject.putOpt("preload_status", Integer.valueOf(i2));
                } catch (Exception unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void qdl(final ljh ljhVar, String str) {
        qdl(System.currentTimeMillis(), ljhVar, str, "endcard_load_start", new com.bytedance.sdk.openadsdk.bjy.lnr.qdl() { // from class: com.bytedance.sdk.openadsdk.mml.lnr.12
            @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
            public JSONObject lnr() {
                JSONObject jSONObject = new JSONObject();
                try {
                    if (ljh.lnr(ljhVar)) {
                        if (ljhVar.vu() != null) {
                            jSONObject.putOpt("url", ljhVar.vu().lnr());
                            jSONObject.putOpt("id", ljhVar.vu().qdl());
                            jSONObject.putOpt("md5", ljhVar.vu().ud());
                        }
                        if (ljhVar.tdy() != null) {
                            jSONObject.putOpt("render_type", 7);
                            return jSONObject;
                        }
                    } else {
                        jSONObject.putOpt("url", ljhVar.tdy().fs());
                        jSONObject.putOpt("style_id", ljhVar.bqt());
                        if (ljhVar.tdy() != null) {
                            jSONObject.putOpt("render_type", 0);
                            return jSONObject;
                        }
                    }
                } catch (Exception e2) {
                    aaj.lnr(e2.getMessage(), new Object[0]);
                }
                return jSONObject;
            }
        });
    }

    public static void lnr(ljh ljhVar, final com.bytedance.sdk.openadsdk.bjy.qdl.qdl qdlVar, final String str) {
        qdl(System.currentTimeMillis(), ljhVar, str, "web_behavior_stay", new com.bytedance.sdk.openadsdk.bjy.lnr.qdl() { // from class: com.bytedance.sdk.openadsdk.mml.lnr.28
            @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
            public JSONObject lnr() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("arbi_current_url", qdlVar.lnr());
                    jSONObject.put("current_url_index", qdlVar.mml());
                    jSONObject.put("arbi_stay_duration", qdlVar.rdp());
                    jSONObject.put("browsing_percentage", qdlVar.bjy());
                    jSONObject.put("out_focus_scene", qdlVar.jtx());
                } catch (Throwable th) {
                    aaj.lnr("TTAD.AdEvent", "onWebBehaviorStay", th.getMessage());
                }
                return jSONObject;
            }
        });
    }

    public static void qdl(final ljh ljhVar, String str, final long j) {
        qdl(System.currentTimeMillis(), ljhVar, str, "endcard_load_finish", new com.bytedance.sdk.openadsdk.bjy.lnr.qdl() { // from class: com.bytedance.sdk.openadsdk.mml.lnr.22
            @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
            public JSONObject lnr() {
                JSONObject jSONObject = new JSONObject();
                try {
                    if (ljh.lnr(ljhVar)) {
                        if (ljhVar.vu() != null) {
                            jSONObject.putOpt("url", ljhVar.vu().lnr());
                            jSONObject.putOpt("id", ljhVar.vu().qdl());
                            jSONObject.putOpt("md5", ljhVar.vu().ud());
                        }
                        if (ljhVar.tdy() != null) {
                            jSONObject.putOpt("render_type", 7);
                            return jSONObject;
                        }
                    } else {
                        jSONObject.putOpt("url", ljhVar.tdy().fs());
                        jSONObject.putOpt("style_id", ljhVar.bqt());
                        if (ljhVar.tdy() != null) {
                            jSONObject.putOpt("render_type", 0);
                            return jSONObject;
                        }
                    }
                } catch (Exception e2) {
                    aaj.lnr(e2.getMessage(), new Object[0]);
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
            public JSONObject ud() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", j);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void lnr(ljh ljhVar, String str, String str2, final JSONObject jSONObject) {
        if (ljhVar == null || jSONObject == null) {
            return;
        }
        qdl(System.currentTimeMillis(), ljhVar, str, str2, new com.bytedance.sdk.openadsdk.bjy.lnr.qdl() { // from class: com.bytedance.sdk.openadsdk.mml.lnr.36
            @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
            public JSONObject lnr() {
                return jSONObject;
            }
        });
    }

    public static void qdl(final ljh ljhVar, String str, final long j, final int i2, final String str2, final String str3) {
        qdl(System.currentTimeMillis(), ljhVar, str, "endcard_load_fail", new com.bytedance.sdk.openadsdk.bjy.lnr.qdl() { // from class: com.bytedance.sdk.openadsdk.mml.lnr.33
            @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
            public JSONObject lnr() {
                JSONObject jSONObject = new JSONObject();
                try {
                    if (ljh.lnr(ljhVar)) {
                        if (ljhVar.vu() != null) {
                            jSONObject.putOpt("url", ljhVar.vu().lnr());
                            jSONObject.putOpt("id", ljhVar.vu().qdl());
                            jSONObject.putOpt("md5", ljhVar.vu().ud());
                        }
                        if (ljhVar.tdy() != null) {
                            jSONObject.putOpt("render_type", 7);
                        }
                    } else {
                        jSONObject.putOpt("url", ljhVar.tdy().fs());
                        jSONObject.putOpt("style_id", ljhVar.bqt());
                        if (!TextUtils.isEmpty(str3)) {
                            jSONObject.putOpt("error_url", str3);
                        }
                        if (ljhVar.tdy() != null) {
                            jSONObject.putOpt("render_type", 0);
                        }
                    }
                    jSONObject.put("error_code", i2);
                    jSONObject.put("error_msg", str2);
                    return jSONObject;
                } catch (Exception e2) {
                    aaj.lnr(e2.getMessage(), new Object[0]);
                    return jSONObject;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
            public JSONObject ud() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", j);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void ud(ljh ljhVar, String str, final long j) {
        if (ljhVar != null && j > 0 && j < 200000) {
            qdl(System.currentTimeMillis(), ljhVar, str, "video_click_duration", new com.bytedance.sdk.openadsdk.bjy.lnr.qdl() { // from class: com.bytedance.sdk.openadsdk.mml.lnr.3
                @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
                public JSONObject lnr() {
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

    public static void lnr(ljh ljhVar, String str, JSONObject jSONObject) {
        if (ljhVar == null) {
            return;
        }
        qdl(ljhVar, str, -1L, jSONObject);
    }

    public static void qdl(final ljh ljhVar, String str, final long j, final int i2, final int i3) {
        qdl(System.currentTimeMillis(), ljhVar, str, "load", new com.bytedance.sdk.openadsdk.bjy.lnr.qdl() { // from class: com.bytedance.sdk.openadsdk.mml.lnr.44
            @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
            public JSONObject lnr() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.putOpt("render_type", "h5");
                    jSONObject.putOpt("render_type_2", 0);
                    jSONObject.putOpt("interaction_method", Integer.valueOf(ljhVar.tid()));
                    jSONObject.put("first_page", i3);
                    jSONObject.put("preload_h5_type", ljhVar.kdv());
                    int i4 = i2;
                    if (i4 >= 0) {
                        jSONObject.putOpt("preload_status", Integer.valueOf(i4));
                    }
                } catch (Exception unused) {
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
            public JSONObject ud() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", Math.min(j, TTAdConstant.AD_MAX_EVENT_TIME));
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void ud(ljh ljhVar, String str, final int i2) {
        qdl(System.currentTimeMillis(), ljhVar, str, "check_meta", new com.bytedance.sdk.openadsdk.bjy.lnr.qdl() { // from class: com.bytedance.sdk.openadsdk.mml.lnr.7
            @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
            public JSONObject lnr() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("error_code", i2);
                    jSONObject.put("check_url", com.bytedance.sdk.openadsdk.core.settings.rq.lnr().uw());
                    return jSONObject;
                } catch (Throwable th) {
                    aaj.lnr(th.toString(), new Object[0]);
                    return jSONObject;
                }
            }
        });
    }

    public static void qdl(String str, ljh ljhVar, String str2, final Map<String, Object> map) {
        qdl(System.currentTimeMillis(), ljhVar, str2, str, new com.bytedance.sdk.openadsdk.bjy.lnr.qdl() { // from class: com.bytedance.sdk.openadsdk.mml.lnr.49
            @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
            public JSONObject lnr() {
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

    public static void ud(final ljh ljhVar, String str) {
        qdl(System.currentTimeMillis(), ljhVar, str, "picture_click", new com.bytedance.sdk.openadsdk.bjy.lnr.qdl() { // from class: com.bytedance.sdk.openadsdk.mml.lnr.14
            @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
            public JSONObject lnr() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("ad_slot_type", ljhVar.vz());
                    jSONObject.put("interaction_method", ljhVar.tid());
                    return jSONObject;
                } catch (Throwable th) {
                    aaj.lnr(th.toString(), new Object[0]);
                    return jSONObject;
                }
            }
        });
    }

    public static void qdl(long j, ljh ljhVar, String str, String str2, final JSONObject jSONObject) {
        qdl(j, ljhVar, str, str2, new com.bytedance.sdk.openadsdk.bjy.lnr.qdl() { // from class: com.bytedance.sdk.openadsdk.mml.lnr.50
            @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
            public JSONObject lnr() {
                return jSONObject;
            }
        });
    }

    public static void ud(ljh ljhVar, String str, String str2, final JSONObject jSONObject) {
        qdl(System.currentTimeMillis(), ljhVar, str, str2, new com.bytedance.sdk.openadsdk.bjy.lnr.qdl() { // from class: com.bytedance.sdk.openadsdk.mml.lnr.18
            @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
            public JSONObject lnr() {
                return jSONObject;
            }
        });
    }

    @DungeonFlag
    public static void qdl(ljh ljhVar, String str, JSONObject jSONObject, JSONObject jSONObject2) {
        qdl(ljhVar, "show", str, jSONObject, jSONObject2);
    }

    public static void ud(final long j, final ljh ljhVar, String str, final String str2) {
        qdl(System.currentTimeMillis(), ljhVar, str, "endcard_feeling_duraion", new com.bytedance.sdk.openadsdk.bjy.lnr.qdl() { // from class: com.bytedance.sdk.openadsdk.mml.lnr.24
            @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
            public JSONObject lnr() {
                JSONObject jSONObject = new JSONObject();
                try {
                    if (ljh.lnr(ljhVar)) {
                        if (ljhVar.vu() != null) {
                            jSONObject.putOpt("url", ljhVar.vu().lnr());
                            jSONObject.putOpt("id", ljhVar.vu().qdl());
                            jSONObject.putOpt("md5", ljhVar.vu().ud());
                        }
                        jSONObject.putOpt("from", str2);
                        if (ljhVar.tdy() != null) {
                            jSONObject.putOpt("render_type", 7);
                            return jSONObject;
                        }
                    } else {
                        jSONObject.put("url", ljhVar.tdy().fs());
                        jSONObject.put("style_id", ljhVar.bqt());
                        if (ljhVar.tdy() != null) {
                            jSONObject.putOpt("render_type", 0);
                            return jSONObject;
                        }
                    }
                } catch (Exception e2) {
                    aaj.lnr(e2.getMessage(), new Object[0]);
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
            public JSONObject ud() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", j);
                    return jSONObject;
                } catch (Exception e2) {
                    aaj.lnr(e2.getMessage(), new Object[0]);
                    return jSONObject;
                }
            }
        });
    }

    @DungeonFlag
    private static void qdl(final ljh ljhVar, final String str, final String str2, final JSONObject jSONObject, final JSONObject jSONObject2) {
        if (ljhVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        if (ljhVar.gy() && "show".equals(str)) {
            return;
        }
        if ("show".equals(str)) {
            ljhVar.wd(true);
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        qdl(new com.bytedance.sdk.component.jpc.jpc("onShow") { // from class: com.bytedance.sdk.openadsdk.mml.lnr.51
            @Override // java.lang.Runnable
            public void run() {
                final String strQdl;
                if (com.bytedance.sdk.openadsdk.core.yt.mml().aaj()) {
                    strQdl = com.bytedance.sdk.openadsdk.core.to.qdl.qdl.qdl((Application) com.bytedance.sdk.openadsdk.core.yt.qdl()).qdl(str2, DeviceUtils.qdl(), ljhVar.fz());
                } else {
                    strQdl = "none";
                }
                lnr.qdl(jCurrentTimeMillis, ljhVar, str2, str, new com.bytedance.sdk.openadsdk.bjy.lnr.qdl() { // from class: com.bytedance.sdk.openadsdk.mml.lnr.51.1
                    @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
                    public JSONObject lnr() {
                        try {
                            AnonymousClass51 anonymousClass51 = AnonymousClass51.this;
                            JSONObject jSONObject3 = jSONObject;
                            if (jSONObject3 != null) {
                                jSONObject3.put("interaction_method", ljhVar.tid());
                                AnonymousClass51 anonymousClass52 = AnonymousClass51.this;
                                jSONObject.put("real_interaction_method", ljhVar.taz());
                                jSONObject.put(b.f35026Q, com.bytedance.sdk.openadsdk.core.yt.mml().exu(String.valueOf(ljhVar.fz())));
                                jSONObject.put("au_show", strQdl);
                                return jSONObject;
                            }
                            JSONObject jSONObject4 = new JSONObject();
                            jSONObject4.put("interaction_method", ljhVar.tid());
                            jSONObject4.put("real_interaction_method", ljhVar.taz());
                            jSONObject4.put(b.f35026Q, com.bytedance.sdk.openadsdk.core.yt.mml().exu(String.valueOf(ljhVar.fz())));
                            jSONObject4.put("au_show", strQdl);
                            return jSONObject4;
                        } catch (Throwable unused) {
                            return null;
                        }
                    }

                    @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
                    public JSONObject qdl() {
                        AnonymousClass51 anonymousClass51 = AnonymousClass51.this;
                        JSONObject jSONObject3 = jSONObject2;
                        JSONObject jSONObjectUd = jSONObject3 == null ? lnr.ud(ljhVar, new JSONObject()) : lnr.ud(ljhVar, jSONObject3);
                        if ("show".equals(str)) {
                            com.bytedance.sdk.openadsdk.component.mml.qdl.qdl(jSONObjectUd, ljhVar.ok());
                        }
                        return jSONObjectUd;
                    }

                    @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
                    public JSONObject ud() {
                        Object obj;
                        try {
                            bqt.ud(ljhVar);
                            JSONObject jSONObject3 = new JSONObject();
                            try {
                                jSONObject3.putOpt("log_extra", ljhVar.ir());
                                float fFloatValue = Double.valueOf((System.currentTimeMillis() / 1000) - ljhVar.wsn()).floatValue();
                                if (fFloatValue <= 0.0f) {
                                    fFloatValue = 0.0f;
                                }
                                jSONObject3.putOpt("show_time", Float.valueOf(fFloatValue));
                                jSONObject3.putOpt("ua_policy", Integer.valueOf(ljhVar.jle()));
                                String strTqd = ljhVar.tqd();
                                if (!TextUtils.isEmpty(strTqd) && !TextUtils.isEmpty(strTqd)) {
                                    try {
                                        jSONObject3.put("ttdsp_price", Math.round(Float.parseFloat(strTqd) * 100000.0f));
                                    } catch (Throwable th) {
                                        jSONObject3.put("ttdsp_price", 0);
                                        aaj.lnr("TTAD.AdEvent", th.getMessage());
                                    }
                                }
                                if (ljhVar.dsy() == null) {
                                    return jSONObject3;
                                }
                                try {
                                    Object obj2 = ljhVar.dsy().get(TTAdConstant.SDK_BIDDING_TYPE);
                                    if (obj2 == null || Integer.parseInt(obj2.toString()) != 2 || (obj = ljhVar.dsy().get("price")) == null) {
                                        return jSONObject3;
                                    }
                                    jSONObject3.put("ttdsp_price", Math.round(Double.parseDouble(obj.toString()) * 100000.0d));
                                    return jSONObject3;
                                } catch (Throwable th2) {
                                    aaj.qdl("TTAD.AdEvent", "client bidding price error: ", th2);
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
                });
                if ("show".equals(str)) {
                    if (!ljhVar.yk()) {
                        if (ljhVar.au()) {
                            com.bytedance.sdk.openadsdk.core.fs.ud.lnr.qdl(ljhVar.eta(), new com.bytedance.sdk.openadsdk.core.fs.ud.lnr.ud("show_urls", ljhVar));
                        } else {
                            lnr.qdl(ljhVar);
                        }
                    }
                    JSONObject jSONObject3 = jSONObject;
                    if (jSONObject3 != null) {
                        int iOptInt = jSONObject3.optInt("dynamic_show_type");
                        if (ljhVar.mrf() == 1 && (iOptInt == 7 || iOptInt == 10)) {
                            com.bytedance.sdk.component.utils.tvp.qdl().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.mml.lnr.51.2
                                @Override // java.lang.Runnable
                                public void run() {
                                    JSONObject jSONObject4 = new JSONObject();
                                    try {
                                        jSONObject4.put("auto_click", true);
                                        AnonymousClass51 anonymousClass51 = AnonymousClass51.this;
                                        lnr.ud(ljhVar, str2, "click", jSONObject4);
                                    } catch (Exception unused) {
                                        aaj.lnr("TTAD.AdEvent", "ugen click exception");
                                    }
                                }
                            }, com.bytedance.sdk.openadsdk.core.settings.rq.lnr().jle());
                        }
                    }
                    com.bytedance.sdk.openadsdk.core.to.lnr.qdl(ljhVar, strQdl);
                }
            }
        });
    }

    public static void ud(ljh ljhVar, final com.bytedance.sdk.openadsdk.bjy.qdl.qdl qdlVar, final String str) {
        qdl(System.currentTimeMillis(), ljhVar, str, "web_behavior_load", new com.bytedance.sdk.openadsdk.bjy.lnr.qdl() { // from class: com.bytedance.sdk.openadsdk.mml.lnr.27
            @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
            public JSONObject lnr() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("arbi_current_url", qdlVar.lnr());
                    jSONObject.put("current_url_index", qdlVar.mml());
                    jSONObject.put("arbi_load_duration", qdlVar.jl());
                } catch (Throwable th) {
                    aaj.lnr("TTAD.AdEvent", "onWebBehaviorLoad", th.getMessage());
                }
                return jSONObject;
            }
        });
    }

    public static void ud(ljh ljhVar, String str, String str2, final JSONObject jSONObject, final long j) {
        if (ljhVar == null || jSONObject == null) {
            return;
        }
        qdl(System.currentTimeMillis(), ljhVar, str, str2, new com.bytedance.sdk.openadsdk.bjy.lnr.qdl() { // from class: com.bytedance.sdk.openadsdk.mml.lnr.35
            @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
            public JSONObject lnr() {
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
            public JSONObject ud() {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("duration", j);
                } catch (Throwable unused) {
                }
                return jSONObject2;
            }
        });
    }

    public static void ud(ljh ljhVar, String str, final JSONObject jSONObject) {
        qdl(System.currentTimeMillis(), ljhVar, str, ud.mo, new com.bytedance.sdk.openadsdk.bjy.lnr.qdl() { // from class: com.bytedance.sdk.openadsdk.mml.lnr.38
            @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
            public JSONObject qdl() {
                return jSONObject;
            }
        });
    }

    public static void ud(ljh ljhVar, String str, JSONObject jSONObject, JSONObject jSONObject2) {
        qdl(ljhVar, "activity_recreate", str, jSONObject, jSONObject2);
    }

    public static void ud(ljh ljhVar, String str, int i2, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("type", i2);
        } catch (JSONException unused) {
        }
        ud(ljhVar, str, "download_app_ad_track", jSONObject);
    }

    private static void qdl(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            JSONObject jSONObjectQdl = jpc.qdl();
            if (jSONObjectQdl != null) {
                Iterator<String> itKeys = jSONObjectQdl.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObject.put(next, jSONObjectQdl.get(next));
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static void qdl(ljh ljhVar) {
        if (TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.fs.qdl(com.bytedance.sdk.openadsdk.core.yt.qdl()))) {
            return;
        }
        com.bytedance.sdk.openadsdk.mml.qdl.ud.qdl(com.bytedance.sdk.openadsdk.bch.qdl.qdl(ljhVar.eta(), true), 1, ljhVar.yre());
    }

    @DungeonFlag
    public static void qdl(final String str, final ljh ljhVar, final String str2, final wd wdVar) {
        if (ljhVar == null || wdVar == null || !wdVar.qdl()) {
            return;
        }
        qdl(System.currentTimeMillis(), ljhVar, str2, "ad_show_time", new com.bytedance.sdk.openadsdk.bjy.lnr.qdl() { // from class: com.bytedance.sdk.openadsdk.mml.lnr.52
            @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
            public JSONObject lnr() {
                try {
                    wd wdVar2 = wdVar;
                    if (wdVar2 == null || wdVar2.ud() == null) {
                        return null;
                    }
                    JSONObject jSONObjectUd = wdVar.ud();
                    if (str2.equals("open_ad")) {
                        jSONObjectUd.put("is_icon_only", ljhVar.xmv() ? 1 : 0);
                    }
                    return jSONObjectUd;
                } catch (Throwable unused) {
                    return null;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
            public JSONObject ud() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", str);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void qdl(final ljh ljhVar, final String str, final mrf mrfVar) {
        if (ljhVar == null) {
            return;
        }
        final long jMml = mrfVar.mml();
        qdl(System.currentTimeMillis(), ljhVar, str, "stay_duration", new com.bytedance.sdk.openadsdk.bjy.lnr.qdl() { // from class: com.bytedance.sdk.openadsdk.mml.lnr.2
            @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
            public JSONObject lnr() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("click_stay_time", jMml);
                    jSONObject.put(g.K, mrfVar.qdl);
                    if (str.equals("open_ad")) {
                        jSONObject.put("is_icon_only", ljhVar.xmv() ? 1 : 0);
                    }
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void qdl(ljh ljhVar, final String str, final int i2, final String str2, final long j, final boolean z2, final int i3, final long j2) {
        qdl(System.currentTimeMillis(), ljhVar, str, ud.mml, new com.bytedance.sdk.openadsdk.bjy.lnr.qdl() { // from class: com.bytedance.sdk.openadsdk.mml.lnr.4
            @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
            public JSONObject lnr() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("invisible_scene", i2);
                    jSONObject.put("arbi_current_url", str2);
                    jSONObject.put("loading_visible_time", j);
                    jSONObject.put("arbi_trigger_start", z2);
                    jSONObject.put("arbi_convert_count", i3);
                    jSONObject.put("loading_start_timestamp", j2);
                } catch (Throwable th) {
                    aaj.lnr(th.toString(), new Object[0]);
                }
                return jSONObject;
            }
        });
    }

    public static void qdl(ljh ljhVar, String str, final long j, final boolean z2) {
        qdl(System.currentTimeMillis(), ljhVar, str, "lp_loading", new com.bytedance.sdk.openadsdk.bjy.lnr.qdl() { // from class: com.bytedance.sdk.openadsdk.mml.lnr.5
            @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
            public JSONObject lnr() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("if_lp_loading_success", z2 ? 1 : 2);
                    return jSONObject;
                } catch (Throwable th) {
                    aaj.lnr(th.toString(), new Object[0]);
                    return jSONObject;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
            public JSONObject ud() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", j);
                    return jSONObject;
                } catch (Throwable th) {
                    aaj.lnr(th.toString(), new Object[0]);
                    return jSONObject;
                }
            }
        });
    }

    public static void qdl(ljh ljhVar, String str, final int i2, final String str2, final int i3) {
        qdl(System.currentTimeMillis(), ljhVar, str, ud.qdl, new com.bytedance.sdk.openadsdk.bjy.lnr.qdl() { // from class: com.bytedance.sdk.openadsdk.mml.lnr.9
            @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
            public JSONObject lnr() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("index", i2);
                    jSONObject.put("arbi_current_url", str2);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
            public JSONObject qdl() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("new_index", i3);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void qdl(ljh ljhVar, final String str, final int i2, final String str2, final float f) {
        qdl(System.currentTimeMillis(), ljhVar, str, ud.ud, new com.bytedance.sdk.openadsdk.bjy.lnr.qdl() { // from class: com.bytedance.sdk.openadsdk.mml.lnr.10
            @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
            public JSONObject lnr() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("index", i2);
                    jSONObject.put("arbi_current_url", str2);
                    jSONObject.put("arbi_load_duration", f);
                } catch (Throwable th) {
                    aaj.lnr(th.toString(), new Object[0]);
                }
                return jSONObject;
            }
        });
    }

    public static void qdl(ljh ljhVar, final String str, final int i2, final String str2, final String str3, final int i3) {
        qdl(System.currentTimeMillis(), ljhVar, str, ud.lnr, new com.bytedance.sdk.openadsdk.bjy.lnr.qdl() { // from class: com.bytedance.sdk.openadsdk.mml.lnr.11
            @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
            public JSONObject lnr() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("index", i2);
                    jSONObject.put("arbi_current_url", str2);
                    jSONObject.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_LOAD_URL, str3);
                    jSONObject.put("url_flag", i3);
                } catch (Throwable th) {
                    aaj.lnr(th.toString(), new Object[0]);
                }
                return jSONObject;
            }
        });
    }

    @DungeonFlag
    public static void qdl(final String str, final ljh ljhVar, final com.bytedance.sdk.openadsdk.core.model.fs fsVar, final String str2, final boolean z2, final Map<String, Object> map, final int i2) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        qdl(new com.bytedance.sdk.component.jpc.jpc("onClick") { // from class: com.bytedance.sdk.openadsdk.mml.lnr.15
            @Override // java.lang.Runnable
            public void run() {
                ljh ljhVar2 = ljhVar;
                if (ljhVar2 == null) {
                    return;
                }
                lnr.qdl(jCurrentTimeMillis, ljhVar2, str2, str, new com.bytedance.sdk.openadsdk.bjy.lnr.qdl() { // from class: com.bytedance.sdk.openadsdk.mml.lnr.15.1
                    @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
                    public JSONObject ud() {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            com.bytedance.sdk.openadsdk.core.model.fs fsVar2 = fsVar;
                            if (fsVar2 != null) {
                                JSONObject jSONObjectQdl = fsVar2.qdl();
                                jSONObjectQdl.put("is_valid", z2);
                                int i3 = i2;
                                if (i3 > 0 && i3 <= 2) {
                                    jSONObjectQdl.put("user_behavior_type", i3);
                                }
                                Map map2 = map;
                                if (map2 != null) {
                                    if (map2.containsKey("duration")) {
                                        jSONObject.put("duration", map.get("duration"));
                                    }
                                    for (Map.Entry entry : map.entrySet()) {
                                        if (!"duration".equals(entry.getKey())) {
                                            jSONObjectQdl.put((String) entry.getKey(), entry.getValue());
                                        }
                                    }
                                }
                                jSONObjectQdl.put("interaction_method", ljhVar.tid());
                                if (str2.equals("open_ad")) {
                                    jSONObjectQdl.put("is_icon_only", ljhVar.xmv() ? 1 : 0);
                                }
                                jSONObject.put("ad_extra_data", jSONObjectQdl.toString());
                            }
                            jSONObject.putOpt("log_extra", ljhVar.ir());
                            float fFloatValue = Double.valueOf((System.currentTimeMillis() / 1000) - ljhVar.wsn()).floatValue();
                            if (fFloatValue <= 0.0f) {
                                fFloatValue = 0.0f;
                            }
                            jSONObject.putOpt("show_time", Float.valueOf(fFloatValue));
                            jSONObject.putOpt("ua_policy", Integer.valueOf(ljhVar.jle()));
                        } catch (Exception unused) {
                        }
                        return jSONObject;
                    }
                });
                if (!TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.fs.qdl(com.bytedance.sdk.openadsdk.core.yt.qdl())) && "click".equals(str)) {
                    com.bytedance.sdk.openadsdk.mml.qdl.ud.qdl(com.bytedance.sdk.openadsdk.bch.qdl.qdl(ljhVar.vr(), true), 2, ljhVar.yre());
                }
                if ("click".equals(str)) {
                    bqt.lnr(ljhVar);
                }
            }
        });
    }

    public static void qdl(ljh ljhVar, String str, String str2, final JSONObject jSONObject) {
        qdl(System.currentTimeMillis(), ljhVar, str, str2, new com.bytedance.sdk.openadsdk.bjy.lnr.qdl() { // from class: com.bytedance.sdk.openadsdk.mml.lnr.16
            @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
            public JSONObject lnr() {
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
            public JSONObject ud() {
                if (jSONObject == null) {
                    return null;
                }
                JSONObject jSONObject2 = new JSONObject();
                try {
                    if (jSONObject.has("duration")) {
                        jSONObject2.put("duration", jSONObject.get("duration"));
                        return jSONObject2;
                    }
                } catch (Exception e2) {
                    aaj.lnr("TTAD.AdEvent", e2.getMessage());
                }
                return jSONObject2;
            }
        });
        if ("click".equals(str2)) {
            bqt.lnr(ljhVar);
        }
    }

    public static void qdl(ljh ljhVar, String str, final String str2, final long j, final int i2, JSONObject jSONObject, final wd wdVar) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        final JSONObject jSONObject2 = jSONObject;
        qdl(System.currentTimeMillis(), ljhVar, str, str2, new com.bytedance.sdk.openadsdk.bjy.lnr.qdl() { // from class: com.bytedance.sdk.openadsdk.mml.lnr.17
            @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
            public JSONObject lnr() {
                wd wdVar2;
                try {
                    if (("feed_break".equals(str2) || "feed_over".equals(str2)) && (wdVar2 = wdVar) != null) {
                        wdVar2.qdl(jSONObject2);
                    }
                    return jSONObject2;
                } catch (Throwable unused) {
                    return null;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
            public JSONObject ud() {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("duration", j);
                    jSONObject3.put("percent", i2);
                } catch (Throwable unused) {
                }
                return jSONObject3;
            }
        });
    }

    public static void qdl(ljh ljhVar, String str, String str2, final JSONObject jSONObject, final long j) {
        qdl(System.currentTimeMillis(), ljhVar, str, str2, new com.bytedance.sdk.openadsdk.bjy.lnr.qdl() { // from class: com.bytedance.sdk.openadsdk.mml.lnr.19
            @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
            public JSONObject lnr() {
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
            public JSONObject ud() {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("duration", j);
                } catch (Exception unused) {
                }
                return jSONObject2;
            }
        });
    }

    public static void qdl(final ljh ljhVar, String str, String str2, final Map<String, Object> map) {
        qdl(System.currentTimeMillis(), ljhVar, str, str2, new com.bytedance.sdk.openadsdk.bjy.lnr.qdl() { // from class: com.bytedance.sdk.openadsdk.mml.lnr.20
            @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
            public JSONObject lnr() {
                JSONObject jSONObject = new JSONObject();
                try {
                    Map map2 = map;
                    if (map2 != null) {
                        for (Map.Entry entry : map2.entrySet()) {
                            jSONObject.put((String) entry.getKey(), entry.getValue());
                        }
                    }
                    jSONObject.put("dp_creative_type", ljhVar.ikv());
                } catch (Exception unused) {
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
            public JSONObject ud() {
                JSONObject jSONObject = new JSONObject();
                try {
                    Map map2 = map;
                    if (map2 != null) {
                        Object obj = map2.get("duration");
                        if (obj instanceof Long) {
                            jSONObject.put("duration", obj);
                        }
                    }
                } catch (Exception unused) {
                }
                return jSONObject;
            }
        });
    }

    @DungeonFlag
    public static void qdl(long j, ljh ljhVar, String str, String str2) {
        qdl(j, ljhVar, str, str2, (com.bytedance.sdk.openadsdk.bjy.lnr.ud) null);
    }

    @DungeonFlag
    public static void qdl(final long j, final ljh ljhVar, final String str, final String str2, final com.bytedance.sdk.openadsdk.bjy.lnr.ud udVar) {
        if (ljhVar == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || qdl(ljhVar.cx(), str2)) {
            return;
        }
        qdl(new com.bytedance.sdk.component.jpc.jpc(str2) { // from class: com.bytedance.sdk.openadsdk.mml.lnr.21
            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObject;
                try {
                    com.bytedance.sdk.openadsdk.bjy.lnr.ud udVar2 = udVar;
                    if (udVar2 != null) {
                        jSONObject = udVar2.ud();
                        if (jSONObject == null) {
                            try {
                                jSONObject = new JSONObject();
                            } catch (Exception unused) {
                            }
                        }
                    } else {
                        jSONObject = new JSONObject();
                    }
                    com.bytedance.sdk.openadsdk.bjy.lnr.ud udVar3 = udVar;
                    if (udVar3 != null) {
                        JSONObject jSONObjectQdl = udVar3.qdl();
                        JSONObject jSONObjectLnr = udVar.lnr();
                        if (jSONObjectQdl != null) {
                            if (jSONObjectLnr == null) {
                                jSONObjectLnr = new JSONObject();
                            }
                            jSONObjectLnr.put("pag_json_data", jSONObjectQdl.toString());
                            jSONObject.put("ad_extra_data", jSONObjectLnr.toString());
                        } else if (jSONObjectLnr != null) {
                            jSONObject.put("ad_extra_data", jSONObjectLnr.toString());
                        }
                    }
                    jSONObject.putOpt("log_extra", ljhVar.ir());
                    jSONObject.putOpt("ua_policy", Integer.valueOf(ljhVar.jle()));
                } catch (Exception unused2) {
                    jSONObject = null;
                }
                new com.bytedance.sdk.openadsdk.mml.qdl.C0145qdl(j, ljhVar).ud(str).lnr(str2).mzz(ljhVar.yre()).jpc(ljhVar.wc()).qdl(ljhVar.skm()).qdl(jSONObject).wd(ljhVar.cev()).qdl((com.bytedance.sdk.openadsdk.mml.ud.qdl) null);
            }
        });
    }

    public static void qdl(ljh ljhVar, String str, final String str2, final int i2) {
        qdl(System.currentTimeMillis(), ljhVar, str, "playable_track", new com.bytedance.sdk.openadsdk.bjy.lnr.qdl() { // from class: com.bytedance.sdk.openadsdk.mml.lnr.23
            @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
            public JSONObject lnr() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("playable_event", str2);
                } catch (Exception unused) {
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
            public JSONObject qdl() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("is_new_playable", 1);
                    jSONObject.put("is_pre_render", i2);
                } catch (Exception unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void qdl(ljh ljhVar, final com.bytedance.sdk.openadsdk.bjy.qdl.qdl qdlVar, final String str) {
        qdl(System.currentTimeMillis(), ljhVar, str, "web_behavior_keyword", new com.bytedance.sdk.openadsdk.bjy.lnr.qdl() { // from class: com.bytedance.sdk.openadsdk.mml.lnr.26
            @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
            public JSONObject lnr() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("arbi_current_url", qdlVar.lnr());
                    jSONObject.put("keyword", qdlVar.yt());
                } catch (Throwable th) {
                    aaj.lnr("TTAD.AdEvent", "onWebBehaviorKeyword", th.getMessage());
                }
                return jSONObject;
            }
        });
    }

    public static void qdl(final long j, final ljh ljhVar, String str) {
        if (ljhVar == null || !ljh.lnr(ljhVar) || ljhVar.vu() == null) {
            return;
        }
        qdl(System.currentTimeMillis(), ljhVar, str, "endcard_close", new com.bytedance.sdk.openadsdk.bjy.lnr.qdl() { // from class: com.bytedance.sdk.openadsdk.mml.lnr.31
            @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
            public JSONObject lnr() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.putOpt("url", ljhVar.vu().lnr());
                    jSONObject.putOpt("id", ljhVar.vu().qdl());
                    jSONObject.putOpt("md5", ljhVar.vu().ud());
                    if (ljhVar.tdy() != null) {
                        jSONObject.putOpt("render_type", Integer.valueOf(ljhVar.tdy().mml()));
                        return jSONObject;
                    }
                } catch (Exception e2) {
                    aaj.lnr(e2.getMessage(), new Object[0]);
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
            public JSONObject ud() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", j);
                    return jSONObject;
                } catch (Exception e2) {
                    aaj.lnr(e2.getMessage(), new Object[0]);
                    return jSONObject;
                }
            }
        });
    }

    public static void qdl(ljh ljhVar, String str, final String str2) {
        qdl(System.currentTimeMillis(), ljhVar, str, "show_error", new com.bytedance.sdk.openadsdk.bjy.lnr.qdl() { // from class: com.bytedance.sdk.openadsdk.mml.lnr.32
            @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
            public JSONObject lnr() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.putOpt("error_msg", str2);
                } catch (Exception unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void qdl(ljh ljhVar, String str, String str2, final long j, final JSONObject jSONObject) {
        if (ljhVar == null || jSONObject == null) {
            return;
        }
        qdl(System.currentTimeMillis(), ljhVar, str, str2, new com.bytedance.sdk.openadsdk.bjy.lnr.qdl() { // from class: com.bytedance.sdk.openadsdk.mml.lnr.34
            @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
            public JSONObject lnr() {
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
            public JSONObject ud() {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("duration", j);
                    return jSONObject2;
                } catch (Exception e2) {
                    aaj.lnr("TTAD.AdEvent", e2.getMessage());
                    return jSONObject2;
                }
            }
        });
    }

    public static void qdl(ljh ljhVar, String str, final JSONObject jSONObject) {
        qdl(System.currentTimeMillis(), ljhVar, str, ud.mzz, new com.bytedance.sdk.openadsdk.bjy.lnr.qdl() { // from class: com.bytedance.sdk.openadsdk.mml.lnr.37
            @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
            public JSONObject qdl() {
                return jSONObject;
            }
        });
    }

    public static void qdl(String str, long j) {
        com.bytedance.sdk.openadsdk.core.jpc.lnr.qdl(str, j);
    }

    @DungeonFlag
    public static void qdl(final ljh ljhVar, final String str, final String str2, final String str3, final long j, final long j2, final JSONObject jSONObject, final boolean z2) {
        if (ljhVar == null || qdl(ljhVar.cx(), str3)) {
            return;
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        qdl(new com.bytedance.sdk.component.jpc.jpc("sendJsAdEvent") { // from class: com.bytedance.sdk.openadsdk.mml.lnr.39
            @Override // java.lang.Runnable
            public void run() {
                JSONArray jSONArrayOptJSONArray;
                String strSkm = ljhVar.skm();
                if (jSONObject != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        String strOptString = jSONObject.optString("ad_extra_data");
                        if (!TextUtils.isEmpty(strOptString)) {
                            jSONObject2 = new JSONObject(strOptString);
                        }
                        if (!"click".equals(str3)) {
                            jSONObject2.put(d9.h.G, DeviceUtils.wd(com.bytedance.sdk.openadsdk.core.yt.qdl()).toString());
                        }
                        if ("click".equals(str3)) {
                            if (z2) {
                                jSONObject2.put("click_scence", 1);
                            } else if (vu.ud(ljhVar)) {
                                jSONObject2.put("click_scence", 3);
                            }
                        }
                        if (ljhVar.ip()) {
                            try {
                                JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("pag_json_data");
                                if (jSONObjectOptJSONObject == null) {
                                    jSONObjectOptJSONObject = new JSONObject();
                                }
                                jSONObjectOptJSONObject.put("is_new_playable", 1);
                                if (ljhVar.kz()) {
                                    jSONObjectOptJSONObject.put("is_pre_render", 1);
                                }
                                jSONObject2.put("pag_json_data", jSONObjectOptJSONObject.toString());
                            } catch (Throwable unused) {
                            }
                        }
                        int i2 = 0;
                        if (com.bytedance.sdk.openadsdk.exu.qdl.lnr(ljhVar)) {
                            JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("pag_json_data");
                            if (jSONObjectOptJSONObject2 == null) {
                                jSONObjectOptJSONObject2 = new JSONObject();
                            }
                            jSONObjectOptJSONObject2.put("is_lp_pre_render", ljhVar.tu() ? 1 : 0);
                            jSONObject2.put("pag_json_data", jSONObjectOptJSONObject2.toString());
                        }
                        jSONObject.put("ad_extra_data", jSONObject2.toString());
                        jSONObject.put("tag", str2);
                        int iOptInt = jSONObject2.optInt("agg_request_type", -1);
                        if (z2 && iOptInt == 2) {
                            strSkm = jSONObject2.optString("app_log_url");
                        }
                        if ("click".equals(str3)) {
                            bqt.lnr(ljhVar);
                            float fFloatValue = Double.valueOf((System.currentTimeMillis() / 1000) - ljh.ud(jSONObject.optString("log_extra"))).floatValue();
                            JSONObject jSONObject3 = jSONObject;
                            if (fFloatValue <= 0.0f) {
                                fFloatValue = 0.0f;
                            }
                            jSONObject3.putOpt("show_time", Float.valueOf(fFloatValue));
                            if (!TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.fs.qdl(com.bytedance.sdk.openadsdk.core.yt.qdl()))) {
                                if (z2 && iOptInt == 2) {
                                    JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("click_tracking_url");
                                    if (jSONArrayOptJSONArray2 != null) {
                                        ArrayList arrayList = new ArrayList();
                                        while (i2 < jSONArrayOptJSONArray2.length()) {
                                            arrayList.add(jSONArrayOptJSONArray2.optString(i2));
                                            i2++;
                                        }
                                        com.bytedance.sdk.openadsdk.mml.qdl.ud.qdl(com.bytedance.sdk.openadsdk.bch.qdl.qdl(arrayList, true), 2, String.valueOf(j));
                                    }
                                } else {
                                    ljh ljhVar2 = ljhVar;
                                    if (ljhVar2 != null) {
                                        com.bytedance.sdk.openadsdk.mml.qdl.ud.qdl(com.bytedance.sdk.openadsdk.bch.qdl.qdl(ljhVar2.vr(), true), 2, ljhVar.yre());
                                    }
                                }
                            }
                        } else if ("show".equals(str3) && !TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.fs.qdl(com.bytedance.sdk.openadsdk.core.yt.qdl())) && z2 && iOptInt == 2 && (jSONArrayOptJSONArray = jSONObject2.optJSONArray("show_tracking_url")) != null) {
                            ArrayList arrayList2 = new ArrayList();
                            while (i2 < jSONArrayOptJSONArray.length()) {
                                arrayList2.add(jSONArrayOptJSONArray.optString(i2));
                                i2++;
                            }
                            com.bytedance.sdk.openadsdk.mml.qdl.ud.qdl(com.bytedance.sdk.openadsdk.bch.qdl.qdl(arrayList2, true), 1, String.valueOf(j));
                        }
                    } catch (Exception unused2) {
                    }
                }
                new com.bytedance.sdk.openadsdk.mml.qdl.C0145qdl(jCurrentTimeMillis, ljhVar).mml(str).ud(str2).lnr(str3).mzz(String.valueOf(j)).mo(String.valueOf(j2)).qdl(strSkm).qdl(jSONObject).jpc(ljhVar.wc()).wd(ljhVar.cev()).qdl((com.bytedance.sdk.openadsdk.mml.ud.qdl) null);
            }
        });
    }

    public static void qdl(final ljh ljhVar, String str, final long j, final JSONObject jSONObject) {
        qdl(System.currentTimeMillis(), ljhVar, "open_ad", str, new com.bytedance.sdk.openadsdk.bjy.lnr.qdl() { // from class: com.bytedance.sdk.openadsdk.mml.lnr.40
            @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
            public JSONObject lnr() {
                try {
                    JSONObject jSONObject2 = jSONObject;
                    return jSONObject2 != null ? jSONObject2 : new JSONObject();
                } catch (Exception unused) {
                    return null;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
            public JSONObject qdl() {
                JSONObject jSONObject2 = new JSONObject();
                com.bytedance.sdk.openadsdk.component.mml.qdl.qdl(jSONObject2, ljhVar.ok());
                return jSONObject2;
            }

            @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
            public JSONObject ud() {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    long j2 = j;
                    if (j2 != -1) {
                        jSONObject2.put("duration", j2);
                        return jSONObject2;
                    }
                } catch (Exception e2) {
                    aaj.lnr("TTAD.AdEvent", e2.getMessage());
                }
                return jSONObject2;
            }
        });
    }

    public static void qdl(final com.bytedance.sdk.component.jpc.jpc jpcVar) {
        if (jpcVar == null) {
            return;
        }
        if (fco.mo()) {
            com.bytedance.sdk.component.utils.tvp.qdl().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.mml.lnr.41
                @Override // java.lang.Runnable
                public void run() {
                    fco.ud(jpcVar, 10);
                }
            });
        } else if (!fco.wd()) {
            fco.ud(jpcVar, 10);
        } else {
            jpcVar.run();
        }
    }

    public static void qdl(final com.bytedance.sdk.openadsdk.bjy.qdl.ud udVar) {
        if (udVar == null || udVar.ud() == null) {
            return;
        }
        final ljh ljhVarUd = udVar.ud();
        final int iYgv = ljhVarUd.ygv();
        if (iYgv == 2 || iYgv == 8 || (gy.mml(ljhVarUd) && ud.qdl.mml.equals(udVar.qdl()))) {
            qdl(System.currentTimeMillis(), ljhVarUd, udVar.lnr(), "open_browser", new com.bytedance.sdk.openadsdk.bjy.lnr.qdl() { // from class: com.bytedance.sdk.openadsdk.mml.lnr.42
                @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
                public JSONObject lnr() {
                    JSONArray jSONArrayOptJSONArray;
                    JSONObject jSONObject = new JSONObject();
                    try {
                        int iMml = udVar.mml();
                        jSONObject.put("count", gy.to(com.bytedance.sdk.openadsdk.core.yt.qdl()));
                        jSONObject.put("interceptor", iMml);
                        jSONObject.put("success", udVar.mzz());
                        jSONObject.put("link", udVar.qdl());
                        jSONObject.put("interaction_type", iYgv);
                        jSONObject.put("real_interaction_type", udVar.wd());
                        if (udVar.mml() == 9) {
                            jSONObject.put("is_act_signals_api_available", udVar.jpc());
                            jSONObject.put("is_act_signals_callback", udVar.tvp());
                        }
                        if (!TextUtils.isEmpty(udVar.mo())) {
                            jSONObject.put("exception_msg", udVar.mo());
                        }
                        if (iMml == 2 || iMml == 5) {
                            String strJbc = ljhVarUd.jbc();
                            if (!TextUtils.isEmpty(strJbc) && (jSONArrayOptJSONArray = new JSONObject(strJbc).optJSONArray("creatives")) != null && jSONArrayOptJSONArray.length() > 0) {
                                jSONObject.put("meta", jSONArrayOptJSONArray.optJSONObject(ljhVarUd.lnr()));
                                return jSONObject;
                            }
                        }
                    } catch (Throwable th) {
                        aaj.lnr("TTAD.AdEvent", th.getMessage());
                    }
                    return jSONObject;
                }
            });
        }
    }

    public static void qdl(JSONObject jSONObject, int i2, int i3) {
        try {
            jSONObject.put("skip_show_time", i2);
            jSONObject.put("skip_time", i3);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("skip_after_time", i3 - (i2 * 1000));
            jSONObject.put("pag_json_data", jSONObject2.toString());
        } catch (JSONException unused) {
        }
    }

    public static void qdl(ljh ljhVar, String str, int i2, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("type", i2);
        } catch (JSONException unused) {
        }
        ud(ljhVar, str, "open_ad_land_page_links", jSONObject);
    }

    public static void qdl(ljh ljhVar, String str, final boolean z2, final boolean z3, final boolean z4, final boolean z5, final int i2, final Map<String, Object> map) {
        qdl(System.currentTimeMillis(), ljhVar, str, "start_show_plb", new com.bytedance.sdk.openadsdk.bjy.lnr.qdl() { // from class: com.bytedance.sdk.openadsdk.mml.lnr.43
            @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
            public JSONObject lnr() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("isSkip", z2);
                    jSONObject.put("force", z3);
                    jSONObject.put("isFromLandingPage", z4);
                    jSONObject.put("finishing", z5);
                    jSONObject.put("from", i2);
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

    public static void qdl(final ljh ljhVar, final boolean z2, String str, final String str2, final long j, final String str3, final String str4, final int i2, final String str5) {
        qdl(System.currentTimeMillis(), ljhVar, str, "load_ugen_template", new com.bytedance.sdk.openadsdk.bjy.lnr.qdl() { // from class: com.bytedance.sdk.openadsdk.mml.lnr.45
            /* JADX WARN: Code duplicated, block: B:21:0x0041  */
            @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
            public JSONObject lnr() {
                byte b2;
                ekw ekwVarKr;
                JSONObject jSONObject = new JSONObject();
                try {
                    String str6 = str4;
                    int iHashCode = str6.hashCode();
                    if (iHashCode != -1606803861) {
                        if (iHashCode != 3107) {
                            if (iHashCode == 2989536 && str6.equals("adv3")) {
                                b2 = 2;
                            } else {
                                b2 = -1;
                            }
                        } else if (str6.equals("ad")) {
                            b2 = 1;
                        } else {
                            b2 = -1;
                        }
                    } else if (str6.equals("endcard")) {
                        b2 = 0;
                    } else {
                        b2 = -1;
                    }
                    if (b2 != 0) {
                        if (b2 == 1) {
                            ljh.qdl qdlVarXdk = ljhVar.xdk();
                            if (qdlVarXdk != null) {
                                jSONObject.putOpt("url", qdlVarXdk.exu());
                                jSONObject.putOpt("id", qdlVarXdk.mml());
                                jSONObject.putOpt("md5", qdlVarXdk.rdp());
                            }
                        } else if (b2 == 2 && (ekwVarKr = ljhVar.kr()) != null) {
                            jSONObject.putOpt("url", ekwVarKr.lnr());
                            jSONObject.putOpt("id", ekwVarKr.qdl());
                            jSONObject.putOpt("md5", ekwVarKr.ud());
                        }
                    } else if (z2) {
                        com.bytedance.sdk.openadsdk.core.rq.jpc.qdl qdlVarRc = ljhVar.rc();
                        if (qdlVarRc != null) {
                            jSONObject.putOpt("url", qdlVarRc.lnr());
                            jSONObject.putOpt("id", qdlVarRc.qdl());
                            jSONObject.putOpt("md5", qdlVarRc.ud());
                        }
                    } else {
                        com.bytedance.sdk.openadsdk.core.rq.jpc.qdl qdlVarVu = ljhVar.vu();
                        if (qdlVarVu != null) {
                            jSONObject.putOpt("url", qdlVarVu.lnr());
                            jSONObject.putOpt("id", qdlVarVu.qdl());
                            jSONObject.putOpt("md5", qdlVarVu.ud());
                        }
                    }
                    jSONObject.put("ugen_status", str2);
                    jSONObject.put("from", str3);
                    jSONObject.put("ugen_scene", str4);
                    if ("fail".equals(str2)) {
                        jSONObject.put("error_code", i2);
                        jSONObject.put("error_msg", str5);
                        return jSONObject;
                    }
                } catch (Throwable th) {
                    try {
                        jSONObject.put("error_code", Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE);
                        jSONObject.put("error_msg", "send template error " + th.getMessage());
                    } catch (Throwable unused) {
                    }
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
            public JSONObject ud() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", j);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    private static boolean qdl(int i2, String str) {
        int iUd;
        try {
            Set<String> setIw = com.bytedance.sdk.openadsdk.core.settings.rq.lnr().iw();
            if ((i2 == 1 && setIw != null && setIw.contains(str)) || (iUd = com.bytedance.sdk.openadsdk.core.settings.rq.lnr().ud(str)) == 0) {
                return true;
            }
            return iUd != 100 && ((int) ((Math.random() * 100.0d) + 1.0d)) > iUd;
        } catch (Throwable th) {
            aaj.lnr("TTAD.AdEvent", th.getMessage());
            return false;
        }
    }

    public static JSONObject qdl(int i2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad_show_order", i2);
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }
}
