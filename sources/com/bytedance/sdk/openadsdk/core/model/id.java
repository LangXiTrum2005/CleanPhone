package com.bytedance.sdk.openadsdk.core.model;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class id {
    private JSONObject JXs;
    private String LD;
    private String Lxb;
    private String ZU;
    private String lk;

    public JSONObject JXs() {
        return this.JXs;
    }

    public String LD() {
        return this.LD;
    }

    public String Lxb() {
        return this.Lxb;
    }

    public String ZU() {
        return this.ZU;
    }

    public JSONObject lc() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.Lxb);
            jSONObject.put("md5", this.LD);
            jSONObject.put("url", this.lk);
            jSONObject.put("data", this.ZU);
            jSONObject.put("custom_components", this.JXs);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public String lk() {
        return this.lk;
    }

    public static id Lxb(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        id idVar = new id();
        idVar.Lxb = jSONObject.optString("id");
        idVar.ZU = jSONObject.optString("data");
        idVar.lk = jSONObject.optString("url");
        idVar.LD = jSONObject.optString("md5");
        idVar.JXs = jSONObject.optJSONObject("custom_components");
        return idVar;
    }
}
