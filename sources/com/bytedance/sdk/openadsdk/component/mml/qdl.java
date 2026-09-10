package com.bytedance.sdk.openadsdk.component.mml;

import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.openadsdk.bjy.lnr;
import com.bytedance.sdk.openadsdk.bjy.qdl.mml;
import com.bytedance.sdk.openadsdk.bjy.ud;
import com.bytedance.sdk.openadsdk.core.model.kdv;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.utils.mrf;
import com.p004ironsource.m5;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class qdl {
    public static void qdl(final int i2, final int i3) {
        lnr.qdl("openad_load_ad_timeout", false, new ud() { // from class: com.bytedance.sdk.openadsdk.component.mml.qdl.1
            @Override // com.bytedance.sdk.openadsdk.bjy.ud
            public com.bytedance.sdk.openadsdk.bjy.qdl.lnr getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("timeout_type", i2);
                jSONObject.put("user_timeout_time", i3);
                return mml.ud().qdl("openad_load_ad_timeout").ud(jSONObject.toString());
            }
        });
    }

    public static void ud(ljh ljhVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("openad_creative_type", ljh.mzz(ljhVar) ? "video_normal_ad" : "image_normal_ad");
        } catch (JSONException e2) {
            aaj.qdl("TTAppOpenAdReport", "reportCacheLoss json error", e2);
        }
        com.bytedance.sdk.openadsdk.mml.lnr.lnr(ljhVar, "cache_loss", jSONObject);
    }

    public static void qdl(ljh ljhVar, int i2, int i3, float f) {
        JSONObject jSONObject = new JSONObject();
        try {
            qdl(jSONObject, ljhVar);
            jSONObject.put("openad_creative_type", ljh.mzz(ljhVar) ? "video_normal_ad" : "image_normal_ad");
            jSONObject.put("total_time", f);
            com.bytedance.sdk.openadsdk.mml.lnr.qdl(jSONObject, i3, i2);
        } catch (JSONException e2) {
            aaj.qdl("TTAppOpenAdReport", "reportSkip json error", e2);
        }
        com.bytedance.sdk.openadsdk.mml.lnr.qdl(ljhVar, "skip", i2, jSONObject);
    }

    public static void ud(ljh ljhVar, long j, boolean z2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("size", ljhVar.tdy().mzz());
            jSONObject.put("video_duration", ljhVar.tdy().mo());
            jSONObject.put(m5.f25676u, z2 ? 1 : 2);
        } catch (JSONException unused) {
        }
        com.bytedance.sdk.openadsdk.mml.lnr.qdl(ljhVar, "download_video_duration", j, jSONObject);
    }

    public static void qdl(ljh ljhVar, long j, float f, boolean z2) {
        JSONObject jSONObject = new JSONObject();
        try {
            qdl(jSONObject, ljhVar);
            jSONObject.put("openad_creative_type", ljh.mzz(ljhVar) ? "video_normal_ad" : "image_normal_ad");
            if (z2) {
                double d = f;
                jSONObject.put("video_duration", d);
                jSONObject.put("video_percent", (int) (((j * 1.0d) / 10.0d) / d));
            } else {
                jSONObject.put("image_duration", f);
            }
        } catch (JSONException e2) {
            aaj.qdl("TTAppOpenAdReport", "reportDestroy json error", e2);
        }
        com.bytedance.sdk.openadsdk.mml.lnr.lnr(ljhVar, "destroy", jSONObject);
    }

    public static void qdl(ljh ljhVar) {
        com.bytedance.sdk.openadsdk.mml.lnr.lnr(ljhVar, "cache_expire", (JSONObject) null);
    }

    public static void qdl(ljh ljhVar, long j, boolean z2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(m5.f25676u, z2 ? 1 : 2);
        } catch (JSONException unused) {
        }
        com.bytedance.sdk.openadsdk.mml.lnr.qdl(ljhVar, "download_image_duration", j, jSONObject);
    }

    public static void qdl(ljh ljhVar, int i2, kdv kdvVar) {
        JSONObject jSONObject = new JSONObject();
        long jMo = 0;
        try {
            jSONObject.put("openad_creative_type", ljh.mzz(ljhVar) ? "video_normal_ad" : "image_normal_ad");
            jSONObject.put("open_ad_cache_type", i2);
            if (kdvVar != null) {
                kdvVar.ud(mrf.ud());
                qdl(jSONObject, ljhVar);
                jSONObject.put("client_start_time", kdvVar.ud());
                jSONObject.put("sever_time", kdvVar.mml());
                jSONObject.put("network_time", kdvVar.lnr());
                jSONObject.put("client_end_time", kdvVar.mzz());
                jSONObject.put("download_resource_duration", kdvVar.wd());
                jSONObject.put("resource_source", kdvVar.jpc());
                jSONObject.put("is_bidding", kdvVar.qdl ? 1 : 0);
                if (kdvVar.qdl) {
                    jSONObject.put("load_wait_time", kdvVar.ud);
                }
                jMo = kdvVar.mo();
            }
        } catch (JSONException e2) {
            aaj.qdl("TTAppOpenAdReport", "reportLoadNetDuration json error", e2);
        }
        com.bytedance.sdk.openadsdk.mml.lnr.qdl(ljhVar, "load_net_duration", jMo, jSONObject);
    }

    public static void qdl(ljh ljhVar, long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            qdl(jSONObject, ljhVar);
            jSONObject.put("openad_creative_type", ljh.mzz(ljhVar) ? "video_normal_ad" : "image_normal_ad");
        } catch (JSONException unused) {
            aaj.lnr("TTAppOpenAdReport", "reportLoadCacheDuration json error");
        }
        com.bytedance.sdk.openadsdk.mml.lnr.qdl(ljhVar, "load_cache_duration", j, jSONObject);
    }

    public static void qdl(final kdv kdvVar, final int i2, final int i3) {
        if (kdvVar != null) {
            lnr.qdl("app_running_time", false, new ud() { // from class: com.bytedance.sdk.openadsdk.component.mml.qdl.2
                @Override // com.bytedance.sdk.openadsdk.bjy.ud
                public com.bytedance.sdk.openadsdk.bjy.qdl.lnr getLogStats() throws Exception {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("app_running_time", kdvVar.tvp());
                    jSONObject.put("loaded_app_running_time", com.bytedance.sdk.openadsdk.component.wd.qdl.ud());
                    jSONObject.put("load_time", kdvVar.qdl().mml());
                    jSONObject.put("load_index", kdvVar.to());
                    jSONObject.put("load_from", i2);
                    jSONObject.put("load_result", i3);
                    return mml.ud().qdl("app_running_time").ud(jSONObject.toString());
                }
            });
        }
    }

    public static void qdl(JSONObject jSONObject, int i2) {
        if (jSONObject == null || i2 != 3) {
            return;
        }
        try {
            jSONObject.put("app_running_time", com.bytedance.sdk.openadsdk.component.wd.qdl.ud());
        } catch (JSONException e2) {
            aaj.lnr("TTAppOpenAdReport", e2.getMessage());
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000c  */
    private static void qdl(JSONObject jSONObject, ljh ljhVar) {
        int i2;
        if (ljhVar != null) {
            try {
                if (ljhVar.xmv()) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
            } catch (JSONException e2) {
                aaj.lnr("TTAppOpenAdReport", e2.getMessage());
                return;
            }
        } else {
            i2 = 0;
        }
        jSONObject.put("is_icon_only", i2);
    }
}
