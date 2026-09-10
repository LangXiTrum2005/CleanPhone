package com.bytedance.sdk.openadsdk.core.mj;

import com.bytedance.sdk.component.xha.lr.ka;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.utils.ig;
import com.bytedance.sdk.openadsdk.utils.uq;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ik {
    private static JSONObject lr(String str, long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", "over_freq");
            jSONObject.put("rit", str);
            jSONObject.put("ad_sdk_version", BuildConfig.VERSION_NAME);
            jSONObject.put("timestamp", j);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static void ri(String str, long j) {
        JSONObject jSONObjectLr = lr(str, j);
        ka kaVarLr = com.bytedance.sdk.openadsdk.ac.lr.lr().ik().lr();
        kaVarLr.ik(ig.ka("/api/ad/union/sdk/stats/"));
        kaVarLr.fi(jSONObjectLr.toString());
        kaVarLr.ri(6);
        kaVarLr.lr("uploadFrequentEvent");
        kaVarLr.ri(new com.bytedance.sdk.component.xha.ri.ri() { // from class: com.bytedance.sdk.openadsdk.core.mj.ik.1
            @Override // com.bytedance.sdk.component.xha.ri.ri
            public void ri(com.bytedance.sdk.component.xha.lr.ik ikVar, com.bytedance.sdk.component.xha.lr lrVar) {
            }

            @Override // com.bytedance.sdk.component.xha.ri.ri
            public void ri(com.bytedance.sdk.component.xha.lr.ik ikVar, IOException iOException) {
                iOException.getMessage();
                if (ikVar != null) {
                    uq.ri(ikVar.fi());
                }
            }
        });
    }
}
