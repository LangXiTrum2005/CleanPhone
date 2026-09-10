package com.bytedance.sdk.openadsdk.component.ka;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.ac;
import com.bytedance.sdk.openadsdk.core.model.hcw;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.nr;
import com.bytedance.sdk.openadsdk.core.vr;
import com.bytedance.sdk.openadsdk.ka.ik;
import com.bytedance.sdk.openadsdk.slm.ka;
import com.bytedance.sdk.openadsdk.slm.lr;
import com.bytedance.sdk.openadsdk.utils.dzy;
import com.bytedance.sdk.openadsdk.utils.pv;
import com.ironsource.C3700q2;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ri {
    public static void lr(wjv wjvVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("openad_creative_type", wjv.fi(wjvVar) ? "video_normal_ad" : "image_normal_ad");
        } catch (JSONException e) {
            ac.ri("TTAppOpenAdReport", "reportCacheLoss json error", e);
        }
        ik.ik(wjvVar, "cache_loss", jSONObject);
    }

    public static void ri(final int i, final int i2, final hcw hcwVar) {
        ka.ri("openad_load_ad_timeout", false, new lr() { // from class: com.bytedance.sdk.openadsdk.component.ka.ri.1
            @Override // com.bytedance.sdk.openadsdk.slm.lr
            public com.bytedance.sdk.openadsdk.slm.ri.ik ri() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("timeout_type", i);
                jSONObject.put("user_timeout_time", i2);
                hcw hcwVar2 = hcwVar;
                if (hcwVar2 != null) {
                    jSONObject.put("start_type", hcwVar2.qt() == 1);
                    jSONObject.put("load_index", hcwVar.qt());
                }
                jSONObject.put("start_type_backup", com.bytedance.sdk.openadsdk.component.xha.ri.ka());
                jSONObject.put("app_running_time", com.bytedance.sdk.openadsdk.component.xha.ri.lr());
                return com.bytedance.sdk.openadsdk.slm.ri.ka.lr().ri("openad_load_ad_timeout").lr(jSONObject.toString());
            }
        });
    }

    public static void ri(wjv wjvVar, int i, int i2, float f) {
        JSONObject jSONObject = new JSONObject();
        try {
            ri(jSONObject, wjvVar);
            jSONObject.put("openad_creative_type", wjv.fi(wjvVar) ? "video_normal_ad" : "image_normal_ad");
            jSONObject.put("total_time", f);
            ik.ri(jSONObject, i2, i);
        } catch (JSONException e) {
            ac.ri("TTAppOpenAdReport", "reportSkip json error", e);
        }
        ik.ri(wjvVar, "skip", i, jSONObject, (JSONObject) null);
    }

    public static void lr(wjv wjvVar, long j, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("size", wjvVar.eu().taiyuan());
            jSONObject.put("video_duration", wjvVar.eu().beachfront());
            jSONObject.put(C3700q2.u, z ? 1 : 2);
        } catch (JSONException unused) {
        }
        ik.ri(wjvVar, "download_video_duration", j, jSONObject, (JSONObject) null);
    }

    public static void ri(wjv wjvVar, long j, float f, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            ri(jSONObject, wjvVar);
            jSONObject.put("openad_creative_type", wjv.fi(wjvVar) ? "video_normal_ad" : "image_normal_ad");
            if (z) {
                double d = f;
                jSONObject.put("video_duration", d);
                jSONObject.put("video_percent", (int) (((j * 1.0d) / 10.0d) / d));
            } else {
                jSONObject.put("image_duration", f);
            }
        } catch (JSONException e) {
            ac.ri("TTAppOpenAdReport", "reportDestroy json error", e);
        }
        ik.ik(wjvVar, "destroy", jSONObject);
    }

    public static void ri(wjv wjvVar) {
        ik.ik(wjvVar, "cache_expire", (JSONObject) null);
    }

    public static void ri(final String str, final int i, final int i2, final boolean z) {
        dzy.lr(new com.bytedance.sdk.component.mj.lr.ik("opencache") { // from class: com.bytedance.sdk.openadsdk.component.ka.ri.2
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.core.model.ri riVarLr;
                try {
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    JSONObject jSONObject = new JSONObject(str);
                    if (jSONObject.has("cypher")) {
                        jSONObject = nr.ik().ri(jSONObject);
                    }
                    if (jSONObject == null || !jSONObject.has("creatives") || (riVarLr = com.bytedance.sdk.openadsdk.core.model.ri.lr(jSONObject)) == null || !riVarLr.fi()) {
                        return;
                    }
                    ri.ri(riVarLr.di(), i, i2, z);
                } catch (Throwable unused) {
                }
            }
        });
    }

    public static void ri(wjv wjvVar, int i, int i2, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cache_lib", i);
            jSONObject.put("cache_replace", z ? 1 : 0);
            jSONObject.put("cache_refresh_scene", i2);
            if (i2 == 0) {
                jSONObject.put("cache_preload", 0);
            } else {
                jSONObject.put("cache_preload", 1);
            }
            jSONObject.put("aoa_cache_count", com.bytedance.sdk.openadsdk.component.xha.ri.mj());
            ik.ri(wjvVar, "cache_refresh", -1L, (JSONObject) null, jSONObject);
        } catch (JSONException e) {
            ac.ri("TTAppOpenAdReport", "reportCacheRefresh json error", e);
        }
    }

    public static void ri(wjv wjvVar, long j, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C3700q2.u, z ? 1 : 2);
        } catch (JSONException unused) {
        }
        ik.ri(wjvVar, "download_image_duration", j, jSONObject, (JSONObject) null);
    }

    public static void ri(wjv wjvVar, int i, hcw hcwVar) {
        JSONObject jSONObject = new JSONObject();
        long jDi = 0;
        try {
            jSONObject.put("openad_creative_type", wjv.fi(wjvVar) ? "video_normal_ad" : "image_normal_ad");
            jSONObject.put("open_ad_cache_type", i);
            if (hcwVar != null) {
                hcwVar.lr(pv.lr());
                ri(jSONObject, wjvVar);
                jSONObject.put("client_start_time", hcwVar.lr());
                jSONObject.put("sever_time", hcwVar.ka());
                jSONObject.put("network_time", hcwVar.ik());
                jSONObject.put("client_end_time", hcwVar.fi());
                jSONObject.put("download_resource_duration", hcwVar.xha());
                jSONObject.put("resource_source", hcwVar.mj());
                jSONObject.put("is_bidding", hcwVar.ri ? 1 : 0);
                if (hcwVar.ri) {
                    jSONObject.put("load_wait_time", hcwVar.lr);
                }
                jDi = hcwVar.di();
            }
        } catch (JSONException e) {
            ac.ri("TTAppOpenAdReport", "reportLoadNetDuration json error", e);
        }
        ik.ri(wjvVar, "load_net_duration", jDi, jSONObject, (JSONObject) null);
    }

    public static void ri(wjv wjvVar, long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            ri(jSONObject, wjvVar);
            jSONObject.put("openad_creative_type", wjv.fi(wjvVar) ? "video_normal_ad" : "image_normal_ad");
        } catch (JSONException unused) {
            ac.ik("TTAppOpenAdReport", "reportLoadCacheDuration json error");
        }
        ik.ri(wjvVar, "load_cache_duration", j, jSONObject, (JSONObject) null);
    }

    public static void ri(final hcw hcwVar, final int i, final int i2) {
        if (hcwVar != null) {
            ka.ri("app_running_time", false, new lr() { // from class: com.bytedance.sdk.openadsdk.component.ka.ri.3
                @Override // com.bytedance.sdk.openadsdk.slm.lr
                public com.bytedance.sdk.openadsdk.slm.ri.ik ri() throws Exception {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("app_running_time", hcwVar.jbs());
                    jSONObject.put("loaded_app_running_time", com.bytedance.sdk.openadsdk.component.xha.ri.lr());
                    jSONObject.put("load_time", hcwVar.ri().ka());
                    jSONObject.put("load_from", i);
                    jSONObject.put("load_result", i2);
                    int iQt = hcwVar.qt();
                    jSONObject.put("load_index", iQt);
                    if (iQt == 1) {
                        jSONObject.put("init_to_ad_load_time", SystemClock.elapsedRealtime() - vr.ik);
                    }
                    return com.bytedance.sdk.openadsdk.slm.ri.ka.lr().ri("app_running_time").lr(jSONObject.toString());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000c  */
    private static void ri(JSONObject jSONObject, wjv wjvVar) {
        int i;
        if (wjvVar != null) {
            try {
                if (wjvVar.ory()) {
                    i = 1;
                } else {
                    i = 0;
                }
            } catch (JSONException e) {
                ac.ik("TTAppOpenAdReport", e.getMessage());
                return;
            }
        } else {
            i = 0;
        }
        jSONObject.put("is_icon_only", i);
    }
}
