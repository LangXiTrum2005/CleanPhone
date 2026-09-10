package com.bytedance.sdk.openadsdk.core.JVA.lc;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb {
    private String JXs;
    private String LD;
    private String Lxb;
    private String ZU;
    private String lk;

    public String JXs() {
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

    public String lk() {
        return this.lk;
    }

    public Lxb JXs(String str) {
        this.JXs = str;
        return this;
    }

    public Lxb LD(String str) {
        this.LD = str;
        return this;
    }

    public Lxb Lxb(String str) {
        this.Lxb = str;
        return this;
    }

    public Lxb ZU(String str) {
        this.ZU = str;
        return this;
    }

    public Lxb lk(String str) {
        this.lk = str;
        return this;
    }

    public JSONObject Lxb(Lxb lxb) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.Lxb);
            jSONObject.put("md5", this.LD);
            jSONObject.put("url", this.lk);
            if (lxb != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("id", lxb.Lxb());
                jSONObject2.put("md5", lxb.LD());
                jSONObject2.put("url", lxb.lk());
                jSONObject.put("overlay", jSONObject2);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
