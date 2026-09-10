package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class xmv {
    private int lnr;
    private String mml = "Next Ad";
    private int qdl;
    private int ud;

    public String lnr() {
        return this.mml;
    }

    public int mml() {
        return this.qdl;
    }

    public JSONObject mzz() {
        JSONObject jSONObject = new JSONObject();
        try {
            int i2 = this.qdl;
            if (i2 != -1) {
                jSONObject.put("endcard_show_time", i2);
            }
            jSONObject.put("is_allow_pause", this.ud);
            jSONObject.put("landing_type", this.lnr);
            if (!TextUtils.isEmpty(this.mml)) {
                jSONObject.put("endcard_next_ad_text", this.mml);
            }
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    public int qdl() {
        return this.lnr;
    }

    public int ud() {
        return this.ud;
    }

    public void lnr(int i2) {
        this.qdl = i2;
    }

    public void qdl(int i2) {
        this.lnr = i2;
    }

    public void ud(int i2) {
        this.ud = i2;
    }

    public void qdl(String str) {
        this.mml = str;
    }

    public static xmv qdl(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        xmv xmvVar = new xmv();
        try {
            int iMax = Math.max(jSONObject.optInt("endcard_show_time", 0), 0);
            int iOptInt = jSONObject.optInt("is_allow_pause", 0);
            int iOptInt2 = jSONObject.optInt("landing_type", 0);
            String strOptString = jSONObject.optString("endcard_next_ad_text", "Next Ad");
            xmvVar.lnr(iMax);
            xmvVar.ud(iOptInt);
            xmvVar.qdl(strOptString);
            xmvVar.qdl(iOptInt2);
        } catch (Throwable unused) {
        }
        return xmvVar;
    }
}
