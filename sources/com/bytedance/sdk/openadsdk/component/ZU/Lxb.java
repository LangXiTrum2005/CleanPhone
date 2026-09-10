package com.bytedance.sdk.openadsdk.component.ZU;

import com.bytedance.sdk.component.utils.sLN;
import com.bytedance.sdk.openadsdk.STP.LD;
import com.bytedance.sdk.openadsdk.STP.Lxb.ZU;
import com.bytedance.sdk.openadsdk.ZU.lk;
import com.bytedance.sdk.openadsdk.core.model.CSn;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.utils.CG;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb {
    public static void LD(tD tDVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("openad_creative_type", tD.JXs(tDVar) ? "video_normal_ad" : "image_normal_ad");
        } catch (JSONException e) {
            sLN.Lxb("TTAppOpenAdReport", "reportCacheLoss json error", e);
        }
        lk.ZU(tDVar, "cache_loss", jSONObject);
    }

    public static void Lxb(final int i, final int i2) {
        com.bytedance.sdk.openadsdk.STP.lk.Lxb("openad_load_ad_timeout", false, new LD() { // from class: com.bytedance.sdk.openadsdk.component.ZU.Lxb.1
            @Override // com.bytedance.sdk.openadsdk.STP.LD
            public com.bytedance.sdk.openadsdk.STP.Lxb.lk getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("timeout_type", i);
                jSONObject.put("user_timeout_time", i2);
                return ZU.LD().Lxb("openad_load_ad_timeout").LD(jSONObject.toString());
            }
        });
    }

    public static void Lxb(tD tDVar, int i, int i2, float f) {
        JSONObject jSONObject = new JSONObject();
        try {
            Lxb(jSONObject, tDVar);
            jSONObject.put("openad_creative_type", tD.JXs(tDVar) ? "video_normal_ad" : "image_normal_ad");
            jSONObject.put("skip_time", i);
            jSONObject.put("skip_show_time", i2);
            jSONObject.put("total_time", f);
        } catch (JSONException e) {
            sLN.Lxb("TTAppOpenAdReport", "reportSkip json error", e);
        }
        lk.Lxb(tDVar, "skip", i, jSONObject);
    }

    public static void LD(tD tDVar, long j, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("size", tDVar.JJ().c);
            jSONObject.put("video_duration", tDVar.JJ().d);
            jSONObject.put("order", z ? 1 : 2);
        } catch (JSONException unused) {
        }
        lk.Lxb(tDVar, "download_video_duration", j, jSONObject);
    }

    public static void Lxb(tD tDVar, long j, float f, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            Lxb(jSONObject, tDVar);
            jSONObject.put("openad_creative_type", tD.JXs(tDVar) ? "video_normal_ad" : "image_normal_ad");
            if (z) {
                double d = f;
                jSONObject.put("video_duration", d);
                jSONObject.put("video_percent", (int) (((j * 1.0d) / 10.0d) / d));
            } else {
                jSONObject.put("image_duration", f);
            }
        } catch (JSONException e) {
            sLN.Lxb("TTAppOpenAdReport", "reportDestroy json error", e);
        }
        lk.ZU(tDVar, "destroy", jSONObject);
    }

    public static void Lxb(tD tDVar) {
        lk.ZU(tDVar, "cache_expire", (JSONObject) null);
    }

    public static void Lxb(tD tDVar, long j, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("order", z ? 1 : 2);
        } catch (JSONException unused) {
        }
        lk.Lxb(tDVar, "download_image_duration", j, jSONObject);
    }

    public static void Lxb(tD tDVar, int i, CSn cSn) {
        JSONObject jSONObject = new JSONObject();
        long jLc = 0;
        try {
            jSONObject.put("openad_creative_type", tD.JXs(tDVar) ? "video_normal_ad" : "image_normal_ad");
            jSONObject.put("open_ad_cache_type", i);
            if (cSn != null) {
                cSn.LD(CG.LD());
                Lxb(jSONObject, tDVar);
                jSONObject.put("client_start_time", cSn.LD());
                jSONObject.put("sever_time", cSn.ZU());
                jSONObject.put("network_time", cSn.lk());
                jSONObject.put("client_end_time", cSn.JXs());
                jSONObject.put("download_resource_duration", cSn.ebl());
                jSONObject.put("resource_source", cSn.OY());
                jSONObject.put("is_bidding", cSn.Lxb ? 1 : 0);
                if (cSn.Lxb) {
                    jSONObject.put("load_wait_time", cSn.LD);
                }
                jLc = cSn.lc();
            }
        } catch (JSONException e) {
            sLN.Lxb("TTAppOpenAdReport", "reportLoadNetDuration json error", e);
        }
        lk.Lxb(tDVar, "load_net_duration", jLc, jSONObject);
    }

    public static void Lxb(tD tDVar, long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            Lxb(jSONObject, tDVar);
            jSONObject.put("openad_creative_type", tD.JXs(tDVar) ? "video_normal_ad" : "image_normal_ad");
        } catch (JSONException unused) {
            sLN.Lxb("TTAppOpenAdReport", "reportLoadCacheDuration json error");
        }
        lk.Lxb(tDVar, "load_cache_duration", j, jSONObject);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x000e  */
    private static void Lxb(JSONObject jSONObject, tD tDVar) {
        int i;
        if (tDVar != null) {
            try {
                if (tDVar.kVf()) {
                    i = 1;
                } else {
                    i = 0;
                }
            } catch (JSONException e) {
                sLN.Lxb("TTAppOpenAdReport", e.getMessage());
                return;
            }
        } else {
            i = 0;
        }
        jSONObject.put("is_icon_only", i);
    }
}
