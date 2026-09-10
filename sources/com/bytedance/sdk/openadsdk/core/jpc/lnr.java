package com.bytedance.sdk.openadsdk.core.jpc;

import com.bytedance.sdk.component.wd.ud.mml;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.utils.gy;
import com.bytedance.sdk.openadsdk.utils.jyq;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class lnr {
    public static void qdl(String str, long j) {
        JSONObject jSONObjectUd = ud(str, j);
        mml mmlVarUd = com.bytedance.sdk.openadsdk.jl.ud.ud().lnr().ud();
        mmlVarUd.ud(gy.mml("/api/ad/union/sdk/stats/"));
        mmlVarUd.mml(jSONObjectUd.toString());
        mmlVarUd.qdl(6);
        mmlVarUd.qdl("uploadFrequentEvent");
        mmlVarUd.qdl(new com.bytedance.sdk.component.wd.qdl.qdl() { // from class: com.bytedance.sdk.openadsdk.core.jpc.lnr.1
            @Override // com.bytedance.sdk.component.wd.qdl.qdl
            public void qdl(com.bytedance.sdk.component.wd.ud.lnr lnrVar, com.bytedance.sdk.component.wd.ud udVar) {
            }

            @Override // com.bytedance.sdk.component.wd.qdl.qdl
            public void qdl(com.bytedance.sdk.component.wd.ud.lnr lnrVar, IOException iOException) {
                iOException.getMessage();
                if (lnrVar != null) {
                    jyq.qdl(lnrVar.mml());
                }
            }
        });
    }

    private static JSONObject ud(String str, long j) {
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
}
