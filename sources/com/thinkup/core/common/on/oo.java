package com.thinkup.core.common.on;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class oo {
    public long m;
    public int o;

    public final void o(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.o = jSONObject.optInt("number");
            this.m = jSONObject.optLong("loadTime");
        } catch (Exception unused) {
        }
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("number", this.o);
            jSONObject.put("loadTime", this.m);
        } catch (Exception unused) {
        }
        return jSONObject.toString();
    }
}
