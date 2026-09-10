package com.bytedance.sdk.component.OY.LD;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb {
    public int LD;
    public int Lxb;
    public int ZU;
    public int lk;

    public Lxb(int i, int i2, int i3, int i4) {
        this.Lxb = i;
        this.LD = i2;
        this.lk = i3;
        this.ZU = i4;
    }

    public JSONObject Lxb() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sdk_thread_num", this.Lxb);
            jSONObject.put("sdk_max_thread_num", this.LD);
            jSONObject.put("app_thread_num", this.lk);
            jSONObject.put("app_max_thread_num", this.ZU);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }
}
