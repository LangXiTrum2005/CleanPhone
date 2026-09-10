package com.bytedance.sdk.openadsdk.multipro.ud;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class qdl {
    public boolean lnr;
    public boolean mml;
    public long mo;
    public long mzz;
    public boolean qdl;
    public boolean ud;
    public long wd;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.multipro.ud.qdl$qdl, reason: collision with other inner class name */
    public interface InterfaceC0150qdl {
        qdl mo();
    }

    public qdl lnr(boolean z2) {
        this.ud = z2;
        return this;
    }

    public qdl mml(boolean z2) {
        this.lnr = z2;
        return this;
    }

    public qdl qdl(boolean z2) {
        this.mml = z2;
        return this;
    }

    public qdl ud(boolean z2) {
        this.qdl = z2;
        return this;
    }

    public qdl lnr(long j) {
        this.wd = j;
        return this;
    }

    public qdl qdl(long j) {
        this.mzz = j;
        return this;
    }

    public qdl ud(long j) {
        this.mo = j;
        return this;
    }

    public JSONObject qdl() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isCompleted", this.qdl);
            jSONObject.put("isFromVideoDetailPage", this.ud);
            jSONObject.put("isFromDetailPage", this.lnr);
            jSONObject.put("duration", this.mzz);
            jSONObject.put("totalPlayDuration", this.mo);
            jSONObject.put("currentPlayPosition", this.wd);
            jSONObject.put("isAutoPlay", this.mml);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static qdl qdl(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        qdl qdlVar = new qdl();
        qdlVar.ud(jSONObject.optBoolean("isCompleted"));
        qdlVar.lnr(jSONObject.optBoolean("isFromVideoDetailPage"));
        qdlVar.mml(jSONObject.optBoolean("isFromDetailPage"));
        qdlVar.qdl(jSONObject.optLong("duration"));
        qdlVar.ud(jSONObject.optLong("totalPlayDuration"));
        qdlVar.lnr(jSONObject.optLong("currentPlayPosition"));
        qdlVar.qdl(jSONObject.optBoolean("isAutoPlay"));
        return qdlVar;
    }
}
