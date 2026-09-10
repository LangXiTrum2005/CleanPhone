package com.bytedance.sdk.openadsdk.multipro.LD;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb {
    public long JXs;
    public boolean LD;
    public boolean Lxb;
    public boolean ZU;
    public long ebl;
    public long lc;
    public boolean lk;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.multipro.LD.Lxb$Lxb, reason: collision with other inner class name */
    public interface InterfaceC0115Lxb {
        Lxb lc();
    }

    public Lxb LD(boolean z) {
        this.Lxb = z;
        return this;
    }

    public Lxb Lxb(boolean z) {
        this.ZU = z;
        return this;
    }

    public Lxb ZU(boolean z) {
        this.lk = z;
        return this;
    }

    public Lxb lk(boolean z) {
        this.LD = z;
        return this;
    }

    public Lxb LD(long j) {
        this.lc = j;
        return this;
    }

    public Lxb Lxb(long j) {
        this.JXs = j;
        return this;
    }

    public Lxb lk(long j) {
        this.ebl = j;
        return this;
    }

    public JSONObject Lxb() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isCompleted", this.Lxb);
            jSONObject.put("isFromVideoDetailPage", this.LD);
            jSONObject.put("isFromDetailPage", this.lk);
            jSONObject.put("duration", this.JXs);
            jSONObject.put("totalPlayDuration", this.lc);
            jSONObject.put("currentPlayPosition", this.ebl);
            jSONObject.put("isAutoPlay", this.ZU);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static Lxb Lxb(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Lxb lxb = new Lxb();
        lxb.LD(jSONObject.optBoolean("isCompleted"));
        lxb.lk(jSONObject.optBoolean("isFromVideoDetailPage"));
        lxb.ZU(jSONObject.optBoolean("isFromDetailPage"));
        lxb.Lxb(jSONObject.optLong("duration"));
        lxb.LD(jSONObject.optLong("totalPlayDuration"));
        lxb.lk(jSONObject.optLong("currentPlayPosition"));
        lxb.Lxb(jSONObject.optBoolean("isAutoPlay"));
        return lxb;
    }
}
