package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class HD {
    private String LD;
    private String Lxb;
    private int ZU;
    private int lk;

    public void LD(String str) {
        this.LD = str;
    }

    public void Lxb(String str) {
        this.Lxb = str;
    }

    public JSONObject lk() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.Lxb)) {
                jSONObject.put("market_dpl", this.Lxb);
            }
            if (!TextUtils.isEmpty(this.LD)) {
                jSONObject.put("market_dpl_auto", this.LD);
            }
            jSONObject.put("exec_type", this.lk);
            jSONObject.put("oem_vendor_type", this.ZU);
            return jSONObject;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.sLN.Lxb("OemModel", th.getMessage());
            return null;
        }
    }

    public void LD(int i) {
        this.ZU = i;
    }

    public void Lxb(int i) {
        this.lk = i;
    }

    public String LD() {
        if (this.lk == 2) {
            return this.LD;
        }
        return this.Lxb;
    }

    public boolean Lxb() {
        return this.ZU == 1;
    }

    public static HD Lxb(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        HD hd = new HD();
        try {
            hd.Lxb(jSONObject.optString("market_dpl", ""));
            hd.LD(jSONObject.optString("market_dpl_auto", ""));
            hd.Lxb(jSONObject.optInt("exec_type", 0));
            hd.LD(jSONObject.optInt("oem_vendor_type", 0));
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.sLN.Lxb("OemModel", th.getMessage());
        }
        return hd;
    }
}
