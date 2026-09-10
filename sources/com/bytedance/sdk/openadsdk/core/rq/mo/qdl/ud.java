package com.bytedance.sdk.openadsdk.core.rq.mo.qdl;

import com.bytedance.sdk.openadsdk.core.model.ljh;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ud {
    protected ljh qdl;

    public static class qdl {
        public static ud qdl(ljh ljhVar, com.bytedance.sdk.openadsdk.core.rq.mo.qdl qdlVar) {
            if (ljhVar == null) {
                return null;
            }
            int iOk = ljhVar.ok();
            if (iOk == 1) {
                return new com.bytedance.sdk.openadsdk.core.rq.mo.qdl.qdl(ljhVar, qdlVar);
            }
            if (iOk == 7 || iOk == 8) {
                return new lnr(ljhVar, qdlVar);
            }
            return null;
        }
    }

    public ud(ljh ljhVar) {
        this.qdl = ljhVar;
    }

    public abstract String qdl();

    public void qdl(JSONObject jSONObject) {
    }

    public abstract JSONObject ud();
}
