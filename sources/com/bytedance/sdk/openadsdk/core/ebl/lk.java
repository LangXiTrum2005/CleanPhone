package com.bytedance.sdk.openadsdk.core.ebl;

import com.bytedance.sdk.component.ebl.LD.ZU;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.utils.nJ;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class lk {
    private static JSONObject LD(String str, long j) {
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

    public static void Lxb(String str, long j) {
        JSONObject jSONObjectLD = LD(str, j);
        ZU zuLD = com.bytedance.sdk.openadsdk.kqm.lk.Lxb().LD().LD();
        zuLD.LD(nJ.ZU("/api/ad/union/sdk/stats/"));
        zuLD.ZU(jSONObjectLD.toString());
        zuLD.Lxb(6);
        zuLD.Lxb("uploadFrequentEvent");
        zuLD.Lxb(new com.bytedance.sdk.component.ebl.Lxb.Lxb() { // from class: com.bytedance.sdk.openadsdk.core.ebl.lk.1
            @Override // com.bytedance.sdk.component.ebl.Lxb.Lxb
            public void Lxb(com.bytedance.sdk.component.ebl.LD.lk lkVar, com.bytedance.sdk.component.ebl.LD ld) {
            }

            @Override // com.bytedance.sdk.component.ebl.Lxb.Lxb
            public void Lxb(com.bytedance.sdk.component.ebl.LD.lk lkVar, IOException iOException) {
                iOException.getMessage();
            }
        });
    }
}
