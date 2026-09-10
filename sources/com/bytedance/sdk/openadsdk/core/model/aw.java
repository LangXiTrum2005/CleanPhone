package com.bytedance.sdk.openadsdk.core.model;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class aw {
    private int ik;
    private String lr;
    private String ri;

    public int ik() {
        return this.ik;
    }

    public JSONObject ka() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("u", this.ri);
            jSONObject.put("ft", this.ik);
            jSONObject.put("fu", this.lr);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public String lr() {
        return this.lr;
    }

    public String ri() {
        return this.ri;
    }

    public void lr(String str) {
        this.lr = str;
    }

    public void ri(String str) {
        this.ri = str;
    }

    public void ri(int i) {
        this.ik = i;
    }
}
