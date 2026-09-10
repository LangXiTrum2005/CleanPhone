package com.bytedance.sdk.openadsdk.core.rq.mo;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.aaj;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class jpc {
    public void qdl(String str, ljh ljhVar, String str2, Map<String, String> map) {
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
                String strIr = ljhVar.ir();
                if (!"sendLogExtra".equals(str) || TextUtils.isEmpty(strIr)) {
                    jSONObject.put("log_extra", strIr);
                } else {
                    JSONObject jSONObject2 = new JSONObject(strIr);
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
                jSONObject.putOpt("ua_policy", Integer.valueOf(ljhVar.jle()));
                com.bytedance.sdk.openadsdk.mml.lnr.qdl(ljhVar, "app_union", str2, str3, Long.parseLong(ljhVar.yre()), 0L, jSONObject, aaj.wd(ljhVar));
            } catch (Throwable unused) {
            }
        }
    }
}
