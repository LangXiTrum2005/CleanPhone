package com.bytedance.sdk.openadsdk.core.model;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class uq {
    private String ri = "horizontal";
    private int lr = 1;
    private int ik = 1;
    private int ka = 0;
    private int fi = 0;
    private int di = 0;
    private int xha = 0;
    private int mj = 5000;
    private int jbs = 500;
    private int qt = 0;

    public int di() {
        return this.di;
    }

    public int fi() {
        return this.fi;
    }

    public int ik() {
        return this.ik;
    }

    public int jbs() {
        return this.jbs;
    }

    public int ka() {
        return this.ka;
    }

    public int lr() {
        return this.lr;
    }

    public int mj() {
        return this.mj;
    }

    public int qt() {
        return this.qt;
    }

    public String ri() {
        return this.ri;
    }

    public int xha() {
        return this.xha;
    }

    public static uq ri(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new uq();
        }
        uq uqVar = new uq();
        uqVar.ri = jSONObject.optString("direction", "horizontal");
        uqVar.lr = jSONObject.optInt("auto_loop", 1);
        uqVar.ik = jSONObject.optInt("allow_manual_loop", 1);
        uqVar.ka = jSONObject.optInt("unlimited_loop", 0);
        uqVar.fi = jSONObject.optInt("left_margin", 0);
        uqVar.di = jSONObject.optInt("right_margin", 0);
        uqVar.xha = jSONObject.optInt("ad_margin", 0);
        uqVar.mj = jSONObject.optInt("loop_interval_time", 5000);
        uqVar.jbs = jSONObject.optInt("flip_speed", 500);
        uqVar.qt = jSONObject.optInt("stop_auto_loop", 0);
        return uqVar;
    }
}
