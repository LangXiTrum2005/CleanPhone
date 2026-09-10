package com.bytedance.sdk.openadsdk.slm.ri;

import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class fi {
    public static void ri(final String str, final String str2, final int i, final String str3, final String str4, final List<String> list) {
        com.bytedance.sdk.openadsdk.slm.ka.ri(str, false, new com.bytedance.sdk.openadsdk.slm.lr() { // from class: com.bytedance.sdk.openadsdk.slm.ri.fi.1
            @Override // com.bytedance.sdk.openadsdk.slm.lr
            public ik ri() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", str2);
                String str5 = str4;
                if (str5 != null) {
                    jSONObject.put("error_url", str5);
                }
                List list2 = list;
                if (list2 != null && !list2.isEmpty()) {
                    jSONObject.put("back_up_url", list.toString());
                }
                jSONObject.put("error_code", i);
                jSONObject.put("error_msg", str3);
                return ka.lr().ri(str).lr(jSONObject.toString());
            }
        });
    }
}
