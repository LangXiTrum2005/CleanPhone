package com.bytedance.sdk.openadsdk.core.model;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class NXR {
    private final int LD;
    private final int Lxb;
    private final int ZU;
    private final int lk;

    public NXR(JSONObject jSONObject) {
        this.Lxb = jSONObject.optInt("auto_click", 0);
        this.LD = jSONObject.optInt("close_jump_probability", 0);
        this.lk = jSONObject.optInt("skip_jump_probability", 0);
        this.ZU = jSONObject.optInt("hidden_bar", 0);
    }

    public JSONObject JXs() {
        try {
            JSONObject jSONObject = new JSONObject();
            int i = this.Lxb;
            if (i == 1) {
                jSONObject.put("auto_click", i);
            }
            int i2 = this.LD;
            if (i2 > 0 && i2 <= 100) {
                jSONObject.put("close_jump_probability", i2);
            }
            int i3 = this.lk;
            if (i3 > 0 && i3 <= 100) {
                jSONObject.put("skip_jump_probability", i3);
            }
            if (this.ZU == 1) {
                jSONObject.put("hidden_bar", 1);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public int LD() {
        int i = this.LD;
        if (i < 0 || i > 100) {
            return 0;
        }
        return i;
    }

    public int Lxb() {
        return this.Lxb;
    }

    public boolean ZU() {
        return this.ZU == 1;
    }

    public int lk() {
        int i = this.lk;
        if (i < 0 || i > 100) {
            return 0;
        }
        return i;
    }

    public static boolean Lxb(tD tDVar) {
        if (tDVar == null || !tDVar.chu() || tDVar.KOQ() == null) {
            return false;
        }
        return tDVar.KOQ().ZU();
    }
}
