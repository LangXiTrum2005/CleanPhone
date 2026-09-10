package com.bytedance.sdk.openadsdk.core.model;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class exc {
    public static int qdl = 1;
    public static int ud = 2;
    private int lnr = 5;
    private int mml = 30;
    private int mzz = 70;
    private int mo = 1;
    private int wd = qdl;
    private int jpc = 0;
    private int tvp = 0;
    private int to = 3;

    public int jpc() {
        return this.wd;
    }

    public int lnr() {
        return this.jpc;
    }

    public int mml() {
        return this.lnr;
    }

    public int mo() {
        return this.mzz;
    }

    public int mzz() {
        return this.mml;
    }

    public int qdl() {
        return this.to;
    }

    public int ud() {
        return this.tvp;
    }

    public int wd() {
        return this.mo;
    }

    public void jpc(int i2) {
        this.wd = i2;
    }

    public void lnr(int i2) {
        this.jpc = i2;
    }

    public void mml(int i2) {
        this.lnr = i2;
    }

    public void mo(int i2) {
        this.mzz = i2;
    }

    public void mzz(int i2) {
        this.mml = i2;
    }

    public void qdl(int i2) {
        this.to = i2;
    }

    public void ud(int i2) {
        this.tvp = i2;
    }

    public void wd(int i2) {
        this.mo = i2;
    }

    public boolean qdl(boolean z2) {
        if (z2) {
            int i2 = this.jpc;
            return i2 == 1 || i2 == 3;
        }
        int i3 = this.jpc;
        return i3 == 3 || i3 == 2;
    }

    public JSONObject qdl(JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("ceiling_time", this.lnr);
            jSONObject.put("ceiling_ratio", this.mml);
            jSONObject.put("expand_ratio", this.mzz);
            jSONObject.put("back_type", this.mo);
            jSONObject.put("boc_return_type", this.wd);
            jSONObject.put("pre_render_status", this.jpc);
            jSONObject.put("pre_render_use_gecko", this.tvp);
            jSONObject.put("pre_render_add_type", this.to);
            return jSONObject;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.aaj.lnr("InteractionParams", th.getMessage());
            return jSONObject;
        }
    }
}
