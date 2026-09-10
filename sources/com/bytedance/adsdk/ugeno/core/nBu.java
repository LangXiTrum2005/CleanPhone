package com.bytedance.adsdk.ugeno.core;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class nBu {
    private nBu JXs;
    private int LD;
    private com.bytedance.adsdk.ugeno.LD.lk Lxb;
    private nBu ZU;
    private JSONObject lk;

    public int LD() {
        return this.LD;
    }

    public com.bytedance.adsdk.ugeno.LD.lk Lxb() {
        return this.Lxb;
    }

    public nBu ZU() {
        return this.ZU;
    }

    public JSONObject lk() {
        return this.lk;
    }

    public String toString() {
        return "UGenEvent{mWidget=" + this.Lxb + ", mEventType=" + this.LD + ", mEvent=" + this.lk + '}';
    }

    public void LD(nBu nbu) {
        this.JXs = nbu;
    }

    public void Lxb(com.bytedance.adsdk.ugeno.LD.lk lkVar) {
        this.Lxb = lkVar;
    }

    public void Lxb(int i) {
        this.LD = i;
    }

    public void Lxb(JSONObject jSONObject) {
        this.lk = jSONObject;
    }

    public void Lxb(nBu nbu) {
        this.ZU = nbu;
    }
}
