package com.bytedance.sdk.openadsdk.core.model;

import androidx.annotation.Nullable;
import com.umeng.analytics.pro.bc;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class JVA {
    private String LD;
    private String Lxb;
    private int lk;

    public String LD() {
        return this.LD;
    }

    public String Lxb() {
        return this.Lxb;
    }

    @Nullable
    public JSONObject ZU() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(bc.aN, this.Lxb);
            jSONObject.put("ft", this.lk);
            jSONObject.put("fu", this.LD);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public int lk() {
        return this.lk;
    }

    public void LD(String str) {
        this.LD = str;
    }

    public void Lxb(String str) {
        this.Lxb = str;
    }

    public void Lxb(int i) {
        this.lk = i;
    }
}
