package com.bytedance.adsdk.ugeno.core;

import android.content.Context;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class OY {
    private JSONObject LD;
    private Context Lxb;
    private Map<String, Object> ZU;
    private JSONObject lk;

    public void LD(JSONObject jSONObject) {
        this.lk = jSONObject;
    }

    public void Lxb(Context context) {
        this.Lxb = context;
    }

    public Map<String, Object> LD() {
        return this.ZU;
    }

    public void Lxb(JSONObject jSONObject) {
        this.LD = jSONObject;
    }

    public JSONObject Lxb() {
        return this.lk;
    }

    public void Lxb(Map<String, Object> map) {
        this.ZU = map;
    }
}
