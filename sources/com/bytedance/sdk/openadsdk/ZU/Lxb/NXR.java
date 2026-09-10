package com.bytedance.sdk.openadsdk.ZU.Lxb;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class NXR implements com.bytedance.sdk.openadsdk.STP.LD {
    private final boolean LD;
    private final com.bytedance.sdk.component.lc.Lxb.lc.ZU Lxb;

    public NXR(boolean z, com.bytedance.sdk.component.lc.Lxb.lc.ZU zu) {
        this.Lxb = zu;
        this.LD = z;
    }

    @Override // com.bytedance.sdk.openadsdk.STP.LD
    @Nullable
    public com.bytedance.sdk.openadsdk.STP.Lxb.lk getLogStats() throws Exception {
        int i;
        if (this.Lxb == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", this.LD);
        jSONObject.put("url", this.Lxb.LD());
        int iZU = this.Lxb.ZU();
        if (iZU <= 0) {
            iZU = 0;
        }
        jSONObject.put("retry_times", iZU);
        jSONObject.put("ad_id", this.Lxb.lc());
        jSONObject.put("track_type", this.Lxb.JXs());
        if (!this.LD) {
            i = 4;
        } else if (this.Lxb.nBu()) {
            i = 3;
        } else {
            i = this.Lxb.ZU() <= 0 ? 1 : 2;
        }
        jSONObject.put("upload_scene", i);
        String strEbl = this.Lxb.ebl();
        if (!TextUtils.isEmpty(strEbl)) {
            JSONArray jSONArray = new JSONArray();
            for (String str : strEbl.split(",")) {
                jSONArray.put(str);
            }
            jSONObject.put("error_code", jSONArray);
        }
        String strQAg = this.Lxb.QAg();
        if (!TextUtils.isEmpty(strQAg)) {
            JSONArray jSONArray2 = new JSONArray();
            for (String str2 : strQAg.split(",")) {
                jSONArray2.put(str2);
            }
            jSONObject.put("error_msg", jSONArray2);
        }
        return com.bytedance.sdk.openadsdk.STP.Lxb.ZU.LD().Lxb("track_link_result").LD(jSONObject.toString());
    }
}
