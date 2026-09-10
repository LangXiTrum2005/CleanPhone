package com.bytedance.sdk.openadsdk.core.co.di;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.ac;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class mj {
    public void ri(String str, wjv wjvVar, String str2, Map<String, String> map) {
        if (map != null) {
            try {
                if (map.isEmpty()) {
                    return;
                }
                String str3 = map.get("label");
                if (TextUtils.isEmpty(str3)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                String strYjg = wjvVar.yjg();
                if (!"sendLogExtra".equals(str) || TextUtils.isEmpty(strYjg)) {
                    jSONObject.put("log_extra", strYjg);
                } else {
                    JSONObject jSONObject2 = new JSONObject(strYjg);
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        if (!"label".equals(entry.getKey())) {
                            jSONObject2.put(entry.getKey(), entry.getValue());
                        }
                    }
                    jSONObject.put("log_extra", jSONObject2.toString());
                }
                JSONObject jSONObject3 = new JSONObject();
                if ("sendAdExtra".equals(str)) {
                    for (Map.Entry<String, String> entry2 : map.entrySet()) {
                        if (!"label".equals(entry2.getKey())) {
                            jSONObject3.put(entry2.getKey(), entry2.getValue());
                        }
                    }
                }
                jSONObject.put("ad_extra_data", jSONObject3.toString());
                jSONObject.putOpt("ua_policy", Integer.valueOf(wjvVar.hd()));
                com.bytedance.sdk.openadsdk.ka.ik.ri(wjvVar, "app_union", str2, str3, Long.parseLong(wjvVar.tn()), 0L, jSONObject, ac.xha(wjvVar));
            } catch (Throwable unused) {
            }
        }
    }
}
