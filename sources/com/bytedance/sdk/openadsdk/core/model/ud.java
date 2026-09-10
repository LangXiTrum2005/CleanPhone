package com.bytedance.sdk.openadsdk.core.model;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class ud {
    private String lnr;
    private String mml;
    private boolean mzz;
    private String qdl;
    private String ud;

    public String lnr() {
        return this.lnr;
    }

    public String mml() {
        return this.mml;
    }

    public JSONObject mo() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("privacy_url", this.lnr);
            jSONObject.put("privacy_title", this.mml);
            jSONObject.put("text", this.ud);
            jSONObject.put("icon", this.qdl);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public boolean mzz() {
        return this.mzz;
    }

    public void qdl(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.qdl = jSONObject.optString("icon");
        this.ud = jSONObject.optString("text");
        this.lnr = jSONObject.optString("privacy_url");
        this.mml = jSONObject.optString("privacy_title");
    }

    public String ud() {
        return this.ud;
    }

    public String qdl() {
        return this.qdl;
    }

    public void qdl(boolean z2) {
        this.mzz = z2;
    }
}
