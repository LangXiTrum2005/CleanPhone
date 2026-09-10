package com.bytedance.sdk.openadsdk.ka.fi.lr;

import com.bytedance.sdk.component.utils.ac;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class co extends ik {
    private long ik;
    private long ka;
    private long lr;
    private String ri;

    public void ik(long j) {
        this.ka = j;
    }

    public void lr(long j) {
        this.ik = j;
    }

    public void ri(String str) {
        this.ri = str;
    }

    public void ri(long j) {
        this.lr = j;
    }

    @Override // com.bytedance.sdk.openadsdk.ka.fi.lr.ik
    public void ri(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("preload_url", this.ri);
            jSONObject.put("preload_size", this.lr);
            jSONObject.put("load_time", this.ik);
            jSONObject.put("local_cache", this.ka);
        } catch (Throwable th) {
            ac.ik("LoadVideoSuccessModel", th.getMessage());
        }
    }
}
