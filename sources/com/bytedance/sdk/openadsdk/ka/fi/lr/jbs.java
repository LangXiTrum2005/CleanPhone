package com.bytedance.sdk.openadsdk.ka.fi.lr;

import com.bytedance.sdk.component.utils.ac;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class jbs extends ik {
    private final long lr;
    private final String ri;

    public jbs(String str, long j) {
        this.ri = str;
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
        } catch (Throwable th) {
            ac.ik("LoadVideoCancelModel", th.getMessage());
        }
    }
}
