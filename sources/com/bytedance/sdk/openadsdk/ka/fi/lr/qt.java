package com.bytedance.sdk.openadsdk.ka.fi.lr;

import com.bytedance.sdk.component.utils.ac;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class qt extends ik {
    private String di;
    private String fi;
    private long ik;
    private int ka;
    private long lr;
    private String ri;

    public void ik(String str) {
        this.di = str;
    }

    public void lr(long j) {
        this.ik = j;
    }

    public void ri(String str) {
        this.ri = str;
    }

    public void lr(String str) {
        this.fi = str;
    }

    public void ri(long j) {
        this.lr = j;
    }

    public void ri(int i) {
        this.ka = i;
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
            jSONObject.put("error_code", this.ka);
            jSONObject.put("error_message", this.fi);
            jSONObject.put("error_message_server", this.di);
        } catch (Throwable th) {
            ac.ik("LoadVideoErrorModel", th.getMessage());
        }
    }
}
