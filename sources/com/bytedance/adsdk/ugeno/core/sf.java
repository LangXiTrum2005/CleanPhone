package com.bytedance.adsdk.ugeno.core;

import android.content.Context;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class sf {
    private JSONObject ik;
    private Map<String, Object> ka;
    private JSONObject lr;
    private Context ri;

    public void lr(JSONObject jSONObject) {
        this.ik = jSONObject;
    }

    public void ri(Context context) {
        this.ri = context;
    }

    public Map<String, Object> lr() {
        return this.ka;
    }

    public void ri(JSONObject jSONObject) {
        this.lr = jSONObject;
    }

    public JSONObject ri() {
        return this.ik;
    }

    public void ri(Map<String, Object> map) {
        this.ka = map;
    }
}
