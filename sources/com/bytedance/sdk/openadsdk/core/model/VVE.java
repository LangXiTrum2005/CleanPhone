package com.bytedance.sdk.openadsdk.core.model;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class VVE {
    public static int LD = 2;
    public static int Lxb = 1;
    private int lk = 5;
    private int ZU = 30;
    private int JXs = 70;
    private int lc = 1;
    private int ebl = Lxb;

    public int JXs() {
        return this.ebl;
    }

    public int LD() {
        return this.ZU;
    }

    public int Lxb() {
        return this.lk;
    }

    public int ZU() {
        return this.lc;
    }

    public int lk() {
        return this.JXs;
    }

    public void JXs(int i) {
        this.ebl = i;
    }

    public void LD(int i) {
        this.ZU = i;
    }

    public void Lxb(int i) {
        this.lk = i;
    }

    public void ZU(int i) {
        this.lc = i;
    }

    public void lk(int i) {
        this.JXs = i;
    }

    public JSONObject Lxb(JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("ceiling_time", this.lk);
            jSONObject.put("ceiling_ratio", this.ZU);
            jSONObject.put("expand_ratio", this.JXs);
            jSONObject.put("back_type", this.lc);
            jSONObject.put("boc_return_type", this.ebl);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.sLN.Lxb("InteractionParams", th.getMessage());
        }
        return jSONObject;
    }
}
