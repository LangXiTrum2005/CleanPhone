package com.bytedance.sdk.openadsdk.ka.fi.lr;

import com.bykv.vk.openvk.ri.ri.ri.ik.saneness;
import com.bytedance.sdk.component.utils.ac;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class bgr extends ik {
    private final String fi;
    private final int ik;
    private final int ka;
    private long lr;
    private long ri;

    public bgr(saneness sanenessVar) {
        this.ik = sanenessVar.dern();
        this.ka = sanenessVar.saneness();
        this.fi = sanenessVar.attabal();
    }

    public void lr(long j) {
        this.lr = j;
    }

    public void ri(long j) {
        this.ri = j;
    }

    @Override // com.bytedance.sdk.openadsdk.ka.fi.lr.ik
    public void ri(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("buffers_time", this.ri);
            jSONObject.put("total_duration", this.lr);
            jSONObject.put("error_code", this.ik);
            jSONObject.put("extra_error_code", this.ka);
            jSONObject.put("error_message", this.fi);
        } catch (Throwable th) {
            ac.ik("PlayErrorModel", th.getMessage());
        }
    }
}
