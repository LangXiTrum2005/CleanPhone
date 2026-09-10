package com.bytedance.sdk.openadsdk.core.model;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class bch {
    private final int lnr;
    private final int mml;
    private final int qdl;
    private final int ud;

    public bch(JSONObject jSONObject) {
        this.qdl = jSONObject.optInt("max_time", 0);
        this.ud = jSONObject.optInt("auto_skip_time", -1);
        this.lnr = jSONObject.optInt("show_after_inactivity", 10);
        this.mml = jSONObject.optInt("user_wait_time", 10);
    }

    public int lnr() {
        return this.mml;
    }

    public JSONObject mml() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("max_time", this.qdl);
            jSONObject.put("auto_skip_time", this.ud);
            jSONObject.put("show_after_inactivity", this.lnr);
            jSONObject.put("user_wait_time", this.mml);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public int qdl() {
        return this.qdl;
    }

    public int ud() {
        return this.lnr;
    }
}
