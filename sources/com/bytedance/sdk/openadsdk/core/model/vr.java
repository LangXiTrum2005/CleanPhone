package com.bytedance.sdk.openadsdk.core.model;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class vr {
    private final int lr;
    private final int ri;

    public vr(JSONObject jSONObject) {
        this.ri = jSONObject.optInt("auto_click", 0);
        this.lr = jSONObject.optInt("hidden_bar", 0);
    }

    public boolean lr() {
        return this.lr == 1;
    }

    public int ri() {
        return this.ri;
    }

    public static boolean ri(wjv wjvVar) {
        if (wjvVar == null || !wjvVar.zz() || wjvVar.yw() == null) {
            return false;
        }
        return wjvVar.yw().lr();
    }
}
