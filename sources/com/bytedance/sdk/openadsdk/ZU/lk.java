package com.bytedance.sdk.openadsdk.ZU;

import android.app.Application;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.eK;
import com.bytedance.sdk.openadsdk.core.model.id;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.utils.CG;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.Sfi;
import com.bytedance.sdk.openadsdk.utils.hg;
import com.bytedance.sdk.openadsdk.utils.nJ;
import com.efs.sdk.base.Constants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.pgl.ssdk.ces.out.DungeonFlag;
import com.umeng.analytics.pro.bc;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class lk {
    public static void JXs(tD tDVar, final com.bytedance.sdk.openadsdk.STP.Lxb.Lxb lxb, final String str) {
        Lxb(System.currentTimeMillis(), tDVar, str, "web_behavior_click", new com.bytedance.sdk.openadsdk.STP.lk.Lxb() { // from class: com.bytedance.sdk.openadsdk.ZU.lk.31
            @Override // com.bytedance.sdk.openadsdk.STP.lk.Lxb
            public JSONObject Lxb() {
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("arbi_current_url", lxb.lk());
                    jSONObject2.put("current_url_index", lxb.ZU());
                    jSONObject2.put("arbi_start_x", lxb.JXs());
                    jSONObject2.put("arbi_start_y", lxb.lc());
                    jSONObject2.put("click_duration", lxb.ebl());
                    jSONObject2.put("is_trigger_jump", lxb.OY());
                    jSONObject2.put("click_type", String.valueOf(lxb.tD()));
                    if (lxb.Lxb() != -1) {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("hit_type", lxb.Lxb());
                        jSONObject3.put("hit_extra", lxb.LD());
                        jSONObject2.put("pag_json_data", jSONObject3.toString());
                    }
                    jSONObject.put("ad_extra_data", jSONObject2.toString());
                } catch (Throwable th) {
                    Sfi.LD("TTAD.AdEvent", "onWebBehaviorClick", th.getMessage());
                }
                return jSONObject;
            }
        });
    }

    public static void LD(tD tDVar, String str, final long j) {
        if (tDVar != null && j > 0 && j < 200000) {
            Lxb(System.currentTimeMillis(), tDVar, str, "video_click_duration", new com.bytedance.sdk.openadsdk.STP.lk.Lxb() { // from class: com.bytedance.sdk.openadsdk.ZU.lk.3
                @Override // com.bytedance.sdk.openadsdk.STP.lk.Lxb
                public JSONObject Lxb() {
                    JSONObject jSONObject = new JSONObject();
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject.put("video_click_duration_time", j);
                        jSONObject2.put("ad_extra_data", jSONObject.toString());
                    } catch (Throwable unused) {
                    }
                    return jSONObject2;
                }
            });
        }
    }

    @WorkerThread
    public static void Lxb() {
        try {
            Class.forName(lk.class.getName());
        } catch (ClassNotFoundException unused) {
        }
    }

    @DungeonFlag
    private static void ZU(final tD tDVar, final String str, final String str2, final JSONObject jSONObject) {
        if (tDVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        if (tDVar.zqY() && "show".equals(str)) {
            return;
        }
        if ("show".equals(str)) {
            tDVar.OY(true);
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        Lxb(new com.bytedance.sdk.component.OY.OY("onShow") { // from class: com.bytedance.sdk.openadsdk.ZU.lk.49
            @Override // java.lang.Runnable
            public void run() {
                final String strLxb;
                if (com.bytedance.sdk.openadsdk.core.kqm.ZU().jeq()) {
                    strLxb = com.bytedance.sdk.openadsdk.core.QAg.Lxb.Lxb.Lxb((Application) com.bytedance.sdk.openadsdk.core.kqm.Lxb()).Lxb(str2, DeviceUtils.Lxb(), tDVar.Td());
                } else {
                    strLxb = Constants.CP_NONE;
                }
                lk.Lxb(jCurrentTimeMillis, tDVar, str2, str, new com.bytedance.sdk.openadsdk.STP.lk.Lxb() { // from class: com.bytedance.sdk.openadsdk.ZU.lk.49.1
                    @Override // com.bytedance.sdk.openadsdk.STP.lk.Lxb
                    public JSONObject Lxb() {
                        Object obj;
                        try {
                            eK.LD(tDVar);
                            JSONObject jSONObject2 = new JSONObject();
                            try {
                                AnonymousClass49 anonymousClass49 = AnonymousClass49.this;
                                JSONObject jSONObject3 = jSONObject;
                                if (jSONObject3 != null) {
                                    jSONObject3.put("interaction_method", tDVar.brP());
                                    AnonymousClass49 anonymousClass410 = AnonymousClass49.this;
                                    jSONObject.put("real_interaction_method", tDVar.kqm());
                                    jSONObject.put("video_skip_result", com.bytedance.sdk.openadsdk.core.kqm.ZU().NXR(String.valueOf(tDVar.Td())));
                                    jSONObject.put("au_show", strLxb);
                                    AnonymousClass49 anonymousClass411 = AnonymousClass49.this;
                                    com.bytedance.sdk.openadsdk.tD.Lxb.Lxb.Lxb(tDVar, jSONObject);
                                    jSONObject2.put("ad_extra_data", jSONObject.toString());
                                } else {
                                    JSONObject jSONObject4 = new JSONObject();
                                    jSONObject4.put("interaction_method", tDVar.brP());
                                    jSONObject4.put("real_interaction_method", tDVar.kqm());
                                    jSONObject4.put("video_skip_result", com.bytedance.sdk.openadsdk.core.kqm.ZU().NXR(String.valueOf(tDVar.Td())));
                                    jSONObject4.put("au_show", strLxb);
                                    com.bytedance.sdk.openadsdk.tD.Lxb.Lxb.Lxb(tDVar, jSONObject4);
                                    jSONObject2.put("ad_extra_data", jSONObject4.toString());
                                }
                                jSONObject2.putOpt("log_extra", tDVar.Lv());
                                float fFloatValue = Double.valueOf((System.currentTimeMillis() / 1000) - tDVar.kRz()).floatValue();
                                if (fFloatValue <= 0.0f) {
                                    fFloatValue = 0.0f;
                                }
                                jSONObject2.putOpt("show_time", Float.valueOf(fFloatValue));
                                jSONObject2.putOpt("ua_policy", Integer.valueOf(tDVar.BcA()));
                                String strKPU = tDVar.KPU();
                                if (!TextUtils.isEmpty(strKPU) && !TextUtils.isEmpty(strKPU)) {
                                    try {
                                        jSONObject2.put("ttdsp_price", Math.round(Float.parseFloat(strKPU) * 100000.0f));
                                    } catch (Throwable th) {
                                        jSONObject2.put("ttdsp_price", 0);
                                        com.bytedance.sdk.component.utils.sLN.Lxb("TTAD.AdEvent", th.getMessage());
                                    }
                                }
                                if (tDVar.Hu() == null) {
                                    return jSONObject2;
                                }
                                try {
                                    Object obj2 = tDVar.Hu().get(TTAdConstant.SDK_BIDDING_TYPE);
                                    if (obj2 == null || Integer.parseInt(obj2.toString()) != 2 || (obj = tDVar.Hu().get("price")) == null) {
                                        return jSONObject2;
                                    }
                                    jSONObject2.put("ttdsp_price", Math.round(Double.parseDouble(obj.toString()) * 100000.0d));
                                    return jSONObject2;
                                } catch (Throwable th2) {
                                    com.bytedance.sdk.component.utils.sLN.Lxb("TTAD.AdEvent", "client bidding price error: ", th2);
                                    return jSONObject2;
                                }
                            } catch (Exception unused) {
                                return jSONObject2;
                            }
                        } catch (Exception unused2) {
                            return null;
                        }
                    }
                });
                if ("show".equals(str)) {
                    if (!tDVar.Bj()) {
                        if (tDVar.JP()) {
                            com.bytedance.sdk.openadsdk.core.sLN.LD.lk.Lxb(tDVar.SS(), new com.bytedance.sdk.openadsdk.core.sLN.LD.lk.LD("show_urls", tDVar));
                        } else {
                            lk.Lxb(tDVar);
                        }
                    }
                    JSONObject jSONObject2 = jSONObject;
                    if (jSONObject2 != null) {
                        int iOptInt = jSONObject2.optInt("dynamic_show_type");
                        if (tDVar.aBz() == 1 && (iOptInt == 7 || iOptInt == 10)) {
                            com.bytedance.sdk.component.utils.ebl.Lxb().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ZU.lk.49.2
                                @Override // java.lang.Runnable
                                public void run() {
                                    JSONObject jSONObject3 = new JSONObject();
                                    try {
                                        jSONObject3.put("auto_click", true);
                                        AnonymousClass49 anonymousClass49 = AnonymousClass49.this;
                                        lk.LD(tDVar, str2, CampaignEx.JSON_NATIVE_VIDEO_CLICK, jSONObject3);
                                    } catch (Exception unused) {
                                        com.bytedance.sdk.component.utils.sLN.Lxb("TTAD.AdEvent", "ugen click exception");
                                    }
                                }
                            }, com.bytedance.sdk.openadsdk.core.settings.VVE.TA().AcC());
                        }
                    }
                    com.bytedance.sdk.openadsdk.core.QAg.lk.Lxb(tDVar, strLxb);
                }
            }
        });
    }

    public static void lk(tD tDVar, String str, final long j) {
        Lxb(System.currentTimeMillis(), tDVar, str, "load_feeling_duration", new com.bytedance.sdk.openadsdk.STP.lk.Lxb() { // from class: com.bytedance.sdk.openadsdk.ZU.lk.6
            @Override // com.bytedance.sdk.openadsdk.STP.lk.Lxb
            public JSONObject Lxb() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", j);
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.sLN.Lxb("TTAD.AdEvent", th.getMessage());
                }
                jSONObject.toString();
                return jSONObject;
            }
        });
    }

    public static void JXs(tD tDVar, String str, JSONObject jSONObject) {
        ZU(tDVar, "activity_recreate", str, jSONObject);
    }

    public static void LD(tD tDVar, String str, final int i) {
        Lxb(System.currentTimeMillis(), tDVar, str, "check_meta", new com.bytedance.sdk.openadsdk.STP.lk.Lxb() { // from class: com.bytedance.sdk.openadsdk.ZU.lk.7
            @Override // com.bytedance.sdk.openadsdk.STP.lk.Lxb
            public JSONObject Lxb() {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject.put("error_code", i);
                    jSONObject.put("check_url", com.bytedance.sdk.openadsdk.core.settings.VVE.TA().Rt());
                    jSONObject2.put("ad_extra_data", jSONObject.toString());
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.sLN.LD(th.toString());
                }
                return jSONObject2;
            }
        });
    }

    public static void Lxb(tD tDVar, String str, final int i) {
        Lxb(System.currentTimeMillis(), tDVar, str, "open_url_h5", new com.bytedance.sdk.openadsdk.STP.lk.Lxb() { // from class: com.bytedance.sdk.openadsdk.ZU.lk.1
            @Override // com.bytedance.sdk.openadsdk.STP.lk.Lxb
            public JSONObject Lxb() {
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.putOpt("render_type", "h5");
                    jSONObject2.putOpt("render_type_2", 0);
                    jSONObject2.putOpt("preload_status", Integer.valueOf(i));
                    jSONObject.putOpt("ad_extra_data", jSONObject2.toString());
                } catch (Exception unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void lk(tD tDVar, String str, final int i) {
        Lxb(System.currentTimeMillis(), tDVar, str, "check_meta_more", new com.bytedance.sdk.openadsdk.STP.lk.Lxb() { // from class: com.bytedance.sdk.openadsdk.ZU.lk.8
            @Override // com.bytedance.sdk.openadsdk.STP.lk.Lxb
            public JSONObject Lxb() {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject.put("error_code", i);
                    jSONObject.put("check_url", com.bytedance.sdk.openadsdk.core.settings.VVE.TA().Rt());
                    jSONObject2.put("ad_extra_data", jSONObject.toString());
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.sLN.LD(th.toString());
                }
                return jSONObject2;
            }
        });
    }

    public static class Lxb {
        public static void Lxb(String str, final JSONObject jSONObject, tD tDVar) {
            String strLxb = nJ.Lxb(tDVar);
            if (strLxb == null) {
                return;
            }
            lk.Lxb(System.currentTimeMillis(), tDVar, strLxb.concat("_landingpage"), str, new com.bytedance.sdk.openadsdk.STP.lk.Lxb() { // from class: com.bytedance.sdk.openadsdk.ZU.lk.Lxb.1
                @Override // com.bytedance.sdk.openadsdk.STP.lk.Lxb
                public JSONObject Lxb() {
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("ad_extra_data", jSONObject.toString());
                    } catch (Throwable unused) {
                    }
                    return jSONObject2;
                }
            });
        }

        public static void Lxb(final int i, final int i2, tD tDVar) {
            String strLxb = nJ.Lxb(tDVar);
            if (strLxb == null) {
                return;
            }
            lk.Lxb(System.currentTimeMillis(), tDVar, strLxb.concat("_landingpage"), "local_res_hit_rate", new com.bytedance.sdk.openadsdk.STP.lk.Lxb() { // from class: com.bytedance.sdk.openadsdk.ZU.lk.Lxb.2
                @Override // com.bytedance.sdk.openadsdk.STP.lk.Lxb
                public JSONObject Lxb() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("all_times", i2);
                        jSONObject2.put("hit_times", i);
                        jSONObject.put("ad_extra_data", jSONObject2.toString());
                    } catch (Throwable unused) {
                    }
                    return jSONObject;
                }
            });
        }

        public static void Lxb(final long j, final tD tDVar, String str, final ILoader iLoader, final String str2) {
            if (str == null) {
                return;
            }
            lk.Lxb(System.currentTimeMillis(), tDVar, str, "landingpage_init", new com.bytedance.sdk.openadsdk.STP.lk.Lxb() { // from class: com.bytedance.sdk.openadsdk.ZU.lk.Lxb.3
                @Override // com.bytedance.sdk.openadsdk.STP.lk.Lxb
                public JSONObject Lxb() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        int iLxb = com.bytedance.sdk.openadsdk.ebl.LD.Lxb().Lxb(iLoader, str2);
                        JSONObject jSONObject2 = new JSONObject();
                        JSONObject jSONObject3 = new JSONObject();
                        int i = 0;
                        jSONObject3.put(tD.lk, tDVar.Ld() ? 1 : 0);
                        jSONObject2.put("pag_json_data", jSONObject3.toString());
                        jSONObject2.put("url", tDVar.Sv());
                        jSONObject2.put("channel_name", tDVar.oc());
                        if (!TextUtils.isEmpty(tDVar.oc()) && iLxb > 0) {
                            i = 1;
                        }
                        jSONObject2.put("interceptor_status", i);
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put("resource_count", iLxb);
                        jSONObject2.put("resource_info", jSONObject4);
                        jSONObject.put("ad_extra_data", jSONObject2.toString());
                        jSONObject.put("duration", j);
                    } catch (Throwable unused) {
                    }
                    return jSONObject;
                }
            });
        }

        public static void Lxb(final int i, final int i2, final int i3, final int i4, final tD tDVar, String str, final int i5) {
            if (str == null || TextUtils.isEmpty(tDVar.oc())) {
                return;
            }
            lk.Lxb(System.currentTimeMillis(), tDVar, str, "landing_page_resource_detail", new com.bytedance.sdk.openadsdk.STP.lk.Lxb() { // from class: com.bytedance.sdk.openadsdk.ZU.lk.Lxb.4
                @Override // com.bytedance.sdk.openadsdk.STP.lk.Lxb
                public JSONObject Lxb() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("next_url", tDVar.Sv());
                        jSONObject2.put("channel_name", tDVar.oc());
                        jSONObject2.put("preload_status", i <= 0 ? 0 : 2);
                        jSONObject2.put("first_page", i5);
                        jSONObject2.put("preload_h5_type", tDVar.XM());
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("channel_response", i);
                        jSONObject3.put("failResourceCount", i2);
                        jSONObject3.put("successCount", i3);
                        jSONObject3.put("failCount", i4);
                        jSONObject2.put("resource_info", jSONObject3);
                        jSONObject.put("ad_extra_data", jSONObject2.toString());
                    } catch (Throwable unused) {
                    }
                    return jSONObject;
                }
            });
        }
    }

    public static void LD(final tD tDVar, String str) {
        Lxb(System.currentTimeMillis(), tDVar, str, "picture_click", new com.bytedance.sdk.openadsdk.STP.lk.Lxb() { // from class: com.bytedance.sdk.openadsdk.ZU.lk.14
            @Override // com.bytedance.sdk.openadsdk.STP.lk.Lxb
            public JSONObject Lxb() {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject.put("ad_slot_type", tDVar.hg().getNativeAdType());
                    jSONObject.put("interaction_method", tDVar.brP());
                    jSONObject2.put("ad_extra_data", jSONObject.toString());
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.sLN.LD(th.toString());
                }
                return jSONObject2;
            }
        });
    }

    public static void Lxb(final tD tDVar, String str) {
        Lxb(System.currentTimeMillis(), tDVar, str, "endcard_load_start", new com.bytedance.sdk.openadsdk.STP.lk.Lxb() { // from class: com.bytedance.sdk.openadsdk.ZU.lk.12
            @Override // com.bytedance.sdk.openadsdk.STP.lk.Lxb
            public JSONObject Lxb() {
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    if (tD.lk(tDVar)) {
                        if (tDVar.Yw() != null) {
                            jSONObject2.putOpt("url", tDVar.Yw().lk());
                            jSONObject2.putOpt("id", tDVar.Yw().Lxb());
                            jSONObject2.putOpt("md5", tDVar.Yw().LD());
                        }
                        if (tDVar.JJ() != null) {
                            jSONObject2.putOpt("render_type", 7);
                        }
                    } else {
                        jSONObject2.putOpt("url", tDVar.JJ().h);
                        jSONObject2.putOpt("style_id", tDVar.GX());
                        if (tDVar.JJ() != null) {
                            jSONObject2.putOpt("render_type", 0);
                        }
                    }
                    jSONObject.putOpt("ad_extra_data", jSONObject2.toString());
                } catch (Exception e) {
                    com.bytedance.sdk.component.utils.sLN.LD(e.getMessage());
                }
                return jSONObject;
            }
        });
    }

    public static void lk(final tD tDVar, String str) {
        if (tDVar == null || !tD.lk(tDVar) || tDVar.Yw() == null) {
            return;
        }
        Lxb(System.currentTimeMillis(), tDVar, str, CampaignEx.JSON_NATIVE_VIDEO_ENDCARD_SHOW, new com.bytedance.sdk.openadsdk.STP.lk.Lxb() { // from class: com.bytedance.sdk.openadsdk.ZU.lk.26
            @Override // com.bytedance.sdk.openadsdk.STP.lk.Lxb
            public JSONObject Lxb() {
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.putOpt("url", tDVar.Yw().lk());
                    jSONObject2.putOpt("id", tDVar.Yw().Lxb());
                    jSONObject2.putOpt("md5", tDVar.Yw().LD());
                    if (tDVar.JJ() != null) {
                        jSONObject2.putOpt("render_type", Integer.valueOf(tDVar.JJ().l));
                    }
                    jSONObject.put("ad_extra_data", jSONObject2.toString());
                } catch (Exception unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void LD(tD tDVar, String str, String str2, final JSONObject jSONObject) {
        Lxb(System.currentTimeMillis(), tDVar, str, str2, new com.bytedance.sdk.openadsdk.STP.lk.Lxb() { // from class: com.bytedance.sdk.openadsdk.ZU.lk.19
            @Override // com.bytedance.sdk.openadsdk.STP.lk.Lxb
            public JSONObject Lxb() {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    JSONObject jSONObject3 = jSONObject;
                    if (jSONObject3 != null) {
                        jSONObject2.put("ad_extra_data", jSONObject3.toString());
                    }
                } catch (Exception unused) {
                }
                return jSONObject2;
            }
        });
    }

    public static void Lxb(final tD tDVar, String str, final long j) {
        Lxb(System.currentTimeMillis(), tDVar, str, "endcard_load_finish", new com.bytedance.sdk.openadsdk.STP.lk.Lxb() { // from class: com.bytedance.sdk.openadsdk.ZU.lk.22
            @Override // com.bytedance.sdk.openadsdk.STP.lk.Lxb
            public JSONObject Lxb() {
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    if (tD.lk(tDVar)) {
                        if (tDVar.Yw() != null) {
                            jSONObject2.putOpt("url", tDVar.Yw().lk());
                            jSONObject2.putOpt("id", tDVar.Yw().Lxb());
                            jSONObject2.putOpt("md5", tDVar.Yw().LD());
                        }
                        if (tDVar.JJ() != null) {
                            jSONObject2.putOpt("render_type", 7);
                        }
                    } else {
                        jSONObject2.putOpt("url", tDVar.JJ().h);
                        jSONObject2.putOpt("style_id", tDVar.GX());
                        if (tDVar.JJ() != null) {
                            jSONObject2.putOpt("render_type", 0);
                        }
                    }
                    jSONObject.putOpt("ad_extra_data", jSONObject2.toString());
                    jSONObject.put("duration", j);
                } catch (Exception e) {
                    com.bytedance.sdk.component.utils.sLN.LD(e.getMessage());
                }
                return jSONObject;
            }
        });
    }

    public static void LD(final long j, final tD tDVar, String str, final String str2) {
        Lxb(System.currentTimeMillis(), tDVar, str, "endcard_feeling_duraion", new com.bytedance.sdk.openadsdk.STP.lk.Lxb() { // from class: com.bytedance.sdk.openadsdk.ZU.lk.25
            @Override // com.bytedance.sdk.openadsdk.STP.lk.Lxb
            public JSONObject Lxb() {
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject.put("duration", j);
                    if (tD.lk(tDVar)) {
                        if (tDVar.Yw() != null) {
                            jSONObject2.putOpt("url", tDVar.Yw().lk());
                            jSONObject2.putOpt("id", tDVar.Yw().Lxb());
                            jSONObject2.putOpt("md5", tDVar.Yw().LD());
                        }
                        jSONObject2.putOpt(TypedValues.TransitionType.S_FROM, str2);
                        if (tDVar.JJ() != null) {
                            jSONObject2.putOpt("render_type", 7);
                        }
                    } else {
                        jSONObject2.put("url", tDVar.JJ().h);
                        jSONObject2.put("style_id", tDVar.GX());
                        if (tDVar.JJ() != null) {
                            jSONObject2.putOpt("render_type", 0);
                        }
                    }
                    jSONObject.put("ad_extra_data", jSONObject2.toString());
                } catch (Exception e) {
                    com.bytedance.sdk.component.utils.sLN.LD(e.getMessage());
                }
                return jSONObject;
            }
        });
    }

    public static void Lxb(final tD tDVar, String str, final long j, final int i, final String str2, final String str3) {
        Lxb(System.currentTimeMillis(), tDVar, str, "endcard_load_fail", new com.bytedance.sdk.openadsdk.STP.lk.Lxb() { // from class: com.bytedance.sdk.openadsdk.ZU.lk.33
            @Override // com.bytedance.sdk.openadsdk.STP.lk.Lxb
            public JSONObject Lxb() {
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    if (tD.lk(tDVar)) {
                        if (tDVar.Yw() != null) {
                            jSONObject2.putOpt("url", tDVar.Yw().lk());
                            jSONObject2.putOpt("id", tDVar.Yw().Lxb());
                            jSONObject2.putOpt("md5", tDVar.Yw().LD());
                        }
                        if (tDVar.JJ() != null) {
                            jSONObject2.putOpt("render_type", 7);
                        }
                    } else {
                        jSONObject2.putOpt("url", tDVar.JJ().h);
                        jSONObject2.putOpt("style_id", tDVar.GX());
                        if (!TextUtils.isEmpty(str3)) {
                            jSONObject2.putOpt("error_url", str3);
                        }
                        if (tDVar.JJ() != null) {
                            jSONObject2.putOpt("render_type", 0);
                        }
                    }
                    jSONObject2.put("error_code", i);
                    jSONObject2.put("error_msg", str2);
                    jSONObject.putOpt("ad_extra_data", jSONObject2.toString());
                    jSONObject.put("duration", j);
                } catch (Exception e) {
                    com.bytedance.sdk.component.utils.sLN.LD(e.getMessage());
                }
                return jSONObject;
            }
        });
    }

    public static void lk(tD tDVar, final com.bytedance.sdk.openadsdk.STP.Lxb.Lxb lxb, final String str) {
        Lxb(System.currentTimeMillis(), tDVar, str, "web_behavior_stay", new com.bytedance.sdk.openadsdk.STP.lk.Lxb() { // from class: com.bytedance.sdk.openadsdk.ZU.lk.29
            @Override // com.bytedance.sdk.openadsdk.STP.lk.Lxb
            public JSONObject Lxb() {
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("arbi_current_url", lxb.lk());
                    jSONObject2.put("current_url_index", lxb.ZU());
                    jSONObject2.put("arbi_stay_duration", lxb.STP());
                    jSONObject2.put("browsing_percentage", lxb.IeN());
                    jSONObject2.put("out_focus_scene", lxb.VVE());
                    jSONObject.put("ad_extra_data", jSONObject2.toString());
                } catch (Throwable th) {
                    Sfi.LD("TTAD.AdEvent", "onWebBehaviorStay", th.getMessage());
                }
                return jSONObject;
            }
        });
    }

    public static void LD(tD tDVar, final com.bytedance.sdk.openadsdk.STP.Lxb.Lxb lxb, final String str) {
        Lxb(System.currentTimeMillis(), tDVar, str, "web_behavior_load", new com.bytedance.sdk.openadsdk.STP.lk.Lxb() { // from class: com.bytedance.sdk.openadsdk.ZU.lk.28
            @Override // com.bytedance.sdk.openadsdk.STP.lk.Lxb
            public JSONObject Lxb() {
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("arbi_current_url", lxb.lk());
                    jSONObject2.put("current_url_index", lxb.ZU());
                    jSONObject2.put("arbi_load_duration", lxb.brP());
                    jSONObject.put("ad_extra_data", jSONObject2.toString());
                } catch (Throwable th) {
                    Sfi.LD("TTAD.AdEvent", "onWebBehaviorLoad", th.getMessage());
                }
                return jSONObject;
            }
        });
    }

    public static void Lxb(final tD tDVar, String str, final long j, final int i, final int i2) {
        Lxb(System.currentTimeMillis(), tDVar, str, "load", new com.bytedance.sdk.openadsdk.STP.lk.Lxb() { // from class: com.bytedance.sdk.openadsdk.ZU.lk.44
            @Override // com.bytedance.sdk.openadsdk.STP.lk.Lxb
            public JSONObject Lxb() {
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.putOpt("render_type", "h5");
                    jSONObject2.putOpt("render_type_2", 0);
                    jSONObject2.putOpt("interaction_method", Integer.valueOf(tDVar.brP()));
                    jSONObject2.put("first_page", i2);
                    jSONObject2.put("preload_h5_type", tDVar.XM());
                    int i3 = i;
                    if (i3 >= 0) {
                        jSONObject2.putOpt("preload_status", Integer.valueOf(i3));
                    }
                    jSONObject.putOpt("ad_extra_data", jSONObject2.toString());
                    jSONObject.put("duration", Math.min(j, TTAdConstant.AD_MAX_EVENT_TIME));
                } catch (Exception unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void ZU(final tD tDVar, final String str, final int i) {
        Lxb(System.currentTimeMillis(), tDVar, str, "material_status", new com.bytedance.sdk.openadsdk.STP.lk.Lxb() { // from class: com.bytedance.sdk.openadsdk.ZU.lk.13
            @Override // com.bytedance.sdk.openadsdk.STP.lk.Lxb
            public JSONObject Lxb() {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("trigger_type", i);
                    jSONObject3.put("image_mode", tDVar.FGm());
                    jSONObject.put("pag_json_data", jSONObject3.toString());
                    jSONObject2.put("ad_extra_data", jSONObject.toString());
                    jSONObject.toString();
                } catch (Throwable unused) {
                }
                return jSONObject2;
            }
        });
    }

    public static void lk(tD tDVar, final String str, final String str2, final JSONObject jSONObject) {
        if (tDVar == null || jSONObject == null) {
            return;
        }
        Lxb(System.currentTimeMillis(), tDVar, str, str2, new com.bytedance.sdk.openadsdk.STP.lk.Lxb() { // from class: com.bytedance.sdk.openadsdk.ZU.lk.37
            @Override // com.bytedance.sdk.openadsdk.STP.lk.Lxb
            public JSONObject Lxb() {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("ad_extra_data", jSONObject.toString());
                } catch (JSONException unused) {
                }
                return jSONObject2;
            }
        });
    }

    public static void LD(tD tDVar, String str, String str2, final JSONObject jSONObject, final long j) {
        if (tDVar == null || jSONObject == null) {
            return;
        }
        Lxb(System.currentTimeMillis(), tDVar, str, str2, new com.bytedance.sdk.openadsdk.STP.lk.Lxb() { // from class: com.bytedance.sdk.openadsdk.ZU.lk.36
            @Override // com.bytedance.sdk.openadsdk.STP.lk.Lxb
            public JSONObject Lxb() {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("ad_extra_data", jSONObject.toString());
                    jSONObject2.put("duration", j);
                } catch (Throwable unused) {
                }
                return jSONObject2;
            }
        });
    }

    public static void Lxb(String str, tD tDVar, String str2, final Map<String, Object> map) {
        Lxb(System.currentTimeMillis(), tDVar, str2, str, new com.bytedance.sdk.openadsdk.STP.lk.Lxb() { // from class: com.bytedance.sdk.openadsdk.ZU.lk.47
            @Override // com.bytedance.sdk.openadsdk.STP.lk.Lxb
            public JSONObject Lxb() {
                JSONObject jSONObject = new JSONObject();
                try {
                    if (map != null) {
                        JSONObject jSONObject2 = new JSONObject();
                        for (Map.Entry entry : map.entrySet()) {
                            jSONObject2.put((String) entry.getKey(), entry.getValue());
                        }
                        jSONObject.put("ad_extra_data", jSONObject2.toString());
                    }
                } catch (Exception unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void ZU(tD tDVar, final com.bytedance.sdk.openadsdk.STP.Lxb.Lxb lxb, final String str) {
        Lxb(System.currentTimeMillis(), tDVar, str, "web_behavior_scroll", new com.bytedance.sdk.openadsdk.STP.lk.Lxb() { // from class: com.bytedance.sdk.openadsdk.ZU.lk.30
            @Override // com.bytedance.sdk.openadsdk.STP.lk.Lxb
            public JSONObject Lxb() {
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("arbi_current_url", lxb.lk());
                    jSONObject2.put("current_url_index", lxb.ZU());
                    jSONObject2.put("trigger_scroll_x", lxb.QAg());
                    jSONObject2.put("trigger_scroll_y", lxb.nBu());
                    jSONObject2.put("arbi_offset_y", lxb.JVA());
                    jSONObject2.put("scroll_type", lxb.sLN());
                    jSONObject2.put("scroll_duration", lxb.NXR());
                    jSONObject.put("ad_extra_data", jSONObject2.toString());
                } catch (Throwable th) {
                    Sfi.LD("TTAD.AdEvent", "onWebBehaviorScroll", th.getMessage());
                }
                return jSONObject;
            }
        });
    }

    public static void lk(tD tDVar, final String str, final JSONObject jSONObject) {
        Lxb(System.currentTimeMillis(), tDVar, str, LD.lc, new com.bytedance.sdk.openadsdk.STP.lk.Lxb() { // from class: com.bytedance.sdk.openadsdk.ZU.lk.39
            @Override // com.bytedance.sdk.openadsdk.STP.lk.Lxb
            public JSONObject Lxb() {
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("pag_json_data", jSONObject);
                    jSONObject2.put("ad_extra_data", jSONObject3);
                } catch (JSONException unused) {
                }
                String str2 = LD.Lxb;
                return jSONObject2;
            }
        });
    }

    public static void LD(tD tDVar, final String str, final JSONObject jSONObject) {
        Lxb(System.currentTimeMillis(), tDVar, str, LD.JXs, new com.bytedance.sdk.openadsdk.STP.lk.Lxb() { // from class: com.bytedance.sdk.openadsdk.ZU.lk.38
            @Override // com.bytedance.sdk.openadsdk.STP.lk.Lxb
            public JSONObject Lxb() {
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("pag_json_data", jSONObject);
                    jSONObject2.put("ad_extra_data", jSONObject3);
                } catch (JSONException unused) {
                }
                String str2 = LD.Lxb;
                return jSONObject2;
            }
        });
    }

    public static void Lxb(long j, tD tDVar, String str, String str2, final JSONObject jSONObject, ebl eblVar, com.bytedance.sdk.openadsdk.ZU.LD.Lxb lxb) {
        Lxb(j, tDVar, str, str2, new com.bytedance.sdk.openadsdk.STP.lk.Lxb() { // from class: com.bytedance.sdk.openadsdk.ZU.lk.48
            @Override // com.bytedance.sdk.openadsdk.STP.lk.Lxb
            public JSONObject Lxb() {
                return jSONObject;
            }
        });
    }

    public static void ZU(tD tDVar, String str, JSONObject jSONObject) {
        if (tDVar == null) {
            return;
        }
        Lxb(tDVar, str, -1L, jSONObject);
    }

    public static void LD(tD tDVar, String str, int i, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("type", i);
        } catch (JSONException unused) {
        }
        LD(tDVar, str, "download_app_ad_track", jSONObject);
    }

    @DungeonFlag
    public static void Lxb(tD tDVar, String str, JSONObject jSONObject) {
        ZU(tDVar, "show", str, jSONObject);
    }

    public static void Lxb(tD tDVar) {
        if (TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.sLN.Lxb(com.bytedance.sdk.openadsdk.core.kqm.Lxb()))) {
            return;
        }
        com.bytedance.sdk.openadsdk.ZU.Lxb.ZU.Lxb(com.bytedance.sdk.openadsdk.eK.Lxb.Lxb(tDVar.SS(), true), 1, tDVar.bG());
    }

    @DungeonFlag
    public static void Lxb(final String str, final tD tDVar, final String str2, final ebl eblVar) {
        if (tDVar == null || eblVar == null || !eblVar.Lxb()) {
            return;
        }
        Lxb(System.currentTimeMillis(), tDVar, str2, "ad_show_time", new com.bytedance.sdk.openadsdk.STP.lk.Lxb() { // from class: com.bytedance.sdk.openadsdk.ZU.lk.50
            @Override // com.bytedance.sdk.openadsdk.STP.lk.Lxb
            public JSONObject Lxb() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", str);
                    ebl eblVar2 = eblVar;
                    if (eblVar2 != null && eblVar2.LD() != null) {
                        JSONObject jSONObjectLD = eblVar.LD();
                        if (str2.equals("open_ad")) {
                            jSONObjectLD.put("is_icon_only", tDVar.kVf() ? 1 : 0);
                        }
                        jSONObject.put("ad_extra_data", jSONObjectLD.toString());
                    }
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void Lxb(final tD tDVar, final String str, final CG cg) {
        if (tDVar == null) {
            return;
        }
        final long jZU = cg.ZU();
        Lxb(System.currentTimeMillis(), tDVar, str, "stay_duration", new com.bytedance.sdk.openadsdk.STP.lk.Lxb() { // from class: com.bytedance.sdk.openadsdk.ZU.lk.2
            @Override // com.bytedance.sdk.openadsdk.STP.lk.Lxb
            public JSONObject Lxb() {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject.put("click_stay_time", jZU);
                    jSONObject.put("click_time", cg.Lxb);
                    if (str.equals("open_ad")) {
                        jSONObject.put("is_icon_only", tDVar.kVf() ? 1 : 0);
                    }
                    jSONObject2.put("ad_extra_data", jSONObject.toString());
                } catch (Throwable unused) {
                }
                return jSONObject2;
            }
        });
    }

    public static void Lxb(tD tDVar, final String str, final int i, final String str2, final long j, final boolean z, final int i2, final long j2) {
        Lxb(System.currentTimeMillis(), tDVar, str, LD.ZU, new com.bytedance.sdk.openadsdk.STP.lk.Lxb() { // from class: com.bytedance.sdk.openadsdk.ZU.lk.4
            @Override // com.bytedance.sdk.openadsdk.STP.lk.Lxb
            public JSONObject Lxb() {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject.put("invisible_scene", i);
                    jSONObject.put("arbi_current_url", str2);
                    jSONObject.put("loading_visible_time", j);
                    jSONObject.put("arbi_trigger_start", z);
                    jSONObject.put("arbi_convert_count", i2);
                    jSONObject.put("loading_start_timestamp", j2);
                    jSONObject2.put("ad_extra_data", jSONObject.toString());
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.sLN.LD(th.toString());
                }
                return jSONObject2;
            }
        });
    }

    public static void Lxb(tD tDVar, String str, final long j, final boolean z) {
        Lxb(System.currentTimeMillis(), tDVar, str, "lp_loading", new com.bytedance.sdk.openadsdk.STP.lk.Lxb() { // from class: com.bytedance.sdk.openadsdk.ZU.lk.5
            @Override // com.bytedance.sdk.openadsdk.STP.lk.Lxb
            public JSONObject Lxb() {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject.put("if_lp_loading_success", z ? 1 : 2);
                    jSONObject2.put("ad_extra_data", jSONObject.toString());
                    jSONObject2.put("duration", j);
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.sLN.LD(th.toString());
                }
                return jSONObject2;
            }
        });
    }

    public static void Lxb(tD tDVar, final String str, final int i, final String str2, final int i2) {
        Lxb(System.currentTimeMillis(), tDVar, str, LD.Lxb, new com.bytedance.sdk.openadsdk.STP.lk.Lxb() { // from class: com.bytedance.sdk.openadsdk.ZU.lk.9
            @Override // com.bytedance.sdk.openadsdk.STP.lk.Lxb
            public JSONObject Lxb() {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject.put("index", i);
                    jSONObject.put("arbi_current_url", str2);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("new_index", i2);
                    jSONObject.put("pag_json_data", jSONObject3.toString());
                    jSONObject2.put("ad_extra_data", jSONObject.toString());
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.sLN.LD(th.toString());
                }
                return jSONObject2;
            }
        });
    }

    public static void Lxb(tD tDVar, final String str, final int i, final String str2, final float f) {
        Lxb(System.currentTimeMillis(), tDVar, str, LD.LD, new com.bytedance.sdk.openadsdk.STP.lk.Lxb() { // from class: com.bytedance.sdk.openadsdk.ZU.lk.10
            @Override // com.bytedance.sdk.openadsdk.STP.lk.Lxb
            public JSONObject Lxb() {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject.put("index", i);
                    jSONObject.put("arbi_current_url", str2);
                    jSONObject.put("arbi_load_duration", f);
                    jSONObject2.put("ad_extra_data", jSONObject.toString());
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.sLN.LD(th.toString());
                }
                return jSONObject2;
            }
        });
    }

    public static void Lxb(tD tDVar, final String str, final int i, final String str2, final String str3, final int i2) {
        Lxb(System.currentTimeMillis(), tDVar, str, LD.lk, new com.bytedance.sdk.openadsdk.STP.lk.Lxb() { // from class: com.bytedance.sdk.openadsdk.ZU.lk.11
            @Override // com.bytedance.sdk.openadsdk.STP.lk.Lxb
            public JSONObject Lxb() {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject.put("index", i);
                    jSONObject.put("arbi_current_url", str2);
                    jSONObject.put("load_url", str3);
                    jSONObject.put("url_flag", i2);
                    jSONObject2.put("ad_extra_data", jSONObject.toString());
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.sLN.LD(th.toString());
                }
                return jSONObject2;
            }
        });
    }

    @DungeonFlag
    public static void Lxb(final String str, final tD tDVar, final com.bytedance.sdk.openadsdk.core.model.nBu nbu, final String str2, final boolean z, final Map<String, Object> map, final int i) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        Lxb(new com.bytedance.sdk.component.OY.OY("onClick") { // from class: com.bytedance.sdk.openadsdk.ZU.lk.15
            @Override // java.lang.Runnable
            public void run() {
                tD tDVar2 = tDVar;
                if (tDVar2 == null) {
                    return;
                }
                lk.Lxb(jCurrentTimeMillis, tDVar2, str2, str, new com.bytedance.sdk.openadsdk.STP.lk.Lxb() { // from class: com.bytedance.sdk.openadsdk.ZU.lk.15.1
                    @Override // com.bytedance.sdk.openadsdk.STP.lk.Lxb
                    public JSONObject Lxb() {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            com.bytedance.sdk.openadsdk.core.model.nBu nbu2 = nbu;
                            if (nbu2 != null) {
                                JSONObject jSONObjectLxb = nbu2.Lxb();
                                jSONObjectLxb.put("is_valid", z);
                                int i2 = i;
                                if (i2 > 0 && i2 <= 2) {
                                    jSONObjectLxb.put("user_behavior_type", i2);
                                }
                                Map map2 = map;
                                if (map2 != null) {
                                    if (map2.containsKey("duration")) {
                                        jSONObject.put("duration", map.get("duration"));
                                    }
                                    for (Map.Entry entry : map.entrySet()) {
                                        if (!"duration".equals(entry.getKey())) {
                                            jSONObjectLxb.put((String) entry.getKey(), entry.getValue());
                                        }
                                    }
                                }
                                jSONObjectLxb.put("interaction_method", tDVar.brP());
                                if (str2.equals("open_ad")) {
                                    jSONObjectLxb.put("is_icon_only", tDVar.kVf() ? 1 : 0);
                                }
                                jSONObject.put("ad_extra_data", jSONObjectLxb.toString());
                            }
                            jSONObject.putOpt("log_extra", tDVar.Lv());
                            float fFloatValue = Double.valueOf((System.currentTimeMillis() / 1000) - tDVar.kRz()).floatValue();
                            if (fFloatValue <= 0.0f) {
                                fFloatValue = 0.0f;
                            }
                            jSONObject.putOpt("show_time", Float.valueOf(fFloatValue));
                            jSONObject.putOpt("ua_policy", Integer.valueOf(tDVar.BcA()));
                        } catch (Exception unused) {
                        }
                        return jSONObject;
                    }
                });
                if (!TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.sLN.Lxb(com.bytedance.sdk.openadsdk.core.kqm.Lxb())) && CampaignEx.JSON_NATIVE_VIDEO_CLICK.equals(str)) {
                    com.bytedance.sdk.openadsdk.ZU.Lxb.ZU.Lxb(com.bytedance.sdk.openadsdk.eK.Lxb.Lxb(tDVar.LXE(), true), 2, tDVar.bG());
                }
                if (CampaignEx.JSON_NATIVE_VIDEO_CLICK.equals(str)) {
                    eK.lk(tDVar);
                }
            }
        });
    }

    public static void Lxb(tD tDVar, String str, String str2, final JSONObject jSONObject) {
        Lxb(System.currentTimeMillis(), tDVar, str, str2, new com.bytedance.sdk.openadsdk.STP.lk.Lxb() { // from class: com.bytedance.sdk.openadsdk.ZU.lk.16
            @Override // com.bytedance.sdk.openadsdk.STP.lk.Lxb
            public JSONObject Lxb() {
                if (jSONObject == null) {
                    return null;
                }
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("ad_extra_data", jSONObject.toString());
                    if (jSONObject.has("duration")) {
                        jSONObject2.put("duration", jSONObject.get("duration"));
                    }
                } catch (Exception e) {
                    com.bytedance.sdk.component.utils.sLN.Lxb("TTAD.AdEvent", e.getMessage());
                }
                return jSONObject2;
            }
        });
        if (CampaignEx.JSON_NATIVE_VIDEO_CLICK.equals(str2)) {
            eK.lk(tDVar);
        }
    }

    public static void Lxb(tD tDVar, String str, final int i, final long j) {
        Lxb(System.currentTimeMillis(), tDVar, str, "video_choose", new com.bytedance.sdk.openadsdk.STP.lk.Lxb() { // from class: com.bytedance.sdk.openadsdk.ZU.lk.17
            @Override // com.bytedance.sdk.openadsdk.STP.lk.Lxb
            public JSONObject Lxb() {
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("video_choose", i);
                    jSONObject2.put("video_choose_duration", j);
                    jSONObject.put("ad_extra_data", jSONObject2.toString());
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.sLN.LD(th.toString());
                }
                return jSONObject;
            }
        });
    }

    public static void Lxb(tD tDVar, String str, final String str2, final long j, final int i, JSONObject jSONObject, final ebl eblVar) {
        final JSONObject jSONObject2 = jSONObject == null ? new JSONObject() : jSONObject;
        Lxb(System.currentTimeMillis(), tDVar, str, str2, new com.bytedance.sdk.openadsdk.STP.lk.Lxb() { // from class: com.bytedance.sdk.openadsdk.ZU.lk.18
            @Override // com.bytedance.sdk.openadsdk.STP.lk.Lxb
            public JSONObject Lxb() {
                ebl eblVar2;
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("duration", j);
                    jSONObject3.put("percent", i);
                    if (("feed_break".equals(str2) || "feed_over".equals(str2)) && (eblVar2 = eblVar) != null) {
                        eblVar2.Lxb(jSONObject2);
                    }
                    jSONObject3.put("ad_extra_data", jSONObject2.toString());
                } catch (Throwable unused) {
                }
                return jSONObject3;
            }
        });
    }

    public static void Lxb(tD tDVar, String str, String str2, final JSONObject jSONObject, final long j) {
        Lxb(System.currentTimeMillis(), tDVar, str, str2, new com.bytedance.sdk.openadsdk.STP.lk.Lxb() { // from class: com.bytedance.sdk.openadsdk.ZU.lk.20
            @Override // com.bytedance.sdk.openadsdk.STP.lk.Lxb
            public JSONObject Lxb() {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    JSONObject jSONObject3 = jSONObject;
                    if (jSONObject3 != null) {
                        jSONObject2.put("ad_extra_data", jSONObject3.toString());
                    }
                    jSONObject2.put("duration", j);
                } catch (Exception unused) {
                }
                return jSONObject2;
            }
        });
    }

    public static void Lxb(final tD tDVar, String str, String str2, final Map<String, Object> map) {
        Lxb(System.currentTimeMillis(), tDVar, str, str2, new com.bytedance.sdk.openadsdk.STP.lk.Lxb() { // from class: com.bytedance.sdk.openadsdk.ZU.lk.21
            @Override // com.bytedance.sdk.openadsdk.STP.lk.Lxb
            public JSONObject Lxb() {
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    Map map2 = map;
                    if (map2 != null) {
                        for (Map.Entry entry : map2.entrySet()) {
                            jSONObject2.put((String) entry.getKey(), entry.getValue());
                        }
                    }
                    jSONObject2.put("dp_creative_type", tDVar.qK());
                    jSONObject.put("ad_extra_data", jSONObject2.toString());
                } catch (Exception unused) {
                }
                return jSONObject;
            }
        });
    }

    @DungeonFlag
    public static void Lxb(long j, tD tDVar, String str, String str2) {
        Lxb(j, tDVar, str, str2, (com.bytedance.sdk.openadsdk.STP.lk.Lxb) null);
    }

    @DungeonFlag
    public static void Lxb(final long j, final tD tDVar, final String str, final String str2, final com.bytedance.sdk.openadsdk.STP.lk.Lxb lxb) {
        if (tDVar == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || Lxb(tDVar.eof(), str2)) {
            return;
        }
        Lxb(new com.bytedance.sdk.component.OY.OY(str2) { // from class: com.bytedance.sdk.openadsdk.ZU.lk.23
            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObject;
                try {
                    com.bytedance.sdk.openadsdk.STP.lk.Lxb lxb2 = lxb;
                    if (lxb2 != null) {
                        jSONObject = lxb2.Lxb();
                        if (jSONObject == null) {
                            try {
                                jSONObject = new JSONObject();
                            } catch (Exception unused) {
                            }
                        }
                    } else {
                        jSONObject = new JSONObject();
                    }
                    jSONObject.putOpt("log_extra", tDVar.Lv());
                    jSONObject.putOpt("ua_policy", Integer.valueOf(tDVar.BcA()));
                } catch (Exception unused2) {
                    jSONObject = null;
                }
                new com.bytedance.sdk.openadsdk.ZU.Lxb.C0079Lxb(j, tDVar).LD(str).lk(str2).JXs(tDVar.bG()).OY(tDVar.rO()).Lxb(tDVar.jeq()).Lxb(jSONObject).ebl(tDVar.xNP()).Lxb((com.bytedance.sdk.openadsdk.ZU.LD.Lxb) null);
            }
        });
    }

    public static void Lxb(tD tDVar, String str, final String str2, final com.bytedance.sdk.openadsdk.STP.lk.Lxb lxb) {
        Lxb(System.currentTimeMillis(), tDVar, str, "playable_track", new com.bytedance.sdk.openadsdk.STP.lk.Lxb() { // from class: com.bytedance.sdk.openadsdk.ZU.lk.24
            @Override // com.bytedance.sdk.openadsdk.STP.lk.Lxb
            public JSONObject Lxb() {
                JSONObject jSONObject;
                JSONObject jSONObject2 = new JSONObject();
                try {
                    com.bytedance.sdk.openadsdk.STP.lk.Lxb lxb2 = lxb;
                    if (lxb2 == null || (jSONObject = lxb2.Lxb()) == null) {
                        jSONObject = new JSONObject();
                    }
                    jSONObject.put("is_new_playable", 1);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("pag_json_data", jSONObject.toString());
                    jSONObject3.put("playable_event", str2);
                    jSONObject2.put("ad_extra_data", jSONObject3.toString());
                } catch (Exception unused) {
                }
                return jSONObject2;
            }
        });
    }

    public static void Lxb(tD tDVar, final com.bytedance.sdk.openadsdk.STP.Lxb.Lxb lxb, final String str) {
        Lxb(System.currentTimeMillis(), tDVar, str, "web_behavior_keyword", new com.bytedance.sdk.openadsdk.STP.lk.Lxb() { // from class: com.bytedance.sdk.openadsdk.ZU.lk.27
            @Override // com.bytedance.sdk.openadsdk.STP.lk.Lxb
            public JSONObject Lxb() {
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("arbi_current_url", lxb.lk());
                    jSONObject2.put("keyword", lxb.kqm());
                    jSONObject.put("ad_extra_data", jSONObject2.toString());
                } catch (Throwable th) {
                    Sfi.LD("TTAD.AdEvent", "onWebBehaviorKeyword", th.getMessage());
                }
                return jSONObject;
            }
        });
    }

    public static void Lxb(final long j, final tD tDVar, String str) {
        if (tDVar == null || !tD.lk(tDVar) || tDVar.Yw() == null) {
            return;
        }
        Lxb(System.currentTimeMillis(), tDVar, str, "endcard_close", new com.bytedance.sdk.openadsdk.STP.lk.Lxb() { // from class: com.bytedance.sdk.openadsdk.ZU.lk.32
            @Override // com.bytedance.sdk.openadsdk.STP.lk.Lxb
            public JSONObject Lxb() {
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.putOpt("url", tDVar.Yw().lk());
                    jSONObject2.putOpt("id", tDVar.Yw().Lxb());
                    jSONObject2.putOpt("md5", tDVar.Yw().LD());
                    if (tDVar.JJ() != null) {
                        jSONObject2.putOpt("render_type", Integer.valueOf(tDVar.JJ().l));
                    }
                    jSONObject.put("ad_extra_data", jSONObject2.toString());
                    jSONObject.put("duration", j);
                } catch (Exception e) {
                    com.bytedance.sdk.component.utils.sLN.LD(e.getMessage());
                }
                return jSONObject;
            }
        });
    }

    public static void Lxb(tD tDVar, String str, final String str2) {
        Lxb(System.currentTimeMillis(), tDVar, str, "show_error", new com.bytedance.sdk.openadsdk.STP.lk.Lxb() { // from class: com.bytedance.sdk.openadsdk.ZU.lk.34
            @Override // com.bytedance.sdk.openadsdk.STP.lk.Lxb
            public JSONObject Lxb() {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.putOpt("error_msg", str2);
                    jSONObject.putOpt("ad_extra_data", jSONObject2.toString());
                } catch (Exception unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void Lxb(tD tDVar, String str, String str2, final long j, final JSONObject jSONObject) {
        if (tDVar == null || jSONObject == null) {
            return;
        }
        Lxb(System.currentTimeMillis(), tDVar, str, str2, new com.bytedance.sdk.openadsdk.STP.lk.Lxb() { // from class: com.bytedance.sdk.openadsdk.ZU.lk.35
            @Override // com.bytedance.sdk.openadsdk.STP.lk.Lxb
            public JSONObject Lxb() {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("duration", j);
                    jSONObject2.put("ad_extra_data", jSONObject.toString());
                } catch (Exception e) {
                    com.bytedance.sdk.component.utils.sLN.Lxb("TTAD.AdEvent", e.getMessage());
                }
                return jSONObject2;
            }
        });
    }

    public static void Lxb(String str, long j) {
        com.bytedance.sdk.openadsdk.core.ebl.lk.Lxb(str, j);
    }

    @DungeonFlag
    public static void Lxb(final tD tDVar, final String str, final String str2, final String str3, final long j, final long j2, final JSONObject jSONObject, final boolean z) {
        if (tDVar == null || Lxb(tDVar.eof(), str3)) {
            return;
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        Lxb(new com.bytedance.sdk.component.OY.OY("sendJsAdEvent") { // from class: com.bytedance.sdk.openadsdk.ZU.lk.40
            @Override // java.lang.Runnable
            public void run() {
                JSONArray jSONArrayOptJSONArray;
                String strJeq = tDVar.jeq();
                if (jSONObject != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        String strOptString = jSONObject.optString("ad_extra_data");
                        if (!TextUtils.isEmpty(strOptString)) {
                            jSONObject2 = new JSONObject(strOptString);
                        }
                        if (!CampaignEx.JSON_NATIVE_VIDEO_CLICK.equals(str3)) {
                            jSONObject2.put("device", DeviceUtils.JXs(com.bytedance.sdk.openadsdk.core.kqm.Lxb()).toString());
                        }
                        if (CampaignEx.JSON_NATIVE_VIDEO_CLICK.equals(str3)) {
                            if (z) {
                                jSONObject2.put("click_scence", 1);
                            } else if (com.bytedance.sdk.openadsdk.core.model.eK.LD(tDVar)) {
                                jSONObject2.put("click_scence", 3);
                            }
                        }
                        if (tDVar.II()) {
                            try {
                                JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("pag_json_data");
                                if (jSONObjectOptJSONObject == null) {
                                    jSONObjectOptJSONObject = new JSONObject();
                                }
                                jSONObjectOptJSONObject.put("is_new_playable", 1);
                                if (tDVar.FA()) {
                                    jSONObjectOptJSONObject.put("is_pre_render", 1);
                                }
                                jSONObject2.put("pag_json_data", jSONObjectOptJSONObject.toString());
                            } catch (Throwable unused) {
                            }
                        }
                        jSONObject.put("ad_extra_data", jSONObject2.toString());
                        jSONObject.put("tag", str2);
                        int iOptInt = jSONObject2.optInt("agg_request_type", -1);
                        if (z && iOptInt == 2) {
                            strJeq = jSONObject2.optString("app_log_url");
                        }
                        int i = 0;
                        if (CampaignEx.JSON_NATIVE_VIDEO_CLICK.equals(str3)) {
                            eK.lk(tDVar);
                            float fFloatValue = Double.valueOf((System.currentTimeMillis() / 1000) - tD.LD(jSONObject.optString("log_extra"))).floatValue();
                            JSONObject jSONObject3 = jSONObject;
                            if (fFloatValue <= 0.0f) {
                                fFloatValue = 0.0f;
                            }
                            jSONObject3.putOpt("show_time", Float.valueOf(fFloatValue));
                            if (!TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.sLN.Lxb(com.bytedance.sdk.openadsdk.core.kqm.Lxb()))) {
                                if (z && iOptInt == 2) {
                                    JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("click_tracking_url");
                                    if (jSONArrayOptJSONArray2 != null) {
                                        ArrayList arrayList = new ArrayList();
                                        while (i < jSONArrayOptJSONArray2.length()) {
                                            arrayList.add(jSONArrayOptJSONArray2.optString(i));
                                            i++;
                                        }
                                        com.bytedance.sdk.openadsdk.ZU.Lxb.ZU.Lxb(com.bytedance.sdk.openadsdk.eK.Lxb.Lxb(arrayList, true), 2, String.valueOf(j));
                                    }
                                } else {
                                    tD tDVar2 = tDVar;
                                    if (tDVar2 != null) {
                                        com.bytedance.sdk.openadsdk.ZU.Lxb.ZU.Lxb(com.bytedance.sdk.openadsdk.eK.Lxb.Lxb(tDVar2.LXE(), true), 2, tDVar.bG());
                                    }
                                }
                            }
                        } else if ("show".equals(str3) && !TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.sLN.Lxb(com.bytedance.sdk.openadsdk.core.kqm.Lxb())) && z && iOptInt == 2 && (jSONArrayOptJSONArray = jSONObject2.optJSONArray("show_tracking_url")) != null) {
                            ArrayList arrayList2 = new ArrayList();
                            while (i < jSONArrayOptJSONArray.length()) {
                                arrayList2.add(jSONArrayOptJSONArray.optString(i));
                                i++;
                            }
                            com.bytedance.sdk.openadsdk.ZU.Lxb.ZU.Lxb(com.bytedance.sdk.openadsdk.eK.Lxb.Lxb(arrayList2, true), 1, String.valueOf(j));
                        }
                    } catch (Exception unused2) {
                    }
                }
                new com.bytedance.sdk.openadsdk.ZU.Lxb.C0079Lxb(jCurrentTimeMillis, tDVar).ZU(str).LD(str2).lk(str3).JXs(String.valueOf(j)).lc(String.valueOf(j2)).Lxb(strJeq).Lxb(jSONObject).OY(tDVar.rO()).ebl(tDVar.xNP()).Lxb((com.bytedance.sdk.openadsdk.ZU.LD.Lxb) null);
            }
        });
    }

    public static void Lxb(tD tDVar, String str, final long j, final JSONObject jSONObject) {
        Lxb(System.currentTimeMillis(), tDVar, "open_ad", str, new com.bytedance.sdk.openadsdk.STP.lk.Lxb() { // from class: com.bytedance.sdk.openadsdk.ZU.lk.41
            @Override // com.bytedance.sdk.openadsdk.STP.lk.Lxb
            public JSONObject Lxb() {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    long j2 = j;
                    if (j2 != -1) {
                        jSONObject2.put("duration", j2);
                    }
                    JSONObject jSONObject3 = jSONObject;
                    if (jSONObject3 != null) {
                        jSONObject2.put("ad_extra_data", jSONObject3.toString());
                    } else {
                        jSONObject2.put("ad_extra_data", new JSONObject().toString());
                    }
                } catch (Exception e) {
                    com.bytedance.sdk.component.utils.sLN.Lxb("TTAD.AdEvent", e.getMessage());
                }
                return jSONObject2;
            }
        });
    }

    public static void Lxb(final com.bytedance.sdk.component.OY.OY oy) {
        if (oy == null) {
            return;
        }
        if (hg.JXs()) {
            com.bytedance.sdk.component.utils.ebl.Lxb().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ZU.lk.42
                @Override // java.lang.Runnable
                public void run() {
                    hg.LD(oy, 10);
                }
            });
        } else if (!hg.lc()) {
            hg.LD(oy, 10);
        } else {
            oy.run();
        }
    }

    public static void Lxb(final com.bytedance.sdk.openadsdk.STP.Lxb.LD ld) {
        if (ld == null || ld.LD() == null) {
            return;
        }
        final tD tDVarLD = ld.LD();
        final int iSRq = tDVarLD.sRq();
        if (iSRq == 2 || iSRq == 8 || (nJ.ZU(tDVarLD) && LD.Lxb.ZU.equals(ld.Lxb()))) {
            Lxb(System.currentTimeMillis(), tDVarLD, ld.lk(), "open_browser", new com.bytedance.sdk.openadsdk.STP.lk.Lxb() { // from class: com.bytedance.sdk.openadsdk.ZU.lk.43
                @Override // com.bytedance.sdk.openadsdk.STP.lk.Lxb
                public JSONObject Lxb() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        int iZU = ld.ZU();
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("count", nJ.STP(com.bytedance.sdk.openadsdk.core.kqm.Lxb()));
                        jSONObject2.put("interceptor", iZU);
                        jSONObject2.put("success", ld.JXs());
                        jSONObject2.put("link", ld.Lxb());
                        jSONObject2.put("interaction_type", iSRq);
                        jSONObject2.put("real_interaction_type", ld.ebl());
                        if (ld.ZU() == 9) {
                            jSONObject2.put("is_act_signals_api_available", ld.OY());
                            jSONObject2.put("is_act_signals_callback", ld.QAg());
                        }
                        if (!TextUtils.isEmpty(ld.lc())) {
                            jSONObject2.put("exception_msg", ld.lc());
                        }
                        if (iZU == 2 || iZU == 5) {
                            jSONObject2.put("meta", tDVarLD.JD().toString());
                        }
                        jSONObject.put("ad_extra_data", jSONObject2.toString());
                    } catch (Exception e) {
                        com.bytedance.sdk.component.utils.sLN.Lxb("TTAD.AdEvent", e.getMessage());
                    }
                    return jSONObject;
                }
            });
        }
    }

    public static void Lxb(tD tDVar, String str, int i, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("type", i);
        } catch (JSONException unused) {
        }
        LD(tDVar, str, "open_ad_land_page_links", jSONObject);
    }

    public static void Lxb(tD tDVar, String str, final boolean z, final boolean z2, final boolean z3, final boolean z4, final int i, final Map<String, Object> map) {
        Lxb(System.currentTimeMillis(), tDVar, str, "start_show_plb", new com.bytedance.sdk.openadsdk.STP.lk.Lxb() { // from class: com.bytedance.sdk.openadsdk.ZU.lk.45
            @Override // com.bytedance.sdk.openadsdk.STP.lk.Lxb
            public JSONObject Lxb() {
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("isSkip", z);
                    jSONObject2.put("force", z2);
                    jSONObject2.put("isFromLandingPage", z3);
                    jSONObject2.put("finishing", z4);
                    jSONObject2.put(TypedValues.TransitionType.S_FROM, i);
                    Map map2 = map;
                    if (map2 != null) {
                        for (Map.Entry entry : map2.entrySet()) {
                            jSONObject2.put((String) entry.getKey(), entry.getValue());
                        }
                    }
                    jSONObject.put("ad_extra_data", jSONObject2.toString());
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void Lxb(final tD tDVar, final boolean z, String str, final String str2, final long j, final String str3, final String str4, final int i, final String str5) {
        Lxb(System.currentTimeMillis(), tDVar, str, "load_ugen_template", new com.bytedance.sdk.openadsdk.STP.lk.Lxb() { // from class: com.bytedance.sdk.openadsdk.ZU.lk.46
            /* JADX WARN: Code duplicated, block: B:21:0x0046  */
            @Override // com.bytedance.sdk.openadsdk.STP.lk.Lxb
            public JSONObject Lxb() {
                byte b;
                id idVarDR;
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    String str6 = str4;
                    int iHashCode = str6.hashCode();
                    if (iHashCode != -1606803861) {
                        if (iHashCode != 3107) {
                            if (iHashCode == 2989536 && str6.equals("adv3")) {
                                b = 2;
                            } else {
                                b = -1;
                            }
                        } else if (str6.equals(bc.aC)) {
                            b = 1;
                        } else {
                            b = -1;
                        }
                    } else if (str6.equals(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD)) {
                        b = 0;
                    } else {
                        b = -1;
                    }
                    if (b != 0) {
                        if (b == 1) {
                            tD.Lxb lxbRW = tDVar.rW();
                            if (lxbRW != null) {
                                jSONObject2.putOpt("url", lxbRW.IeN());
                                jSONObject2.putOpt("id", lxbRW.lc());
                                jSONObject2.putOpt("md5", lxbRW.VVE());
                            }
                        } else if (b == 2 && (idVarDR = tDVar.dR()) != null) {
                            jSONObject2.putOpt("url", idVarDR.lk());
                            jSONObject2.putOpt("id", idVarDR.Lxb());
                            jSONObject2.putOpt("md5", idVarDR.LD());
                        }
                    } else if (z) {
                        com.bytedance.sdk.openadsdk.core.JVA.lc.Lxb lxbNrJ = tDVar.nrJ();
                        if (lxbNrJ != null) {
                            jSONObject2.putOpt("url", lxbNrJ.lk());
                            jSONObject2.putOpt("id", lxbNrJ.Lxb());
                            jSONObject2.putOpt("md5", lxbNrJ.LD());
                        }
                    } else {
                        com.bytedance.sdk.openadsdk.core.JVA.lc.Lxb lxbYw = tDVar.Yw();
                        if (lxbYw != null) {
                            jSONObject2.putOpt("url", lxbYw.lk());
                            jSONObject2.putOpt("id", lxbYw.Lxb());
                            jSONObject2.putOpt("md5", lxbYw.LD());
                        }
                    }
                    jSONObject2.put("ugen_status", str2);
                    jSONObject2.put(TypedValues.TransitionType.S_FROM, str3);
                    jSONObject2.put("ugen_scene", str4);
                    if ("fail".equals(str2)) {
                        jSONObject2.put("error_code", i);
                        jSONObject2.put("error_msg", str5);
                    }
                    jSONObject.put("duration", j);
                } catch (Throwable th) {
                    try {
                        jSONObject2.put("error_code", 133);
                        jSONObject2.put("error_msg", "send template error " + th.getMessage());
                    } catch (Throwable unused) {
                    }
                }
                try {
                    jSONObject.put("ad_extra_data", jSONObject2.toString());
                } catch (Throwable unused2) {
                }
                return jSONObject;
            }
        });
    }

    private static boolean Lxb(int i, String str) {
        int iIvz;
        try {
            Set<String> setSlV = com.bytedance.sdk.openadsdk.core.settings.VVE.TA().SlV();
            if ((i == 1 && setSlV != null && setSlV.contains(str)) || (iIvz = com.bytedance.sdk.openadsdk.core.settings.VVE.TA().Ivz(str)) == 0) {
                return true;
            }
            return iIvz != 100 && ((int) ((Math.random() * 100.0d) + 1.0d)) > iIvz;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.sLN.Lxb("TTAD.AdEvent", th.getMessage());
            return false;
        }
    }
}
