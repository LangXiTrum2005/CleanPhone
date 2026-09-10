package com.bytedance.sdk.openadsdk.core.model;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class lr {
    private boolean fi;
    private String ik;
    private String ka;
    private String lr;
    private String ri;

    public JSONObject di() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(CampaignEx.JSON_KEY_PRIVACY_URL, this.ik);
            jSONObject.put("privacy_title", this.ka);
            jSONObject.put("text", this.lr);
            jSONObject.put("icon", this.ri);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public boolean fi() {
        return this.fi;
    }

    public String ik() {
        return this.ik;
    }

    public String ka() {
        return this.ka;
    }

    public String lr() {
        return this.lr;
    }

    public void ri(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.ri = jSONObject.optString("icon");
        this.lr = jSONObject.optString("text");
        this.ik = jSONObject.optString(CampaignEx.JSON_KEY_PRIVACY_URL);
        this.ka = jSONObject.optString("privacy_title");
    }

    public String ri() {
        return this.ri;
    }

    public void ri(boolean z) {
        this.fi = z;
    }
}
