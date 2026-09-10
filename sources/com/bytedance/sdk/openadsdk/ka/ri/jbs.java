package com.bytedance.sdk.openadsdk.ka.ri;

import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class jbs implements com.bytedance.sdk.openadsdk.slm.lr {
    private final boolean lr;
    private final com.bytedance.sdk.component.di.ri.di.ka ri;

    public jbs(boolean z, com.bytedance.sdk.component.di.ri.di.ka kaVar) {
        this.ri = kaVar;
        this.lr = z;
    }

    @Override // com.bytedance.sdk.openadsdk.slm.lr
    public com.bytedance.sdk.openadsdk.slm.ri.ik ri() throws Exception {
        int i;
        if (this.ri == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", this.lr);
        jSONObject.put("url", this.ri.lr());
        int iKa = this.ri.ka();
        if (iKa <= 0) {
            iKa = 0;
        }
        jSONObject.put("retry_times", iKa);
        jSONObject.put("ad_id", this.ri.di());
        jSONObject.put("track_type", this.ri.fi());
        if (!this.lr) {
            i = 4;
        } else if (this.ri.qt()) {
            i = 3;
        } else {
            i = this.ri.ka() <= 0 ? 1 : 2;
        }
        jSONObject.put("upload_scene", i);
        String strXha = this.ri.xha();
        if (!TextUtils.isEmpty(strXha)) {
            JSONArray jSONArray = new JSONArray();
            for (String str : strXha.split(",")) {
                jSONArray.put(str);
            }
            jSONObject.put("error_code", jSONArray);
        }
        String strJbs = this.ri.jbs();
        if (!TextUtils.isEmpty(strJbs)) {
            JSONArray jSONArray2 = new JSONArray();
            for (String str2 : strJbs.split(",")) {
                jSONArray2.put(str2);
            }
            jSONObject.put("error_msg", jSONArray2);
        }
        return com.bytedance.sdk.openadsdk.slm.ri.ka.lr().ri("track_link_result").lr(jSONObject.toString());
    }
}
