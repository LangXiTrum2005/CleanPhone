package com.bytedance.adsdk.ugeno.core;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class aw {
    private aw fi;
    private JSONObject ik;
    private aw ka;
    private int lr;
    private com.bytedance.adsdk.ugeno.lr.ik ri;

    public JSONObject ik() {
        return this.ik;
    }

    public aw ka() {
        return this.ka;
    }

    public int lr() {
        return this.lr;
    }

    public com.bytedance.adsdk.ugeno.lr.ik ri() {
        return this.ri;
    }

    public String toString() {
        return "UGenEvent{mWidget=" + this.ri + ", mEventType=" + this.lr + ", mEvent=" + this.ik + '}';
    }

    public void lr(aw awVar) {
        this.fi = awVar;
    }

    public void ri(com.bytedance.adsdk.ugeno.lr.ik ikVar) {
        this.ri = ikVar;
    }

    public void ri(int i) {
        this.lr = i;
    }

    public void ri(JSONObject jSONObject) {
        this.ik = jSONObject;
    }

    public void ri(aw awVar) {
        this.ka = awVar;
    }
}
