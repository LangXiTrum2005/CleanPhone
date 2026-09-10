package com.bytedance.sdk.openadsdk.core.model;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class su {
    private int ik;
    private String ka = "Next Ad";
    private int lr;
    private int ri;

    public String ik() {
        return this.ka;
    }

    public int ka() {
        return this.ri;
    }

    public int lr() {
        return this.lr;
    }

    public int ri() {
        return this.ik;
    }

    public void ik(int i) {
        this.ri = i;
    }

    public void lr(int i) {
        this.lr = i;
    }

    public void ri(int i) {
        this.ik = i;
    }

    public void ri(String str) {
        this.ka = str;
    }

    public static su ri(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        su suVar = new su();
        try {
            int iMax = Math.max(jSONObject.optInt("endcard_show_time", 0), 0);
            int iOptInt = jSONObject.optInt("is_allow_pause", 0);
            int iOptInt2 = jSONObject.optInt(CampaignEx.JSON_KEY_LANDING_TYPE, 0);
            String strOptString = jSONObject.optString("endcard_next_ad_text", "Next Ad");
            suVar.ik(iMax);
            suVar.lr(iOptInt);
            suVar.ri(strOptString);
            suVar.ri(iOptInt2);
        } catch (Throwable unused) {
        }
        return suVar;
    }
}
