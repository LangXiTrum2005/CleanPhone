package com.bytedance.sdk.openadsdk.core.model;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ay {
    private final int ik;
    private final int ka;
    private final int lr;
    private final int ri;

    public ay(JSONObject jSONObject) {
        this.ri = jSONObject.optInt("max_time", 0);
        this.lr = jSONObject.optInt("auto_skip_time", -1);
        this.ik = jSONObject.optInt("show_after_inactivity", 10);
        this.ka = jSONObject.optInt("user_wait_time", 10);
    }

    public int ik() {
        return this.ka;
    }

    public int lr() {
        return this.ik;
    }

    public int ri() {
        return this.ri;
    }
}
