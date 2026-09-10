package com.bytedance.sdk.openadsdk.mml.mzz.ud;

import com.bytedance.sdk.component.utils.aaj;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class rdp implements lnr {
    private final int lnr;
    private final int mml;
    private final String mzz;
    private long qdl;
    private long ud;

    public rdp(com.bykv.vk.openvk.qdl.qdl.qdl.lnr.qdl qdlVar) {
        this.lnr = qdlVar.qdl();
        this.mml = qdlVar.ud();
        this.mzz = qdlVar.lnr();
    }

    public void qdl(long j) {
        this.qdl = j;
    }

    public void ud(long j) {
        this.ud = j;
    }

    @Override // com.bytedance.sdk.openadsdk.mml.mzz.ud.lnr
    public void qdl(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("buffers_time", this.qdl);
            jSONObject.put("total_duration", this.ud);
            jSONObject.put("error_code", this.lnr);
            jSONObject.put("extra_error_code", this.mml);
            jSONObject.put("error_message", this.mzz);
        } catch (Throwable th) {
            aaj.lnr("PlayErrorModel", th.getMessage());
        }
    }
}
