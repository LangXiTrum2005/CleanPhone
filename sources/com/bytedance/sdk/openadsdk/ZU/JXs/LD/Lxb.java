package com.bytedance.sdk.openadsdk.ZU.JXs.LD;

import com.bytedance.sdk.openadsdk.ZU.JXs.LD.lk;
import com.bytedance.sdk.openadsdk.core.model.tD;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb<T extends lk> {
    private boolean JXs = false;
    private String LD;
    private tD Lxb;
    private T ZU;
    private JSONObject lk;

    public Lxb(tD tDVar, String str, JSONObject jSONObject, T t) {
        this.Lxb = tDVar;
        this.LD = str;
        this.lk = jSONObject;
        this.ZU = t;
    }

    public boolean JXs() {
        return this.JXs;
    }

    public String LD() {
        return this.LD;
    }

    public tD Lxb() {
        return this.Lxb;
    }

    public T ZU() {
        return this.ZU;
    }

    public JSONObject lk() {
        if (this.lk == null) {
            this.lk = new JSONObject();
        }
        return this.lk;
    }

    public void Lxb(boolean z) {
        this.JXs = z;
    }
}
