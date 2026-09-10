package com.bytedance.sdk.openadsdk.tan.ik;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ri {
    public long di;
    public long fi;
    public boolean ik;
    public boolean ka;
    public boolean lr;
    public boolean ri;
    public long xha;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.tan.ik.ri$ri, reason: collision with other inner class name */
    public interface InterfaceC0276ri {
        ri di();
    }

    public ri ik(boolean z) {
        this.lr = z;
        return this;
    }

    public ri ka(boolean z) {
        this.ik = z;
        return this;
    }

    public ri lr(boolean z) {
        this.ri = z;
        return this;
    }

    public ri ri(boolean z) {
        this.ka = z;
        return this;
    }

    public ri ik(long j) {
        this.xha = j;
        return this;
    }

    public ri lr(long j) {
        this.di = j;
        return this;
    }

    public ri ri(long j) {
        this.fi = j;
        return this;
    }

    public JSONObject ri() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isCompleted", this.ri);
            jSONObject.put("isFromVideoDetailPage", this.lr);
            jSONObject.put("isFromDetailPage", this.ik);
            jSONObject.put(IronSourceConstants.EVENTS_DURATION, this.fi);
            jSONObject.put("totalPlayDuration", this.di);
            jSONObject.put("currentPlayPosition", this.xha);
            jSONObject.put("isAutoPlay", this.ka);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static ri ri(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        ri riVar = new ri();
        riVar.lr(jSONObject.optBoolean("isCompleted"));
        riVar.ik(jSONObject.optBoolean("isFromVideoDetailPage"));
        riVar.ka(jSONObject.optBoolean("isFromDetailPage"));
        riVar.ri(jSONObject.optLong(IronSourceConstants.EVENTS_DURATION));
        riVar.lr(jSONObject.optLong("totalPlayDuration"));
        riVar.ik(jSONObject.optLong("currentPlayPosition"));
        riVar.ri(jSONObject.optBoolean("isAutoPlay"));
        return riVar;
    }
}
