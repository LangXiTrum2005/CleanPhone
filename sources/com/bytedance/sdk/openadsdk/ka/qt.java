package com.bytedance.sdk.openadsdk.ka;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.ac;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class qt {
    /* JADX INFO: Access modifiers changed from: private */
    public static JSONObject lr(wjv wjvVar, String str, int i, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            if (!TextUtils.isEmpty(str)) {
                jSONObject2.put("error_msg", str);
            }
            int i2 = 1;
            jSONObject2.put("ad_show_order", i + 1);
            jSONObject2.put("interaction_method", wjvVar.zb());
            jSONObject2.put("real_interaction_method", wjvVar.nd());
            jSONObject2.put("give_up_reward", wjvVar.slm() ? 1 : 2);
            if (!wjvVar.jc()) {
                i2 = 2;
            }
            jSONObject2.put("has_reward", i2);
            if (jSONObject != null && jSONObject.length() > 0) {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    try {
                        jSONObject2.put(next, jSONObject.get(next));
                    } catch (JSONException unused) {
                    }
                }
            }
        } catch (Throwable unused2) {
        }
        return jSONObject2;
    }

    public static void ri(wjv wjvVar, String str, String str2, String str3) {
        ri(wjvVar, str, str2, str3, null);
    }

    public static void ri(wjv wjvVar, String str, String str2, String str3, JSONObject jSONObject) {
        ri(wjvVar, str, str2, str3, jSONObject, 0);
    }

    public static void ri(final wjv wjvVar, String str, String str2, final String str3, final JSONObject jSONObject, final int i) {
        if (wjvVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        ik.ri(System.currentTimeMillis(), wjvVar, str2, str, new com.bytedance.sdk.openadsdk.slm.lr.ri() { // from class: com.bytedance.sdk.openadsdk.ka.qt.1
            @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
            public JSONObject lr() {
                if (jSONObject == null) {
                    return super.lr();
                }
                long jBu = wjvVar.bu();
                if (jBu < 0) {
                    long jJbs = wjvVar.jbs();
                    if (jJbs > 0) {
                        long jElapsedRealtime = SystemClock.elapsedRealtime() - jJbs;
                        if (jElapsedRealtime > 0) {
                            jBu = jElapsedRealtime;
                        }
                    }
                }
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put(IronSourceConstants.EVENTS_DURATION, jBu);
                    return jSONObject2;
                } catch (Exception e) {
                    ac.ik(e.getMessage(), new Object[0]);
                    return jSONObject2;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
            public JSONObject ri() {
                return qt.lr(wjvVar, str3, i, jSONObject);
            }
        });
    }

    public static void ri(String str, boolean z, boolean z2, wjv wjvVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("has_close_invoke", z ? 1 : 2);
            jSONObject.put("has_show_invoke", z2 ? 1 : 2);
            ri(wjvVar, str, wjvVar != null ? wjvVar.fi() : null, null, jSONObject);
        } catch (JSONException unused) {
        }
    }

    public static void ri(wjv wjvVar, String str, int i) {
        ri(wjvVar, "close".equals(str) ? "close_listen_empty" : "show_listen_empty", wjvVar != null ? wjvVar.fi() : null, null, null, i);
    }
}
