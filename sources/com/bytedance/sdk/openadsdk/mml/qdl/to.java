package com.bytedance.sdk.openadsdk.mml.qdl;

import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class to implements com.bytedance.sdk.openadsdk.bjy.ud {
    private final com.bytedance.sdk.component.mo.qdl.mo.mml qdl;
    private final boolean ud;

    public to(boolean z2, com.bytedance.sdk.component.mo.qdl.mo.mml mmlVar) {
        this.qdl = mmlVar;
        this.ud = z2;
    }

    @Override // com.bytedance.sdk.openadsdk.bjy.ud
    public com.bytedance.sdk.openadsdk.bjy.qdl.lnr getLogStats() throws Exception {
        int i2;
        if (this.qdl == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", this.ud);
        jSONObject.put("url", this.qdl.ud());
        int iMml = this.qdl.mml();
        if (iMml <= 0) {
            iMml = 0;
        }
        jSONObject.put("retry_times", iMml);
        jSONObject.put("ad_id", this.qdl.mo());
        jSONObject.put("track_type", this.qdl.mzz());
        if (!this.ud) {
            i2 = 4;
        } else if (this.qdl.to()) {
            i2 = 3;
        } else {
            i2 = this.qdl.mml() <= 0 ? 1 : 2;
        }
        jSONObject.put("upload_scene", i2);
        String strWd = this.qdl.wd();
        if (!TextUtils.isEmpty(strWd)) {
            JSONArray jSONArray = new JSONArray();
            for (String str : strWd.split(",")) {
                jSONArray.put(str);
            }
            jSONObject.put("error_code", jSONArray);
        }
        String strTvp = this.qdl.tvp();
        if (!TextUtils.isEmpty(strTvp)) {
            JSONArray jSONArray2 = new JSONArray();
            for (String str2 : strTvp.split(",")) {
                jSONArray2.put(str2);
            }
            jSONObject.put("error_msg", jSONArray2);
        }
        return com.bytedance.sdk.openadsdk.bjy.qdl.mml.ud().qdl("track_link_result").ud(jSONObject.toString());
    }
}
