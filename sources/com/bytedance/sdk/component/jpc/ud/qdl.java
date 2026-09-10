package com.bytedance.sdk.component.jpc.ud;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class qdl {
    public int lnr;
    public int mml;
    public int qdl;
    public int ud;

    public qdl(int i2, int i3, int i4, int i5) {
        this.qdl = i2;
        this.ud = i3;
        this.lnr = i4;
        this.mml = i5;
    }

    public JSONObject qdl() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sdk_thread_num", this.qdl);
            jSONObject.put("sdk_max_thread_num", this.ud);
            jSONObject.put("app_thread_num", this.lnr);
            jSONObject.put("app_max_thread_num", this.mml);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }
}
